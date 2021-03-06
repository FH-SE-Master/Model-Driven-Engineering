/*
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.idea;

import at.ooe.fh.mdm.herzog.dsl.proj.idea.lang.ProjectGeneratorLanguage;
import com.intellij.openapi.extensions.ExtensionFactory;

public class ProjectGeneratorExtensionFactory implements ExtensionFactory {
	@Override
	public Object createInstance(String factoryArgument, String implementationClass) {
		Class<?> clazz;
		try {
			clazz = Class.forName(implementationClass);
		} catch (ClassNotFoundException e) {
			throw new IllegalArgumentException("Couldn't load "+implementationClass, e);
		}
		return ProjectGeneratorLanguage.INSTANCE.<Object> getInstance(clazz);
	}
}
