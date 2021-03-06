/*
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext.serializer;

import at.fh.hagenberg.swml.xtext.language.Attribute;
import at.fh.hagenberg.swml.xtext.language.Entity;
import at.fh.hagenberg.swml.xtext.language.LanguagePackage;
import at.fh.hagenberg.swml.xtext.language.RelationShip;
import at.fh.hagenberg.swml.xtext.language.WebApplication;
import at.fh.hagenberg.swml.xtext.services.LanguageGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class LanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == LanguagePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case LanguagePackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case LanguagePackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case LanguagePackage.RELATION_SHIP:
				sequence_RelationShip(context, (RelationShip) semanticObject); 
				return; 
			case LanguagePackage.WEB_APPLICATION:
				sequence_WebApplication(context, (WebApplication) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Attribute returns Attribute
	 *
	 * Constraint:
	 *     (name=ID type=Datatype)
	 */
	protected void sequence_Attribute(ISerializationContext context, Attribute semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.ATTRIBUTE__NAME));
			if (transientValues.isValueTransient(semanticObject, LanguagePackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LanguagePackage.Literals.ATTRIBUTE__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeDatatypeEnumRuleCall_4_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Entity returns Entity
	 *
	 * Constraint:
	 *     (name=ID attributes+=Attribute* id=[Attribute|ID])
	 */
	protected void sequence_Entity(ISerializationContext context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     RelationShip returns RelationShip
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         lower=INT 
	 *         lower=INT 
	 *         source=[Entity|ID] 
	 *         target=[Entity|ID] 
	 *         opposite=[RelationShip|ID]?
	 *     )
	 */
	protected void sequence_RelationShip(ISerializationContext context, RelationShip semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     WebApplication returns WebApplication
	 *
	 * Constraint:
	 *     (name=ID entities+=Entity* relationships=RelationShip*)
	 */
	protected void sequence_WebApplication(ISerializationContext context, WebApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
