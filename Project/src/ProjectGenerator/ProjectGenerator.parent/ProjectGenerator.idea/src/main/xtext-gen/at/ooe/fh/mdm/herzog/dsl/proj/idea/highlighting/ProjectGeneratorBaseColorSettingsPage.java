/*
 * generated by Xtext 2.9.2
 */
package at.ooe.fh.mdm.herzog.dsl.proj.idea.highlighting;

import at.ooe.fh.mdm.herzog.dsl.proj.idea.lang.ProjectGeneratorLanguage;
import org.eclipse.xtext.idea.highlighting.AbstractColorSettingsPage;

public class ProjectGeneratorBaseColorSettingsPage extends AbstractColorSettingsPage {
	
	public ProjectGeneratorBaseColorSettingsPage() {
		ProjectGeneratorLanguage.INSTANCE.injectMembers(this);
	}

	@Override
	public String getDisplayName() {
		return ProjectGeneratorLanguage.INSTANCE.getDisplayName();
	}
}