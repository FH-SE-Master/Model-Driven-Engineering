package at.fh.hagenberg.swml.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.fh.hagenberg.swml.xtext.services.LanguageGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLanguageParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'webapp'", "'{'", "'}'", "'relationship'", "'lowerBound'", "'upperBound'", "'source'", "'target'", "'opposite'", "'entity'", "'id'", "'attriubte'", "'type'", "'int'", "'bool'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalLanguageParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLanguageParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLanguageParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLanguage.g"; }



     	private LanguageGrammarAccess grammarAccess;

        public InternalLanguageParser(TokenStream input, LanguageGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WebApplication";
       	}

       	@Override
       	protected LanguageGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWebApplication"
    // InternalLanguage.g:65:1: entryRuleWebApplication returns [EObject current=null] : iv_ruleWebApplication= ruleWebApplication EOF ;
    public final EObject entryRuleWebApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebApplication = null;


        try {
            // InternalLanguage.g:65:55: (iv_ruleWebApplication= ruleWebApplication EOF )
            // InternalLanguage.g:66:2: iv_ruleWebApplication= ruleWebApplication EOF
            {
             newCompositeNode(grammarAccess.getWebApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebApplication=ruleWebApplication();

            state._fsp--;

             current =iv_ruleWebApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWebApplication"


    // $ANTLR start "ruleWebApplication"
    // InternalLanguage.g:72:1: ruleWebApplication returns [EObject current=null] : (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationShip ) )* otherlv_5= '}' ) ;
    public final EObject ruleWebApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_entities_3_0 = null;

        EObject lv_relationships_4_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:78:2: ( (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationShip ) )* otherlv_5= '}' ) )
            // InternalLanguage.g:79:2: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationShip ) )* otherlv_5= '}' )
            {
            // InternalLanguage.g:79:2: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationShip ) )* otherlv_5= '}' )
            // InternalLanguage.g:80:3: otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationShip ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWebApplicationAccess().getWebappKeyword_0());
            		
            // InternalLanguage.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguage.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalLanguage.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getWebApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getWebApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLanguage.g:106:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalLanguage.g:107:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalLanguage.g:107:4: (lv_entities_3_0= ruleEntity )
            	    // InternalLanguage.g:108:5: lv_entities_3_0= ruleEntity
            	    {

            	    					newCompositeNode(grammarAccess.getWebApplicationAccess().getEntitiesEntityParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_entities_3_0=ruleEntity();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWebApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"entities",
            	    						lv_entities_3_0,
            	    						"at.fh.hagenberg.swml.xtext.Language.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalLanguage.g:125:3: ( (lv_relationships_4_0= ruleRelationShip ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLanguage.g:126:4: (lv_relationships_4_0= ruleRelationShip )
            	    {
            	    // InternalLanguage.g:126:4: (lv_relationships_4_0= ruleRelationShip )
            	    // InternalLanguage.g:127:5: lv_relationships_4_0= ruleRelationShip
            	    {

            	    					newCompositeNode(grammarAccess.getWebApplicationAccess().getRelationshipsRelationShipParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_relationships_4_0=ruleRelationShip();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWebApplicationRule());
            	    					}
            	    					set(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_4_0,
            	    						"at.fh.hagenberg.swml.xtext.Language.RelationShip");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getWebApplicationAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWebApplication"


    // $ANTLR start "entryRuleRelationShip"
    // InternalLanguage.g:152:1: entryRuleRelationShip returns [EObject current=null] : iv_ruleRelationShip= ruleRelationShip EOF ;
    public final EObject entryRuleRelationShip() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationShip = null;


        try {
            // InternalLanguage.g:152:53: (iv_ruleRelationShip= ruleRelationShip EOF )
            // InternalLanguage.g:153:2: iv_ruleRelationShip= ruleRelationShip EOF
            {
             newCompositeNode(grammarAccess.getRelationShipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationShip=ruleRelationShip();

            state._fsp--;

             current =iv_ruleRelationShip; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRelationShip"


    // $ANTLR start "ruleRelationShip"
    // InternalLanguage.g:159:1: ruleRelationShip returns [EObject current=null] : (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= 'upperBound' ( (lv_lower_6_0= RULE_INT ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) ;
    public final EObject ruleRelationShip() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_lower_4_0=null;
        Token otherlv_5=null;
        Token lv_lower_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;


        	enterRule();

        try {
            // InternalLanguage.g:165:2: ( (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= 'upperBound' ( (lv_lower_6_0= RULE_INT ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' ) )
            // InternalLanguage.g:166:2: (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= 'upperBound' ( (lv_lower_6_0= RULE_INT ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            {
            // InternalLanguage.g:166:2: (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= 'upperBound' ( (lv_lower_6_0= RULE_INT ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}' )
            // InternalLanguage.g:167:3: otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= RULE_INT ) ) otherlv_5= 'upperBound' ( (lv_lower_6_0= RULE_INT ) ) otherlv_7= 'source' ( (otherlv_8= RULE_ID ) ) otherlv_9= 'target' ( (otherlv_10= RULE_ID ) ) (otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) ) )? otherlv_13= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationShipAccess().getRelationshipKeyword_0());
            		
            // InternalLanguage.g:171:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguage.g:172:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguage.g:172:4: (lv_name_1_0= RULE_ID )
            // InternalLanguage.g:173:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationShipAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationShipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationShipAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationShipAccess().getLowerBoundKeyword_3());
            		
            // InternalLanguage.g:197:3: ( (lv_lower_4_0= RULE_INT ) )
            // InternalLanguage.g:198:4: (lv_lower_4_0= RULE_INT )
            {
            // InternalLanguage.g:198:4: (lv_lower_4_0= RULE_INT )
            // InternalLanguage.g:199:5: lv_lower_4_0= RULE_INT
            {
            lv_lower_4_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_lower_4_0, grammarAccess.getRelationShipAccess().getLowerINTTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationShipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_4_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationShipAccess().getUpperBoundKeyword_5());
            		
            // InternalLanguage.g:219:3: ( (lv_lower_6_0= RULE_INT ) )
            // InternalLanguage.g:220:4: (lv_lower_6_0= RULE_INT )
            {
            // InternalLanguage.g:220:4: (lv_lower_6_0= RULE_INT )
            // InternalLanguage.g:221:5: lv_lower_6_0= RULE_INT
            {
            lv_lower_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_lower_6_0, grammarAccess.getRelationShipAccess().getLowerINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationShipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"lower",
            						lv_lower_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_7, grammarAccess.getRelationShipAccess().getSourceKeyword_7());
            		
            // InternalLanguage.g:241:3: ( (otherlv_8= RULE_ID ) )
            // InternalLanguage.g:242:4: (otherlv_8= RULE_ID )
            {
            // InternalLanguage.g:242:4: (otherlv_8= RULE_ID )
            // InternalLanguage.g:243:5: otherlv_8= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationShipRule());
            					}
            				
            otherlv_8=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_8, grammarAccess.getRelationShipAccess().getSourceEntityCrossReference_8_0());
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationShipAccess().getTargetKeyword_9());
            		
            // InternalLanguage.g:258:3: ( (otherlv_10= RULE_ID ) )
            // InternalLanguage.g:259:4: (otherlv_10= RULE_ID )
            {
            // InternalLanguage.g:259:4: (otherlv_10= RULE_ID )
            // InternalLanguage.g:260:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationShipRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_10, grammarAccess.getRelationShipAccess().getTargetEntityCrossReference_10_0());
            				

            }


            }

            // InternalLanguage.g:271:3: (otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalLanguage.g:272:4: otherlv_11= 'opposite' ( (otherlv_12= RULE_ID ) )
                    {
                    otherlv_11=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getRelationShipAccess().getOppositeKeyword_11_0());
                    			
                    // InternalLanguage.g:276:4: ( (otherlv_12= RULE_ID ) )
                    // InternalLanguage.g:277:5: (otherlv_12= RULE_ID )
                    {
                    // InternalLanguage.g:277:5: (otherlv_12= RULE_ID )
                    // InternalLanguage.g:278:6: otherlv_12= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationShipRule());
                    						}
                    					
                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_12, grammarAccess.getRelationShipAccess().getOppositeRelationShipCrossReference_11_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_13, grammarAccess.getRelationShipAccess().getRightCurlyBracketKeyword_12());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRelationShip"


    // $ANTLR start "entryRuleEntity"
    // InternalLanguage.g:298:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalLanguage.g:298:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalLanguage.g:299:2: iv_ruleEntity= ruleEntity EOF
            {
             newCompositeNode(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntity=ruleEntity();

            state._fsp--;

             current =iv_ruleEntity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalLanguage.g:305:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:311:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' ) )
            // InternalLanguage.g:312:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            {
            // InternalLanguage.g:312:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}' )
            // InternalLanguage.g:313:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalLanguage.g:317:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguage.g:318:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguage.g:318:4: (lv_name_1_0= RULE_ID )
            // InternalLanguage.g:319:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalLanguage.g:339:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalLanguage.g:340:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalLanguage.g:340:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalLanguage.g:341:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_14);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"at.fh.hagenberg.swml.xtext.Language.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getIdKeyword_4());
            		
            // InternalLanguage.g:362:3: ( (otherlv_5= RULE_ID ) )
            // InternalLanguage.g:363:4: (otherlv_5= RULE_ID )
            {
            // InternalLanguage.g:363:4: (otherlv_5= RULE_ID )
            // InternalLanguage.g:364:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEntity"


    // $ANTLR start "entryRuleAttribute"
    // InternalLanguage.g:383:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalLanguage.g:383:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalLanguage.g:384:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // InternalLanguage.g:390:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attriubte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDatatype ) ) otherlv_5= '}' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalLanguage.g:396:2: ( (otherlv_0= 'attriubte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDatatype ) ) otherlv_5= '}' ) )
            // InternalLanguage.g:397:2: (otherlv_0= 'attriubte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDatatype ) ) otherlv_5= '}' )
            {
            // InternalLanguage.g:397:2: (otherlv_0= 'attriubte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDatatype ) ) otherlv_5= '}' )
            // InternalLanguage.g:398:3: otherlv_0= 'attriubte' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= ruleDatatype ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttriubteKeyword_0());
            		
            // InternalLanguage.g:402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalLanguage.g:403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalLanguage.g:403:4: (lv_name_1_0= RULE_ID )
            // InternalLanguage.g:404:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getAttributeAccess().getTypeKeyword_3());
            		
            // InternalLanguage.g:428:3: ( (lv_type_4_0= ruleDatatype ) )
            // InternalLanguage.g:429:4: (lv_type_4_0= ruleDatatype )
            {
            // InternalLanguage.g:429:4: (lv_type_4_0= ruleDatatype )
            // InternalLanguage.g:430:5: lv_type_4_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDatatypeEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_4_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"at.fh.hagenberg.swml.xtext.Language.Datatype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "ruleDatatype"
    // InternalLanguage.g:455:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'bool' ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalLanguage.g:461:2: ( ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'bool' ) ) )
            // InternalLanguage.g:462:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'bool' ) )
            {
            // InternalLanguage.g:462:2: ( (enumLiteral_0= 'int' ) | (enumLiteral_1= 'bool' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==24) ) {
                alt5=1;
            }
            else if ( (LA5_0==25) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLanguage.g:463:3: (enumLiteral_0= 'int' )
                    {
                    // InternalLanguage.g:463:3: (enumLiteral_0= 'int' )
                    // InternalLanguage.g:464:4: enumLiteral_0= 'int'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getINTEGEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getINTEGEREnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalLanguage.g:471:3: (enumLiteral_1= 'bool' )
                    {
                    // InternalLanguage.g:471:3: (enumLiteral_1= 'bool' )
                    // InternalLanguage.g:472:4: enumLiteral_1= 'bool'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getBOOLEANEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getBOOLEANEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDatatype"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000106000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000082000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000000L});

}