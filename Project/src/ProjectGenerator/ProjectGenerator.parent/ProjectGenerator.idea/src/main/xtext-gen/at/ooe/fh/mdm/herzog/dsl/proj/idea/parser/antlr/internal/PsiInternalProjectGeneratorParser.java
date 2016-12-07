package at.ooe.fh.mdm.herzog.dsl.proj.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import at.ooe.fh.mdm.herzog.dsl.proj.idea.lang.ProjectGeneratorElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import at.ooe.fh.mdm.herzog.dsl.proj.services.ProjectGeneratorGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalProjectGeneratorParser extends AbstractPsiAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CLASSNAME", "RULE_LOCALIZEDKEY", "RULE_METHODNAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'key'", "';'", "'cdiEnabled'", "'messageBundles'", "'}'", "'observers'", "'jpaConfig'", "'serviceConfig'", "'type'", "'during'", "'notify'", "'delegate'", "'qualifier'", "'localizedEnums'", "'values'", "'args'", "'locale'", "'value'", "'de_DE'", "'en_US'", "'true'", "'false'", "'InProgress'", "'AfterCompleition'", "'Always'", "'Exists'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int RULE_CLASSNAME=6;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_METHODNAME=8;
    public static final int RULE_ID=4;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_LOCALIZEDKEY=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public PsiInternalProjectGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalProjectGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalProjectGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalProjectGenerator.g"; }



    	protected ProjectGeneratorGrammarAccess grammarAccess;

    	protected ProjectGeneratorElementTypeProvider elementTypeProvider;

    	public PsiInternalProjectGeneratorParser(PsiBuilder builder, TokenStream input, ProjectGeneratorElementTypeProvider elementTypeProvider, ProjectGeneratorGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
        	this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Module";
    	}




    // $ANTLR start "entryRuleModule"
    // PsiInternalProjectGenerator.g:52:1: entryRuleModule returns [Boolean current=false] : iv_ruleModule= ruleModule EOF ;
    public final Boolean entryRuleModule() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleModule = null;


        try {
            // PsiInternalProjectGenerator.g:52:48: (iv_ruleModule= ruleModule EOF )
            // PsiInternalProjectGenerator.g:53:2: iv_ruleModule= ruleModule EOF
            {
             markComposite(elementTypeProvider.getModuleElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleModule=ruleModule();

            state._fsp--;

             current =iv_ruleModule; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // PsiInternalProjectGenerator.g:59:1: ruleModule returns [Boolean current=false] : (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' ) ;
    public final Boolean ruleModule() throws RecognitionException {
        Boolean current = false;

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
        Boolean lv_cdiEnabled_7_0 = null;

        Boolean lv_messageBundles_11_0 = null;

        Boolean lv_observers_16_0 = null;

        Boolean lv_jpaConfig_20_0 = null;

        Boolean lv_serviceConfig_23_0 = null;


        try {
            // PsiInternalProjectGenerator.g:60:1: ( (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' ) )
            // PsiInternalProjectGenerator.g:61:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' )
            {
            // PsiInternalProjectGenerator.g:61:2: (otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}' )
            // PsiInternalProjectGenerator.g:62:3: otherlv_0= 'module' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'key' ( (lv_key_4_0= RULE_STRING ) ) otherlv_5= ';' otherlv_6= 'cdiEnabled' ( (lv_cdiEnabled_7_0= ruleBoolean ) ) otherlv_8= ';' (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )? (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )? otherlv_19= 'jpaConfig' ( (lv_jpaConfig_20_0= ruleJpaConfig ) ) otherlv_21= ';' otherlv_22= 'serviceConfig' ( (lv_serviceConfig_23_0= ruleServiceConfig ) ) otherlv_24= ';' otherlv_25= '}'
            {

            			markLeaf(elementTypeProvider.getModule_ModuleKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalProjectGenerator.g:69:3: ( (lv_name_1_0= RULE_ID ) )
            // PsiInternalProjectGenerator.g:70:4: (lv_name_1_0= RULE_ID )
            {
            // PsiInternalProjectGenerator.g:70:4: (lv_name_1_0= RULE_ID )
            // PsiInternalProjectGenerator.g:71:5: lv_name_1_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getModule_NameIDTerminalRuleCall_1_0ElementType());
            				
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_1_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getModule_LeftCurlyBracketKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,15,FOLLOW_5); 

            			doneLeaf(otherlv_2);
            		

            			markLeaf(elementTypeProvider.getModule_KeyKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,16,FOLLOW_6); 

            			doneLeaf(otherlv_3);
            		
            // PsiInternalProjectGenerator.g:100:3: ( (lv_key_4_0= RULE_STRING ) )
            // PsiInternalProjectGenerator.g:101:4: (lv_key_4_0= RULE_STRING )
            {
            // PsiInternalProjectGenerator.g:101:4: (lv_key_4_0= RULE_STRING )
            // PsiInternalProjectGenerator.g:102:5: lv_key_4_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getModule_KeySTRINGTerminalRuleCall_4_0ElementType());
            				
            lv_key_4_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_key_4_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getModule_SemicolonKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,17,FOLLOW_8); 

            			doneLeaf(otherlv_5);
            		

            			markLeaf(elementTypeProvider.getModule_CdiEnabledKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_9); 

            			doneLeaf(otherlv_6);
            		
            // PsiInternalProjectGenerator.g:131:3: ( (lv_cdiEnabled_7_0= ruleBoolean ) )
            // PsiInternalProjectGenerator.g:132:4: (lv_cdiEnabled_7_0= ruleBoolean )
            {
            // PsiInternalProjectGenerator.g:132:4: (lv_cdiEnabled_7_0= ruleBoolean )
            // PsiInternalProjectGenerator.g:133:5: lv_cdiEnabled_7_0= ruleBoolean
            {

            					markComposite(elementTypeProvider.getModule_CdiEnabledBooleanEnumRuleCall_7_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_cdiEnabled_7_0=ruleBoolean();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getModule_SemicolonKeyword_8ElementType());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_10); 

            			doneLeaf(otherlv_8);
            		
            // PsiInternalProjectGenerator.g:153:3: (otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // PsiInternalProjectGenerator.g:154:4: otherlv_9= 'messageBundles' otherlv_10= '{' ( (lv_messageBundles_11_0= ruleLocalized ) )+ otherlv_12= '}' otherlv_13= ';'
                    {

                    				markLeaf(elementTypeProvider.getModule_MessageBundlesKeyword_9_0ElementType());
                    			
                    otherlv_9=(Token)match(input,19,FOLLOW_4); 

                    				doneLeaf(otherlv_9);
                    			

                    				markLeaf(elementTypeProvider.getModule_LeftCurlyBracketKeyword_9_1ElementType());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_3); 

                    				doneLeaf(otherlv_10);
                    			
                    // PsiInternalProjectGenerator.g:168:4: ( (lv_messageBundles_11_0= ruleLocalized ) )+
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
                    	    // PsiInternalProjectGenerator.g:169:5: (lv_messageBundles_11_0= ruleLocalized )
                    	    {
                    	    // PsiInternalProjectGenerator.g:169:5: (lv_messageBundles_11_0= ruleLocalized )
                    	    // PsiInternalProjectGenerator.g:170:6: lv_messageBundles_11_0= ruleLocalized
                    	    {

                    	    						markComposite(elementTypeProvider.getModule_MessageBundlesLocalizedParserRuleCall_9_2_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_messageBundles_11_0=ruleLocalized();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

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


                    				markLeaf(elementTypeProvider.getModule_RightCurlyBracketKeyword_9_3ElementType());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_7); 

                    				doneLeaf(otherlv_12);
                    			

                    				markLeaf(elementTypeProvider.getModule_SemicolonKeyword_9_4ElementType());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_12); 

                    				doneLeaf(otherlv_13);
                    			

                    }
                    break;

            }

            // PsiInternalProjectGenerator.g:198:3: (otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // PsiInternalProjectGenerator.g:199:4: otherlv_14= 'observers' otherlv_15= '{' ( (lv_observers_16_0= ruleObserver ) )+ otherlv_17= '}' otherlv_18= ';'
                    {

                    				markLeaf(elementTypeProvider.getModule_ObserversKeyword_10_0ElementType());
                    			
                    otherlv_14=(Token)match(input,21,FOLLOW_4); 

                    				doneLeaf(otherlv_14);
                    			

                    				markLeaf(elementTypeProvider.getModule_LeftCurlyBracketKeyword_10_1ElementType());
                    			
                    otherlv_15=(Token)match(input,15,FOLLOW_3); 

                    				doneLeaf(otherlv_15);
                    			
                    // PsiInternalProjectGenerator.g:213:4: ( (lv_observers_16_0= ruleObserver ) )+
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
                    	    // PsiInternalProjectGenerator.g:214:5: (lv_observers_16_0= ruleObserver )
                    	    {
                    	    // PsiInternalProjectGenerator.g:214:5: (lv_observers_16_0= ruleObserver )
                    	    // PsiInternalProjectGenerator.g:215:6: lv_observers_16_0= ruleObserver
                    	    {

                    	    						markComposite(elementTypeProvider.getModule_ObserversObserverParserRuleCall_10_2_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_observers_16_0=ruleObserver();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

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


                    				markLeaf(elementTypeProvider.getModule_RightCurlyBracketKeyword_10_3ElementType());
                    			
                    otherlv_17=(Token)match(input,20,FOLLOW_7); 

                    				doneLeaf(otherlv_17);
                    			

                    				markLeaf(elementTypeProvider.getModule_SemicolonKeyword_10_4ElementType());
                    			
                    otherlv_18=(Token)match(input,17,FOLLOW_13); 

                    				doneLeaf(otherlv_18);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getModule_JpaConfigKeyword_11ElementType());
            		
            otherlv_19=(Token)match(input,22,FOLLOW_4); 

            			doneLeaf(otherlv_19);
            		
            // PsiInternalProjectGenerator.g:250:3: ( (lv_jpaConfig_20_0= ruleJpaConfig ) )
            // PsiInternalProjectGenerator.g:251:4: (lv_jpaConfig_20_0= ruleJpaConfig )
            {
            // PsiInternalProjectGenerator.g:251:4: (lv_jpaConfig_20_0= ruleJpaConfig )
            // PsiInternalProjectGenerator.g:252:5: lv_jpaConfig_20_0= ruleJpaConfig
            {

            					markComposite(elementTypeProvider.getModule_JpaConfigJpaConfigParserRuleCall_12_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_jpaConfig_20_0=ruleJpaConfig();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getModule_SemicolonKeyword_13ElementType());
            		
            otherlv_21=(Token)match(input,17,FOLLOW_14); 

            			doneLeaf(otherlv_21);
            		

            			markLeaf(elementTypeProvider.getModule_ServiceConfigKeyword_14ElementType());
            		
            otherlv_22=(Token)match(input,23,FOLLOW_4); 

            			doneLeaf(otherlv_22);
            		
            // PsiInternalProjectGenerator.g:279:3: ( (lv_serviceConfig_23_0= ruleServiceConfig ) )
            // PsiInternalProjectGenerator.g:280:4: (lv_serviceConfig_23_0= ruleServiceConfig )
            {
            // PsiInternalProjectGenerator.g:280:4: (lv_serviceConfig_23_0= ruleServiceConfig )
            // PsiInternalProjectGenerator.g:281:5: lv_serviceConfig_23_0= ruleServiceConfig
            {

            					markComposite(elementTypeProvider.getModule_ServiceConfigServiceConfigParserRuleCall_15_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_serviceConfig_23_0=ruleServiceConfig();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getModule_SemicolonKeyword_16ElementType());
            		
            otherlv_24=(Token)match(input,17,FOLLOW_15); 

            			doneLeaf(otherlv_24);
            		

            			markLeaf(elementTypeProvider.getModule_RightCurlyBracketKeyword_17ElementType());
            		
            otherlv_25=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_25);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleServiceConfig"
    // PsiInternalProjectGenerator.g:312:1: entryRuleServiceConfig returns [Boolean current=false] : iv_ruleServiceConfig= ruleServiceConfig EOF ;
    public final Boolean entryRuleServiceConfig() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleServiceConfig = null;


        try {
            // PsiInternalProjectGenerator.g:312:55: (iv_ruleServiceConfig= ruleServiceConfig EOF )
            // PsiInternalProjectGenerator.g:313:2: iv_ruleServiceConfig= ruleServiceConfig EOF
            {
             markComposite(elementTypeProvider.getServiceConfigElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleServiceConfig=ruleServiceConfig();

            state._fsp--;

             current =iv_ruleServiceConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleServiceConfig"


    // $ANTLR start "ruleServiceConfig"
    // PsiInternalProjectGenerator.g:319:1: ruleServiceConfig returns [Boolean current=false] : (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )? otherlv_8= '}' ) ;
    public final Boolean ruleServiceConfig() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Boolean lv_observers_2_0 = null;


        try {
            // PsiInternalProjectGenerator.g:320:1: ( (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )? otherlv_8= '}' ) )
            // PsiInternalProjectGenerator.g:321:2: (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )? otherlv_8= '}' )
            {
            // PsiInternalProjectGenerator.g:321:2: (otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )? otherlv_8= '}' )
            // PsiInternalProjectGenerator.g:322:3: otherlv_0= '{' (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )? (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )? otherlv_8= '}'
            {

            			markLeaf(elementTypeProvider.getServiceConfig_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_16); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalProjectGenerator.g:329:3: (otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+ )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // PsiInternalProjectGenerator.g:330:4: otherlv_1= 'observers' ( (lv_observers_2_0= ruleObserver ) )+
                    {

                    				markLeaf(elementTypeProvider.getServiceConfig_ObserversKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,21,FOLLOW_3); 

                    				doneLeaf(otherlv_1);
                    			
                    // PsiInternalProjectGenerator.g:337:4: ( (lv_observers_2_0= ruleObserver ) )+
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
                    	    // PsiInternalProjectGenerator.g:338:5: (lv_observers_2_0= ruleObserver )
                    	    {
                    	    // PsiInternalProjectGenerator.g:338:5: (lv_observers_2_0= ruleObserver )
                    	    // PsiInternalProjectGenerator.g:339:6: lv_observers_2_0= ruleObserver
                    	    {

                    	    						markComposite(elementTypeProvider.getServiceConfig_ObserversObserverParserRuleCall_1_1_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_17);
                    	    lv_observers_2_0=ruleObserver();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

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

            // PsiInternalProjectGenerator.g:353:3: (otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // PsiInternalProjectGenerator.g:354:4: otherlv_3= 'messageBundles' otherlv_4= '{' ( (otherlv_5= RULE_ID ) )+ otherlv_6= '}' otherlv_7= ';'
                    {

                    				markLeaf(elementTypeProvider.getServiceConfig_MessageBundlesKeyword_2_0ElementType());
                    			
                    otherlv_3=(Token)match(input,19,FOLLOW_4); 

                    				doneLeaf(otherlv_3);
                    			

                    				markLeaf(elementTypeProvider.getServiceConfig_LeftCurlyBracketKeyword_2_1ElementType());
                    			
                    otherlv_4=(Token)match(input,15,FOLLOW_3); 

                    				doneLeaf(otherlv_4);
                    			
                    // PsiInternalProjectGenerator.g:368:4: ( (otherlv_5= RULE_ID ) )+
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
                    	    // PsiInternalProjectGenerator.g:369:5: (otherlv_5= RULE_ID )
                    	    {
                    	    // PsiInternalProjectGenerator.g:369:5: (otherlv_5= RULE_ID )
                    	    // PsiInternalProjectGenerator.g:370:6: otherlv_5= RULE_ID
                    	    {

                    	    						if (!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

                    	    						markLeaf(elementTypeProvider.getServiceConfig_MessageBundlesLocalizedCrossReference_2_2_0ElementType());
                    	    					
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    						doneLeaf(otherlv_5);
                    	    					

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


                    				markLeaf(elementTypeProvider.getServiceConfig_RightCurlyBracketKeyword_2_3ElementType());
                    			
                    otherlv_6=(Token)match(input,20,FOLLOW_7); 

                    				doneLeaf(otherlv_6);
                    			

                    				markLeaf(elementTypeProvider.getServiceConfig_SemicolonKeyword_2_4ElementType());
                    			
                    otherlv_7=(Token)match(input,17,FOLLOW_15); 

                    				doneLeaf(otherlv_7);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getServiceConfig_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_8);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleServiceConfig"


    // $ANTLR start "entryRuleObserver"
    // PsiInternalProjectGenerator.g:411:1: entryRuleObserver returns [Boolean current=false] : iv_ruleObserver= ruleObserver EOF ;
    public final Boolean entryRuleObserver() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleObserver = null;


        try {
            // PsiInternalProjectGenerator.g:411:50: (iv_ruleObserver= ruleObserver EOF )
            // PsiInternalProjectGenerator.g:412:2: iv_ruleObserver= ruleObserver EOF
            {
             markComposite(elementTypeProvider.getObserverElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleObserver=ruleObserver();

            state._fsp--;

             current =iv_ruleObserver; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // PsiInternalProjectGenerator.g:418:1: ruleObserver returns [Boolean current=false] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' ) ;
    public final Boolean ruleObserver() throws RecognitionException {
        Boolean current = false;

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
        Boolean lv_during_6_0 = null;

        Boolean lv_notify_9_0 = null;


        try {
            // PsiInternalProjectGenerator.g:419:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' ) )
            // PsiInternalProjectGenerator.g:420:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' )
            {
            // PsiInternalProjectGenerator.g:420:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}' )
            // PsiInternalProjectGenerator.g:421:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'type' ( (lv_type_3_0= RULE_CLASSNAME ) ) otherlv_4= ';' otherlv_5= 'during' ( (lv_during_6_0= ruleDuring ) ) otherlv_7= ';' otherlv_8= 'notify' ( (lv_notify_9_0= ruleNotify ) ) otherlv_10= ';' otherlv_11= 'delegate' ( (lv_className_12_0= RULE_CLASSNAME ) ) otherlv_13= ';' (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )? otherlv_17= '}'
            {
            // PsiInternalProjectGenerator.g:421:3: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalProjectGenerator.g:422:4: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalProjectGenerator.g:422:4: (lv_name_0_0= RULE_ID )
            // PsiInternalProjectGenerator.g:423:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getObserver_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getObserver_LeftCurlyBracketKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_18); 

            			doneLeaf(otherlv_1);
            		

            			markLeaf(elementTypeProvider.getObserver_TypeKeyword_2ElementType());
            		
            otherlv_2=(Token)match(input,24,FOLLOW_19); 

            			doneLeaf(otherlv_2);
            		
            // PsiInternalProjectGenerator.g:452:3: ( (lv_type_3_0= RULE_CLASSNAME ) )
            // PsiInternalProjectGenerator.g:453:4: (lv_type_3_0= RULE_CLASSNAME )
            {
            // PsiInternalProjectGenerator.g:453:4: (lv_type_3_0= RULE_CLASSNAME )
            // PsiInternalProjectGenerator.g:454:5: lv_type_3_0= RULE_CLASSNAME
            {

            					markLeaf(elementTypeProvider.getObserver_TypeClassNameTerminalRuleCall_3_0ElementType());
            				
            lv_type_3_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_7); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_type_3_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getObserver_SemicolonKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,17,FOLLOW_20); 

            			doneLeaf(otherlv_4);
            		

            			markLeaf(elementTypeProvider.getObserver_DuringKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,25,FOLLOW_21); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalProjectGenerator.g:483:3: ( (lv_during_6_0= ruleDuring ) )
            // PsiInternalProjectGenerator.g:484:4: (lv_during_6_0= ruleDuring )
            {
            // PsiInternalProjectGenerator.g:484:4: (lv_during_6_0= ruleDuring )
            // PsiInternalProjectGenerator.g:485:5: lv_during_6_0= ruleDuring
            {

            					markComposite(elementTypeProvider.getObserver_DuringDuringEnumRuleCall_6_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_during_6_0=ruleDuring();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getObserver_SemicolonKeyword_7ElementType());
            		
            otherlv_7=(Token)match(input,17,FOLLOW_22); 

            			doneLeaf(otherlv_7);
            		

            			markLeaf(elementTypeProvider.getObserver_NotifyKeyword_8ElementType());
            		
            otherlv_8=(Token)match(input,26,FOLLOW_23); 

            			doneLeaf(otherlv_8);
            		
            // PsiInternalProjectGenerator.g:512:3: ( (lv_notify_9_0= ruleNotify ) )
            // PsiInternalProjectGenerator.g:513:4: (lv_notify_9_0= ruleNotify )
            {
            // PsiInternalProjectGenerator.g:513:4: (lv_notify_9_0= ruleNotify )
            // PsiInternalProjectGenerator.g:514:5: lv_notify_9_0= ruleNotify
            {

            					markComposite(elementTypeProvider.getObserver_NotifyNotifyEnumRuleCall_9_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_notify_9_0=ruleNotify();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getObserver_SemicolonKeyword_10ElementType());
            		
            otherlv_10=(Token)match(input,17,FOLLOW_24); 

            			doneLeaf(otherlv_10);
            		

            			markLeaf(elementTypeProvider.getObserver_DelegateKeyword_11ElementType());
            		
            otherlv_11=(Token)match(input,27,FOLLOW_19); 

            			doneLeaf(otherlv_11);
            		
            // PsiInternalProjectGenerator.g:541:3: ( (lv_className_12_0= RULE_CLASSNAME ) )
            // PsiInternalProjectGenerator.g:542:4: (lv_className_12_0= RULE_CLASSNAME )
            {
            // PsiInternalProjectGenerator.g:542:4: (lv_className_12_0= RULE_CLASSNAME )
            // PsiInternalProjectGenerator.g:543:5: lv_className_12_0= RULE_CLASSNAME
            {

            					markLeaf(elementTypeProvider.getObserver_ClassNameClassNameTerminalRuleCall_12_0ElementType());
            				
            lv_className_12_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_7); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_className_12_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getObserver_SemicolonKeyword_13ElementType());
            		
            otherlv_13=(Token)match(input,17,FOLLOW_25); 

            			doneLeaf(otherlv_13);
            		
            // PsiInternalProjectGenerator.g:565:3: (otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==28) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // PsiInternalProjectGenerator.g:566:4: otherlv_14= 'qualifier' ( (lv_qualifier_15_0= RULE_CLASSNAME ) ) otherlv_16= ';'
                    {

                    				markLeaf(elementTypeProvider.getObserver_QualifierKeyword_14_0ElementType());
                    			
                    otherlv_14=(Token)match(input,28,FOLLOW_19); 

                    				doneLeaf(otherlv_14);
                    			
                    // PsiInternalProjectGenerator.g:573:4: ( (lv_qualifier_15_0= RULE_CLASSNAME ) )
                    // PsiInternalProjectGenerator.g:574:5: (lv_qualifier_15_0= RULE_CLASSNAME )
                    {
                    // PsiInternalProjectGenerator.g:574:5: (lv_qualifier_15_0= RULE_CLASSNAME )
                    // PsiInternalProjectGenerator.g:575:6: lv_qualifier_15_0= RULE_CLASSNAME
                    {

                    						markLeaf(elementTypeProvider.getObserver_QualifierClassNameTerminalRuleCall_14_1_0ElementType());
                    					
                    lv_qualifier_15_0=(Token)match(input,RULE_CLASSNAME,FOLLOW_7); 

                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    						doneLeaf(lv_qualifier_15_0);
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getObserver_SemicolonKeyword_14_2ElementType());
                    			
                    otherlv_16=(Token)match(input,17,FOLLOW_15); 

                    				doneLeaf(otherlv_16);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getObserver_RightCurlyBracketKeyword_15ElementType());
            		
            otherlv_17=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_17);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleJpaConfig"
    // PsiInternalProjectGenerator.g:609:1: entryRuleJpaConfig returns [Boolean current=false] : iv_ruleJpaConfig= ruleJpaConfig EOF ;
    public final Boolean entryRuleJpaConfig() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleJpaConfig = null;


        try {
            // PsiInternalProjectGenerator.g:609:51: (iv_ruleJpaConfig= ruleJpaConfig EOF )
            // PsiInternalProjectGenerator.g:610:2: iv_ruleJpaConfig= ruleJpaConfig EOF
            {
             markComposite(elementTypeProvider.getJpaConfigElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleJpaConfig=ruleJpaConfig();

            state._fsp--;

             current =iv_ruleJpaConfig; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJpaConfig"


    // $ANTLR start "ruleJpaConfig"
    // PsiInternalProjectGenerator.g:616:1: ruleJpaConfig returns [Boolean current=false] : (otherlv_0= '{' (otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' )? otherlv_6= '}' ) ;
    public final Boolean ruleJpaConfig() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;

        try {
            // PsiInternalProjectGenerator.g:617:1: ( (otherlv_0= '{' (otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' )? otherlv_6= '}' ) )
            // PsiInternalProjectGenerator.g:618:2: (otherlv_0= '{' (otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' )? otherlv_6= '}' )
            {
            // PsiInternalProjectGenerator.g:618:2: (otherlv_0= '{' (otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' )? otherlv_6= '}' )
            // PsiInternalProjectGenerator.g:619:3: otherlv_0= '{' (otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' )? otherlv_6= '}'
            {

            			markLeaf(elementTypeProvider.getJpaConfig_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_26); 

            			doneLeaf(otherlv_0);
            		
            // PsiInternalProjectGenerator.g:626:3: (otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // PsiInternalProjectGenerator.g:627:4: otherlv_1= 'localizedEnums' otherlv_2= '{' ( (otherlv_3= RULE_ID ) )+ otherlv_4= '}' otherlv_5= ';'
                    {

                    				markLeaf(elementTypeProvider.getJpaConfig_LocalizedEnumsKeyword_1_0ElementType());
                    			
                    otherlv_1=(Token)match(input,29,FOLLOW_4); 

                    				doneLeaf(otherlv_1);
                    			

                    				markLeaf(elementTypeProvider.getJpaConfig_LeftCurlyBracketKeyword_1_1ElementType());
                    			
                    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    				doneLeaf(otherlv_2);
                    			
                    // PsiInternalProjectGenerator.g:641:4: ( (otherlv_3= RULE_ID ) )+
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
                    	    // PsiInternalProjectGenerator.g:642:5: (otherlv_3= RULE_ID )
                    	    {
                    	    // PsiInternalProjectGenerator.g:642:5: (otherlv_3= RULE_ID )
                    	    // PsiInternalProjectGenerator.g:643:6: otherlv_3= RULE_ID
                    	    {

                    	    						if (!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

                    	    						markLeaf(elementTypeProvider.getJpaConfig_LocalizedEnumsLocalizedCrossReference_1_2_0ElementType());
                    	    					
                    	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    						doneLeaf(otherlv_3);
                    	    					

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


                    				markLeaf(elementTypeProvider.getJpaConfig_RightCurlyBracketKeyword_1_3ElementType());
                    			
                    otherlv_4=(Token)match(input,20,FOLLOW_7); 

                    				doneLeaf(otherlv_4);
                    			

                    				markLeaf(elementTypeProvider.getJpaConfig_SemicolonKeyword_1_4ElementType());
                    			
                    otherlv_5=(Token)match(input,17,FOLLOW_15); 

                    				doneLeaf(otherlv_5);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getJpaConfig_RightCurlyBracketKeyword_2ElementType());
            		
            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_6);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJpaConfig"


    // $ANTLR start "entryRuleLocalized"
    // PsiInternalProjectGenerator.g:684:1: entryRuleLocalized returns [Boolean current=false] : iv_ruleLocalized= ruleLocalized EOF ;
    public final Boolean entryRuleLocalized() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLocalized = null;


        try {
            // PsiInternalProjectGenerator.g:684:51: (iv_ruleLocalized= ruleLocalized EOF )
            // PsiInternalProjectGenerator.g:685:2: iv_ruleLocalized= ruleLocalized EOF
            {
             markComposite(elementTypeProvider.getLocalizedElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalized=ruleLocalized();

            state._fsp--;

             current =iv_ruleLocalized; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalized"


    // $ANTLR start "ruleLocalized"
    // PsiInternalProjectGenerator.g:691:1: ruleLocalized returns [Boolean current=false] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' ) ;
    public final Boolean ruleLocalized() throws RecognitionException {
        Boolean current = false;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Boolean lv_values_4_0 = null;


        try {
            // PsiInternalProjectGenerator.g:692:1: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' ) )
            // PsiInternalProjectGenerator.g:693:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' )
            {
            // PsiInternalProjectGenerator.g:693:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}' )
            // PsiInternalProjectGenerator.g:694:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )? otherlv_7= '}'
            {
            // PsiInternalProjectGenerator.g:694:3: ( (lv_name_0_0= RULE_ID ) )
            // PsiInternalProjectGenerator.g:695:4: (lv_name_0_0= RULE_ID )
            {
            // PsiInternalProjectGenerator.g:695:4: (lv_name_0_0= RULE_ID )
            // PsiInternalProjectGenerator.g:696:5: lv_name_0_0= RULE_ID
            {

            					markLeaf(elementTypeProvider.getLocalized_NameIDTerminalRuleCall_0_0ElementType());
            				
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_name_0_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getLocalized_LeftCurlyBracketKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_27); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalProjectGenerator.g:718:3: (otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==30) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // PsiInternalProjectGenerator.g:719:4: otherlv_2= 'values' otherlv_3= '{' ( (lv_values_4_0= ruleLocalizedEntry ) )+ otherlv_5= '}' otherlv_6= ';'
                    {

                    				markLeaf(elementTypeProvider.getLocalized_ValuesKeyword_2_0ElementType());
                    			
                    otherlv_2=(Token)match(input,30,FOLLOW_4); 

                    				doneLeaf(otherlv_2);
                    			

                    				markLeaf(elementTypeProvider.getLocalized_LeftCurlyBracketKeyword_2_1ElementType());
                    			
                    otherlv_3=(Token)match(input,15,FOLLOW_4); 

                    				doneLeaf(otherlv_3);
                    			
                    // PsiInternalProjectGenerator.g:733:4: ( (lv_values_4_0= ruleLocalizedEntry ) )+
                    int cnt12=0;
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // PsiInternalProjectGenerator.g:734:5: (lv_values_4_0= ruleLocalizedEntry )
                    	    {
                    	    // PsiInternalProjectGenerator.g:734:5: (lv_values_4_0= ruleLocalizedEntry )
                    	    // PsiInternalProjectGenerator.g:735:6: lv_values_4_0= ruleLocalizedEntry
                    	    {

                    	    						markComposite(elementTypeProvider.getLocalized_ValuesLocalizedEntryParserRuleCall_2_2_0ElementType());
                    	    					
                    	    pushFollow(FOLLOW_28);
                    	    lv_values_4_0=ruleLocalizedEntry();

                    	    state._fsp--;


                    	    						doneComposite();
                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

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


                    				markLeaf(elementTypeProvider.getLocalized_RightCurlyBracketKeyword_2_3ElementType());
                    			
                    otherlv_5=(Token)match(input,20,FOLLOW_7); 

                    				doneLeaf(otherlv_5);
                    			

                    				markLeaf(elementTypeProvider.getLocalized_SemicolonKeyword_2_4ElementType());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_15); 

                    				doneLeaf(otherlv_6);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getLocalized_RightCurlyBracketKeyword_3ElementType());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalized"


    // $ANTLR start "entryRuleLocalizedEntry"
    // PsiInternalProjectGenerator.g:774:1: entryRuleLocalizedEntry returns [Boolean current=false] : iv_ruleLocalizedEntry= ruleLocalizedEntry EOF ;
    public final Boolean entryRuleLocalizedEntry() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLocalizedEntry = null;


        try {
            // PsiInternalProjectGenerator.g:774:56: (iv_ruleLocalizedEntry= ruleLocalizedEntry EOF )
            // PsiInternalProjectGenerator.g:775:2: iv_ruleLocalizedEntry= ruleLocalizedEntry EOF
            {
             markComposite(elementTypeProvider.getLocalizedEntryElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalizedEntry=ruleLocalizedEntry();

            state._fsp--;

             current =iv_ruleLocalizedEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalizedEntry"


    // $ANTLR start "ruleLocalizedEntry"
    // PsiInternalProjectGenerator.g:781:1: ruleLocalizedEntry returns [Boolean current=false] : (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' ) ;
    public final Boolean ruleLocalizedEntry() throws RecognitionException {
        Boolean current = false;

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
        Boolean lv_values_6_0 = null;


        try {
            // PsiInternalProjectGenerator.g:782:1: ( (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' ) )
            // PsiInternalProjectGenerator.g:783:2: (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' )
            {
            // PsiInternalProjectGenerator.g:783:2: (otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}' )
            // PsiInternalProjectGenerator.g:784:3: otherlv_0= '{' otherlv_1= 'key' ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) ) otherlv_3= ';' otherlv_4= 'values' otherlv_5= '{' ( (lv_values_6_0= ruleLocalizedValue ) )+ otherlv_7= '}' otherlv_8= ';' (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )? otherlv_14= '}'
            {

            			markLeaf(elementTypeProvider.getLocalizedEntry_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_5); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getLocalizedEntry_KeyKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_29); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalProjectGenerator.g:798:3: ( (lv_localizedKey_2_0= RULE_LOCALIZEDKEY ) )
            // PsiInternalProjectGenerator.g:799:4: (lv_localizedKey_2_0= RULE_LOCALIZEDKEY )
            {
            // PsiInternalProjectGenerator.g:799:4: (lv_localizedKey_2_0= RULE_LOCALIZEDKEY )
            // PsiInternalProjectGenerator.g:800:5: lv_localizedKey_2_0= RULE_LOCALIZEDKEY
            {

            					markLeaf(elementTypeProvider.getLocalizedEntry_LocalizedKeyLocalizedKeyTerminalRuleCall_2_0ElementType());
            				
            lv_localizedKey_2_0=(Token)match(input,RULE_LOCALIZEDKEY,FOLLOW_7); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_localizedKey_2_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getLocalizedEntry_SemicolonKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_30); 

            			doneLeaf(otherlv_3);
            		

            			markLeaf(elementTypeProvider.getLocalizedEntry_ValuesKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,30,FOLLOW_4); 

            			doneLeaf(otherlv_4);
            		

            			markLeaf(elementTypeProvider.getLocalizedEntry_LeftCurlyBracketKeyword_5ElementType());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_4); 

            			doneLeaf(otherlv_5);
            		
            // PsiInternalProjectGenerator.g:836:3: ( (lv_values_6_0= ruleLocalizedValue ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==15) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // PsiInternalProjectGenerator.g:837:4: (lv_values_6_0= ruleLocalizedValue )
            	    {
            	    // PsiInternalProjectGenerator.g:837:4: (lv_values_6_0= ruleLocalizedValue )
            	    // PsiInternalProjectGenerator.g:838:5: lv_values_6_0= ruleLocalizedValue
            	    {

            	    					markComposite(elementTypeProvider.getLocalizedEntry_ValuesLocalizedValueParserRuleCall_6_0ElementType());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_values_6_0=ruleLocalizedValue();

            	    state._fsp--;


            	    					doneComposite();
            	    					if(!current) {
            	    						associateWithSemanticElement();
            	    						current = true;
            	    					}
            	    				

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


            			markLeaf(elementTypeProvider.getLocalizedEntry_RightCurlyBracketKeyword_7ElementType());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_7); 

            			doneLeaf(otherlv_7);
            		

            			markLeaf(elementTypeProvider.getLocalizedEntry_SemicolonKeyword_8ElementType());
            		
            otherlv_8=(Token)match(input,17,FOLLOW_31); 

            			doneLeaf(otherlv_8);
            		
            // PsiInternalProjectGenerator.g:865:3: (otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==31) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // PsiInternalProjectGenerator.g:866:4: otherlv_9= 'args' otherlv_10= '{' ( (lv_args_11_0= RULE_STRING ) )+ otherlv_12= '}' otherlv_13= ';'
                    {

                    				markLeaf(elementTypeProvider.getLocalizedEntry_ArgsKeyword_9_0ElementType());
                    			
                    otherlv_9=(Token)match(input,31,FOLLOW_4); 

                    				doneLeaf(otherlv_9);
                    			

                    				markLeaf(elementTypeProvider.getLocalizedEntry_LeftCurlyBracketKeyword_9_1ElementType());
                    			
                    otherlv_10=(Token)match(input,15,FOLLOW_6); 

                    				doneLeaf(otherlv_10);
                    			
                    // PsiInternalProjectGenerator.g:880:4: ( (lv_args_11_0= RULE_STRING ) )+
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
                    	    // PsiInternalProjectGenerator.g:881:5: (lv_args_11_0= RULE_STRING )
                    	    {
                    	    // PsiInternalProjectGenerator.g:881:5: (lv_args_11_0= RULE_STRING )
                    	    // PsiInternalProjectGenerator.g:882:6: lv_args_11_0= RULE_STRING
                    	    {

                    	    						markLeaf(elementTypeProvider.getLocalizedEntry_ArgsSTRINGTerminalRuleCall_9_2_0ElementType());
                    	    					
                    	    lv_args_11_0=(Token)match(input,RULE_STRING,FOLLOW_32); 

                    	    						if(!current) {
                    	    							associateWithSemanticElement();
                    	    							current = true;
                    	    						}
                    	    					

                    	    						doneLeaf(lv_args_11_0);
                    	    					

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


                    				markLeaf(elementTypeProvider.getLocalizedEntry_RightCurlyBracketKeyword_9_3ElementType());
                    			
                    otherlv_12=(Token)match(input,20,FOLLOW_7); 

                    				doneLeaf(otherlv_12);
                    			

                    				markLeaf(elementTypeProvider.getLocalizedEntry_SemicolonKeyword_9_4ElementType());
                    			
                    otherlv_13=(Token)match(input,17,FOLLOW_15); 

                    				doneLeaf(otherlv_13);
                    			

                    }
                    break;

            }


            			markLeaf(elementTypeProvider.getLocalizedEntry_RightCurlyBracketKeyword_10ElementType());
            		
            otherlv_14=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_14);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalizedEntry"


    // $ANTLR start "entryRuleLocalizedValue"
    // PsiInternalProjectGenerator.g:923:1: entryRuleLocalizedValue returns [Boolean current=false] : iv_ruleLocalizedValue= ruleLocalizedValue EOF ;
    public final Boolean entryRuleLocalizedValue() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLocalizedValue = null;


        try {
            // PsiInternalProjectGenerator.g:923:56: (iv_ruleLocalizedValue= ruleLocalizedValue EOF )
            // PsiInternalProjectGenerator.g:924:2: iv_ruleLocalizedValue= ruleLocalizedValue EOF
            {
             markComposite(elementTypeProvider.getLocalizedValueElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalizedValue=ruleLocalizedValue();

            state._fsp--;

             current =iv_ruleLocalizedValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLocalizedValue"


    // $ANTLR start "ruleLocalizedValue"
    // PsiInternalProjectGenerator.g:930:1: ruleLocalizedValue returns [Boolean current=false] : (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_values_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) ;
    public final Boolean ruleLocalizedValue() throws RecognitionException {
        Boolean current = false;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_values_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Boolean lv_locale_2_0 = null;


        try {
            // PsiInternalProjectGenerator.g:931:1: ( (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_values_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' ) )
            // PsiInternalProjectGenerator.g:932:2: (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_values_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            {
            // PsiInternalProjectGenerator.g:932:2: (otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_values_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}' )
            // PsiInternalProjectGenerator.g:933:3: otherlv_0= '{' otherlv_1= 'locale' ( (lv_locale_2_0= ruleLocale ) ) otherlv_3= ';' otherlv_4= 'value' ( (lv_values_5_0= RULE_STRING ) ) otherlv_6= ';' otherlv_7= '}'
            {

            			markLeaf(elementTypeProvider.getLocalizedValue_LeftCurlyBracketKeyword_0ElementType());
            		
            otherlv_0=(Token)match(input,15,FOLLOW_33); 

            			doneLeaf(otherlv_0);
            		

            			markLeaf(elementTypeProvider.getLocalizedValue_LocaleKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,32,FOLLOW_34); 

            			doneLeaf(otherlv_1);
            		
            // PsiInternalProjectGenerator.g:947:3: ( (lv_locale_2_0= ruleLocale ) )
            // PsiInternalProjectGenerator.g:948:4: (lv_locale_2_0= ruleLocale )
            {
            // PsiInternalProjectGenerator.g:948:4: (lv_locale_2_0= ruleLocale )
            // PsiInternalProjectGenerator.g:949:5: lv_locale_2_0= ruleLocale
            {

            					markComposite(elementTypeProvider.getLocalizedValue_LocaleLocaleEnumRuleCall_2_0ElementType());
            				
            pushFollow(FOLLOW_7);
            lv_locale_2_0=ruleLocale();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getLocalizedValue_SemicolonKeyword_3ElementType());
            		
            otherlv_3=(Token)match(input,17,FOLLOW_35); 

            			doneLeaf(otherlv_3);
            		

            			markLeaf(elementTypeProvider.getLocalizedValue_ValueKeyword_4ElementType());
            		
            otherlv_4=(Token)match(input,33,FOLLOW_6); 

            			doneLeaf(otherlv_4);
            		
            // PsiInternalProjectGenerator.g:976:3: ( (lv_values_5_0= RULE_STRING ) )
            // PsiInternalProjectGenerator.g:977:4: (lv_values_5_0= RULE_STRING )
            {
            // PsiInternalProjectGenerator.g:977:4: (lv_values_5_0= RULE_STRING )
            // PsiInternalProjectGenerator.g:978:5: lv_values_5_0= RULE_STRING
            {

            					markLeaf(elementTypeProvider.getLocalizedValue_ValuesSTRINGTerminalRuleCall_5_0ElementType());
            				
            lv_values_5_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_values_5_0);
            				

            }


            }


            			markLeaf(elementTypeProvider.getLocalizedValue_SemicolonKeyword_6ElementType());
            		
            otherlv_6=(Token)match(input,17,FOLLOW_15); 

            			doneLeaf(otherlv_6);
            		

            			markLeaf(elementTypeProvider.getLocalizedValue_RightCurlyBracketKeyword_7ElementType());
            		
            otherlv_7=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_7);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocalizedValue"


    // $ANTLR start "ruleLocale"
    // PsiInternalProjectGenerator.g:1011:1: ruleLocale returns [Boolean current=false] : ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) ) ;
    public final Boolean ruleLocale() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalProjectGenerator.g:1012:1: ( ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) ) )
            // PsiInternalProjectGenerator.g:1013:2: ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) )
            {
            // PsiInternalProjectGenerator.g:1013:2: ( (enumLiteral_0= 'de_DE' ) | (enumLiteral_1= 'en_US' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==34) ) {
                alt17=1;
            }
            else if ( (LA17_0==35) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // PsiInternalProjectGenerator.g:1014:3: (enumLiteral_0= 'de_DE' )
                    {
                    // PsiInternalProjectGenerator.g:1014:3: (enumLiteral_0= 'de_DE' )
                    // PsiInternalProjectGenerator.g:1015:4: enumLiteral_0= 'de_DE'
                    {

                    				markLeaf(elementTypeProvider.getLocale_DE_DEEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalProjectGenerator.g:1024:3: (enumLiteral_1= 'en_US' )
                    {
                    // PsiInternalProjectGenerator.g:1024:3: (enumLiteral_1= 'en_US' )
                    // PsiInternalProjectGenerator.g:1025:4: enumLiteral_1= 'en_US'
                    {

                    				markLeaf(elementTypeProvider.getLocale_EN_USEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLocale"


    // $ANTLR start "ruleBoolean"
    // PsiInternalProjectGenerator.g:1037:1: ruleBoolean returns [Boolean current=false] : ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) ;
    public final Boolean ruleBoolean() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalProjectGenerator.g:1038:1: ( ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) ) )
            // PsiInternalProjectGenerator.g:1039:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            {
            // PsiInternalProjectGenerator.g:1039:2: ( (enumLiteral_0= 'true' ) | (enumLiteral_1= 'false' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            else if ( (LA18_0==37) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // PsiInternalProjectGenerator.g:1040:3: (enumLiteral_0= 'true' )
                    {
                    // PsiInternalProjectGenerator.g:1040:3: (enumLiteral_0= 'true' )
                    // PsiInternalProjectGenerator.g:1041:4: enumLiteral_0= 'true'
                    {

                    				markLeaf(elementTypeProvider.getBoolean_TRUEEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,36,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalProjectGenerator.g:1050:3: (enumLiteral_1= 'false' )
                    {
                    // PsiInternalProjectGenerator.g:1050:3: (enumLiteral_1= 'false' )
                    // PsiInternalProjectGenerator.g:1051:4: enumLiteral_1= 'false'
                    {

                    				markLeaf(elementTypeProvider.getBoolean_FALSEEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,37,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleDuring"
    // PsiInternalProjectGenerator.g:1063:1: ruleDuring returns [Boolean current=false] : ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) ) ;
    public final Boolean ruleDuring() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalProjectGenerator.g:1064:1: ( ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) ) )
            // PsiInternalProjectGenerator.g:1065:2: ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) )
            {
            // PsiInternalProjectGenerator.g:1065:2: ( (enumLiteral_0= 'InProgress' ) | (enumLiteral_1= 'AfterCompleition' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==38) ) {
                alt19=1;
            }
            else if ( (LA19_0==39) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // PsiInternalProjectGenerator.g:1066:3: (enumLiteral_0= 'InProgress' )
                    {
                    // PsiInternalProjectGenerator.g:1066:3: (enumLiteral_0= 'InProgress' )
                    // PsiInternalProjectGenerator.g:1067:4: enumLiteral_0= 'InProgress'
                    {

                    				markLeaf(elementTypeProvider.getDuring_IN_PROGEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,38,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalProjectGenerator.g:1076:3: (enumLiteral_1= 'AfterCompleition' )
                    {
                    // PsiInternalProjectGenerator.g:1076:3: (enumLiteral_1= 'AfterCompleition' )
                    // PsiInternalProjectGenerator.g:1077:4: enumLiteral_1= 'AfterCompleition'
                    {

                    				markLeaf(elementTypeProvider.getDuring_AFTER_COMPLETIONEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,39,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDuring"


    // $ANTLR start "ruleNotify"
    // PsiInternalProjectGenerator.g:1089:1: ruleNotify returns [Boolean current=false] : ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) ) ;
    public final Boolean ruleNotify() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

        try {
            // PsiInternalProjectGenerator.g:1090:1: ( ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) ) )
            // PsiInternalProjectGenerator.g:1091:2: ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) )
            {
            // PsiInternalProjectGenerator.g:1091:2: ( (enumLiteral_0= 'Always' ) | (enumLiteral_1= 'Exists' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==40) ) {
                alt20=1;
            }
            else if ( (LA20_0==41) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // PsiInternalProjectGenerator.g:1092:3: (enumLiteral_0= 'Always' )
                    {
                    // PsiInternalProjectGenerator.g:1092:3: (enumLiteral_0= 'Always' )
                    // PsiInternalProjectGenerator.g:1093:4: enumLiteral_0= 'Always'
                    {

                    				markLeaf(elementTypeProvider.getNotify_ALWAYSEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,40,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalProjectGenerator.g:1102:3: (enumLiteral_1= 'Exists' )
                    {
                    // PsiInternalProjectGenerator.g:1102:3: (enumLiteral_1= 'Exists' )
                    // PsiInternalProjectGenerator.g:1103:4: enumLiteral_1= 'Exists'
                    {

                    				markLeaf(elementTypeProvider.getNotify_EXISTSEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,41,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000680000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000380000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000180010L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010100000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020100000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000040100000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000080100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000100020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});

}