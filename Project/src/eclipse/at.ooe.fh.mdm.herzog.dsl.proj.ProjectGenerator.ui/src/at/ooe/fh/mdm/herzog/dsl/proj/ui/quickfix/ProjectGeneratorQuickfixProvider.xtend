/*
 * generated by Xtext 2.10.0
 */
package at.ooe.fh.mdm.herzog.dsl.proj.ui.quickfix

import at.ooe.fh.mdm.herzog.dsl.proj.validation.ProjectGeneratorValidator.ValidatorId
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import at.ooe.fh.mdm.herzog.dsl.proj.projectGenerator.Module

/**
 * Custom quickfixes.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class ProjectGeneratorQuickfixProvider extends DefaultQuickfixProvider {
	
	@Fix(ValidatorId.MODULE_KEY_UPPER_CASE)
	def fixModuleKey(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Convert to upper case', 'Convert to upper case', 'upcase.png') [ element, context |
			val module = (element as  Module);
			module.key = module.key.toUpperCase;
		]
	}
}