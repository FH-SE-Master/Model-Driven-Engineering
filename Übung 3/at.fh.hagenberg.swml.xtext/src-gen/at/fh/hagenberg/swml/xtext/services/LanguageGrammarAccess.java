/*
 * generated by Xtext 2.10.0
 */
package at.fh.hagenberg.swml.xtext.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractEnumRuleElementFinder;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class LanguageGrammarAccess extends AbstractGrammarElementFinder {
	
	public class WebApplicationElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.fh.hagenberg.swml.xtext.Language.WebApplication");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cWebappKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cEntitiesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEntitiesEntityParserRuleCall_3_0 = (RuleCall)cEntitiesAssignment_3.eContents().get(0);
		private final Assignment cRelationshipsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRelationshipsRelationShipParserRuleCall_4_0 = (RuleCall)cRelationshipsAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//WebApplication:
		//	'webapp' name=ID '{'
		//	entities+=Entity*
		//	relationships=RelationShip*
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'webapp' name=ID '{' entities+=Entity* relationships=RelationShip* '}'
		public Group getGroup() { return cGroup; }
		
		//'webapp'
		public Keyword getWebappKeyword_0() { return cWebappKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//entities+=Entity*
		public Assignment getEntitiesAssignment_3() { return cEntitiesAssignment_3; }
		
		//Entity
		public RuleCall getEntitiesEntityParserRuleCall_3_0() { return cEntitiesEntityParserRuleCall_3_0; }
		
		//relationships=RelationShip*
		public Assignment getRelationshipsAssignment_4() { return cRelationshipsAssignment_4; }
		
		//RelationShip
		public RuleCall getRelationshipsRelationShipParserRuleCall_4_0() { return cRelationshipsRelationShipParserRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class RelationShipElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.fh.hagenberg.swml.xtext.Language.RelationShip");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRelationshipKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cLowerBoundKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cLowerAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cLowerINTTerminalRuleCall_4_0 = (RuleCall)cLowerAssignment_4.eContents().get(0);
		private final Keyword cUpperBoundKeyword_5 = (Keyword)cGroup.eContents().get(5);
		private final Assignment cLowerAssignment_6 = (Assignment)cGroup.eContents().get(6);
		private final RuleCall cLowerINTTerminalRuleCall_6_0 = (RuleCall)cLowerAssignment_6.eContents().get(0);
		private final Keyword cSourceKeyword_7 = (Keyword)cGroup.eContents().get(7);
		private final Assignment cSourceAssignment_8 = (Assignment)cGroup.eContents().get(8);
		private final CrossReference cSourceEntityCrossReference_8_0 = (CrossReference)cSourceAssignment_8.eContents().get(0);
		private final RuleCall cSourceEntityIDTerminalRuleCall_8_0_1 = (RuleCall)cSourceEntityCrossReference_8_0.eContents().get(1);
		private final Keyword cTargetKeyword_9 = (Keyword)cGroup.eContents().get(9);
		private final Assignment cTargetAssignment_10 = (Assignment)cGroup.eContents().get(10);
		private final CrossReference cTargetEntityCrossReference_10_0 = (CrossReference)cTargetAssignment_10.eContents().get(0);
		private final RuleCall cTargetEntityIDTerminalRuleCall_10_0_1 = (RuleCall)cTargetEntityCrossReference_10_0.eContents().get(1);
		private final Group cGroup_11 = (Group)cGroup.eContents().get(11);
		private final Keyword cOppositeKeyword_11_0 = (Keyword)cGroup_11.eContents().get(0);
		private final Assignment cOppositeAssignment_11_1 = (Assignment)cGroup_11.eContents().get(1);
		private final CrossReference cOppositeRelationShipCrossReference_11_1_0 = (CrossReference)cOppositeAssignment_11_1.eContents().get(0);
		private final RuleCall cOppositeRelationShipIDTerminalRuleCall_11_1_0_1 = (RuleCall)cOppositeRelationShipCrossReference_11_1_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_12 = (Keyword)cGroup.eContents().get(12);
		
		//RelationShip:
		//	'relationship' name=ID '{'
		//	'lowerBound' lower=INT
		//	'upperBound' lower=INT
		//	'source' source=[Entity]
		//	'target' target=[Entity] ('opposite' opposite=[RelationShip])?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'relationship' name=ID '{' 'lowerBound' lower=INT 'upperBound' lower=INT 'source' source=[Entity] 'target'
		//target=[Entity] ('opposite' opposite=[RelationShip])? '}'
		public Group getGroup() { return cGroup; }
		
		//'relationship'
		public Keyword getRelationshipKeyword_0() { return cRelationshipKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'lowerBound'
		public Keyword getLowerBoundKeyword_3() { return cLowerBoundKeyword_3; }
		
		//lower=INT
		public Assignment getLowerAssignment_4() { return cLowerAssignment_4; }
		
		//INT
		public RuleCall getLowerINTTerminalRuleCall_4_0() { return cLowerINTTerminalRuleCall_4_0; }
		
		//'upperBound'
		public Keyword getUpperBoundKeyword_5() { return cUpperBoundKeyword_5; }
		
		//lower=INT
		public Assignment getLowerAssignment_6() { return cLowerAssignment_6; }
		
		//INT
		public RuleCall getLowerINTTerminalRuleCall_6_0() { return cLowerINTTerminalRuleCall_6_0; }
		
		//'source'
		public Keyword getSourceKeyword_7() { return cSourceKeyword_7; }
		
		//source=[Entity]
		public Assignment getSourceAssignment_8() { return cSourceAssignment_8; }
		
		//[Entity]
		public CrossReference getSourceEntityCrossReference_8_0() { return cSourceEntityCrossReference_8_0; }
		
		//ID
		public RuleCall getSourceEntityIDTerminalRuleCall_8_0_1() { return cSourceEntityIDTerminalRuleCall_8_0_1; }
		
		//'target'
		public Keyword getTargetKeyword_9() { return cTargetKeyword_9; }
		
		//target=[Entity]
		public Assignment getTargetAssignment_10() { return cTargetAssignment_10; }
		
		//[Entity]
		public CrossReference getTargetEntityCrossReference_10_0() { return cTargetEntityCrossReference_10_0; }
		
		//ID
		public RuleCall getTargetEntityIDTerminalRuleCall_10_0_1() { return cTargetEntityIDTerminalRuleCall_10_0_1; }
		
		//('opposite' opposite=[RelationShip])?
		public Group getGroup_11() { return cGroup_11; }
		
		//'opposite'
		public Keyword getOppositeKeyword_11_0() { return cOppositeKeyword_11_0; }
		
		//opposite=[RelationShip]
		public Assignment getOppositeAssignment_11_1() { return cOppositeAssignment_11_1; }
		
		//[RelationShip]
		public CrossReference getOppositeRelationShipCrossReference_11_1_0() { return cOppositeRelationShipCrossReference_11_1_0; }
		
		//ID
		public RuleCall getOppositeRelationShipIDTerminalRuleCall_11_1_0_1() { return cOppositeRelationShipIDTerminalRuleCall_11_1_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_12() { return cRightCurlyBracketKeyword_12; }
	}
	public class RoleNumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.fh.hagenberg.swml.xtext.Language.RoleNumber");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cINTTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Keyword cHyphenMinusDigitOneKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cAsteriskKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		
		//RoleNumber ecore::EInt:
		//	INT | '-1' | '*'
		@Override public ParserRule getRule() { return rule; }
		
		//INT | '-1' | '*'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INT
		public RuleCall getINTTerminalRuleCall_0() { return cINTTerminalRuleCall_0; }
		
		//'-1'
		public Keyword getHyphenMinusDigitOneKeyword_1() { return cHyphenMinusDigitOneKeyword_1; }
		
		//'*'
		public Keyword getAsteriskKeyword_2() { return cAsteriskKeyword_2; }
	}
	public class EntityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.fh.hagenberg.swml.xtext.Language.Entity");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEntityKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cAttributesAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cAttributesAttributeParserRuleCall_3_0 = (RuleCall)cAttributesAssignment_3.eContents().get(0);
		private final Keyword cIdKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cIdAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final CrossReference cIdAttributeCrossReference_5_0 = (CrossReference)cIdAssignment_5.eContents().get(0);
		private final RuleCall cIdAttributeIDTerminalRuleCall_5_0_1 = (RuleCall)cIdAttributeCrossReference_5_0.eContents().get(1);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Entity:
		//	'entity' name=ID '{'
		//	attributes+=Attribute*
		//	'id' id=[Attribute]
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'entity' name=ID '{' attributes+=Attribute* 'id' id=[Attribute] '}'
		public Group getGroup() { return cGroup; }
		
		//'entity'
		public Keyword getEntityKeyword_0() { return cEntityKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//attributes+=Attribute*
		public Assignment getAttributesAssignment_3() { return cAttributesAssignment_3; }
		
		//Attribute
		public RuleCall getAttributesAttributeParserRuleCall_3_0() { return cAttributesAttributeParserRuleCall_3_0; }
		
		//'id'
		public Keyword getIdKeyword_4() { return cIdKeyword_4; }
		
		//id=[Attribute]
		public Assignment getIdAssignment_5() { return cIdAssignment_5; }
		
		//[Attribute]
		public CrossReference getIdAttributeCrossReference_5_0() { return cIdAttributeCrossReference_5_0; }
		
		//ID
		public RuleCall getIdAttributeIDTerminalRuleCall_5_0_1() { return cIdAttributeIDTerminalRuleCall_5_0_1; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}
	public class AttributeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "at.fh.hagenberg.swml.xtext.Language.Attribute");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cAttriubteKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cTypeKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cTypeAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTypeDatatypeEnumRuleCall_4_0 = (RuleCall)cTypeAssignment_4.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Attribute:
		//	'attriubte' name=ID '{'
		//	'type' type=Datatype
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//'attriubte' name=ID '{' 'type' type=Datatype '}'
		public Group getGroup() { return cGroup; }
		
		//'attriubte'
		public Keyword getAttriubteKeyword_0() { return cAttriubteKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//'type'
		public Keyword getTypeKeyword_3() { return cTypeKeyword_3; }
		
		//type=Datatype
		public Assignment getTypeAssignment_4() { return cTypeAssignment_4; }
		
		//Datatype
		public RuleCall getTypeDatatypeEnumRuleCall_4_0() { return cTypeDatatypeEnumRuleCall_4_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	public class DatatypeElements extends AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "at.fh.hagenberg.swml.xtext.Language.Datatype");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cINTEGEREnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cINTEGERIntKeyword_0_0 = (Keyword)cINTEGEREnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cBOOLEANEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cBOOLEANBoolKeyword_1_0 = (Keyword)cBOOLEANEnumLiteralDeclaration_1.eContents().get(0);
		
		//enum Datatype:
		//	INTEGER='int' | BOOLEAN='bool';
		public EnumRule getRule() { return rule; }
		
		//INTEGER='int' | BOOLEAN='bool'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//INTEGER='int'
		public EnumLiteralDeclaration getINTEGEREnumLiteralDeclaration_0() { return cINTEGEREnumLiteralDeclaration_0; }
		
		//'int'
		public Keyword getINTEGERIntKeyword_0_0() { return cINTEGERIntKeyword_0_0; }
		
		//BOOLEAN='bool'
		public EnumLiteralDeclaration getBOOLEANEnumLiteralDeclaration_1() { return cBOOLEANEnumLiteralDeclaration_1; }
		
		//'bool'
		public Keyword getBOOLEANBoolKeyword_1_0() { return cBOOLEANBoolKeyword_1_0; }
	}
	
	private final WebApplicationElements pWebApplication;
	private final RelationShipElements pRelationShip;
	private final RoleNumberElements pRoleNumber;
	private final EntityElements pEntity;
	private final AttributeElements pAttribute;
	private final DatatypeElements eDatatype;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public LanguageGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pWebApplication = new WebApplicationElements();
		this.pRelationShip = new RelationShipElements();
		this.pRoleNumber = new RoleNumberElements();
		this.pEntity = new EntityElements();
		this.pAttribute = new AttributeElements();
		this.eDatatype = new DatatypeElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("at.fh.hagenberg.swml.xtext.Language".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//WebApplication:
	//	'webapp' name=ID '{'
	//	entities+=Entity*
	//	relationships=RelationShip*
	//	'}';
	public WebApplicationElements getWebApplicationAccess() {
		return pWebApplication;
	}
	
	public ParserRule getWebApplicationRule() {
		return getWebApplicationAccess().getRule();
	}
	
	//RelationShip:
	//	'relationship' name=ID '{'
	//	'lowerBound' lower=INT
	//	'upperBound' lower=INT
	//	'source' source=[Entity]
	//	'target' target=[Entity] ('opposite' opposite=[RelationShip])?
	//	'}';
	public RelationShipElements getRelationShipAccess() {
		return pRelationShip;
	}
	
	public ParserRule getRelationShipRule() {
		return getRelationShipAccess().getRule();
	}
	
	//RoleNumber ecore::EInt:
	//	INT | '-1' | '*'
	public RoleNumberElements getRoleNumberAccess() {
		return pRoleNumber;
	}
	
	public ParserRule getRoleNumberRule() {
		return getRoleNumberAccess().getRule();
	}
	
	//Entity:
	//	'entity' name=ID '{'
	//	attributes+=Attribute*
	//	'id' id=[Attribute]
	//	'}';
	public EntityElements getEntityAccess() {
		return pEntity;
	}
	
	public ParserRule getEntityRule() {
		return getEntityAccess().getRule();
	}
	
	//Attribute:
	//	'attriubte' name=ID '{'
	//	'type' type=Datatype
	//	'}';
	public AttributeElements getAttributeAccess() {
		return pAttribute;
	}
	
	public ParserRule getAttributeRule() {
		return getAttributeAccess().getRule();
	}
	
	//enum Datatype:
	//	INTEGER='int' | BOOLEAN='bool';
	public DatatypeElements getDatatypeAccess() {
		return eDatatype;
	}
	
	public EnumRule getDatatypeRule() {
		return getDatatypeAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
