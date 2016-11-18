package at.fh.hagenberg.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import at.fh.hagenberg.services.SwmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSwmlParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'webapp'", "'('", "')'", "'entity'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_INT=5;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalSwmlParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSwmlParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSwmlParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSwml.g"; }



     	private SwmlGrammarAccess grammarAccess;

        public InternalSwmlParser(TokenStream input, SwmlGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WebApplication";
       	}

       	@Override
       	protected SwmlGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWebApplication"
    // InternalSwml.g:64:1: entryRuleWebApplication returns [EObject current=null] : iv_ruleWebApplication= ruleWebApplication EOF ;
    public final EObject entryRuleWebApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebApplication = null;


        try {
            // InternalSwml.g:64:55: (iv_ruleWebApplication= ruleWebApplication EOF )
            // InternalSwml.g:65:2: iv_ruleWebApplication= ruleWebApplication EOF
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
    // InternalSwml.g:71:1: ruleWebApplication returns [EObject current=null] : (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' ) ;
    public final EObject ruleWebApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entities_3_0 = null;



        	enterRule();

        try {
            // InternalSwml.g:77:2: ( (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' ) )
            // InternalSwml.g:78:2: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' )
            {
            // InternalSwml.g:78:2: (otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')' )
            // InternalSwml.g:79:3: otherlv_0= 'webapp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_entities_3_0= ruleEntity ) )* otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWebApplicationAccess().getWebappKeyword_0());
            		
            // InternalSwml.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSwml.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSwml.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalSwml.g:85:5: lv_name_1_0= RULE_ID
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

            			newLeafNode(otherlv_2, grammarAccess.getWebApplicationAccess().getLeftParenthesisKeyword_2());
            		
            // InternalSwml.g:105:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSwml.g:106:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalSwml.g:106:4: (lv_entities_3_0= ruleEntity )
            	    // InternalSwml.g:107:5: lv_entities_3_0= ruleEntity
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
            	    						"at.fh.hagenberg.Swml.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getWebApplicationAccess().getRightParenthesisKeyword_4());
            		

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


    // $ANTLR start "entryRuleEntity"
    // InternalSwml.g:132:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSwml.g:132:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSwml.g:133:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSwml.g:139:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalSwml.g:145:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' ) )
            // InternalSwml.g:146:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' )
            {
            // InternalSwml.g:146:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')' )
            // InternalSwml.g:147:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '(' otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSwml.g:151:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSwml.g:152:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSwml.g:152:4: (lv_name_1_0= RULE_ID )
            // InternalSwml.g:153:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getEntityAccess().getRightParenthesisKeyword_3());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});

}