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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CLASSNAME", "RULE_METHODNAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'key'", "';'", "'cdiEnabled'", "'jpaConfig'", "'serviceConfig'", "'messageBundles'", "'}'", "','", "'messages'", "'observers'", "'observer'", "'type'", "'during'", "'notify'", "'delegate'", "'#'", "'localizedEnums'", "'localized'", "'name'", "'locales'", "'values'", "'locale'", "'entry'", "'argumtes'", "'value'", "'de_DE'", "'en_US'", "'true'", "'false'", "'InProgress'", "'AfterCompleition'", "'Always'", "'Exists'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_METHODNAME=7;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
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
    // InternalProjectGenerator.g:72:1: ruleModule returns [EObject current=null] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' otherlv_9= 'jpaConfig' ( (lv_jpaConfig_10_0= ruleJpaConfig ) ) otherlv_11= ';' otherlv_12= 'serviceConfig' ( (lv_serviceConfig_13_0= ruleServiceConfig ) ) otherlv_14= ';' (otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )* )? (otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+ )? otherlv_22= '}' ) ;
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
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Enumerator lv_cdiEnabled_7_0 = null;

        EObject lv_jpaConfig_10_0 = null;

        EObject lv_serviceConfig_13_0 = null;

        EObject lv_messageBundles_17_0 = null;

        EObject lv_messages_21_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:78:2: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' otherlv_9= 'jpaConfig' ( (lv_jpaConfig_10_0= ruleJpaConfig ) ) otherlv_11= ';' otherlv_12= 'serviceConfig' ( (lv_serviceConfig_13_0= ruleServiceConfig ) ) otherlv_14= ';' (otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )* )? (otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+ )? otherlv_22= '}' ) )
            // InternalProjectGenerator.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' otherlv_9= 'jpaConfig' ( (lv_jpaConfig_10_0= ruleJpaConfig ) ) otherlv_11= ';' otherlv_12= 'serviceConfig' ( (lv_serviceConfig_13_0= ruleServiceConfig ) ) otherlv_14= ';' (otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )* )? (otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+ )? otherlv_22= '}' )
            {
            // InternalProjectGenerator.g:79:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' otherlv_9= 'jpaConfig' ( (lv_jpaConfig_10_0= ruleJpaConfig ) ) otherlv_11= ';' otherlv_12= 'serviceConfig' ( (lv_serviceConfig_13_0= ruleServiceConfig ) ) otherlv_14= ';' (otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )* )? (otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+ )? otherlv_22= '}' )
            // InternalProjectGenerator.g:80:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' otherlv_9= 'jpaConfig' ( (lv_jpaConfig_10_0= ruleJpaConfig ) ) otherlv_11= ';' otherlv_12= 'serviceConfig' ( (lv_serviceConfig_13_0= ruleServiceConfig ) ) otherlv_14= ';' (otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )* )? (otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+ )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_6); 

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

            otherlv_5=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getModuleAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_9); 

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

            otherlv_8=(Token)match(input,16,FOLLOW_10); 

            			newLeafNode(otherlv_8, grammarAccess.getModuleAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,18,FOLLOW_4); 

            			newLeafNode(otherlv_9, grammarAccess.getModuleAccess().getJpaConfigKeyword_9());
            		
            // InternalProjectGenerator.g:163:3: ( (lv_jpaConfig_10_0= ruleJpaConfig ) )
            // InternalProjectGenerator.g:164:4: (lv_jpaConfig_10_0= ruleJpaConfig )
            {
            // InternalProjectGenerator.g:164:4: (lv_jpaConfig_10_0= ruleJpaConfig )
            // InternalProjectGenerator.g:165:5: lv_jpaConfig_10_0= ruleJpaConfig
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getJpaConfigJpaConfigParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_jpaConfig_10_0=ruleJpaConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"jpaConfig",
            						lv_jpaConfig_10_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.JpaConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_11); 

            			newLeafNode(otherlv_11, grammarAccess.getModuleAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,19,FOLLOW_4); 

            			newLeafNode(otherlv_12, grammarAccess.getModuleAccess().getServiceConfigKeyword_12());
            		
            // InternalProjectGenerator.g:190:3: ( (lv_serviceConfig_13_0= ruleServiceConfig ) )
            // InternalProjectGenerator.g:191:4: (lv_serviceConfig_13_0= ruleServiceConfig )
            {
            // InternalProjectGenerator.g:191:4: (lv_serviceConfig_13_0= ruleServiceConfig )
            // InternalProjectGenerator.g:192:5: lv_serviceConfig_13_0= ruleServiceConfig
            {

            					newCompositeNode(grammarAccess.getModuleAccess().getServiceConfigServiceConfigParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_7);
            lv_serviceConfig_13_0=ruleServiceConfig();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getModuleRule());
            					}
            					set(
            						current,
            						"serviceConfig",
            						lv_serviceConfig_13_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.ServiceConfig");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,16,FOLLOW_12); 

            			newLeafNode(otherlv_14, grammarAccess.getModuleAccess().getSemicolonKeyword_14());
            		
            // InternalProjectGenerator.g:213:3: (otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectGenerator.g:214:4: otherlv_15= 'messageBundles' otherlv_16= '{' ( (lv_messageBundles_17_0= ruleLocalized ) )+ otherlv_18= '}' (otherlv_19= ',' )*
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_4); 

                    				newLeafNode(otherlv_15, grammarAccess.getModuleAccess().getMessageBundlesKeyword_15_0());
                    			
                    otherlv_16=(Token)match(input,14,FOLLOW_13); 

                    				newLeafNode(otherlv_16, grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_15_1());
                    			
                    // InternalProjectGenerator.g:222:4: ( (lv_messageBundles_17_0= ruleLocalized ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==32) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:223:5: (lv_messageBundles_17_0= ruleLocalized )
                    	    {
                    	    // InternalProjectGenerator.g:223:5: (lv_messageBundles_17_0= ruleLocalized )
                    	    // InternalProjectGenerator.g:224:6: lv_messageBundles_17_0= ruleLocalized
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleAccess().getMessageBundlesLocalizedParserRuleCall_15_2_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_messageBundles_17_0=ruleLocalized();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"messageBundles",
                    	    							lv_messageBundles_17_0,
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

                    otherlv_18=(Token)match(input,21,FOLLOW_15); 

                    				newLeafNode(otherlv_18, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_15_3());
                    			
                    // InternalProjectGenerator.g:245:4: (otherlv_19= ',' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==22) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:246:5: otherlv_19= ','
                    	    {
                    	    otherlv_19=(Token)match(input,22,FOLLOW_15); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getModuleAccess().getCommaKeyword_15_4());
                    	    				

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalProjectGenerator.g:252:3: (otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+ )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProjectGenerator.g:253:4: otherlv_20= 'messages' ( (lv_messages_21_0= ruleLocalized ) )+
                    {
                    otherlv_20=(Token)match(input,23,FOLLOW_13); 

                    				newLeafNode(otherlv_20, grammarAccess.getModuleAccess().getMessagesKeyword_16_0());
                    			
                    // InternalProjectGenerator.g:257:4: ( (lv_messages_21_0= ruleLocalized ) )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==32) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:258:5: (lv_messages_21_0= ruleLocalized )
                    	    {
                    	    // InternalProjectGenerator.g:258:5: (lv_messages_21_0= ruleLocalized )
                    	    // InternalProjectGenerator.g:259:6: lv_messages_21_0= ruleLocalized
                    	    {

                    	    						newCompositeNode(grammarAccess.getModuleAccess().getMessagesLocalizedParserRuleCall_16_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_messages_21_0=ruleLocalized();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getModuleRule());
                    	    						}
                    	    						set(
                    	    							current,
                    	    							"messages",
                    	    							lv_messages_21_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Localized");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;

            }

            otherlv_22=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalProjectGenerator.g:285:1: entryRuleServiceConfig returns [EObject current=null] : iv_ruleServiceConfig= ruleServiceConfig EOF ;
    public final EObject entryRuleServiceConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleServiceConfig = null;


        try {
            // InternalProjectGenerator.g:285:54: (iv_ruleServiceConfig= ruleServiceConfig EOF )
            // InternalProjectGenerator.g:286:2: iv_ruleServiceConfig= ruleServiceConfig EOF
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
    // InternalProjectGenerator.g:292:1: ruleServiceConfig returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? otherlv_3= '}' ) ;
    public final EObject ruleServiceConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_observers_2_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:298:2: ( (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? otherlv_3= '}' ) )
            // InternalProjectGenerator.g:299:2: (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? otherlv_3= '}' )
            {
            // InternalProjectGenerator.g:299:2: (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? otherlv_3= '}' )
            // InternalProjectGenerator.g:300:3: otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalProjectGenerator.g:304:3: (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalProjectGenerator.g:305:4: otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+
                    {
                    otherlv_1=(Token)match(input,24,FOLLOW_17); 

                    				newLeafNode(otherlv_1, grammarAccess.getServiceConfigAccess().getObserversKeyword_1_0());
                    			
                    // InternalProjectGenerator.g:309:4: ( (lv_observers_2_0= ruleObserver ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==25) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:310:5: (lv_observers_2_0= ruleObserver )
                    	    {
                    	    // InternalProjectGenerator.g:310:5: (lv_observers_2_0= ruleObserver )
                    	    // InternalProjectGenerator.g:311:6: lv_observers_2_0= ruleObserver
                    	    {

                    	    						newCompositeNode(grammarAccess.getServiceConfigAccess().getObserversObserverParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_18);
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
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalProjectGenerator.g:337:1: entryRuleObserver returns [EObject current=null] : iv_ruleObserver= ruleObserver EOF ;
    public final EObject entryRuleObserver() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObserver = null;


        try {
            // InternalProjectGenerator.g:337:49: (iv_ruleObserver= ruleObserver EOF )
            // InternalProjectGenerator.g:338:2: iv_ruleObserver= ruleObserver EOF
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
    // InternalProjectGenerator.g:344:1: ruleObserver returns [EObject current=null] : (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'during' ( (lv_during_7_0= ruleDuring ) ) otherlv_8= ';' otherlv_9= 'notify' ( (lv_notify_10_0= ruleNotify ) ) otherlv_11= ';' otherlv_12= 'delegate' ( (lv_className_13_0= RULE_CLASSNAME ) ) otherlv_14= '#' this_MethodName_15= RULE_METHODNAME otherlv_16= ';' otherlv_17= '}' ) ;
    public final EObject ruleObserver() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_type_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_className_13_0=null;
        Token otherlv_14=null;
        Token this_MethodName_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Enumerator lv_during_7_0 = null;

        Enumerator lv_notify_10_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:350:2: ( (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'during' ( (lv_during_7_0= ruleDuring ) ) otherlv_8= ';' otherlv_9= 'notify' ( (lv_notify_10_0= ruleNotify ) ) otherlv_11= ';' otherlv_12= 'delegate' ( (lv_className_13_0= RULE_CLASSNAME ) ) otherlv_14= '#' this_MethodName_15= RULE_METHODNAME otherlv_16= ';' otherlv_17= '}' ) )
            // InternalProjectGenerator.g:351:2: (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'during' ( (lv_during_7_0= ruleDuring ) ) otherlv_8= ';' otherlv_9= 'notify' ( (lv_notify_10_0= ruleNotify ) ) otherlv_11= ';' otherlv_12= 'delegate' ( (lv_className_13_0= RULE_CLASSNAME ) ) otherlv_14= '#' this_MethodName_15= RULE_METHODNAME otherlv_16= ';' otherlv_17= '}' )
            {
            // InternalProjectGenerator.g:351:2: (otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'during' ( (lv_during_7_0= ruleDuring ) ) otherlv_8= ';' otherlv_9= 'notify' ( (lv_notify_10_0= ruleNotify ) ) otherlv_11= ';' otherlv_12= 'delegate' ( (lv_className_13_0= RULE_CLASSNAME ) ) otherlv_14= '#' this_MethodName_15= RULE_METHODNAME otherlv_16= ';' otherlv_17= '}' )
            // InternalProjectGenerator.g:352:3: otherlv_0= 'observer' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'type' ( (lv_type_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'during' ( (lv_during_7_0= ruleDuring ) ) otherlv_8= ';' otherlv_9= 'notify' ( (lv_notify_10_0= ruleNotify ) ) otherlv_11= ';' otherlv_12= 'delegate' ( (lv_className_13_0= RULE_CLASSNAME ) ) otherlv_14= '#' this_MethodName_15= RULE_METHODNAME otherlv_16= ';' otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getObserverAccess().getObserverKeyword_0());
            		
            // InternalProjectGenerator.g:356:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectGenerator.g:357:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectGenerator.g:357:4: (lv_name_1_0= RULE_ID )
            // InternalProjectGenerator.g:358:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getObserverAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_19); 

            			newLeafNode(otherlv_2, grammarAccess.getObserverAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getObserverAccess().getTypeKeyword_3());
            		
            // InternalProjectGenerator.g:382:3: ( (lv_type_4_0= RULE_STRING ) )
            // InternalProjectGenerator.g:383:4: (lv_type_4_0= RULE_STRING )
            {
            // InternalProjectGenerator.g:383:4: (lv_type_4_0= RULE_STRING )
            // InternalProjectGenerator.g:384:5: lv_type_4_0= RULE_STRING
            {
            lv_type_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_type_4_0, grammarAccess.getObserverAccess().getTypeSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_20); 

            			newLeafNode(otherlv_5, grammarAccess.getObserverAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,27,FOLLOW_21); 

            			newLeafNode(otherlv_6, grammarAccess.getObserverAccess().getDuringKeyword_6());
            		
            // InternalProjectGenerator.g:408:3: ( (lv_during_7_0= ruleDuring ) )
            // InternalProjectGenerator.g:409:4: (lv_during_7_0= ruleDuring )
            {
            // InternalProjectGenerator.g:409:4: (lv_during_7_0= ruleDuring )
            // InternalProjectGenerator.g:410:5: lv_during_7_0= ruleDuring
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getDuringDuringEnumRuleCall_7_0());
            				
            pushFollow(FOLLOW_7);
            lv_during_7_0=ruleDuring();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					set(
            						current,
            						"during",
            						lv_during_7_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.During");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,16,FOLLOW_22); 

            			newLeafNode(otherlv_8, grammarAccess.getObserverAccess().getSemicolonKeyword_8());
            		
            otherlv_9=(Token)match(input,28,FOLLOW_23); 

            			newLeafNode(otherlv_9, grammarAccess.getObserverAccess().getNotifyKeyword_9());
            		
            // InternalProjectGenerator.g:435:3: ( (lv_notify_10_0= ruleNotify ) )
            // InternalProjectGenerator.g:436:4: (lv_notify_10_0= ruleNotify )
            {
            // InternalProjectGenerator.g:436:4: (lv_notify_10_0= ruleNotify )
            // InternalProjectGenerator.g:437:5: lv_notify_10_0= ruleNotify
            {

            					newCompositeNode(grammarAccess.getObserverAccess().getNotifyNotifyEnumRuleCall_10_0());
            				
            pushFollow(FOLLOW_7);
            lv_notify_10_0=ruleNotify();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getObserverRule());
            					}
            					set(
            						current,
            						"notify",
            						lv_notify_10_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Notify");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_11, grammarAccess.getObserverAccess().getSemicolonKeyword_11());
            		
            otherlv_12=(Token)match(input,29,FOLLOW_25); 

            			newLeafNode(otherlv_12, grammarAccess.getObserverAccess().getDelegateKeyword_12());
            		
            // InternalProjectGenerator.g:462:3: ( (lv_className_13_0= RULE_CLASSNAME ) )
            // InternalProjectGenerator.g:463:4: (lv_className_13_0= RULE_CLASSNAME )
            {
            // InternalProjectGenerator.g:463:4: (lv_className_13_0= RULE_CLASSNAME )
            // InternalProjectGenerator.g:464:5: lv_className_13_0= RULE_CLASSNAME
            {
            lv_className_13_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_26); 

            					newLeafNode(lv_className_13_0, grammarAccess.getObserverAccess().getClassNameClassNameTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObserverRule());
            					}
            					setWithLastConsumed(
            						current,
            						"className",
            						lv_className_13_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.ClassName");
            				

            }


            }

            otherlv_14=(Token)match(input,30,FOLLOW_27); 

            			newLeafNode(otherlv_14, grammarAccess.getObserverAccess().getNumberSignKeyword_14());
            		
            this_MethodName_15=(Token)match(input,RULE_METHODNAME,FOLLOW_7); 

            			newLeafNode(this_MethodName_15, grammarAccess.getObserverAccess().getMethodNameTerminalRuleCall_15());
            		
            otherlv_16=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_16, grammarAccess.getObserverAccess().getSemicolonKeyword_16());
            		
            otherlv_17=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_17, grammarAccess.getObserverAccess().getRightCurlyBracketKeyword_17());
            		

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
    // InternalProjectGenerator.g:500:1: entryRuleJpaConfig returns [EObject current=null] : iv_ruleJpaConfig= ruleJpaConfig EOF ;
    public final EObject entryRuleJpaConfig() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJpaConfig = null;


        try {
            // InternalProjectGenerator.g:500:50: (iv_ruleJpaConfig= ruleJpaConfig EOF )
            // InternalProjectGenerator.g:501:2: iv_ruleJpaConfig= ruleJpaConfig EOF
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
    // InternalProjectGenerator.g:507:1: ruleJpaConfig returns [EObject current=null] : (otherlv_0= '{' (otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+ )? otherlv_3= '}' ) ;
    public final EObject ruleJpaConfig() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_localizedEnums_2_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:513:2: ( (otherlv_0= '{' (otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+ )? otherlv_3= '}' ) )
            // InternalProjectGenerator.g:514:2: (otherlv_0= '{' (otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+ )? otherlv_3= '}' )
            {
            // InternalProjectGenerator.g:514:2: (otherlv_0= '{' (otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+ )? otherlv_3= '}' )
            // InternalProjectGenerator.g:515:3: otherlv_0= '{' (otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+ )? otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalProjectGenerator.g:519:3: (otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+ )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProjectGenerator.g:520:4: otherlv_1= 'localizedEnums' ( (lv_localizedEnums_2_0= ruleLocalized ) )+
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_13); 

                    				newLeafNode(otherlv_1, grammarAccess.getJpaConfigAccess().getLocalizedEnumsKeyword_1_0());
                    			
                    // InternalProjectGenerator.g:524:4: ( (lv_localizedEnums_2_0= ruleLocalized ) )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==32) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:525:5: (lv_localizedEnums_2_0= ruleLocalized )
                    	    {
                    	    // InternalProjectGenerator.g:525:5: (lv_localizedEnums_2_0= ruleLocalized )
                    	    // InternalProjectGenerator.g:526:6: lv_localizedEnums_2_0= ruleLocalized
                    	    {

                    	    						newCompositeNode(grammarAccess.getJpaConfigAccess().getLocalizedEnumsLocalizedParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_14);
                    	    lv_localizedEnums_2_0=ruleLocalized();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getJpaConfigRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"localizedEnums",
                    	    							lv_localizedEnums_2_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Localized");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    }
                    break;

            }

            otherlv_3=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_2());
            		

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
    // InternalProjectGenerator.g:552:1: entryRuleLocalized returns [EObject current=null] : iv_ruleLocalized= ruleLocalized EOF ;
    public final EObject entryRuleLocalized() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalized = null;


        try {
            // InternalProjectGenerator.g:552:50: (iv_ruleLocalized= ruleLocalized EOF )
            // InternalProjectGenerator.g:553:2: iv_ruleLocalized= ruleLocalized EOF
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
    // InternalProjectGenerator.g:559:1: ruleLocalized returns [EObject current=null] : (otherlv_0= 'localized' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'locales' ( (lv_locales_7_0= ruleLocale ) )+ otherlv_8= ';' (otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';' )? otherlv_12= '}' ) ;
    public final EObject ruleLocalized() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Enumerator lv_locales_7_0 = null;

        EObject lv_values_10_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:565:2: ( (otherlv_0= 'localized' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'locales' ( (lv_locales_7_0= ruleLocale ) )+ otherlv_8= ';' (otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';' )? otherlv_12= '}' ) )
            // InternalProjectGenerator.g:566:2: (otherlv_0= 'localized' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'locales' ( (lv_locales_7_0= ruleLocale ) )+ otherlv_8= ';' (otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';' )? otherlv_12= '}' )
            {
            // InternalProjectGenerator.g:566:2: (otherlv_0= 'localized' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'locales' ( (lv_locales_7_0= ruleLocale ) )+ otherlv_8= ';' (otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';' )? otherlv_12= '}' )
            // InternalProjectGenerator.g:567:3: otherlv_0= 'localized' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'name' ( (lv_name_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'locales' ( (lv_locales_7_0= ruleLocale ) )+ otherlv_8= ';' (otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalizedAccess().getLocalizedKeyword_0());
            		
            // InternalProjectGenerator.g:571:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalProjectGenerator.g:572:4: (lv_name_1_0= RULE_ID )
            {
            // InternalProjectGenerator.g:572:4: (lv_name_1_0= RULE_ID )
            // InternalProjectGenerator.g:573:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalizedAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalizedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_30); 

            			newLeafNode(otherlv_2, grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,33,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalizedAccess().getNameKeyword_3());
            		
            // InternalProjectGenerator.g:597:3: ( (lv_name_4_0= RULE_STRING ) )
            // InternalProjectGenerator.g:598:4: (lv_name_4_0= RULE_STRING )
            {
            // InternalProjectGenerator.g:598:4: (lv_name_4_0= RULE_STRING )
            // InternalProjectGenerator.g:599:5: lv_name_4_0= RULE_STRING
            {
            lv_name_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_name_4_0, grammarAccess.getLocalizedAccess().getNameSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalizedRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_31); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalizedAccess().getSemicolonKeyword_5());
            		
            otherlv_6=(Token)match(input,34,FOLLOW_32); 

            			newLeafNode(otherlv_6, grammarAccess.getLocalizedAccess().getLocalesKeyword_6());
            		
            // InternalProjectGenerator.g:623:3: ( (lv_locales_7_0= ruleLocale ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=40 && LA10_0<=41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProjectGenerator.g:624:4: (lv_locales_7_0= ruleLocale )
            	    {
            	    // InternalProjectGenerator.g:624:4: (lv_locales_7_0= ruleLocale )
            	    // InternalProjectGenerator.g:625:5: lv_locales_7_0= ruleLocale
            	    {

            	    					newCompositeNode(grammarAccess.getLocalizedAccess().getLocalesLocaleEnumRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_locales_7_0=ruleLocale();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocalizedRule());
            	    					}
            	    					add(
            	    						current,
            	    						"locales",
            	    						lv_locales_7_0,
            	    						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Locale");
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

            otherlv_8=(Token)match(input,16,FOLLOW_34); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalizedAccess().getSemicolonKeyword_8());
            		
            // InternalProjectGenerator.g:646:3: (otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalProjectGenerator.g:647:4: otherlv_9= 'values' ( (lv_values_10_0= ruleLocalizedEntry ) )+ otherlv_11= ';'
                    {
                    otherlv_9=(Token)match(input,35,FOLLOW_4); 

                    				newLeafNode(otherlv_9, grammarAccess.getLocalizedAccess().getValuesKeyword_9_0());
                    			
                    // InternalProjectGenerator.g:651:4: ( (lv_values_10_0= ruleLocalizedEntry ) )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==14) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:652:5: (lv_values_10_0= ruleLocalizedEntry )
                    	    {
                    	    // InternalProjectGenerator.g:652:5: (lv_values_10_0= ruleLocalizedEntry )
                    	    // InternalProjectGenerator.g:653:6: lv_values_10_0= ruleLocalizedEntry
                    	    {

                    	    						newCompositeNode(grammarAccess.getLocalizedAccess().getValuesLocalizedEntryParserRuleCall_9_1_0());
                    	    					
                    	    pushFollow(FOLLOW_35);
                    	    lv_values_10_0=ruleLocalizedEntry();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLocalizedRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"values",
                    	    							lv_values_10_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.LocalizedEntry");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);

                    otherlv_11=(Token)match(input,16,FOLLOW_28); 

                    				newLeafNode(otherlv_11, grammarAccess.getLocalizedAccess().getSemicolonKeyword_9_2());
                    			

                    }
                    break;

            }

            otherlv_12=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_10());
            		

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
    // InternalProjectGenerator.g:683:1: entryRuleLocalizedEntry returns [EObject current=null] : iv_ruleLocalizedEntry= ruleLocalizedEntry EOF ;
    public final EObject entryRuleLocalizedEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalizedEntry = null;


        try {
            // InternalProjectGenerator.g:683:55: (iv_ruleLocalizedEntry= ruleLocalizedEntry EOF )
            // InternalProjectGenerator.g:684:2: iv_ruleLocalizedEntry= ruleLocalizedEntry EOF
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
    // InternalProjectGenerator.g:690:1: ruleLocalizedEntry returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'entry' ( (lv_entry_5_0= ruleKeyValuePair ) ) otherlv_6= ';' (otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+ )? otherlv_9= '}' ) ;
    public final EObject ruleLocalizedEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Enumerator lv_locale_2_0 = null;

        EObject lv_entry_5_0 = null;

        EObject lv_arguments_8_0 = null;



        	enterRule();

        try {
            // InternalProjectGenerator.g:696:2: ( (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'entry' ( (lv_entry_5_0= ruleKeyValuePair ) ) otherlv_6= ';' (otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+ )? otherlv_9= '}' ) )
            // InternalProjectGenerator.g:697:2: (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'entry' ( (lv_entry_5_0= ruleKeyValuePair ) ) otherlv_6= ';' (otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+ )? otherlv_9= '}' )
            {
            // InternalProjectGenerator.g:697:2: (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'entry' ( (lv_entry_5_0= ruleKeyValuePair ) ) otherlv_6= ';' (otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+ )? otherlv_9= '}' )
            // InternalProjectGenerator.g:698:3: otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'entry' ( (lv_entry_5_0= ruleKeyValuePair ) ) otherlv_6= ';' (otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+ )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,36,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalizedEntryAccess().getLocaleKeyword_1());
            		
            // InternalProjectGenerator.g:706:3: ( (lv_locale_2_0= ruleLocale ) )
            // InternalProjectGenerator.g:707:4: (lv_locale_2_0= ruleLocale )
            {
            // InternalProjectGenerator.g:707:4: (lv_locale_2_0= ruleLocale )
            // InternalProjectGenerator.g:708:5: lv_locale_2_0= ruleLocale
            {

            					newCompositeNode(grammarAccess.getLocalizedEntryAccess().getLocaleLocaleEnumRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_locale_2_0=ruleLocale();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalizedEntryRule());
            					}
            					set(
            						current,
            						"locale",
            						lv_locale_2_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.Locale");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_37); 

            			newLeafNode(otherlv_3, grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,37,FOLLOW_4); 

            			newLeafNode(otherlv_4, grammarAccess.getLocalizedEntryAccess().getEntryKeyword_4());
            		
            // InternalProjectGenerator.g:733:3: ( (lv_entry_5_0= ruleKeyValuePair ) )
            // InternalProjectGenerator.g:734:4: (lv_entry_5_0= ruleKeyValuePair )
            {
            // InternalProjectGenerator.g:734:4: (lv_entry_5_0= ruleKeyValuePair )
            // InternalProjectGenerator.g:735:5: lv_entry_5_0= ruleKeyValuePair
            {

            					newCompositeNode(grammarAccess.getLocalizedEntryAccess().getEntryKeyValuePairParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_entry_5_0=ruleKeyValuePair();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalizedEntryRule());
            					}
            					set(
            						current,
            						"entry",
            						lv_entry_5_0,
            						"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.KeyValuePair");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_38); 

            			newLeafNode(otherlv_6, grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_6());
            		
            // InternalProjectGenerator.g:756:3: (otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+ )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==38) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalProjectGenerator.g:757:4: otherlv_7= 'argumtes' ( (lv_arguments_8_0= ruleKeyValuePair ) )+
                    {
                    otherlv_7=(Token)match(input,38,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocalizedEntryAccess().getArgumtesKeyword_7_0());
                    			
                    // InternalProjectGenerator.g:761:4: ( (lv_arguments_8_0= ruleKeyValuePair ) )+
                    int cnt13=0;
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:762:5: (lv_arguments_8_0= ruleKeyValuePair )
                    	    {
                    	    // InternalProjectGenerator.g:762:5: (lv_arguments_8_0= ruleKeyValuePair )
                    	    // InternalProjectGenerator.g:763:6: lv_arguments_8_0= ruleKeyValuePair
                    	    {

                    	    						newCompositeNode(grammarAccess.getLocalizedEntryAccess().getArgumentsKeyValuePairParserRuleCall_7_1_0());
                    	    					
                    	    pushFollow(FOLLOW_39);
                    	    lv_arguments_8_0=ruleKeyValuePair();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getLocalizedEntryRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"arguments",
                    	    							lv_arguments_8_0,
                    	    							"at.ooe.fh.mdm.herzog.dsl.proj.ProjectGenerator.KeyValuePair");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt13 >= 1 ) break loop13;
                                EarlyExitException eee =
                                    new EarlyExitException(13, input);
                                throw eee;
                        }
                        cnt13++;
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_8());
            		

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


    // $ANTLR start "entryRuleKeyValuePair"
    // InternalProjectGenerator.g:789:1: entryRuleKeyValuePair returns [EObject current=null] : iv_ruleKeyValuePair= ruleKeyValuePair EOF ;
    public final EObject entryRuleKeyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleKeyValuePair = null;


        try {
            // InternalProjectGenerator.g:789:53: (iv_ruleKeyValuePair= ruleKeyValuePair EOF )
            // InternalProjectGenerator.g:790:2: iv_ruleKeyValuePair= ruleKeyValuePair EOF
            {
             newCompositeNode(grammarAccess.getKeyValuePairRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleKeyValuePair=ruleKeyValuePair();

            state._fsp--;

             current =iv_ruleKeyValuePair; 
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
    // $ANTLR end "entryRuleKeyValuePair"


    // $ANTLR start "ruleKeyValuePair"
    // InternalProjectGenerator.g:796:1: ruleKeyValuePair returns [EObject current=null] : (otherlv_0= '{' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) ;
    public final EObject ruleKeyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_key_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:802:2: ( (otherlv_0= '{' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // InternalProjectGenerator.g:803:2: (otherlv_0= '{' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // InternalProjectGenerator.g:803:2: (otherlv_0= '{' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            // InternalProjectGenerator.g:804:3: otherlv_0= '{' otherlv_1= 'key' ( (lv_key_2_0= RULE_STRING ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_value_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getKeyValuePairAccess().getLeftCurlyBracketKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getKeyValuePairAccess().getKeyKeyword_1());
            		
            // InternalProjectGenerator.g:812:3: ( (lv_key_2_0= RULE_STRING ) )
            // InternalProjectGenerator.g:813:4: (lv_key_2_0= RULE_STRING )
            {
            // InternalProjectGenerator.g:813:4: (lv_key_2_0= RULE_STRING )
            // InternalProjectGenerator.g:814:5: lv_key_2_0= RULE_STRING
            {
            lv_key_2_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_key_2_0, grammarAccess.getKeyValuePairAccess().getKeySTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValuePairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"key",
            						lv_key_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_40); 

            			newLeafNode(otherlv_3, grammarAccess.getKeyValuePairAccess().getSemicolonKeyword_3());
            		
            otherlv_4=(Token)match(input,39,FOLLOW_6); 

            			newLeafNode(otherlv_4, grammarAccess.getKeyValuePairAccess().getValueKeyword_4());
            		
            // InternalProjectGenerator.g:838:3: ( (lv_value_5_0= RULE_STRING ) )
            // InternalProjectGenerator.g:839:4: (lv_value_5_0= RULE_STRING )
            {
            // InternalProjectGenerator.g:839:4: (lv_value_5_0= RULE_STRING )
            // InternalProjectGenerator.g:840:5: lv_value_5_0= RULE_STRING
            {
            lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					newLeafNode(lv_value_5_0, grammarAccess.getKeyValuePairAccess().getValueSTRINGTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getKeyValuePairRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_28); 

            			newLeafNode(otherlv_6, grammarAccess.getKeyValuePairAccess().getSemicolonKeyword_6());
            		
            otherlv_7=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getKeyValuePairAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleKeyValuePair"


    // $ANTLR start "ruleLocale"
    // InternalProjectGenerator.g:868:1: ruleLocale returns [Enumerator current=null] : ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) ) ;
    public final Enumerator ruleLocale() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:874:2: ( ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) ) )
            // InternalProjectGenerator.g:875:2: ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) )
            {
            // InternalProjectGenerator.g:875:2: ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==40) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalProjectGenerator.g:876:3: (enumLiteral_0= 'de_DE' )
                    {
                    // InternalProjectGenerator.g:876:3: (enumLiteral_0= 'de_DE' )
                    // InternalProjectGenerator.g:877:4: enumLiteral_0= 'de_DE'
                    {
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getLocaleAccess().getDE_DEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLocaleAccess().getDE_DEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:884:3: (enumLiteral_1= 'en_US' )
                    {
                    // InternalProjectGenerator.g:884:3: (enumLiteral_1= 'en_US' )
                    // InternalProjectGenerator.g:885:4: enumLiteral_1= 'en_US'
                    {
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

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
    // InternalProjectGenerator.g:895:1: ruleBoolean returns [Enumerator current=null] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Enumerator ruleBoolean() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:901:2: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // InternalProjectGenerator.g:902:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // InternalProjectGenerator.g:902:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==42) ) {
                alt16=1;
            }
            else if ( (LA16_0==43) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalProjectGenerator.g:903:3: (enumLiteral_0= 'true' )
                    {
                    // InternalProjectGenerator.g:903:3: (enumLiteral_0= 'true' )
                    // InternalProjectGenerator.g:904:4: enumLiteral_0= 'true'
                    {
                    enumLiteral_0=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:911:3: (enumLiteral_1= 'false' )
                    {
                    // InternalProjectGenerator.g:911:3: (enumLiteral_1= 'false' )
                    // InternalProjectGenerator.g:912:4: enumLiteral_1= 'false'
                    {
                    enumLiteral_1=(Token)match(input,43,FOLLOW_2); 

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
    // InternalProjectGenerator.g:922:1: ruleDuring returns [Enumerator current=null] : ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) ) ;
    public final Enumerator ruleDuring() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:928:2: ( ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) ) )
            // InternalProjectGenerator.g:929:2: ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) )
            {
            // InternalProjectGenerator.g:929:2: ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==44) ) {
                alt17=1;
            }
            else if ( (LA17_0==45) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalProjectGenerator.g:930:3: (enumLiteral_0= 'InProgress' )
                    {
                    // InternalProjectGenerator.g:930:3: (enumLiteral_0= 'InProgress' )
                    // InternalProjectGenerator.g:931:4: enumLiteral_0= 'InProgress'
                    {
                    enumLiteral_0=(Token)match(input,44,FOLLOW_2); 

                    				current = grammarAccess.getDuringAccess().getIN_PROGEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDuringAccess().getIN_PROGEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:938:3: (enumLiteral_1= 'AfterCompleition' )
                    {
                    // InternalProjectGenerator.g:938:3: (enumLiteral_1= 'AfterCompleition' )
                    // InternalProjectGenerator.g:939:4: enumLiteral_1= 'AfterCompleition'
                    {
                    enumLiteral_1=(Token)match(input,45,FOLLOW_2); 

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
    // InternalProjectGenerator.g:949:1: ruleNotify returns [Enumerator current=null] : ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) ) ;
    public final Enumerator ruleNotify() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalProjectGenerator.g:955:2: ( ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) ) )
            // InternalProjectGenerator.g:956:2: ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) )
            {
            // InternalProjectGenerator.g:956:2: ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==46) ) {
                alt18=1;
            }
            else if ( (LA18_0==47) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalProjectGenerator.g:957:3: (enumLiteral_0= 'Always' )
                    {
                    // InternalProjectGenerator.g:957:3: (enumLiteral_0= 'Always' )
                    // InternalProjectGenerator.g:958:4: enumLiteral_0= 'Always'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getNotifyAccess().getALWAYSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getNotifyAccess().getALWAYSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:965:3: (enumLiteral_1= 'Exists' )
                    {
                    // InternalProjectGenerator.g:965:3: (enumLiteral_1= 'Exists' )
                    // InternalProjectGenerator.g:966:4: enumLiteral_1= 'Exists'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000B00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000100200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000080200000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000030000010000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004000200000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008000000000L});

}