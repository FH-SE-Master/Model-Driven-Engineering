/*
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class LanguageStandaloneSetup extends LanguageStandaloneSetupGenerated {

	def static void doSetup() {
		new LanguageStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
