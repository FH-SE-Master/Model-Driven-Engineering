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

    public InternalProjectGeneratorLexer() {;} 
    public InternalProjectGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalProjectGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalProjectGenerator.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:16:7: ( 'messageBundles' )
            // InternalProjectGenerator.g:16:9: 'messageBundles'
            {
            match("messageBundles"); 


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
            // InternalProjectGenerator.g:17:7: ( '}' )
            // InternalProjectGenerator.g:17:9: '}'
            {
            match('}'); 

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
            // InternalProjectGenerator.g:18:7: ( 'observers' )
            // InternalProjectGenerator.g:18:9: 'observers'
            {
            match("observers"); 


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
            // InternalProjectGenerator.g:19:7: ( 'jpaConfig' )
            // InternalProjectGenerator.g:19:9: 'jpaConfig'
            {
            match("jpaConfig"); 


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
            // InternalProjectGenerator.g:20:7: ( 'serviceConfig' )
            // InternalProjectGenerator.g:20:9: 'serviceConfig'
            {
            match("serviceConfig"); 


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
            // InternalProjectGenerator.g:21:7: ( 'type' )
            // InternalProjectGenerator.g:21:9: 'type'
            {
            match("type"); 


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
            // InternalProjectGenerator.g:22:7: ( 'during' )
            // InternalProjectGenerator.g:22:9: 'during'
            {
            match("during"); 


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
            // InternalProjectGenerator.g:23:7: ( 'notify' )
            // InternalProjectGenerator.g:23:9: 'notify'
            {
            match("notify"); 


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
            // InternalProjectGenerator.g:24:7: ( 'delegate' )
            // InternalProjectGenerator.g:24:9: 'delegate'
            {
            match("delegate"); 


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
            // InternalProjectGenerator.g:25:7: ( 'qualifier' )
            // InternalProjectGenerator.g:25:9: 'qualifier'
            {
            match("qualifier"); 


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
            // InternalProjectGenerator.g:26:7: ( 'localizedEnums' )
            // InternalProjectGenerator.g:26:9: 'localizedEnums'
            {
            match("localizedEnums"); 


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
            // InternalProjectGenerator.g:27:7: ( 'values' )
            // InternalProjectGenerator.g:27:9: 'values'
            {
            match("values"); 


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
            // InternalProjectGenerator.g:28:7: ( 'args' )
            // InternalProjectGenerator.g:28:9: 'args'
            {
            match("args"); 


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
            // InternalProjectGenerator.g:29:7: ( 'locale' )
            // InternalProjectGenerator.g:29:9: 'locale'
            {
            match("locale"); 


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
            // InternalProjectGenerator.g:30:7: ( 'value' )
            // InternalProjectGenerator.g:30:9: 'value'
            {
            match("value"); 


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
            // InternalProjectGenerator.g:31:7: ( 'de_DE' )
            // InternalProjectGenerator.g:31:9: 'de_DE'
            {
            match("de_DE"); 


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
            // InternalProjectGenerator.g:32:7: ( 'en_US' )
            // InternalProjectGenerator.g:32:9: 'en_US'
            {
            match("en_US"); 


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
            // InternalProjectGenerator.g:33:7: ( 'true' )
            // InternalProjectGenerator.g:33:9: 'true'
            {
            match("true"); 


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
            // InternalProjectGenerator.g:34:7: ( 'false' )
            // InternalProjectGenerator.g:34:9: 'false'
            {
            match("false"); 


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
            // InternalProjectGenerator.g:35:7: ( 'InProgress' )
            // InternalProjectGenerator.g:35:9: 'InProgress'
            {
            match("InProgress"); 


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
            // InternalProjectGenerator.g:36:7: ( 'AfterCompleition' )
            // InternalProjectGenerator.g:36:9: 'AfterCompleition'
            {
            match("AfterCompleition"); 


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
            // InternalProjectGenerator.g:37:7: ( 'Always' )
            // InternalProjectGenerator.g:37:9: 'Always'
            {
            match("Always"); 


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
            // InternalProjectGenerator.g:38:7: ( 'Exists' )
            // InternalProjectGenerator.g:38:9: 'Exists'
            {
            match("Exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_CLASSNAME"
    public final void mRULE_CLASSNAME() throws RecognitionException {
        try {
            int _type = RULE_CLASSNAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:1008:16: ( ( 'a' .. 'f' )+ ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+ ( 'A' .. 'Z' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ )
            // InternalProjectGenerator.g:1008:18: ( 'a' .. 'f' )+ ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+ ( 'A' .. 'Z' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // InternalProjectGenerator.g:1008:18: ( 'a' .. 'f' )+
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
            	    // InternalProjectGenerator.g:1008:19: 'a' .. 'f'
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

            // InternalProjectGenerator.g:1008:30: ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                alt3 = dfa3.predict(input);
                switch (alt3) {
            	case 1 :
            	    // InternalProjectGenerator.g:1008:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.'
            	    {
            	    // InternalProjectGenerator.g:1008:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
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

            // InternalProjectGenerator.g:1008:67: ( 'A' .. 'Z' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='A' && LA4_0<='Z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalProjectGenerator.g:1008:68: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

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

            // InternalProjectGenerator.g:1008:79: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
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
            // InternalProjectGenerator.g:1010:17: ( ( 'a' .. 'f' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ )
            // InternalProjectGenerator.g:1010:19: ( 'a' .. 'f' )+ ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
            {
            // InternalProjectGenerator.g:1010:19: ( 'a' .. 'f' )+
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
            	    // InternalProjectGenerator.g:1010:20: 'a' .. 'f'
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

            // InternalProjectGenerator.g:1010:31: ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+
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

    // $ANTLR start "RULE_LOCALIZEDKEY"
    public final void mRULE_LOCALIZEDKEY() throws RecognitionException {
        try {
            int _type = RULE_LOCALIZEDKEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:1012:19: ( ( 'A' .. 'Z' | '0' .. '9' )+ ( '_' ( 'A' .. 'Z' | '0' .. '9' ) )* )
            // InternalProjectGenerator.g:1012:21: ( 'A' .. 'Z' | '0' .. '9' )+ ( '_' ( 'A' .. 'Z' | '0' .. '9' ) )*
            {
            // InternalProjectGenerator.g:1012:21: ( 'A' .. 'Z' | '0' .. '9' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalProjectGenerator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // InternalProjectGenerator.g:1012:42: ( '_' ( 'A' .. 'Z' | '0' .. '9' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalProjectGenerator.g:1012:43: '_' ( 'A' .. 'Z' | '0' .. '9' )
            	    {
            	    match('_'); 
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z') ) {
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
    // $ANTLR end "RULE_LOCALIZEDKEY"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalProjectGenerator.g:1014:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalProjectGenerator.g:1014:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalProjectGenerator.g:1014:11: ( '^' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='^') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalProjectGenerator.g:1014:11: '^'
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

            // InternalProjectGenerator.g:1014:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
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
            	    break loop11;
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
            // InternalProjectGenerator.g:1016:10: ( ( '0' .. '9' )+ )
            // InternalProjectGenerator.g:1016:12: ( '0' .. '9' )+
            {
            // InternalProjectGenerator.g:1016:12: ( '0' .. '9' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalProjectGenerator.g:1016:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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
            // InternalProjectGenerator.g:1018:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalProjectGenerator.g:1018:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalProjectGenerator.g:1018:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\"') ) {
                alt15=1;
            }
            else if ( (LA15_0=='\'') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalProjectGenerator.g:1018:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalProjectGenerator.g:1018:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop13:
                    do {
                        int alt13=3;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0=='\\') ) {
                            alt13=1;
                        }
                        else if ( ((LA13_0>='\u0000' && LA13_0<='!')||(LA13_0>='#' && LA13_0<='[')||(LA13_0>=']' && LA13_0<='\uFFFF')) ) {
                            alt13=2;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:1018:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProjectGenerator.g:1018:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop13;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalProjectGenerator.g:1018:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalProjectGenerator.g:1018:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop14:
                    do {
                        int alt14=3;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0=='\\') ) {
                            alt14=1;
                        }
                        else if ( ((LA14_0>='\u0000' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='[')||(LA14_0>=']' && LA14_0<='\uFFFF')) ) {
                            alt14=2;
                        }


                        switch (alt14) {
                    	case 1 :
                    	    // InternalProjectGenerator.g:1018:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalProjectGenerator.g:1018:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop14;
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
            // InternalProjectGenerator.g:1020:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalProjectGenerator.g:1020:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalProjectGenerator.g:1020:24: ( options {greedy=false; } : . )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='*') ) {
                    int LA16_1 = input.LA(2);

                    if ( (LA16_1=='/') ) {
                        alt16=2;
                    }
                    else if ( ((LA16_1>='\u0000' && LA16_1<='.')||(LA16_1>='0' && LA16_1<='\uFFFF')) ) {
                        alt16=1;
                    }


                }
                else if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalProjectGenerator.g:1020:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop16;
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
            // InternalProjectGenerator.g:1022:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalProjectGenerator.g:1022:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalProjectGenerator.g:1022:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\u0000' && LA17_0<='\t')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\uFFFF')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalProjectGenerator.g:1022:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop17;
                }
            } while (true);

            // InternalProjectGenerator.g:1022:40: ( ( '\\r' )? '\\n' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\n'||LA19_0=='\r') ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalProjectGenerator.g:1022:41: ( '\\r' )? '\\n'
                    {
                    // InternalProjectGenerator.g:1022:41: ( '\\r' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\r') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalProjectGenerator.g:1022:41: '\\r'
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
            // InternalProjectGenerator.g:1024:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalProjectGenerator.g:1024:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalProjectGenerator.g:1024:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt20=0;
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>='\t' && LA20_0<='\n')||LA20_0=='\r'||LA20_0==' ') ) {
                    alt20=1;
                }


                switch (alt20) {
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
            	    if ( cnt20 >= 1 ) break loop20;
                        EarlyExitException eee =
                            new EarlyExitException(20, input);
                        throw eee;
                }
                cnt20++;
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
            // InternalProjectGenerator.g:1026:16: ( . )
            // InternalProjectGenerator.g:1026:18: .
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
        // InternalProjectGenerator.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_CLASSNAME | RULE_METHODNAME | RULE_LOCALIZEDKEY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt21=38;
        alt21 = dfa21.predict(input);
        switch (alt21) {
            case 1 :
                // InternalProjectGenerator.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalProjectGenerator.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalProjectGenerator.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalProjectGenerator.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalProjectGenerator.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalProjectGenerator.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalProjectGenerator.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalProjectGenerator.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalProjectGenerator.g:1:58: T__22
                {
                mT__22(); 

                }
                break;
            case 10 :
                // InternalProjectGenerator.g:1:64: T__23
                {
                mT__23(); 

                }
                break;
            case 11 :
                // InternalProjectGenerator.g:1:70: T__24
                {
                mT__24(); 

                }
                break;
            case 12 :
                // InternalProjectGenerator.g:1:76: T__25
                {
                mT__25(); 

                }
                break;
            case 13 :
                // InternalProjectGenerator.g:1:82: T__26
                {
                mT__26(); 

                }
                break;
            case 14 :
                // InternalProjectGenerator.g:1:88: T__27
                {
                mT__27(); 

                }
                break;
            case 15 :
                // InternalProjectGenerator.g:1:94: T__28
                {
                mT__28(); 

                }
                break;
            case 16 :
                // InternalProjectGenerator.g:1:100: T__29
                {
                mT__29(); 

                }
                break;
            case 17 :
                // InternalProjectGenerator.g:1:106: T__30
                {
                mT__30(); 

                }
                break;
            case 18 :
                // InternalProjectGenerator.g:1:112: T__31
                {
                mT__31(); 

                }
                break;
            case 19 :
                // InternalProjectGenerator.g:1:118: T__32
                {
                mT__32(); 

                }
                break;
            case 20 :
                // InternalProjectGenerator.g:1:124: T__33
                {
                mT__33(); 

                }
                break;
            case 21 :
                // InternalProjectGenerator.g:1:130: T__34
                {
                mT__34(); 

                }
                break;
            case 22 :
                // InternalProjectGenerator.g:1:136: T__35
                {
                mT__35(); 

                }
                break;
            case 23 :
                // InternalProjectGenerator.g:1:142: T__36
                {
                mT__36(); 

                }
                break;
            case 24 :
                // InternalProjectGenerator.g:1:148: T__37
                {
                mT__37(); 

                }
                break;
            case 25 :
                // InternalProjectGenerator.g:1:154: T__38
                {
                mT__38(); 

                }
                break;
            case 26 :
                // InternalProjectGenerator.g:1:160: T__39
                {
                mT__39(); 

                }
                break;
            case 27 :
                // InternalProjectGenerator.g:1:166: T__40
                {
                mT__40(); 

                }
                break;
            case 28 :
                // InternalProjectGenerator.g:1:172: T__41
                {
                mT__41(); 

                }
                break;
            case 29 :
                // InternalProjectGenerator.g:1:178: RULE_CLASSNAME
                {
                mRULE_CLASSNAME(); 

                }
                break;
            case 30 :
                // InternalProjectGenerator.g:1:193: RULE_METHODNAME
                {
                mRULE_METHODNAME(); 

                }
                break;
            case 31 :
                // InternalProjectGenerator.g:1:209: RULE_LOCALIZEDKEY
                {
                mRULE_LOCALIZEDKEY(); 

                }
                break;
            case 32 :
                // InternalProjectGenerator.g:1:227: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalProjectGenerator.g:1:235: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalProjectGenerator.g:1:244: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalProjectGenerator.g:1:256: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalProjectGenerator.g:1:272: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalProjectGenerator.g:1:288: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalProjectGenerator.g:1:296: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA3 dfa3 = new DFA3(this);
    protected DFA21 dfa21 = new DFA21(this);
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
            "\12\2\7\uffff\32\1\6\uffff\32\2",
            "\1\2\1\uffff\12\4\7\uffff\32\3\6\uffff\32\4",
            "",
            "\1\2\1\uffff\12\4\7\uffff\32\3\6\uffff\32\4",
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
            return "()+ loopback of 1008:30: ( ( '0' .. '9' | 'A' .. 'Z' | 'a' .. 'z' )+ '.' )+";
        }
    }
    static final String DFA21_eotS =
        "\1\uffff\1\42\1\uffff\1\42\1\uffff\1\42\1\uffff\14\42\3\72\1\42\1\72\1\37\1\72\1\uffff\3\37\2\uffff\2\42\2\uffff\1\42\1\uffff\3\110\1\uffff\5\42\2\110\4\42\3\110\2\42\1\uffff\1\72\3\42\1\72\4\uffff\2\42\1\140\1\110\2\uffff\5\42\2\110\5\42\1\110\1\42\1\110\1\42\1\72\5\42\1\uffff\1\110\3\42\1\173\1\174\2\110\5\42\1\u0084\1\42\1\110\6\42\1\110\3\42\2\uffff\2\110\1\u0093\3\42\1\u0099\1\uffff\1\u009a\1\u009b\4\42\1\u00a0\1\42\1\110\3\42\1\u00a6\1\110\1\uffff\1\u00a8\2\42\1\u00ab\1\u00ac\3\uffff\2\42\1\u00af\1\u00b0\1\uffff\1\42\1\110\3\42\1\uffff\1\110\1\uffff\2\42\2\uffff\2\42\2\uffff\1\42\1\110\3\42\1\u00c0\5\42\1\110\1\u00c7\1\u00c8\1\42\1\uffff\1\u00ca\4\42\1\u00cf\2\uffff\1\42\1\uffff\1\42\1\u00d2\2\42\1\uffff\2\42\1\uffff\6\42\1\u00dd\2\42\1\u00e0\1\uffff\1\u00e1\1\42\2\uffff\1\42\1\u00e4\1\uffff";
    static final String DFA21_eofS =
        "\u00e5\uffff";
    static final String DFA21_minS =
        "\1\0\1\145\1\uffff\1\145\1\uffff\1\60\1\uffff\1\142\1\160\1\145\1\162\1\60\1\157\1\165\1\157\1\141\10\60\1\101\1\60\1\uffff\2\0\1\52\2\uffff\1\144\1\163\2\uffff\1\171\1\uffff\3\56\1\uffff\1\163\1\141\1\162\1\160\1\165\2\56\1\164\1\141\1\143\1\154\3\56\1\120\1\60\1\uffff\1\60\1\164\1\167\1\151\1\60\4\uffff\1\165\1\163\1\60\1\56\2\uffff\1\145\1\103\1\166\2\145\2\56\1\104\1\151\1\154\1\141\1\165\1\56\1\125\1\56\1\162\1\60\1\145\1\141\1\163\1\154\1\141\1\uffff\1\56\1\162\1\157\1\151\2\60\2\56\1\105\1\146\1\151\1\154\1\145\1\56\1\123\1\56\1\157\1\162\1\171\1\164\1\145\1\147\1\56\1\166\1\156\1\143\2\uffff\2\56\1\60\1\171\1\146\1\145\1\60\1\uffff\1\60\1\56\1\147\1\103\2\163\1\60\1\145\1\56\1\145\1\146\1\145\2\56\1\uffff\1\60\1\151\1\172\2\60\3\uffff\1\162\1\157\2\60\1\uffff\1\102\1\56\1\162\1\151\1\103\1\uffff\1\56\1\uffff\2\145\2\uffff\1\145\1\155\2\uffff\1\165\1\56\1\163\1\147\1\157\1\56\1\162\1\144\1\163\1\160\1\156\1\56\2\60\1\156\1\uffff\1\60\1\105\1\163\1\154\1\144\1\56\2\uffff\1\146\1\uffff\1\156\1\60\1\145\1\154\1\uffff\1\151\1\165\1\uffff\1\151\1\145\1\147\1\155\1\164\1\163\1\60\1\163\1\151\1\60\1\uffff\1\60\1\157\2\uffff\1\156\1\60\1\uffff";
    static final String DFA21_maxS =
        "\1\uffff\1\157\1\uffff\1\145\1\uffff\1\172\1\uffff\1\142\1\160\1\145\1\171\1\172\1\157\1\165\1\157\1\141\11\172\1\71\1\uffff\2\uffff\1\57\2\uffff\1\144\1\163\2\uffff\1\171\1\uffff\3\172\1\uffff\1\163\1\141\1\162\1\160\1\165\2\172\1\164\1\141\1\143\1\154\3\172\1\120\1\132\1\uffff\1\172\1\164\1\167\1\151\1\71\4\uffff\1\165\1\163\2\172\2\uffff\1\145\1\103\1\166\2\145\2\172\1\104\1\151\1\154\1\141\1\165\1\172\1\125\1\172\1\162\1\172\1\145\1\141\1\163\1\154\1\141\1\uffff\1\172\1\162\1\157\1\151\4\172\1\105\1\146\1\151\1\154\1\145\1\172\1\123\1\172\1\157\1\162\1\171\1\164\1\145\1\147\1\172\1\166\1\156\1\143\2\uffff\3\172\1\171\1\146\1\151\1\172\1\uffff\2\172\1\147\1\103\2\163\1\172\1\145\1\172\1\145\1\146\1\145\2\172\1\uffff\1\172\1\151\3\172\3\uffff\1\162\1\157\2\172\1\uffff\1\102\1\172\1\162\1\151\1\103\1\uffff\1\172\1\uffff\2\145\2\uffff\1\145\1\155\2\uffff\1\165\1\172\1\163\1\147\1\157\1\172\1\162\1\144\1\163\1\160\1\156\3\172\1\156\1\uffff\1\172\1\105\1\163\1\154\1\144\1\172\2\uffff\1\146\1\uffff\1\156\1\172\1\145\1\154\1\uffff\1\151\1\165\1\uffff\1\151\1\145\1\147\1\155\1\164\1\163\1\172\1\163\1\151\1\172\1\uffff\1\172\1\157\2\uffff\1\156\1\172\1\uffff";
    static final String DFA21_acceptS =
        "\2\uffff\1\2\1\uffff\1\4\1\uffff\1\7\23\uffff\1\40\3\uffff\1\45\1\46\2\uffff\1\40\1\2\1\uffff\1\4\3\uffff\1\7\20\uffff\1\37\5\uffff\1\42\1\43\1\44\1\45\4\uffff\1\36\1\35\26\uffff\1\3\32\uffff\1\13\1\27\7\uffff\1\22\16\uffff\1\25\5\uffff\1\24\1\26\1\30\4\uffff\1\1\5\uffff\1\14\1\uffff\1\15\2\uffff\1\23\1\21\2\uffff\1\33\1\34\17\uffff\1\16\6\uffff\1\10\1\11\1\uffff\1\17\4\uffff\1\5\2\uffff\1\31\12\uffff\1\12\2\uffff\1\6\1\20\2\uffff\1\32";
    static final String DFA21_specialS =
        "\1\1\32\uffff\1\2\1\0\u00c8\uffff}>";
    static final String[] DFA21_transitionS = {
            "\11\37\2\36\2\37\1\36\22\37\1\36\1\37\1\33\4\37\1\34\7\37\1\35\12\31\1\37\1\4\5\37\1\24\3\27\1\25\3\27\1\23\21\27\3\37\1\30\1\32\1\37\1\20\1\26\1\5\1\13\1\21\1\22\3\32\1\10\1\3\1\16\1\1\1\14\1\7\1\32\1\15\1\32\1\11\1\12\1\32\1\17\4\32\1\2\1\37\1\6\uff82\37",
            "\1\41\11\uffff\1\40",
            "",
            "\1\44",
            "",
            "\12\50\7\uffff\32\50\6\uffff\3\47\1\46\2\47\24\50",
            "",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56\6\uffff\1\55",
            "\12\50\7\uffff\32\50\6\uffff\4\47\1\60\1\47\16\50\1\57\5\50",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\12\50\7\uffff\32\50\6\uffff\6\47\13\50\1\65\10\50",
            "\12\50\7\uffff\32\50\6\uffff\6\47\7\50\1\66\14\50",
            "\12\50\7\uffff\32\50\6\uffff\1\67\5\47\24\50",
            "\12\73\7\uffff\32\73\4\uffff\1\71\1\uffff\15\42\1\70\14\42",
            "\12\73\7\uffff\32\73\4\uffff\1\71\1\uffff\5\42\1\74\5\42\1\75\16\42",
            "\12\73\7\uffff\32\73\4\uffff\1\71\1\uffff\27\42\1\76\2\42",
            "\12\50\7\uffff\32\50\6\uffff\6\47\24\50",
            "\12\73\7\uffff\32\73\4\uffff\1\71\1\uffff\32\42",
            "\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\77",
            "",
            "\0\100",
            "\0\100",
            "\1\101\4\uffff\1\102",
            "",
            "",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\106",
            "",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\47\2\50\1\107\21\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\47\24\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\21\50\1\117\10\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\121\1\uffff\6\47\5\50\1\120\16\50",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\50\1\126\23\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\127\1\uffff\32\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\47\5\50\1\130\16\50",
            "\1\131",
            "\12\132\7\uffff\32\132",
            "",
            "\12\73\7\uffff\32\73\4\uffff\1\71\1\uffff\32\42",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\77",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\111\1\uffff\12\50\7\uffff\4\50\1\141\25\50\4\uffff\1\42\1\uffff\32\50",
            "",
            "",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\10\50\1\147\21\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\150\25\50",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\22\50\1\156\7\50",
            "\1\157",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\22\50\1\160\7\50",
            "\1\161",
            "\12\42\7\uffff\32\42\4\uffff\1\71\1\uffff\32\42",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\15\50\1\167\14\50",
            "\1\170",
            "\1\171",
            "\1\172",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\15\50\1\175\14\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\50\1\176\23\50",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\u0085",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u0086\25\50",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\1\u008d\31\50",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\6\50\1\u0091\23\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\1\u0092\31\50",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u0094",
            "\1\u0095",
            "\1\u0097\3\uffff\1\u0096",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\22\42\1\u0098\7\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a1",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\1\50\1\u00a2\30\50",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\23\50\1\u00a7\6\50",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00a9",
            "\1\u00aa",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\1\u00b1",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\13\50\1\u00b2\16\50",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u00b6\25\50",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\1\u00bb",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\4\50\1\u00bc\25\50",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\3\50\1\u00c6\26\50",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00c9",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\111\1\uffff\12\50\7\uffff\32\50\4\uffff\1\42\1\uffff\32\50",
            "",
            "",
            "\1\u00d0",
            "",
            "\1\u00d1",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00de",
            "\1\u00df",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            "\1\u00e2",
            "",
            "",
            "\1\u00e3",
            "\12\42\7\uffff\32\42\4\uffff\1\42\1\uffff\32\42",
            ""
    };

    static final short[] DFA21_eot = DFA.unpackEncodedString(DFA21_eotS);
    static final short[] DFA21_eof = DFA.unpackEncodedString(DFA21_eofS);
    static final char[] DFA21_min = DFA.unpackEncodedStringToUnsignedChars(DFA21_minS);
    static final char[] DFA21_max = DFA.unpackEncodedStringToUnsignedChars(DFA21_maxS);
    static final short[] DFA21_accept = DFA.unpackEncodedString(DFA21_acceptS);
    static final short[] DFA21_special = DFA.unpackEncodedString(DFA21_specialS);
    static final short[][] DFA21_transition;

    static {
        int numStates = DFA21_transitionS.length;
        DFA21_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA21_transition[i] = DFA.unpackEncodedString(DFA21_transitionS[i]);
        }
    }

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = DFA21_eot;
            this.eof = DFA21_eof;
            this.min = DFA21_min;
            this.max = DFA21_max;
            this.accept = DFA21_accept;
            this.special = DFA21_special;
            this.transition = DFA21_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_CLASSNAME | RULE_METHODNAME | RULE_LOCALIZEDKEY | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_28 = input.LA(1);

                        s = -1;
                        if ( ((LA21_28>='\u0000' && LA21_28<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_0 = input.LA(1);

                        s = -1;
                        if ( (LA21_0=='m') ) {s = 1;}

                        else if ( (LA21_0=='{') ) {s = 2;}

                        else if ( (LA21_0=='k') ) {s = 3;}

                        else if ( (LA21_0==';') ) {s = 4;}

                        else if ( (LA21_0=='c') ) {s = 5;}

                        else if ( (LA21_0=='}') ) {s = 6;}

                        else if ( (LA21_0=='o') ) {s = 7;}

                        else if ( (LA21_0=='j') ) {s = 8;}

                        else if ( (LA21_0=='s') ) {s = 9;}

                        else if ( (LA21_0=='t') ) {s = 10;}

                        else if ( (LA21_0=='d') ) {s = 11;}

                        else if ( (LA21_0=='n') ) {s = 12;}

                        else if ( (LA21_0=='q') ) {s = 13;}

                        else if ( (LA21_0=='l') ) {s = 14;}

                        else if ( (LA21_0=='v') ) {s = 15;}

                        else if ( (LA21_0=='a') ) {s = 16;}

                        else if ( (LA21_0=='e') ) {s = 17;}

                        else if ( (LA21_0=='f') ) {s = 18;}

                        else if ( (LA21_0=='I') ) {s = 19;}

                        else if ( (LA21_0=='A') ) {s = 20;}

                        else if ( (LA21_0=='E') ) {s = 21;}

                        else if ( (LA21_0=='b') ) {s = 22;}

                        else if ( ((LA21_0>='B' && LA21_0<='D')||(LA21_0>='F' && LA21_0<='H')||(LA21_0>='J' && LA21_0<='Z')) ) {s = 23;}

                        else if ( (LA21_0=='^') ) {s = 24;}

                        else if ( ((LA21_0>='0' && LA21_0<='9')) ) {s = 25;}

                        else if ( (LA21_0=='_'||(LA21_0>='g' && LA21_0<='i')||LA21_0=='p'||LA21_0=='r'||LA21_0=='u'||(LA21_0>='w' && LA21_0<='z')) ) {s = 26;}

                        else if ( (LA21_0=='\"') ) {s = 27;}

                        else if ( (LA21_0=='\'') ) {s = 28;}

                        else if ( (LA21_0=='/') ) {s = 29;}

                        else if ( ((LA21_0>='\t' && LA21_0<='\n')||LA21_0=='\r'||LA21_0==' ') ) {s = 30;}

                        else if ( ((LA21_0>='\u0000' && LA21_0<='\b')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\u001F')||LA21_0=='!'||(LA21_0>='#' && LA21_0<='&')||(LA21_0>='(' && LA21_0<='.')||LA21_0==':'||(LA21_0>='<' && LA21_0<='@')||(LA21_0>='[' && LA21_0<=']')||LA21_0=='`'||LA21_0=='|'||(LA21_0>='~' && LA21_0<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA21_27 = input.LA(1);

                        s = -1;
                        if ( ((LA21_27>='\u0000' && LA21_27<='\uFFFF')) ) {s = 64;}

                        else s = 31;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}