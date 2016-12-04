package at.fh.hagenberg.swml.xtext;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.util.Strings;

public class MyConverterService extends DefaultTerminalConverters {

	/**
	 * Converter for rule with the defined name
	 */
	@ValueConverter(rule = "RoleNumber")
	public IValueConverter<Integer> createConverterForRoleNumber() {
		return new IValueConverter<Integer>() {
			@Override
			public String toString(Integer value) throws ValueConverterException {
				return (value == -1) ? value.toString() : "*";
			}

			@Override
			public Integer toValue(String _string, INode node) throws ValueConverterException {
				final String string = _string.trim();
				if (Strings.isEmpty(string)) {
					throw new ValueConverterException("Could not convert empty string to int", node,
							new IllegalArgumentException("String is empty"));
				}

				switch (string) {
				case "*":
					return -1;
				default:
					try {
						return Integer.valueOf(string);
					} catch (Exception e) {
						throw new ValueConverterException("Parsing failes", node, e);
					}
				}
			}
		};
	}
}
