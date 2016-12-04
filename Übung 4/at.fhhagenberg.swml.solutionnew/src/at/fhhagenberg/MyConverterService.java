package at.fhhagenberg;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractDeclarativeValueConverterService;
import org.eclipse.xtext.conversion.impl.AbstractNullSafeConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class MyConverterService extends AbstractDeclarativeValueConverterService {
	@ValueConverter(rule = "Timestamp")
	public IValueConverter<java.util.Date> Timestamp() {
		return new AbstractNullSafeConverter<Date>() {

			@Override
			protected String internalToString(Date value) {
				SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy");
				fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
				return '"' + fmt.format(value) + '"';
			}

			@Override
			protected Date internalToValue(String string, INode node) throws ValueConverterException {
				string = string.substring(1, string.length() - 1);

				// First choice, if a timestamp string, use it.
				try {
					// Allow non UTC strings since they are fully qualified with
					// offset and can thus
					// be parsed by anyone.
					SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy");
					fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
					return fmt.parse(string);
				} catch (ParseException e) {
					// ignore and try timestamp format
				}
				// Second choice - if using java default for the locale
				// Needs special processing as it probably does not contain TZ
				// in the string)
				try {
					// try the default locale style of Date Time and see if it
					// parses
					DateFormat.getDateTimeInstance().parse(string);
					// if this parsed, it is not likely that the default is the
					// full
					// format with timezone offset, so flag this as a special
					// error :)
					// that is fixable
					// Although simple, it makes sense from a user perspective,
					// a time in
					// local format can be entered and transformed to a
					// timestamp.
					throw new ValueConverterException("Not in timestamp format", node, null);
				} catch (ParseException e) {
					DateFormat fmt = DateFormat.getDateTimeInstance();
					String defaultFormat = (fmt instanceof SimpleDateFormat)
							? ((SimpleDateFormat) fmt).toLocalizedPattern() : "Default format for the locale";
					throw new ValueConverterException("Not in valid format: Use 'dd.MM.yyyy' or " + defaultFormat
							+ "Parse error:" + e.getMessage(), node, null);

				}
			}

		};
	}
	
	@ValueConverter(rule = "RoleNumber")
    public IValueConverter<Integer> RoleNumber() {
        return new IValueConverter<Integer>() {
            public Integer toValue(String string, INode node) {
                if (Strings.isEmpty(string))
                    throw new ValueConverterException("Couldn't convert empty string to int", node, null);
                else if ("*".equals(string.trim()))
                    return -1;
                try {
                    return Integer.parseInt(string);
                } catch (NumberFormatException e) {
                    throw new ValueConverterException("Couldn't convert '"+string+"' to int", node, e);
                }
            }

            public String toString(Integer value) {
                return ((value == -1) ? "*" : Integer.toString(value));
            }
        };
 }
	
	
}
