/*
 * generated by Xtext 2.10.0
 */
package at.fhhagenberg.swml.xtext.solution.ui.tests;

import at.fhhagenberg.swml.solutionnew.ui.internal.SolutionnewActivator;
import com.google.inject.Injector;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class SolutionUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SolutionnewActivator.getInstance().getInjector("at.fhhagenberg.swml.xtext.solution.Solution");
	}

}
