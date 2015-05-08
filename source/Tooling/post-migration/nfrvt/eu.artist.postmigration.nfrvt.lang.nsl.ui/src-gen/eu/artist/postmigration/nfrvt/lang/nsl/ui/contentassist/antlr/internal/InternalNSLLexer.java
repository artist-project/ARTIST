package eu.artist.postmigration.nfrvt.lang.nsl.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNSLLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int RULE_ID=8;
    public static final int T__67=67;
    public static final int T__29=29;
    public static final int T__64=64;
    public static final int T__28=28;
    public static final int T__65=65;
    public static final int T__27=27;
    public static final int T__62=62;
    public static final int T__26=26;
    public static final int T__63=63;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__19=19;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=4;
    public static final int T__50=50;
    public static final int RULE_SMALL_DECIMAL=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_EBIGDECIMAL=7;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_NULL=11;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=9;
    public static final int T__33=33;
    public static final int T__71=71;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int T__37=37;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=5;
    public static final int RULE_EBOOLEAN=10;
    public static final int RULE_DATE_TIME=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;

    // delegates
    // delegators

    public InternalNSLLexer() {;} 
    public InternalNSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g"; }

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:11:7: ( '(' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:11:9: '('
            {
            match('('); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12:7: ( ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12:9: ')'
            {
            match(')'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:13:7: ( 'or' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:13:9: 'or'
            {
            match("or"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:14:7: ( '||' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:14:9: '||'
            {
            match("||"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:15:7: ( 'xor' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:15:9: 'xor'
            {
            match("xor"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:16:7: ( '^' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:16:9: '^'
            {
            match('^'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:17:7: ( 'and' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:17:9: 'and'
            {
            match("and"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:18:7: ( '&&' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:18:9: '&&'
            {
            match("&&"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:19:7: ( '=>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:19:9: '=>'
            {
            match("=>"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:20:7: ( '->' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:20:9: '->'
            {
            match("->"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:21:7: ( '!=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:21:9: '!='
            {
            match("!="); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:22:7: ( '<>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:22:9: '<>'
            {
            match("<>"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:23:7: ( '!' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:23:9: '!'
            {
            match('!'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:24:7: ( 'not' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:24:9: 'not'
            {
            match("not"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:25:7: ( 'increasing' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:25:9: 'increasing'
            {
            match("increasing"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:26:7: ( 'decreasing' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:26:9: 'decreasing'
            {
            match("decreasing"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:27:7: ( 'range' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:27:9: 'range'
            {
            match("range"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:28:7: ( 'property-catalogue' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:28:9: 'property-catalogue'
            {
            match("property-catalogue"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:29:7: ( '{' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:29:9: '{'
            {
            match('{'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:30:7: ( '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:30:9: '}'
            {
            match('}'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:31:7: ( 'qualitative' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:31:9: 'qualitative'
            {
            match("qualitative"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:32:7: ( 'description' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:32:9: 'description'
            {
            match("description"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:33:7: ( ',' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:33:9: ','
            {
            match(','); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:34:7: ( 'direction' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:34:9: 'direction'
            {
            match("direction"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:35:7: ( 'properties' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:35:9: 'properties'
            {
            match("properties"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:36:7: ( '[' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:36:9: '['
            {
            match('['); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:37:7: ( ']' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:37:9: ']'
            {
            match(']'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:38:7: ( 'impacts' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:38:9: 'impacts'
            {
            match("impacts"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:39:7: ( 'quantitative' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:39:9: 'quantitative'
            {
            match("quantitative"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:40:7: ( 'type' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:40:9: 'type'
            {
            match("type"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:41:7: ( 'derived' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:41:9: 'derived'
            {
            match("derived"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:42:7: ( 'expression' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:42:9: 'expression'
            {
            match("expression"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:43:7: ( '$' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:43:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:44:7: ( '=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:44:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:45:7: ( '==' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:45:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:46:7: ( '>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:46:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:47:7: ( '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:47:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:48:7: ( '<' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:48:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:49:7: ( '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:49:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:50:7: ( '+' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:50:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:51:7: ( '-' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:51:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:52:7: ( '*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:52:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:53:7: ( '/' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:53:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:54:7: ( '%' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:54:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:55:7: ( 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:55:9: 'max'
            {
            match("max"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:56:7: ( 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:56:9: 'min'
            {
            match("min"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:57:7: ( 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:57:9: 'avg'
            {
            match("avg"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:58:7: ( 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:58:9: 'sum'
            {
            match("sum"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:59:7: ( 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:59:9: 'exp'
            {
            match("exp"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:60:7: ( 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:60:9: 'abs'
            {
            match("abs"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:61:7: ( 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:61:9: 'ln'
            {
            match("ln"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:62:7: ( 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:62:9: 'log'
            {
            match("log"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:63:7: ( '.' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:63:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:64:7: ( '.*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:64:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:65:7: ( 'import' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:65:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "RULE_EBOOLEAN"
    public final void mRULE_EBOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_EBOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12145:15: ( ( 'true' | 'false' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12145:17: ( 'true' | 'false' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12145:17: ( 'true' | 'false' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='t') ) {
                alt1=1;
            }
            else if ( (LA1_0=='f') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12145:18: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12145:25: 'false'
                    {
                    match("false"); 


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
    // $ANTLR end "RULE_EBOOLEAN"

    // $ANTLR start "RULE_NULL"
    public final void mRULE_NULL() throws RecognitionException {
        try {
            int _type = RULE_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12147:11: ( 'null' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12147:13: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NULL"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12149:10: ( ( '0' .. '9' )+ )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12149:12: ( '0' .. '9' )+
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12149:12: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12149:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_POSITIVE_SMALL_DECIMAL"
    public final void mRULE_POSITIVE_SMALL_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_POSITIVE_SMALL_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:29: ( ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:31: ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:31: ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
            int alt8=3;
            switch ( input.LA(1) ) {
            case '1':
                {
                alt8=1;
                }
                break;
            case '0':
                {
                alt8=2;
                }
                break;
            case '.':
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:32: '1' ( '.' ( '0' )+ )?
                    {
                    match('1'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:36: ( '.' ( '0' )+ )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:37: '.' ( '0' )+
                            {
                            match('.'); 
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:41: ( '0' )+
                            int cnt3=0;
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0=='0') ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:41: '0'
                            	    {
                            	    match('0'); 

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


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:48: '0' ( '.' ( '0' .. '9' )+ )?
                    {
                    match('0'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:52: ( '.' ( '0' .. '9' )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:53: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:57: ( '0' .. '9' )+
                            int cnt5=0;
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:58: '0' .. '9'
                            	    {
                            	    matchRange('0','9'); 

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


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:71: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:75: ( '0' .. '9' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12151:76: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

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
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_POSITIVE_SMALL_DECIMAL"

    // $ANTLR start "RULE_SMALL_DECIMAL"
    public final void mRULE_SMALL_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_SMALL_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12153:20: ( ( '+' | '-' )? RULE_POSITIVE_SMALL_DECIMAL )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12153:22: ( '+' | '-' )? RULE_POSITIVE_SMALL_DECIMAL
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12153:22: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            mRULE_POSITIVE_SMALL_DECIMAL(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SMALL_DECIMAL"

    // $ANTLR start "RULE_EBIGDECIMAL"
    public final void mRULE_EBIGDECIMAL() throws RecognitionException {
        try {
            int _type = RULE_EBIGDECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:18: ( ( '+' | '-' )? ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:20: ( '+' | '-' )? ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:20: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:31: ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:32: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:41: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12155:54: RULE_INT '.' RULE_INT
                    {
                    mRULE_INT(); 
                    match('.'); 
                    mRULE_INT(); 

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
    // $ANTLR end "RULE_EBIGDECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )*
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )
            int alt13=13;
            switch ( input.LA(1) ) {
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt13=1;
                }
                break;
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
                {
                alt13=2;
                }
                break;
            case '_':
                {
                alt13=3;
                }
                break;
            case '+':
                {
                alt13=4;
                }
                break;
            case '-':
                {
                alt13=5;
                }
                break;
            case '%':
                {
                alt13=6;
                }
                break;
            case '*':
                {
                alt13=7;
                }
                break;
            case '/':
                {
                alt13=8;
                }
                break;
            case '#':
                {
                alt13=9;
                }
                break;
            case '>':
                {
                alt13=10;
                }
                break;
            case '<':
                {
                alt13=11;
                }
                break;
            case '=':
                {
                alt13=12;
                }
                break;
            case '\u00C2':
                {
                alt13=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:17: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:26: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:35: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:39: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 5 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:43: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 6 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:47: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 7 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:51: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 8 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:55: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 9 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:59: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 10 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:63: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 11 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:67: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 12 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:71: '='
                    {
                    match('='); 

                    }
                    break;
                case 13 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:75: '\\u00C2\\u00A7'
                    {
                    match("\u00C2\u00A7"); 


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )*
            loop14:
            do {
                int alt14=15;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:92: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:101: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:110: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:114: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:123: '+'
            	    {
            	    match('+'); 

            	    }
            	    break;
            	case 6 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:127: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 7 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:131: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 8 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:135: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 9 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:139: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 10 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:143: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 11 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:147: '>'
            	    {
            	    match('>'); 

            	    }
            	    break;
            	case 12 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:151: '<'
            	    {
            	    match('<'); 

            	    }
            	    break;
            	case 13 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:155: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 14 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12157:159: '\\u00C2\\u00A7'
            	    {
            	    match("\u00C2\u00A7"); 


            	    }
            	    break;

            	default :
            	    break loop14;
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

    // $ANTLR start "RULE_DATE_TIME"
    public final void mRULE_DATE_TIME() throws RecognitionException {
        try {
            int _type = RULE_DATE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:16: ( RULE_INT '-' RULE_INT '-' RULE_INT ( 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )? )? )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:18: RULE_INT '-' RULE_INT '-' RULE_INT ( 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )? )?
            {
            mRULE_INT(); 
            match('-'); 
            mRULE_INT(); 
            match('-'); 
            mRULE_INT(); 
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:53: ( 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='T') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:54: 'T' RULE_INT ':' RULE_INT ( ':' RULE_INT ( '.' RULE_INT )? )?
                    {
                    match('T'); 
                    mRULE_INT(); 
                    match(':'); 
                    mRULE_INT(); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:80: ( ':' RULE_INT ( '.' RULE_INT )? )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==':') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:81: ':' RULE_INT ( '.' RULE_INT )?
                            {
                            match(':'); 
                            mRULE_INT(); 
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:94: ( '.' RULE_INT )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0=='.') ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12159:95: '.' RULE_INT
                                    {
                                    match('.'); 
                                    mRULE_INT(); 

                                    }
                                    break;

                            }


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_DATE_TIME"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='\"') ) {
                alt20=1;
            }
            else if ( (LA20_0=='\'') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='!')||(LA18_0>='#' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop18;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop19:
                    do {
                        int alt19=3;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0=='\\') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_0>='\u0000' && LA19_0<='&')||(LA19_0>='(' && LA19_0<='[')||(LA19_0>=']' && LA19_0<='\uFFFF')) ) {
                            alt19=2;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12161:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop19;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12163:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12163:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12163:24: ( options {greedy=false; } : . )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0=='*') ) {
                    int LA21_1 = input.LA(2);

                    if ( (LA21_1=='/') ) {
                        alt21=2;
                    }
                    else if ( ((LA21_1>='\u0000' && LA21_1<='.')||(LA21_1>='0' && LA21_1<='\uFFFF')) ) {
                        alt21=1;
                    }


                }
                else if ( ((LA21_0>='\u0000' && LA21_0<=')')||(LA21_0>='+' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12163:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop21;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\u0000' && LA22_0<='\t')||(LA22_0>='\u000B' && LA22_0<='\f')||(LA22_0>='\u000E' && LA22_0<='\uFFFF')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop22;
                }
            } while (true);

            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:40: ( ( '\\r' )? '\\n' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='\n'||LA24_0=='\r') ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:41: ( '\\r' )? '\\n'
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:41: ( '\\r' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0=='\r') ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12165:41: '\\r'
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12167:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12167:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12167:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt25=0;
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r'||LA25_0==' ') ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:
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
            	    if ( cnt25 >= 1 ) break loop25;
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12169:16: ( . )
            // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:12169:18: .
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
        // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:8: ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_EBOOLEAN | RULE_NULL | RULE_INT | RULE_POSITIVE_SMALL_DECIMAL | RULE_SMALL_DECIMAL | RULE_EBIGDECIMAL | RULE_ID | RULE_DATE_TIME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt26=68;
        alt26 = dfa26.predict(input);
        switch (alt26) {
            case 1 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:10: T__17
                {
                mT__17(); 

                }
                break;
            case 2 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:16: T__18
                {
                mT__18(); 

                }
                break;
            case 3 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:22: T__19
                {
                mT__19(); 

                }
                break;
            case 4 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:28: T__20
                {
                mT__20(); 

                }
                break;
            case 5 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:34: T__21
                {
                mT__21(); 

                }
                break;
            case 6 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:40: T__22
                {
                mT__22(); 

                }
                break;
            case 7 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:46: T__23
                {
                mT__23(); 

                }
                break;
            case 8 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:52: T__24
                {
                mT__24(); 

                }
                break;
            case 9 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:58: T__25
                {
                mT__25(); 

                }
                break;
            case 10 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:64: T__26
                {
                mT__26(); 

                }
                break;
            case 11 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:70: T__27
                {
                mT__27(); 

                }
                break;
            case 12 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:76: T__28
                {
                mT__28(); 

                }
                break;
            case 13 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:82: T__29
                {
                mT__29(); 

                }
                break;
            case 14 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:88: T__30
                {
                mT__30(); 

                }
                break;
            case 15 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:94: T__31
                {
                mT__31(); 

                }
                break;
            case 16 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:100: T__32
                {
                mT__32(); 

                }
                break;
            case 17 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:106: T__33
                {
                mT__33(); 

                }
                break;
            case 18 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:112: T__34
                {
                mT__34(); 

                }
                break;
            case 19 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:118: T__35
                {
                mT__35(); 

                }
                break;
            case 20 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:124: T__36
                {
                mT__36(); 

                }
                break;
            case 21 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:130: T__37
                {
                mT__37(); 

                }
                break;
            case 22 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:136: T__38
                {
                mT__38(); 

                }
                break;
            case 23 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:142: T__39
                {
                mT__39(); 

                }
                break;
            case 24 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:148: T__40
                {
                mT__40(); 

                }
                break;
            case 25 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:154: T__41
                {
                mT__41(); 

                }
                break;
            case 26 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:160: T__42
                {
                mT__42(); 

                }
                break;
            case 27 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:166: T__43
                {
                mT__43(); 

                }
                break;
            case 28 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:172: T__44
                {
                mT__44(); 

                }
                break;
            case 29 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:178: T__45
                {
                mT__45(); 

                }
                break;
            case 30 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:184: T__46
                {
                mT__46(); 

                }
                break;
            case 31 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:190: T__47
                {
                mT__47(); 

                }
                break;
            case 32 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:196: T__48
                {
                mT__48(); 

                }
                break;
            case 33 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:202: T__49
                {
                mT__49(); 

                }
                break;
            case 34 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:208: T__50
                {
                mT__50(); 

                }
                break;
            case 35 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:214: T__51
                {
                mT__51(); 

                }
                break;
            case 36 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:220: T__52
                {
                mT__52(); 

                }
                break;
            case 37 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:226: T__53
                {
                mT__53(); 

                }
                break;
            case 38 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:232: T__54
                {
                mT__54(); 

                }
                break;
            case 39 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:238: T__55
                {
                mT__55(); 

                }
                break;
            case 40 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:244: T__56
                {
                mT__56(); 

                }
                break;
            case 41 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:250: T__57
                {
                mT__57(); 

                }
                break;
            case 42 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:256: T__58
                {
                mT__58(); 

                }
                break;
            case 43 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:262: T__59
                {
                mT__59(); 

                }
                break;
            case 44 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:268: T__60
                {
                mT__60(); 

                }
                break;
            case 45 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:274: T__61
                {
                mT__61(); 

                }
                break;
            case 46 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:280: T__62
                {
                mT__62(); 

                }
                break;
            case 47 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:286: T__63
                {
                mT__63(); 

                }
                break;
            case 48 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:292: T__64
                {
                mT__64(); 

                }
                break;
            case 49 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:298: T__65
                {
                mT__65(); 

                }
                break;
            case 50 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:304: T__66
                {
                mT__66(); 

                }
                break;
            case 51 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:310: T__67
                {
                mT__67(); 

                }
                break;
            case 52 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:316: T__68
                {
                mT__68(); 

                }
                break;
            case 53 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:322: T__69
                {
                mT__69(); 

                }
                break;
            case 54 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:328: T__70
                {
                mT__70(); 

                }
                break;
            case 55 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:334: T__71
                {
                mT__71(); 

                }
                break;
            case 56 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:340: RULE_EBOOLEAN
                {
                mRULE_EBOOLEAN(); 

                }
                break;
            case 57 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:354: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 58 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:364: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 59 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:373: RULE_POSITIVE_SMALL_DECIMAL
                {
                mRULE_POSITIVE_SMALL_DECIMAL(); 

                }
                break;
            case 60 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:401: RULE_SMALL_DECIMAL
                {
                mRULE_SMALL_DECIMAL(); 

                }
                break;
            case 61 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:420: RULE_EBIGDECIMAL
                {
                mRULE_EBIGDECIMAL(); 

                }
                break;
            case 62 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:437: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 63 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:445: RULE_DATE_TIME
                {
                mRULE_DATE_TIME(); 

                }
                break;
            case 64 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:460: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 65 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:472: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 66 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:488: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 67 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:504: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 68 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl.ui/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/ui/contentassist/antlr/internal/InternalNSL.g:1:512: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String DFA11_eotS =
        "\1\uffff\1\3\3\uffff";
    static final String DFA11_eofS =
        "\5\uffff";
    static final String DFA11_minS =
        "\2\56\3\uffff";
    static final String DFA11_maxS =
        "\2\71\3\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\1\1\1\3";
    static final String DFA11_specialS =
        "\5\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\1\uffff\12\1",
            "\1\4\1\uffff\12\1",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "12155:31: ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )";
        }
    }
    static final String DFA14_eotS =
        "\1\1\17\uffff";
    static final String DFA14_eofS =
        "\20\uffff";
    static final String DFA14_minS =
        "\1\43\17\uffff";
    static final String DFA14_maxS =
        "\1\u00c2\17\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\17\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16";
    static final String DFA14_specialS =
        "\20\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\13\1\uffff\1\10\4\uffff\1\11\1\6\1\uffff\1\7\1\uffff\1\12"+
            "\12\5\2\uffff\1\15\1\16\1\14\2\uffff\32\3\4\uffff\1\4\1\uffff"+
            "\32\2\107\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "()* loopback of 12157:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )*";
        }
    }
    static final String DFA26_eotS =
        "\3\uffff\1\64\1\60\1\64\1\67\1\64\1\60\1\76\1\100\1\106\1\111\5"+
        "\64\2\uffff\1\64\3\uffff\2\64\1\uffff\1\135\1\136\1\137\1\142\1"+
        "\143\3\64\1\152\1\64\3\155\4\uffff\3\60\4\uffff\1\165\2\uffff\1"+
        "\64\1\uffff\3\64\1\uffff\1\172\1\173\1\uffff\1\174\1\uffff\2\175"+
        "\1\uffff\1\162\2\uffff\1\u0081\1\u0082\1\uffff\10\64\2\uffff\1\64"+
        "\3\uffff\3\64\1\uffff\1\u0091\3\uffff\2\64\2\uffff\3\64\1\u00b3"+
        "\1\64\2\uffff\1\u00b5\1\64\1\uffff\1\155\7\uffff\1\u00b9\1\u00ba"+
        "\1\u00bb\1\u00bc\6\uffff\1\175\2\uffff\1\u00bf\14\64\1\u00cf\1\uffff"+
        "\15\64\2\uffff\1\64\1\uffff\14\64\1\u00a2\1\u00d3\1\u00d4\1\u00d5"+
        "\1\uffff\1\u00d6\1\uffff\1\64\2\u00b5\4\uffff\2\175\1\uffff\1\u00d8"+
        "\13\64\1\u00e4\1\u00e5\1\64\1\uffff\3\64\4\uffff\1\64\1\uffff\7"+
        "\64\1\u00ef\3\64\2\uffff\1\64\1\u00e5\2\64\1\u00f6\4\64\1\uffff"+
        "\5\64\1\u0100\1\uffff\2\64\1\u0103\6\64\1\uffff\2\64\1\uffff\11"+
        "\64\1\u0116\5\64\1\u011c\1\u011d\1\64\1\uffff\1\64\1\u0120\2\64"+
        "\1\u0123\2\uffff\1\u0124\1\64\1\uffff\1\u0126\1\64\2\uffff\1\64"+
        "\1\uffff\1\u0129\1\64\1\uffff\4\64\1\u012f\1\uffff";
    static final String DFA26_eofS =
        "\u0130\uffff";
    static final String DFA26_minS =
        "\1\0\2\uffff\1\162\1\174\1\157\1\43\1\142\1\46\2\43\1\75\1\43\1"+
        "\157\1\155\1\145\1\141\1\162\2\uffff\1\165\3\uffff\1\162\1\170\1"+
        "\uffff\5\43\1\141\1\165\1\156\1\52\1\141\3\55\4\uffff\1\u00a7\2"+
        "\0\4\uffff\1\43\2\uffff\1\162\1\uffff\1\144\1\147\1\163\1\uffff"+
        "\2\43\1\uffff\1\43\1\uffff\2\43\1\60\1\43\2\uffff\2\43\1\uffff\1"+
        "\164\1\154\1\143\1\160\1\143\1\162\1\156\1\157\2\uffff\1\141\3\uffff"+
        "\1\160\1\165\1\160\1\uffff\1\43\3\uffff\2\0\2\uffff\1\170\1\156"+
        "\1\155\1\43\1\147\2\uffff\1\60\1\154\1\uffff\1\55\1\60\1\uffff\1"+
        "\60\4\uffff\4\43\4\uffff\3\60\2\uffff\1\43\1\154\1\162\1\141\1\162"+
        "\1\143\1\151\1\145\1\147\1\160\1\154\2\145\1\43\1\uffff\16\0\1\uffff"+
        "\1\0\1\uffff\14\0\1\u00a7\3\43\1\uffff\1\43\1\uffff\1\163\2\60\4"+
        "\uffff\2\60\1\uffff\1\43\1\145\1\143\1\162\1\145\1\162\1\166\1\143"+
        "\2\145\1\151\1\164\2\43\1\145\1\uffff\3\0\4\uffff\1\145\1\uffff"+
        "\1\141\2\164\1\141\1\151\1\145\1\164\1\43\1\162\1\164\1\151\2\uffff"+
        "\1\163\1\43\2\163\1\43\1\163\1\160\1\144\1\151\1\uffff\1\164\1\141"+
        "\1\164\1\163\1\151\1\43\1\uffff\1\151\1\164\1\43\1\157\1\151\1\164"+
        "\1\141\1\151\1\156\1\uffff\1\156\1\151\1\uffff\1\156\1\55\1\145"+
        "\1\151\1\164\1\157\2\147\1\157\1\43\1\143\1\163\1\166\1\151\1\156"+
        "\2\43\1\156\1\uffff\1\141\1\43\1\145\1\166\1\43\2\uffff\1\43\1\164"+
        "\1\uffff\1\43\1\145\2\uffff\1\141\1\uffff\1\43\1\154\1\uffff\1\157"+
        "\1\147\1\165\1\145\1\43\1\uffff";
    static final String DFA26_maxS =
        "\1\uffff\2\uffff\1\162\1\174\1\157\1\u00c2\1\166\1\46\2\u00c2\1"+
        "\75\1\u00c2\1\165\1\156\1\151\1\141\1\162\2\uffff\1\165\3\uffff"+
        "\1\171\1\170\1\uffff\5\u00c2\1\151\1\165\1\157\1\71\1\141\3\71\4"+
        "\uffff\1\u00a7\2\uffff\4\uffff\1\u00c2\2\uffff\1\162\1\uffff\1\144"+
        "\1\147\1\163\1\uffff\2\u00c2\1\uffff\1\u00c2\1\uffff\2\u00c2\1\71"+
        "\1\u00c2\2\uffff\2\u00c2\1\uffff\1\164\1\154\1\143\1\160\1\163\1"+
        "\162\1\156\1\157\2\uffff\1\141\3\uffff\1\160\1\165\1\160\1\uffff"+
        "\1\u00c2\3\uffff\2\uffff\2\uffff\1\170\1\156\1\155\1\u00c2\1\147"+
        "\2\uffff\1\71\1\154\1\uffff\2\71\1\uffff\1\71\4\uffff\4\u00c2\4"+
        "\uffff\3\71\2\uffff\1\u00c2\1\154\1\162\1\157\1\162\1\143\1\151"+
        "\1\145\1\147\1\160\1\156\2\145\1\u00c2\1\uffff\16\uffff\1\uffff"+
        "\1\uffff\1\uffff\14\uffff\1\u00a7\3\u00c2\1\uffff\1\u00c2\1\uffff"+
        "\1\163\2\71\4\uffff\2\71\1\uffff\1\u00c2\1\145\1\143\1\162\1\145"+
        "\1\162\1\166\1\143\2\145\1\151\1\164\2\u00c2\1\145\1\uffff\3\uffff"+
        "\4\uffff\1\145\1\uffff\1\141\2\164\1\141\1\151\1\145\1\164\1\u00c2"+
        "\1\162\1\164\1\151\2\uffff\1\163\1\u00c2\2\163\1\u00c2\1\163\1\160"+
        "\1\144\1\151\1\uffff\1\164\1\141\1\164\1\163\1\151\1\u00c2\1\uffff"+
        "\1\151\1\164\1\u00c2\1\157\1\171\1\164\1\141\1\151\1\156\1\uffff"+
        "\1\156\1\151\1\uffff\1\156\1\55\1\145\1\151\1\164\1\157\2\147\1"+
        "\157\1\u00c2\1\143\1\163\1\166\1\151\1\156\2\u00c2\1\156\1\uffff"+
        "\1\141\1\u00c2\1\145\1\166\1\u00c2\2\uffff\1\u00c2\1\164\1\uffff"+
        "\1\u00c2\1\145\2\uffff\1\141\1\uffff\1\u00c2\1\154\1\uffff\1\157"+
        "\1\147\1\165\1\145\1\u00c2\1\uffff";
    static final String DFA26_acceptS =
        "\1\uffff\1\1\1\2\17\uffff\1\23\1\24\1\uffff\1\27\1\32\1\33\2\uffff"+
        "\1\41\15\uffff\4\76\3\uffff\1\103\1\104\1\1\1\2\1\uffff\1\76\1\4"+
        "\1\uffff\1\6\3\uffff\1\10\2\uffff\1\42\1\uffff\1\51\4\uffff\1\13"+
        "\1\15\2\uffff\1\46\10\uffff\1\23\1\24\1\uffff\1\27\1\32\1\33\3\uffff"+
        "\1\41\1\uffff\1\44\1\50\1\52\2\uffff\1\53\1\54\5\uffff\1\66\1\65"+
        "\2\uffff\1\72\2\uffff\1\77\1\uffff\1\75\1\100\1\103\1\3\4\uffff"+
        "\1\11\1\43\1\12\1\74\3\uffff\1\14\1\47\16\uffff\1\45\16\uffff\1"+
        "\101\1\uffff\1\102\20\uffff\1\63\1\uffff\1\73\3\uffff\1\5\1\7\1"+
        "\57\1\62\2\uffff\1\16\17\uffff\1\61\3\uffff\1\55\1\56\1\60\1\64"+
        "\1\uffff\1\71\13\uffff\1\36\1\70\11\uffff\1\21\6\uffff\1\67\11\uffff"+
        "\1\34\2\uffff\1\37\22\uffff\1\30\5\uffff\1\17\1\20\2\uffff\1\31"+
        "\2\uffff\1\40\1\26\1\uffff\1\25\2\uffff\1\35\5\uffff\1\22";
    static final String DFA26_specialS =
        "\1\27\54\uffff\1\26\1\2\61\uffff\1\5\1\4\60\uffff\1\1\1\12\1\10"+
        "\1\41\1\42\1\37\1\40\1\36\1\34\1\35\1\32\1\33\1\30\1\0\1\uffff\1"+
        "\14\1\uffff\1\16\1\15\1\7\1\6\1\13\1\11\1\23\1\22\1\25\1\24\1\20"+
        "\1\17\41\uffff\1\3\1\31\1\21\135\uffff}>";
    static final String[] DFA26_transitionS = {
            "\11\60\2\57\2\60\1\57\22\60\1\57\1\13\1\55\1\53\1\32\1\37\1"+
            "\10\1\56\1\1\1\2\1\35\1\34\1\25\1\12\1\43\1\36\1\46\1\45\10"+
            "\47\2\60\1\14\1\11\1\33\2\60\32\51\1\26\1\60\1\27\1\6\1\52\1"+
            "\60\1\7\2\50\1\17\1\31\1\44\2\50\1\16\2\50\1\42\1\40\1\15\1"+
            "\3\1\21\1\24\1\20\1\41\1\30\3\50\1\5\2\50\1\22\1\4\1\23\104"+
            "\60\1\54\uff3d\60",
            "",
            "",
            "\1\63",
            "\1\65",
            "\1\66",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\1\64"+
            "\14\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107"+
            "\uffff\1\64",
            "\1\72\13\uffff\1\70\7\uffff\1\71",
            "\1\73",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\1\64\1\75\1\74\2\uffff\32\64\4\uffff\1\64\1\uffff\32"+
            "\64\107\uffff\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\103\1\64\1"+
            "\102\1\101\10\104\2\uffff\2\64\1\77\2\uffff\32\64\4\uffff\1"+
            "\64\1\uffff\32\64\107\uffff\1\64",
            "\1\105",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\1\64\1\110\1\107\2\uffff\32\64\4\uffff\1\64\1\uffff"+
            "\32\64\107\uffff\1\64",
            "\1\112\5\uffff\1\113",
            "\1\115\1\114",
            "\1\116\3\uffff\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\124",
            "",
            "",
            "",
            "\1\131\6\uffff\1\130",
            "\1\132",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\1\64\1\134\1\64\2\uffff\32\64\4\uffff\1\64\1\uffff"+
            "\32\64\107\uffff\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\103\1\64\1"+
            "\102\1\101\10\104\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1"+
            "\uffff\32\64\107\uffff\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\1\140\1\64\1\uffff\1\64\1\uffff"+
            "\1\141\12\64\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff"+
            "\32\64\107\uffff\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\144\7\uffff\1\145",
            "\1\146",
            "\1\147\1\150",
            "\1\151\5\uffff\12\153",
            "\1\154",
            "\1\160\1\157\1\uffff\12\156",
            "\1\160\1\161\1\uffff\12\156",
            "\1\160\1\162\1\uffff\12\156",
            "",
            "",
            "",
            "",
            "\1\64",
            "\0\163",
            "\0\163",
            "",
            "",
            "",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "",
            "\1\166",
            "",
            "\1\167",
            "\1\170",
            "\1\171",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\176\1\64\12"+
            "\104\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107"+
            "\uffff\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\177\1\64\12"+
            "\104\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107"+
            "\uffff\1\64",
            "\12\u0080",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\1\64"+
            "\12\104\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64"+
            "\107\uffff\1\64",
            "",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\16\uffff\1\u0089\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "",
            "",
            "\1\u008d",
            "",
            "",
            "",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "",
            "",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "",
            "",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00b4",
            "",
            "",
            "\12\153",
            "\1\u00b6",
            "",
            "\1\160\1\162\1\uffff\12\156",
            "\1\u00b7\11\162",
            "",
            "\12\u00b8",
            "",
            "",
            "",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\u00bd\11\162",
            "\12\u00be",
            "\12\u0080",
            "",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2\15\uffff\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca\1\uffff\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\21\64\1\u00ce"+
            "\10\64\107\uffff\1\64",
            "",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u00d0\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\u00a7\u00a0\1\u00d1\uff58\u00a0",
            "",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "\1\u00d2",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "\1\u00d7",
            "\1\u00b7\11\162",
            "\12\u00b8",
            "",
            "",
            "",
            "",
            "\1\u00bd\11\162",
            "\12\u00be",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00e6",
            "",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a0\1\u009b\1\u00a0\1\u0099\4\u00a0\1\u0092\1\u0097"+
            "\1\u00a0\1\u0098\1\u00a0\1\u009a\12\u0096\2\u00a0\1\u009d\1"+
            "\u009e\1\u009c\2\u00a0\32\u0094\4\u00a0\1\u0095\1\u00a0\32\u0093"+
            "\107\u00a0\1\u009f\uff3d\u00a0",
            "\43\u00a2\1\u00ab\1\u00a2\1\u00a8\4\u00a2\1\u00a9\1\u00a6"+
            "\1\u00a2\1\u00a7\1\u00a2\1\u00aa\12\u00a5\2\u00a2\1\u00ad\1"+
            "\u00ae\1\u00ac\2\u00a2\32\u00a3\4\u00a2\1\u00a4\1\u00a2\32\u00a1"+
            "\107\u00a2\1\u00af\uff3d\u00a2",
            "",
            "",
            "",
            "",
            "\1\u00e7",
            "",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "",
            "\1\u00f3",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00f4",
            "\1\u00f5",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u0104",
            "\1\u0106\17\uffff\1\u0105",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\1\u010c",
            "",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u011e",
            "",
            "\1\u011f",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u0121",
            "\1\u0122",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u0125",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u0127",
            "",
            "",
            "\1\u0128",
            "",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\64\1\uffff\1\64\4\uffff\2\64\1\uffff\1\64\1\uffff\13\64"+
            "\2\uffff\3\64\2\uffff\32\64\4\uffff\1\64\1\uffff\32\64\107\uffff"+
            "\1\64",
            ""
    };

    static final short[] DFA26_eot = DFA.unpackEncodedString(DFA26_eotS);
    static final short[] DFA26_eof = DFA.unpackEncodedString(DFA26_eofS);
    static final char[] DFA26_min = DFA.unpackEncodedStringToUnsignedChars(DFA26_minS);
    static final char[] DFA26_max = DFA.unpackEncodedStringToUnsignedChars(DFA26_maxS);
    static final short[] DFA26_accept = DFA.unpackEncodedString(DFA26_acceptS);
    static final short[] DFA26_special = DFA.unpackEncodedString(DFA26_specialS);
    static final short[][] DFA26_transition;

    static {
        int numStates = DFA26_transitionS.length;
        DFA26_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA26_transition[i] = DFA.unpackEncodedString(DFA26_transitionS[i]);
        }
    }

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = DFA26_eot;
            this.eof = DFA26_eof;
            this.min = DFA26_min;
            this.max = DFA26_max;
            this.accept = DFA26_accept;
            this.special = DFA26_special;
            this.transition = DFA26_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | RULE_EBOOLEAN | RULE_NULL | RULE_INT | RULE_POSITIVE_SMALL_DECIMAL | RULE_SMALL_DECIMAL | RULE_EBIGDECIMAL | RULE_ID | RULE_DATE_TIME | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_159 = input.LA(1);

                        s = -1;
                        if ( (LA26_159=='\u00A7') ) {s = 209;}

                        else if ( ((LA26_159>='\u0000' && LA26_159<='\u00A6')||(LA26_159>='\u00A8' && LA26_159<='\uFFFF')) ) {s = 160;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA26_146 = input.LA(1);

                        s = -1;
                        if ( (LA26_146=='/') ) {s = 208;}

                        else if ( (LA26_146=='*') ) {s = 146;}

                        else if ( ((LA26_146>='a' && LA26_146<='z')) ) {s = 147;}

                        else if ( ((LA26_146>='A' && LA26_146<='Z')) ) {s = 148;}

                        else if ( (LA26_146=='_') ) {s = 149;}

                        else if ( ((LA26_146>='0' && LA26_146<='9')) ) {s = 150;}

                        else if ( (LA26_146=='+') ) {s = 151;}

                        else if ( (LA26_146=='-') ) {s = 152;}

                        else if ( (LA26_146=='%') ) {s = 153;}

                        else if ( (LA26_146=='#') ) {s = 155;}

                        else if ( (LA26_146=='>') ) {s = 156;}

                        else if ( (LA26_146=='<') ) {s = 157;}

                        else if ( (LA26_146=='=') ) {s = 158;}

                        else if ( (LA26_146=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_146>='\u0000' && LA26_146<='\"')||LA26_146=='$'||(LA26_146>='&' && LA26_146<=')')||LA26_146==','||LA26_146=='.'||(LA26_146>=':' && LA26_146<=';')||(LA26_146>='?' && LA26_146<='@')||(LA26_146>='[' && LA26_146<='^')||LA26_146=='`'||(LA26_146>='{' && LA26_146<='\u00C1')||(LA26_146>='\u00C3' && LA26_146<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA26_46 = input.LA(1);

                        s = -1;
                        if ( ((LA26_46>='\u0000' && LA26_46<='\uFFFF')) ) {s = 115;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA26_208 = input.LA(1);

                        s = -1;
                        if ( (LA26_208=='*') ) {s = 146;}

                        else if ( ((LA26_208>='a' && LA26_208<='z')) ) {s = 147;}

                        else if ( ((LA26_208>='A' && LA26_208<='Z')) ) {s = 148;}

                        else if ( (LA26_208=='_') ) {s = 149;}

                        else if ( ((LA26_208>='0' && LA26_208<='9')) ) {s = 150;}

                        else if ( (LA26_208=='+') ) {s = 151;}

                        else if ( (LA26_208=='-') ) {s = 152;}

                        else if ( (LA26_208=='%') ) {s = 153;}

                        else if ( (LA26_208=='/') ) {s = 154;}

                        else if ( (LA26_208=='#') ) {s = 155;}

                        else if ( (LA26_208=='>') ) {s = 156;}

                        else if ( (LA26_208=='<') ) {s = 157;}

                        else if ( (LA26_208=='=') ) {s = 158;}

                        else if ( (LA26_208=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_208>='\u0000' && LA26_208<='\"')||LA26_208=='$'||(LA26_208>='&' && LA26_208<=')')||LA26_208==','||LA26_208=='.'||(LA26_208>=':' && LA26_208<=';')||(LA26_208>='?' && LA26_208<='@')||(LA26_208>='[' && LA26_208<='^')||LA26_208=='`'||(LA26_208>='{' && LA26_208<='\u00C1')||(LA26_208>='\u00C3' && LA26_208<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA26_97 = input.LA(1);

                        s = -1;
                        if ( ((LA26_97>='a' && LA26_97<='z')) ) {s = 161;}

                        else if ( ((LA26_97>='\u0000' && LA26_97<='\"')||LA26_97=='$'||(LA26_97>='&' && LA26_97<=')')||LA26_97==','||LA26_97=='.'||(LA26_97>=':' && LA26_97<=';')||(LA26_97>='?' && LA26_97<='@')||(LA26_97>='[' && LA26_97<='^')||LA26_97=='`'||(LA26_97>='{' && LA26_97<='\u00C1')||(LA26_97>='\u00C3' && LA26_97<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_97>='A' && LA26_97<='Z')) ) {s = 163;}

                        else if ( (LA26_97=='_') ) {s = 164;}

                        else if ( ((LA26_97>='0' && LA26_97<='9')) ) {s = 165;}

                        else if ( (LA26_97=='+') ) {s = 166;}

                        else if ( (LA26_97=='-') ) {s = 167;}

                        else if ( (LA26_97=='%') ) {s = 168;}

                        else if ( (LA26_97=='*') ) {s = 169;}

                        else if ( (LA26_97=='/') ) {s = 170;}

                        else if ( (LA26_97=='#') ) {s = 171;}

                        else if ( (LA26_97=='>') ) {s = 172;}

                        else if ( (LA26_97=='<') ) {s = 173;}

                        else if ( (LA26_97=='=') ) {s = 174;}

                        else if ( (LA26_97=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA26_96 = input.LA(1);

                        s = -1;
                        if ( (LA26_96=='*') ) {s = 146;}

                        else if ( ((LA26_96>='a' && LA26_96<='z')) ) {s = 147;}

                        else if ( ((LA26_96>='A' && LA26_96<='Z')) ) {s = 148;}

                        else if ( (LA26_96=='_') ) {s = 149;}

                        else if ( ((LA26_96>='0' && LA26_96<='9')) ) {s = 150;}

                        else if ( (LA26_96=='+') ) {s = 151;}

                        else if ( (LA26_96=='-') ) {s = 152;}

                        else if ( (LA26_96=='%') ) {s = 153;}

                        else if ( (LA26_96=='/') ) {s = 154;}

                        else if ( (LA26_96=='#') ) {s = 155;}

                        else if ( (LA26_96=='>') ) {s = 156;}

                        else if ( (LA26_96=='<') ) {s = 157;}

                        else if ( (LA26_96=='=') ) {s = 158;}

                        else if ( (LA26_96=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_96>='\u0000' && LA26_96<='\"')||LA26_96=='$'||(LA26_96>='&' && LA26_96<=')')||LA26_96==','||LA26_96=='.'||(LA26_96>=':' && LA26_96<=';')||(LA26_96>='?' && LA26_96<='@')||(LA26_96>='[' && LA26_96<='^')||LA26_96=='`'||(LA26_96>='{' && LA26_96<='\u00C1')||(LA26_96>='\u00C3' && LA26_96<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA26_166 = input.LA(1);

                        s = -1;
                        if ( ((LA26_166>='\u0000' && LA26_166<='\"')||LA26_166=='$'||(LA26_166>='&' && LA26_166<=')')||LA26_166==','||LA26_166=='.'||(LA26_166>=':' && LA26_166<=';')||(LA26_166>='?' && LA26_166<='@')||(LA26_166>='[' && LA26_166<='^')||LA26_166=='`'||(LA26_166>='{' && LA26_166<='\u00C1')||(LA26_166>='\u00C3' && LA26_166<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_166>='a' && LA26_166<='z')) ) {s = 161;}

                        else if ( ((LA26_166>='A' && LA26_166<='Z')) ) {s = 163;}

                        else if ( (LA26_166=='_') ) {s = 164;}

                        else if ( ((LA26_166>='0' && LA26_166<='9')) ) {s = 165;}

                        else if ( (LA26_166=='+') ) {s = 166;}

                        else if ( (LA26_166=='-') ) {s = 167;}

                        else if ( (LA26_166=='%') ) {s = 168;}

                        else if ( (LA26_166=='*') ) {s = 169;}

                        else if ( (LA26_166=='/') ) {s = 170;}

                        else if ( (LA26_166=='#') ) {s = 171;}

                        else if ( (LA26_166=='>') ) {s = 172;}

                        else if ( (LA26_166=='<') ) {s = 173;}

                        else if ( (LA26_166=='=') ) {s = 174;}

                        else if ( (LA26_166=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA26_165 = input.LA(1);

                        s = -1;
                        if ( ((LA26_165>='\u0000' && LA26_165<='\"')||LA26_165=='$'||(LA26_165>='&' && LA26_165<=')')||LA26_165==','||LA26_165=='.'||(LA26_165>=':' && LA26_165<=';')||(LA26_165>='?' && LA26_165<='@')||(LA26_165>='[' && LA26_165<='^')||LA26_165=='`'||(LA26_165>='{' && LA26_165<='\u00C1')||(LA26_165>='\u00C3' && LA26_165<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_165>='a' && LA26_165<='z')) ) {s = 161;}

                        else if ( ((LA26_165>='A' && LA26_165<='Z')) ) {s = 163;}

                        else if ( (LA26_165=='_') ) {s = 164;}

                        else if ( ((LA26_165>='0' && LA26_165<='9')) ) {s = 165;}

                        else if ( (LA26_165=='+') ) {s = 166;}

                        else if ( (LA26_165=='-') ) {s = 167;}

                        else if ( (LA26_165=='%') ) {s = 168;}

                        else if ( (LA26_165=='*') ) {s = 169;}

                        else if ( (LA26_165=='/') ) {s = 170;}

                        else if ( (LA26_165=='#') ) {s = 171;}

                        else if ( (LA26_165=='>') ) {s = 172;}

                        else if ( (LA26_165=='<') ) {s = 173;}

                        else if ( (LA26_165=='=') ) {s = 174;}

                        else if ( (LA26_165=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA26_148 = input.LA(1);

                        s = -1;
                        if ( ((LA26_148>='a' && LA26_148<='z')) ) {s = 147;}

                        else if ( ((LA26_148>='A' && LA26_148<='Z')) ) {s = 148;}

                        else if ( (LA26_148=='_') ) {s = 149;}

                        else if ( ((LA26_148>='0' && LA26_148<='9')) ) {s = 150;}

                        else if ( (LA26_148=='+') ) {s = 151;}

                        else if ( (LA26_148=='-') ) {s = 152;}

                        else if ( (LA26_148=='%') ) {s = 153;}

                        else if ( (LA26_148=='*') ) {s = 146;}

                        else if ( (LA26_148=='/') ) {s = 154;}

                        else if ( (LA26_148=='#') ) {s = 155;}

                        else if ( (LA26_148=='>') ) {s = 156;}

                        else if ( (LA26_148=='<') ) {s = 157;}

                        else if ( (LA26_148=='=') ) {s = 158;}

                        else if ( (LA26_148=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_148>='\u0000' && LA26_148<='\"')||LA26_148=='$'||(LA26_148>='&' && LA26_148<=')')||LA26_148==','||LA26_148=='.'||(LA26_148>=':' && LA26_148<=';')||(LA26_148>='?' && LA26_148<='@')||(LA26_148>='[' && LA26_148<='^')||LA26_148=='`'||(LA26_148>='{' && LA26_148<='\u00C1')||(LA26_148>='\u00C3' && LA26_148<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA26_168 = input.LA(1);

                        s = -1;
                        if ( ((LA26_168>='a' && LA26_168<='z')) ) {s = 161;}

                        else if ( ((LA26_168>='A' && LA26_168<='Z')) ) {s = 163;}

                        else if ( (LA26_168=='_') ) {s = 164;}

                        else if ( ((LA26_168>='0' && LA26_168<='9')) ) {s = 165;}

                        else if ( (LA26_168=='+') ) {s = 166;}

                        else if ( (LA26_168=='-') ) {s = 167;}

                        else if ( (LA26_168=='%') ) {s = 168;}

                        else if ( (LA26_168=='*') ) {s = 169;}

                        else if ( (LA26_168=='/') ) {s = 170;}

                        else if ( (LA26_168=='#') ) {s = 171;}

                        else if ( (LA26_168=='>') ) {s = 172;}

                        else if ( (LA26_168=='<') ) {s = 173;}

                        else if ( (LA26_168=='=') ) {s = 174;}

                        else if ( (LA26_168=='\u00C2') ) {s = 175;}

                        else if ( ((LA26_168>='\u0000' && LA26_168<='\"')||LA26_168=='$'||(LA26_168>='&' && LA26_168<=')')||LA26_168==','||LA26_168=='.'||(LA26_168>=':' && LA26_168<=';')||(LA26_168>='?' && LA26_168<='@')||(LA26_168>='[' && LA26_168<='^')||LA26_168=='`'||(LA26_168>='{' && LA26_168<='\u00C1')||(LA26_168>='\u00C3' && LA26_168<='\uFFFF')) ) {s = 162;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA26_147 = input.LA(1);

                        s = -1;
                        if ( (LA26_147=='*') ) {s = 146;}

                        else if ( ((LA26_147>='a' && LA26_147<='z')) ) {s = 147;}

                        else if ( ((LA26_147>='A' && LA26_147<='Z')) ) {s = 148;}

                        else if ( (LA26_147=='_') ) {s = 149;}

                        else if ( ((LA26_147>='0' && LA26_147<='9')) ) {s = 150;}

                        else if ( (LA26_147=='+') ) {s = 151;}

                        else if ( (LA26_147=='-') ) {s = 152;}

                        else if ( (LA26_147=='%') ) {s = 153;}

                        else if ( (LA26_147=='/') ) {s = 154;}

                        else if ( (LA26_147=='#') ) {s = 155;}

                        else if ( (LA26_147=='>') ) {s = 156;}

                        else if ( (LA26_147=='<') ) {s = 157;}

                        else if ( (LA26_147=='=') ) {s = 158;}

                        else if ( (LA26_147=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_147>='\u0000' && LA26_147<='\"')||LA26_147=='$'||(LA26_147>='&' && LA26_147<=')')||LA26_147==','||LA26_147=='.'||(LA26_147>=':' && LA26_147<=';')||(LA26_147>='?' && LA26_147<='@')||(LA26_147>='[' && LA26_147<='^')||LA26_147=='`'||(LA26_147>='{' && LA26_147<='\u00C1')||(LA26_147>='\u00C3' && LA26_147<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA26_167 = input.LA(1);

                        s = -1;
                        if ( ((LA26_167>='a' && LA26_167<='z')) ) {s = 161;}

                        else if ( ((LA26_167>='A' && LA26_167<='Z')) ) {s = 163;}

                        else if ( (LA26_167=='_') ) {s = 164;}

                        else if ( ((LA26_167>='0' && LA26_167<='9')) ) {s = 165;}

                        else if ( (LA26_167=='+') ) {s = 166;}

                        else if ( (LA26_167=='-') ) {s = 167;}

                        else if ( (LA26_167=='%') ) {s = 168;}

                        else if ( (LA26_167=='*') ) {s = 169;}

                        else if ( (LA26_167=='/') ) {s = 170;}

                        else if ( (LA26_167=='#') ) {s = 171;}

                        else if ( (LA26_167=='>') ) {s = 172;}

                        else if ( (LA26_167=='<') ) {s = 173;}

                        else if ( (LA26_167=='=') ) {s = 174;}

                        else if ( (LA26_167=='\u00C2') ) {s = 175;}

                        else if ( ((LA26_167>='\u0000' && LA26_167<='\"')||LA26_167=='$'||(LA26_167>='&' && LA26_167<=')')||LA26_167==','||LA26_167=='.'||(LA26_167>=':' && LA26_167<=';')||(LA26_167>='?' && LA26_167<='@')||(LA26_167>='[' && LA26_167<='^')||LA26_167=='`'||(LA26_167>='{' && LA26_167<='\u00C1')||(LA26_167>='\u00C3' && LA26_167<='\uFFFF')) ) {s = 162;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA26_161 = input.LA(1);

                        s = -1;
                        if ( ((LA26_161>='\u0000' && LA26_161<='\"')||LA26_161=='$'||(LA26_161>='&' && LA26_161<=')')||LA26_161==','||LA26_161=='.'||(LA26_161>=':' && LA26_161<=';')||(LA26_161>='?' && LA26_161<='@')||(LA26_161>='[' && LA26_161<='^')||LA26_161=='`'||(LA26_161>='{' && LA26_161<='\u00C1')||(LA26_161>='\u00C3' && LA26_161<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_161>='a' && LA26_161<='z')) ) {s = 161;}

                        else if ( ((LA26_161>='A' && LA26_161<='Z')) ) {s = 163;}

                        else if ( (LA26_161=='_') ) {s = 164;}

                        else if ( ((LA26_161>='0' && LA26_161<='9')) ) {s = 165;}

                        else if ( (LA26_161=='+') ) {s = 166;}

                        else if ( (LA26_161=='-') ) {s = 167;}

                        else if ( (LA26_161=='%') ) {s = 168;}

                        else if ( (LA26_161=='*') ) {s = 169;}

                        else if ( (LA26_161=='/') ) {s = 170;}

                        else if ( (LA26_161=='#') ) {s = 171;}

                        else if ( (LA26_161=='>') ) {s = 172;}

                        else if ( (LA26_161=='<') ) {s = 173;}

                        else if ( (LA26_161=='=') ) {s = 174;}

                        else if ( (LA26_161=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA26_164 = input.LA(1);

                        s = -1;
                        if ( ((LA26_164>='\u0000' && LA26_164<='\"')||LA26_164=='$'||(LA26_164>='&' && LA26_164<=')')||LA26_164==','||LA26_164=='.'||(LA26_164>=':' && LA26_164<=';')||(LA26_164>='?' && LA26_164<='@')||(LA26_164>='[' && LA26_164<='^')||LA26_164=='`'||(LA26_164>='{' && LA26_164<='\u00C1')||(LA26_164>='\u00C3' && LA26_164<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_164>='a' && LA26_164<='z')) ) {s = 161;}

                        else if ( ((LA26_164>='A' && LA26_164<='Z')) ) {s = 163;}

                        else if ( (LA26_164=='_') ) {s = 164;}

                        else if ( ((LA26_164>='0' && LA26_164<='9')) ) {s = 165;}

                        else if ( (LA26_164=='+') ) {s = 166;}

                        else if ( (LA26_164=='-') ) {s = 167;}

                        else if ( (LA26_164=='%') ) {s = 168;}

                        else if ( (LA26_164=='*') ) {s = 169;}

                        else if ( (LA26_164=='/') ) {s = 170;}

                        else if ( (LA26_164=='#') ) {s = 171;}

                        else if ( (LA26_164=='>') ) {s = 172;}

                        else if ( (LA26_164=='<') ) {s = 173;}

                        else if ( (LA26_164=='=') ) {s = 174;}

                        else if ( (LA26_164=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA26_163 = input.LA(1);

                        s = -1;
                        if ( ((LA26_163>='\u0000' && LA26_163<='\"')||LA26_163=='$'||(LA26_163>='&' && LA26_163<=')')||LA26_163==','||LA26_163=='.'||(LA26_163>=':' && LA26_163<=';')||(LA26_163>='?' && LA26_163<='@')||(LA26_163>='[' && LA26_163<='^')||LA26_163=='`'||(LA26_163>='{' && LA26_163<='\u00C1')||(LA26_163>='\u00C3' && LA26_163<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_163>='a' && LA26_163<='z')) ) {s = 161;}

                        else if ( ((LA26_163>='A' && LA26_163<='Z')) ) {s = 163;}

                        else if ( (LA26_163=='_') ) {s = 164;}

                        else if ( ((LA26_163>='0' && LA26_163<='9')) ) {s = 165;}

                        else if ( (LA26_163=='+') ) {s = 166;}

                        else if ( (LA26_163=='-') ) {s = 167;}

                        else if ( (LA26_163=='%') ) {s = 168;}

                        else if ( (LA26_163=='*') ) {s = 169;}

                        else if ( (LA26_163=='/') ) {s = 170;}

                        else if ( (LA26_163=='#') ) {s = 171;}

                        else if ( (LA26_163=='>') ) {s = 172;}

                        else if ( (LA26_163=='<') ) {s = 173;}

                        else if ( (LA26_163=='=') ) {s = 174;}

                        else if ( (LA26_163=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA26_174 = input.LA(1);

                        s = -1;
                        if ( ((LA26_174>='\u0000' && LA26_174<='\"')||LA26_174=='$'||(LA26_174>='&' && LA26_174<=')')||LA26_174==','||LA26_174=='.'||(LA26_174>=':' && LA26_174<=';')||(LA26_174>='?' && LA26_174<='@')||(LA26_174>='[' && LA26_174<='^')||LA26_174=='`'||(LA26_174>='{' && LA26_174<='\u00C1')||(LA26_174>='\u00C3' && LA26_174<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_174>='a' && LA26_174<='z')) ) {s = 161;}

                        else if ( ((LA26_174>='A' && LA26_174<='Z')) ) {s = 163;}

                        else if ( (LA26_174=='_') ) {s = 164;}

                        else if ( ((LA26_174>='0' && LA26_174<='9')) ) {s = 165;}

                        else if ( (LA26_174=='+') ) {s = 166;}

                        else if ( (LA26_174=='-') ) {s = 167;}

                        else if ( (LA26_174=='%') ) {s = 168;}

                        else if ( (LA26_174=='*') ) {s = 169;}

                        else if ( (LA26_174=='/') ) {s = 170;}

                        else if ( (LA26_174=='#') ) {s = 171;}

                        else if ( (LA26_174=='>') ) {s = 172;}

                        else if ( (LA26_174=='<') ) {s = 173;}

                        else if ( (LA26_174=='=') ) {s = 174;}

                        else if ( (LA26_174=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA26_173 = input.LA(1);

                        s = -1;
                        if ( ((LA26_173>='a' && LA26_173<='z')) ) {s = 161;}

                        else if ( ((LA26_173>='A' && LA26_173<='Z')) ) {s = 163;}

                        else if ( (LA26_173=='_') ) {s = 164;}

                        else if ( ((LA26_173>='0' && LA26_173<='9')) ) {s = 165;}

                        else if ( (LA26_173=='+') ) {s = 166;}

                        else if ( (LA26_173=='-') ) {s = 167;}

                        else if ( (LA26_173=='%') ) {s = 168;}

                        else if ( (LA26_173=='*') ) {s = 169;}

                        else if ( (LA26_173=='/') ) {s = 170;}

                        else if ( (LA26_173=='#') ) {s = 171;}

                        else if ( (LA26_173=='>') ) {s = 172;}

                        else if ( (LA26_173=='<') ) {s = 173;}

                        else if ( (LA26_173=='=') ) {s = 174;}

                        else if ( (LA26_173=='\u00C2') ) {s = 175;}

                        else if ( ((LA26_173>='\u0000' && LA26_173<='\"')||LA26_173=='$'||(LA26_173>='&' && LA26_173<=')')||LA26_173==','||LA26_173=='.'||(LA26_173>=':' && LA26_173<=';')||(LA26_173>='?' && LA26_173<='@')||(LA26_173>='[' && LA26_173<='^')||LA26_173=='`'||(LA26_173>='{' && LA26_173<='\u00C1')||(LA26_173>='\u00C3' && LA26_173<='\uFFFF')) ) {s = 162;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA26_210 = input.LA(1);

                        s = -1;
                        if ( ((LA26_210>='a' && LA26_210<='z')) ) {s = 161;}

                        else if ( ((LA26_210>='A' && LA26_210<='Z')) ) {s = 163;}

                        else if ( (LA26_210=='_') ) {s = 164;}

                        else if ( ((LA26_210>='0' && LA26_210<='9')) ) {s = 165;}

                        else if ( (LA26_210=='+') ) {s = 166;}

                        else if ( (LA26_210=='-') ) {s = 167;}

                        else if ( (LA26_210=='%') ) {s = 168;}

                        else if ( (LA26_210=='*') ) {s = 169;}

                        else if ( (LA26_210=='/') ) {s = 170;}

                        else if ( (LA26_210=='#') ) {s = 171;}

                        else if ( (LA26_210=='>') ) {s = 172;}

                        else if ( (LA26_210=='<') ) {s = 173;}

                        else if ( (LA26_210=='=') ) {s = 174;}

                        else if ( (LA26_210=='\u00C2') ) {s = 175;}

                        else if ( ((LA26_210>='\u0000' && LA26_210<='\"')||LA26_210=='$'||(LA26_210>='&' && LA26_210<=')')||LA26_210==','||LA26_210=='.'||(LA26_210>=':' && LA26_210<=';')||(LA26_210>='?' && LA26_210<='@')||(LA26_210>='[' && LA26_210<='^')||LA26_210=='`'||(LA26_210>='{' && LA26_210<='\u00C1')||(LA26_210>='\u00C3' && LA26_210<='\uFFFF')) ) {s = 162;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA26_170 = input.LA(1);

                        s = -1;
                        if ( ((LA26_170>='\u0000' && LA26_170<='\"')||LA26_170=='$'||(LA26_170>='&' && LA26_170<=')')||LA26_170==','||LA26_170=='.'||(LA26_170>=':' && LA26_170<=';')||(LA26_170>='?' && LA26_170<='@')||(LA26_170>='[' && LA26_170<='^')||LA26_170=='`'||(LA26_170>='{' && LA26_170<='\u00C1')||(LA26_170>='\u00C3' && LA26_170<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_170>='a' && LA26_170<='z')) ) {s = 161;}

                        else if ( ((LA26_170>='A' && LA26_170<='Z')) ) {s = 163;}

                        else if ( (LA26_170=='_') ) {s = 164;}

                        else if ( ((LA26_170>='0' && LA26_170<='9')) ) {s = 165;}

                        else if ( (LA26_170=='+') ) {s = 166;}

                        else if ( (LA26_170=='-') ) {s = 167;}

                        else if ( (LA26_170=='%') ) {s = 168;}

                        else if ( (LA26_170=='*') ) {s = 169;}

                        else if ( (LA26_170=='/') ) {s = 170;}

                        else if ( (LA26_170=='#') ) {s = 171;}

                        else if ( (LA26_170=='>') ) {s = 172;}

                        else if ( (LA26_170=='<') ) {s = 173;}

                        else if ( (LA26_170=='=') ) {s = 174;}

                        else if ( (LA26_170=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA26_169 = input.LA(1);

                        s = -1;
                        if ( ((LA26_169>='\u0000' && LA26_169<='\"')||LA26_169=='$'||(LA26_169>='&' && LA26_169<=')')||LA26_169==','||LA26_169=='.'||(LA26_169>=':' && LA26_169<=';')||(LA26_169>='?' && LA26_169<='@')||(LA26_169>='[' && LA26_169<='^')||LA26_169=='`'||(LA26_169>='{' && LA26_169<='\u00C1')||(LA26_169>='\u00C3' && LA26_169<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_169>='a' && LA26_169<='z')) ) {s = 161;}

                        else if ( ((LA26_169>='A' && LA26_169<='Z')) ) {s = 163;}

                        else if ( (LA26_169=='_') ) {s = 164;}

                        else if ( ((LA26_169>='0' && LA26_169<='9')) ) {s = 165;}

                        else if ( (LA26_169=='+') ) {s = 166;}

                        else if ( (LA26_169=='-') ) {s = 167;}

                        else if ( (LA26_169=='%') ) {s = 168;}

                        else if ( (LA26_169=='*') ) {s = 169;}

                        else if ( (LA26_169=='/') ) {s = 170;}

                        else if ( (LA26_169=='#') ) {s = 171;}

                        else if ( (LA26_169=='>') ) {s = 172;}

                        else if ( (LA26_169=='<') ) {s = 173;}

                        else if ( (LA26_169=='=') ) {s = 174;}

                        else if ( (LA26_169=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA26_172 = input.LA(1);

                        s = -1;
                        if ( ((LA26_172>='\u0000' && LA26_172<='\"')||LA26_172=='$'||(LA26_172>='&' && LA26_172<=')')||LA26_172==','||LA26_172=='.'||(LA26_172>=':' && LA26_172<=';')||(LA26_172>='?' && LA26_172<='@')||(LA26_172>='[' && LA26_172<='^')||LA26_172=='`'||(LA26_172>='{' && LA26_172<='\u00C1')||(LA26_172>='\u00C3' && LA26_172<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_172>='a' && LA26_172<='z')) ) {s = 161;}

                        else if ( ((LA26_172>='A' && LA26_172<='Z')) ) {s = 163;}

                        else if ( (LA26_172=='_') ) {s = 164;}

                        else if ( ((LA26_172>='0' && LA26_172<='9')) ) {s = 165;}

                        else if ( (LA26_172=='+') ) {s = 166;}

                        else if ( (LA26_172=='-') ) {s = 167;}

                        else if ( (LA26_172=='%') ) {s = 168;}

                        else if ( (LA26_172=='*') ) {s = 169;}

                        else if ( (LA26_172=='/') ) {s = 170;}

                        else if ( (LA26_172=='#') ) {s = 171;}

                        else if ( (LA26_172=='>') ) {s = 172;}

                        else if ( (LA26_172=='<') ) {s = 173;}

                        else if ( (LA26_172=='=') ) {s = 174;}

                        else if ( (LA26_172=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA26_171 = input.LA(1);

                        s = -1;
                        if ( ((LA26_171>='\u0000' && LA26_171<='\"')||LA26_171=='$'||(LA26_171>='&' && LA26_171<=')')||LA26_171==','||LA26_171=='.'||(LA26_171>=':' && LA26_171<=';')||(LA26_171>='?' && LA26_171<='@')||(LA26_171>='[' && LA26_171<='^')||LA26_171=='`'||(LA26_171>='{' && LA26_171<='\u00C1')||(LA26_171>='\u00C3' && LA26_171<='\uFFFF')) ) {s = 162;}

                        else if ( ((LA26_171>='a' && LA26_171<='z')) ) {s = 161;}

                        else if ( ((LA26_171>='A' && LA26_171<='Z')) ) {s = 163;}

                        else if ( (LA26_171=='_') ) {s = 164;}

                        else if ( ((LA26_171>='0' && LA26_171<='9')) ) {s = 165;}

                        else if ( (LA26_171=='+') ) {s = 166;}

                        else if ( (LA26_171=='-') ) {s = 167;}

                        else if ( (LA26_171=='%') ) {s = 168;}

                        else if ( (LA26_171=='*') ) {s = 169;}

                        else if ( (LA26_171=='/') ) {s = 170;}

                        else if ( (LA26_171=='#') ) {s = 171;}

                        else if ( (LA26_171=='>') ) {s = 172;}

                        else if ( (LA26_171=='<') ) {s = 173;}

                        else if ( (LA26_171=='=') ) {s = 174;}

                        else if ( (LA26_171=='\u00C2') ) {s = 175;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA26_45 = input.LA(1);

                        s = -1;
                        if ( ((LA26_45>='\u0000' && LA26_45<='\uFFFF')) ) {s = 115;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA26_0 = input.LA(1);

                        s = -1;
                        if ( (LA26_0=='(') ) {s = 1;}

                        else if ( (LA26_0==')') ) {s = 2;}

                        else if ( (LA26_0=='o') ) {s = 3;}

                        else if ( (LA26_0=='|') ) {s = 4;}

                        else if ( (LA26_0=='x') ) {s = 5;}

                        else if ( (LA26_0=='^') ) {s = 6;}

                        else if ( (LA26_0=='a') ) {s = 7;}

                        else if ( (LA26_0=='&') ) {s = 8;}

                        else if ( (LA26_0=='=') ) {s = 9;}

                        else if ( (LA26_0=='-') ) {s = 10;}

                        else if ( (LA26_0=='!') ) {s = 11;}

                        else if ( (LA26_0=='<') ) {s = 12;}

                        else if ( (LA26_0=='n') ) {s = 13;}

                        else if ( (LA26_0=='i') ) {s = 14;}

                        else if ( (LA26_0=='d') ) {s = 15;}

                        else if ( (LA26_0=='r') ) {s = 16;}

                        else if ( (LA26_0=='p') ) {s = 17;}

                        else if ( (LA26_0=='{') ) {s = 18;}

                        else if ( (LA26_0=='}') ) {s = 19;}

                        else if ( (LA26_0=='q') ) {s = 20;}

                        else if ( (LA26_0==',') ) {s = 21;}

                        else if ( (LA26_0=='[') ) {s = 22;}

                        else if ( (LA26_0==']') ) {s = 23;}

                        else if ( (LA26_0=='t') ) {s = 24;}

                        else if ( (LA26_0=='e') ) {s = 25;}

                        else if ( (LA26_0=='$') ) {s = 26;}

                        else if ( (LA26_0=='>') ) {s = 27;}

                        else if ( (LA26_0=='+') ) {s = 28;}

                        else if ( (LA26_0=='*') ) {s = 29;}

                        else if ( (LA26_0=='/') ) {s = 30;}

                        else if ( (LA26_0=='%') ) {s = 31;}

                        else if ( (LA26_0=='m') ) {s = 32;}

                        else if ( (LA26_0=='s') ) {s = 33;}

                        else if ( (LA26_0=='l') ) {s = 34;}

                        else if ( (LA26_0=='.') ) {s = 35;}

                        else if ( (LA26_0=='f') ) {s = 36;}

                        else if ( (LA26_0=='1') ) {s = 37;}

                        else if ( (LA26_0=='0') ) {s = 38;}

                        else if ( ((LA26_0>='2' && LA26_0<='9')) ) {s = 39;}

                        else if ( ((LA26_0>='b' && LA26_0<='c')||(LA26_0>='g' && LA26_0<='h')||(LA26_0>='j' && LA26_0<='k')||(LA26_0>='u' && LA26_0<='w')||(LA26_0>='y' && LA26_0<='z')) ) {s = 40;}

                        else if ( ((LA26_0>='A' && LA26_0<='Z')) ) {s = 41;}

                        else if ( (LA26_0=='_') ) {s = 42;}

                        else if ( (LA26_0=='#') ) {s = 43;}

                        else if ( (LA26_0=='\u00C2') ) {s = 44;}

                        else if ( (LA26_0=='\"') ) {s = 45;}

                        else if ( (LA26_0=='\'') ) {s = 46;}

                        else if ( ((LA26_0>='\t' && LA26_0<='\n')||LA26_0=='\r'||LA26_0==' ') ) {s = 47;}

                        else if ( ((LA26_0>='\u0000' && LA26_0<='\b')||(LA26_0>='\u000B' && LA26_0<='\f')||(LA26_0>='\u000E' && LA26_0<='\u001F')||(LA26_0>=':' && LA26_0<=';')||(LA26_0>='?' && LA26_0<='@')||LA26_0=='\\'||LA26_0=='`'||(LA26_0>='~' && LA26_0<='\u00C1')||(LA26_0>='\u00C3' && LA26_0<='\uFFFF')) ) {s = 48;}

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA26_158 = input.LA(1);

                        s = -1;
                        if ( ((LA26_158>='a' && LA26_158<='z')) ) {s = 147;}

                        else if ( ((LA26_158>='A' && LA26_158<='Z')) ) {s = 148;}

                        else if ( (LA26_158=='_') ) {s = 149;}

                        else if ( ((LA26_158>='0' && LA26_158<='9')) ) {s = 150;}

                        else if ( (LA26_158=='+') ) {s = 151;}

                        else if ( (LA26_158=='-') ) {s = 152;}

                        else if ( (LA26_158=='%') ) {s = 153;}

                        else if ( (LA26_158=='*') ) {s = 146;}

                        else if ( (LA26_158=='/') ) {s = 154;}

                        else if ( (LA26_158=='#') ) {s = 155;}

                        else if ( (LA26_158=='>') ) {s = 156;}

                        else if ( (LA26_158=='<') ) {s = 157;}

                        else if ( (LA26_158=='=') ) {s = 158;}

                        else if ( (LA26_158=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_158>='\u0000' && LA26_158<='\"')||LA26_158=='$'||(LA26_158>='&' && LA26_158<=')')||LA26_158==','||LA26_158=='.'||(LA26_158>=':' && LA26_158<=';')||(LA26_158>='?' && LA26_158<='@')||(LA26_158>='[' && LA26_158<='^')||LA26_158=='`'||(LA26_158>='{' && LA26_158<='\u00C1')||(LA26_158>='\u00C3' && LA26_158<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA26_209 = input.LA(1);

                        s = -1;
                        if ( ((LA26_209>='a' && LA26_209<='z')) ) {s = 147;}

                        else if ( ((LA26_209>='A' && LA26_209<='Z')) ) {s = 148;}

                        else if ( (LA26_209=='_') ) {s = 149;}

                        else if ( ((LA26_209>='0' && LA26_209<='9')) ) {s = 150;}

                        else if ( (LA26_209=='+') ) {s = 151;}

                        else if ( (LA26_209=='-') ) {s = 152;}

                        else if ( (LA26_209=='%') ) {s = 153;}

                        else if ( (LA26_209=='*') ) {s = 146;}

                        else if ( (LA26_209=='/') ) {s = 154;}

                        else if ( (LA26_209=='#') ) {s = 155;}

                        else if ( (LA26_209=='>') ) {s = 156;}

                        else if ( (LA26_209=='<') ) {s = 157;}

                        else if ( (LA26_209=='=') ) {s = 158;}

                        else if ( (LA26_209=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_209>='\u0000' && LA26_209<='\"')||LA26_209=='$'||(LA26_209>='&' && LA26_209<=')')||LA26_209==','||LA26_209=='.'||(LA26_209>=':' && LA26_209<=';')||(LA26_209>='?' && LA26_209<='@')||(LA26_209>='[' && LA26_209<='^')||LA26_209=='`'||(LA26_209>='{' && LA26_209<='\u00C1')||(LA26_209>='\u00C3' && LA26_209<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA26_156 = input.LA(1);

                        s = -1;
                        if ( ((LA26_156>='a' && LA26_156<='z')) ) {s = 147;}

                        else if ( ((LA26_156>='A' && LA26_156<='Z')) ) {s = 148;}

                        else if ( (LA26_156=='_') ) {s = 149;}

                        else if ( ((LA26_156>='0' && LA26_156<='9')) ) {s = 150;}

                        else if ( (LA26_156=='+') ) {s = 151;}

                        else if ( (LA26_156=='-') ) {s = 152;}

                        else if ( (LA26_156=='%') ) {s = 153;}

                        else if ( (LA26_156=='*') ) {s = 146;}

                        else if ( (LA26_156=='/') ) {s = 154;}

                        else if ( (LA26_156=='#') ) {s = 155;}

                        else if ( (LA26_156=='>') ) {s = 156;}

                        else if ( (LA26_156=='<') ) {s = 157;}

                        else if ( (LA26_156=='=') ) {s = 158;}

                        else if ( (LA26_156=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_156>='\u0000' && LA26_156<='\"')||LA26_156=='$'||(LA26_156>='&' && LA26_156<=')')||LA26_156==','||LA26_156=='.'||(LA26_156>=':' && LA26_156<=';')||(LA26_156>='?' && LA26_156<='@')||(LA26_156>='[' && LA26_156<='^')||LA26_156=='`'||(LA26_156>='{' && LA26_156<='\u00C1')||(LA26_156>='\u00C3' && LA26_156<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA26_157 = input.LA(1);

                        s = -1;
                        if ( ((LA26_157>='a' && LA26_157<='z')) ) {s = 147;}

                        else if ( ((LA26_157>='A' && LA26_157<='Z')) ) {s = 148;}

                        else if ( (LA26_157=='_') ) {s = 149;}

                        else if ( ((LA26_157>='0' && LA26_157<='9')) ) {s = 150;}

                        else if ( (LA26_157=='+') ) {s = 151;}

                        else if ( (LA26_157=='-') ) {s = 152;}

                        else if ( (LA26_157=='%') ) {s = 153;}

                        else if ( (LA26_157=='*') ) {s = 146;}

                        else if ( (LA26_157=='/') ) {s = 154;}

                        else if ( (LA26_157=='#') ) {s = 155;}

                        else if ( (LA26_157=='>') ) {s = 156;}

                        else if ( (LA26_157=='<') ) {s = 157;}

                        else if ( (LA26_157=='=') ) {s = 158;}

                        else if ( (LA26_157=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_157>='\u0000' && LA26_157<='\"')||LA26_157=='$'||(LA26_157>='&' && LA26_157<=')')||LA26_157==','||LA26_157=='.'||(LA26_157>=':' && LA26_157<=';')||(LA26_157>='?' && LA26_157<='@')||(LA26_157>='[' && LA26_157<='^')||LA26_157=='`'||(LA26_157>='{' && LA26_157<='\u00C1')||(LA26_157>='\u00C3' && LA26_157<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA26_154 = input.LA(1);

                        s = -1;
                        if ( (LA26_154=='*') ) {s = 146;}

                        else if ( ((LA26_154>='a' && LA26_154<='z')) ) {s = 147;}

                        else if ( ((LA26_154>='A' && LA26_154<='Z')) ) {s = 148;}

                        else if ( (LA26_154=='_') ) {s = 149;}

                        else if ( ((LA26_154>='0' && LA26_154<='9')) ) {s = 150;}

                        else if ( (LA26_154=='+') ) {s = 151;}

                        else if ( (LA26_154=='-') ) {s = 152;}

                        else if ( (LA26_154=='%') ) {s = 153;}

                        else if ( (LA26_154=='/') ) {s = 154;}

                        else if ( (LA26_154=='#') ) {s = 155;}

                        else if ( (LA26_154=='>') ) {s = 156;}

                        else if ( (LA26_154=='<') ) {s = 157;}

                        else if ( (LA26_154=='=') ) {s = 158;}

                        else if ( (LA26_154=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_154>='\u0000' && LA26_154<='\"')||LA26_154=='$'||(LA26_154>='&' && LA26_154<=')')||LA26_154==','||LA26_154=='.'||(LA26_154>=':' && LA26_154<=';')||(LA26_154>='?' && LA26_154<='@')||(LA26_154>='[' && LA26_154<='^')||LA26_154=='`'||(LA26_154>='{' && LA26_154<='\u00C1')||(LA26_154>='\u00C3' && LA26_154<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA26_155 = input.LA(1);

                        s = -1;
                        if ( ((LA26_155>='a' && LA26_155<='z')) ) {s = 147;}

                        else if ( ((LA26_155>='A' && LA26_155<='Z')) ) {s = 148;}

                        else if ( (LA26_155=='_') ) {s = 149;}

                        else if ( ((LA26_155>='0' && LA26_155<='9')) ) {s = 150;}

                        else if ( (LA26_155=='+') ) {s = 151;}

                        else if ( (LA26_155=='-') ) {s = 152;}

                        else if ( (LA26_155=='%') ) {s = 153;}

                        else if ( (LA26_155=='*') ) {s = 146;}

                        else if ( (LA26_155=='/') ) {s = 154;}

                        else if ( (LA26_155=='#') ) {s = 155;}

                        else if ( (LA26_155=='>') ) {s = 156;}

                        else if ( (LA26_155=='<') ) {s = 157;}

                        else if ( (LA26_155=='=') ) {s = 158;}

                        else if ( (LA26_155=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_155>='\u0000' && LA26_155<='\"')||LA26_155=='$'||(LA26_155>='&' && LA26_155<=')')||LA26_155==','||LA26_155=='.'||(LA26_155>=':' && LA26_155<=';')||(LA26_155>='?' && LA26_155<='@')||(LA26_155>='[' && LA26_155<='^')||LA26_155=='`'||(LA26_155>='{' && LA26_155<='\u00C1')||(LA26_155>='\u00C3' && LA26_155<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA26_153 = input.LA(1);

                        s = -1;
                        if ( ((LA26_153>='a' && LA26_153<='z')) ) {s = 147;}

                        else if ( ((LA26_153>='A' && LA26_153<='Z')) ) {s = 148;}

                        else if ( (LA26_153=='_') ) {s = 149;}

                        else if ( ((LA26_153>='0' && LA26_153<='9')) ) {s = 150;}

                        else if ( (LA26_153=='+') ) {s = 151;}

                        else if ( (LA26_153=='-') ) {s = 152;}

                        else if ( (LA26_153=='%') ) {s = 153;}

                        else if ( (LA26_153=='*') ) {s = 146;}

                        else if ( (LA26_153=='/') ) {s = 154;}

                        else if ( (LA26_153=='#') ) {s = 155;}

                        else if ( (LA26_153=='>') ) {s = 156;}

                        else if ( (LA26_153=='<') ) {s = 157;}

                        else if ( (LA26_153=='=') ) {s = 158;}

                        else if ( (LA26_153=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_153>='\u0000' && LA26_153<='\"')||LA26_153=='$'||(LA26_153>='&' && LA26_153<=')')||LA26_153==','||LA26_153=='.'||(LA26_153>=':' && LA26_153<=';')||(LA26_153>='?' && LA26_153<='@')||(LA26_153>='[' && LA26_153<='^')||LA26_153=='`'||(LA26_153>='{' && LA26_153<='\u00C1')||(LA26_153>='\u00C3' && LA26_153<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA26_151 = input.LA(1);

                        s = -1;
                        if ( ((LA26_151>='a' && LA26_151<='z')) ) {s = 147;}

                        else if ( ((LA26_151>='A' && LA26_151<='Z')) ) {s = 148;}

                        else if ( (LA26_151=='_') ) {s = 149;}

                        else if ( ((LA26_151>='0' && LA26_151<='9')) ) {s = 150;}

                        else if ( (LA26_151=='+') ) {s = 151;}

                        else if ( (LA26_151=='-') ) {s = 152;}

                        else if ( (LA26_151=='%') ) {s = 153;}

                        else if ( (LA26_151=='*') ) {s = 146;}

                        else if ( (LA26_151=='/') ) {s = 154;}

                        else if ( (LA26_151=='#') ) {s = 155;}

                        else if ( (LA26_151=='>') ) {s = 156;}

                        else if ( (LA26_151=='<') ) {s = 157;}

                        else if ( (LA26_151=='=') ) {s = 158;}

                        else if ( (LA26_151=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_151>='\u0000' && LA26_151<='\"')||LA26_151=='$'||(LA26_151>='&' && LA26_151<=')')||LA26_151==','||LA26_151=='.'||(LA26_151>=':' && LA26_151<=';')||(LA26_151>='?' && LA26_151<='@')||(LA26_151>='[' && LA26_151<='^')||LA26_151=='`'||(LA26_151>='{' && LA26_151<='\u00C1')||(LA26_151>='\u00C3' && LA26_151<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA26_152 = input.LA(1);

                        s = -1;
                        if ( ((LA26_152>='a' && LA26_152<='z')) ) {s = 147;}

                        else if ( ((LA26_152>='A' && LA26_152<='Z')) ) {s = 148;}

                        else if ( (LA26_152=='_') ) {s = 149;}

                        else if ( ((LA26_152>='0' && LA26_152<='9')) ) {s = 150;}

                        else if ( (LA26_152=='+') ) {s = 151;}

                        else if ( (LA26_152=='-') ) {s = 152;}

                        else if ( (LA26_152=='%') ) {s = 153;}

                        else if ( (LA26_152=='*') ) {s = 146;}

                        else if ( (LA26_152=='/') ) {s = 154;}

                        else if ( (LA26_152=='#') ) {s = 155;}

                        else if ( (LA26_152=='>') ) {s = 156;}

                        else if ( (LA26_152=='<') ) {s = 157;}

                        else if ( (LA26_152=='=') ) {s = 158;}

                        else if ( (LA26_152=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_152>='\u0000' && LA26_152<='\"')||LA26_152=='$'||(LA26_152>='&' && LA26_152<=')')||LA26_152==','||LA26_152=='.'||(LA26_152>=':' && LA26_152<=';')||(LA26_152>='?' && LA26_152<='@')||(LA26_152>='[' && LA26_152<='^')||LA26_152=='`'||(LA26_152>='{' && LA26_152<='\u00C1')||(LA26_152>='\u00C3' && LA26_152<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA26_149 = input.LA(1);

                        s = -1;
                        if ( (LA26_149=='*') ) {s = 146;}

                        else if ( ((LA26_149>='a' && LA26_149<='z')) ) {s = 147;}

                        else if ( ((LA26_149>='A' && LA26_149<='Z')) ) {s = 148;}

                        else if ( (LA26_149=='_') ) {s = 149;}

                        else if ( ((LA26_149>='0' && LA26_149<='9')) ) {s = 150;}

                        else if ( (LA26_149=='+') ) {s = 151;}

                        else if ( (LA26_149=='-') ) {s = 152;}

                        else if ( (LA26_149=='%') ) {s = 153;}

                        else if ( (LA26_149=='/') ) {s = 154;}

                        else if ( (LA26_149=='#') ) {s = 155;}

                        else if ( (LA26_149=='>') ) {s = 156;}

                        else if ( (LA26_149=='<') ) {s = 157;}

                        else if ( (LA26_149=='=') ) {s = 158;}

                        else if ( (LA26_149=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_149>='\u0000' && LA26_149<='\"')||LA26_149=='$'||(LA26_149>='&' && LA26_149<=')')||LA26_149==','||LA26_149=='.'||(LA26_149>=':' && LA26_149<=';')||(LA26_149>='?' && LA26_149<='@')||(LA26_149>='[' && LA26_149<='^')||LA26_149=='`'||(LA26_149>='{' && LA26_149<='\u00C1')||(LA26_149>='\u00C3' && LA26_149<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA26_150 = input.LA(1);

                        s = -1;
                        if ( ((LA26_150>='a' && LA26_150<='z')) ) {s = 147;}

                        else if ( ((LA26_150>='A' && LA26_150<='Z')) ) {s = 148;}

                        else if ( (LA26_150=='_') ) {s = 149;}

                        else if ( ((LA26_150>='0' && LA26_150<='9')) ) {s = 150;}

                        else if ( (LA26_150=='+') ) {s = 151;}

                        else if ( (LA26_150=='-') ) {s = 152;}

                        else if ( (LA26_150=='%') ) {s = 153;}

                        else if ( (LA26_150=='*') ) {s = 146;}

                        else if ( (LA26_150=='/') ) {s = 154;}

                        else if ( (LA26_150=='#') ) {s = 155;}

                        else if ( (LA26_150=='>') ) {s = 156;}

                        else if ( (LA26_150=='<') ) {s = 157;}

                        else if ( (LA26_150=='=') ) {s = 158;}

                        else if ( (LA26_150=='\u00C2') ) {s = 159;}

                        else if ( ((LA26_150>='\u0000' && LA26_150<='\"')||LA26_150=='$'||(LA26_150>='&' && LA26_150<=')')||LA26_150==','||LA26_150=='.'||(LA26_150>=':' && LA26_150<=';')||(LA26_150>='?' && LA26_150<='@')||(LA26_150>='[' && LA26_150<='^')||LA26_150=='`'||(LA26_150>='{' && LA26_150<='\u00C1')||(LA26_150>='\u00C3' && LA26_150<='\uFFFF')) ) {s = 160;}

                        else s = 52;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}