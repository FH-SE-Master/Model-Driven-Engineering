/*
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.validation

import org.eclipse.xtext.validation.Check
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Localized
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.LocalizedEntry
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Module
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.ProjectGeneratorPackage
import static java.util.stream.Collectors.*
import java.util.regex.Pattern

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class ProjectGeneratorValidator extends AbstractProjectGeneratorValidator {

    static Pattern CAMEL_CASE_PATTERN = Pattern.compile("([A-Z]{1}[a-z]+)+");

    // 1. Module Name must be camel case
    @Check
    def checkForCamelCaseModuleName(Module _module){
        if(!CAMEL_CASE_PATTERN.matcher(_module.key).matches) {
            val errorMsg = "Module name must be a camel case string";
            error(errorMsg, ProjectGeneratorPackage.Literals.MODULE__NAME);
        }
    }

    // 2. Module Key must be upper case
    @Check
    def checkForUpperCaseModuleKey(Module _module){
        for(Character c:_module.key.toCharArray) {
            if(Character.isLowerCase(c)) {
                val errorMsg = "Module key must be upper case";
                error(errorMsg, ProjectGeneratorPackage.Literals.MODULE__KEY);
                return;
            }
        }
    }

    // 3. Duplicate locale entries for a localized key not allowed
    @Check
    def checkForDuplicateLocaleEntries(LocalizedEntry _localizedEntry){
        val count = _localizedEntry.values.size;
        val localeCount = _localizedEntry.values.stream.map[locale].distinct.count;
        val duplicateLocales = _localizedEntry.values.stream.collect(groupingBy[locale]).entrySet.stream.filter[value.size > 1].map[key].distinct.collect(toList);

        if(count != localeCount) {
            val errorMsg = "Duplicate locale entries found. " + duplicateLocales.stream.map[toString].collect(joining(",","[","]"));
            error(errorMsg,ProjectGeneratorPackage.Literals.LOCALIZED_ENTRY__VALUES);
        }
    }

    // 4. Localized must contain at least one localized entry
    @Check
    def checkForDefinedLocaleEntries(Localized localized){
        if(localized.values.empty) {
            error("If attribute 'values' is defined, then at least one localized values must be given", ProjectGeneratorPackage.Literals.LOCALIZED__VALUES);
        }
    }
}
