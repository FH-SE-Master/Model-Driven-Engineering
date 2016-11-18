package at.fh.hagenberg.ide.contentassist.antlr.internal;

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
import at.fh.hagenberg.services.SwmlGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSwmlParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(SwmlGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleWebApplication"
    // InternalSwml.g:53:1: entryRuleWebApplication : ruleWebApplication EOF ;
    public final void entryRuleWebApplication() throws RecognitionException {
        try {
            // InternalSwml.g:54:1: ( ruleWebApplication EOF )
            // InternalSwml.g:55:1: ruleWebApplication EOF
            {
             before(grammarAccess.getWebApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleWebApplication();

            state._fsp--;

             after(grammarAccess.getWebApplicationRule()); 
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
    // $ANTLR end "entryRuleWebApplication"


    // $ANTLR start "ruleWebApplication"
    // InternalSwml.g:62:1: ruleWebApplication : ( ( rule__WebApplication__Group__0 ) ) ;
    public final void ruleWebApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:66:2: ( ( ( rule__WebApplication__Group__0 ) ) )
            // InternalSwml.g:67:2: ( ( rule__WebApplication__Group__0 ) )
            {
            // InternalSwml.g:67:2: ( ( rule__WebApplication__Group__0 ) )
            // InternalSwml.g:68:3: ( rule__WebApplication__Group__0 )
            {
             before(grammarAccess.getWebApplicationAccess().getGroup()); 
            // InternalSwml.g:69:3: ( rule__WebApplication__Group__0 )
            // InternalSwml.g:69:4: rule__WebApplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WebApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWebApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleWebApplication"


    // $ANTLR start "entryRuleEntity"
    // InternalSwml.g:78:1: entryRuleEntity : ruleEntity EOF ;
    public final void entryRuleEntity() throws RecognitionException {
        try {
            // InternalSwml.g:79:1: ( ruleEntity EOF )
            // InternalSwml.g:80:1: ruleEntity EOF
            {
             before(grammarAccess.getEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getEntityRule()); 
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
    // $ANTLR end "entryRuleEntity"


    // $ANTLR start "ruleEntity"
    // InternalSwml.g:87:1: ruleEntity : ( ( rule__Entity__Group__0 ) ) ;
    public final void ruleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:91:2: ( ( ( rule__Entity__Group__0 ) ) )
            // InternalSwml.g:92:2: ( ( rule__Entity__Group__0 ) )
            {
            // InternalSwml.g:92:2: ( ( rule__Entity__Group__0 ) )
            // InternalSwml.g:93:3: ( rule__Entity__Group__0 )
            {
             before(grammarAccess.getEntityAccess().getGroup()); 
            // InternalSwml.g:94:3: ( rule__Entity__Group__0 )
            // InternalSwml.g:94:4: rule__Entity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getGroup()); 

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
    // $ANTLR end "ruleEntity"


    // $ANTLR start "rule__WebApplication__Group__0"
    // InternalSwml.g:102:1: rule__WebApplication__Group__0 : rule__WebApplication__Group__0__Impl rule__WebApplication__Group__1 ;
    public final void rule__WebApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:106:1: ( rule__WebApplication__Group__0__Impl rule__WebApplication__Group__1 )
            // InternalSwml.g:107:2: rule__WebApplication__Group__0__Impl rule__WebApplication__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__WebApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebApplication__Group__1();

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
    // $ANTLR end "rule__WebApplication__Group__0"


    // $ANTLR start "rule__WebApplication__Group__0__Impl"
    // InternalSwml.g:114:1: rule__WebApplication__Group__0__Impl : ( 'webapp' ) ;
    public final void rule__WebApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:118:1: ( ( 'webapp' ) )
            // InternalSwml.g:119:1: ( 'webapp' )
            {
            // InternalSwml.g:119:1: ( 'webapp' )
            // InternalSwml.g:120:2: 'webapp'
            {
             before(grammarAccess.getWebApplicationAccess().getWebappKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getWebApplicationAccess().getWebappKeyword_0()); 

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
    // $ANTLR end "rule__WebApplication__Group__0__Impl"


    // $ANTLR start "rule__WebApplication__Group__1"
    // InternalSwml.g:129:1: rule__WebApplication__Group__1 : rule__WebApplication__Group__1__Impl rule__WebApplication__Group__2 ;
    public final void rule__WebApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:133:1: ( rule__WebApplication__Group__1__Impl rule__WebApplication__Group__2 )
            // InternalSwml.g:134:2: rule__WebApplication__Group__1__Impl rule__WebApplication__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__WebApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebApplication__Group__2();

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
    // $ANTLR end "rule__WebApplication__Group__1"


    // $ANTLR start "rule__WebApplication__Group__1__Impl"
    // InternalSwml.g:141:1: rule__WebApplication__Group__1__Impl : ( ( rule__WebApplication__NameAssignment_1 ) ) ;
    public final void rule__WebApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:145:1: ( ( ( rule__WebApplication__NameAssignment_1 ) ) )
            // InternalSwml.g:146:1: ( ( rule__WebApplication__NameAssignment_1 ) )
            {
            // InternalSwml.g:146:1: ( ( rule__WebApplication__NameAssignment_1 ) )
            // InternalSwml.g:147:2: ( rule__WebApplication__NameAssignment_1 )
            {
             before(grammarAccess.getWebApplicationAccess().getNameAssignment_1()); 
            // InternalSwml.g:148:2: ( rule__WebApplication__NameAssignment_1 )
            // InternalSwml.g:148:3: rule__WebApplication__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__WebApplication__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWebApplicationAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WebApplication__Group__1__Impl"


    // $ANTLR start "rule__WebApplication__Group__2"
    // InternalSwml.g:156:1: rule__WebApplication__Group__2 : rule__WebApplication__Group__2__Impl rule__WebApplication__Group__3 ;
    public final void rule__WebApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:160:1: ( rule__WebApplication__Group__2__Impl rule__WebApplication__Group__3 )
            // InternalSwml.g:161:2: rule__WebApplication__Group__2__Impl rule__WebApplication__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__WebApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebApplication__Group__3();

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
    // $ANTLR end "rule__WebApplication__Group__2"


    // $ANTLR start "rule__WebApplication__Group__2__Impl"
    // InternalSwml.g:168:1: rule__WebApplication__Group__2__Impl : ( '(' ) ;
    public final void rule__WebApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:172:1: ( ( '(' ) )
            // InternalSwml.g:173:1: ( '(' )
            {
            // InternalSwml.g:173:1: ( '(' )
            // InternalSwml.g:174:2: '('
            {
             before(grammarAccess.getWebApplicationAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getWebApplicationAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__WebApplication__Group__2__Impl"


    // $ANTLR start "rule__WebApplication__Group__3"
    // InternalSwml.g:183:1: rule__WebApplication__Group__3 : rule__WebApplication__Group__3__Impl rule__WebApplication__Group__4 ;
    public final void rule__WebApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:187:1: ( rule__WebApplication__Group__3__Impl rule__WebApplication__Group__4 )
            // InternalSwml.g:188:2: rule__WebApplication__Group__3__Impl rule__WebApplication__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__WebApplication__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WebApplication__Group__4();

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
    // $ANTLR end "rule__WebApplication__Group__3"


    // $ANTLR start "rule__WebApplication__Group__3__Impl"
    // InternalSwml.g:195:1: rule__WebApplication__Group__3__Impl : ( ( rule__WebApplication__EntitiesAssignment_3 )* ) ;
    public final void rule__WebApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:199:1: ( ( ( rule__WebApplication__EntitiesAssignment_3 )* ) )
            // InternalSwml.g:200:1: ( ( rule__WebApplication__EntitiesAssignment_3 )* )
            {
            // InternalSwml.g:200:1: ( ( rule__WebApplication__EntitiesAssignment_3 )* )
            // InternalSwml.g:201:2: ( rule__WebApplication__EntitiesAssignment_3 )*
            {
             before(grammarAccess.getWebApplicationAccess().getEntitiesAssignment_3()); 
            // InternalSwml.g:202:2: ( rule__WebApplication__EntitiesAssignment_3 )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalSwml.g:202:3: rule__WebApplication__EntitiesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__WebApplication__EntitiesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getWebApplicationAccess().getEntitiesAssignment_3()); 

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
    // $ANTLR end "rule__WebApplication__Group__3__Impl"


    // $ANTLR start "rule__WebApplication__Group__4"
    // InternalSwml.g:210:1: rule__WebApplication__Group__4 : rule__WebApplication__Group__4__Impl ;
    public final void rule__WebApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:214:1: ( rule__WebApplication__Group__4__Impl )
            // InternalSwml.g:215:2: rule__WebApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WebApplication__Group__4__Impl();

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
    // $ANTLR end "rule__WebApplication__Group__4"


    // $ANTLR start "rule__WebApplication__Group__4__Impl"
    // InternalSwml.g:221:1: rule__WebApplication__Group__4__Impl : ( ')' ) ;
    public final void rule__WebApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:225:1: ( ( ')' ) )
            // InternalSwml.g:226:1: ( ')' )
            {
            // InternalSwml.g:226:1: ( ')' )
            // InternalSwml.g:227:2: ')'
            {
             before(grammarAccess.getWebApplicationAccess().getRightParenthesisKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getWebApplicationAccess().getRightParenthesisKeyword_4()); 

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
    // $ANTLR end "rule__WebApplication__Group__4__Impl"


    // $ANTLR start "rule__Entity__Group__0"
    // InternalSwml.g:237:1: rule__Entity__Group__0 : rule__Entity__Group__0__Impl rule__Entity__Group__1 ;
    public final void rule__Entity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:241:1: ( rule__Entity__Group__0__Impl rule__Entity__Group__1 )
            // InternalSwml.g:242:2: rule__Entity__Group__0__Impl rule__Entity__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Entity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__1();

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
    // $ANTLR end "rule__Entity__Group__0"


    // $ANTLR start "rule__Entity__Group__0__Impl"
    // InternalSwml.g:249:1: rule__Entity__Group__0__Impl : ( 'entity' ) ;
    public final void rule__Entity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:253:1: ( ( 'entity' ) )
            // InternalSwml.g:254:1: ( 'entity' )
            {
            // InternalSwml.g:254:1: ( 'entity' )
            // InternalSwml.g:255:2: 'entity'
            {
             before(grammarAccess.getEntityAccess().getEntityKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getEntityKeyword_0()); 

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
    // $ANTLR end "rule__Entity__Group__0__Impl"


    // $ANTLR start "rule__Entity__Group__1"
    // InternalSwml.g:264:1: rule__Entity__Group__1 : rule__Entity__Group__1__Impl rule__Entity__Group__2 ;
    public final void rule__Entity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:268:1: ( rule__Entity__Group__1__Impl rule__Entity__Group__2 )
            // InternalSwml.g:269:2: rule__Entity__Group__1__Impl rule__Entity__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Entity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__2();

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
    // $ANTLR end "rule__Entity__Group__1"


    // $ANTLR start "rule__Entity__Group__1__Impl"
    // InternalSwml.g:276:1: rule__Entity__Group__1__Impl : ( ( rule__Entity__NameAssignment_1 ) ) ;
    public final void rule__Entity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:280:1: ( ( ( rule__Entity__NameAssignment_1 ) ) )
            // InternalSwml.g:281:1: ( ( rule__Entity__NameAssignment_1 ) )
            {
            // InternalSwml.g:281:1: ( ( rule__Entity__NameAssignment_1 ) )
            // InternalSwml.g:282:2: ( rule__Entity__NameAssignment_1 )
            {
             before(grammarAccess.getEntityAccess().getNameAssignment_1()); 
            // InternalSwml.g:283:2: ( rule__Entity__NameAssignment_1 )
            // InternalSwml.g:283:3: rule__Entity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Entity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEntityAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Entity__Group__1__Impl"


    // $ANTLR start "rule__Entity__Group__2"
    // InternalSwml.g:291:1: rule__Entity__Group__2 : rule__Entity__Group__2__Impl rule__Entity__Group__3 ;
    public final void rule__Entity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:295:1: ( rule__Entity__Group__2__Impl rule__Entity__Group__3 )
            // InternalSwml.g:296:2: rule__Entity__Group__2__Impl rule__Entity__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Entity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Entity__Group__3();

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
    // $ANTLR end "rule__Entity__Group__2"


    // $ANTLR start "rule__Entity__Group__2__Impl"
    // InternalSwml.g:303:1: rule__Entity__Group__2__Impl : ( '(' ) ;
    public final void rule__Entity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:307:1: ( ( '(' ) )
            // InternalSwml.g:308:1: ( '(' )
            {
            // InternalSwml.g:308:1: ( '(' )
            // InternalSwml.g:309:2: '('
            {
             before(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__Entity__Group__2__Impl"


    // $ANTLR start "rule__Entity__Group__3"
    // InternalSwml.g:318:1: rule__Entity__Group__3 : rule__Entity__Group__3__Impl ;
    public final void rule__Entity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:322:1: ( rule__Entity__Group__3__Impl )
            // InternalSwml.g:323:2: rule__Entity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Entity__Group__3__Impl();

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
    // $ANTLR end "rule__Entity__Group__3"


    // $ANTLR start "rule__Entity__Group__3__Impl"
    // InternalSwml.g:329:1: rule__Entity__Group__3__Impl : ( ')' ) ;
    public final void rule__Entity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:333:1: ( ( ')' ) )
            // InternalSwml.g:334:1: ( ')' )
            {
            // InternalSwml.g:334:1: ( ')' )
            // InternalSwml.g:335:2: ')'
            {
             before(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Entity__Group__3__Impl"


    // $ANTLR start "rule__WebApplication__NameAssignment_1"
    // InternalSwml.g:345:1: rule__WebApplication__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__WebApplication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:349:1: ( ( RULE_ID ) )
            // InternalSwml.g:350:2: ( RULE_ID )
            {
            // InternalSwml.g:350:2: ( RULE_ID )
            // InternalSwml.g:351:3: RULE_ID
            {
             before(grammarAccess.getWebApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getWebApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__WebApplication__NameAssignment_1"


    // $ANTLR start "rule__WebApplication__EntitiesAssignment_3"
    // InternalSwml.g:360:1: rule__WebApplication__EntitiesAssignment_3 : ( ruleEntity ) ;
    public final void rule__WebApplication__EntitiesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:364:1: ( ( ruleEntity ) )
            // InternalSwml.g:365:2: ( ruleEntity )
            {
            // InternalSwml.g:365:2: ( ruleEntity )
            // InternalSwml.g:366:3: ruleEntity
            {
             before(grammarAccess.getWebApplicationAccess().getEntitiesEntityParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEntity();

            state._fsp--;

             after(grammarAccess.getWebApplicationAccess().getEntitiesEntityParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WebApplication__EntitiesAssignment_3"


    // $ANTLR start "rule__Entity__NameAssignment_1"
    // InternalSwml.g:375:1: rule__Entity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Entity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalSwml.g:379:1: ( ( RULE_ID ) )
            // InternalSwml.g:380:2: ( RULE_ID )
            {
            // InternalSwml.g:380:2: ( RULE_ID )
            // InternalSwml.g:381:3: RULE_ID
            {
             before(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEntityAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Entity__NameAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});

}