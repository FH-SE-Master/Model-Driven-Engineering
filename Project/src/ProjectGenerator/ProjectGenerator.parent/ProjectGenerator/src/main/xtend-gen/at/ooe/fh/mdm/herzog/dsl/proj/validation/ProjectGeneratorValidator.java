/**
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.validation;

import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Locale;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedValue;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Module;
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage;
import at.ooe.fh.mdm.herzog.dsl.proj.validation.AbstractProjectGeneratorValidator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class ProjectGeneratorValidator extends AbstractProjectGeneratorValidator {
  private static Pattern CAMEL_CASE_PATTERN = Pattern.compile("([A-Z]{1}[a-z]+)+");
  
  @Check
  public void checkForCamelCaseModuleName(final Module _module) {
    String _key = _module.getKey();
    Matcher _matcher = ProjectGeneratorValidator.CAMEL_CASE_PATTERN.matcher(_key);
    boolean _matches = _matcher.matches();
    boolean _not = (!_matches);
    if (_not) {
      final String errorMsg = "Module name must be a camel case string";
      this.error(errorMsg, ProjectGeneratorPackage.Literals.MODULE__NAME);
    }
  }
  
  @Check
  public void checkForUpperCaseModuleKey(final Module _module) {
    String _key = _module.getKey();
    char[] _charArray = _key.toCharArray();
    for (final Character c : _charArray) {
      boolean _isLowerCase = Character.isLowerCase((c).charValue());
      if (_isLowerCase) {
        final String errorMsg = "Module key must be upper case";
        this.error(errorMsg, ProjectGeneratorPackage.Literals.MODULE__KEY);
        return;
      }
    }
  }
  
  @Check
  public void checkForDuplicateLocaleEntries(final LocalizedEntry _localizedEntry) {
    EList<LocalizedValue> _values = _localizedEntry.getValues();
    final int count = _values.size();
    EList<LocalizedValue> _values_1 = _localizedEntry.getValues();
    Stream<LocalizedValue> _stream = _values_1.stream();
    final Function<LocalizedValue, Locale> _function = new Function<LocalizedValue, Locale>() {
      public Locale apply(final LocalizedValue it) {
        return it.getLocale();
      }
    };
    Stream<Locale> _map = _stream.<Locale>map(_function);
    Stream<Locale> _distinct = _map.distinct();
    final long localeCount = _distinct.count();
    EList<LocalizedValue> _values_2 = _localizedEntry.getValues();
    Stream<LocalizedValue> _stream_1 = _values_2.stream();
    final Function<LocalizedValue, Locale> _function_1 = new Function<LocalizedValue, Locale>() {
      public Locale apply(final LocalizedValue it) {
        return it.getLocale();
      }
    };
    Collector<LocalizedValue, ?, Map<Locale, List<LocalizedValue>>> _groupingBy = Collectors.<LocalizedValue, Locale>groupingBy(_function_1);
    Map<Locale, List<LocalizedValue>> _collect = _stream_1.collect(_groupingBy);
    Set<Map.Entry<Locale, List<LocalizedValue>>> _entrySet = _collect.entrySet();
    Stream<Map.Entry<Locale, List<LocalizedValue>>> _stream_2 = _entrySet.stream();
    final Predicate<Map.Entry<Locale, List<LocalizedValue>>> _function_2 = new Predicate<Map.Entry<Locale, List<LocalizedValue>>>() {
      public boolean test(final Map.Entry<Locale, List<LocalizedValue>> it) {
        List<LocalizedValue> _value = it.getValue();
        int _size = _value.size();
        return (_size > 1);
      }
    };
    Stream<Map.Entry<Locale, List<LocalizedValue>>> _filter = _stream_2.filter(_function_2);
    final Function<Map.Entry<Locale, List<LocalizedValue>>, Locale> _function_3 = new Function<Map.Entry<Locale, List<LocalizedValue>>, Locale>() {
      public Locale apply(final Map.Entry<Locale, List<LocalizedValue>> it) {
        return it.getKey();
      }
    };
    Stream<Locale> _map_1 = _filter.<Locale>map(_function_3);
    Stream<Locale> _distinct_1 = _map_1.distinct();
    Collector<Locale, ?, List<Locale>> _list = Collectors.<Locale>toList();
    final List<Locale> duplicateLocales = _distinct_1.collect(_list);
    if ((count != localeCount)) {
      Stream<Locale> _stream_3 = duplicateLocales.stream();
      final Function<Locale, String> _function_4 = new Function<Locale, String>() {
        public String apply(final Locale it) {
          return it.toString();
        }
      };
      Stream<String> _map_2 = _stream_3.<String>map(_function_4);
      Collector<CharSequence, ?, String> _joining = Collectors.joining(",", "[", "]");
      String _collect_1 = _map_2.collect(_joining);
      final String errorMsg = ("Duplicate locale entries found. " + _collect_1);
      this.error(errorMsg, ProjectGeneratorPackage.Literals.LOCALIZED_ENTRY__VALUES);
    }
  }
  
  @Check
  public void checkForDefinedLocaleEntries(final Localized localized) {
    EList<LocalizedEntry> _values = localized.getValues();
    boolean _isEmpty = _values.isEmpty();
    if (_isEmpty) {
      this.error("If attribute \'values\' is defined, then at least one localized values must be given", ProjectGeneratorPackage.Literals.LOCALIZED__VALUES);
    }
  }
}
