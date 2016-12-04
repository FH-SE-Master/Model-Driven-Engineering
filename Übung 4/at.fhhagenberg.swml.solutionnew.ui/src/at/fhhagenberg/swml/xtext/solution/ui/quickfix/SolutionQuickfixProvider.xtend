/*
 * generated by Xtext 2.10.0
 */
package at.fhhagenberg.swml.xtext.solution.ui.quickfix

import at.fhhagenberg.swml.xtext.solution.solution.Entity
import at.fhhagenberg.swml.xtext.solution.validation.SolutionValidator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import at.fhhagenberg.swml.xtext.solution.solution.WebApplication
import at.fhhagenberg.swml.xtext.solution.solution.Relationship
import org.eclipse.xtext.CrossReference

/**
 * Custom quickfixes.
 *
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#quick-fixes
 */
class SolutionQuickfixProvider extends DefaultQuickfixProvider {
	
	//Validator.xtend in UI Projekt – Lösung über Modellrepräsentation
	@Fix(SolutionValidator::INVALID_NAME)
	def capitalizeName(Issue issue, IssueResolutionAcceptor acceptor) {
	    acceptor.accept(issue, "Capitalize variable", "Capitalize the name", "upcase.png",
	                    new MySemanticModification());
	}

}

class MySemanticModification implements ISemanticModification{
		
	override apply(EObject element, IModificationContext context) throws Exception {
		println(context.xtextDocument.get);
		if (element instanceof Entity) {		
     		(element as Entity).name= (element as Entity).name.toFirstUpper;    	
     	
     		var oldVal = (element.eContainer as WebApplication).name;
     		(element.eContainer as WebApplication).name = "update"//to force a refresh
     		(element.eContainer as WebApplication).name = oldVal
    	}
	}
}
