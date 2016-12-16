package at.ooe.fh.mdm.herzog.dsl.proj.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import at.ooe.fh.mdm.herzog.dsl.proj.services.ProjectGeneratorGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectGeneratorParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_CLASSNAME", "RULE_LOCALIZEDKEY", "RULE_METHODNAME", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'de_DE'", "'en_US'", "'true'", "'false'", "'InProgress'", "'AfterCompleition'", "'Always'", "'Exists'", "'module'", "'{'", "'key'", "';'", "'cdiEnabled'", "'jpaConfig'", "'serviceConfig'", "'}'", "'messageBundles'", "'observers'", "'type'", "'during'", "'notify'", "'delegate'", "'qualifier'", "'localizedEnums'", "'values'", "'args'", "'locale'", "'value'"
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


        public InternalProjectGeneratorParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalProjectGeneratorParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalProjectGeneratorParser.tokenNames; }
    public String getGrammarFileName() { return "InternalProjectGenerator.g"; }


    	private ProjectGeneratorGrammarAccess grammarAccess;

    	public void setGrammarAccess(ProjectGeneratorGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModule"
    // InternalProjectGenerator.g:53:1: entryRuleModule : ruleModule EOF ;
    public final void entryRuleModule() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:54:1: ( ruleModule EOF )
            // InternalProjectGenerator.g:55:1: ruleModule EOF
            {
             before(grammarAccess.getModuleRule()); 
            pushFollow(FOLLOW_1);
            ruleModule();

            state._fsp--;

             after(grammarAccess.getModuleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModule"


    // $ANTLR start "ruleModule"
    // InternalProjectGenerator.g:62:1: ruleModule : ( ( rule__Module__Group__0 ) ) ;
    public final void ruleModule() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:66:2: ( ( ( rule__Module__Group__0 ) ) )
            // InternalProjectGenerator.g:67:2: ( ( rule__Module__Group__0 ) )
            {
            // InternalProjectGenerator.g:67:2: ( ( rule__Module__Group__0 ) )
            // InternalProjectGenerator.g:68:3: ( rule__Module__Group__0 )
            {
             before(grammarAccess.getModuleAccess().getGroup()); 
            // InternalProjectGenerator.g:69:3: ( rule__Module__Group__0 )
            // InternalProjectGenerator.g:69:4: rule__Module__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModule"


    // $ANTLR start "entryRuleServiceConfig"
    // InternalProjectGenerator.g:78:1: entryRuleServiceConfig : ruleServiceConfig EOF ;
    public final void entryRuleServiceConfig() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:79:1: ( ruleServiceConfig EOF )
            // InternalProjectGenerator.g:80:1: ruleServiceConfig EOF
            {
             before(grammarAccess.getServiceConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleServiceConfig();

            state._fsp--;

             after(grammarAccess.getServiceConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServiceConfig"


    // $ANTLR start "ruleServiceConfig"
    // InternalProjectGenerator.g:87:1: ruleServiceConfig : ( ( rule__ServiceConfig__Group__0 ) ) ;
    public final void ruleServiceConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:91:2: ( ( ( rule__ServiceConfig__Group__0 ) ) )
            // InternalProjectGenerator.g:92:2: ( ( rule__ServiceConfig__Group__0 ) )
            {
            // InternalProjectGenerator.g:92:2: ( ( rule__ServiceConfig__Group__0 ) )
            // InternalProjectGenerator.g:93:3: ( rule__ServiceConfig__Group__0 )
            {
             before(grammarAccess.getServiceConfigAccess().getGroup()); 
            // InternalProjectGenerator.g:94:3: ( rule__ServiceConfig__Group__0 )
            // InternalProjectGenerator.g:94:4: rule__ServiceConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServiceConfig"


    // $ANTLR start "entryRuleObserver"
    // InternalProjectGenerator.g:103:1: entryRuleObserver : ruleObserver EOF ;
    public final void entryRuleObserver() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:104:1: ( ruleObserver EOF )
            // InternalProjectGenerator.g:105:1: ruleObserver EOF
            {
             before(grammarAccess.getObserverRule()); 
            pushFollow(FOLLOW_1);
            ruleObserver();

            state._fsp--;

             after(grammarAccess.getObserverRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObserver"


    // $ANTLR start "ruleObserver"
    // InternalProjectGenerator.g:112:1: ruleObserver : ( ( rule__Observer__Group__0 ) ) ;
    public final void ruleObserver() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:116:2: ( ( ( rule__Observer__Group__0 ) ) )
            // InternalProjectGenerator.g:117:2: ( ( rule__Observer__Group__0 ) )
            {
            // InternalProjectGenerator.g:117:2: ( ( rule__Observer__Group__0 ) )
            // InternalProjectGenerator.g:118:3: ( rule__Observer__Group__0 )
            {
             before(grammarAccess.getObserverAccess().getGroup()); 
            // InternalProjectGenerator.g:119:3: ( rule__Observer__Group__0 )
            // InternalProjectGenerator.g:119:4: rule__Observer__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObserver"


    // $ANTLR start "entryRuleJpaConfig"
    // InternalProjectGenerator.g:128:1: entryRuleJpaConfig : ruleJpaConfig EOF ;
    public final void entryRuleJpaConfig() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:129:1: ( ruleJpaConfig EOF )
            // InternalProjectGenerator.g:130:1: ruleJpaConfig EOF
            {
             before(grammarAccess.getJpaConfigRule()); 
            pushFollow(FOLLOW_1);
            ruleJpaConfig();

            state._fsp--;

             after(grammarAccess.getJpaConfigRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJpaConfig"


    // $ANTLR start "ruleJpaConfig"
    // InternalProjectGenerator.g:137:1: ruleJpaConfig : ( ( rule__JpaConfig__Group__0 ) ) ;
    public final void ruleJpaConfig() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:141:2: ( ( ( rule__JpaConfig__Group__0 ) ) )
            // InternalProjectGenerator.g:142:2: ( ( rule__JpaConfig__Group__0 ) )
            {
            // InternalProjectGenerator.g:142:2: ( ( rule__JpaConfig__Group__0 ) )
            // InternalProjectGenerator.g:143:3: ( rule__JpaConfig__Group__0 )
            {
             before(grammarAccess.getJpaConfigAccess().getGroup()); 
            // InternalProjectGenerator.g:144:3: ( rule__JpaConfig__Group__0 )
            // InternalProjectGenerator.g:144:4: rule__JpaConfig__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJpaConfigAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJpaConfig"


    // $ANTLR start "entryRuleLocalized"
    // InternalProjectGenerator.g:153:1: entryRuleLocalized : ruleLocalized EOF ;
    public final void entryRuleLocalized() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:154:1: ( ruleLocalized EOF )
            // InternalProjectGenerator.g:155:1: ruleLocalized EOF
            {
             before(grammarAccess.getLocalizedRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalized();

            state._fsp--;

             after(grammarAccess.getLocalizedRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalized"


    // $ANTLR start "ruleLocalized"
    // InternalProjectGenerator.g:162:1: ruleLocalized : ( ( rule__Localized__Group__0 ) ) ;
    public final void ruleLocalized() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:166:2: ( ( ( rule__Localized__Group__0 ) ) )
            // InternalProjectGenerator.g:167:2: ( ( rule__Localized__Group__0 ) )
            {
            // InternalProjectGenerator.g:167:2: ( ( rule__Localized__Group__0 ) )
            // InternalProjectGenerator.g:168:3: ( rule__Localized__Group__0 )
            {
             before(grammarAccess.getLocalizedAccess().getGroup()); 
            // InternalProjectGenerator.g:169:3: ( rule__Localized__Group__0 )
            // InternalProjectGenerator.g:169:4: rule__Localized__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Localized__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalized"


    // $ANTLR start "entryRuleLocalizedEntry"
    // InternalProjectGenerator.g:178:1: entryRuleLocalizedEntry : ruleLocalizedEntry EOF ;
    public final void entryRuleLocalizedEntry() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:179:1: ( ruleLocalizedEntry EOF )
            // InternalProjectGenerator.g:180:1: ruleLocalizedEntry EOF
            {
             before(grammarAccess.getLocalizedEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalizedEntry();

            state._fsp--;

             after(grammarAccess.getLocalizedEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalizedEntry"


    // $ANTLR start "ruleLocalizedEntry"
    // InternalProjectGenerator.g:187:1: ruleLocalizedEntry : ( ( rule__LocalizedEntry__Group__0 ) ) ;
    public final void ruleLocalizedEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:191:2: ( ( ( rule__LocalizedEntry__Group__0 ) ) )
            // InternalProjectGenerator.g:192:2: ( ( rule__LocalizedEntry__Group__0 ) )
            {
            // InternalProjectGenerator.g:192:2: ( ( rule__LocalizedEntry__Group__0 ) )
            // InternalProjectGenerator.g:193:3: ( rule__LocalizedEntry__Group__0 )
            {
             before(grammarAccess.getLocalizedEntryAccess().getGroup()); 
            // InternalProjectGenerator.g:194:3: ( rule__LocalizedEntry__Group__0 )
            // InternalProjectGenerator.g:194:4: rule__LocalizedEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalizedEntry"


    // $ANTLR start "entryRuleLocalizedValue"
    // InternalProjectGenerator.g:203:1: entryRuleLocalizedValue : ruleLocalizedValue EOF ;
    public final void entryRuleLocalizedValue() throws RecognitionException {
        try {
            // InternalProjectGenerator.g:204:1: ( ruleLocalizedValue EOF )
            // InternalProjectGenerator.g:205:1: ruleLocalizedValue EOF
            {
             before(grammarAccess.getLocalizedValueRule()); 
            pushFollow(FOLLOW_1);
            ruleLocalizedValue();

            state._fsp--;

             after(grammarAccess.getLocalizedValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalizedValue"


    // $ANTLR start "ruleLocalizedValue"
    // InternalProjectGenerator.g:212:1: ruleLocalizedValue : ( ( rule__LocalizedValue__Group__0 ) ) ;
    public final void ruleLocalizedValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:216:2: ( ( ( rule__LocalizedValue__Group__0 ) ) )
            // InternalProjectGenerator.g:217:2: ( ( rule__LocalizedValue__Group__0 ) )
            {
            // InternalProjectGenerator.g:217:2: ( ( rule__LocalizedValue__Group__0 ) )
            // InternalProjectGenerator.g:218:3: ( rule__LocalizedValue__Group__0 )
            {
             before(grammarAccess.getLocalizedValueAccess().getGroup()); 
            // InternalProjectGenerator.g:219:3: ( rule__LocalizedValue__Group__0 )
            // InternalProjectGenerator.g:219:4: rule__LocalizedValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedValueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalizedValue"


    // $ANTLR start "ruleLocale"
    // InternalProjectGenerator.g:228:1: ruleLocale : ( ( rule__Locale__Alternatives ) ) ;
    public final void ruleLocale() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:232:1: ( ( ( rule__Locale__Alternatives ) ) )
            // InternalProjectGenerator.g:233:2: ( ( rule__Locale__Alternatives ) )
            {
            // InternalProjectGenerator.g:233:2: ( ( rule__Locale__Alternatives ) )
            // InternalProjectGenerator.g:234:3: ( rule__Locale__Alternatives )
            {
             before(grammarAccess.getLocaleAccess().getAlternatives()); 
            // InternalProjectGenerator.g:235:3: ( rule__Locale__Alternatives )
            // InternalProjectGenerator.g:235:4: rule__Locale__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Locale__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLocaleAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocale"


    // $ANTLR start "ruleBoolean"
    // InternalProjectGenerator.g:244:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:248:1: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalProjectGenerator.g:249:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalProjectGenerator.g:249:2: ( ( rule__Boolean__Alternatives ) )
            // InternalProjectGenerator.g:250:3: ( rule__Boolean__Alternatives )
            {
             before(grammarAccess.getBooleanAccess().getAlternatives()); 
            // InternalProjectGenerator.g:251:3: ( rule__Boolean__Alternatives )
            // InternalProjectGenerator.g:251:4: rule__Boolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "ruleDuring"
    // InternalProjectGenerator.g:260:1: ruleDuring : ( ( rule__During__Alternatives ) ) ;
    public final void ruleDuring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:264:1: ( ( ( rule__During__Alternatives ) ) )
            // InternalProjectGenerator.g:265:2: ( ( rule__During__Alternatives ) )
            {
            // InternalProjectGenerator.g:265:2: ( ( rule__During__Alternatives ) )
            // InternalProjectGenerator.g:266:3: ( rule__During__Alternatives )
            {
             before(grammarAccess.getDuringAccess().getAlternatives()); 
            // InternalProjectGenerator.g:267:3: ( rule__During__Alternatives )
            // InternalProjectGenerator.g:267:4: rule__During__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__During__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDuringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDuring"


    // $ANTLR start "ruleNotify"
    // InternalProjectGenerator.g:276:1: ruleNotify : ( ( rule__Notify__Alternatives ) ) ;
    public final void ruleNotify() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:280:1: ( ( ( rule__Notify__Alternatives ) ) )
            // InternalProjectGenerator.g:281:2: ( ( rule__Notify__Alternatives ) )
            {
            // InternalProjectGenerator.g:281:2: ( ( rule__Notify__Alternatives ) )
            // InternalProjectGenerator.g:282:3: ( rule__Notify__Alternatives )
            {
             before(grammarAccess.getNotifyAccess().getAlternatives()); 
            // InternalProjectGenerator.g:283:3: ( rule__Notify__Alternatives )
            // InternalProjectGenerator.g:283:4: rule__Notify__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Notify__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNotifyAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNotify"


    // $ANTLR start "rule__Locale__Alternatives"
    // InternalProjectGenerator.g:291:1: rule__Locale__Alternatives : ( ( ( 'de_DE' ) ) | ( ( 'en_US' ) ) );
    public final void rule__Locale__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:295:1: ( ( ( 'de_DE' ) ) | ( ( 'en_US' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==14) ) {
                alt1=1;
            }
            else if ( (LA1_0==15) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalProjectGenerator.g:296:2: ( ( 'de_DE' ) )
                    {
                    // InternalProjectGenerator.g:296:2: ( ( 'de_DE' ) )
                    // InternalProjectGenerator.g:297:3: ( 'de_DE' )
                    {
                     before(grammarAccess.getLocaleAccess().getDE_DEEnumLiteralDeclaration_0()); 
                    // InternalProjectGenerator.g:298:3: ( 'de_DE' )
                    // InternalProjectGenerator.g:298:4: 'de_DE'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocaleAccess().getDE_DEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:302:2: ( ( 'en_US' ) )
                    {
                    // InternalProjectGenerator.g:302:2: ( ( 'en_US' ) )
                    // InternalProjectGenerator.g:303:3: ( 'en_US' )
                    {
                     before(grammarAccess.getLocaleAccess().getEN_USEnumLiteralDeclaration_1()); 
                    // InternalProjectGenerator.g:304:3: ( 'en_US' )
                    // InternalProjectGenerator.g:304:4: 'en_US'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLocaleAccess().getEN_USEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Locale__Alternatives"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalProjectGenerator.g:312:1: rule__Boolean__Alternatives : ( ( ( 'true' ) ) | ( ( 'false' ) ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:316:1: ( ( ( 'true' ) ) | ( ( 'false' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            else if ( (LA2_0==17) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalProjectGenerator.g:317:2: ( ( 'true' ) )
                    {
                    // InternalProjectGenerator.g:317:2: ( ( 'true' ) )
                    // InternalProjectGenerator.g:318:3: ( 'true' )
                    {
                     before(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // InternalProjectGenerator.g:319:3: ( 'true' )
                    // InternalProjectGenerator.g:319:4: 'true'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:323:2: ( ( 'false' ) )
                    {
                    // InternalProjectGenerator.g:323:2: ( ( 'false' ) )
                    // InternalProjectGenerator.g:324:3: ( 'false' )
                    {
                     before(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // InternalProjectGenerator.g:325:3: ( 'false' )
                    // InternalProjectGenerator.g:325:4: 'false'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getBooleanAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__During__Alternatives"
    // InternalProjectGenerator.g:333:1: rule__During__Alternatives : ( ( ( 'InProgress' ) ) | ( ( 'AfterCompleition' ) ) );
    public final void rule__During__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:337:1: ( ( ( 'InProgress' ) ) | ( ( 'AfterCompleition' ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalProjectGenerator.g:338:2: ( ( 'InProgress' ) )
                    {
                    // InternalProjectGenerator.g:338:2: ( ( 'InProgress' ) )
                    // InternalProjectGenerator.g:339:3: ( 'InProgress' )
                    {
                     before(grammarAccess.getDuringAccess().getIN_PROGEnumLiteralDeclaration_0()); 
                    // InternalProjectGenerator.g:340:3: ( 'InProgress' )
                    // InternalProjectGenerator.g:340:4: 'InProgress'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getDuringAccess().getIN_PROGEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:344:2: ( ( 'AfterCompleition' ) )
                    {
                    // InternalProjectGenerator.g:344:2: ( ( 'AfterCompleition' ) )
                    // InternalProjectGenerator.g:345:3: ( 'AfterCompleition' )
                    {
                     before(grammarAccess.getDuringAccess().getAFTER_COMPLETIONEnumLiteralDeclaration_1()); 
                    // InternalProjectGenerator.g:346:3: ( 'AfterCompleition' )
                    // InternalProjectGenerator.g:346:4: 'AfterCompleition'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getDuringAccess().getAFTER_COMPLETIONEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__During__Alternatives"


    // $ANTLR start "rule__Notify__Alternatives"
    // InternalProjectGenerator.g:354:1: rule__Notify__Alternatives : ( ( ( 'Always' ) ) | ( ( 'Exists' ) ) );
    public final void rule__Notify__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:358:1: ( ( ( 'Always' ) ) | ( ( 'Exists' ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            else if ( (LA4_0==21) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalProjectGenerator.g:359:2: ( ( 'Always' ) )
                    {
                    // InternalProjectGenerator.g:359:2: ( ( 'Always' ) )
                    // InternalProjectGenerator.g:360:3: ( 'Always' )
                    {
                     before(grammarAccess.getNotifyAccess().getALWAYSEnumLiteralDeclaration_0()); 
                    // InternalProjectGenerator.g:361:3: ( 'Always' )
                    // InternalProjectGenerator.g:361:4: 'Always'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotifyAccess().getALWAYSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:365:2: ( ( 'Exists' ) )
                    {
                    // InternalProjectGenerator.g:365:2: ( ( 'Exists' ) )
                    // InternalProjectGenerator.g:366:3: ( 'Exists' )
                    {
                     before(grammarAccess.getNotifyAccess().getEXISTSEnumLiteralDeclaration_1()); 
                    // InternalProjectGenerator.g:367:3: ( 'Exists' )
                    // InternalProjectGenerator.g:367:4: 'Exists'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getNotifyAccess().getEXISTSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Notify__Alternatives"


    // $ANTLR start "rule__Module__Group__0"
    // InternalProjectGenerator.g:375:1: rule__Module__Group__0 : rule__Module__Group__0__Impl rule__Module__Group__1 ;
    public final void rule__Module__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:379:1: ( rule__Module__Group__0__Impl rule__Module__Group__1 )
            // InternalProjectGenerator.g:380:2: rule__Module__Group__0__Impl rule__Module__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0"


    // $ANTLR start "rule__Module__Group__0__Impl"
    // InternalProjectGenerator.g:387:1: rule__Module__Group__0__Impl : ( 'module' ) ;
    public final void rule__Module__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:391:1: ( ( 'module' ) )
            // InternalProjectGenerator.g:392:1: ( 'module' )
            {
            // InternalProjectGenerator.g:392:1: ( 'module' )
            // InternalProjectGenerator.g:393:2: 'module'
            {
             before(grammarAccess.getModuleAccess().getModuleKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getModuleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__0__Impl"


    // $ANTLR start "rule__Module__Group__1"
    // InternalProjectGenerator.g:402:1: rule__Module__Group__1 : rule__Module__Group__1__Impl rule__Module__Group__2 ;
    public final void rule__Module__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:406:1: ( rule__Module__Group__1__Impl rule__Module__Group__2 )
            // InternalProjectGenerator.g:407:2: rule__Module__Group__1__Impl rule__Module__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1"


    // $ANTLR start "rule__Module__Group__1__Impl"
    // InternalProjectGenerator.g:414:1: rule__Module__Group__1__Impl : ( ( rule__Module__NameAssignment_1 ) ) ;
    public final void rule__Module__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:418:1: ( ( ( rule__Module__NameAssignment_1 ) ) )
            // InternalProjectGenerator.g:419:1: ( ( rule__Module__NameAssignment_1 ) )
            {
            // InternalProjectGenerator.g:419:1: ( ( rule__Module__NameAssignment_1 ) )
            // InternalProjectGenerator.g:420:2: ( rule__Module__NameAssignment_1 )
            {
             before(grammarAccess.getModuleAccess().getNameAssignment_1()); 
            // InternalProjectGenerator.g:421:2: ( rule__Module__NameAssignment_1 )
            // InternalProjectGenerator.g:421:3: rule__Module__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Module__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__1__Impl"


    // $ANTLR start "rule__Module__Group__2"
    // InternalProjectGenerator.g:429:1: rule__Module__Group__2 : rule__Module__Group__2__Impl rule__Module__Group__3 ;
    public final void rule__Module__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:433:1: ( rule__Module__Group__2__Impl rule__Module__Group__3 )
            // InternalProjectGenerator.g:434:2: rule__Module__Group__2__Impl rule__Module__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Module__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2"


    // $ANTLR start "rule__Module__Group__2__Impl"
    // InternalProjectGenerator.g:441:1: rule__Module__Group__2__Impl : ( '{' ) ;
    public final void rule__Module__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:445:1: ( ( '{' ) )
            // InternalProjectGenerator.g:446:1: ( '{' )
            {
            // InternalProjectGenerator.g:446:1: ( '{' )
            // InternalProjectGenerator.g:447:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__2__Impl"


    // $ANTLR start "rule__Module__Group__3"
    // InternalProjectGenerator.g:456:1: rule__Module__Group__3 : rule__Module__Group__3__Impl rule__Module__Group__4 ;
    public final void rule__Module__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:460:1: ( rule__Module__Group__3__Impl rule__Module__Group__4 )
            // InternalProjectGenerator.g:461:2: rule__Module__Group__3__Impl rule__Module__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Module__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3"


    // $ANTLR start "rule__Module__Group__3__Impl"
    // InternalProjectGenerator.g:468:1: rule__Module__Group__3__Impl : ( 'key' ) ;
    public final void rule__Module__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:472:1: ( ( 'key' ) )
            // InternalProjectGenerator.g:473:1: ( 'key' )
            {
            // InternalProjectGenerator.g:473:1: ( 'key' )
            // InternalProjectGenerator.g:474:2: 'key'
            {
             before(grammarAccess.getModuleAccess().getKeyKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getKeyKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__3__Impl"


    // $ANTLR start "rule__Module__Group__4"
    // InternalProjectGenerator.g:483:1: rule__Module__Group__4 : rule__Module__Group__4__Impl rule__Module__Group__5 ;
    public final void rule__Module__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:487:1: ( rule__Module__Group__4__Impl rule__Module__Group__5 )
            // InternalProjectGenerator.g:488:2: rule__Module__Group__4__Impl rule__Module__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4"


    // $ANTLR start "rule__Module__Group__4__Impl"
    // InternalProjectGenerator.g:495:1: rule__Module__Group__4__Impl : ( ( rule__Module__KeyAssignment_4 ) ) ;
    public final void rule__Module__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:499:1: ( ( ( rule__Module__KeyAssignment_4 ) ) )
            // InternalProjectGenerator.g:500:1: ( ( rule__Module__KeyAssignment_4 ) )
            {
            // InternalProjectGenerator.g:500:1: ( ( rule__Module__KeyAssignment_4 ) )
            // InternalProjectGenerator.g:501:2: ( rule__Module__KeyAssignment_4 )
            {
             before(grammarAccess.getModuleAccess().getKeyAssignment_4()); 
            // InternalProjectGenerator.g:502:2: ( rule__Module__KeyAssignment_4 )
            // InternalProjectGenerator.g:502:3: rule__Module__KeyAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Module__KeyAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getKeyAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__4__Impl"


    // $ANTLR start "rule__Module__Group__5"
    // InternalProjectGenerator.g:510:1: rule__Module__Group__5 : rule__Module__Group__5__Impl rule__Module__Group__6 ;
    public final void rule__Module__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:514:1: ( rule__Module__Group__5__Impl rule__Module__Group__6 )
            // InternalProjectGenerator.g:515:2: rule__Module__Group__5__Impl rule__Module__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__Module__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5"


    // $ANTLR start "rule__Module__Group__5__Impl"
    // InternalProjectGenerator.g:522:1: rule__Module__Group__5__Impl : ( ';' ) ;
    public final void rule__Module__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:526:1: ( ( ';' ) )
            // InternalProjectGenerator.g:527:1: ( ';' )
            {
            // InternalProjectGenerator.g:527:1: ( ';' )
            // InternalProjectGenerator.g:528:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__5__Impl"


    // $ANTLR start "rule__Module__Group__6"
    // InternalProjectGenerator.g:537:1: rule__Module__Group__6 : rule__Module__Group__6__Impl rule__Module__Group__7 ;
    public final void rule__Module__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:541:1: ( rule__Module__Group__6__Impl rule__Module__Group__7 )
            // InternalProjectGenerator.g:542:2: rule__Module__Group__6__Impl rule__Module__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__Module__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6"


    // $ANTLR start "rule__Module__Group__6__Impl"
    // InternalProjectGenerator.g:549:1: rule__Module__Group__6__Impl : ( 'cdiEnabled' ) ;
    public final void rule__Module__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:553:1: ( ( 'cdiEnabled' ) )
            // InternalProjectGenerator.g:554:1: ( 'cdiEnabled' )
            {
            // InternalProjectGenerator.g:554:1: ( 'cdiEnabled' )
            // InternalProjectGenerator.g:555:2: 'cdiEnabled'
            {
             before(grammarAccess.getModuleAccess().getCdiEnabledKeyword_6()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getCdiEnabledKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__6__Impl"


    // $ANTLR start "rule__Module__Group__7"
    // InternalProjectGenerator.g:564:1: rule__Module__Group__7 : rule__Module__Group__7__Impl rule__Module__Group__8 ;
    public final void rule__Module__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:568:1: ( rule__Module__Group__7__Impl rule__Module__Group__8 )
            // InternalProjectGenerator.g:569:2: rule__Module__Group__7__Impl rule__Module__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7"


    // $ANTLR start "rule__Module__Group__7__Impl"
    // InternalProjectGenerator.g:576:1: rule__Module__Group__7__Impl : ( ( rule__Module__CdiEnabledAssignment_7 ) ) ;
    public final void rule__Module__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:580:1: ( ( ( rule__Module__CdiEnabledAssignment_7 ) ) )
            // InternalProjectGenerator.g:581:1: ( ( rule__Module__CdiEnabledAssignment_7 ) )
            {
            // InternalProjectGenerator.g:581:1: ( ( rule__Module__CdiEnabledAssignment_7 ) )
            // InternalProjectGenerator.g:582:2: ( rule__Module__CdiEnabledAssignment_7 )
            {
             before(grammarAccess.getModuleAccess().getCdiEnabledAssignment_7()); 
            // InternalProjectGenerator.g:583:2: ( rule__Module__CdiEnabledAssignment_7 )
            // InternalProjectGenerator.g:583:3: rule__Module__CdiEnabledAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Module__CdiEnabledAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getCdiEnabledAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__7__Impl"


    // $ANTLR start "rule__Module__Group__8"
    // InternalProjectGenerator.g:591:1: rule__Module__Group__8 : rule__Module__Group__8__Impl rule__Module__Group__9 ;
    public final void rule__Module__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:595:1: ( rule__Module__Group__8__Impl rule__Module__Group__9 )
            // InternalProjectGenerator.g:596:2: rule__Module__Group__8__Impl rule__Module__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Module__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8"


    // $ANTLR start "rule__Module__Group__8__Impl"
    // InternalProjectGenerator.g:603:1: rule__Module__Group__8__Impl : ( ';' ) ;
    public final void rule__Module__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:607:1: ( ( ';' ) )
            // InternalProjectGenerator.g:608:1: ( ';' )
            {
            // InternalProjectGenerator.g:608:1: ( ';' )
            // InternalProjectGenerator.g:609:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__8__Impl"


    // $ANTLR start "rule__Module__Group__9"
    // InternalProjectGenerator.g:618:1: rule__Module__Group__9 : rule__Module__Group__9__Impl rule__Module__Group__10 ;
    public final void rule__Module__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:622:1: ( rule__Module__Group__9__Impl rule__Module__Group__10 )
            // InternalProjectGenerator.g:623:2: rule__Module__Group__9__Impl rule__Module__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__Module__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__9"


    // $ANTLR start "rule__Module__Group__9__Impl"
    // InternalProjectGenerator.g:630:1: rule__Module__Group__9__Impl : ( ( rule__Module__Group_9__0 )? ) ;
    public final void rule__Module__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:634:1: ( ( ( rule__Module__Group_9__0 )? ) )
            // InternalProjectGenerator.g:635:1: ( ( rule__Module__Group_9__0 )? )
            {
            // InternalProjectGenerator.g:635:1: ( ( rule__Module__Group_9__0 )? )
            // InternalProjectGenerator.g:636:2: ( rule__Module__Group_9__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_9()); 
            // InternalProjectGenerator.g:637:2: ( rule__Module__Group_9__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalProjectGenerator.g:637:3: rule__Module__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Module__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__9__Impl"


    // $ANTLR start "rule__Module__Group__10"
    // InternalProjectGenerator.g:645:1: rule__Module__Group__10 : rule__Module__Group__10__Impl rule__Module__Group__11 ;
    public final void rule__Module__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:649:1: ( rule__Module__Group__10__Impl rule__Module__Group__11 )
            // InternalProjectGenerator.g:650:2: rule__Module__Group__10__Impl rule__Module__Group__11
            {
            pushFollow(FOLLOW_10);
            rule__Module__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__10"


    // $ANTLR start "rule__Module__Group__10__Impl"
    // InternalProjectGenerator.g:657:1: rule__Module__Group__10__Impl : ( ( rule__Module__Group_10__0 )? ) ;
    public final void rule__Module__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:661:1: ( ( ( rule__Module__Group_10__0 )? ) )
            // InternalProjectGenerator.g:662:1: ( ( rule__Module__Group_10__0 )? )
            {
            // InternalProjectGenerator.g:662:1: ( ( rule__Module__Group_10__0 )? )
            // InternalProjectGenerator.g:663:2: ( rule__Module__Group_10__0 )?
            {
             before(grammarAccess.getModuleAccess().getGroup_10()); 
            // InternalProjectGenerator.g:664:2: ( rule__Module__Group_10__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalProjectGenerator.g:664:3: rule__Module__Group_10__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Module__Group_10__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModuleAccess().getGroup_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__10__Impl"


    // $ANTLR start "rule__Module__Group__11"
    // InternalProjectGenerator.g:672:1: rule__Module__Group__11 : rule__Module__Group__11__Impl rule__Module__Group__12 ;
    public final void rule__Module__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:676:1: ( rule__Module__Group__11__Impl rule__Module__Group__12 )
            // InternalProjectGenerator.g:677:2: rule__Module__Group__11__Impl rule__Module__Group__12
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__11"


    // $ANTLR start "rule__Module__Group__11__Impl"
    // InternalProjectGenerator.g:684:1: rule__Module__Group__11__Impl : ( 'jpaConfig' ) ;
    public final void rule__Module__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:688:1: ( ( 'jpaConfig' ) )
            // InternalProjectGenerator.g:689:1: ( 'jpaConfig' )
            {
            // InternalProjectGenerator.g:689:1: ( 'jpaConfig' )
            // InternalProjectGenerator.g:690:2: 'jpaConfig'
            {
             before(grammarAccess.getModuleAccess().getJpaConfigKeyword_11()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getJpaConfigKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__11__Impl"


    // $ANTLR start "rule__Module__Group__12"
    // InternalProjectGenerator.g:699:1: rule__Module__Group__12 : rule__Module__Group__12__Impl rule__Module__Group__13 ;
    public final void rule__Module__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:703:1: ( rule__Module__Group__12__Impl rule__Module__Group__13 )
            // InternalProjectGenerator.g:704:2: rule__Module__Group__12__Impl rule__Module__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__12"


    // $ANTLR start "rule__Module__Group__12__Impl"
    // InternalProjectGenerator.g:711:1: rule__Module__Group__12__Impl : ( ( rule__Module__JpaConfigAssignment_12 ) ) ;
    public final void rule__Module__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:715:1: ( ( ( rule__Module__JpaConfigAssignment_12 ) ) )
            // InternalProjectGenerator.g:716:1: ( ( rule__Module__JpaConfigAssignment_12 ) )
            {
            // InternalProjectGenerator.g:716:1: ( ( rule__Module__JpaConfigAssignment_12 ) )
            // InternalProjectGenerator.g:717:2: ( rule__Module__JpaConfigAssignment_12 )
            {
             before(grammarAccess.getModuleAccess().getJpaConfigAssignment_12()); 
            // InternalProjectGenerator.g:718:2: ( rule__Module__JpaConfigAssignment_12 )
            // InternalProjectGenerator.g:718:3: rule__Module__JpaConfigAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Module__JpaConfigAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getJpaConfigAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__12__Impl"


    // $ANTLR start "rule__Module__Group__13"
    // InternalProjectGenerator.g:726:1: rule__Module__Group__13 : rule__Module__Group__13__Impl rule__Module__Group__14 ;
    public final void rule__Module__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:730:1: ( rule__Module__Group__13__Impl rule__Module__Group__14 )
            // InternalProjectGenerator.g:731:2: rule__Module__Group__13__Impl rule__Module__Group__14
            {
            pushFollow(FOLLOW_11);
            rule__Module__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__13"


    // $ANTLR start "rule__Module__Group__13__Impl"
    // InternalProjectGenerator.g:738:1: rule__Module__Group__13__Impl : ( ';' ) ;
    public final void rule__Module__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:742:1: ( ( ';' ) )
            // InternalProjectGenerator.g:743:1: ( ';' )
            {
            // InternalProjectGenerator.g:743:1: ( ';' )
            // InternalProjectGenerator.g:744:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__13__Impl"


    // $ANTLR start "rule__Module__Group__14"
    // InternalProjectGenerator.g:753:1: rule__Module__Group__14 : rule__Module__Group__14__Impl rule__Module__Group__15 ;
    public final void rule__Module__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:757:1: ( rule__Module__Group__14__Impl rule__Module__Group__15 )
            // InternalProjectGenerator.g:758:2: rule__Module__Group__14__Impl rule__Module__Group__15
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__14"


    // $ANTLR start "rule__Module__Group__14__Impl"
    // InternalProjectGenerator.g:765:1: rule__Module__Group__14__Impl : ( 'serviceConfig' ) ;
    public final void rule__Module__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:769:1: ( ( 'serviceConfig' ) )
            // InternalProjectGenerator.g:770:1: ( 'serviceConfig' )
            {
            // InternalProjectGenerator.g:770:1: ( 'serviceConfig' )
            // InternalProjectGenerator.g:771:2: 'serviceConfig'
            {
             before(grammarAccess.getModuleAccess().getServiceConfigKeyword_14()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getServiceConfigKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__14__Impl"


    // $ANTLR start "rule__Module__Group__15"
    // InternalProjectGenerator.g:780:1: rule__Module__Group__15 : rule__Module__Group__15__Impl rule__Module__Group__16 ;
    public final void rule__Module__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:784:1: ( rule__Module__Group__15__Impl rule__Module__Group__16 )
            // InternalProjectGenerator.g:785:2: rule__Module__Group__15__Impl rule__Module__Group__16
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__15"


    // $ANTLR start "rule__Module__Group__15__Impl"
    // InternalProjectGenerator.g:792:1: rule__Module__Group__15__Impl : ( ( rule__Module__ServiceConfigAssignment_15 ) ) ;
    public final void rule__Module__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:796:1: ( ( ( rule__Module__ServiceConfigAssignment_15 ) ) )
            // InternalProjectGenerator.g:797:1: ( ( rule__Module__ServiceConfigAssignment_15 ) )
            {
            // InternalProjectGenerator.g:797:1: ( ( rule__Module__ServiceConfigAssignment_15 ) )
            // InternalProjectGenerator.g:798:2: ( rule__Module__ServiceConfigAssignment_15 )
            {
             before(grammarAccess.getModuleAccess().getServiceConfigAssignment_15()); 
            // InternalProjectGenerator.g:799:2: ( rule__Module__ServiceConfigAssignment_15 )
            // InternalProjectGenerator.g:799:3: rule__Module__ServiceConfigAssignment_15
            {
            pushFollow(FOLLOW_2);
            rule__Module__ServiceConfigAssignment_15();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getServiceConfigAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__15__Impl"


    // $ANTLR start "rule__Module__Group__16"
    // InternalProjectGenerator.g:807:1: rule__Module__Group__16 : rule__Module__Group__16__Impl rule__Module__Group__17 ;
    public final void rule__Module__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:811:1: ( rule__Module__Group__16__Impl rule__Module__Group__17 )
            // InternalProjectGenerator.g:812:2: rule__Module__Group__16__Impl rule__Module__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Module__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__16"


    // $ANTLR start "rule__Module__Group__16__Impl"
    // InternalProjectGenerator.g:819:1: rule__Module__Group__16__Impl : ( ';' ) ;
    public final void rule__Module__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:823:1: ( ( ';' ) )
            // InternalProjectGenerator.g:824:1: ( ';' )
            {
            // InternalProjectGenerator.g:824:1: ( ';' )
            // InternalProjectGenerator.g:825:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_16()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__16__Impl"


    // $ANTLR start "rule__Module__Group__17"
    // InternalProjectGenerator.g:834:1: rule__Module__Group__17 : rule__Module__Group__17__Impl ;
    public final void rule__Module__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:838:1: ( rule__Module__Group__17__Impl )
            // InternalProjectGenerator.g:839:2: rule__Module__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__17"


    // $ANTLR start "rule__Module__Group__17__Impl"
    // InternalProjectGenerator.g:845:1: rule__Module__Group__17__Impl : ( '}' ) ;
    public final void rule__Module__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:849:1: ( ( '}' ) )
            // InternalProjectGenerator.g:850:1: ( '}' )
            {
            // InternalProjectGenerator.g:850:1: ( '}' )
            // InternalProjectGenerator.g:851:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_17()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group__17__Impl"


    // $ANTLR start "rule__Module__Group_9__0"
    // InternalProjectGenerator.g:861:1: rule__Module__Group_9__0 : rule__Module__Group_9__0__Impl rule__Module__Group_9__1 ;
    public final void rule__Module__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:865:1: ( rule__Module__Group_9__0__Impl rule__Module__Group_9__1 )
            // InternalProjectGenerator.g:866:2: rule__Module__Group_9__0__Impl rule__Module__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__0"


    // $ANTLR start "rule__Module__Group_9__0__Impl"
    // InternalProjectGenerator.g:873:1: rule__Module__Group_9__0__Impl : ( 'messageBundles' ) ;
    public final void rule__Module__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:877:1: ( ( 'messageBundles' ) )
            // InternalProjectGenerator.g:878:1: ( 'messageBundles' )
            {
            // InternalProjectGenerator.g:878:1: ( 'messageBundles' )
            // InternalProjectGenerator.g:879:2: 'messageBundles'
            {
             before(grammarAccess.getModuleAccess().getMessageBundlesKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getMessageBundlesKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__0__Impl"


    // $ANTLR start "rule__Module__Group_9__1"
    // InternalProjectGenerator.g:888:1: rule__Module__Group_9__1 : rule__Module__Group_9__1__Impl rule__Module__Group_9__2 ;
    public final void rule__Module__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:892:1: ( rule__Module__Group_9__1__Impl rule__Module__Group_9__2 )
            // InternalProjectGenerator.g:893:2: rule__Module__Group_9__1__Impl rule__Module__Group_9__2
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__1"


    // $ANTLR start "rule__Module__Group_9__1__Impl"
    // InternalProjectGenerator.g:900:1: rule__Module__Group_9__1__Impl : ( '{' ) ;
    public final void rule__Module__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:904:1: ( ( '{' ) )
            // InternalProjectGenerator.g:905:1: ( '{' )
            {
            // InternalProjectGenerator.g:905:1: ( '{' )
            // InternalProjectGenerator.g:906:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__1__Impl"


    // $ANTLR start "rule__Module__Group_9__2"
    // InternalProjectGenerator.g:915:1: rule__Module__Group_9__2 : rule__Module__Group_9__2__Impl rule__Module__Group_9__3 ;
    public final void rule__Module__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:919:1: ( rule__Module__Group_9__2__Impl rule__Module__Group_9__3 )
            // InternalProjectGenerator.g:920:2: rule__Module__Group_9__2__Impl rule__Module__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__Module__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__2"


    // $ANTLR start "rule__Module__Group_9__2__Impl"
    // InternalProjectGenerator.g:927:1: rule__Module__Group_9__2__Impl : ( ( ( rule__Module__MessageBundlesAssignment_9_2 ) ) ( ( rule__Module__MessageBundlesAssignment_9_2 )* ) ) ;
    public final void rule__Module__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:931:1: ( ( ( ( rule__Module__MessageBundlesAssignment_9_2 ) ) ( ( rule__Module__MessageBundlesAssignment_9_2 )* ) ) )
            // InternalProjectGenerator.g:932:1: ( ( ( rule__Module__MessageBundlesAssignment_9_2 ) ) ( ( rule__Module__MessageBundlesAssignment_9_2 )* ) )
            {
            // InternalProjectGenerator.g:932:1: ( ( ( rule__Module__MessageBundlesAssignment_9_2 ) ) ( ( rule__Module__MessageBundlesAssignment_9_2 )* ) )
            // InternalProjectGenerator.g:933:2: ( ( rule__Module__MessageBundlesAssignment_9_2 ) ) ( ( rule__Module__MessageBundlesAssignment_9_2 )* )
            {
            // InternalProjectGenerator.g:933:2: ( ( rule__Module__MessageBundlesAssignment_9_2 ) )
            // InternalProjectGenerator.g:934:3: ( rule__Module__MessageBundlesAssignment_9_2 )
            {
             before(grammarAccess.getModuleAccess().getMessageBundlesAssignment_9_2()); 
            // InternalProjectGenerator.g:935:3: ( rule__Module__MessageBundlesAssignment_9_2 )
            // InternalProjectGenerator.g:935:4: rule__Module__MessageBundlesAssignment_9_2
            {
            pushFollow(FOLLOW_13);
            rule__Module__MessageBundlesAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getMessageBundlesAssignment_9_2()); 

            }

            // InternalProjectGenerator.g:938:2: ( ( rule__Module__MessageBundlesAssignment_9_2 )* )
            // InternalProjectGenerator.g:939:3: ( rule__Module__MessageBundlesAssignment_9_2 )*
            {
             before(grammarAccess.getModuleAccess().getMessageBundlesAssignment_9_2()); 
            // InternalProjectGenerator.g:940:3: ( rule__Module__MessageBundlesAssignment_9_2 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectGenerator.g:940:4: rule__Module__MessageBundlesAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Module__MessageBundlesAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getMessageBundlesAssignment_9_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__2__Impl"


    // $ANTLR start "rule__Module__Group_9__3"
    // InternalProjectGenerator.g:949:1: rule__Module__Group_9__3 : rule__Module__Group_9__3__Impl rule__Module__Group_9__4 ;
    public final void rule__Module__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:953:1: ( rule__Module__Group_9__3__Impl rule__Module__Group_9__4 )
            // InternalProjectGenerator.g:954:2: rule__Module__Group_9__3__Impl rule__Module__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__3"


    // $ANTLR start "rule__Module__Group_9__3__Impl"
    // InternalProjectGenerator.g:961:1: rule__Module__Group_9__3__Impl : ( '}' ) ;
    public final void rule__Module__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:965:1: ( ( '}' ) )
            // InternalProjectGenerator.g:966:1: ( '}' )
            {
            // InternalProjectGenerator.g:966:1: ( '}' )
            // InternalProjectGenerator.g:967:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__3__Impl"


    // $ANTLR start "rule__Module__Group_9__4"
    // InternalProjectGenerator.g:976:1: rule__Module__Group_9__4 : rule__Module__Group_9__4__Impl ;
    public final void rule__Module__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:980:1: ( rule__Module__Group_9__4__Impl )
            // InternalProjectGenerator.g:981:2: rule__Module__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__4"


    // $ANTLR start "rule__Module__Group_9__4__Impl"
    // InternalProjectGenerator.g:987:1: rule__Module__Group_9__4__Impl : ( ';' ) ;
    public final void rule__Module__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:991:1: ( ( ';' ) )
            // InternalProjectGenerator.g:992:1: ( ';' )
            {
            // InternalProjectGenerator.g:992:1: ( ';' )
            // InternalProjectGenerator.g:993:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_9_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_9__4__Impl"


    // $ANTLR start "rule__Module__Group_10__0"
    // InternalProjectGenerator.g:1003:1: rule__Module__Group_10__0 : rule__Module__Group_10__0__Impl rule__Module__Group_10__1 ;
    public final void rule__Module__Group_10__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1007:1: ( rule__Module__Group_10__0__Impl rule__Module__Group_10__1 )
            // InternalProjectGenerator.g:1008:2: rule__Module__Group_10__0__Impl rule__Module__Group_10__1
            {
            pushFollow(FOLLOW_4);
            rule__Module__Group_10__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__0"


    // $ANTLR start "rule__Module__Group_10__0__Impl"
    // InternalProjectGenerator.g:1015:1: rule__Module__Group_10__0__Impl : ( 'observers' ) ;
    public final void rule__Module__Group_10__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1019:1: ( ( 'observers' ) )
            // InternalProjectGenerator.g:1020:1: ( 'observers' )
            {
            // InternalProjectGenerator.g:1020:1: ( 'observers' )
            // InternalProjectGenerator.g:1021:2: 'observers'
            {
             before(grammarAccess.getModuleAccess().getObserversKeyword_10_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getObserversKeyword_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__0__Impl"


    // $ANTLR start "rule__Module__Group_10__1"
    // InternalProjectGenerator.g:1030:1: rule__Module__Group_10__1 : rule__Module__Group_10__1__Impl rule__Module__Group_10__2 ;
    public final void rule__Module__Group_10__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1034:1: ( rule__Module__Group_10__1__Impl rule__Module__Group_10__2 )
            // InternalProjectGenerator.g:1035:2: rule__Module__Group_10__1__Impl rule__Module__Group_10__2
            {
            pushFollow(FOLLOW_3);
            rule__Module__Group_10__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__1"


    // $ANTLR start "rule__Module__Group_10__1__Impl"
    // InternalProjectGenerator.g:1042:1: rule__Module__Group_10__1__Impl : ( '{' ) ;
    public final void rule__Module__Group_10__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1046:1: ( ( '{' ) )
            // InternalProjectGenerator.g:1047:1: ( '{' )
            {
            // InternalProjectGenerator.g:1047:1: ( '{' )
            // InternalProjectGenerator.g:1048:2: '{'
            {
             before(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_10_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getLeftCurlyBracketKeyword_10_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__1__Impl"


    // $ANTLR start "rule__Module__Group_10__2"
    // InternalProjectGenerator.g:1057:1: rule__Module__Group_10__2 : rule__Module__Group_10__2__Impl rule__Module__Group_10__3 ;
    public final void rule__Module__Group_10__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1061:1: ( rule__Module__Group_10__2__Impl rule__Module__Group_10__3 )
            // InternalProjectGenerator.g:1062:2: rule__Module__Group_10__2__Impl rule__Module__Group_10__3
            {
            pushFollow(FOLLOW_12);
            rule__Module__Group_10__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__2"


    // $ANTLR start "rule__Module__Group_10__2__Impl"
    // InternalProjectGenerator.g:1069:1: rule__Module__Group_10__2__Impl : ( ( ( rule__Module__ObserversAssignment_10_2 ) ) ( ( rule__Module__ObserversAssignment_10_2 )* ) ) ;
    public final void rule__Module__Group_10__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1073:1: ( ( ( ( rule__Module__ObserversAssignment_10_2 ) ) ( ( rule__Module__ObserversAssignment_10_2 )* ) ) )
            // InternalProjectGenerator.g:1074:1: ( ( ( rule__Module__ObserversAssignment_10_2 ) ) ( ( rule__Module__ObserversAssignment_10_2 )* ) )
            {
            // InternalProjectGenerator.g:1074:1: ( ( ( rule__Module__ObserversAssignment_10_2 ) ) ( ( rule__Module__ObserversAssignment_10_2 )* ) )
            // InternalProjectGenerator.g:1075:2: ( ( rule__Module__ObserversAssignment_10_2 ) ) ( ( rule__Module__ObserversAssignment_10_2 )* )
            {
            // InternalProjectGenerator.g:1075:2: ( ( rule__Module__ObserversAssignment_10_2 ) )
            // InternalProjectGenerator.g:1076:3: ( rule__Module__ObserversAssignment_10_2 )
            {
             before(grammarAccess.getModuleAccess().getObserversAssignment_10_2()); 
            // InternalProjectGenerator.g:1077:3: ( rule__Module__ObserversAssignment_10_2 )
            // InternalProjectGenerator.g:1077:4: rule__Module__ObserversAssignment_10_2
            {
            pushFollow(FOLLOW_13);
            rule__Module__ObserversAssignment_10_2();

            state._fsp--;


            }

             after(grammarAccess.getModuleAccess().getObserversAssignment_10_2()); 

            }

            // InternalProjectGenerator.g:1080:2: ( ( rule__Module__ObserversAssignment_10_2 )* )
            // InternalProjectGenerator.g:1081:3: ( rule__Module__ObserversAssignment_10_2 )*
            {
             before(grammarAccess.getModuleAccess().getObserversAssignment_10_2()); 
            // InternalProjectGenerator.g:1082:3: ( rule__Module__ObserversAssignment_10_2 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_ID) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProjectGenerator.g:1082:4: rule__Module__ObserversAssignment_10_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Module__ObserversAssignment_10_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getModuleAccess().getObserversAssignment_10_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__2__Impl"


    // $ANTLR start "rule__Module__Group_10__3"
    // InternalProjectGenerator.g:1091:1: rule__Module__Group_10__3 : rule__Module__Group_10__3__Impl rule__Module__Group_10__4 ;
    public final void rule__Module__Group_10__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1095:1: ( rule__Module__Group_10__3__Impl rule__Module__Group_10__4 )
            // InternalProjectGenerator.g:1096:2: rule__Module__Group_10__3__Impl rule__Module__Group_10__4
            {
            pushFollow(FOLLOW_7);
            rule__Module__Group_10__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Module__Group_10__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__3"


    // $ANTLR start "rule__Module__Group_10__3__Impl"
    // InternalProjectGenerator.g:1103:1: rule__Module__Group_10__3__Impl : ( '}' ) ;
    public final void rule__Module__Group_10__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1107:1: ( ( '}' ) )
            // InternalProjectGenerator.g:1108:1: ( '}' )
            {
            // InternalProjectGenerator.g:1108:1: ( '}' )
            // InternalProjectGenerator.g:1109:2: '}'
            {
             before(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_10_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getRightCurlyBracketKeyword_10_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__3__Impl"


    // $ANTLR start "rule__Module__Group_10__4"
    // InternalProjectGenerator.g:1118:1: rule__Module__Group_10__4 : rule__Module__Group_10__4__Impl ;
    public final void rule__Module__Group_10__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1122:1: ( rule__Module__Group_10__4__Impl )
            // InternalProjectGenerator.g:1123:2: rule__Module__Group_10__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Module__Group_10__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__4"


    // $ANTLR start "rule__Module__Group_10__4__Impl"
    // InternalProjectGenerator.g:1129:1: rule__Module__Group_10__4__Impl : ( ';' ) ;
    public final void rule__Module__Group_10__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1133:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1134:1: ( ';' )
            {
            // InternalProjectGenerator.g:1134:1: ( ';' )
            // InternalProjectGenerator.g:1135:2: ';'
            {
             before(grammarAccess.getModuleAccess().getSemicolonKeyword_10_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getSemicolonKeyword_10_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__Group_10__4__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__0"
    // InternalProjectGenerator.g:1145:1: rule__ServiceConfig__Group__0 : rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1 ;
    public final void rule__ServiceConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1149:1: ( rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1 )
            // InternalProjectGenerator.g:1150:2: rule__ServiceConfig__Group__0__Impl rule__ServiceConfig__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__0"


    // $ANTLR start "rule__ServiceConfig__Group__0__Impl"
    // InternalProjectGenerator.g:1157:1: rule__ServiceConfig__Group__0__Impl : ( '{' ) ;
    public final void rule__ServiceConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1161:1: ( ( '{' ) )
            // InternalProjectGenerator.g:1162:1: ( '{' )
            {
            // InternalProjectGenerator.g:1162:1: ( '{' )
            // InternalProjectGenerator.g:1163:2: '{'
            {
             before(grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__1"
    // InternalProjectGenerator.g:1172:1: rule__ServiceConfig__Group__1 : rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2 ;
    public final void rule__ServiceConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1176:1: ( rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2 )
            // InternalProjectGenerator.g:1177:2: rule__ServiceConfig__Group__1__Impl rule__ServiceConfig__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__1"


    // $ANTLR start "rule__ServiceConfig__Group__1__Impl"
    // InternalProjectGenerator.g:1184:1: rule__ServiceConfig__Group__1__Impl : ( ( rule__ServiceConfig__Group_1__0 )? ) ;
    public final void rule__ServiceConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1188:1: ( ( ( rule__ServiceConfig__Group_1__0 )? ) )
            // InternalProjectGenerator.g:1189:1: ( ( rule__ServiceConfig__Group_1__0 )? )
            {
            // InternalProjectGenerator.g:1189:1: ( ( rule__ServiceConfig__Group_1__0 )? )
            // InternalProjectGenerator.g:1190:2: ( rule__ServiceConfig__Group_1__0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_1()); 
            // InternalProjectGenerator.g:1191:2: ( rule__ServiceConfig__Group_1__0 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalProjectGenerator.g:1191:3: rule__ServiceConfig__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__2"
    // InternalProjectGenerator.g:1199:1: rule__ServiceConfig__Group__2 : rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3 ;
    public final void rule__ServiceConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1203:1: ( rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3 )
            // InternalProjectGenerator.g:1204:2: rule__ServiceConfig__Group__2__Impl rule__ServiceConfig__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__ServiceConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__2"


    // $ANTLR start "rule__ServiceConfig__Group__2__Impl"
    // InternalProjectGenerator.g:1211:1: rule__ServiceConfig__Group__2__Impl : ( ( rule__ServiceConfig__Group_2__0 )? ) ;
    public final void rule__ServiceConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1215:1: ( ( ( rule__ServiceConfig__Group_2__0 )? ) )
            // InternalProjectGenerator.g:1216:1: ( ( rule__ServiceConfig__Group_2__0 )? )
            {
            // InternalProjectGenerator.g:1216:1: ( ( rule__ServiceConfig__Group_2__0 )? )
            // InternalProjectGenerator.g:1217:2: ( rule__ServiceConfig__Group_2__0 )?
            {
             before(grammarAccess.getServiceConfigAccess().getGroup_2()); 
            // InternalProjectGenerator.g:1218:2: ( rule__ServiceConfig__Group_2__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==30) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProjectGenerator.g:1218:3: rule__ServiceConfig__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServiceConfig__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServiceConfigAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__2__Impl"


    // $ANTLR start "rule__ServiceConfig__Group__3"
    // InternalProjectGenerator.g:1226:1: rule__ServiceConfig__Group__3 : rule__ServiceConfig__Group__3__Impl ;
    public final void rule__ServiceConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1230:1: ( rule__ServiceConfig__Group__3__Impl )
            // InternalProjectGenerator.g:1231:2: rule__ServiceConfig__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__3"


    // $ANTLR start "rule__ServiceConfig__Group__3__Impl"
    // InternalProjectGenerator.g:1237:1: rule__ServiceConfig__Group__3__Impl : ( '}' ) ;
    public final void rule__ServiceConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1241:1: ( ( '}' ) )
            // InternalProjectGenerator.g:1242:1: ( '}' )
            {
            // InternalProjectGenerator.g:1242:1: ( '}' )
            // InternalProjectGenerator.g:1243:2: '}'
            {
             before(grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group__3__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_1__0"
    // InternalProjectGenerator.g:1253:1: rule__ServiceConfig__Group_1__0 : rule__ServiceConfig__Group_1__0__Impl rule__ServiceConfig__Group_1__1 ;
    public final void rule__ServiceConfig__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1257:1: ( rule__ServiceConfig__Group_1__0__Impl rule__ServiceConfig__Group_1__1 )
            // InternalProjectGenerator.g:1258:2: rule__ServiceConfig__Group_1__0__Impl rule__ServiceConfig__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_1__0"


    // $ANTLR start "rule__ServiceConfig__Group_1__0__Impl"
    // InternalProjectGenerator.g:1265:1: rule__ServiceConfig__Group_1__0__Impl : ( 'observers' ) ;
    public final void rule__ServiceConfig__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1269:1: ( ( 'observers' ) )
            // InternalProjectGenerator.g:1270:1: ( 'observers' )
            {
            // InternalProjectGenerator.g:1270:1: ( 'observers' )
            // InternalProjectGenerator.g:1271:2: 'observers'
            {
             before(grammarAccess.getServiceConfigAccess().getObserversKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getObserversKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_1__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_1__1"
    // InternalProjectGenerator.g:1280:1: rule__ServiceConfig__Group_1__1 : rule__ServiceConfig__Group_1__1__Impl ;
    public final void rule__ServiceConfig__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1284:1: ( rule__ServiceConfig__Group_1__1__Impl )
            // InternalProjectGenerator.g:1285:2: rule__ServiceConfig__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_1__1"


    // $ANTLR start "rule__ServiceConfig__Group_1__1__Impl"
    // InternalProjectGenerator.g:1291:1: rule__ServiceConfig__Group_1__1__Impl : ( ( ( rule__ServiceConfig__ObserversAssignment_1_1 ) ) ( ( rule__ServiceConfig__ObserversAssignment_1_1 )* ) ) ;
    public final void rule__ServiceConfig__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1295:1: ( ( ( ( rule__ServiceConfig__ObserversAssignment_1_1 ) ) ( ( rule__ServiceConfig__ObserversAssignment_1_1 )* ) ) )
            // InternalProjectGenerator.g:1296:1: ( ( ( rule__ServiceConfig__ObserversAssignment_1_1 ) ) ( ( rule__ServiceConfig__ObserversAssignment_1_1 )* ) )
            {
            // InternalProjectGenerator.g:1296:1: ( ( ( rule__ServiceConfig__ObserversAssignment_1_1 ) ) ( ( rule__ServiceConfig__ObserversAssignment_1_1 )* ) )
            // InternalProjectGenerator.g:1297:2: ( ( rule__ServiceConfig__ObserversAssignment_1_1 ) ) ( ( rule__ServiceConfig__ObserversAssignment_1_1 )* )
            {
            // InternalProjectGenerator.g:1297:2: ( ( rule__ServiceConfig__ObserversAssignment_1_1 ) )
            // InternalProjectGenerator.g:1298:3: ( rule__ServiceConfig__ObserversAssignment_1_1 )
            {
             before(grammarAccess.getServiceConfigAccess().getObserversAssignment_1_1()); 
            // InternalProjectGenerator.g:1299:3: ( rule__ServiceConfig__ObserversAssignment_1_1 )
            // InternalProjectGenerator.g:1299:4: rule__ServiceConfig__ObserversAssignment_1_1
            {
            pushFollow(FOLLOW_13);
            rule__ServiceConfig__ObserversAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getObserversAssignment_1_1()); 

            }

            // InternalProjectGenerator.g:1302:2: ( ( rule__ServiceConfig__ObserversAssignment_1_1 )* )
            // InternalProjectGenerator.g:1303:3: ( rule__ServiceConfig__ObserversAssignment_1_1 )*
            {
             before(grammarAccess.getServiceConfigAccess().getObserversAssignment_1_1()); 
            // InternalProjectGenerator.g:1304:3: ( rule__ServiceConfig__ObserversAssignment_1_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalProjectGenerator.g:1304:4: rule__ServiceConfig__ObserversAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServiceConfig__ObserversAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getObserversAssignment_1_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_1__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_2__0"
    // InternalProjectGenerator.g:1314:1: rule__ServiceConfig__Group_2__0 : rule__ServiceConfig__Group_2__0__Impl rule__ServiceConfig__Group_2__1 ;
    public final void rule__ServiceConfig__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1318:1: ( rule__ServiceConfig__Group_2__0__Impl rule__ServiceConfig__Group_2__1 )
            // InternalProjectGenerator.g:1319:2: rule__ServiceConfig__Group_2__0__Impl rule__ServiceConfig__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__ServiceConfig__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__0"


    // $ANTLR start "rule__ServiceConfig__Group_2__0__Impl"
    // InternalProjectGenerator.g:1326:1: rule__ServiceConfig__Group_2__0__Impl : ( 'messageBundles' ) ;
    public final void rule__ServiceConfig__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1330:1: ( ( 'messageBundles' ) )
            // InternalProjectGenerator.g:1331:1: ( 'messageBundles' )
            {
            // InternalProjectGenerator.g:1331:1: ( 'messageBundles' )
            // InternalProjectGenerator.g:1332:2: 'messageBundles'
            {
             before(grammarAccess.getServiceConfigAccess().getMessageBundlesKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getMessageBundlesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__0__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_2__1"
    // InternalProjectGenerator.g:1341:1: rule__ServiceConfig__Group_2__1 : rule__ServiceConfig__Group_2__1__Impl rule__ServiceConfig__Group_2__2 ;
    public final void rule__ServiceConfig__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1345:1: ( rule__ServiceConfig__Group_2__1__Impl rule__ServiceConfig__Group_2__2 )
            // InternalProjectGenerator.g:1346:2: rule__ServiceConfig__Group_2__1__Impl rule__ServiceConfig__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__ServiceConfig__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__1"


    // $ANTLR start "rule__ServiceConfig__Group_2__1__Impl"
    // InternalProjectGenerator.g:1353:1: rule__ServiceConfig__Group_2__1__Impl : ( '{' ) ;
    public final void rule__ServiceConfig__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1357:1: ( ( '{' ) )
            // InternalProjectGenerator.g:1358:1: ( '{' )
            {
            // InternalProjectGenerator.g:1358:1: ( '{' )
            // InternalProjectGenerator.g:1359:2: '{'
            {
             before(grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__1__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_2__2"
    // InternalProjectGenerator.g:1368:1: rule__ServiceConfig__Group_2__2 : rule__ServiceConfig__Group_2__2__Impl rule__ServiceConfig__Group_2__3 ;
    public final void rule__ServiceConfig__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1372:1: ( rule__ServiceConfig__Group_2__2__Impl rule__ServiceConfig__Group_2__3 )
            // InternalProjectGenerator.g:1373:2: rule__ServiceConfig__Group_2__2__Impl rule__ServiceConfig__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__ServiceConfig__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__2"


    // $ANTLR start "rule__ServiceConfig__Group_2__2__Impl"
    // InternalProjectGenerator.g:1380:1: rule__ServiceConfig__Group_2__2__Impl : ( ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 ) ) ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )* ) ) ;
    public final void rule__ServiceConfig__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1384:1: ( ( ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 ) ) ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )* ) ) )
            // InternalProjectGenerator.g:1385:1: ( ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 ) ) ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )* ) )
            {
            // InternalProjectGenerator.g:1385:1: ( ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 ) ) ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )* ) )
            // InternalProjectGenerator.g:1386:2: ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 ) ) ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )* )
            {
            // InternalProjectGenerator.g:1386:2: ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 ) )
            // InternalProjectGenerator.g:1387:3: ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )
            {
             before(grammarAccess.getServiceConfigAccess().getMessageBundlesAssignment_2_2()); 
            // InternalProjectGenerator.g:1388:3: ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )
            // InternalProjectGenerator.g:1388:4: rule__ServiceConfig__MessageBundlesAssignment_2_2
            {
            pushFollow(FOLLOW_13);
            rule__ServiceConfig__MessageBundlesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getServiceConfigAccess().getMessageBundlesAssignment_2_2()); 

            }

            // InternalProjectGenerator.g:1391:2: ( ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )* )
            // InternalProjectGenerator.g:1392:3: ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )*
            {
             before(grammarAccess.getServiceConfigAccess().getMessageBundlesAssignment_2_2()); 
            // InternalProjectGenerator.g:1393:3: ( rule__ServiceConfig__MessageBundlesAssignment_2_2 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalProjectGenerator.g:1393:4: rule__ServiceConfig__MessageBundlesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ServiceConfig__MessageBundlesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getServiceConfigAccess().getMessageBundlesAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__2__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_2__3"
    // InternalProjectGenerator.g:1402:1: rule__ServiceConfig__Group_2__3 : rule__ServiceConfig__Group_2__3__Impl rule__ServiceConfig__Group_2__4 ;
    public final void rule__ServiceConfig__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1406:1: ( rule__ServiceConfig__Group_2__3__Impl rule__ServiceConfig__Group_2__4 )
            // InternalProjectGenerator.g:1407:2: rule__ServiceConfig__Group_2__3__Impl rule__ServiceConfig__Group_2__4
            {
            pushFollow(FOLLOW_7);
            rule__ServiceConfig__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__3"


    // $ANTLR start "rule__ServiceConfig__Group_2__3__Impl"
    // InternalProjectGenerator.g:1414:1: rule__ServiceConfig__Group_2__3__Impl : ( '}' ) ;
    public final void rule__ServiceConfig__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1418:1: ( ( '}' ) )
            // InternalProjectGenerator.g:1419:1: ( '}' )
            {
            // InternalProjectGenerator.g:1419:1: ( '}' )
            // InternalProjectGenerator.g:1420:2: '}'
            {
             before(grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__3__Impl"


    // $ANTLR start "rule__ServiceConfig__Group_2__4"
    // InternalProjectGenerator.g:1429:1: rule__ServiceConfig__Group_2__4 : rule__ServiceConfig__Group_2__4__Impl ;
    public final void rule__ServiceConfig__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1433:1: ( rule__ServiceConfig__Group_2__4__Impl )
            // InternalProjectGenerator.g:1434:2: rule__ServiceConfig__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServiceConfig__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__4"


    // $ANTLR start "rule__ServiceConfig__Group_2__4__Impl"
    // InternalProjectGenerator.g:1440:1: rule__ServiceConfig__Group_2__4__Impl : ( ';' ) ;
    public final void rule__ServiceConfig__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1444:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1445:1: ( ';' )
            {
            // InternalProjectGenerator.g:1445:1: ( ';' )
            // InternalProjectGenerator.g:1446:2: ';'
            {
             before(grammarAccess.getServiceConfigAccess().getSemicolonKeyword_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getSemicolonKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__Group_2__4__Impl"


    // $ANTLR start "rule__Observer__Group__0"
    // InternalProjectGenerator.g:1456:1: rule__Observer__Group__0 : rule__Observer__Group__0__Impl rule__Observer__Group__1 ;
    public final void rule__Observer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1460:1: ( rule__Observer__Group__0__Impl rule__Observer__Group__1 )
            // InternalProjectGenerator.g:1461:2: rule__Observer__Group__0__Impl rule__Observer__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Observer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__0"


    // $ANTLR start "rule__Observer__Group__0__Impl"
    // InternalProjectGenerator.g:1468:1: rule__Observer__Group__0__Impl : ( ( rule__Observer__NameAssignment_0 ) ) ;
    public final void rule__Observer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1472:1: ( ( ( rule__Observer__NameAssignment_0 ) ) )
            // InternalProjectGenerator.g:1473:1: ( ( rule__Observer__NameAssignment_0 ) )
            {
            // InternalProjectGenerator.g:1473:1: ( ( rule__Observer__NameAssignment_0 ) )
            // InternalProjectGenerator.g:1474:2: ( rule__Observer__NameAssignment_0 )
            {
             before(grammarAccess.getObserverAccess().getNameAssignment_0()); 
            // InternalProjectGenerator.g:1475:2: ( rule__Observer__NameAssignment_0 )
            // InternalProjectGenerator.g:1475:3: rule__Observer__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Observer__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__0__Impl"


    // $ANTLR start "rule__Observer__Group__1"
    // InternalProjectGenerator.g:1483:1: rule__Observer__Group__1 : rule__Observer__Group__1__Impl rule__Observer__Group__2 ;
    public final void rule__Observer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1487:1: ( rule__Observer__Group__1__Impl rule__Observer__Group__2 )
            // InternalProjectGenerator.g:1488:2: rule__Observer__Group__1__Impl rule__Observer__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Observer__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__1"


    // $ANTLR start "rule__Observer__Group__1__Impl"
    // InternalProjectGenerator.g:1495:1: rule__Observer__Group__1__Impl : ( '{' ) ;
    public final void rule__Observer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1499:1: ( ( '{' ) )
            // InternalProjectGenerator.g:1500:1: ( '{' )
            {
            // InternalProjectGenerator.g:1500:1: ( '{' )
            // InternalProjectGenerator.g:1501:2: '{'
            {
             before(grammarAccess.getObserverAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__1__Impl"


    // $ANTLR start "rule__Observer__Group__2"
    // InternalProjectGenerator.g:1510:1: rule__Observer__Group__2 : rule__Observer__Group__2__Impl rule__Observer__Group__3 ;
    public final void rule__Observer__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1514:1: ( rule__Observer__Group__2__Impl rule__Observer__Group__3 )
            // InternalProjectGenerator.g:1515:2: rule__Observer__Group__2__Impl rule__Observer__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Observer__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__2"


    // $ANTLR start "rule__Observer__Group__2__Impl"
    // InternalProjectGenerator.g:1522:1: rule__Observer__Group__2__Impl : ( 'type' ) ;
    public final void rule__Observer__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1526:1: ( ( 'type' ) )
            // InternalProjectGenerator.g:1527:1: ( 'type' )
            {
            // InternalProjectGenerator.g:1527:1: ( 'type' )
            // InternalProjectGenerator.g:1528:2: 'type'
            {
             before(grammarAccess.getObserverAccess().getTypeKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__2__Impl"


    // $ANTLR start "rule__Observer__Group__3"
    // InternalProjectGenerator.g:1537:1: rule__Observer__Group__3 : rule__Observer__Group__3__Impl rule__Observer__Group__4 ;
    public final void rule__Observer__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1541:1: ( rule__Observer__Group__3__Impl rule__Observer__Group__4 )
            // InternalProjectGenerator.g:1542:2: rule__Observer__Group__3__Impl rule__Observer__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Observer__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__3"


    // $ANTLR start "rule__Observer__Group__3__Impl"
    // InternalProjectGenerator.g:1549:1: rule__Observer__Group__3__Impl : ( ( rule__Observer__TypeAssignment_3 ) ) ;
    public final void rule__Observer__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1553:1: ( ( ( rule__Observer__TypeAssignment_3 ) ) )
            // InternalProjectGenerator.g:1554:1: ( ( rule__Observer__TypeAssignment_3 ) )
            {
            // InternalProjectGenerator.g:1554:1: ( ( rule__Observer__TypeAssignment_3 ) )
            // InternalProjectGenerator.g:1555:2: ( rule__Observer__TypeAssignment_3 )
            {
             before(grammarAccess.getObserverAccess().getTypeAssignment_3()); 
            // InternalProjectGenerator.g:1556:2: ( rule__Observer__TypeAssignment_3 )
            // InternalProjectGenerator.g:1556:3: rule__Observer__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Observer__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getTypeAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__3__Impl"


    // $ANTLR start "rule__Observer__Group__4"
    // InternalProjectGenerator.g:1564:1: rule__Observer__Group__4 : rule__Observer__Group__4__Impl rule__Observer__Group__5 ;
    public final void rule__Observer__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1568:1: ( rule__Observer__Group__4__Impl rule__Observer__Group__5 )
            // InternalProjectGenerator.g:1569:2: rule__Observer__Group__4__Impl rule__Observer__Group__5
            {
            pushFollow(FOLLOW_17);
            rule__Observer__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__4"


    // $ANTLR start "rule__Observer__Group__4__Impl"
    // InternalProjectGenerator.g:1576:1: rule__Observer__Group__4__Impl : ( ';' ) ;
    public final void rule__Observer__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1580:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1581:1: ( ';' )
            {
            // InternalProjectGenerator.g:1581:1: ( ';' )
            // InternalProjectGenerator.g:1582:2: ';'
            {
             before(grammarAccess.getObserverAccess().getSemicolonKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getSemicolonKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__4__Impl"


    // $ANTLR start "rule__Observer__Group__5"
    // InternalProjectGenerator.g:1591:1: rule__Observer__Group__5 : rule__Observer__Group__5__Impl rule__Observer__Group__6 ;
    public final void rule__Observer__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1595:1: ( rule__Observer__Group__5__Impl rule__Observer__Group__6 )
            // InternalProjectGenerator.g:1596:2: rule__Observer__Group__5__Impl rule__Observer__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Observer__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__5"


    // $ANTLR start "rule__Observer__Group__5__Impl"
    // InternalProjectGenerator.g:1603:1: rule__Observer__Group__5__Impl : ( 'during' ) ;
    public final void rule__Observer__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1607:1: ( ( 'during' ) )
            // InternalProjectGenerator.g:1608:1: ( 'during' )
            {
            // InternalProjectGenerator.g:1608:1: ( 'during' )
            // InternalProjectGenerator.g:1609:2: 'during'
            {
             before(grammarAccess.getObserverAccess().getDuringKeyword_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getDuringKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__5__Impl"


    // $ANTLR start "rule__Observer__Group__6"
    // InternalProjectGenerator.g:1618:1: rule__Observer__Group__6 : rule__Observer__Group__6__Impl rule__Observer__Group__7 ;
    public final void rule__Observer__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1622:1: ( rule__Observer__Group__6__Impl rule__Observer__Group__7 )
            // InternalProjectGenerator.g:1623:2: rule__Observer__Group__6__Impl rule__Observer__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Observer__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__6"


    // $ANTLR start "rule__Observer__Group__6__Impl"
    // InternalProjectGenerator.g:1630:1: rule__Observer__Group__6__Impl : ( ( rule__Observer__DuringAssignment_6 ) ) ;
    public final void rule__Observer__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1634:1: ( ( ( rule__Observer__DuringAssignment_6 ) ) )
            // InternalProjectGenerator.g:1635:1: ( ( rule__Observer__DuringAssignment_6 ) )
            {
            // InternalProjectGenerator.g:1635:1: ( ( rule__Observer__DuringAssignment_6 ) )
            // InternalProjectGenerator.g:1636:2: ( rule__Observer__DuringAssignment_6 )
            {
             before(grammarAccess.getObserverAccess().getDuringAssignment_6()); 
            // InternalProjectGenerator.g:1637:2: ( rule__Observer__DuringAssignment_6 )
            // InternalProjectGenerator.g:1637:3: rule__Observer__DuringAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Observer__DuringAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getDuringAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__6__Impl"


    // $ANTLR start "rule__Observer__Group__7"
    // InternalProjectGenerator.g:1645:1: rule__Observer__Group__7 : rule__Observer__Group__7__Impl rule__Observer__Group__8 ;
    public final void rule__Observer__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1649:1: ( rule__Observer__Group__7__Impl rule__Observer__Group__8 )
            // InternalProjectGenerator.g:1650:2: rule__Observer__Group__7__Impl rule__Observer__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__Observer__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__7"


    // $ANTLR start "rule__Observer__Group__7__Impl"
    // InternalProjectGenerator.g:1657:1: rule__Observer__Group__7__Impl : ( ';' ) ;
    public final void rule__Observer__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1661:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1662:1: ( ';' )
            {
            // InternalProjectGenerator.g:1662:1: ( ';' )
            // InternalProjectGenerator.g:1663:2: ';'
            {
             before(grammarAccess.getObserverAccess().getSemicolonKeyword_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getSemicolonKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__7__Impl"


    // $ANTLR start "rule__Observer__Group__8"
    // InternalProjectGenerator.g:1672:1: rule__Observer__Group__8 : rule__Observer__Group__8__Impl rule__Observer__Group__9 ;
    public final void rule__Observer__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1676:1: ( rule__Observer__Group__8__Impl rule__Observer__Group__9 )
            // InternalProjectGenerator.g:1677:2: rule__Observer__Group__8__Impl rule__Observer__Group__9
            {
            pushFollow(FOLLOW_20);
            rule__Observer__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__8"


    // $ANTLR start "rule__Observer__Group__8__Impl"
    // InternalProjectGenerator.g:1684:1: rule__Observer__Group__8__Impl : ( 'notify' ) ;
    public final void rule__Observer__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1688:1: ( ( 'notify' ) )
            // InternalProjectGenerator.g:1689:1: ( 'notify' )
            {
            // InternalProjectGenerator.g:1689:1: ( 'notify' )
            // InternalProjectGenerator.g:1690:2: 'notify'
            {
             before(grammarAccess.getObserverAccess().getNotifyKeyword_8()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getNotifyKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__8__Impl"


    // $ANTLR start "rule__Observer__Group__9"
    // InternalProjectGenerator.g:1699:1: rule__Observer__Group__9 : rule__Observer__Group__9__Impl rule__Observer__Group__10 ;
    public final void rule__Observer__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1703:1: ( rule__Observer__Group__9__Impl rule__Observer__Group__10 )
            // InternalProjectGenerator.g:1704:2: rule__Observer__Group__9__Impl rule__Observer__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Observer__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__9"


    // $ANTLR start "rule__Observer__Group__9__Impl"
    // InternalProjectGenerator.g:1711:1: rule__Observer__Group__9__Impl : ( ( rule__Observer__NotifyAssignment_9 ) ) ;
    public final void rule__Observer__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1715:1: ( ( ( rule__Observer__NotifyAssignment_9 ) ) )
            // InternalProjectGenerator.g:1716:1: ( ( rule__Observer__NotifyAssignment_9 ) )
            {
            // InternalProjectGenerator.g:1716:1: ( ( rule__Observer__NotifyAssignment_9 ) )
            // InternalProjectGenerator.g:1717:2: ( rule__Observer__NotifyAssignment_9 )
            {
             before(grammarAccess.getObserverAccess().getNotifyAssignment_9()); 
            // InternalProjectGenerator.g:1718:2: ( rule__Observer__NotifyAssignment_9 )
            // InternalProjectGenerator.g:1718:3: rule__Observer__NotifyAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Observer__NotifyAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getNotifyAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__9__Impl"


    // $ANTLR start "rule__Observer__Group__10"
    // InternalProjectGenerator.g:1726:1: rule__Observer__Group__10 : rule__Observer__Group__10__Impl rule__Observer__Group__11 ;
    public final void rule__Observer__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1730:1: ( rule__Observer__Group__10__Impl rule__Observer__Group__11 )
            // InternalProjectGenerator.g:1731:2: rule__Observer__Group__10__Impl rule__Observer__Group__11
            {
            pushFollow(FOLLOW_21);
            rule__Observer__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__10"


    // $ANTLR start "rule__Observer__Group__10__Impl"
    // InternalProjectGenerator.g:1738:1: rule__Observer__Group__10__Impl : ( ';' ) ;
    public final void rule__Observer__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1742:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1743:1: ( ';' )
            {
            // InternalProjectGenerator.g:1743:1: ( ';' )
            // InternalProjectGenerator.g:1744:2: ';'
            {
             before(grammarAccess.getObserverAccess().getSemicolonKeyword_10()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getSemicolonKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__10__Impl"


    // $ANTLR start "rule__Observer__Group__11"
    // InternalProjectGenerator.g:1753:1: rule__Observer__Group__11 : rule__Observer__Group__11__Impl rule__Observer__Group__12 ;
    public final void rule__Observer__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1757:1: ( rule__Observer__Group__11__Impl rule__Observer__Group__12 )
            // InternalProjectGenerator.g:1758:2: rule__Observer__Group__11__Impl rule__Observer__Group__12
            {
            pushFollow(FOLLOW_16);
            rule__Observer__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__11"


    // $ANTLR start "rule__Observer__Group__11__Impl"
    // InternalProjectGenerator.g:1765:1: rule__Observer__Group__11__Impl : ( 'delegate' ) ;
    public final void rule__Observer__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1769:1: ( ( 'delegate' ) )
            // InternalProjectGenerator.g:1770:1: ( 'delegate' )
            {
            // InternalProjectGenerator.g:1770:1: ( 'delegate' )
            // InternalProjectGenerator.g:1771:2: 'delegate'
            {
             before(grammarAccess.getObserverAccess().getDelegateKeyword_11()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getDelegateKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__11__Impl"


    // $ANTLR start "rule__Observer__Group__12"
    // InternalProjectGenerator.g:1780:1: rule__Observer__Group__12 : rule__Observer__Group__12__Impl rule__Observer__Group__13 ;
    public final void rule__Observer__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1784:1: ( rule__Observer__Group__12__Impl rule__Observer__Group__13 )
            // InternalProjectGenerator.g:1785:2: rule__Observer__Group__12__Impl rule__Observer__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__Observer__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__12"


    // $ANTLR start "rule__Observer__Group__12__Impl"
    // InternalProjectGenerator.g:1792:1: rule__Observer__Group__12__Impl : ( ( rule__Observer__ClassNameAssignment_12 ) ) ;
    public final void rule__Observer__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1796:1: ( ( ( rule__Observer__ClassNameAssignment_12 ) ) )
            // InternalProjectGenerator.g:1797:1: ( ( rule__Observer__ClassNameAssignment_12 ) )
            {
            // InternalProjectGenerator.g:1797:1: ( ( rule__Observer__ClassNameAssignment_12 ) )
            // InternalProjectGenerator.g:1798:2: ( rule__Observer__ClassNameAssignment_12 )
            {
             before(grammarAccess.getObserverAccess().getClassNameAssignment_12()); 
            // InternalProjectGenerator.g:1799:2: ( rule__Observer__ClassNameAssignment_12 )
            // InternalProjectGenerator.g:1799:3: rule__Observer__ClassNameAssignment_12
            {
            pushFollow(FOLLOW_2);
            rule__Observer__ClassNameAssignment_12();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getClassNameAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__12__Impl"


    // $ANTLR start "rule__Observer__Group__13"
    // InternalProjectGenerator.g:1807:1: rule__Observer__Group__13 : rule__Observer__Group__13__Impl rule__Observer__Group__14 ;
    public final void rule__Observer__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1811:1: ( rule__Observer__Group__13__Impl rule__Observer__Group__14 )
            // InternalProjectGenerator.g:1812:2: rule__Observer__Group__13__Impl rule__Observer__Group__14
            {
            pushFollow(FOLLOW_22);
            rule__Observer__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__13"


    // $ANTLR start "rule__Observer__Group__13__Impl"
    // InternalProjectGenerator.g:1819:1: rule__Observer__Group__13__Impl : ( ';' ) ;
    public final void rule__Observer__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1823:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1824:1: ( ';' )
            {
            // InternalProjectGenerator.g:1824:1: ( ';' )
            // InternalProjectGenerator.g:1825:2: ';'
            {
             before(grammarAccess.getObserverAccess().getSemicolonKeyword_13()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getSemicolonKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__13__Impl"


    // $ANTLR start "rule__Observer__Group__14"
    // InternalProjectGenerator.g:1834:1: rule__Observer__Group__14 : rule__Observer__Group__14__Impl rule__Observer__Group__15 ;
    public final void rule__Observer__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1838:1: ( rule__Observer__Group__14__Impl rule__Observer__Group__15 )
            // InternalProjectGenerator.g:1839:2: rule__Observer__Group__14__Impl rule__Observer__Group__15
            {
            pushFollow(FOLLOW_22);
            rule__Observer__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__14"


    // $ANTLR start "rule__Observer__Group__14__Impl"
    // InternalProjectGenerator.g:1846:1: rule__Observer__Group__14__Impl : ( ( rule__Observer__Group_14__0 )? ) ;
    public final void rule__Observer__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1850:1: ( ( ( rule__Observer__Group_14__0 )? ) )
            // InternalProjectGenerator.g:1851:1: ( ( rule__Observer__Group_14__0 )? )
            {
            // InternalProjectGenerator.g:1851:1: ( ( rule__Observer__Group_14__0 )? )
            // InternalProjectGenerator.g:1852:2: ( rule__Observer__Group_14__0 )?
            {
             before(grammarAccess.getObserverAccess().getGroup_14()); 
            // InternalProjectGenerator.g:1853:2: ( rule__Observer__Group_14__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==36) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalProjectGenerator.g:1853:3: rule__Observer__Group_14__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Observer__Group_14__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getObserverAccess().getGroup_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__14__Impl"


    // $ANTLR start "rule__Observer__Group__15"
    // InternalProjectGenerator.g:1861:1: rule__Observer__Group__15 : rule__Observer__Group__15__Impl ;
    public final void rule__Observer__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1865:1: ( rule__Observer__Group__15__Impl )
            // InternalProjectGenerator.g:1866:2: rule__Observer__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group__15__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__15"


    // $ANTLR start "rule__Observer__Group__15__Impl"
    // InternalProjectGenerator.g:1872:1: rule__Observer__Group__15__Impl : ( '}' ) ;
    public final void rule__Observer__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1876:1: ( ( '}' ) )
            // InternalProjectGenerator.g:1877:1: ( '}' )
            {
            // InternalProjectGenerator.g:1877:1: ( '}' )
            // InternalProjectGenerator.g:1878:2: '}'
            {
             before(grammarAccess.getObserverAccess().getRightCurlyBracketKeyword_15()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getRightCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group__15__Impl"


    // $ANTLR start "rule__Observer__Group_14__0"
    // InternalProjectGenerator.g:1888:1: rule__Observer__Group_14__0 : rule__Observer__Group_14__0__Impl rule__Observer__Group_14__1 ;
    public final void rule__Observer__Group_14__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1892:1: ( rule__Observer__Group_14__0__Impl rule__Observer__Group_14__1 )
            // InternalProjectGenerator.g:1893:2: rule__Observer__Group_14__0__Impl rule__Observer__Group_14__1
            {
            pushFollow(FOLLOW_16);
            rule__Observer__Group_14__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group_14__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_14__0"


    // $ANTLR start "rule__Observer__Group_14__0__Impl"
    // InternalProjectGenerator.g:1900:1: rule__Observer__Group_14__0__Impl : ( 'qualifier' ) ;
    public final void rule__Observer__Group_14__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1904:1: ( ( 'qualifier' ) )
            // InternalProjectGenerator.g:1905:1: ( 'qualifier' )
            {
            // InternalProjectGenerator.g:1905:1: ( 'qualifier' )
            // InternalProjectGenerator.g:1906:2: 'qualifier'
            {
             before(grammarAccess.getObserverAccess().getQualifierKeyword_14_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getQualifierKeyword_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_14__0__Impl"


    // $ANTLR start "rule__Observer__Group_14__1"
    // InternalProjectGenerator.g:1915:1: rule__Observer__Group_14__1 : rule__Observer__Group_14__1__Impl rule__Observer__Group_14__2 ;
    public final void rule__Observer__Group_14__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1919:1: ( rule__Observer__Group_14__1__Impl rule__Observer__Group_14__2 )
            // InternalProjectGenerator.g:1920:2: rule__Observer__Group_14__1__Impl rule__Observer__Group_14__2
            {
            pushFollow(FOLLOW_7);
            rule__Observer__Group_14__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Observer__Group_14__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_14__1"


    // $ANTLR start "rule__Observer__Group_14__1__Impl"
    // InternalProjectGenerator.g:1927:1: rule__Observer__Group_14__1__Impl : ( ( rule__Observer__QualifierAssignment_14_1 ) ) ;
    public final void rule__Observer__Group_14__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1931:1: ( ( ( rule__Observer__QualifierAssignment_14_1 ) ) )
            // InternalProjectGenerator.g:1932:1: ( ( rule__Observer__QualifierAssignment_14_1 ) )
            {
            // InternalProjectGenerator.g:1932:1: ( ( rule__Observer__QualifierAssignment_14_1 ) )
            // InternalProjectGenerator.g:1933:2: ( rule__Observer__QualifierAssignment_14_1 )
            {
             before(grammarAccess.getObserverAccess().getQualifierAssignment_14_1()); 
            // InternalProjectGenerator.g:1934:2: ( rule__Observer__QualifierAssignment_14_1 )
            // InternalProjectGenerator.g:1934:3: rule__Observer__QualifierAssignment_14_1
            {
            pushFollow(FOLLOW_2);
            rule__Observer__QualifierAssignment_14_1();

            state._fsp--;


            }

             after(grammarAccess.getObserverAccess().getQualifierAssignment_14_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_14__1__Impl"


    // $ANTLR start "rule__Observer__Group_14__2"
    // InternalProjectGenerator.g:1942:1: rule__Observer__Group_14__2 : rule__Observer__Group_14__2__Impl ;
    public final void rule__Observer__Group_14__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1946:1: ( rule__Observer__Group_14__2__Impl )
            // InternalProjectGenerator.g:1947:2: rule__Observer__Group_14__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Observer__Group_14__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_14__2"


    // $ANTLR start "rule__Observer__Group_14__2__Impl"
    // InternalProjectGenerator.g:1953:1: rule__Observer__Group_14__2__Impl : ( ';' ) ;
    public final void rule__Observer__Group_14__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1957:1: ( ( ';' ) )
            // InternalProjectGenerator.g:1958:1: ( ';' )
            {
            // InternalProjectGenerator.g:1958:1: ( ';' )
            // InternalProjectGenerator.g:1959:2: ';'
            {
             before(grammarAccess.getObserverAccess().getSemicolonKeyword_14_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getSemicolonKeyword_14_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__Group_14__2__Impl"


    // $ANTLR start "rule__JpaConfig__Group__0"
    // InternalProjectGenerator.g:1969:1: rule__JpaConfig__Group__0 : rule__JpaConfig__Group__0__Impl rule__JpaConfig__Group__1 ;
    public final void rule__JpaConfig__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1973:1: ( rule__JpaConfig__Group__0__Impl rule__JpaConfig__Group__1 )
            // InternalProjectGenerator.g:1974:2: rule__JpaConfig__Group__0__Impl rule__JpaConfig__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__JpaConfig__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__0"


    // $ANTLR start "rule__JpaConfig__Group__0__Impl"
    // InternalProjectGenerator.g:1981:1: rule__JpaConfig__Group__0__Impl : ( '{' ) ;
    public final void rule__JpaConfig__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:1985:1: ( ( '{' ) )
            // InternalProjectGenerator.g:1986:1: ( '{' )
            {
            // InternalProjectGenerator.g:1986:1: ( '{' )
            // InternalProjectGenerator.g:1987:2: '{'
            {
             before(grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__0__Impl"


    // $ANTLR start "rule__JpaConfig__Group__1"
    // InternalProjectGenerator.g:1996:1: rule__JpaConfig__Group__1 : rule__JpaConfig__Group__1__Impl rule__JpaConfig__Group__2 ;
    public final void rule__JpaConfig__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2000:1: ( rule__JpaConfig__Group__1__Impl rule__JpaConfig__Group__2 )
            // InternalProjectGenerator.g:2001:2: rule__JpaConfig__Group__1__Impl rule__JpaConfig__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__JpaConfig__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__1"


    // $ANTLR start "rule__JpaConfig__Group__1__Impl"
    // InternalProjectGenerator.g:2008:1: rule__JpaConfig__Group__1__Impl : ( 'localizedEnums' ) ;
    public final void rule__JpaConfig__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2012:1: ( ( 'localizedEnums' ) )
            // InternalProjectGenerator.g:2013:1: ( 'localizedEnums' )
            {
            // InternalProjectGenerator.g:2013:1: ( 'localizedEnums' )
            // InternalProjectGenerator.g:2014:2: 'localizedEnums'
            {
             before(grammarAccess.getJpaConfigAccess().getLocalizedEnumsKeyword_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getLocalizedEnumsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__1__Impl"


    // $ANTLR start "rule__JpaConfig__Group__2"
    // InternalProjectGenerator.g:2023:1: rule__JpaConfig__Group__2 : rule__JpaConfig__Group__2__Impl rule__JpaConfig__Group__3 ;
    public final void rule__JpaConfig__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2027:1: ( rule__JpaConfig__Group__2__Impl rule__JpaConfig__Group__3 )
            // InternalProjectGenerator.g:2028:2: rule__JpaConfig__Group__2__Impl rule__JpaConfig__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__JpaConfig__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__2"


    // $ANTLR start "rule__JpaConfig__Group__2__Impl"
    // InternalProjectGenerator.g:2035:1: rule__JpaConfig__Group__2__Impl : ( '{' ) ;
    public final void rule__JpaConfig__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2039:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2040:1: ( '{' )
            {
            // InternalProjectGenerator.g:2040:1: ( '{' )
            // InternalProjectGenerator.g:2041:2: '{'
            {
             before(grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__2__Impl"


    // $ANTLR start "rule__JpaConfig__Group__3"
    // InternalProjectGenerator.g:2050:1: rule__JpaConfig__Group__3 : rule__JpaConfig__Group__3__Impl rule__JpaConfig__Group__4 ;
    public final void rule__JpaConfig__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2054:1: ( rule__JpaConfig__Group__3__Impl rule__JpaConfig__Group__4 )
            // InternalProjectGenerator.g:2055:2: rule__JpaConfig__Group__3__Impl rule__JpaConfig__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__JpaConfig__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__3"


    // $ANTLR start "rule__JpaConfig__Group__3__Impl"
    // InternalProjectGenerator.g:2062:1: rule__JpaConfig__Group__3__Impl : ( ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 ) ) ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 )* ) ) ;
    public final void rule__JpaConfig__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2066:1: ( ( ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 ) ) ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 )* ) ) )
            // InternalProjectGenerator.g:2067:1: ( ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 ) ) ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 )* ) )
            {
            // InternalProjectGenerator.g:2067:1: ( ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 ) ) ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 )* ) )
            // InternalProjectGenerator.g:2068:2: ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 ) ) ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 )* )
            {
            // InternalProjectGenerator.g:2068:2: ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 ) )
            // InternalProjectGenerator.g:2069:3: ( rule__JpaConfig__LocalizedEnumsAssignment_3 )
            {
             before(grammarAccess.getJpaConfigAccess().getLocalizedEnumsAssignment_3()); 
            // InternalProjectGenerator.g:2070:3: ( rule__JpaConfig__LocalizedEnumsAssignment_3 )
            // InternalProjectGenerator.g:2070:4: rule__JpaConfig__LocalizedEnumsAssignment_3
            {
            pushFollow(FOLLOW_13);
            rule__JpaConfig__LocalizedEnumsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJpaConfigAccess().getLocalizedEnumsAssignment_3()); 

            }

            // InternalProjectGenerator.g:2073:2: ( ( rule__JpaConfig__LocalizedEnumsAssignment_3 )* )
            // InternalProjectGenerator.g:2074:3: ( rule__JpaConfig__LocalizedEnumsAssignment_3 )*
            {
             before(grammarAccess.getJpaConfigAccess().getLocalizedEnumsAssignment_3()); 
            // InternalProjectGenerator.g:2075:3: ( rule__JpaConfig__LocalizedEnumsAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RULE_ID) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProjectGenerator.g:2075:4: rule__JpaConfig__LocalizedEnumsAssignment_3
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__JpaConfig__LocalizedEnumsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getJpaConfigAccess().getLocalizedEnumsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__3__Impl"


    // $ANTLR start "rule__JpaConfig__Group__4"
    // InternalProjectGenerator.g:2084:1: rule__JpaConfig__Group__4 : rule__JpaConfig__Group__4__Impl rule__JpaConfig__Group__5 ;
    public final void rule__JpaConfig__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2088:1: ( rule__JpaConfig__Group__4__Impl rule__JpaConfig__Group__5 )
            // InternalProjectGenerator.g:2089:2: rule__JpaConfig__Group__4__Impl rule__JpaConfig__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__JpaConfig__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__4"


    // $ANTLR start "rule__JpaConfig__Group__4__Impl"
    // InternalProjectGenerator.g:2096:1: rule__JpaConfig__Group__4__Impl : ( '}' ) ;
    public final void rule__JpaConfig__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2100:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2101:1: ( '}' )
            {
            // InternalProjectGenerator.g:2101:1: ( '}' )
            // InternalProjectGenerator.g:2102:2: '}'
            {
             before(grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_4()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__4__Impl"


    // $ANTLR start "rule__JpaConfig__Group__5"
    // InternalProjectGenerator.g:2111:1: rule__JpaConfig__Group__5 : rule__JpaConfig__Group__5__Impl rule__JpaConfig__Group__6 ;
    public final void rule__JpaConfig__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2115:1: ( rule__JpaConfig__Group__5__Impl rule__JpaConfig__Group__6 )
            // InternalProjectGenerator.g:2116:2: rule__JpaConfig__Group__5__Impl rule__JpaConfig__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__JpaConfig__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__5"


    // $ANTLR start "rule__JpaConfig__Group__5__Impl"
    // InternalProjectGenerator.g:2123:1: rule__JpaConfig__Group__5__Impl : ( ';' ) ;
    public final void rule__JpaConfig__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2127:1: ( ( ';' ) )
            // InternalProjectGenerator.g:2128:1: ( ';' )
            {
            // InternalProjectGenerator.g:2128:1: ( ';' )
            // InternalProjectGenerator.g:2129:2: ';'
            {
             before(grammarAccess.getJpaConfigAccess().getSemicolonKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__5__Impl"


    // $ANTLR start "rule__JpaConfig__Group__6"
    // InternalProjectGenerator.g:2138:1: rule__JpaConfig__Group__6 : rule__JpaConfig__Group__6__Impl ;
    public final void rule__JpaConfig__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2142:1: ( rule__JpaConfig__Group__6__Impl )
            // InternalProjectGenerator.g:2143:2: rule__JpaConfig__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__JpaConfig__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__6"


    // $ANTLR start "rule__JpaConfig__Group__6__Impl"
    // InternalProjectGenerator.g:2149:1: rule__JpaConfig__Group__6__Impl : ( '}' ) ;
    public final void rule__JpaConfig__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2153:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2154:1: ( '}' )
            {
            // InternalProjectGenerator.g:2154:1: ( '}' )
            // InternalProjectGenerator.g:2155:2: '}'
            {
             before(grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_6()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__Group__6__Impl"


    // $ANTLR start "rule__Localized__Group__0"
    // InternalProjectGenerator.g:2165:1: rule__Localized__Group__0 : rule__Localized__Group__0__Impl rule__Localized__Group__1 ;
    public final void rule__Localized__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2169:1: ( rule__Localized__Group__0__Impl rule__Localized__Group__1 )
            // InternalProjectGenerator.g:2170:2: rule__Localized__Group__0__Impl rule__Localized__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Localized__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__0"


    // $ANTLR start "rule__Localized__Group__0__Impl"
    // InternalProjectGenerator.g:2177:1: rule__Localized__Group__0__Impl : ( ( rule__Localized__NameAssignment_0 ) ) ;
    public final void rule__Localized__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2181:1: ( ( ( rule__Localized__NameAssignment_0 ) ) )
            // InternalProjectGenerator.g:2182:1: ( ( rule__Localized__NameAssignment_0 ) )
            {
            // InternalProjectGenerator.g:2182:1: ( ( rule__Localized__NameAssignment_0 ) )
            // InternalProjectGenerator.g:2183:2: ( rule__Localized__NameAssignment_0 )
            {
             before(grammarAccess.getLocalizedAccess().getNameAssignment_0()); 
            // InternalProjectGenerator.g:2184:2: ( rule__Localized__NameAssignment_0 )
            // InternalProjectGenerator.g:2184:3: rule__Localized__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Localized__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__0__Impl"


    // $ANTLR start "rule__Localized__Group__1"
    // InternalProjectGenerator.g:2192:1: rule__Localized__Group__1 : rule__Localized__Group__1__Impl rule__Localized__Group__2 ;
    public final void rule__Localized__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2196:1: ( rule__Localized__Group__1__Impl rule__Localized__Group__2 )
            // InternalProjectGenerator.g:2197:2: rule__Localized__Group__1__Impl rule__Localized__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__Localized__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__1"


    // $ANTLR start "rule__Localized__Group__1__Impl"
    // InternalProjectGenerator.g:2204:1: rule__Localized__Group__1__Impl : ( '{' ) ;
    public final void rule__Localized__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2208:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2209:1: ( '{' )
            {
            // InternalProjectGenerator.g:2209:1: ( '{' )
            // InternalProjectGenerator.g:2210:2: '{'
            {
             before(grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__1__Impl"


    // $ANTLR start "rule__Localized__Group__2"
    // InternalProjectGenerator.g:2219:1: rule__Localized__Group__2 : rule__Localized__Group__2__Impl rule__Localized__Group__3 ;
    public final void rule__Localized__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2223:1: ( rule__Localized__Group__2__Impl rule__Localized__Group__3 )
            // InternalProjectGenerator.g:2224:2: rule__Localized__Group__2__Impl rule__Localized__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Localized__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__2"


    // $ANTLR start "rule__Localized__Group__2__Impl"
    // InternalProjectGenerator.g:2231:1: rule__Localized__Group__2__Impl : ( ( rule__Localized__Group_2__0 )? ) ;
    public final void rule__Localized__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2235:1: ( ( ( rule__Localized__Group_2__0 )? ) )
            // InternalProjectGenerator.g:2236:1: ( ( rule__Localized__Group_2__0 )? )
            {
            // InternalProjectGenerator.g:2236:1: ( ( rule__Localized__Group_2__0 )? )
            // InternalProjectGenerator.g:2237:2: ( rule__Localized__Group_2__0 )?
            {
             before(grammarAccess.getLocalizedAccess().getGroup_2()); 
            // InternalProjectGenerator.g:2238:2: ( rule__Localized__Group_2__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==38) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalProjectGenerator.g:2238:3: rule__Localized__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Localized__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalizedAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__2__Impl"


    // $ANTLR start "rule__Localized__Group__3"
    // InternalProjectGenerator.g:2246:1: rule__Localized__Group__3 : rule__Localized__Group__3__Impl ;
    public final void rule__Localized__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2250:1: ( rule__Localized__Group__3__Impl )
            // InternalProjectGenerator.g:2251:2: rule__Localized__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Localized__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__3"


    // $ANTLR start "rule__Localized__Group__3__Impl"
    // InternalProjectGenerator.g:2257:1: rule__Localized__Group__3__Impl : ( '}' ) ;
    public final void rule__Localized__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2261:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2262:1: ( '}' )
            {
            // InternalProjectGenerator.g:2262:1: ( '}' )
            // InternalProjectGenerator.g:2263:2: '}'
            {
             before(grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group__3__Impl"


    // $ANTLR start "rule__Localized__Group_2__0"
    // InternalProjectGenerator.g:2273:1: rule__Localized__Group_2__0 : rule__Localized__Group_2__0__Impl rule__Localized__Group_2__1 ;
    public final void rule__Localized__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2277:1: ( rule__Localized__Group_2__0__Impl rule__Localized__Group_2__1 )
            // InternalProjectGenerator.g:2278:2: rule__Localized__Group_2__0__Impl rule__Localized__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__Localized__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__0"


    // $ANTLR start "rule__Localized__Group_2__0__Impl"
    // InternalProjectGenerator.g:2285:1: rule__Localized__Group_2__0__Impl : ( 'values' ) ;
    public final void rule__Localized__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2289:1: ( ( 'values' ) )
            // InternalProjectGenerator.g:2290:1: ( 'values' )
            {
            // InternalProjectGenerator.g:2290:1: ( 'values' )
            // InternalProjectGenerator.g:2291:2: 'values'
            {
             before(grammarAccess.getLocalizedAccess().getValuesKeyword_2_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getValuesKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__0__Impl"


    // $ANTLR start "rule__Localized__Group_2__1"
    // InternalProjectGenerator.g:2300:1: rule__Localized__Group_2__1 : rule__Localized__Group_2__1__Impl rule__Localized__Group_2__2 ;
    public final void rule__Localized__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2304:1: ( rule__Localized__Group_2__1__Impl rule__Localized__Group_2__2 )
            // InternalProjectGenerator.g:2305:2: rule__Localized__Group_2__1__Impl rule__Localized__Group_2__2
            {
            pushFollow(FOLLOW_4);
            rule__Localized__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__1"


    // $ANTLR start "rule__Localized__Group_2__1__Impl"
    // InternalProjectGenerator.g:2312:1: rule__Localized__Group_2__1__Impl : ( '{' ) ;
    public final void rule__Localized__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2316:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2317:1: ( '{' )
            {
            // InternalProjectGenerator.g:2317:1: ( '{' )
            // InternalProjectGenerator.g:2318:2: '{'
            {
             before(grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_2_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getLeftCurlyBracketKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__1__Impl"


    // $ANTLR start "rule__Localized__Group_2__2"
    // InternalProjectGenerator.g:2327:1: rule__Localized__Group_2__2 : rule__Localized__Group_2__2__Impl rule__Localized__Group_2__3 ;
    public final void rule__Localized__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2331:1: ( rule__Localized__Group_2__2__Impl rule__Localized__Group_2__3 )
            // InternalProjectGenerator.g:2332:2: rule__Localized__Group_2__2__Impl rule__Localized__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__Localized__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__2"


    // $ANTLR start "rule__Localized__Group_2__2__Impl"
    // InternalProjectGenerator.g:2339:1: rule__Localized__Group_2__2__Impl : ( ( ( rule__Localized__ValuesAssignment_2_2 ) ) ( ( rule__Localized__ValuesAssignment_2_2 )* ) ) ;
    public final void rule__Localized__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2343:1: ( ( ( ( rule__Localized__ValuesAssignment_2_2 ) ) ( ( rule__Localized__ValuesAssignment_2_2 )* ) ) )
            // InternalProjectGenerator.g:2344:1: ( ( ( rule__Localized__ValuesAssignment_2_2 ) ) ( ( rule__Localized__ValuesAssignment_2_2 )* ) )
            {
            // InternalProjectGenerator.g:2344:1: ( ( ( rule__Localized__ValuesAssignment_2_2 ) ) ( ( rule__Localized__ValuesAssignment_2_2 )* ) )
            // InternalProjectGenerator.g:2345:2: ( ( rule__Localized__ValuesAssignment_2_2 ) ) ( ( rule__Localized__ValuesAssignment_2_2 )* )
            {
            // InternalProjectGenerator.g:2345:2: ( ( rule__Localized__ValuesAssignment_2_2 ) )
            // InternalProjectGenerator.g:2346:3: ( rule__Localized__ValuesAssignment_2_2 )
            {
             before(grammarAccess.getLocalizedAccess().getValuesAssignment_2_2()); 
            // InternalProjectGenerator.g:2347:3: ( rule__Localized__ValuesAssignment_2_2 )
            // InternalProjectGenerator.g:2347:4: rule__Localized__ValuesAssignment_2_2
            {
            pushFollow(FOLLOW_25);
            rule__Localized__ValuesAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedAccess().getValuesAssignment_2_2()); 

            }

            // InternalProjectGenerator.g:2350:2: ( ( rule__Localized__ValuesAssignment_2_2 )* )
            // InternalProjectGenerator.g:2351:3: ( rule__Localized__ValuesAssignment_2_2 )*
            {
             before(grammarAccess.getLocalizedAccess().getValuesAssignment_2_2()); 
            // InternalProjectGenerator.g:2352:3: ( rule__Localized__ValuesAssignment_2_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==23) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProjectGenerator.g:2352:4: rule__Localized__ValuesAssignment_2_2
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Localized__ValuesAssignment_2_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getLocalizedAccess().getValuesAssignment_2_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__2__Impl"


    // $ANTLR start "rule__Localized__Group_2__3"
    // InternalProjectGenerator.g:2361:1: rule__Localized__Group_2__3 : rule__Localized__Group_2__3__Impl rule__Localized__Group_2__4 ;
    public final void rule__Localized__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2365:1: ( rule__Localized__Group_2__3__Impl rule__Localized__Group_2__4 )
            // InternalProjectGenerator.g:2366:2: rule__Localized__Group_2__3__Impl rule__Localized__Group_2__4
            {
            pushFollow(FOLLOW_7);
            rule__Localized__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Localized__Group_2__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__3"


    // $ANTLR start "rule__Localized__Group_2__3__Impl"
    // InternalProjectGenerator.g:2373:1: rule__Localized__Group_2__3__Impl : ( '}' ) ;
    public final void rule__Localized__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2377:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2378:1: ( '}' )
            {
            // InternalProjectGenerator.g:2378:1: ( '}' )
            // InternalProjectGenerator.g:2379:2: '}'
            {
             before(grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_2_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getRightCurlyBracketKeyword_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__3__Impl"


    // $ANTLR start "rule__Localized__Group_2__4"
    // InternalProjectGenerator.g:2388:1: rule__Localized__Group_2__4 : rule__Localized__Group_2__4__Impl ;
    public final void rule__Localized__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2392:1: ( rule__Localized__Group_2__4__Impl )
            // InternalProjectGenerator.g:2393:2: rule__Localized__Group_2__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Localized__Group_2__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__4"


    // $ANTLR start "rule__Localized__Group_2__4__Impl"
    // InternalProjectGenerator.g:2399:1: rule__Localized__Group_2__4__Impl : ( ';' ) ;
    public final void rule__Localized__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2403:1: ( ( ';' ) )
            // InternalProjectGenerator.g:2404:1: ( ';' )
            {
            // InternalProjectGenerator.g:2404:1: ( ';' )
            // InternalProjectGenerator.g:2405:2: ';'
            {
             before(grammarAccess.getLocalizedAccess().getSemicolonKeyword_2_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getSemicolonKeyword_2_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__Group_2__4__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__0"
    // InternalProjectGenerator.g:2415:1: rule__LocalizedEntry__Group__0 : rule__LocalizedEntry__Group__0__Impl rule__LocalizedEntry__Group__1 ;
    public final void rule__LocalizedEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2419:1: ( rule__LocalizedEntry__Group__0__Impl rule__LocalizedEntry__Group__1 )
            // InternalProjectGenerator.g:2420:2: rule__LocalizedEntry__Group__0__Impl rule__LocalizedEntry__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LocalizedEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__0"


    // $ANTLR start "rule__LocalizedEntry__Group__0__Impl"
    // InternalProjectGenerator.g:2427:1: rule__LocalizedEntry__Group__0__Impl : ( '{' ) ;
    public final void rule__LocalizedEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2431:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2432:1: ( '{' )
            {
            // InternalProjectGenerator.g:2432:1: ( '{' )
            // InternalProjectGenerator.g:2433:2: '{'
            {
             before(grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__0__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__1"
    // InternalProjectGenerator.g:2442:1: rule__LocalizedEntry__Group__1 : rule__LocalizedEntry__Group__1__Impl rule__LocalizedEntry__Group__2 ;
    public final void rule__LocalizedEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2446:1: ( rule__LocalizedEntry__Group__1__Impl rule__LocalizedEntry__Group__2 )
            // InternalProjectGenerator.g:2447:2: rule__LocalizedEntry__Group__1__Impl rule__LocalizedEntry__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__LocalizedEntry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__1"


    // $ANTLR start "rule__LocalizedEntry__Group__1__Impl"
    // InternalProjectGenerator.g:2454:1: rule__LocalizedEntry__Group__1__Impl : ( 'key' ) ;
    public final void rule__LocalizedEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2458:1: ( ( 'key' ) )
            // InternalProjectGenerator.g:2459:1: ( 'key' )
            {
            // InternalProjectGenerator.g:2459:1: ( 'key' )
            // InternalProjectGenerator.g:2460:2: 'key'
            {
             before(grammarAccess.getLocalizedEntryAccess().getKeyKeyword_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getKeyKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__1__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__2"
    // InternalProjectGenerator.g:2469:1: rule__LocalizedEntry__Group__2 : rule__LocalizedEntry__Group__2__Impl rule__LocalizedEntry__Group__3 ;
    public final void rule__LocalizedEntry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2473:1: ( rule__LocalizedEntry__Group__2__Impl rule__LocalizedEntry__Group__3 )
            // InternalProjectGenerator.g:2474:2: rule__LocalizedEntry__Group__2__Impl rule__LocalizedEntry__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__LocalizedEntry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__2"


    // $ANTLR start "rule__LocalizedEntry__Group__2__Impl"
    // InternalProjectGenerator.g:2481:1: rule__LocalizedEntry__Group__2__Impl : ( ( rule__LocalizedEntry__LocalizedKeyAssignment_2 ) ) ;
    public final void rule__LocalizedEntry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2485:1: ( ( ( rule__LocalizedEntry__LocalizedKeyAssignment_2 ) ) )
            // InternalProjectGenerator.g:2486:1: ( ( rule__LocalizedEntry__LocalizedKeyAssignment_2 ) )
            {
            // InternalProjectGenerator.g:2486:1: ( ( rule__LocalizedEntry__LocalizedKeyAssignment_2 ) )
            // InternalProjectGenerator.g:2487:2: ( rule__LocalizedEntry__LocalizedKeyAssignment_2 )
            {
             before(grammarAccess.getLocalizedEntryAccess().getLocalizedKeyAssignment_2()); 
            // InternalProjectGenerator.g:2488:2: ( rule__LocalizedEntry__LocalizedKeyAssignment_2 )
            // InternalProjectGenerator.g:2488:3: rule__LocalizedEntry__LocalizedKeyAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__LocalizedKeyAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedEntryAccess().getLocalizedKeyAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__2__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__3"
    // InternalProjectGenerator.g:2496:1: rule__LocalizedEntry__Group__3 : rule__LocalizedEntry__Group__3__Impl rule__LocalizedEntry__Group__4 ;
    public final void rule__LocalizedEntry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2500:1: ( rule__LocalizedEntry__Group__3__Impl rule__LocalizedEntry__Group__4 )
            // InternalProjectGenerator.g:2501:2: rule__LocalizedEntry__Group__3__Impl rule__LocalizedEntry__Group__4
            {
            pushFollow(FOLLOW_27);
            rule__LocalizedEntry__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__3"


    // $ANTLR start "rule__LocalizedEntry__Group__3__Impl"
    // InternalProjectGenerator.g:2508:1: rule__LocalizedEntry__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalizedEntry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2512:1: ( ( ';' ) )
            // InternalProjectGenerator.g:2513:1: ( ';' )
            {
            // InternalProjectGenerator.g:2513:1: ( ';' )
            // InternalProjectGenerator.g:2514:2: ';'
            {
             before(grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__3__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__4"
    // InternalProjectGenerator.g:2523:1: rule__LocalizedEntry__Group__4 : rule__LocalizedEntry__Group__4__Impl rule__LocalizedEntry__Group__5 ;
    public final void rule__LocalizedEntry__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2527:1: ( rule__LocalizedEntry__Group__4__Impl rule__LocalizedEntry__Group__5 )
            // InternalProjectGenerator.g:2528:2: rule__LocalizedEntry__Group__4__Impl rule__LocalizedEntry__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__LocalizedEntry__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__4"


    // $ANTLR start "rule__LocalizedEntry__Group__4__Impl"
    // InternalProjectGenerator.g:2535:1: rule__LocalizedEntry__Group__4__Impl : ( 'values' ) ;
    public final void rule__LocalizedEntry__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2539:1: ( ( 'values' ) )
            // InternalProjectGenerator.g:2540:1: ( 'values' )
            {
            // InternalProjectGenerator.g:2540:1: ( 'values' )
            // InternalProjectGenerator.g:2541:2: 'values'
            {
             before(grammarAccess.getLocalizedEntryAccess().getValuesKeyword_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getValuesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__4__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__5"
    // InternalProjectGenerator.g:2550:1: rule__LocalizedEntry__Group__5 : rule__LocalizedEntry__Group__5__Impl rule__LocalizedEntry__Group__6 ;
    public final void rule__LocalizedEntry__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2554:1: ( rule__LocalizedEntry__Group__5__Impl rule__LocalizedEntry__Group__6 )
            // InternalProjectGenerator.g:2555:2: rule__LocalizedEntry__Group__5__Impl rule__LocalizedEntry__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__LocalizedEntry__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__5"


    // $ANTLR start "rule__LocalizedEntry__Group__5__Impl"
    // InternalProjectGenerator.g:2562:1: rule__LocalizedEntry__Group__5__Impl : ( '{' ) ;
    public final void rule__LocalizedEntry__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2566:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2567:1: ( '{' )
            {
            // InternalProjectGenerator.g:2567:1: ( '{' )
            // InternalProjectGenerator.g:2568:2: '{'
            {
             before(grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_5()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__5__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__6"
    // InternalProjectGenerator.g:2577:1: rule__LocalizedEntry__Group__6 : rule__LocalizedEntry__Group__6__Impl rule__LocalizedEntry__Group__7 ;
    public final void rule__LocalizedEntry__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2581:1: ( rule__LocalizedEntry__Group__6__Impl rule__LocalizedEntry__Group__7 )
            // InternalProjectGenerator.g:2582:2: rule__LocalizedEntry__Group__6__Impl rule__LocalizedEntry__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__LocalizedEntry__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__6"


    // $ANTLR start "rule__LocalizedEntry__Group__6__Impl"
    // InternalProjectGenerator.g:2589:1: rule__LocalizedEntry__Group__6__Impl : ( ( ( rule__LocalizedEntry__ValuesAssignment_6 ) ) ( ( rule__LocalizedEntry__ValuesAssignment_6 )* ) ) ;
    public final void rule__LocalizedEntry__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2593:1: ( ( ( ( rule__LocalizedEntry__ValuesAssignment_6 ) ) ( ( rule__LocalizedEntry__ValuesAssignment_6 )* ) ) )
            // InternalProjectGenerator.g:2594:1: ( ( ( rule__LocalizedEntry__ValuesAssignment_6 ) ) ( ( rule__LocalizedEntry__ValuesAssignment_6 )* ) )
            {
            // InternalProjectGenerator.g:2594:1: ( ( ( rule__LocalizedEntry__ValuesAssignment_6 ) ) ( ( rule__LocalizedEntry__ValuesAssignment_6 )* ) )
            // InternalProjectGenerator.g:2595:2: ( ( rule__LocalizedEntry__ValuesAssignment_6 ) ) ( ( rule__LocalizedEntry__ValuesAssignment_6 )* )
            {
            // InternalProjectGenerator.g:2595:2: ( ( rule__LocalizedEntry__ValuesAssignment_6 ) )
            // InternalProjectGenerator.g:2596:3: ( rule__LocalizedEntry__ValuesAssignment_6 )
            {
             before(grammarAccess.getLocalizedEntryAccess().getValuesAssignment_6()); 
            // InternalProjectGenerator.g:2597:3: ( rule__LocalizedEntry__ValuesAssignment_6 )
            // InternalProjectGenerator.g:2597:4: rule__LocalizedEntry__ValuesAssignment_6
            {
            pushFollow(FOLLOW_25);
            rule__LocalizedEntry__ValuesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedEntryAccess().getValuesAssignment_6()); 

            }

            // InternalProjectGenerator.g:2600:2: ( ( rule__LocalizedEntry__ValuesAssignment_6 )* )
            // InternalProjectGenerator.g:2601:3: ( rule__LocalizedEntry__ValuesAssignment_6 )*
            {
             before(grammarAccess.getLocalizedEntryAccess().getValuesAssignment_6()); 
            // InternalProjectGenerator.g:2602:3: ( rule__LocalizedEntry__ValuesAssignment_6 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==23) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProjectGenerator.g:2602:4: rule__LocalizedEntry__ValuesAssignment_6
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__LocalizedEntry__ValuesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getLocalizedEntryAccess().getValuesAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__6__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__7"
    // InternalProjectGenerator.g:2611:1: rule__LocalizedEntry__Group__7 : rule__LocalizedEntry__Group__7__Impl rule__LocalizedEntry__Group__8 ;
    public final void rule__LocalizedEntry__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2615:1: ( rule__LocalizedEntry__Group__7__Impl rule__LocalizedEntry__Group__8 )
            // InternalProjectGenerator.g:2616:2: rule__LocalizedEntry__Group__7__Impl rule__LocalizedEntry__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__LocalizedEntry__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__7"


    // $ANTLR start "rule__LocalizedEntry__Group__7__Impl"
    // InternalProjectGenerator.g:2623:1: rule__LocalizedEntry__Group__7__Impl : ( '}' ) ;
    public final void rule__LocalizedEntry__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2627:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2628:1: ( '}' )
            {
            // InternalProjectGenerator.g:2628:1: ( '}' )
            // InternalProjectGenerator.g:2629:2: '}'
            {
             before(grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__7__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__8"
    // InternalProjectGenerator.g:2638:1: rule__LocalizedEntry__Group__8 : rule__LocalizedEntry__Group__8__Impl rule__LocalizedEntry__Group__9 ;
    public final void rule__LocalizedEntry__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2642:1: ( rule__LocalizedEntry__Group__8__Impl rule__LocalizedEntry__Group__9 )
            // InternalProjectGenerator.g:2643:2: rule__LocalizedEntry__Group__8__Impl rule__LocalizedEntry__Group__9
            {
            pushFollow(FOLLOW_28);
            rule__LocalizedEntry__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__8"


    // $ANTLR start "rule__LocalizedEntry__Group__8__Impl"
    // InternalProjectGenerator.g:2650:1: rule__LocalizedEntry__Group__8__Impl : ( ';' ) ;
    public final void rule__LocalizedEntry__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2654:1: ( ( ';' ) )
            // InternalProjectGenerator.g:2655:1: ( ';' )
            {
            // InternalProjectGenerator.g:2655:1: ( ';' )
            // InternalProjectGenerator.g:2656:2: ';'
            {
             before(grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_8()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__8__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__9"
    // InternalProjectGenerator.g:2665:1: rule__LocalizedEntry__Group__9 : rule__LocalizedEntry__Group__9__Impl rule__LocalizedEntry__Group__10 ;
    public final void rule__LocalizedEntry__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2669:1: ( rule__LocalizedEntry__Group__9__Impl rule__LocalizedEntry__Group__10 )
            // InternalProjectGenerator.g:2670:2: rule__LocalizedEntry__Group__9__Impl rule__LocalizedEntry__Group__10
            {
            pushFollow(FOLLOW_28);
            rule__LocalizedEntry__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__9"


    // $ANTLR start "rule__LocalizedEntry__Group__9__Impl"
    // InternalProjectGenerator.g:2677:1: rule__LocalizedEntry__Group__9__Impl : ( ( rule__LocalizedEntry__Group_9__0 )? ) ;
    public final void rule__LocalizedEntry__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2681:1: ( ( ( rule__LocalizedEntry__Group_9__0 )? ) )
            // InternalProjectGenerator.g:2682:1: ( ( rule__LocalizedEntry__Group_9__0 )? )
            {
            // InternalProjectGenerator.g:2682:1: ( ( rule__LocalizedEntry__Group_9__0 )? )
            // InternalProjectGenerator.g:2683:2: ( rule__LocalizedEntry__Group_9__0 )?
            {
             before(grammarAccess.getLocalizedEntryAccess().getGroup_9()); 
            // InternalProjectGenerator.g:2684:2: ( rule__LocalizedEntry__Group_9__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalProjectGenerator.g:2684:3: rule__LocalizedEntry__Group_9__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalizedEntry__Group_9__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLocalizedEntryAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__9__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group__10"
    // InternalProjectGenerator.g:2692:1: rule__LocalizedEntry__Group__10 : rule__LocalizedEntry__Group__10__Impl ;
    public final void rule__LocalizedEntry__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2696:1: ( rule__LocalizedEntry__Group__10__Impl )
            // InternalProjectGenerator.g:2697:2: rule__LocalizedEntry__Group__10__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group__10__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__10"


    // $ANTLR start "rule__LocalizedEntry__Group__10__Impl"
    // InternalProjectGenerator.g:2703:1: rule__LocalizedEntry__Group__10__Impl : ( '}' ) ;
    public final void rule__LocalizedEntry__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2707:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2708:1: ( '}' )
            {
            // InternalProjectGenerator.g:2708:1: ( '}' )
            // InternalProjectGenerator.g:2709:2: '}'
            {
             before(grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_10()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group__10__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group_9__0"
    // InternalProjectGenerator.g:2719:1: rule__LocalizedEntry__Group_9__0 : rule__LocalizedEntry__Group_9__0__Impl rule__LocalizedEntry__Group_9__1 ;
    public final void rule__LocalizedEntry__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2723:1: ( rule__LocalizedEntry__Group_9__0__Impl rule__LocalizedEntry__Group_9__1 )
            // InternalProjectGenerator.g:2724:2: rule__LocalizedEntry__Group_9__0__Impl rule__LocalizedEntry__Group_9__1
            {
            pushFollow(FOLLOW_4);
            rule__LocalizedEntry__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__0"


    // $ANTLR start "rule__LocalizedEntry__Group_9__0__Impl"
    // InternalProjectGenerator.g:2731:1: rule__LocalizedEntry__Group_9__0__Impl : ( 'args' ) ;
    public final void rule__LocalizedEntry__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2735:1: ( ( 'args' ) )
            // InternalProjectGenerator.g:2736:1: ( 'args' )
            {
            // InternalProjectGenerator.g:2736:1: ( 'args' )
            // InternalProjectGenerator.g:2737:2: 'args'
            {
             before(grammarAccess.getLocalizedEntryAccess().getArgsKeyword_9_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getArgsKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__0__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group_9__1"
    // InternalProjectGenerator.g:2746:1: rule__LocalizedEntry__Group_9__1 : rule__LocalizedEntry__Group_9__1__Impl rule__LocalizedEntry__Group_9__2 ;
    public final void rule__LocalizedEntry__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2750:1: ( rule__LocalizedEntry__Group_9__1__Impl rule__LocalizedEntry__Group_9__2 )
            // InternalProjectGenerator.g:2751:2: rule__LocalizedEntry__Group_9__1__Impl rule__LocalizedEntry__Group_9__2
            {
            pushFollow(FOLLOW_6);
            rule__LocalizedEntry__Group_9__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group_9__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__1"


    // $ANTLR start "rule__LocalizedEntry__Group_9__1__Impl"
    // InternalProjectGenerator.g:2758:1: rule__LocalizedEntry__Group_9__1__Impl : ( '{' ) ;
    public final void rule__LocalizedEntry__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2762:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2763:1: ( '{' )
            {
            // InternalProjectGenerator.g:2763:1: ( '{' )
            // InternalProjectGenerator.g:2764:2: '{'
            {
             before(grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_9_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getLeftCurlyBracketKeyword_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__1__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group_9__2"
    // InternalProjectGenerator.g:2773:1: rule__LocalizedEntry__Group_9__2 : rule__LocalizedEntry__Group_9__2__Impl rule__LocalizedEntry__Group_9__3 ;
    public final void rule__LocalizedEntry__Group_9__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2777:1: ( rule__LocalizedEntry__Group_9__2__Impl rule__LocalizedEntry__Group_9__3 )
            // InternalProjectGenerator.g:2778:2: rule__LocalizedEntry__Group_9__2__Impl rule__LocalizedEntry__Group_9__3
            {
            pushFollow(FOLLOW_12);
            rule__LocalizedEntry__Group_9__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group_9__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__2"


    // $ANTLR start "rule__LocalizedEntry__Group_9__2__Impl"
    // InternalProjectGenerator.g:2785:1: rule__LocalizedEntry__Group_9__2__Impl : ( ( ( rule__LocalizedEntry__ArgsAssignment_9_2 ) ) ( ( rule__LocalizedEntry__ArgsAssignment_9_2 )* ) ) ;
    public final void rule__LocalizedEntry__Group_9__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2789:1: ( ( ( ( rule__LocalizedEntry__ArgsAssignment_9_2 ) ) ( ( rule__LocalizedEntry__ArgsAssignment_9_2 )* ) ) )
            // InternalProjectGenerator.g:2790:1: ( ( ( rule__LocalizedEntry__ArgsAssignment_9_2 ) ) ( ( rule__LocalizedEntry__ArgsAssignment_9_2 )* ) )
            {
            // InternalProjectGenerator.g:2790:1: ( ( ( rule__LocalizedEntry__ArgsAssignment_9_2 ) ) ( ( rule__LocalizedEntry__ArgsAssignment_9_2 )* ) )
            // InternalProjectGenerator.g:2791:2: ( ( rule__LocalizedEntry__ArgsAssignment_9_2 ) ) ( ( rule__LocalizedEntry__ArgsAssignment_9_2 )* )
            {
            // InternalProjectGenerator.g:2791:2: ( ( rule__LocalizedEntry__ArgsAssignment_9_2 ) )
            // InternalProjectGenerator.g:2792:3: ( rule__LocalizedEntry__ArgsAssignment_9_2 )
            {
             before(grammarAccess.getLocalizedEntryAccess().getArgsAssignment_9_2()); 
            // InternalProjectGenerator.g:2793:3: ( rule__LocalizedEntry__ArgsAssignment_9_2 )
            // InternalProjectGenerator.g:2793:4: rule__LocalizedEntry__ArgsAssignment_9_2
            {
            pushFollow(FOLLOW_29);
            rule__LocalizedEntry__ArgsAssignment_9_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedEntryAccess().getArgsAssignment_9_2()); 

            }

            // InternalProjectGenerator.g:2796:2: ( ( rule__LocalizedEntry__ArgsAssignment_9_2 )* )
            // InternalProjectGenerator.g:2797:3: ( rule__LocalizedEntry__ArgsAssignment_9_2 )*
            {
             before(grammarAccess.getLocalizedEntryAccess().getArgsAssignment_9_2()); 
            // InternalProjectGenerator.g:2798:3: ( rule__LocalizedEntry__ArgsAssignment_9_2 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_STRING) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalProjectGenerator.g:2798:4: rule__LocalizedEntry__ArgsAssignment_9_2
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__LocalizedEntry__ArgsAssignment_9_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getLocalizedEntryAccess().getArgsAssignment_9_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__2__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group_9__3"
    // InternalProjectGenerator.g:2807:1: rule__LocalizedEntry__Group_9__3 : rule__LocalizedEntry__Group_9__3__Impl rule__LocalizedEntry__Group_9__4 ;
    public final void rule__LocalizedEntry__Group_9__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2811:1: ( rule__LocalizedEntry__Group_9__3__Impl rule__LocalizedEntry__Group_9__4 )
            // InternalProjectGenerator.g:2812:2: rule__LocalizedEntry__Group_9__3__Impl rule__LocalizedEntry__Group_9__4
            {
            pushFollow(FOLLOW_7);
            rule__LocalizedEntry__Group_9__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group_9__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__3"


    // $ANTLR start "rule__LocalizedEntry__Group_9__3__Impl"
    // InternalProjectGenerator.g:2819:1: rule__LocalizedEntry__Group_9__3__Impl : ( '}' ) ;
    public final void rule__LocalizedEntry__Group_9__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2823:1: ( ( '}' ) )
            // InternalProjectGenerator.g:2824:1: ( '}' )
            {
            // InternalProjectGenerator.g:2824:1: ( '}' )
            // InternalProjectGenerator.g:2825:2: '}'
            {
             before(grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_9_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getRightCurlyBracketKeyword_9_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__3__Impl"


    // $ANTLR start "rule__LocalizedEntry__Group_9__4"
    // InternalProjectGenerator.g:2834:1: rule__LocalizedEntry__Group_9__4 : rule__LocalizedEntry__Group_9__4__Impl ;
    public final void rule__LocalizedEntry__Group_9__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2838:1: ( rule__LocalizedEntry__Group_9__4__Impl )
            // InternalProjectGenerator.g:2839:2: rule__LocalizedEntry__Group_9__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedEntry__Group_9__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__4"


    // $ANTLR start "rule__LocalizedEntry__Group_9__4__Impl"
    // InternalProjectGenerator.g:2845:1: rule__LocalizedEntry__Group_9__4__Impl : ( ';' ) ;
    public final void rule__LocalizedEntry__Group_9__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2849:1: ( ( ';' ) )
            // InternalProjectGenerator.g:2850:1: ( ';' )
            {
            // InternalProjectGenerator.g:2850:1: ( ';' )
            // InternalProjectGenerator.g:2851:2: ';'
            {
             before(grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_9_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getSemicolonKeyword_9_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__Group_9__4__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__0"
    // InternalProjectGenerator.g:2861:1: rule__LocalizedValue__Group__0 : rule__LocalizedValue__Group__0__Impl rule__LocalizedValue__Group__1 ;
    public final void rule__LocalizedValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2865:1: ( rule__LocalizedValue__Group__0__Impl rule__LocalizedValue__Group__1 )
            // InternalProjectGenerator.g:2866:2: rule__LocalizedValue__Group__0__Impl rule__LocalizedValue__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__LocalizedValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__0"


    // $ANTLR start "rule__LocalizedValue__Group__0__Impl"
    // InternalProjectGenerator.g:2873:1: rule__LocalizedValue__Group__0__Impl : ( '{' ) ;
    public final void rule__LocalizedValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2877:1: ( ( '{' ) )
            // InternalProjectGenerator.g:2878:1: ( '{' )
            {
            // InternalProjectGenerator.g:2878:1: ( '{' )
            // InternalProjectGenerator.g:2879:2: '{'
            {
             before(grammarAccess.getLocalizedValueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__0__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__1"
    // InternalProjectGenerator.g:2888:1: rule__LocalizedValue__Group__1 : rule__LocalizedValue__Group__1__Impl rule__LocalizedValue__Group__2 ;
    public final void rule__LocalizedValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2892:1: ( rule__LocalizedValue__Group__1__Impl rule__LocalizedValue__Group__2 )
            // InternalProjectGenerator.g:2893:2: rule__LocalizedValue__Group__1__Impl rule__LocalizedValue__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__LocalizedValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__1"


    // $ANTLR start "rule__LocalizedValue__Group__1__Impl"
    // InternalProjectGenerator.g:2900:1: rule__LocalizedValue__Group__1__Impl : ( 'locale' ) ;
    public final void rule__LocalizedValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2904:1: ( ( 'locale' ) )
            // InternalProjectGenerator.g:2905:1: ( 'locale' )
            {
            // InternalProjectGenerator.g:2905:1: ( 'locale' )
            // InternalProjectGenerator.g:2906:2: 'locale'
            {
             before(grammarAccess.getLocalizedValueAccess().getLocaleKeyword_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getLocaleKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__1__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__2"
    // InternalProjectGenerator.g:2915:1: rule__LocalizedValue__Group__2 : rule__LocalizedValue__Group__2__Impl rule__LocalizedValue__Group__3 ;
    public final void rule__LocalizedValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2919:1: ( rule__LocalizedValue__Group__2__Impl rule__LocalizedValue__Group__3 )
            // InternalProjectGenerator.g:2920:2: rule__LocalizedValue__Group__2__Impl rule__LocalizedValue__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__LocalizedValue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__2"


    // $ANTLR start "rule__LocalizedValue__Group__2__Impl"
    // InternalProjectGenerator.g:2927:1: rule__LocalizedValue__Group__2__Impl : ( ( rule__LocalizedValue__LocaleAssignment_2 ) ) ;
    public final void rule__LocalizedValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2931:1: ( ( ( rule__LocalizedValue__LocaleAssignment_2 ) ) )
            // InternalProjectGenerator.g:2932:1: ( ( rule__LocalizedValue__LocaleAssignment_2 ) )
            {
            // InternalProjectGenerator.g:2932:1: ( ( rule__LocalizedValue__LocaleAssignment_2 ) )
            // InternalProjectGenerator.g:2933:2: ( rule__LocalizedValue__LocaleAssignment_2 )
            {
             before(grammarAccess.getLocalizedValueAccess().getLocaleAssignment_2()); 
            // InternalProjectGenerator.g:2934:2: ( rule__LocalizedValue__LocaleAssignment_2 )
            // InternalProjectGenerator.g:2934:3: rule__LocalizedValue__LocaleAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedValue__LocaleAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedValueAccess().getLocaleAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__2__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__3"
    // InternalProjectGenerator.g:2942:1: rule__LocalizedValue__Group__3 : rule__LocalizedValue__Group__3__Impl rule__LocalizedValue__Group__4 ;
    public final void rule__LocalizedValue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2946:1: ( rule__LocalizedValue__Group__3__Impl rule__LocalizedValue__Group__4 )
            // InternalProjectGenerator.g:2947:2: rule__LocalizedValue__Group__3__Impl rule__LocalizedValue__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__LocalizedValue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__3"


    // $ANTLR start "rule__LocalizedValue__Group__3__Impl"
    // InternalProjectGenerator.g:2954:1: rule__LocalizedValue__Group__3__Impl : ( ';' ) ;
    public final void rule__LocalizedValue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2958:1: ( ( ';' ) )
            // InternalProjectGenerator.g:2959:1: ( ';' )
            {
            // InternalProjectGenerator.g:2959:1: ( ';' )
            // InternalProjectGenerator.g:2960:2: ';'
            {
             before(grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__3__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__4"
    // InternalProjectGenerator.g:2969:1: rule__LocalizedValue__Group__4 : rule__LocalizedValue__Group__4__Impl rule__LocalizedValue__Group__5 ;
    public final void rule__LocalizedValue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2973:1: ( rule__LocalizedValue__Group__4__Impl rule__LocalizedValue__Group__5 )
            // InternalProjectGenerator.g:2974:2: rule__LocalizedValue__Group__4__Impl rule__LocalizedValue__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__LocalizedValue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__4"


    // $ANTLR start "rule__LocalizedValue__Group__4__Impl"
    // InternalProjectGenerator.g:2981:1: rule__LocalizedValue__Group__4__Impl : ( 'value' ) ;
    public final void rule__LocalizedValue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:2985:1: ( ( 'value' ) )
            // InternalProjectGenerator.g:2986:1: ( 'value' )
            {
            // InternalProjectGenerator.g:2986:1: ( 'value' )
            // InternalProjectGenerator.g:2987:2: 'value'
            {
             before(grammarAccess.getLocalizedValueAccess().getValueKeyword_4()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__4__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__5"
    // InternalProjectGenerator.g:2996:1: rule__LocalizedValue__Group__5 : rule__LocalizedValue__Group__5__Impl rule__LocalizedValue__Group__6 ;
    public final void rule__LocalizedValue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3000:1: ( rule__LocalizedValue__Group__5__Impl rule__LocalizedValue__Group__6 )
            // InternalProjectGenerator.g:3001:2: rule__LocalizedValue__Group__5__Impl rule__LocalizedValue__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__LocalizedValue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__5"


    // $ANTLR start "rule__LocalizedValue__Group__5__Impl"
    // InternalProjectGenerator.g:3008:1: rule__LocalizedValue__Group__5__Impl : ( ( rule__LocalizedValue__ValuesAssignment_5 ) ) ;
    public final void rule__LocalizedValue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3012:1: ( ( ( rule__LocalizedValue__ValuesAssignment_5 ) ) )
            // InternalProjectGenerator.g:3013:1: ( ( rule__LocalizedValue__ValuesAssignment_5 ) )
            {
            // InternalProjectGenerator.g:3013:1: ( ( rule__LocalizedValue__ValuesAssignment_5 ) )
            // InternalProjectGenerator.g:3014:2: ( rule__LocalizedValue__ValuesAssignment_5 )
            {
             before(grammarAccess.getLocalizedValueAccess().getValuesAssignment_5()); 
            // InternalProjectGenerator.g:3015:2: ( rule__LocalizedValue__ValuesAssignment_5 )
            // InternalProjectGenerator.g:3015:3: rule__LocalizedValue__ValuesAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedValue__ValuesAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLocalizedValueAccess().getValuesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__5__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__6"
    // InternalProjectGenerator.g:3023:1: rule__LocalizedValue__Group__6 : rule__LocalizedValue__Group__6__Impl rule__LocalizedValue__Group__7 ;
    public final void rule__LocalizedValue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3027:1: ( rule__LocalizedValue__Group__6__Impl rule__LocalizedValue__Group__7 )
            // InternalProjectGenerator.g:3028:2: rule__LocalizedValue__Group__6__Impl rule__LocalizedValue__Group__7
            {
            pushFollow(FOLLOW_12);
            rule__LocalizedValue__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__6"


    // $ANTLR start "rule__LocalizedValue__Group__6__Impl"
    // InternalProjectGenerator.g:3035:1: rule__LocalizedValue__Group__6__Impl : ( ';' ) ;
    public final void rule__LocalizedValue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3039:1: ( ( ';' ) )
            // InternalProjectGenerator.g:3040:1: ( ';' )
            {
            // InternalProjectGenerator.g:3040:1: ( ';' )
            // InternalProjectGenerator.g:3041:2: ';'
            {
             before(grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__6__Impl"


    // $ANTLR start "rule__LocalizedValue__Group__7"
    // InternalProjectGenerator.g:3050:1: rule__LocalizedValue__Group__7 : rule__LocalizedValue__Group__7__Impl ;
    public final void rule__LocalizedValue__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3054:1: ( rule__LocalizedValue__Group__7__Impl )
            // InternalProjectGenerator.g:3055:2: rule__LocalizedValue__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalizedValue__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__7"


    // $ANTLR start "rule__LocalizedValue__Group__7__Impl"
    // InternalProjectGenerator.g:3061:1: rule__LocalizedValue__Group__7__Impl : ( '}' ) ;
    public final void rule__LocalizedValue__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3065:1: ( ( '}' ) )
            // InternalProjectGenerator.g:3066:1: ( '}' )
            {
            // InternalProjectGenerator.g:3066:1: ( '}' )
            // InternalProjectGenerator.g:3067:2: '}'
            {
             before(grammarAccess.getLocalizedValueAccess().getRightCurlyBracketKeyword_7()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__Group__7__Impl"


    // $ANTLR start "rule__Module__NameAssignment_1"
    // InternalProjectGenerator.g:3077:1: rule__Module__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Module__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3081:1: ( ( RULE_ID ) )
            // InternalProjectGenerator.g:3082:2: ( RULE_ID )
            {
            // InternalProjectGenerator.g:3082:2: ( RULE_ID )
            // InternalProjectGenerator.g:3083:3: RULE_ID
            {
             before(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__NameAssignment_1"


    // $ANTLR start "rule__Module__KeyAssignment_4"
    // InternalProjectGenerator.g:3092:1: rule__Module__KeyAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Module__KeyAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3096:1: ( ( RULE_STRING ) )
            // InternalProjectGenerator.g:3097:2: ( RULE_STRING )
            {
            // InternalProjectGenerator.g:3097:2: ( RULE_STRING )
            // InternalProjectGenerator.g:3098:3: RULE_STRING
            {
             before(grammarAccess.getModuleAccess().getKeySTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getModuleAccess().getKeySTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__KeyAssignment_4"


    // $ANTLR start "rule__Module__CdiEnabledAssignment_7"
    // InternalProjectGenerator.g:3107:1: rule__Module__CdiEnabledAssignment_7 : ( ruleBoolean ) ;
    public final void rule__Module__CdiEnabledAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3111:1: ( ( ruleBoolean ) )
            // InternalProjectGenerator.g:3112:2: ( ruleBoolean )
            {
            // InternalProjectGenerator.g:3112:2: ( ruleBoolean )
            // InternalProjectGenerator.g:3113:3: ruleBoolean
            {
             before(grammarAccess.getModuleAccess().getCdiEnabledBooleanEnumRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleBoolean();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getCdiEnabledBooleanEnumRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__CdiEnabledAssignment_7"


    // $ANTLR start "rule__Module__MessageBundlesAssignment_9_2"
    // InternalProjectGenerator.g:3122:1: rule__Module__MessageBundlesAssignment_9_2 : ( ruleLocalized ) ;
    public final void rule__Module__MessageBundlesAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3126:1: ( ( ruleLocalized ) )
            // InternalProjectGenerator.g:3127:2: ( ruleLocalized )
            {
            // InternalProjectGenerator.g:3127:2: ( ruleLocalized )
            // InternalProjectGenerator.g:3128:3: ruleLocalized
            {
             before(grammarAccess.getModuleAccess().getMessageBundlesLocalizedParserRuleCall_9_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalized();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getMessageBundlesLocalizedParserRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__MessageBundlesAssignment_9_2"


    // $ANTLR start "rule__Module__ObserversAssignment_10_2"
    // InternalProjectGenerator.g:3137:1: rule__Module__ObserversAssignment_10_2 : ( ruleObserver ) ;
    public final void rule__Module__ObserversAssignment_10_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3141:1: ( ( ruleObserver ) )
            // InternalProjectGenerator.g:3142:2: ( ruleObserver )
            {
            // InternalProjectGenerator.g:3142:2: ( ruleObserver )
            // InternalProjectGenerator.g:3143:3: ruleObserver
            {
             before(grammarAccess.getModuleAccess().getObserversObserverParserRuleCall_10_2_0()); 
            pushFollow(FOLLOW_2);
            ruleObserver();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getObserversObserverParserRuleCall_10_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ObserversAssignment_10_2"


    // $ANTLR start "rule__Module__JpaConfigAssignment_12"
    // InternalProjectGenerator.g:3152:1: rule__Module__JpaConfigAssignment_12 : ( ruleJpaConfig ) ;
    public final void rule__Module__JpaConfigAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3156:1: ( ( ruleJpaConfig ) )
            // InternalProjectGenerator.g:3157:2: ( ruleJpaConfig )
            {
            // InternalProjectGenerator.g:3157:2: ( ruleJpaConfig )
            // InternalProjectGenerator.g:3158:3: ruleJpaConfig
            {
             before(grammarAccess.getModuleAccess().getJpaConfigJpaConfigParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleJpaConfig();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getJpaConfigJpaConfigParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__JpaConfigAssignment_12"


    // $ANTLR start "rule__Module__ServiceConfigAssignment_15"
    // InternalProjectGenerator.g:3167:1: rule__Module__ServiceConfigAssignment_15 : ( ruleServiceConfig ) ;
    public final void rule__Module__ServiceConfigAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3171:1: ( ( ruleServiceConfig ) )
            // InternalProjectGenerator.g:3172:2: ( ruleServiceConfig )
            {
            // InternalProjectGenerator.g:3172:2: ( ruleServiceConfig )
            // InternalProjectGenerator.g:3173:3: ruleServiceConfig
            {
             before(grammarAccess.getModuleAccess().getServiceConfigServiceConfigParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleServiceConfig();

            state._fsp--;

             after(grammarAccess.getModuleAccess().getServiceConfigServiceConfigParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Module__ServiceConfigAssignment_15"


    // $ANTLR start "rule__ServiceConfig__ObserversAssignment_1_1"
    // InternalProjectGenerator.g:3182:1: rule__ServiceConfig__ObserversAssignment_1_1 : ( ruleObserver ) ;
    public final void rule__ServiceConfig__ObserversAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3186:1: ( ( ruleObserver ) )
            // InternalProjectGenerator.g:3187:2: ( ruleObserver )
            {
            // InternalProjectGenerator.g:3187:2: ( ruleObserver )
            // InternalProjectGenerator.g:3188:3: ruleObserver
            {
             before(grammarAccess.getServiceConfigAccess().getObserversObserverParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleObserver();

            state._fsp--;

             after(grammarAccess.getServiceConfigAccess().getObserversObserverParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__ObserversAssignment_1_1"


    // $ANTLR start "rule__ServiceConfig__MessageBundlesAssignment_2_2"
    // InternalProjectGenerator.g:3197:1: rule__ServiceConfig__MessageBundlesAssignment_2_2 : ( ( RULE_ID ) ) ;
    public final void rule__ServiceConfig__MessageBundlesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3201:1: ( ( ( RULE_ID ) ) )
            // InternalProjectGenerator.g:3202:2: ( ( RULE_ID ) )
            {
            // InternalProjectGenerator.g:3202:2: ( ( RULE_ID ) )
            // InternalProjectGenerator.g:3203:3: ( RULE_ID )
            {
             before(grammarAccess.getServiceConfigAccess().getMessageBundlesLocalizedCrossReference_2_2_0()); 
            // InternalProjectGenerator.g:3204:3: ( RULE_ID )
            // InternalProjectGenerator.g:3205:4: RULE_ID
            {
             before(grammarAccess.getServiceConfigAccess().getMessageBundlesLocalizedIDTerminalRuleCall_2_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getServiceConfigAccess().getMessageBundlesLocalizedIDTerminalRuleCall_2_2_0_1()); 

            }

             after(grammarAccess.getServiceConfigAccess().getMessageBundlesLocalizedCrossReference_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServiceConfig__MessageBundlesAssignment_2_2"


    // $ANTLR start "rule__Observer__NameAssignment_0"
    // InternalProjectGenerator.g:3216:1: rule__Observer__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Observer__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3220:1: ( ( RULE_ID ) )
            // InternalProjectGenerator.g:3221:2: ( RULE_ID )
            {
            // InternalProjectGenerator.g:3221:2: ( RULE_ID )
            // InternalProjectGenerator.g:3222:3: RULE_ID
            {
             before(grammarAccess.getObserverAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__NameAssignment_0"


    // $ANTLR start "rule__Observer__TypeAssignment_3"
    // InternalProjectGenerator.g:3231:1: rule__Observer__TypeAssignment_3 : ( RULE_CLASSNAME ) ;
    public final void rule__Observer__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3235:1: ( ( RULE_CLASSNAME ) )
            // InternalProjectGenerator.g:3236:2: ( RULE_CLASSNAME )
            {
            // InternalProjectGenerator.g:3236:2: ( RULE_CLASSNAME )
            // InternalProjectGenerator.g:3237:3: RULE_CLASSNAME
            {
             before(grammarAccess.getObserverAccess().getTypeClassNameTerminalRuleCall_3_0()); 
            match(input,RULE_CLASSNAME,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getTypeClassNameTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__TypeAssignment_3"


    // $ANTLR start "rule__Observer__DuringAssignment_6"
    // InternalProjectGenerator.g:3246:1: rule__Observer__DuringAssignment_6 : ( ruleDuring ) ;
    public final void rule__Observer__DuringAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3250:1: ( ( ruleDuring ) )
            // InternalProjectGenerator.g:3251:2: ( ruleDuring )
            {
            // InternalProjectGenerator.g:3251:2: ( ruleDuring )
            // InternalProjectGenerator.g:3252:3: ruleDuring
            {
             before(grammarAccess.getObserverAccess().getDuringDuringEnumRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleDuring();

            state._fsp--;

             after(grammarAccess.getObserverAccess().getDuringDuringEnumRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__DuringAssignment_6"


    // $ANTLR start "rule__Observer__NotifyAssignment_9"
    // InternalProjectGenerator.g:3261:1: rule__Observer__NotifyAssignment_9 : ( ruleNotify ) ;
    public final void rule__Observer__NotifyAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3265:1: ( ( ruleNotify ) )
            // InternalProjectGenerator.g:3266:2: ( ruleNotify )
            {
            // InternalProjectGenerator.g:3266:2: ( ruleNotify )
            // InternalProjectGenerator.g:3267:3: ruleNotify
            {
             before(grammarAccess.getObserverAccess().getNotifyNotifyEnumRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleNotify();

            state._fsp--;

             after(grammarAccess.getObserverAccess().getNotifyNotifyEnumRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__NotifyAssignment_9"


    // $ANTLR start "rule__Observer__ClassNameAssignment_12"
    // InternalProjectGenerator.g:3276:1: rule__Observer__ClassNameAssignment_12 : ( RULE_CLASSNAME ) ;
    public final void rule__Observer__ClassNameAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3280:1: ( ( RULE_CLASSNAME ) )
            // InternalProjectGenerator.g:3281:2: ( RULE_CLASSNAME )
            {
            // InternalProjectGenerator.g:3281:2: ( RULE_CLASSNAME )
            // InternalProjectGenerator.g:3282:3: RULE_CLASSNAME
            {
             before(grammarAccess.getObserverAccess().getClassNameClassNameTerminalRuleCall_12_0()); 
            match(input,RULE_CLASSNAME,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getClassNameClassNameTerminalRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__ClassNameAssignment_12"


    // $ANTLR start "rule__Observer__QualifierAssignment_14_1"
    // InternalProjectGenerator.g:3291:1: rule__Observer__QualifierAssignment_14_1 : ( RULE_CLASSNAME ) ;
    public final void rule__Observer__QualifierAssignment_14_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3295:1: ( ( RULE_CLASSNAME ) )
            // InternalProjectGenerator.g:3296:2: ( RULE_CLASSNAME )
            {
            // InternalProjectGenerator.g:3296:2: ( RULE_CLASSNAME )
            // InternalProjectGenerator.g:3297:3: RULE_CLASSNAME
            {
             before(grammarAccess.getObserverAccess().getQualifierClassNameTerminalRuleCall_14_1_0()); 
            match(input,RULE_CLASSNAME,FOLLOW_2); 
             after(grammarAccess.getObserverAccess().getQualifierClassNameTerminalRuleCall_14_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Observer__QualifierAssignment_14_1"


    // $ANTLR start "rule__JpaConfig__LocalizedEnumsAssignment_3"
    // InternalProjectGenerator.g:3306:1: rule__JpaConfig__LocalizedEnumsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__JpaConfig__LocalizedEnumsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3310:1: ( ( ( RULE_ID ) ) )
            // InternalProjectGenerator.g:3311:2: ( ( RULE_ID ) )
            {
            // InternalProjectGenerator.g:3311:2: ( ( RULE_ID ) )
            // InternalProjectGenerator.g:3312:3: ( RULE_ID )
            {
             before(grammarAccess.getJpaConfigAccess().getLocalizedEnumsLocalizedCrossReference_3_0()); 
            // InternalProjectGenerator.g:3313:3: ( RULE_ID )
            // InternalProjectGenerator.g:3314:4: RULE_ID
            {
             before(grammarAccess.getJpaConfigAccess().getLocalizedEnumsLocalizedIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getJpaConfigAccess().getLocalizedEnumsLocalizedIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getJpaConfigAccess().getLocalizedEnumsLocalizedCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__JpaConfig__LocalizedEnumsAssignment_3"


    // $ANTLR start "rule__Localized__NameAssignment_0"
    // InternalProjectGenerator.g:3325:1: rule__Localized__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Localized__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3329:1: ( ( RULE_ID ) )
            // InternalProjectGenerator.g:3330:2: ( RULE_ID )
            {
            // InternalProjectGenerator.g:3330:2: ( RULE_ID )
            // InternalProjectGenerator.g:3331:3: RULE_ID
            {
             before(grammarAccess.getLocalizedAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLocalizedAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__NameAssignment_0"


    // $ANTLR start "rule__Localized__ValuesAssignment_2_2"
    // InternalProjectGenerator.g:3340:1: rule__Localized__ValuesAssignment_2_2 : ( ruleLocalizedEntry ) ;
    public final void rule__Localized__ValuesAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3344:1: ( ( ruleLocalizedEntry ) )
            // InternalProjectGenerator.g:3345:2: ( ruleLocalizedEntry )
            {
            // InternalProjectGenerator.g:3345:2: ( ruleLocalizedEntry )
            // InternalProjectGenerator.g:3346:3: ruleLocalizedEntry
            {
             before(grammarAccess.getLocalizedAccess().getValuesLocalizedEntryParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalizedEntry();

            state._fsp--;

             after(grammarAccess.getLocalizedAccess().getValuesLocalizedEntryParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Localized__ValuesAssignment_2_2"


    // $ANTLR start "rule__LocalizedEntry__LocalizedKeyAssignment_2"
    // InternalProjectGenerator.g:3355:1: rule__LocalizedEntry__LocalizedKeyAssignment_2 : ( RULE_LOCALIZEDKEY ) ;
    public final void rule__LocalizedEntry__LocalizedKeyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3359:1: ( ( RULE_LOCALIZEDKEY ) )
            // InternalProjectGenerator.g:3360:2: ( RULE_LOCALIZEDKEY )
            {
            // InternalProjectGenerator.g:3360:2: ( RULE_LOCALIZEDKEY )
            // InternalProjectGenerator.g:3361:3: RULE_LOCALIZEDKEY
            {
             before(grammarAccess.getLocalizedEntryAccess().getLocalizedKeyLocalizedKeyTerminalRuleCall_2_0()); 
            match(input,RULE_LOCALIZEDKEY,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getLocalizedKeyLocalizedKeyTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__LocalizedKeyAssignment_2"


    // $ANTLR start "rule__LocalizedEntry__ValuesAssignment_6"
    // InternalProjectGenerator.g:3370:1: rule__LocalizedEntry__ValuesAssignment_6 : ( ruleLocalizedValue ) ;
    public final void rule__LocalizedEntry__ValuesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3374:1: ( ( ruleLocalizedValue ) )
            // InternalProjectGenerator.g:3375:2: ( ruleLocalizedValue )
            {
            // InternalProjectGenerator.g:3375:2: ( ruleLocalizedValue )
            // InternalProjectGenerator.g:3376:3: ruleLocalizedValue
            {
             before(grammarAccess.getLocalizedEntryAccess().getValuesLocalizedValueParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleLocalizedValue();

            state._fsp--;

             after(grammarAccess.getLocalizedEntryAccess().getValuesLocalizedValueParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__ValuesAssignment_6"


    // $ANTLR start "rule__LocalizedEntry__ArgsAssignment_9_2"
    // InternalProjectGenerator.g:3385:1: rule__LocalizedEntry__ArgsAssignment_9_2 : ( RULE_STRING ) ;
    public final void rule__LocalizedEntry__ArgsAssignment_9_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3389:1: ( ( RULE_STRING ) )
            // InternalProjectGenerator.g:3390:2: ( RULE_STRING )
            {
            // InternalProjectGenerator.g:3390:2: ( RULE_STRING )
            // InternalProjectGenerator.g:3391:3: RULE_STRING
            {
             before(grammarAccess.getLocalizedEntryAccess().getArgsSTRINGTerminalRuleCall_9_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocalizedEntryAccess().getArgsSTRINGTerminalRuleCall_9_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedEntry__ArgsAssignment_9_2"


    // $ANTLR start "rule__LocalizedValue__LocaleAssignment_2"
    // InternalProjectGenerator.g:3400:1: rule__LocalizedValue__LocaleAssignment_2 : ( ruleLocale ) ;
    public final void rule__LocalizedValue__LocaleAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3404:1: ( ( ruleLocale ) )
            // InternalProjectGenerator.g:3405:2: ( ruleLocale )
            {
            // InternalProjectGenerator.g:3405:2: ( ruleLocale )
            // InternalProjectGenerator.g:3406:3: ruleLocale
            {
             before(grammarAccess.getLocalizedValueAccess().getLocaleLocaleEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLocale();

            state._fsp--;

             after(grammarAccess.getLocalizedValueAccess().getLocaleLocaleEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__LocaleAssignment_2"


    // $ANTLR start "rule__LocalizedValue__ValuesAssignment_5"
    // InternalProjectGenerator.g:3415:1: rule__LocalizedValue__ValuesAssignment_5 : ( RULE_STRING ) ;
    public final void rule__LocalizedValue__ValuesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalProjectGenerator.g:3419:1: ( ( RULE_STRING ) )
            // InternalProjectGenerator.g:3420:2: ( RULE_STRING )
            {
            // InternalProjectGenerator.g:3420:2: ( RULE_STRING )
            // InternalProjectGenerator.g:3421:3: RULE_STRING
            {
             before(grammarAccess.getLocalizedValueAccess().getValuesSTRINGTerminalRuleCall_5_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLocalizedValueAccess().getValuesSTRINGTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalizedValue__ValuesAssignment_5"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000C8000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000E0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000001020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004020000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000008020000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000000L});

}