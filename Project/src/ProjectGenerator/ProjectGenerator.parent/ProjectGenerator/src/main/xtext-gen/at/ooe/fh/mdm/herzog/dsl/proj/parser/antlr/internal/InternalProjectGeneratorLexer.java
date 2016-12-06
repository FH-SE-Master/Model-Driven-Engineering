package at.ooe.fh.mdm.herzog.dsl.proj.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalProjectGeneratorLexer extends Lexer {
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

    public InternalProjectGeneratorLexer() {;} 
    public InternalProjectGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProjectGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalProjectGenerator.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:11:7: ( 'module' )
            // InternalProjectGenerator.g:11:9: 'module'
            {
            match("module"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:12:7: ( '{' )
            // InternalProjectGenerator.g:12:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:13:7: ( 'key' )
            // InternalProjectGenerator.g:13:9: 'key'
            {
            match("key"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:14:7: ( ';' )
            // InternalProjectGenerator.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:15:7: ( 'cdiEnabled' )
            // InternalProjectGenerator.g:15:9: 'cdiEnabled'
            {
            match("cdiEnabled"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:16:7: ( 'jpaConfig' )
            // InternalProjectGenerator.g:16:9: 'jpaConfig'
            {
            match("jpaConfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:17:7: ( 'serviceConfig' )
            // InternalProjectGenerator.g:17:9: 'serviceConfig'
            {
            match("serviceConfig"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:18:7: ( 'messageBundles' )
            // InternalProjectGenerator.g:18:9: 'messageBundles'
            {
            match("messageBundles"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:19:7: ( '}' )
            // InternalProjectGenerator.g:19:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:20:7: ( ',' )
            // InternalProjectGenerator.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:21:7: ( 'messages' )
            // InternalProjectGenerator.g:21:9: 'messages'
            {
            match("messages"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:22:7: ( 'observers' )
            // InternalProjectGenerator.g:22:9: 'observers'
            {
            match("observers"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:23:7: ( 'observer' )
            // InternalProjectGenerator.g:23:9: 'observer'
            {
            match("observer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:24:7: ( 'type' )
            // InternalProjectGenerator.g:24:9: 'type'
            {
            match("type"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:25:7: ( 'during' )
            // InternalProjectGenerator.g:25:9: 'during'
            {
            match("during"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:26:7: ( 'notify' )
            // InternalProjectGenerator.g:26:9: 'notify'
            {
            match("notify"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:27:7: ( 'delegate' )
            // InternalProjectGenerator.g:27:9: 'delegate'
            {
            match("delegate"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:28:7: ( '#' )
            // InternalProjectGenerator.g:28:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:29:7: ( 'localizedEnums' )
            // InternalProjectGenerator.g:29:9: 'localizedEnums'
            {
            match("localizedEnums"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:30:7: ( 'localized' )
            // InternalProjectGenerator.g:30:9: 'localized'
            {
            match("localized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:31:7: ( 'name' )
            // InternalProjectGenerator.g:31:9: 'name'
            {
            match("name"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:32:7: ( 'locales' )
            // InternalProjectGenerator.g:32:9: 'locales'
            {
            match("locales"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:33:7: ( 'values' )
            // InternalProjectGenerator.g:33:9: 'values'
            {
            match("values"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:34:7: ( 'locale' )
            // InternalProjectGenerator.g:34:9: 'locale'
            {
            match("locale"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:35:7: ( 'entry' )
            // InternalProjectGenerator.g:35:9: 'entry'
            {
            match("entry"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:36:7: ( 'argumtes' )
            // InternalProjectGenerator.g:36:9: 'argumtes'
            {
            match("argumtes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:37:7: ( 'value' )
            // InternalProjectGenerator.g:37:9: 'value'
            {
            match("value"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:38:7: ( 'de_DE' )
            // InternalProjectGenerator.g:38:9: 'de_DE'
            {
            match("de_DE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:39:7: ( 'en_US' )
            // InternalProjectGenerator.g:39:9: 'en_US'
            {
            match("en_US"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:40:7: ( 'true' )
            // InternalProjectGenerator.g:40:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:41:7: ( 'false' )
            // InternalProjectGenerator.g:41:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:42:7: ( 'InProgress' )
            // InternalProjectGenerator.g:42:9: 'InProgress'
            {
            match("InProgress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:43:7: ( 'AfterCompleition' )
            // InternalProjectGenerator.g:43:9: 'AfterCompleition'
            {
            match("AfterCompleition"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:44:7: ( 'Always' )
            // InternalProjectGenerator.g:44:9: 'Always'
            {
            match("Always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:45:7: ( 'Exists' )
            // InternalProjectGenerator.g:45:9: 'Exists'
            {
            match("Exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "RULE_CLASSNAME"
    public final void mRULE_CLASSNAME() throws RecognitionException {
        try {
            int _type = RULE_CLASSNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:975:16: ( ( 'a' .. 'f' )+ ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+ ( 'a' .. 'f' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ )
            // InternalProjectGenerator.g:975:18: ( 'a' .. 'f' )+ ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+ ( 'a' .. 'f' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // InternalProjectGenerator.g:975:18: ( 'a' .. 'f' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='a' && LA1_0<='f')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalProjectGenerator.g:975:19: 'a' .. 'f'
            	    {
            	    matchRange('a','f'); 

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

            // InternalProjectGenerator.g:975:30: ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalProjectGenerator.g:975:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.'
            	    {
            	    // InternalProjectGenerator.g:975:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalProjectGenerator.g:
            	    	    {
            	    	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	    	        input.consume();

            	    	    }
            	    	    else {
            	    	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	    	        recover(mse);
            	    	        throw mse;}


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	    match('.'); 

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

            // InternalProjectGenerator.g:975:67: ( 'a' .. 'f' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='a' && LA4_0<='f')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectGenerator.g:975:68: 'a' .. 'f'
            	    {
            	    matchRange('a','f'); 

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

            // InternalProjectGenerator.g:975:79: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')||(LA5_0>='A' && LA5_0<='Z')||(LA5_0>='a' && LA5_0<='z')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalProjectGenerator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CLASSNAME"

    // $ANTLR start "RULE_METHODNAME"
    public final void mRULE_METHODNAME() throws RecognitionException {
        try {
            int _type = RULE_METHODNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:977:17: ( ( 'a' .. 'f' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ )
            // InternalProjectGenerator.g:977:19: ( 'a' .. 'f' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // InternalProjectGenerator.g:977:19: ( 'a' .. 'f' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalProjectGenerator.g:977:20: 'a' .. 'f'
            	    {
            	    matchRange('a','f'); 

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

            // InternalProjectGenerator.g:977:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='z')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalProjectGenerator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_METHODNAME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:979:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalProjectGenerator.g:979:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalProjectGenerator.g:979:11: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalProjectGenerator.g:979:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalProjectGenerator.g:979:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProjectGenerator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:981:10: ( ( '0' .. '9' )+ )
            // InternalProjectGenerator.g:981:12: ( '0' .. '9' )+
            {
            // InternalProjectGenerator.g:981:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalProjectGenerator.g:981:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:983:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalProjectGenerator.g:983:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalProjectGenerator.g:983:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalProjectGenerator.g:983:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalProjectGenerator.g:983:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:983:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProjectGenerator.g:983:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:983:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalProjectGenerator.g:983:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:983:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProjectGenerator.g:983:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:985:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalProjectGenerator.g:985:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalProjectGenerator.g:985:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalProjectGenerator.g:985:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:987:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalProjectGenerator.g:987:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalProjectGenerator.g:987:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalProjectGenerator.g:987:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // InternalProjectGenerator.g:987:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalProjectGenerator.g:987:41: ( '\\r' )? '\\n'
                    {
                    // InternalProjectGenerator.g:987:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalProjectGenerator.g:987:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:989:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalProjectGenerator.g:989:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalProjectGenerator.g:989:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalProjectGenerator.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:991:16: ( . )
            // InternalProjectGenerator.g:991:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalProjectGenerator.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_CLASSNAME | RULE_METHODNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=44;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalProjectGenerator.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalProjectGenerator.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalProjectGenerator.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalProjectGenerator.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalProjectGenerator.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalProjectGenerator.g:1:40: T__18
                {
                mT__18(); 

                }
                break;
            case 7 :
                // InternalProjectGenerator.g:1:46: T__19
                {
                mT__19(); 

                }
                break;
            case 8 :
                // InternalProjectGenerator.g:1:52: T__20
                {
                mT__20(); 

                }
                break;
            case 9 :
                // InternalProjectGenerator.g:1:58: T__21
                {
                mT__21(); 

                }
                break;
            case 10 :
                // InternalProjectGenerator.g:1:64: T__22
                {
                mT__22(); 

                }
                break;
            case 11 :
                // InternalProjectGenerator.g:1:70: T__23
                {
                mT__23(); 

                }
                break;
            case 12 :
                // InternalProjectGenerator.g:1:76: T__24
                {
                mT__24(); 

                }
                break;
            case 13 :
                // InternalProjectGenerator.g:1:82: T__25
                {
                mT__25(); 

                }
                break;
            case 14 :
                // InternalProjectGenerator.g:1:88: T__26
                {
                mT__26(); 

                }
                break;
            case 15 :
                // InternalProjectGenerator.g:1:94: T__27
                {
                mT__27(); 

                }
                break;
            case 16 :
                // InternalProjectGenerator.g:1:100: T__28
                {
                mT__28(); 

                }
                break;
            case 17 :
                // InternalProjectGenerator.g:1:106: T__29
                {
                mT__29(); 

                }
                break;
            case 18 :
                // InternalProjectGenerator.g:1:112: T__30
                {
                mT__30(); 

                }
                break;
            case 19 :
                // InternalProjectGenerator.g:1:118: T__31
                {
                mT__31(); 

                }
                break;
            case 20 :
                // InternalProjectGenerator.g:1:124: T__32
                {
                mT__32(); 

                }
                break;
            case 21 :
                // InternalProjectGenerator.g:1:130: T__33
                {
                mT__33(); 

                }
                break;
            case 22 :
                // InternalProjectGenerator.g:1:136: T__34
                {
                mT__34(); 

                }
                break;
            case 23 :
                // InternalProjectGenerator.g:1:142: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // InternalProjectGenerator.g:1:148: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // InternalProjectGenerator.g:1:154: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // InternalProjectGenerator.g:1:160: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // InternalProjectGenerator.g:1:166: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // InternalProjectGenerator.g:1:172: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // InternalProjectGenerator.g:1:178: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // InternalProjectGenerator.g:1:184: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // InternalProjectGenerator.g:1:190: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // InternalProjectGenerator.g:1:196: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // InternalProjectGenerator.g:1:202: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // InternalProjectGenerator.g:1:208: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // InternalProjectGenerator.g:1:214: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // InternalProjectGenerator.g:1:220: RULE_CLASSNAME
                {
                mRULE_CLASSNAME(); 

                }
                break;
            case 37 :
                // InternalProjectGenerator.g:1:235: RULE_METHODNAME
                {
                mRULE_METHODNAME(); 

                }
                break;
            case 38 :
                // InternalProjectGenerator.g:1:251: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 39 :
                // InternalProjectGenerator.g:1:259: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 40 :
                // InternalProjectGenerator.g:1:268: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 41 :
                // InternalProjectGenerator.g:1:280: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 42 :
                // InternalProjectGenerator.g:1:296: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 43 :
                // InternalProjectGenerator.g:1:312: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 44 :
                // InternalProjectGenerator.g:1:320: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA3_eotS =
        "\3\uffff\2\5\1\uffff";
    static final String DFA3_eofS =
        "\6\uffff";
    static final String DFA3_minS =
        "\1\60\1\56\1\uffff\2\56\1\uffff";
    static final String DFA3_maxS =
        "\2\172\1\uffff\2\172\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\1\2\uffff\1\2";
    static final String DFA3_specialS =
        "\6\uffff}>";
    static final String[] DFA3_transitionS = {
            "\12\2\7\uffff\32\2\6\uffff\6\1\24\2",
            "\1\2\1\uffff\12\4\7\uffff\32\4\6\uffff\6\3\24\4",
            "",
            "\1\2\1\uffff\12\4\7\uffff\32\4\6\uffff\6\3\24\4",
            "\1\2\1\uffff\12\4\7\uffff\32\4\6\uffff\32\4",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "()+ loopback of 975:30: ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+";
        }
    }
    static final String DFA19_eotS =
        "\1\uffff\1\42\1\uffff\1\42\1\uffff\3\42\2\uffff\4\42\1\uffff\11\42\1\37\2\uffff\3\37\2\uffff\2\42\2\uffff\1\42\1\uffff\3\107\2\42\2\uffff\3\42\2\107\2\42\1\uffff\2\42\3\107\4\42\5\uffff\2\42\1\137\1\107\2\uffff\5\42\2\107\5\42\1\107\1\42\2\107\6\42\1\uffff\1\107\3\42\1\173\1\174\2\107\2\42\1\u0081\2\42\1\107\1\42\2\107\6\42\1\107\3\42\2\uffff\2\107\1\u0094\1\42\1\uffff\1\42\1\u0099\1\u009a\1\u009b\1\107\1\u009d\4\42\1\u00a2\1\42\1\107\3\42\1\u00a8\1\107\1\uffff\1\u00aa\1\42\1\u00ad\1\u00ae\3\uffff\1\107\1\uffff\2\42\1\u00b2\1\u00b3\1\uffff\1\42\1\107\3\42\1\uffff\1\107\1\uffff\1\42\1\u00bc\2\uffff\1\107\2\42\2\uffff\1\42\1\u00c1\1\107\2\42\1\u00c6\1\u00c7\1\42\1\uffff\1\u00c9\3\42\1\uffff\1\107\1\u00ce\1\42\1\u00d0\2\uffff\1\u00d2\1\uffff\3\42\1\u00d6\1\uffff\1\42\1\uffff\1\42\1\uffff\1\u00d9\2\42\1\uffff\2\42\1\uffff\6\42\1\u00e4\2\42\1\u00e7\1\uffff\1\u00e8\1\42\2\uffff\1\42\1\u00eb\1\uffff";
    static final String DFA19_eofS =
        "\u00ec\uffff";
    static final String DFA19_minS =
        "\1\0\1\145\1\uffff\1\145\1\uffff\1\60\1\160\1\145\2\uffff\1\142\1\162\1\60\1\141\1\uffff\1\157\1\141\3\60\1\156\1\146\1\170\1\60\1\101\2\uffff\2\0\1\52\2\uffff\1\144\1\163\2\uffff\1\171\1\uffff\3\56\1\141\1\162\2\uffff\1\163\1\160\1\165\2\56\1\164\1\155\1\uffff\1\143\1\154\3\56\1\120\1\164\1\167\1\151\5\uffff\1\165\1\163\1\60\1\56\2\uffff\1\103\1\166\3\145\2\56\1\104\1\151\1\145\1\141\1\165\1\56\1\125\2\56\1\162\1\145\1\141\1\163\1\154\1\141\1\uffff\1\56\1\157\1\151\1\162\2\60\2\56\1\105\1\146\1\60\1\154\1\145\1\56\1\123\2\56\1\157\1\162\1\171\1\164\1\145\1\147\1\56\1\156\1\143\1\166\2\uffff\2\56\1\60\1\171\1\uffff\1\145\1\60\1\56\1\60\2\56\1\147\1\103\2\163\1\60\1\145\1\56\1\146\2\145\2\56\1\uffff\1\60\1\172\2\60\3\uffff\1\56\1\uffff\1\162\1\157\2\60\1\uffff\1\102\1\56\1\151\1\103\1\162\1\uffff\1\56\1\uffff\1\145\1\60\2\uffff\1\56\1\145\1\155\2\uffff\1\165\1\60\1\56\1\147\1\157\1\60\1\56\1\144\1\uffff\1\56\1\163\1\160\1\156\1\uffff\1\56\1\60\1\156\1\60\2\uffff\1\60\1\uffff\1\163\1\154\1\144\1\56\1\uffff\1\146\1\uffff\1\156\1\uffff\1\60\1\145\1\154\1\uffff\1\151\1\165\1\uffff\1\151\1\145\1\147\1\155\1\164\1\163\1\60\1\163\1\151\1\60\1\uffff\1\60\1\157\2\uffff\1\156\1\60\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\157\1\uffff\1\145\1\uffff\1\172\1\160\1\145\2\uffff\1\142\1\171\1\172\1\157\1\uffff\1\157\1\141\3\172\1\156\1\154\1\170\2\172\2\uffff\2\uffff\1\57\2\uffff\1\144\1\163\2\uffff\1\171\1\uffff\3\172\1\141\1\162\2\uffff\1\163\1\160\1\165\2\172\1\164\1\155\1\uffff\1\143\1\154\3\172\1\120\1\164\1\167\1\151\5\uffff\1\165\1\163\2\172\2\uffff\1\103\1\166\3\145\2\172\1\104\1\151\1\145\1\141\1\165\1\172\1\125\2\172\1\162\1\145\1\141\1\163\1\154\1\141\1\uffff\1\172\1\157\1\151\1\162\4\172\1\105\1\146\1\172\1\154\1\145\1\172\1\123\2\172\1\157\1\162\1\171\1\164\1\145\1\147\1\172\1\156\1\143\1\166\2\uffff\3\172\1\171\1\uffff\1\151\5\172\1\147\1\103\2\163\1\172\1\145\1\172\1\146\2\145\2\172\1\uffff\4\172\3\uffff\1\172\1\uffff\1\162\1\157\2\172\1\uffff\1\163\1\172\1\151\1\103\1\162\1\uffff\1\172\1\uffff\1\145\1\172\2\uffff\1\172\1\145\1\155\2\uffff\1\165\2\172\1\147\1\157\2\172\1\144\1\uffff\1\172\1\163\1\160\1\156\1\uffff\2\172\1\156\1\172\2\uffff\1\172\1\uffff\1\163\1\154\1\144\1\172\1\uffff\1\146\1\uffff\1\156\1\uffff\1\172\1\145\1\154\1\uffff\1\151\1\165\1\uffff\1\151\1\145\1\147\1\155\1\164\1\163\1\172\1\163\1\151\1\172\1\uffff\1\172\1\157\2\uffff\1\156\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\3\uffff\1\11\1\12\4\uffff\1\22\12\uffff\1\46\1\47\3\uffff\1\53\1\54\2\uffff\1\46\1\2\1\uffff\1\4\5\uffff\1\11\1\12\7\uffff\1\22\11\uffff\1\47\1\50\1\51\1\52\1\53\4\uffff\1\45\1\44\26\uffff\1\3\33\uffff\1\16\1\36\4\uffff\1\25\22\uffff\1\34\4\uffff\1\33\1\31\1\35\1\uffff\1\37\4\uffff\1\1\5\uffff\1\17\1\uffff\1\20\2\uffff\1\30\1\27\3\uffff\1\42\1\43\10\uffff\1\26\4\uffff\1\13\4\uffff\1\15\1\21\1\uffff\1\32\4\uffff\1\6\1\uffff\1\14\1\uffff\1\24\3\uffff\1\5\2\uffff\1\40\12\uffff\1\7\2\uffff\1\10\1\23\2\uffff\1\41";
    static final String DFA19_specialS =
        "\1\2\32\uffff\1\0\1\1\u00cf\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\1\16\3\37\1\34\4\37\1\11\2\37\1\35\12\32\1\37\1\4\5\37\1\25\3\31\1\26\3\31\1\24\21\31\3\37\1\30\1\31\1\37\1\22\1\27\1\5\1\14\1\21\1\23\3\31\1\6\1\3\1\17\1\1\1\15\1\12\3\31\1\7\1\13\1\31\1\20\4\31\1\2\1\37\1\10\uff82\37",
            "\1\41\11\uffff\1\40",
            "",
            "\1\44",
            "",
            "\12\50\7\uffff\32\50\6\uffff\3\47\1\46\2\47\24\50",
            "\1\51",
            "\1\52",
            "",
            "",
            "\1\55",
            "\1\57\6\uffff\1\56",
            "\12\50\7\uffff\32\50\6\uffff\4\47\1\61\1\47\16\50\1\60\5\50",
            "\1\63\15\uffff\1\62",
            "",
            "\1\65",
            "\1\66",
            "\12\50\7\uffff\32\50\6\uffff\6\47\7\50\1\67\14\50",
            "\12\50\7\uffff\32\50\6\uffff\6\47\13\50\1\70\10\50",
            "\12\50\7\uffff\32\50\6\uffff\1\71\5\47\24\50",
            "\1\72",
            "\1\73\5\uffff\1\74",
            "\1\75",
            "\12\50\7\uffff\32\50\6\uffff\6\47\24\50",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\0\77",
            "\0\77",
            "\1\100\4\uffff\1\101",
            "",
            "",
            "\1\103",
            "\1\104",
            "",
            "",
            "\1\105",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\47\2\50\1\106\21\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\47\24\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\111",
            "\1\112",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\21\50\1\116\10\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\120\1\uffff\6\47\5\50\1\117\16\50",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\126\1\uffff\23\50\1\125\6\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\50\1\127\23\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\47\5\50\1\130\16\50",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "",
            "",
            "",
            "",
            "\1\135",
            "\1\136",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\110\1\uffff\12\50\7\uffff\4\50\1\140\25\50\4\uffff\1\42\1\uffff\32\50",
            "",
            "",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\10\50\1\146\21\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\147\25\50",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\21\50\1\155\10\50",
            "\1\156",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\24\50\1\157\5\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\22\50\1\160\7\50",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\15\50\1\167\14\50",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\15\50\1\175\14\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\50\1\176\23\50",
            "\1\177",
            "\1\u0080",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0082",
            "\1\u0083",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\30\50\1\u0084\1\50",
            "\1\u0085",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\14\50\1\u0086\15\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u0087\25\50",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\1\u008e\31\50",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\50\1\u0092\23\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\1\u0093\31\50",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0095",
            "",
            "\1\u0097\3\uffff\1\u0096",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u0098\7\42",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\23\50\1\u009c\6\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a3",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\1\50\1\u00a4\30\50",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\23\50\1\u00a9\6\50",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00ab",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u00ac\7\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u00af\25\50",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00b4\60\uffff\1\u00b5",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\13\50\1\u00b6\16\50",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u00ba\25\50",
            "",
            "\1\u00bb",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\22\50\1\u00bd\7\50",
            "\1\u00be",
            "\1\u00bf",
            "",
            "",
            "\1\u00c0",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u00c2\25\50",
            "\1\u00c3",
            "\1\u00c4",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u00c5\7\42",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\u00c8",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\3\50\1\u00cd\26\50",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00cf",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "\12\42\7\uffff\4\42\1\u00d1\25\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\110\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00da",
            "\1\u00db",
            "",
            "\1\u00dc",
            "\1\u00dd",
            "",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e5",
            "\1\u00e6",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e9",
            "",
            "",
            "\1\u00ea",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | RULE_CLASSNAME | RULE_METHODNAME | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_27 = input.LA(1);

                        s = -1;
                        if ( ((LA19_27>='\u0000' && LA19_27<='\uFFFF')) ) {s = 63;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_28 = input.LA(1);

                        s = -1;
                        if ( ((LA19_28>='\u0000' && LA19_28<='\uFFFF')) ) {s = 63;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='m') ) {s = 1;}

                        else if ( (LA19_0=='{') ) {s = 2;}

                        else if ( (LA19_0=='k') ) {s = 3;}

                        else if ( (LA19_0==';') ) {s = 4;}

                        else if ( (LA19_0=='c') ) {s = 5;}

                        else if ( (LA19_0=='j') ) {s = 6;}

                        else if ( (LA19_0=='s') ) {s = 7;}

                        else if ( (LA19_0=='}') ) {s = 8;}

                        else if ( (LA19_0==',') ) {s = 9;}

                        else if ( (LA19_0=='o') ) {s = 10;}

                        else if ( (LA19_0=='t') ) {s = 11;}

                        else if ( (LA19_0=='d') ) {s = 12;}

                        else if ( (LA19_0=='n') ) {s = 13;}

                        else if ( (LA19_0=='#') ) {s = 14;}

                        else if ( (LA19_0=='l') ) {s = 15;}

                        else if ( (LA19_0=='v') ) {s = 16;}

                        else if ( (LA19_0=='e') ) {s = 17;}

                        else if ( (LA19_0=='a') ) {s = 18;}

                        else if ( (LA19_0=='f') ) {s = 19;}

                        else if ( (LA19_0=='I') ) {s = 20;}

                        else if ( (LA19_0=='A') ) {s = 21;}

                        else if ( (LA19_0=='E') ) {s = 22;}

                        else if ( (LA19_0=='b') ) {s = 23;}

                        else if ( (LA19_0=='^') ) {s = 24;}

                        else if ( ((LA19_0>='B' && LA19_0<='D')||(LA19_0>='F' && LA19_0<='H')||(LA19_0>='J' && LA19_0<='Z')||LA19_0=='_'||(LA19_0>='g' && LA19_0<='i')||(LA19_0>='p' && LA19_0<='r')||LA19_0=='u'||(LA19_0>='w' && LA19_0<='z')) ) {s = 25;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 26;}

                        else if ( (LA19_0=='\"') ) {s = 27;}

                        else if ( (LA19_0=='\'') ) {s = 28;}

                        else if ( (LA19_0=='/') ) {s = 29;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 30;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||(LA19_0>='$' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='+')||(LA19_0>='-' && LA19_0<='.')||LA19_0==':'||(LA19_0>='<' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}