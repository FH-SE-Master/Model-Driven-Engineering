/*
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext.ui.tests;

import at.fh.hagenberg.swml.xtext.ui.internal.XtextActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class LanguageUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("at.fh.hagenberg.swml.xtext.Language");
	}

}
