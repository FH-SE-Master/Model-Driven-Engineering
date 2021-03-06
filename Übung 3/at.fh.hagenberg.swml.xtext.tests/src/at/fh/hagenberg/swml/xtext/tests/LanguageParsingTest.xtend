/*
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext.tests

import at.fh.hagenberg.swml.xtext.language.WebApplication
import com.google.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(LanguageInjectorProvider)
class LanguageParsingTest{

	@Inject
	ParseHelper<WebApplication> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
