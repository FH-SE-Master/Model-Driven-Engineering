package at.ooe.fh.mdm.herzog.dsl.proj.parser.antlr.internal;

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
import at.ooe.fh.mdm.herzog.dsl.proj.services.ProjectGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectGeneratorParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CLASSNAME", "RULE_LOCALIZEDKEY", "RULE_UAZ", "RULE_LAZ", "RULE_UAZN", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'key'", "';'", "'cdiEnabled'", "'messageBundles'", "'}'", "'observers'", "'jpaConfig'", "'serviceConfig'", "'type'", "'during'", "'notify'", "'delegate'", "'qualifier'", "'localizedEnums'", "'values'", "'args'", "'locale'", "'value'", "'de_DE'", "'en_US'", "'true'", "'false'", "'InProgress'", "'AfterCompleition'", "'Always'", "'Exists'"
    };
    public static final int RULE_UAZN=10;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_LOCALIZEDKEY=7;
    public static final int RULE_UAZ=8;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=13;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_CLASSNAME=6;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=14;
    public static final int RULE_ANY_OTHER=15;
    public static final int RULE_LAZ=9;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalProjectGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectGenerator.g"; }



     	private ProjectGeneratorGrammarAccess grammarAccess;

        public InternalProjectGeneratorParser(TokenStream input, ProjectGeneratorGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Module";
       	}

       	@Override
       	protected ProjectGeneratorGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModule"
    // InternalProjectGenerator.g:65:1: entryRuleModule returns [EObject current=null] : iv_ruleModule= ruleModule EOF ;
    public final EObject entryRuleModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModule = null;


        try {
            // InternalProjectGenerator.g:65:47: (iv_ruleModule= ruleModule EOF )
            // InternalProjectGenerator.g:66:2: iv_ruleModule= ruleModule EOF
            {
             newCompositeNode(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
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
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalProjectGenerator.g:72:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' ) ;
    public final EObject ruleModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_key_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Enumerator lv_cdiEnabled_7_0 = null;

        EObject lv_messageBundles_11_0 = null;

        EObject lv_observers_16_0 = null;

        EObject lv_jpaConfig_20_0 = null;

        EObject lv_serviceConfig_23_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:78:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' ) )
            // InternalProjectGenerator.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' )
            {
            // InternalProjectGenerator.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' )
            // InternalProjectGenerator.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModuleAccess().getModuleKeyword_0());
            		
            // InternalProjectGenerator.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectGenerator.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectGenerator.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalProjectGenerator.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,18,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getModuleAccess().getKeyKeyword_3());
            		
            // InternalProjectGenerator.g:110:3: ( (lv_key_4_0= RULE_STRING ) )
            // InternalProjectGenerator.g:111:4: (lv_key_4_0= RULE_STRING )
            {
            // InternalProjectGenerator.g:111:4: (lv_key_4_0= RULE_STRING )
            // InternalProjectGenerator.g:112:5: lv_key_4_0= RULE_STRING
            {
            lv_key_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_key_4_0, grammarAccess.getModuleAccess().getKeySTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModuleRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_6, grammarAccess.getModuleAccess().getCdiEnabledKeyword_6());
            		
            // InternalProjectGenerator.g:136:3: ( (lv_cdiEnabled_7_0= ruleBoolean ) )
            // InternalProjectGenerator.g:137:4: (lv_cdiEnabled_7_0= ruleBoolean )
            {
            // InternalProjectGenerator.g:137:4: (lv_cdiEnabled_7_0= ruleBoolean )
            // InternalProjectGenerator.g:138:5: lv_cdiEnabled_7_0= ruleBoolean
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getCdiEnabledBooleanEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_cdiEnabled_7_0=ruleBoolean();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"cdiEnabled",
            						lv_cdiEnabled_7_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Boolean");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getModuleAccess().getSemicolonKeyword_8());
            		
            // InternalProjectGenerator.g:159:3: (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==21) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalProjectGenerator.g:160:4: otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';'
                    {
                    otherlv_9=(Token)match(input,21,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getMessageBundlesKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_10, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalProjectGenerator.g:168:4: ( (lv_messageBundles_11_0= ruleLocalized ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_ID) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:169:5: (lv_messageBundles_11_0= ruleLocalized )
                    	    {
                    	    // InternalProjectGenerator.g:169:5: (lv_messageBundles_11_0= ruleLocalized )
                    	    // InternalProjectGenerator.g:170:6: lv_messageBundles_11_0= ruleLocalized
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleAccess().getMessageBundlesLocalizedParserRuleCall_9_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_messageBundles_11_0=ruleLocalized();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"messageBundles",
                    	    							lv_messageBundles_11_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Localized");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9_3());
                    			
                    otherlv_13=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_13, grammarAccess.getModuleAccess().getSemicolonKeyword_9_4());
                    			

                    }
                    break;

            }

            // InternalProjectGenerator.g:196:3: (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjectGenerator.g:197:4: otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';'
                    {
                    otherlv_14=(Token)match(input,23,FOLLOW_4); 

                    				newLeafNode(otherlv_14, grammarAccess.getModuleAccess().getObserversKeyword_10_0());
                    			
                    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_10_1());
                    			
                    // InternalProjectGenerator.g:205:4: ( (lv_observers_16_0= ruleObserver ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:206:5: (lv_observers_16_0= ruleObserver )
                    	    {
                    	    // InternalProjectGenerator.g:206:5: (lv_observers_16_0= ruleObserver )
                    	    // InternalProjectGenerator.g:207:6: lv_observers_16_0= ruleObserver
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleAccess().getObserversObserverParserRuleCall_10_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_observers_16_0=ruleObserver();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"observers",
                    	    							lv_observers_16_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Observer");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);

                    otherlv_17=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_17, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_10_3());
                    			
                    otherlv_18=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_18, grammarAccess.getModuleAccess().getSemicolonKeyword_10_4());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,24,FOLLOW_4); 

            			newLeafNode(otherlv_19, grammarAccess.getModuleAccess().getJpaConfigKeyword_11());
            		
            // InternalProjectGenerator.g:237:3: ( (lv_jpaConfig_20_0= ruleJpaConfig ) )
            // InternalProjectGenerator.g:238:4: (lv_jpaConfig_20_0= ruleJpaConfig )
            {
            // InternalProjectGenerator.g:238:4: (lv_jpaConfig_20_0= ruleJpaConfig )
            // InternalProjectGenerator.g:239:5: lv_jpaConfig_20_0= ruleJpaConfig
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getJpaConfigJpaConfigParserRuleCall_12_0());
            				
            pushFollow(FOLLOW_7);
            lv_jpaConfig_20_0=ruleJpaConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"jpaConfig",
            						lv_jpaConfig_20_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.JpaConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_21=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_21, grammarAccess.getModuleAccess().getSemicolonKeyword_13());
            		
            otherlv_22=(Token)match(input,25,FOLLOW_4); 

            			newLeafNode(otherlv_22, grammarAccess.getModuleAccess().getServiceConfigKeyword_14());
            		
            // InternalProjectGenerator.g:264:3: ( (lv_serviceConfig_23_0= ruleServiceConfig ) )
            // InternalProjectGenerator.g:265:4: (lv_serviceConfig_23_0= ruleServiceConfig )
            {
            // InternalProjectGenerator.g:265:4: (lv_serviceConfig_23_0= ruleServiceConfig )
            // InternalProjectGenerator.g:266:5: lv_serviceConfig_23_0= ruleServiceConfig
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getServiceConfigServiceConfigParserRuleCall_15_0());
            				
            pushFollow(FOLLOW_7);
            lv_serviceConfig_23_0=ruleServiceConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"serviceConfig",
            						lv_serviceConfig_23_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.ServiceConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_24=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_24, grammarAccess.getModuleAccess().getSemicolonKeyword_16());
            		
            otherlv_25=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_17());
            		

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
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleServiceConfig"
    // InternalProjectGenerator.g:295:1: entryRuleServiceConfig returns [EObject current=null] : iv_ruleServiceConfig= ruleServiceConfig EOF ;
    public final EObject entryRuleServiceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConfig = null;


        try {
            // InternalProjectGenerator.g:295:54: (iv_ruleServiceConfig= ruleServiceConfig EOF )
            // InternalProjectGenerator.g:296:2: iv_ruleServiceConfig= ruleServiceConfig EOF
            {
             newCompositeNode(grammarAccess.getServiceConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConfig=ruleServiceConfig();

            state._fsp--;

             current =iv_ruleServiceConfig; 
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
    // $ANTLR end "entryRuleServiceConfig"


    // $ANTLR start "ruleServiceConfig"
    // InternalProjectGenerator.g:302:1: ruleServiceConfig returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' ) otherlv_8= '}' ) ;
    public final EObject ruleServiceConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_observers_2_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:308:2: ( (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' ) otherlv_8= '}' ) )
            // InternalProjectGenerator.g:309:2: (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' ) otherlv_8= '}' )
            {
            // InternalProjectGenerator.g:309:2: (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' ) otherlv_8= '}' )
            // InternalProjectGenerator.g:310:3: otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' ) otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalProjectGenerator.g:314:3: (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProjectGenerator.g:315:4: otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+
                    {
                    otherlv_1=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getServiceConfigAccess().getObserversKeyword_1_0());
                    			
                    // InternalProjectGenerator.g:319:4: ( (lv_observers_2_0= ruleObserver ) )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:320:5: (lv_observers_2_0= ruleObserver )
                    	    {
                    	    // InternalProjectGenerator.g:320:5: (lv_observers_2_0= ruleObserver )
                    	    // InternalProjectGenerator.g:321:6: lv_observers_2_0= ruleObserver
                    	    {

                    	    						newCompositeNode(grammarAccess.getServiceConfigAccess().getObserversObserverParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_observers_2_0=ruleObserver();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getServiceConfigRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"observers",
                    	    							lv_observers_2_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Observer");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;

            }

            // InternalProjectGenerator.g:339:3: (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )
            // InternalProjectGenerator.g:340:4: otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';'
            {
            otherlv_3=(Token)match(input,21,FOLLOW_4); 

            				newLeafNode(otherlv_3, grammarAccess.getServiceConfigAccess().getMessageBundlesKeyword_2_0());
            			
            otherlv_4=(Token)match(input,17,FOLLOW_3); 

            				newLeafNode(otherlv_4, grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_2_1());
            			
            // InternalProjectGenerator.g:348:4: ( (otherlv_5= RULE_ID ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectGenerator.g:349:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalProjectGenerator.g:349:5: (otherlv_5= RULE_ID )
            	    // InternalProjectGenerator.g:350:6: otherlv_5= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getServiceConfigRule());
            	    						}
            	    					
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    						newLeafNode(otherlv_5, grammarAccess.getServiceConfigAccess().getMessageBundlesLocalizedCrossReference_2_2_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_7); 

            				newLeafNode(otherlv_6, grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_2_3());
            			
            otherlv_7=(Token)match(input,19,FOLLOW_15); 

            				newLeafNode(otherlv_7, grammarAccess.getServiceConfigAccess().getSemicolonKeyword_2_4());
            			

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_3());
            		

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
    // $ANTLR end "ruleServiceConfig"


    // $ANTLR start "entryRuleObserver"
    // InternalProjectGenerator.g:378:1: entryRuleObserver returns [EObject current=null] : iv_ruleObserver= ruleObserver EOF ;
    public final EObject entryRuleObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserver = null;


        try {
            // InternalProjectGenerator.g:378:49: (iv_ruleObserver= ruleObserver EOF )
            // InternalProjectGenerator.g:379:2: iv_ruleObserver= ruleObserver EOF
            {
             newCompositeNode(grammarAccess.getObserverRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObserver=ruleObserver();

            state._fsp--;

             current =iv_ruleObserver; 
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
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalProjectGenerator.g:385:1: ruleObserver returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' otherlv_18= ';' ) ;
    public final EObject ruleObserver() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token lv_className_12_0=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_qualifier_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_during_6_0 = null;

        Enumerator lv_notify_9_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:391:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' otherlv_18= ';' ) )
            // InternalProjectGenerator.g:392:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' otherlv_18= ';' )
            {
            // InternalProjectGenerator.g:392:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' otherlv_18= ';' )
            // InternalProjectGenerator.g:393:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' otherlv_18= ';'
            {
            // InternalProjectGenerator.g:393:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectGenerator.g:394:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectGenerator.g:394:4: (lv_name_0_0= RULE_ID )
            // InternalProjectGenerator.g:395:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getObserverAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getObserverAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,26,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getObserverAccess().getTypeKeyword_2());
            		
            // InternalProjectGenerator.g:419:3: ( (lv_type_3_0= RULE_CLASSNAME ) )
            // InternalProjectGenerator.g:420:4: (lv_type_3_0= RULE_CLASSNAME )
            {
            // InternalProjectGenerator.g:420:4: (lv_type_3_0= RULE_CLASSNAME )
            // InternalProjectGenerator.g:421:5: lv_type_3_0= RULE_CLASSNAME
            {
            lv_type_3_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_7); 

            					newLeafNode(lv_type_3_0, grammarAccess.getObserverAccess().getTypeCLASSNAMETerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_3_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.CLASSNAME");
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_20); 

            			newLeafNode(otherlv_4, grammarAccess.getObserverAccess().getSemicolonKeyword_4());
            		
            otherlv_5=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getObserverAccess().getDuringKeyword_5());
            		
            // InternalProjectGenerator.g:445:3: ( (lv_during_6_0= ruleDuring ) )
            // InternalProjectGenerator.g:446:4: (lv_during_6_0= ruleDuring )
            {
            // InternalProjectGenerator.g:446:4: (lv_during_6_0= ruleDuring )
            // InternalProjectGenerator.g:447:5: lv_during_6_0= ruleDuring
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getDuringDuringEnumRuleCall_6_0());
            				
            pushFollow(FOLLOW_7);
            lv_during_6_0=ruleDuring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					set(
            						current,
            						"during",
            						lv_during_6_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.During");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_22); 

            			newLeafNode(otherlv_7, grammarAccess.getObserverAccess().getSemicolonKeyword_7());
            		
            otherlv_8=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_8, grammarAccess.getObserverAccess().getNotifyKeyword_8());
            		
            // InternalProjectGenerator.g:472:3: ( (lv_notify_9_0= ruleNotify ) )
            // InternalProjectGenerator.g:473:4: (lv_notify_9_0= ruleNotify )
            {
            // InternalProjectGenerator.g:473:4: (lv_notify_9_0= ruleNotify )
            // InternalProjectGenerator.g:474:5: lv_notify_9_0= ruleNotify
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getNotifyNotifyEnumRuleCall_9_0());
            				
            pushFollow(FOLLOW_7);
            lv_notify_9_0=ruleNotify();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					set(
            						current,
            						"notify",
            						lv_notify_9_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Notify");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_24); 

            			newLeafNode(otherlv_10, grammarAccess.getObserverAccess().getSemicolonKeyword_10());
            		
            otherlv_11=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_11, grammarAccess.getObserverAccess().getDelegateKeyword_11());
            		
            // InternalProjectGenerator.g:499:3: ( (lv_className_12_0= RULE_CLASSNAME ) )
            // InternalProjectGenerator.g:500:4: (lv_className_12_0= RULE_CLASSNAME )
            {
            // InternalProjectGenerator.g:500:4: (lv_className_12_0= RULE_CLASSNAME )
            // InternalProjectGenerator.g:501:5: lv_className_12_0= RULE_CLASSNAME
            {
            lv_className_12_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_7); 

            					newLeafNode(lv_className_12_0, grammarAccess.getObserverAccess().getClassNameCLASSNAMETerminalRuleCall_12_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_12_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.CLASSNAME");
            				

            }


            }

            otherlv_13=(Token)match(input,19,FOLLOW_25); 

            			newLeafNode(otherlv_13, grammarAccess.getObserverAccess().getSemicolonKeyword_13());
            		
            // InternalProjectGenerator.g:521:3: (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProjectGenerator.g:522:4: otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';'
                    {
                    otherlv_14=(Token)match(input,30,FOLLOW_19); 

                    				newLeafNode(otherlv_14, grammarAccess.getObserverAccess().getQualifierKeyword_14_0());
                    			
                    // InternalProjectGenerator.g:526:4: ( (lv_qualifier_15_0= RULE_CLASSNAME ) )
                    // InternalProjectGenerator.g:527:5: (lv_qualifier_15_0= RULE_CLASSNAME )
                    {
                    // InternalProjectGenerator.g:527:5: (lv_qualifier_15_0= RULE_CLASSNAME )
                    // InternalProjectGenerator.g:528:6: lv_qualifier_15_0= RULE_CLASSNAME
                    {
                    lv_qualifier_15_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_7); 

                    						newLeafNode(lv_qualifier_15_0, grammarAccess.getObserverAccess().getQualifierCLASSNAMETerminalRuleCall_14_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getObserverRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"qualifier",
                    							lv_qualifier_15_0,
                    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.CLASSNAME");
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_16, grammarAccess.getObserverAccess().getSemicolonKeyword_14_2());
                    			

                    }
                    break;

            }

            otherlv_17=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_17, grammarAccess.getObserverAccess().getRightCurlyBracketKeyword_15());
            		
            otherlv_18=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_18, grammarAccess.getObserverAccess().getSemicolonKeyword_16());
            		

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
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleJpaConfig"
    // InternalProjectGenerator.g:561:1: entryRuleJpaConfig returns [EObject current=null] : iv_ruleJpaConfig= ruleJpaConfig EOF ;
    public final EObject entryRuleJpaConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJpaConfig = null;


        try {
            // InternalProjectGenerator.g:561:50: (iv_ruleJpaConfig= ruleJpaConfig EOF )
            // InternalProjectGenerator.g:562:2: iv_ruleJpaConfig= ruleJpaConfig EOF
            {
             newCompositeNode(grammarAccess.getJpaConfigRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJpaConfig=ruleJpaConfig();

            state._fsp--;

             current =iv_ruleJpaConfig; 
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
    // $ANTLR end "entryRuleJpaConfig"


    // $ANTLR start "ruleJpaConfig"
    // InternalProjectGenerator.g:568:1: ruleJpaConfig returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' (otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+ )? otherlv_8= '}' ) ;
    public final EObject ruleJpaConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_observers_7_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:574:2: ( (otherlv_0= '{' otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' (otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+ )? otherlv_8= '}' ) )
            // InternalProjectGenerator.g:575:2: (otherlv_0= '{' otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' (otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+ )? otherlv_8= '}' )
            {
            // InternalProjectGenerator.g:575:2: (otherlv_0= '{' otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' (otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+ )? otherlv_8= '}' )
            // InternalProjectGenerator.g:576:3: otherlv_0= '{' otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' (otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+ )? otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getJpaConfigAccess().getLocalizedEnumsKeyword_1());
            		
            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalProjectGenerator.g:588:3: ( (otherlv_3= RULE_ID ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProjectGenerator.g:589:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalProjectGenerator.g:589:4: (otherlv_3= RULE_ID )
            	    // InternalProjectGenerator.g:590:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getJpaConfigRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

            	    					newLeafNode(otherlv_3, grammarAccess.getJpaConfigAccess().getLocalizedEnumsLocalizedCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_4());
            		
            otherlv_5=(Token)match(input,19,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getJpaConfigAccess().getSemicolonKeyword_5());
            		
            // InternalProjectGenerator.g:609:3: (otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==23) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalProjectGenerator.g:610:4: otherlv_6= 'observers' ( (lv_observers_7_0= ruleObserver ) )+
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getJpaConfigAccess().getObserversKeyword_6_0());
                    			
                    // InternalProjectGenerator.g:614:4: ( (lv_observers_7_0= ruleObserver ) )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==RULE_ID) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:615:5: (lv_observers_7_0= ruleObserver )
                    	    {
                    	    // InternalProjectGenerator.g:615:5: (lv_observers_7_0= ruleObserver )
                    	    // InternalProjectGenerator.g:616:6: lv_observers_7_0= ruleObserver
                    	    {

                    	    						newCompositeNode(grammarAccess.getJpaConfigAccess().getObserversObserverParserRuleCall_6_1_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_observers_7_0=ruleObserver();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getJpaConfigRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"observers",
                    	    							lv_observers_7_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Observer");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }

            otherlv_8=(Token)match(input,22,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleJpaConfig"


    // $ANTLR start "entryRuleLocalized"
    // InternalProjectGenerator.g:642:1: entryRuleLocalized returns [EObject current=null] : iv_ruleLocalized= ruleLocalized EOF ;
    public final EObject entryRuleLocalized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalized = null;


        try {
            // InternalProjectGenerator.g:642:50: (iv_ruleLocalized= ruleLocalized EOF )
            // InternalProjectGenerator.g:643:2: iv_ruleLocalized= ruleLocalized EOF
            {
             newCompositeNode(grammarAccess.getLocalizedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalized=ruleLocalized();

            state._fsp--;

             current =iv_ruleLocalized; 
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
    // $ANTLR end "entryRuleLocalized"


    // $ANTLR start "ruleLocalized"
    // InternalProjectGenerator.g:649:1: ruleLocalized returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleLocalized() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:655:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' otherlv_8= ';' ) )
            // InternalProjectGenerator.g:656:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalProjectGenerator.g:656:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' otherlv_8= ';' )
            // InternalProjectGenerator.g:657:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' otherlv_8= ';'
            {
            // InternalProjectGenerator.g:657:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalProjectGenerator.g:658:4: (lv_name_0_0= RULE_ID )
            {
            // InternalProjectGenerator.g:658:4: (lv_name_0_0= RULE_ID )
            // InternalProjectGenerator.g:659:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_0_0, grammarAccess.getLocalizedAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalizedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_28); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalProjectGenerator.g:679:3: (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProjectGenerator.g:680:4: otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_4); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalizedAccess().getValuesKeyword_2_0());
                    			
                    otherlv_3=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_2_1());
                    			
                    // InternalProjectGenerator.g:688:4: ( (lv_values_4_0= ruleLocalizedEntry ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==17) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:689:5: (lv_values_4_0= ruleLocalizedEntry )
                    	    {
                    	    // InternalProjectGenerator.g:689:5: (lv_values_4_0= ruleLocalizedEntry )
                    	    // InternalProjectGenerator.g:690:6: lv_values_4_0= ruleLocalizedEntry
                    	    {

                    	    						newCompositeNode(grammarAccess.getLocalizedAccess().getValuesLocalizedEntryParserRuleCall_2_2_0());
                    	    					
                    	    pushFollow(FOLLOW_29);
                    	    lv_values_4_0=ruleLocalizedEntry();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLocalizedRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"values",
                    	    							lv_values_4_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.LocalizedEntry");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt12 >= 1 ) break loop12;
                                EarlyExitException eee =
                                    new EarlyExitException(12, input);
                                throw eee;
                        }
                        cnt12++;
                    } while (true);

                    otherlv_5=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_2_3());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_6, grammarAccess.getLocalizedAccess().getSemicolonKeyword_2_4());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_3());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalizedAccess().getSemicolonKeyword_4());
            		

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
    // $ANTLR end "ruleLocalized"


    // $ANTLR start "entryRuleLocalizedEntry"
    // InternalProjectGenerator.g:728:1: entryRuleLocalizedEntry returns [EObject current=null] : iv_ruleLocalizedEntry= ruleLocalizedEntry EOF ;
    public final EObject entryRuleLocalizedEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalizedEntry = null;


        try {
            // InternalProjectGenerator.g:728:55: (iv_ruleLocalizedEntry= ruleLocalizedEntry EOF )
            // InternalProjectGenerator.g:729:2: iv_ruleLocalizedEntry= ruleLocalizedEntry EOF
            {
             newCompositeNode(grammarAccess.getLocalizedEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalizedEntry=ruleLocalizedEntry();

            state._fsp--;

             current =iv_ruleLocalizedEntry; 
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
    // $ANTLR end "entryRuleLocalizedEntry"


    // $ANTLR start "ruleLocalizedEntry"
    // InternalProjectGenerator.g:735:1: ruleLocalizedEntry returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) ;
    public final EObject ruleLocalizedEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_localizedKey_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_args_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:741:2: ( (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' ) )
            // InternalProjectGenerator.g:742:2: (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            {
            // InternalProjectGenerator.g:742:2: (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';' )
            // InternalProjectGenerator.g:743:3: otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' otherlv_15= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,18,FOLLOW_30); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalizedEntryAccess().getKeyKeyword_1());
            		
            // InternalProjectGenerator.g:751:3: ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) )
            // InternalProjectGenerator.g:752:4: (lv_localizedKey_2_0= RULE_LOCALIZEDKEY )
            {
            // InternalProjectGenerator.g:752:4: (lv_localizedKey_2_0= RULE_LOCALIZEDKEY )
            // InternalProjectGenerator.g:753:5: lv_localizedKey_2_0= RULE_LOCALIZEDKEY
            {
            lv_localizedKey_2_0=(Token)match(input,RULE_LOCALIZEDKEY,FOLLOW_7); 

            					newLeafNode(lv_localizedKey_2_0, grammarAccess.getLocalizedEntryAccess().getLocalizedKeyLOCALIZEDKEYTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalizedEntryRule());
            					}
            					setWithLastConsumed(
            						current,
            						"localizedKey",
            						lv_localizedKey_2_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.LOCALIZEDKEY");
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_31); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,32,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalizedEntryAccess().getValuesKeyword_4());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_4); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalProjectGenerator.g:781:3: ( (lv_values_6_0= ruleLocalizedValue ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProjectGenerator.g:782:4: (lv_values_6_0= ruleLocalizedValue )
            	    {
            	    // InternalProjectGenerator.g:782:4: (lv_values_6_0= ruleLocalizedValue )
            	    // InternalProjectGenerator.g:783:5: lv_values_6_0= ruleLocalizedValue
            	    {

            	    					newCompositeNode(grammarAccess.getLocalizedEntryAccess().getValuesLocalizedValueParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_values_6_0=ruleLocalizedValue();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocalizedEntryRule());
            	    					}
            	    					add(
            	    						current,
            	    						"values",
            	    						lv_values_6_0,
            	    						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.LocalizedValue");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_32); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_8());
            		
            // InternalProjectGenerator.g:808:3: (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==33) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalProjectGenerator.g:809:4: otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';'
                    {
                    otherlv_9=(Token)match(input,33,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocalizedEntryAccess().getArgsKeyword_9_0());
                    			
                    otherlv_10=(Token)match(input,17,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_9_1());
                    			
                    // InternalProjectGenerator.g:817:4: ( (lv_args_11_0= RULE_STRING ) )+
                    int cnt15=0;
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_STRING) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:818:5: (lv_args_11_0= RULE_STRING )
                    	    {
                    	    // InternalProjectGenerator.g:818:5: (lv_args_11_0= RULE_STRING )
                    	    // InternalProjectGenerator.g:819:6: lv_args_11_0= RULE_STRING
                    	    {
                    	    lv_args_11_0=(Token)match(input,RULE_STRING,FOLLOW_33); 

                    	    						newLeafNode(lv_args_11_0, grammarAccess.getLocalizedEntryAccess().getArgsSTRINGTerminalRuleCall_9_2_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getLocalizedEntryRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"args",
                    	    							lv_args_11_0,
                    	    							"org.eclipse.xtext.common.Terminals.STRING");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt15 >= 1 ) break loop15;
                                EarlyExitException eee =
                                    new EarlyExitException(15, input);
                                throw eee;
                        }
                        cnt15++;
                    } while (true);

                    otherlv_12=(Token)match(input,22,FOLLOW_7); 

                    				newLeafNode(otherlv_12, grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_9_3());
                    			
                    otherlv_13=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_9_4());
                    			

                    }
                    break;

            }

            otherlv_14=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_14, grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_15=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_15, grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_11());
            		

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
    // $ANTLR end "ruleLocalizedEntry"


    // $ANTLR start "entryRuleLocalizedValue"
    // InternalProjectGenerator.g:856:1: entryRuleLocalizedValue returns [EObject current=null] : iv_ruleLocalizedValue= ruleLocalizedValue EOF ;
    public final EObject entryRuleLocalizedValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalizedValue = null;


        try {
            // InternalProjectGenerator.g:856:55: (iv_ruleLocalizedValue= ruleLocalizedValue EOF )
            // InternalProjectGenerator.g:857:2: iv_ruleLocalizedValue= ruleLocalizedValue EOF
            {
             newCompositeNode(grammarAccess.getLocalizedValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalizedValue=ruleLocalizedValue();

            state._fsp--;

             current =iv_ruleLocalizedValue; 
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
    // $ANTLR end "entryRuleLocalizedValue"


    // $ANTLR start "ruleLocalizedValue"
    // InternalProjectGenerator.g:863:1: ruleLocalizedValue returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' otherlv_8= ';' ) ;
    public final EObject ruleLocalizedValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Enumerator lv_locale_2_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:869:2: ( (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' otherlv_8= ';' ) )
            // InternalProjectGenerator.g:870:2: (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' otherlv_8= ';' )
            {
            // InternalProjectGenerator.g:870:2: (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' otherlv_8= ';' )
            // InternalProjectGenerator.g:871:3: otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' otherlv_8= ';'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalizedValueAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,34,FOLLOW_35); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalizedValueAccess().getLocaleKeyword_1());
            		
            // InternalProjectGenerator.g:879:3: ( (lv_locale_2_0= ruleLocale ) )
            // InternalProjectGenerator.g:880:4: (lv_locale_2_0= ruleLocale )
            {
            // InternalProjectGenerator.g:880:4: (lv_locale_2_0= ruleLocale )
            // InternalProjectGenerator.g:881:5: lv_locale_2_0= ruleLocale
            {

            					newCompositeNode(grammarAccess.getLocalizedValueAccess().getLocaleLocaleEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_locale_2_0=ruleLocale();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalizedValueRule());
            					}
            					set(
            						current,
            						"locale",
            						lv_locale_2_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Locale");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,19,FOLLOW_36); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,35,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalizedValueAccess().getValueKeyword_4());
            		
            // InternalProjectGenerator.g:906:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalProjectGenerator.g:907:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalProjectGenerator.g:907:4: (lv_value_5_0= RULE_STRING )
            // InternalProjectGenerator.g:908:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_5_0, grammarAccess.getLocalizedValueAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalizedValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_15); 

            			newLeafNode(otherlv_6, grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,22,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalizedValueAccess().getRightCurlyBracketKeyword_7());
            		
            otherlv_8=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_8());
            		

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
    // $ANTLR end "ruleLocalizedValue"


    // $ANTLR start "ruleLocale"
    // InternalProjectGenerator.g:940:1: ruleLocale returns [Enumerator current=null] : ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) ) ;
    public final Enumerator ruleLocale() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:946:2: ( ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) ) )
            // InternalProjectGenerator.g:947:2: ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) )
            {
            // InternalProjectGenerator.g:947:2: ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            else if ( (LA17_0==37) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalProjectGenerator.g:948:3: (enumLiteral_0= 'de_DE' )
                    {
                    // InternalProjectGenerator.g:948:3: (enumLiteral_0= 'de_DE' )
                    // InternalProjectGenerator.g:949:4: enumLiteral_0= 'de_DE'
                    {
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getLocaleAccess().getDE_DEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLocaleAccess().getDE_DEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:956:3: (enumLiteral_1= 'en_US' )
                    {
                    // InternalProjectGenerator.g:956:3: (enumLiteral_1= 'en_US' )
                    // InternalProjectGenerator.g:957:4: enumLiteral_1= 'en_US'
                    {
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getLocaleAccess().getEN_USEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLocaleAccess().getEN_USEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleLocale"


    // $ANTLR start "ruleBoolean"
    // InternalProjectGenerator.g:967:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:973:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalProjectGenerator.g:974:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalProjectGenerator.g:974:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==38) ) {
                alt18=1;
            }
            else if ( (LA18_0==39) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProjectGenerator.g:975:3: (enumLiteral_0= 'true' )
                    {
                    // InternalProjectGenerator.g:975:3: (enumLiteral_0= 'true' )
                    // InternalProjectGenerator.g:976:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:983:3: (enumLiteral_1= 'false' )
                    {
                    // InternalProjectGenerator.g:983:3: (enumLiteral_1= 'false' )
                    // InternalProjectGenerator.g:984:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleDuring"
    // InternalProjectGenerator.g:994:1: ruleDuring returns [Enumerator current=null] : ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) ) ;
    public final Enumerator ruleDuring() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:1000:2: ( ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) ) )
            // InternalProjectGenerator.g:1001:2: ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) )
            {
            // InternalProjectGenerator.g:1001:2: ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==40) ) {
                alt19=1;
            }
            else if ( (LA19_0==41) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalProjectGenerator.g:1002:3: (enumLiteral_0= 'InProgress' )
                    {
                    // InternalProjectGenerator.g:1002:3: (enumLiteral_0= 'InProgress' )
                    // InternalProjectGenerator.g:1003:4: enumLiteral_0= 'InProgress'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDuringAccess().getIN_PROGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDuringAccess().getIN_PROGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:1010:3: (enumLiteral_1= 'AfterCompleition' )
                    {
                    // InternalProjectGenerator.g:1010:3: (enumLiteral_1= 'AfterCompleition' )
                    // InternalProjectGenerator.g:1011:4: enumLiteral_1= 'AfterCompleition'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				current = grammarAccess.getDuringAccess().getAFTER_COMPLETIONEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDuringAccess().getAFTER_COMPLETIONEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleDuring"


    // $ANTLR start "ruleNotify"
    // InternalProjectGenerator.g:1021:1: ruleNotify returns [Enumerator current=null] : ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) ) ;
    public final Enumerator ruleNotify() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:1027:2: ( ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) ) )
            // InternalProjectGenerator.g:1028:2: ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) )
            {
            // InternalProjectGenerator.g:1028:2: ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==42) ) {
                alt20=1;
            }
            else if ( (LA20_0==43) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalProjectGenerator.g:1029:3: (enumLiteral_0= 'Always' )
                    {
                    // InternalProjectGenerator.g:1029:3: (enumLiteral_0= 'Always' )
                    // InternalProjectGenerator.g:1030:4: enumLiteral_0= 'Always'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getNotifyAccess().getALWAYSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotifyAccess().getALWAYSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:1037:3: (enumLiteral_1= 'Exists' )
                    {
                    // InternalProjectGenerator.g:1037:3: (enumLiteral_1= 'Exists' )
                    // InternalProjectGenerator.g:1038:4: enumLiteral_1= 'Exists'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

                    				current = grammarAccess.getNotifyAccess().getEXISTSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getNotifyAccess().getEXISTSEnumLiteralDeclaration_1());
                    			

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
    // $ANTLR end "ruleNotify"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001A00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040400000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100400000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000800000000L});

}