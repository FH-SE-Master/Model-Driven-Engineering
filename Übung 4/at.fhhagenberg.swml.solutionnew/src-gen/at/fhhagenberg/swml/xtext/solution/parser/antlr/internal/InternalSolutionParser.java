package at.fhhagenberg.swml.xtext.solution.parser.antlr.internal;

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
import at.fhhagenberg.swml.xtext.solution.services.SolutionGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSolutionParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'webApp'", "'{'", "'homePage'", "';'", "'creationDate'", "'}'", "'staticPage'", "'relativeURL='", "'home'", "'entityPage'", "'innerPages'", "'entity'", "'createPage'", "'back'", "'updatePage'", "'deletePage'", "'indexPage'", "'id'", "'attribute'", "':'", "'relationship'", "'lowerBound'", "'upperBound'", "'source'", "'target'", "'opposite'", "'-1'", "'*'", "'link'", "'contextualLink'", "'information'", "'String'", "'float'", "'int'", "'bool'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalSolutionParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSolutionParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSolutionParser.tokenNames; }
    public String getGrammarFileName() { return "InternalSolution.g"; }



     	private SolutionGrammarAccess grammarAccess;

        public InternalSolutionParser(TokenStream input, SolutionGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "WebApplication";
       	}

       	@Override
       	protected SolutionGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleWebApplication"
    // InternalSolution.g:65:1: entryRuleWebApplication returns [EObject current=null] : iv_ruleWebApplication= ruleWebApplication EOF ;
    public final EObject entryRuleWebApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebApplication = null;


        try {
            // InternalSolution.g:65:55: (iv_ruleWebApplication= ruleWebApplication EOF )
            // InternalSolution.g:66:2: iv_ruleWebApplication= ruleWebApplication EOF
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
    // InternalSolution.g:72:1: ruleWebApplication returns [EObject current=null] : (otherlv_0= 'webApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ( (lv_webPages_5_0= ruleWebPage ) )* otherlv_6= 'homePage' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'creationDate' ( (lv_creationDate_10_0= ruleTimestamp ) ) otherlv_11= ';' otherlv_12= '}' ) ;
    public final EObject ruleWebApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_entities_3_0 = null;

        EObject lv_relationships_4_0 = null;

        EObject lv_webPages_5_0 = null;

        AntlrDatatypeRuleToken lv_creationDate_10_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:78:2: ( (otherlv_0= 'webApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ( (lv_webPages_5_0= ruleWebPage ) )* otherlv_6= 'homePage' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'creationDate' ( (lv_creationDate_10_0= ruleTimestamp ) ) otherlv_11= ';' otherlv_12= '}' ) )
            // InternalSolution.g:79:2: (otherlv_0= 'webApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ( (lv_webPages_5_0= ruleWebPage ) )* otherlv_6= 'homePage' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'creationDate' ( (lv_creationDate_10_0= ruleTimestamp ) ) otherlv_11= ';' otherlv_12= '}' )
            {
            // InternalSolution.g:79:2: (otherlv_0= 'webApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ( (lv_webPages_5_0= ruleWebPage ) )* otherlv_6= 'homePage' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'creationDate' ( (lv_creationDate_10_0= ruleTimestamp ) ) otherlv_11= ';' otherlv_12= '}' )
            // InternalSolution.g:80:3: otherlv_0= 'webApp' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_entities_3_0= ruleEntity ) )* ( (lv_relationships_4_0= ruleRelationship ) )* ( (lv_webPages_5_0= ruleWebPage ) )* otherlv_6= 'homePage' ( (otherlv_7= RULE_ID ) ) otherlv_8= ';' otherlv_9= 'creationDate' ( (lv_creationDate_10_0= ruleTimestamp ) ) otherlv_11= ';' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getWebApplicationAccess().getWebAppKeyword_0());
            		
            // InternalSolution.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:86:5: lv_name_1_0= RULE_ID
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
            		
            // InternalSolution.g:106:3: ( (lv_entities_3_0= ruleEntity ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSolution.g:107:4: (lv_entities_3_0= ruleEntity )
            	    {
            	    // InternalSolution.g:107:4: (lv_entities_3_0= ruleEntity )
            	    // InternalSolution.g:108:5: lv_entities_3_0= ruleEntity
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
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Entity");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalSolution.g:125:3: ( (lv_relationships_4_0= ruleRelationship ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==31) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalSolution.g:126:4: (lv_relationships_4_0= ruleRelationship )
            	    {
            	    // InternalSolution.g:126:4: (lv_relationships_4_0= ruleRelationship )
            	    // InternalSolution.g:127:5: lv_relationships_4_0= ruleRelationship
            	    {

            	    					newCompositeNode(grammarAccess.getWebApplicationAccess().getRelationshipsRelationshipParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_relationships_4_0=ruleRelationship();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWebApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"relationships",
            	    						lv_relationships_4_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Relationship");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalSolution.g:144:3: ( (lv_webPages_5_0= ruleWebPage ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==17||LA3_0==20||LA3_0==23||(LA3_0>=25 && LA3_0<=27)) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalSolution.g:145:4: (lv_webPages_5_0= ruleWebPage )
            	    {
            	    // InternalSolution.g:145:4: (lv_webPages_5_0= ruleWebPage )
            	    // InternalSolution.g:146:5: lv_webPages_5_0= ruleWebPage
            	    {

            	    					newCompositeNode(grammarAccess.getWebApplicationAccess().getWebPagesWebPageParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_webPages_5_0=ruleWebPage();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getWebApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"webPages",
            	    						lv_webPages_5_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.WebPage");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_6=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getWebApplicationAccess().getHomePageKeyword_6());
            		
            // InternalSolution.g:167:3: ( (otherlv_7= RULE_ID ) )
            // InternalSolution.g:168:4: (otherlv_7= RULE_ID )
            {
            // InternalSolution.g:168:4: (otherlv_7= RULE_ID )
            // InternalSolution.g:169:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getWebApplicationRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_7, grammarAccess.getWebApplicationAccess().getHomepageStaticPageCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_8, grammarAccess.getWebApplicationAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,15,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getWebApplicationAccess().getCreationDateKeyword_9());
            		
            // InternalSolution.g:188:3: ( (lv_creationDate_10_0= ruleTimestamp ) )
            // InternalSolution.g:189:4: (lv_creationDate_10_0= ruleTimestamp )
            {
            // InternalSolution.g:189:4: (lv_creationDate_10_0= ruleTimestamp )
            // InternalSolution.g:190:5: lv_creationDate_10_0= ruleTimestamp
            {

            					newCompositeNode(grammarAccess.getWebApplicationAccess().getCreationDateTimestampParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_8);
            lv_creationDate_10_0=ruleTimestamp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getWebApplicationRule());
            					}
            					set(
            						current,
            						"creationDate",
            						lv_creationDate_10_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.Timestamp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getWebApplicationAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getWebApplicationAccess().getRightCurlyBracketKeyword_12());
            		

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


    // $ANTLR start "entryRuleTimestamp"
    // InternalSolution.g:219:1: entryRuleTimestamp returns [String current=null] : iv_ruleTimestamp= ruleTimestamp EOF ;
    public final String entryRuleTimestamp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTimestamp = null;


        try {
            // InternalSolution.g:219:49: (iv_ruleTimestamp= ruleTimestamp EOF )
            // InternalSolution.g:220:2: iv_ruleTimestamp= ruleTimestamp EOF
            {
             newCompositeNode(grammarAccess.getTimestampRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTimestamp=ruleTimestamp();

            state._fsp--;

             current =iv_ruleTimestamp.getText(); 
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
    // $ANTLR end "entryRuleTimestamp"


    // $ANTLR start "ruleTimestamp"
    // InternalSolution.g:226:1: ruleTimestamp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleTimestamp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalSolution.g:232:2: (this_STRING_0= RULE_STRING )
            // InternalSolution.g:233:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            		current.merge(this_STRING_0);
            	

            		newLeafNode(this_STRING_0, grammarAccess.getTimestampAccess().getSTRINGTerminalRuleCall());
            	

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
    // $ANTLR end "ruleTimestamp"


    // $ANTLR start "entryRuleWebPage"
    // InternalSolution.g:243:1: entryRuleWebPage returns [EObject current=null] : iv_ruleWebPage= ruleWebPage EOF ;
    public final EObject entryRuleWebPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWebPage = null;


        try {
            // InternalSolution.g:243:48: (iv_ruleWebPage= ruleWebPage EOF )
            // InternalSolution.g:244:2: iv_ruleWebPage= ruleWebPage EOF
            {
             newCompositeNode(grammarAccess.getWebPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWebPage=ruleWebPage();

            state._fsp--;

             current =iv_ruleWebPage; 
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
    // $ANTLR end "entryRuleWebPage"


    // $ANTLR start "ruleWebPage"
    // InternalSolution.g:250:1: ruleWebPage returns [EObject current=null] : (this_DynamicPage_0= ruleDynamicPage | this_StaticPage_1= ruleStaticPage ) ;
    public final EObject ruleWebPage() throws RecognitionException {
        EObject current = null;

        EObject this_DynamicPage_0 = null;

        EObject this_StaticPage_1 = null;



        	enterRule();

        try {
            // InternalSolution.g:256:2: ( (this_DynamicPage_0= ruleDynamicPage | this_StaticPage_1= ruleStaticPage ) )
            // InternalSolution.g:257:2: (this_DynamicPage_0= ruleDynamicPage | this_StaticPage_1= ruleStaticPage )
            {
            // InternalSolution.g:257:2: (this_DynamicPage_0= ruleDynamicPage | this_StaticPage_1= ruleStaticPage )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20||LA4_0==23||(LA4_0>=25 && LA4_0<=27)) ) {
                alt4=1;
            }
            else if ( (LA4_0==17) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalSolution.g:258:3: this_DynamicPage_0= ruleDynamicPage
                    {

                    			newCompositeNode(grammarAccess.getWebPageAccess().getDynamicPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_DynamicPage_0=ruleDynamicPage();

                    state._fsp--;


                    			current = this_DynamicPage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolution.g:267:3: this_StaticPage_1= ruleStaticPage
                    {

                    			newCompositeNode(grammarAccess.getWebPageAccess().getStaticPageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_StaticPage_1=ruleStaticPage();

                    state._fsp--;


                    			current = this_StaticPage_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleWebPage"


    // $ANTLR start "entryRuleStaticPage"
    // InternalSolution.g:279:1: entryRuleStaticPage returns [EObject current=null] : iv_ruleStaticPage= ruleStaticPage EOF ;
    public final EObject entryRuleStaticPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStaticPage = null;


        try {
            // InternalSolution.g:279:51: (iv_ruleStaticPage= ruleStaticPage EOF )
            // InternalSolution.g:280:2: iv_ruleStaticPage= ruleStaticPage EOF
            {
             newCompositeNode(grammarAccess.getStaticPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStaticPage=ruleStaticPage();

            state._fsp--;

             current =iv_ruleStaticPage; 
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
    // $ANTLR end "entryRuleStaticPage"


    // $ANTLR start "ruleStaticPage"
    // InternalSolution.g:286:1: ruleStaticPage returns [EObject current=null] : (otherlv_0= 'staticPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'relativeURL=' ( (lv_relativeURL_4_0= RULE_ID ) ) ( (lv_source_5_0= ruleLink ) )* otherlv_6= 'home' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) ;
    public final EObject ruleStaticPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_relativeURL_4_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_source_5_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:292:2: ( (otherlv_0= 'staticPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'relativeURL=' ( (lv_relativeURL_4_0= RULE_ID ) ) ( (lv_source_5_0= ruleLink ) )* otherlv_6= 'home' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' ) )
            // InternalSolution.g:293:2: (otherlv_0= 'staticPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'relativeURL=' ( (lv_relativeURL_4_0= RULE_ID ) ) ( (lv_source_5_0= ruleLink ) )* otherlv_6= 'home' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            {
            // InternalSolution.g:293:2: (otherlv_0= 'staticPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'relativeURL=' ( (lv_relativeURL_4_0= RULE_ID ) ) ( (lv_source_5_0= ruleLink ) )* otherlv_6= 'home' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}' )
            // InternalSolution.g:294:3: otherlv_0= 'staticPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'relativeURL=' ( (lv_relativeURL_4_0= RULE_ID ) ) ( (lv_source_5_0= ruleLink ) )* otherlv_6= 'home' ( (otherlv_7= RULE_ID ) ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStaticPageAccess().getStaticPageKeyword_0());
            		
            // InternalSolution.g:298:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:299:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:299:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:300:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getStaticPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getStaticPageAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getStaticPageAccess().getRelativeURLKeyword_3());
            		
            // InternalSolution.g:324:3: ( (lv_relativeURL_4_0= RULE_ID ) )
            // InternalSolution.g:325:4: (lv_relativeURL_4_0= RULE_ID )
            {
            // InternalSolution.g:325:4: (lv_relativeURL_4_0= RULE_ID )
            // InternalSolution.g:326:5: lv_relativeURL_4_0= RULE_ID
            {
            lv_relativeURL_4_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(lv_relativeURL_4_0, grammarAccess.getStaticPageAccess().getRelativeURLIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"relativeURL",
            						lv_relativeURL_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalSolution.g:342:3: ( (lv_source_5_0= ruleLink ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=39 && LA5_0<=40)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalSolution.g:343:4: (lv_source_5_0= ruleLink )
            	    {
            	    // InternalSolution.g:343:4: (lv_source_5_0= ruleLink )
            	    // InternalSolution.g:344:5: lv_source_5_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getStaticPageAccess().getSourceLinkParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_source_5_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStaticPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_5_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getStaticPageAccess().getHomeKeyword_6());
            		
            // InternalSolution.g:365:3: ( (otherlv_7= RULE_ID ) )
            // InternalSolution.g:366:4: (otherlv_7= RULE_ID )
            {
            // InternalSolution.g:366:4: (otherlv_7= RULE_ID )
            // InternalSolution.g:367:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStaticPageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_7, grammarAccess.getStaticPageAccess().getHomeNonContextualLinkCrossReference_7_0());
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStaticPageAccess().getRightCurlyBracketKeyword_8());
            		

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
    // $ANTLR end "ruleStaticPage"


    // $ANTLR start "entryRuleDynamicPage"
    // InternalSolution.g:386:1: entryRuleDynamicPage returns [EObject current=null] : iv_ruleDynamicPage= ruleDynamicPage EOF ;
    public final EObject entryRuleDynamicPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDynamicPage = null;


        try {
            // InternalSolution.g:386:52: (iv_ruleDynamicPage= ruleDynamicPage EOF )
            // InternalSolution.g:387:2: iv_ruleDynamicPage= ruleDynamicPage EOF
            {
             newCompositeNode(grammarAccess.getDynamicPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDynamicPage=ruleDynamicPage();

            state._fsp--;

             current =iv_ruleDynamicPage; 
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
    // $ANTLR end "entryRuleDynamicPage"


    // $ANTLR start "ruleDynamicPage"
    // InternalSolution.g:393:1: ruleDynamicPage returns [EObject current=null] : (this_EntityPage_0= ruleEntityPage | this_IndexPage_1= ruleIndexPage | this_EditablePage_2= ruleEditablePage ) ;
    public final EObject ruleDynamicPage() throws RecognitionException {
        EObject current = null;

        EObject this_EntityPage_0 = null;

        EObject this_IndexPage_1 = null;

        EObject this_EditablePage_2 = null;



        	enterRule();

        try {
            // InternalSolution.g:399:2: ( (this_EntityPage_0= ruleEntityPage | this_IndexPage_1= ruleIndexPage | this_EditablePage_2= ruleEditablePage ) )
            // InternalSolution.g:400:2: (this_EntityPage_0= ruleEntityPage | this_IndexPage_1= ruleIndexPage | this_EditablePage_2= ruleEditablePage )
            {
            // InternalSolution.g:400:2: (this_EntityPage_0= ruleEntityPage | this_IndexPage_1= ruleIndexPage | this_EditablePage_2= ruleEditablePage )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt6=1;
                }
                break;
            case 27:
                {
                alt6=2;
                }
                break;
            case 23:
            case 25:
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalSolution.g:401:3: this_EntityPage_0= ruleEntityPage
                    {

                    			newCompositeNode(grammarAccess.getDynamicPageAccess().getEntityPageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_EntityPage_0=ruleEntityPage();

                    state._fsp--;


                    			current = this_EntityPage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolution.g:410:3: this_IndexPage_1= ruleIndexPage
                    {

                    			newCompositeNode(grammarAccess.getDynamicPageAccess().getIndexPageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_IndexPage_1=ruleIndexPage();

                    state._fsp--;


                    			current = this_IndexPage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolution.g:419:3: this_EditablePage_2= ruleEditablePage
                    {

                    			newCompositeNode(grammarAccess.getDynamicPageAccess().getEditablePageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EditablePage_2=ruleEditablePage();

                    state._fsp--;


                    			current = this_EditablePage_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleDynamicPage"


    // $ANTLR start "entryRuleEntityPage"
    // InternalSolution.g:431:1: entryRuleEntityPage returns [EObject current=null] : iv_ruleEntityPage= ruleEntityPage EOF ;
    public final EObject entryRuleEntityPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntityPage = null;


        try {
            // InternalSolution.g:431:51: (iv_ruleEntityPage= ruleEntityPage EOF )
            // InternalSolution.g:432:2: iv_ruleEntityPage= ruleEntityPage EOF
            {
             newCompositeNode(grammarAccess.getEntityPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEntityPage=ruleEntityPage();

            state._fsp--;

             current =iv_ruleEntityPage; 
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
    // $ANTLR end "entryRuleEntityPage"


    // $ANTLR start "ruleEntityPage"
    // InternalSolution.g:438:1: ruleEntityPage returns [EObject current=null] : (otherlv_0= 'entityPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )* )? otherlv_8= 'entity' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) ;
    public final EObject ruleEntityPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_source_3_0 = null;

        EObject lv_webPages_7_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:444:2: ( (otherlv_0= 'entityPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )* )? otherlv_8= 'entity' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' ) )
            // InternalSolution.g:445:2: (otherlv_0= 'entityPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )* )? otherlv_8= 'entity' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            {
            // InternalSolution.g:445:2: (otherlv_0= 'entityPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )* )? otherlv_8= 'entity' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}' )
            // InternalSolution.g:446:3: otherlv_0= 'entityPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) (otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )* )? otherlv_8= 'entity' ( (otherlv_9= RULE_ID ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityPageAccess().getEntityPageKeyword_0());
            		
            // InternalSolution.g:450:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:451:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:451:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:452:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getEntityPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolution.g:472:3: ( (lv_source_3_0= ruleLink ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=39 && LA7_0<=40)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalSolution.g:473:4: (lv_source_3_0= ruleLink )
            	    {
            	    // InternalSolution.g:473:4: (lv_source_3_0= ruleLink )
            	    // InternalSolution.g:474:5: lv_source_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getEntityPageAccess().getSourceLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_source_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_3_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityPageAccess().getHomeKeyword_4());
            		
            // InternalSolution.g:495:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:496:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:496:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:497:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityPageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(otherlv_5, grammarAccess.getEntityPageAccess().getHomeNonContextualLinkCrossReference_5_0());
            				

            }


            }

            // InternalSolution.g:508:3: (otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalSolution.g:509:4: otherlv_6= 'innerPages' ( (lv_webPages_7_0= ruleDynamicPage ) )*
                    {
                    otherlv_6=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getEntityPageAccess().getInnerPagesKeyword_6_0());
                    			
                    // InternalSolution.g:513:4: ( (lv_webPages_7_0= ruleDynamicPage ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==20||LA8_0==23||(LA8_0>=25 && LA8_0<=27)) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalSolution.g:514:5: (lv_webPages_7_0= ruleDynamicPage )
                    	    {
                    	    // InternalSolution.g:514:5: (lv_webPages_7_0= ruleDynamicPage )
                    	    // InternalSolution.g:515:6: lv_webPages_7_0= ruleDynamicPage
                    	    {

                    	    						newCompositeNode(grammarAccess.getEntityPageAccess().getWebPagesDynamicPageParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_15);
                    	    lv_webPages_7_0=ruleDynamicPage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getEntityPageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"webPages",
                    	    							lv_webPages_7_0,
                    	    							"at.fhhagenberg.swml.xtext.solution.Solution.DynamicPage");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getEntityPageAccess().getEntityKeyword_7());
            		
            // InternalSolution.g:537:3: ( (otherlv_9= RULE_ID ) )
            // InternalSolution.g:538:4: (otherlv_9= RULE_ID )
            {
            // InternalSolution.g:538:4: (otherlv_9= RULE_ID )
            // InternalSolution.g:539:5: otherlv_9= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityPageRule());
            					}
            				
            otherlv_9=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(otherlv_9, grammarAccess.getEntityPageAccess().getEntityEntityCrossReference_8_0());
            				

            }


            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getEntityPageAccess().getRightCurlyBracketKeyword_9());
            		

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
    // $ANTLR end "ruleEntityPage"


    // $ANTLR start "entryRuleEditablePage"
    // InternalSolution.g:558:1: entryRuleEditablePage returns [EObject current=null] : iv_ruleEditablePage= ruleEditablePage EOF ;
    public final EObject entryRuleEditablePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEditablePage = null;


        try {
            // InternalSolution.g:558:53: (iv_ruleEditablePage= ruleEditablePage EOF )
            // InternalSolution.g:559:2: iv_ruleEditablePage= ruleEditablePage EOF
            {
             newCompositeNode(grammarAccess.getEditablePageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEditablePage=ruleEditablePage();

            state._fsp--;

             current =iv_ruleEditablePage; 
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
    // $ANTLR end "entryRuleEditablePage"


    // $ANTLR start "ruleEditablePage"
    // InternalSolution.g:565:1: ruleEditablePage returns [EObject current=null] : (this_CreatePage_0= ruleCreatePage | this_UpdatePage_1= ruleUpdatePage | this_DeletePage_2= ruleDeletePage ) ;
    public final EObject ruleEditablePage() throws RecognitionException {
        EObject current = null;

        EObject this_CreatePage_0 = null;

        EObject this_UpdatePage_1 = null;

        EObject this_DeletePage_2 = null;



        	enterRule();

        try {
            // InternalSolution.g:571:2: ( (this_CreatePage_0= ruleCreatePage | this_UpdatePage_1= ruleUpdatePage | this_DeletePage_2= ruleDeletePage ) )
            // InternalSolution.g:572:2: (this_CreatePage_0= ruleCreatePage | this_UpdatePage_1= ruleUpdatePage | this_DeletePage_2= ruleDeletePage )
            {
            // InternalSolution.g:572:2: (this_CreatePage_0= ruleCreatePage | this_UpdatePage_1= ruleUpdatePage | this_DeletePage_2= ruleDeletePage )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt10=1;
                }
                break;
            case 25:
                {
                alt10=2;
                }
                break;
            case 26:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalSolution.g:573:3: this_CreatePage_0= ruleCreatePage
                    {

                    			newCompositeNode(grammarAccess.getEditablePageAccess().getCreatePageParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_CreatePage_0=ruleCreatePage();

                    state._fsp--;


                    			current = this_CreatePage_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolution.g:582:3: this_UpdatePage_1= ruleUpdatePage
                    {

                    			newCompositeNode(grammarAccess.getEditablePageAccess().getUpdatePageParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpdatePage_1=ruleUpdatePage();

                    state._fsp--;


                    			current = this_UpdatePage_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalSolution.g:591:3: this_DeletePage_2= ruleDeletePage
                    {

                    			newCompositeNode(grammarAccess.getEditablePageAccess().getDeletePageParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_DeletePage_2=ruleDeletePage();

                    state._fsp--;


                    			current = this_DeletePage_2;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleEditablePage"


    // $ANTLR start "entryRuleCreatePage"
    // InternalSolution.g:603:1: entryRuleCreatePage returns [EObject current=null] : iv_ruleCreatePage= ruleCreatePage EOF ;
    public final EObject entryRuleCreatePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCreatePage = null;


        try {
            // InternalSolution.g:603:51: (iv_ruleCreatePage= ruleCreatePage EOF )
            // InternalSolution.g:604:2: iv_ruleCreatePage= ruleCreatePage EOF
            {
             newCompositeNode(grammarAccess.getCreatePageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCreatePage=ruleCreatePage();

            state._fsp--;

             current =iv_ruleCreatePage; 
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
    // $ANTLR end "entryRuleCreatePage"


    // $ANTLR start "ruleCreatePage"
    // InternalSolution.g:610:1: ruleCreatePage returns [EObject current=null] : (otherlv_0= 'createPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) ;
    public final EObject ruleCreatePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_source_3_0 = null;

        EObject lv_webPages_9_0 = null;

        EObject lv_back_11_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:616:2: ( (otherlv_0= 'createPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) )
            // InternalSolution.g:617:2: (otherlv_0= 'createPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            {
            // InternalSolution.g:617:2: (otherlv_0= 'createPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            // InternalSolution.g:618:3: otherlv_0= 'createPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCreatePageAccess().getCreatePageKeyword_0());
            		
            // InternalSolution.g:622:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:623:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:623:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:624:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getCreatePageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreatePageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getCreatePageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolution.g:644:3: ( (lv_source_3_0= ruleLink ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=39 && LA11_0<=40)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalSolution.g:645:4: (lv_source_3_0= ruleLink )
            	    {
            	    // InternalSolution.g:645:4: (lv_source_3_0= ruleLink )
            	    // InternalSolution.g:646:5: lv_source_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getCreatePageAccess().getSourceLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_source_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCreatePageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_3_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getCreatePageAccess().getHomeKeyword_4());
            		
            // InternalSolution.g:667:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:668:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:668:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:669:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreatePageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getCreatePageAccess().getHomeNonContextualLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getCreatePageAccess().getEntityKeyword_6());
            		
            // InternalSolution.g:684:3: ( (otherlv_7= RULE_ID ) )
            // InternalSolution.g:685:4: (otherlv_7= RULE_ID )
            {
            // InternalSolution.g:685:4: (otherlv_7= RULE_ID )
            // InternalSolution.g:686:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCreatePageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_7, grammarAccess.getCreatePageAccess().getEntityEntityCrossReference_7_0());
            				

            }


            }

            // InternalSolution.g:697:3: (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalSolution.g:698:4: otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getCreatePageAccess().getInnerPagesKeyword_8_0());
                    			
                    // InternalSolution.g:702:4: ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==20||LA12_0==23||(LA12_0>=25 && LA12_0<=27)) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalSolution.g:703:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    {
                    	    // InternalSolution.g:703:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    // InternalSolution.g:704:6: lv_webPages_9_0= ruleDynamicPage
                    	    {

                    	    						newCompositeNode(grammarAccess.getCreatePageAccess().getWebPagesDynamicPageParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_webPages_9_0=ruleDynamicPage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getCreatePageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"webPages",
                    	    							lv_webPages_9_0,
                    	    							"at.fhhagenberg.swml.xtext.solution.Solution.DynamicPage");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getCreatePageAccess().getBackKeyword_9());
            		
            // InternalSolution.g:726:3: ( (lv_back_11_0= ruleContextualLink ) )
            // InternalSolution.g:727:4: (lv_back_11_0= ruleContextualLink )
            {
            // InternalSolution.g:727:4: (lv_back_11_0= ruleContextualLink )
            // InternalSolution.g:728:5: lv_back_11_0= ruleContextualLink
            {

            					newCompositeNode(grammarAccess.getCreatePageAccess().getBackContextualLinkParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_back_11_0=ruleContextualLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCreatePageRule());
            					}
            					set(
            						current,
            						"back",
            						lv_back_11_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.ContextualLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getCreatePageAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleCreatePage"


    // $ANTLR start "entryRuleUpdatePage"
    // InternalSolution.g:753:1: entryRuleUpdatePage returns [EObject current=null] : iv_ruleUpdatePage= ruleUpdatePage EOF ;
    public final EObject entryRuleUpdatePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdatePage = null;


        try {
            // InternalSolution.g:753:51: (iv_ruleUpdatePage= ruleUpdatePage EOF )
            // InternalSolution.g:754:2: iv_ruleUpdatePage= ruleUpdatePage EOF
            {
             newCompositeNode(grammarAccess.getUpdatePageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdatePage=ruleUpdatePage();

            state._fsp--;

             current =iv_ruleUpdatePage; 
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
    // $ANTLR end "entryRuleUpdatePage"


    // $ANTLR start "ruleUpdatePage"
    // InternalSolution.g:760:1: ruleUpdatePage returns [EObject current=null] : (otherlv_0= 'updatePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) ;
    public final EObject ruleUpdatePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_source_3_0 = null;

        EObject lv_webPages_9_0 = null;

        EObject lv_back_11_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:766:2: ( (otherlv_0= 'updatePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) )
            // InternalSolution.g:767:2: (otherlv_0= 'updatePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            {
            // InternalSolution.g:767:2: (otherlv_0= 'updatePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            // InternalSolution.g:768:3: otherlv_0= 'updatePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdatePageAccess().getUpdatePageKeyword_0());
            		
            // InternalSolution.g:772:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:773:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:773:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:774:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUpdatePageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatePageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getUpdatePageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolution.g:794:3: ( (lv_source_3_0= ruleLink ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=39 && LA14_0<=40)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalSolution.g:795:4: (lv_source_3_0= ruleLink )
            	    {
            	    // InternalSolution.g:795:4: (lv_source_3_0= ruleLink )
            	    // InternalSolution.g:796:5: lv_source_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getUpdatePageAccess().getSourceLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_source_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getUpdatePageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_3_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdatePageAccess().getHomeKeyword_4());
            		
            // InternalSolution.g:817:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:818:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:818:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:819:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatePageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getUpdatePageAccess().getHomeNonContextualLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdatePageAccess().getEntityKeyword_6());
            		
            // InternalSolution.g:834:3: ( (otherlv_7= RULE_ID ) )
            // InternalSolution.g:835:4: (otherlv_7= RULE_ID )
            {
            // InternalSolution.g:835:4: (otherlv_7= RULE_ID )
            // InternalSolution.g:836:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpdatePageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_7, grammarAccess.getUpdatePageAccess().getEntityEntityCrossReference_7_0());
            				

            }


            }

            // InternalSolution.g:847:3: (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalSolution.g:848:4: otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getUpdatePageAccess().getInnerPagesKeyword_8_0());
                    			
                    // InternalSolution.g:852:4: ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20||LA15_0==23||(LA15_0>=25 && LA15_0<=27)) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalSolution.g:853:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    {
                    	    // InternalSolution.g:853:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    // InternalSolution.g:854:6: lv_webPages_9_0= ruleDynamicPage
                    	    {

                    	    						newCompositeNode(grammarAccess.getUpdatePageAccess().getWebPagesDynamicPageParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_webPages_9_0=ruleDynamicPage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getUpdatePageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"webPages",
                    	    							lv_webPages_9_0,
                    	    							"at.fhhagenberg.swml.xtext.solution.Solution.DynamicPage");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getUpdatePageAccess().getBackKeyword_9());
            		
            // InternalSolution.g:876:3: ( (lv_back_11_0= ruleContextualLink ) )
            // InternalSolution.g:877:4: (lv_back_11_0= ruleContextualLink )
            {
            // InternalSolution.g:877:4: (lv_back_11_0= ruleContextualLink )
            // InternalSolution.g:878:5: lv_back_11_0= ruleContextualLink
            {

            					newCompositeNode(grammarAccess.getUpdatePageAccess().getBackContextualLinkParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_back_11_0=ruleContextualLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdatePageRule());
            					}
            					set(
            						current,
            						"back",
            						lv_back_11_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.ContextualLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getUpdatePageAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleUpdatePage"


    // $ANTLR start "entryRuleDeletePage"
    // InternalSolution.g:903:1: entryRuleDeletePage returns [EObject current=null] : iv_ruleDeletePage= ruleDeletePage EOF ;
    public final EObject entryRuleDeletePage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDeletePage = null;


        try {
            // InternalSolution.g:903:51: (iv_ruleDeletePage= ruleDeletePage EOF )
            // InternalSolution.g:904:2: iv_ruleDeletePage= ruleDeletePage EOF
            {
             newCompositeNode(grammarAccess.getDeletePageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDeletePage=ruleDeletePage();

            state._fsp--;

             current =iv_ruleDeletePage; 
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
    // $ANTLR end "entryRuleDeletePage"


    // $ANTLR start "ruleDeletePage"
    // InternalSolution.g:910:1: ruleDeletePage returns [EObject current=null] : (otherlv_0= 'deletePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) ;
    public final EObject ruleDeletePage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_source_3_0 = null;

        EObject lv_webPages_9_0 = null;

        EObject lv_back_11_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:916:2: ( (otherlv_0= 'deletePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) )
            // InternalSolution.g:917:2: (otherlv_0= 'deletePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            {
            // InternalSolution.g:917:2: (otherlv_0= 'deletePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            // InternalSolution.g:918:3: otherlv_0= 'deletePage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDeletePageAccess().getDeletePageKeyword_0());
            		
            // InternalSolution.g:922:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:923:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:923:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:924:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDeletePageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeletePageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getDeletePageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolution.g:944:3: ( (lv_source_3_0= ruleLink ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=39 && LA17_0<=40)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalSolution.g:945:4: (lv_source_3_0= ruleLink )
            	    {
            	    // InternalSolution.g:945:4: (lv_source_3_0= ruleLink )
            	    // InternalSolution.g:946:5: lv_source_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getDeletePageAccess().getSourceLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_source_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDeletePageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_3_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getDeletePageAccess().getHomeKeyword_4());
            		
            // InternalSolution.g:967:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:968:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:968:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:969:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeletePageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getDeletePageAccess().getHomeNonContextualLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getDeletePageAccess().getEntityKeyword_6());
            		
            // InternalSolution.g:984:3: ( (otherlv_7= RULE_ID ) )
            // InternalSolution.g:985:4: (otherlv_7= RULE_ID )
            {
            // InternalSolution.g:985:4: (otherlv_7= RULE_ID )
            // InternalSolution.g:986:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDeletePageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_7, grammarAccess.getDeletePageAccess().getEntityEntityCrossReference_7_0());
            				

            }


            }

            // InternalSolution.g:997:3: (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==21) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalSolution.g:998:4: otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getDeletePageAccess().getInnerPagesKeyword_8_0());
                    			
                    // InternalSolution.g:1002:4: ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==20||LA18_0==23||(LA18_0>=25 && LA18_0<=27)) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalSolution.g:1003:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    {
                    	    // InternalSolution.g:1003:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    // InternalSolution.g:1004:6: lv_webPages_9_0= ruleDynamicPage
                    	    {

                    	    						newCompositeNode(grammarAccess.getDeletePageAccess().getWebPagesDynamicPageParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_webPages_9_0=ruleDynamicPage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getDeletePageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"webPages",
                    	    							lv_webPages_9_0,
                    	    							"at.fhhagenberg.swml.xtext.solution.Solution.DynamicPage");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getDeletePageAccess().getBackKeyword_9());
            		
            // InternalSolution.g:1026:3: ( (lv_back_11_0= ruleContextualLink ) )
            // InternalSolution.g:1027:4: (lv_back_11_0= ruleContextualLink )
            {
            // InternalSolution.g:1027:4: (lv_back_11_0= ruleContextualLink )
            // InternalSolution.g:1028:5: lv_back_11_0= ruleContextualLink
            {

            					newCompositeNode(grammarAccess.getDeletePageAccess().getBackContextualLinkParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_back_11_0=ruleContextualLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDeletePageRule());
            					}
            					set(
            						current,
            						"back",
            						lv_back_11_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.ContextualLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getDeletePageAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleDeletePage"


    // $ANTLR start "entryRuleIndexPage"
    // InternalSolution.g:1053:1: entryRuleIndexPage returns [EObject current=null] : iv_ruleIndexPage= ruleIndexPage EOF ;
    public final EObject entryRuleIndexPage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIndexPage = null;


        try {
            // InternalSolution.g:1053:50: (iv_ruleIndexPage= ruleIndexPage EOF )
            // InternalSolution.g:1054:2: iv_ruleIndexPage= ruleIndexPage EOF
            {
             newCompositeNode(grammarAccess.getIndexPageRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIndexPage=ruleIndexPage();

            state._fsp--;

             current =iv_ruleIndexPage; 
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
    // $ANTLR end "entryRuleIndexPage"


    // $ANTLR start "ruleIndexPage"
    // InternalSolution.g:1060:1: ruleIndexPage returns [EObject current=null] : (otherlv_0= 'indexPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) ;
    public final EObject ruleIndexPage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_source_3_0 = null;

        EObject lv_webPages_9_0 = null;

        EObject lv_back_11_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:1066:2: ( (otherlv_0= 'indexPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' ) )
            // InternalSolution.g:1067:2: (otherlv_0= 'indexPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            {
            // InternalSolution.g:1067:2: (otherlv_0= 'indexPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}' )
            // InternalSolution.g:1068:3: otherlv_0= 'indexPage' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_source_3_0= ruleLink ) )* otherlv_4= 'home' ( (otherlv_5= RULE_ID ) ) otherlv_6= 'entity' ( (otherlv_7= RULE_ID ) ) (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )? otherlv_10= 'back' ( (lv_back_11_0= ruleContextualLink ) ) otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getIndexPageAccess().getIndexPageKeyword_0());
            		
            // InternalSolution.g:1072:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:1073:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:1073:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:1074:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getIndexPageAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexPageRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getIndexPageAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolution.g:1094:3: ( (lv_source_3_0= ruleLink ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=39 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalSolution.g:1095:4: (lv_source_3_0= ruleLink )
            	    {
            	    // InternalSolution.g:1095:4: (lv_source_3_0= ruleLink )
            	    // InternalSolution.g:1096:5: lv_source_3_0= ruleLink
            	    {

            	    					newCompositeNode(grammarAccess.getIndexPageAccess().getSourceLinkParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_source_3_0=ruleLink();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getIndexPageRule());
            	    					}
            	    					add(
            	    						current,
            	    						"source",
            	    						lv_source_3_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Link");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_4=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getIndexPageAccess().getHomeKeyword_4());
            		
            // InternalSolution.g:1117:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:1118:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:1118:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:1119:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexPageRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(otherlv_5, grammarAccess.getIndexPageAccess().getHomeNonContextualLinkCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getIndexPageAccess().getEntityKeyword_6());
            		
            // InternalSolution.g:1134:3: ( (otherlv_7= RULE_ID ) )
            // InternalSolution.g:1135:4: (otherlv_7= RULE_ID )
            {
            // InternalSolution.g:1135:4: (otherlv_7= RULE_ID )
            // InternalSolution.g:1136:5: otherlv_7= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIndexPageRule());
            					}
            				
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(otherlv_7, grammarAccess.getIndexPageAccess().getEntityEntityCrossReference_7_0());
            				

            }


            }

            // InternalSolution.g:1147:3: (otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )* )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==21) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalSolution.g:1148:4: otherlv_8= 'innerPages' ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_18); 

                    				newLeafNode(otherlv_8, grammarAccess.getIndexPageAccess().getInnerPagesKeyword_8_0());
                    			
                    // InternalSolution.g:1152:4: ( (lv_webPages_9_0= ruleDynamicPage ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==20||LA21_0==23||(LA21_0>=25 && LA21_0<=27)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalSolution.g:1153:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    {
                    	    // InternalSolution.g:1153:5: (lv_webPages_9_0= ruleDynamicPage )
                    	    // InternalSolution.g:1154:6: lv_webPages_9_0= ruleDynamicPage
                    	    {

                    	    						newCompositeNode(grammarAccess.getIndexPageAccess().getWebPagesDynamicPageParserRuleCall_8_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
                    	    lv_webPages_9_0=ruleDynamicPage();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getIndexPageRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"webPages",
                    	    							lv_webPages_9_0,
                    	    							"at.fhhagenberg.swml.xtext.solution.Solution.DynamicPage");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_19); 

            			newLeafNode(otherlv_10, grammarAccess.getIndexPageAccess().getBackKeyword_9());
            		
            // InternalSolution.g:1176:3: ( (lv_back_11_0= ruleContextualLink ) )
            // InternalSolution.g:1177:4: (lv_back_11_0= ruleContextualLink )
            {
            // InternalSolution.g:1177:4: (lv_back_11_0= ruleContextualLink )
            // InternalSolution.g:1178:5: lv_back_11_0= ruleContextualLink
            {

            					newCompositeNode(grammarAccess.getIndexPageAccess().getBackContextualLinkParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_11);
            lv_back_11_0=ruleContextualLink();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getIndexPageRule());
            					}
            					set(
            						current,
            						"back",
            						lv_back_11_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.ContextualLink");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_12=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getIndexPageAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleIndexPage"


    // $ANTLR start "entryRuleEntity"
    // InternalSolution.g:1203:1: entryRuleEntity returns [EObject current=null] : iv_ruleEntity= ruleEntity EOF ;
    public final EObject entryRuleEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEntity = null;


        try {
            // InternalSolution.g:1203:47: (iv_ruleEntity= ruleEntity EOF )
            // InternalSolution.g:1204:2: iv_ruleEntity= ruleEntity EOF
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
    // InternalSolution.g:1210:1: ruleEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_attributes_3_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:1216:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // InternalSolution.g:1217:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalSolution.g:1217:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= '}' )
            // InternalSolution.g:1218:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_attributes_3_0= ruleAttribute ) )* otherlv_4= 'id' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getEntityAccess().getEntityKeyword_0());
            		
            // InternalSolution.g:1222:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:1223:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:1223:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:1224:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,12,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getEntityAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalSolution.g:1244:3: ( (lv_attributes_3_0= ruleAttribute ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==29) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalSolution.g:1245:4: (lv_attributes_3_0= ruleAttribute )
            	    {
            	    // InternalSolution.g:1245:4: (lv_attributes_3_0= ruleAttribute )
            	    // InternalSolution.g:1246:5: lv_attributes_3_0= ruleAttribute
            	    {

            	    					newCompositeNode(grammarAccess.getEntityAccess().getAttributesAttributeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_attributes_3_0=ruleAttribute();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"attributes",
            	    						lv_attributes_3_0,
            	    						"at.fhhagenberg.swml.xtext.solution.Solution.Attribute");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            otherlv_4=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getEntityAccess().getIdKeyword_4());
            		
            // InternalSolution.g:1267:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:1268:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:1268:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:1269:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEntityRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_5, grammarAccess.getEntityAccess().getIdAttributeCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_11); 

            			newLeafNode(otherlv_6, grammarAccess.getEntityAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalSolution.g:1292:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // InternalSolution.g:1292:50: (iv_ruleAttribute= ruleAttribute EOF )
            // InternalSolution.g:1293:2: iv_ruleAttribute= ruleAttribute EOF
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
    // InternalSolution.g:1299:1: ruleAttribute returns [EObject current=null] : (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDatatype ) ) otherlv_4= ';' ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_type_3_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:1305:2: ( (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDatatype ) ) otherlv_4= ';' ) )
            // InternalSolution.g:1306:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDatatype ) ) otherlv_4= ';' )
            {
            // InternalSolution.g:1306:2: (otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDatatype ) ) otherlv_4= ';' )
            // InternalSolution.g:1307:3: otherlv_0= 'attribute' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (lv_type_3_0= ruleDatatype ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getAttributeKeyword_0());
            		
            // InternalSolution.g:1311:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:1312:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:1312:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:1313:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_21); 

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

            otherlv_2=(Token)match(input,30,FOLLOW_22); 

            			newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getColonKeyword_2());
            		
            // InternalSolution.g:1333:3: ( (lv_type_3_0= ruleDatatype ) )
            // InternalSolution.g:1334:4: (lv_type_3_0= ruleDatatype )
            {
            // InternalSolution.g:1334:4: (lv_type_3_0= ruleDatatype )
            // InternalSolution.g:1335:5: lv_type_3_0= ruleDatatype
            {

            					newCompositeNode(grammarAccess.getAttributeAccess().getTypeDatatypeEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
            lv_type_3_0=ruleDatatype();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAttributeRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_3_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.Datatype");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getSemicolonKeyword_4());
            		

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


    // $ANTLR start "entryRuleRelationship"
    // InternalSolution.g:1360:1: entryRuleRelationship returns [EObject current=null] : iv_ruleRelationship= ruleRelationship EOF ;
    public final EObject entryRuleRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationship = null;


        try {
            // InternalSolution.g:1360:53: (iv_ruleRelationship= ruleRelationship EOF )
            // InternalSolution.g:1361:2: iv_ruleRelationship= ruleRelationship EOF
            {
             newCompositeNode(grammarAccess.getRelationshipRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRelationship=ruleRelationship();

            state._fsp--;

             current =iv_ruleRelationship; 
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
    // $ANTLR end "entryRuleRelationship"


    // $ANTLR start "ruleRelationship"
    // InternalSolution.g:1367:1: ruleRelationship returns [EObject current=null] : (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= ruleRoleNumber ) ) otherlv_5= ';' otherlv_6= 'upperBound' ( (lv_upper_7_0= ruleRoleNumber ) ) otherlv_8= ';' otherlv_9= 'source' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' (otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= '}' ) ;
    public final EObject ruleRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_lower_4_0 = null;

        AntlrDatatypeRuleToken lv_upper_7_0 = null;



        	enterRule();

        try {
            // InternalSolution.g:1373:2: ( (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= ruleRoleNumber ) ) otherlv_5= ';' otherlv_6= 'upperBound' ( (lv_upper_7_0= ruleRoleNumber ) ) otherlv_8= ';' otherlv_9= 'source' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' (otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= '}' ) )
            // InternalSolution.g:1374:2: (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= ruleRoleNumber ) ) otherlv_5= ';' otherlv_6= 'upperBound' ( (lv_upper_7_0= ruleRoleNumber ) ) otherlv_8= ';' otherlv_9= 'source' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' (otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= '}' )
            {
            // InternalSolution.g:1374:2: (otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= ruleRoleNumber ) ) otherlv_5= ';' otherlv_6= 'upperBound' ( (lv_upper_7_0= ruleRoleNumber ) ) otherlv_8= ';' otherlv_9= 'source' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' (otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= '}' )
            // InternalSolution.g:1375:3: otherlv_0= 'relationship' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'lowerBound' ( (lv_lower_4_0= ruleRoleNumber ) ) otherlv_5= ';' otherlv_6= 'upperBound' ( (lv_upper_7_0= ruleRoleNumber ) ) otherlv_8= ';' otherlv_9= 'source' ( (otherlv_10= RULE_ID ) ) otherlv_11= ';' otherlv_12= 'target' ( (otherlv_13= RULE_ID ) ) otherlv_14= ';' (otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getRelationshipAccess().getRelationshipKeyword_0());
            		
            // InternalSolution.g:1379:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:1380:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:1380:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:1381:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getRelationshipAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRelationshipAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,32,FOLLOW_24); 

            			newLeafNode(otherlv_3, grammarAccess.getRelationshipAccess().getLowerBoundKeyword_3());
            		
            // InternalSolution.g:1405:3: ( (lv_lower_4_0= ruleRoleNumber ) )
            // InternalSolution.g:1406:4: (lv_lower_4_0= ruleRoleNumber )
            {
            // InternalSolution.g:1406:4: (lv_lower_4_0= ruleRoleNumber )
            // InternalSolution.g:1407:5: lv_lower_4_0= ruleRoleNumber
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getLowerRoleNumberParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_8);
            lv_lower_4_0=ruleRoleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"lower",
            						lv_lower_4_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.RoleNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_5, grammarAccess.getRelationshipAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,33,FOLLOW_24); 

            			newLeafNode(otherlv_6, grammarAccess.getRelationshipAccess().getUpperBoundKeyword_6());
            		
            // InternalSolution.g:1432:3: ( (lv_upper_7_0= ruleRoleNumber ) )
            // InternalSolution.g:1433:4: (lv_upper_7_0= ruleRoleNumber )
            {
            // InternalSolution.g:1433:4: (lv_upper_7_0= ruleRoleNumber )
            // InternalSolution.g:1434:5: lv_upper_7_0= ruleRoleNumber
            {

            					newCompositeNode(grammarAccess.getRelationshipAccess().getUpperRoleNumberParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_8);
            lv_upper_7_0=ruleRoleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRelationshipRule());
            					}
            					set(
            						current,
            						"upper",
            						lv_upper_7_0,
            						"at.fhhagenberg.swml.xtext.solution.Solution.RoleNumber");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,14,FOLLOW_26); 

            			newLeafNode(otherlv_8, grammarAccess.getRelationshipAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_9, grammarAccess.getRelationshipAccess().getSourceKeyword_9());
            		
            // InternalSolution.g:1459:3: ( (otherlv_10= RULE_ID ) )
            // InternalSolution.g:1460:4: (otherlv_10= RULE_ID )
            {
            // InternalSolution.g:1460:4: (otherlv_10= RULE_ID )
            // InternalSolution.g:1461:5: otherlv_10= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				
            otherlv_10=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_10, grammarAccess.getRelationshipAccess().getSourceEntityCrossReference_10_0());
            				

            }


            }

            otherlv_11=(Token)match(input,14,FOLLOW_27); 

            			newLeafNode(otherlv_11, grammarAccess.getRelationshipAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_12, grammarAccess.getRelationshipAccess().getTargetKeyword_12());
            		
            // InternalSolution.g:1480:3: ( (otherlv_13= RULE_ID ) )
            // InternalSolution.g:1481:4: (otherlv_13= RULE_ID )
            {
            // InternalSolution.g:1481:4: (otherlv_13= RULE_ID )
            // InternalSolution.g:1482:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRelationshipRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_13, grammarAccess.getRelationshipAccess().getTargetEntityCrossReference_13_0());
            				

            }


            }

            otherlv_14=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_14, grammarAccess.getRelationshipAccess().getSemicolonKeyword_14());
            		
            // InternalSolution.g:1497:3: (otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==36) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalSolution.g:1498:4: otherlv_15= 'opposite' ( (otherlv_16= RULE_ID ) ) otherlv_17= ';'
                    {
                    otherlv_15=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getRelationshipAccess().getOppositeKeyword_15_0());
                    			
                    // InternalSolution.g:1502:4: ( (otherlv_16= RULE_ID ) )
                    // InternalSolution.g:1503:5: (otherlv_16= RULE_ID )
                    {
                    // InternalSolution.g:1503:5: (otherlv_16= RULE_ID )
                    // InternalSolution.g:1504:6: otherlv_16= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getRelationshipRule());
                    						}
                    					
                    otherlv_16=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_16, grammarAccess.getRelationshipAccess().getRefRelationshipCrossReference_15_1_0());
                    					

                    }


                    }

                    otherlv_17=(Token)match(input,14,FOLLOW_11); 

                    				newLeafNode(otherlv_17, grammarAccess.getRelationshipAccess().getSemicolonKeyword_15_2());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getRelationshipAccess().getRightCurlyBracketKeyword_16());
            		

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
    // $ANTLR end "ruleRelationship"


    // $ANTLR start "entryRuleRoleNumber"
    // InternalSolution.g:1528:1: entryRuleRoleNumber returns [String current=null] : iv_ruleRoleNumber= ruleRoleNumber EOF ;
    public final String entryRuleRoleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRoleNumber = null;


        try {
            // InternalSolution.g:1528:50: (iv_ruleRoleNumber= ruleRoleNumber EOF )
            // InternalSolution.g:1529:2: iv_ruleRoleNumber= ruleRoleNumber EOF
            {
             newCompositeNode(grammarAccess.getRoleNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRoleNumber=ruleRoleNumber();

            state._fsp--;

             current =iv_ruleRoleNumber.getText(); 
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
    // $ANTLR end "entryRuleRoleNumber"


    // $ANTLR start "ruleRoleNumber"
    // InternalSolution.g:1535:1: ruleRoleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | kw= '-1' | kw= '*' ) ;
    public final AntlrDatatypeRuleToken ruleRoleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;


        	enterRule();

        try {
            // InternalSolution.g:1541:2: ( (this_INT_0= RULE_INT | kw= '-1' | kw= '*' ) )
            // InternalSolution.g:1542:2: (this_INT_0= RULE_INT | kw= '-1' | kw= '*' )
            {
            // InternalSolution.g:1542:2: (this_INT_0= RULE_INT | kw= '-1' | kw= '*' )
            int alt25=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt25=1;
                }
                break;
            case 37:
                {
                alt25=2;
                }
                break;
            case 38:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalSolution.g:1543:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_0);
                    		

                    			newLeafNode(this_INT_0, grammarAccess.getRoleNumberAccess().getINTTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalSolution.g:1551:3: kw= '-1'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRoleNumberAccess().getHyphenMinusDigitOneKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalSolution.g:1557:3: kw= '*'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getRoleNumberAccess().getAsteriskKeyword_2());
                    		

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
    // $ANTLR end "ruleRoleNumber"


    // $ANTLR start "entryRuleLink"
    // InternalSolution.g:1566:1: entryRuleLink returns [EObject current=null] : iv_ruleLink= ruleLink EOF ;
    public final EObject entryRuleLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLink = null;


        try {
            // InternalSolution.g:1566:45: (iv_ruleLink= ruleLink EOF )
            // InternalSolution.g:1567:2: iv_ruleLink= ruleLink EOF
            {
             newCompositeNode(grammarAccess.getLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLink=ruleLink();

            state._fsp--;

             current =iv_ruleLink; 
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
    // $ANTLR end "entryRuleLink"


    // $ANTLR start "ruleLink"
    // InternalSolution.g:1573:1: ruleLink returns [EObject current=null] : (this_NonContextualLink_0= ruleNonContextualLink | this_ContextualLink_1= ruleContextualLink ) ;
    public final EObject ruleLink() throws RecognitionException {
        EObject current = null;

        EObject this_NonContextualLink_0 = null;

        EObject this_ContextualLink_1 = null;



        	enterRule();

        try {
            // InternalSolution.g:1579:2: ( (this_NonContextualLink_0= ruleNonContextualLink | this_ContextualLink_1= ruleContextualLink ) )
            // InternalSolution.g:1580:2: (this_NonContextualLink_0= ruleNonContextualLink | this_ContextualLink_1= ruleContextualLink )
            {
            // InternalSolution.g:1580:2: (this_NonContextualLink_0= ruleNonContextualLink | this_ContextualLink_1= ruleContextualLink )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==39) ) {
                alt26=1;
            }
            else if ( (LA26_0==40) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalSolution.g:1581:3: this_NonContextualLink_0= ruleNonContextualLink
                    {

                    			newCompositeNode(grammarAccess.getLinkAccess().getNonContextualLinkParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_NonContextualLink_0=ruleNonContextualLink();

                    state._fsp--;


                    			current = this_NonContextualLink_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalSolution.g:1590:3: this_ContextualLink_1= ruleContextualLink
                    {

                    			newCompositeNode(grammarAccess.getLinkAccess().getContextualLinkParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ContextualLink_1=ruleContextualLink();

                    state._fsp--;


                    			current = this_ContextualLink_1;
                    			afterParserOrEnumRuleCall();
                    		

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
    // $ANTLR end "ruleLink"


    // $ANTLR start "entryRuleNonContextualLink"
    // InternalSolution.g:1602:1: entryRuleNonContextualLink returns [EObject current=null] : iv_ruleNonContextualLink= ruleNonContextualLink EOF ;
    public final EObject entryRuleNonContextualLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonContextualLink = null;


        try {
            // InternalSolution.g:1602:58: (iv_ruleNonContextualLink= ruleNonContextualLink EOF )
            // InternalSolution.g:1603:2: iv_ruleNonContextualLink= ruleNonContextualLink EOF
            {
             newCompositeNode(grammarAccess.getNonContextualLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonContextualLink=ruleNonContextualLink();

            state._fsp--;

             current =iv_ruleNonContextualLink; 
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
    // $ANTLR end "entryRuleNonContextualLink"


    // $ANTLR start "ruleNonContextualLink"
    // InternalSolution.g:1609:1: ruleNonContextualLink returns [EObject current=null] : (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) ;
    public final EObject ruleNonContextualLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalSolution.g:1615:2: ( (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' ) )
            // InternalSolution.g:1616:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            {
            // InternalSolution.g:1616:2: (otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';' )
            // InternalSolution.g:1617:3: otherlv_0= 'link' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getNonContextualLinkAccess().getLinkKeyword_0());
            		
            // InternalSolution.g:1621:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:1622:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:1622:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:1623:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getNonContextualLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonContextualLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getNonContextualLinkAccess().getTargetKeyword_2());
            		
            // InternalSolution.g:1643:3: ( (otherlv_3= RULE_ID ) )
            // InternalSolution.g:1644:4: (otherlv_3= RULE_ID )
            {
            // InternalSolution.g:1644:4: (otherlv_3= RULE_ID )
            // InternalSolution.g:1645:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNonContextualLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_3, grammarAccess.getNonContextualLinkAccess().getTargetWebPageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getNonContextualLinkAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleNonContextualLink"


    // $ANTLR start "entryRuleContextualLink"
    // InternalSolution.g:1664:1: entryRuleContextualLink returns [EObject current=null] : iv_ruleContextualLink= ruleContextualLink EOF ;
    public final EObject entryRuleContextualLink() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContextualLink = null;


        try {
            // InternalSolution.g:1664:55: (iv_ruleContextualLink= ruleContextualLink EOF )
            // InternalSolution.g:1665:2: iv_ruleContextualLink= ruleContextualLink EOF
            {
             newCompositeNode(grammarAccess.getContextualLinkRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleContextualLink=ruleContextualLink();

            state._fsp--;

             current =iv_ruleContextualLink; 
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
    // $ANTLR end "entryRuleContextualLink"


    // $ANTLR start "ruleContextualLink"
    // InternalSolution.g:1671:1: ruleContextualLink returns [EObject current=null] : (otherlv_0= 'contextualLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'information' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) ;
    public final EObject ruleContextualLink() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalSolution.g:1677:2: ( (otherlv_0= 'contextualLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'information' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' ) )
            // InternalSolution.g:1678:2: (otherlv_0= 'contextualLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'information' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            {
            // InternalSolution.g:1678:2: (otherlv_0= 'contextualLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'information' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';' )
            // InternalSolution.g:1679:3: otherlv_0= 'contextualLink' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'target' ( (otherlv_3= RULE_ID ) ) otherlv_4= 'information' ( (otherlv_5= RULE_ID ) ) otherlv_6= ';'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getContextualLinkAccess().getContextualLinkKeyword_0());
            		
            // InternalSolution.g:1683:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalSolution.g:1684:4: (lv_name_1_0= RULE_ID )
            {
            // InternalSolution.g:1684:4: (lv_name_1_0= RULE_ID )
            // InternalSolution.g:1685:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_27); 

            					newLeafNode(lv_name_1_0, grammarAccess.getContextualLinkAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextualLinkRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getContextualLinkAccess().getTargetKeyword_2());
            		
            // InternalSolution.g:1705:3: ( (otherlv_3= RULE_ID ) )
            // InternalSolution.g:1706:4: (otherlv_3= RULE_ID )
            {
            // InternalSolution.g:1706:4: (otherlv_3= RULE_ID )
            // InternalSolution.g:1707:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextualLinkRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(otherlv_3, grammarAccess.getContextualLinkAccess().getTargetWebPageCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_4, grammarAccess.getContextualLinkAccess().getInformationKeyword_4());
            		
            // InternalSolution.g:1722:3: ( (otherlv_5= RULE_ID ) )
            // InternalSolution.g:1723:4: (otherlv_5= RULE_ID )
            {
            // InternalSolution.g:1723:4: (otherlv_5= RULE_ID )
            // InternalSolution.g:1724:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getContextualLinkRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(otherlv_5, grammarAccess.getContextualLinkAccess().getInformationEntityCrossReference_5_0());
            				

            }


            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getContextualLinkAccess().getSemicolonKeyword_6());
            		

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
    // $ANTLR end "ruleContextualLink"


    // $ANTLR start "ruleDatatype"
    // InternalSolution.g:1743:1: ruleDatatype returns [Enumerator current=null] : ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'bool' ) ) ;
    public final Enumerator ruleDatatype() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalSolution.g:1749:2: ( ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'bool' ) ) )
            // InternalSolution.g:1750:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'bool' ) )
            {
            // InternalSolution.g:1750:2: ( (enumLiteral_0= 'String' ) | (enumLiteral_1= 'float' ) | (enumLiteral_2= 'int' ) | (enumLiteral_3= 'bool' ) )
            int alt27=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt27=1;
                }
                break;
            case 43:
                {
                alt27=2;
                }
                break;
            case 44:
                {
                alt27=3;
                }
                break;
            case 45:
                {
                alt27=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalSolution.g:1751:3: (enumLiteral_0= 'String' )
                    {
                    // InternalSolution.g:1751:3: (enumLiteral_0= 'String' )
                    // InternalSolution.g:1752:4: enumLiteral_0= 'String'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getSTRINGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDatatypeAccess().getSTRINGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalSolution.g:1759:3: (enumLiteral_1= 'float' )
                    {
                    // InternalSolution.g:1759:3: (enumLiteral_1= 'float' )
                    // InternalSolution.g:1760:4: enumLiteral_1= 'float'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getFLOATEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDatatypeAccess().getFLOATEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalSolution.g:1767:3: (enumLiteral_2= 'int' )
                    {
                    // InternalSolution.g:1767:3: (enumLiteral_2= 'int' )
                    // InternalSolution.g:1768:4: enumLiteral_2= 'int'
                    {
                    enumLiteral_2=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getINTEGEREnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDatatypeAccess().getINTEGEREnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalSolution.g:1775:3: (enumLiteral_3= 'bool' )
                    {
                    // InternalSolution.g:1775:3: (enumLiteral_3= 'bool' )
                    // InternalSolution.g:1776:4: enumLiteral_3= 'bool'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getDatatypeAccess().getBOOLEANEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getDatatypeAccess().getBOOLEANEnumLiteralDeclaration_3());
                    			

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000008ED22000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000008E922000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000E922000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000018000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000000000ED00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x000000000F900000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00003C0000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000006000000040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000010000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000000L});

}