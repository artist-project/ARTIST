package eu.artist.migration.mdt.database.sql.editor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSQLDSLLexer extends Lexer {
    public static final int RULE_ID=12;
    public static final int RULE_ESTRING_AS_DOUBLE=7;
    public static final int RULE_N_SPEC_CHAR=8;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int RULE_OTHER_COMMAND=11;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_CAST_HEXA_VALUE_TO_DATETIME=6;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__19=19;
    public static final int RULE_STRING=5;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=4;
    public static final int RULE_N_ESTRING=9;
    public static final int RULE_WS=14;

    // delegates
    // delegators

    public InternalSQLDSLLexer() {;} 
    public InternalSQLDSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalSQLDSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:11:7: ( ' ' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:11:9: ' '
            {
            match(' '); 

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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:12:7: ( 'NULL' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:12:9: 'NULL'
            {
            match("NULL"); 


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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:13:7: ( 'INSERT' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:13:9: 'INSERT'
            {
            match("INSERT"); 


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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:14:7: ( '.' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:14:9: '.'
            {
            match('.'); 

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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:15:7: ( '(' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:15:9: '('
            {
            match('('); 

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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:16:7: ( ')' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:16:9: ')'
            {
            match(')'); 

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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:17:7: ( 'VALUES' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:17:9: 'VALUES'
            {
            match("VALUES"); 


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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:18:7: ( ',' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:18:9: ','
            {
            match(','); 

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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:19:7: ( '[' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:19:9: '['
            {
            match('['); 

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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:20:7: ( ']' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "RULE_ESTRING_AS_DOUBLE"
    public final void mRULE_ESTRING_AS_DOUBLE() throws RecognitionException {
        try {
            int _type = RULE_ESTRING_AS_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2032:24: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )+ )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2032:26: ( '0' .. '9' )+ '.' ( '0' .. '9' )+
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2032:26: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2032:27: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            match('.'); 
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2032:42: ( '0' .. '9' )+
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
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2032:43: '0' .. '9'
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
    // $ANTLR end "RULE_ESTRING_AS_DOUBLE"

    // $ANTLR start "RULE_CAST_HEXA_VALUE_TO_DATETIME"
    public final void mRULE_CAST_HEXA_VALUE_TO_DATETIME() throws RecognitionException {
        try {
            int _type = RULE_CAST_HEXA_VALUE_TO_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:34: ( 'CAST(' '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ' ' )* 'AS' ( ' ' )* 'DateTime)' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:36: 'CAST(' '0' ( 'x' | 'X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+ ( ' ' )* 'AS' ( ' ' )* 'DateTime)'
            {
            match("CAST("); 

            match('0'); 
            if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:58: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='A') ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==' '||(LA3_2>='0' && LA3_2<='9')||(LA3_2>='A' && LA3_2<='F')||(LA3_2>='a' && LA3_2<='f')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='B' && LA3_0<='F')||(LA3_0>='a' && LA3_0<='f')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:88: ( ' ' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:88: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            match("AS"); 

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:98: ( ' ' )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2034:98: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match("DateTime)"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CAST_HEXA_VALUE_TO_DATETIME"

    // $ANTLR start "RULE_N_ESTRING"
    public final void mRULE_N_ESTRING() throws RecognitionException {
        try {
            int _type = RULE_N_ESTRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2036:16: ( 'N' RULE_STRING )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2036:18: 'N' RULE_STRING
            {
            match('N'); 
            mRULE_STRING(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_N_ESTRING"

    // $ANTLR start "RULE_N_SPEC_CHAR"
    public final void mRULE_N_SPEC_CHAR() throws RecognitionException {
        try {
            int _type = RULE_N_SPEC_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:18: ( ( 'N\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\\'' | '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\"' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:20: ( 'N\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\\'' | '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\"' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:20: ( 'N\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\\'' | '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\"' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='N') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\"') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:21: 'N\\'' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\\''
                    {
                    match("N'"); 

                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='-'||(LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='Z')||LA6_0=='\\'||(LA6_0>='a' && LA6_0<='z')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:
                    	    {
                    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


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

                    match('\''); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:71: '\"' ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+ '\"'
                    {
                    match('\"'); 
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2038:75: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '\\\\' )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='\\'||(LA7_0>='a' && LA7_0<='z')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:
                    	    {
                    	    if ( input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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

                    match('\"'); 

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
    // $ANTLR end "RULE_N_SPEC_CHAR"

    // $ANTLR start "RULE_OTHER_COMMAND"
    public final void mRULE_OTHER_COMMAND() throws RecognitionException {
        try {
            int _type = RULE_OTHER_COMMAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:20: ( ( ( 'USE' | 'SET' | 'CREATE' | 'ALTER' ) ( options {greedy=false; } : . )* 'GO' | 'GO' | ( 'print' ( ' ' )* RULE_STRING )* ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:22: ( ( 'USE' | 'SET' | 'CREATE' | 'ALTER' ) ( options {greedy=false; } : . )* 'GO' | 'GO' | ( 'print' ( ' ' )* RULE_STRING )* )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:22: ( ( 'USE' | 'SET' | 'CREATE' | 'ALTER' ) ( options {greedy=false; } : . )* 'GO' | 'GO' | ( 'print' ( ' ' )* RULE_STRING )* )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 'A':
            case 'C':
            case 'S':
            case 'U':
                {
                alt13=1;
                }
                break;
            case 'G':
                {
                alt13=2;
                }
                break;
            default:
                alt13=3;}

            switch (alt13) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:23: ( 'USE' | 'SET' | 'CREATE' | 'ALTER' ) ( options {greedy=false; } : . )* 'GO'
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:23: ( 'USE' | 'SET' | 'CREATE' | 'ALTER' )
                    int alt9=4;
                    switch ( input.LA(1) ) {
                    case 'U':
                        {
                        alt9=1;
                        }
                        break;
                    case 'S':
                        {
                        alt9=2;
                        }
                        break;
                    case 'C':
                        {
                        alt9=3;
                        }
                        break;
                    case 'A':
                        {
                        alt9=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:24: 'USE'
                            {
                            match("USE"); 


                            }
                            break;
                        case 2 :
                            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:30: 'SET'
                            {
                            match("SET"); 


                            }
                            break;
                        case 3 :
                            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:36: 'CREATE'
                            {
                            match("CREATE"); 


                            }
                            break;
                        case 4 :
                            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:45: 'ALTER'
                            {
                            match("ALTER"); 


                            }
                            break;

                    }

                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:54: ( options {greedy=false; } : . )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='G') ) {
                            int LA10_1 = input.LA(2);

                            if ( (LA10_1=='O') ) {
                                alt10=2;
                            }
                            else if ( ((LA10_1>='\u0000' && LA10_1<='N')||(LA10_1>='P' && LA10_1<='\uFFFF')) ) {
                                alt10=1;
                            }


                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='F')||(LA10_0>='H' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:82: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match("GO"); 


                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:91: 'GO'
                    {
                    match("GO"); 


                    }
                    break;
                case 3 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:96: ( 'print' ( ' ' )* RULE_STRING )*
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:96: ( 'print' ( ' ' )* RULE_STRING )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='p') ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:97: 'print' ( ' ' )* RULE_STRING
                    	    {
                    	    match("print"); 

                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:105: ( ' ' )*
                    	    loop11:
                    	    do {
                    	        int alt11=2;
                    	        int LA11_0 = input.LA(1);

                    	        if ( (LA11_0==' ') ) {
                    	            alt11=1;
                    	        }


                    	        switch (alt11) {
                    	    	case 1 :
                    	    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2040:105: ' '
                    	    	    {
                    	    	    match(' '); 

                    	    	    }
                    	    	    break;

                    	    	default :
                    	    	    break loop11;
                    	        }
                    	    } while (true);

                    	    mRULE_STRING(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
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
    // $ANTLR end "RULE_OTHER_COMMAND"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2042:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2042:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2042:11: ( '^' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='^') ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2042:11: '^'
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

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2042:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:
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
            	    break loop15;
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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2044:10: ( ( '0' .. '9' )+ )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2044:12: ( '0' .. '9' )+
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2044:12: ( '0' .. '9' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2044:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='!')||(LA17_0>='#' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop18:
                    do {
                        int alt18=3;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0=='\\') ) {
                            alt18=1;
                        }
                        else if ( ((LA18_0>='\u0000' && LA18_0<='&')||(LA18_0>='(' && LA18_0<='[')||(LA18_0>=']' && LA18_0<='\uFFFF')) ) {
                            alt18=2;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2046:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop18;
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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2048:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2048:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2048:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2048:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:41: ( '\\r' )? '\\n'
                    {
                    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2050:41: '\\r'
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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2052:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2052:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2052:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2054:16: ( . )
            // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:2054:18: .
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
        // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ESTRING_AS_DOUBLE | RULE_CAST_HEXA_VALUE_TO_DATETIME | RULE_N_ESTRING | RULE_N_SPEC_CHAR | RULE_OTHER_COMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=22;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:70: RULE_ESTRING_AS_DOUBLE
                {
                mRULE_ESTRING_AS_DOUBLE(); 

                }
                break;
            case 12 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:93: RULE_CAST_HEXA_VALUE_TO_DATETIME
                {
                mRULE_CAST_HEXA_VALUE_TO_DATETIME(); 

                }
                break;
            case 13 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:126: RULE_N_ESTRING
                {
                mRULE_N_ESTRING(); 

                }
                break;
            case 14 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:141: RULE_N_SPEC_CHAR
                {
                mRULE_N_SPEC_CHAR(); 

                }
                break;
            case 15 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:158: RULE_OTHER_COMMAND
                {
                mRULE_OTHER_COMMAND(); 

                }
                break;
            case 16 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:177: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 17 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:185: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 18 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:194: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 19 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:206: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 20 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:222: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 21 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:238: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 22 :
                // ../eu.artist.migration.mdt.database.sql.editor.ui/src-gen/eu/artist/migration/mdt/database/sql/editor/ui/contentassist/antlr/internal/InternalSQLDSL.g:1:246: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\1\23\1\32\2\36\3\uffff\1\36\3\uffff\1\52\1\36\1\31\5\36\1\uffff"+
        "\1\31\1\uffff\2\31\4\uffff\1\36\3\uffff\1\36\3\uffff\1\36\4\uffff"+
        "\1\52\1\uffff\2\36\3\uffff\3\36\1\23\1\36\2\uffff\1\36\2\uffff\4"+
        "\36\1\100\3\uffff\4\36\1\122\1\100\2\uffff\10\36\1\uffff\2\36\1"+
        "\uffff\1\36\1\23\2\36\1\135\1\136\1\36\2\uffff";
    static final String DFA25_eofS =
        "\137\uffff";
    static final String DFA25_minS =
        "\1\0\1\11\1\42\1\116\3\uffff\1\101\3\uffff\1\56\1\101\1\0\1\123"+
        "\1\105\1\114\1\117\1\162\1\uffff\1\101\1\uffff\1\0\1\52\4\uffff"+
        "\1\114\1\0\2\uffff\1\123\3\uffff\1\114\4\uffff\1\56\1\uffff\1\123"+
        "\1\105\1\42\1\0\1\uffff\1\105\2\124\1\60\1\151\2\uffff\1\114\1\42"+
        "\1\0\1\105\1\125\1\124\1\101\2\0\2\uffff\2\0\1\105\1\156\1\60\2"+
        "\0\1\uffff\1\122\1\105\1\50\1\124\2\0\1\122\1\164\1\uffff\1\124"+
        "\1\123\1\uffff\1\105\1\60\1\0\1\40\2\60\1\0\2\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\40\1\125\1\116\3\uffff\1\101\3\uffff\1\71\1\122\1\uffff"+
        "\1\123\1\105\1\114\1\117\1\162\1\uffff\1\172\1\uffff\1\uffff\1\57"+
        "\4\uffff\1\114\1\uffff\2\uffff\1\123\3\uffff\1\114\4\uffff\1\71"+
        "\1\uffff\1\123\1\105\1\172\1\uffff\1\uffff\1\105\2\124\1\172\1\151"+
        "\2\uffff\1\114\1\172\1\uffff\1\105\1\125\1\124\1\101\2\uffff\2\uffff"+
        "\2\uffff\1\105\1\156\1\172\2\uffff\1\uffff\1\122\1\105\1\50\1\124"+
        "\2\uffff\1\122\1\164\1\uffff\1\124\1\123\1\uffff\1\105\1\172\1\uffff"+
        "\1\47\2\172\1\uffff\2\uffff";
    static final String DFA25_acceptS =
        "\4\uffff\1\4\1\5\1\6\1\uffff\1\10\1\11\1\12\10\uffff\1\17\1\uffff"+
        "\1\20\2\uffff\1\25\1\26\1\1\1\25\2\uffff\1\20\1\15\1\uffff\1\4\1"+
        "\5\1\6\1\uffff\1\10\1\11\1\12\1\13\1\uffff\1\21\4\uffff\1\22\5\uffff"+
        "\1\23\1\24\11\uffff\2\16\7\uffff\1\15\10\uffff\1\2\2\uffff\1\14"+
        "\7\uffff\1\3\1\7";
    static final String DFA25_specialS =
        "\1\13\14\uffff\1\4\10\uffff\1\17\6\uffff\1\5\20\uffff\1\12\12\uffff"+
        "\1\2\4\uffff\1\14\1\15\2\uffff\1\1\1\0\3\uffff\1\11\1\3\5\uffff"+
        "\1\6\1\16\10\uffff\1\7\3\uffff\1\10\2\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\31\2\30\2\31\1\30\22\31\1\1\1\31\1\15\4\31\1\26\1\5\1\6"+
            "\2\31\1\10\1\31\1\4\1\27\12\13\7\31\1\20\1\25\1\14\3\25\1\21"+
            "\1\25\1\3\4\25\1\2\4\25\1\17\1\25\1\16\1\7\4\25\1\11\1\31\1"+
            "\12\1\24\1\25\1\31\17\25\1\22\12\25\uff85\31",
            "\2\33\2\uffff\1\33\22\uffff\1\33",
            "\1\37\4\uffff\1\35\55\uffff\1\34",
            "\1\40",
            "",
            "",
            "",
            "\1\44",
            "",
            "",
            "",
            "\1\50\1\uffff\12\51",
            "\1\53\20\uffff\1\54",
            "\55\57\1\56\2\57\12\56\7\57\32\56\1\57\1\55\4\57\32\56\uff85"+
            "\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "",
            "\32\36\4\uffff\1\36\1\uffff\32\36",
            "",
            "\0\57",
            "\1\65\4\uffff\1\66",
            "",
            "",
            "",
            "",
            "\1\67",
            "\55\37\1\71\2\37\12\71\7\37\32\71\1\37\1\70\4\37\32\71\uff85"+
            "\37",
            "",
            "",
            "\1\72",
            "",
            "",
            "",
            "\1\73",
            "",
            "",
            "",
            "",
            "\1\50\1\uffff\12\51",
            "",
            "\1\74",
            "\1\75",
            "\1\76\4\uffff\1\57\5\uffff\1\100\2\uffff\12\100\7\uffff\32"+
            "\100\1\uffff\1\77\4\uffff\1\100\1\77\3\100\1\77\7\100\1\77\3"+
            "\100\1\77\1\100\2\77\5\100",
            "\42\57\1\101\12\57\1\56\2\57\12\56\7\57\32\56\1\57\1\55\4"+
            "\57\32\56\uff85\57",
            "",
            "\1\102",
            "\1\103",
            "\1\104",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\37\4\uffff\1\107\5\uffff\1\100\2\uffff\12\100\7\uffff\32"+
            "\100\1\uffff\1\110\4\uffff\1\100\1\110\3\100\1\110\7\100\1\110"+
            "\3\100\1\110\1\100\2\110\5\100",
            "\47\37\1\111\5\37\1\71\2\37\12\71\7\37\32\71\1\37\1\70\4\37"+
            "\32\71\uff85\37",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\0\57",
            "\42\57\1\101\12\57\1\56\2\57\12\56\7\57\32\56\1\57\1\55\4"+
            "\57\32\56\uff85\57",
            "",
            "",
            "\60\23\12\117\7\23\6\117\1\116\23\117\4\23\1\117\1\23\32\117"+
            "\uff85\23",
            "\60\23\12\117\7\23\6\117\1\116\23\117\4\23\1\117\1\23\32\117"+
            "\uff85\23",
            "\1\120",
            "\1\121",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\0\37",
            "\47\37\1\111\5\37\1\71\2\37\12\71\7\37\32\71\1\37\1\70\4\37"+
            "\32\71\uff85\37",
            "",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\60\23\12\117\7\23\6\117\1\116\7\117\1\127\13\117\4\23\1\117"+
            "\1\23\32\117\uff85\23",
            "\60\23\12\117\7\23\6\117\1\116\23\117\4\23\1\117\1\23\32\117"+
            "\uff85\23",
            "\1\130",
            "\1\131",
            "",
            "\1\132",
            "\1\133",
            "",
            "\1\134",
            "\12\117\7\uffff\6\117\1\116\23\117\4\uffff\1\117\1\uffff\32"+
            "\117",
            "\60\23\12\117\7\23\6\117\1\116\23\117\4\23\1\117\1\23\32\117"+
            "\uff85\23",
            "\1\23\1\uffff\1\23\4\uffff\1\23",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\12\36\7\uffff\32\36\4\uffff\1\36\1\uffff\32\36",
            "\60\23\12\117\7\23\6\117\1\116\23\117\4\23\1\117\1\23\32\117"+
            "\uff85\23",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | RULE_ESTRING_AS_DOUBLE | RULE_CAST_HEXA_VALUE_TO_DATETIME | RULE_N_ESTRING | RULE_N_SPEC_CHAR | RULE_OTHER_COMMAND | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_67 = input.LA(1);

                        s = -1;
                        if ( (LA25_67=='G') ) {s = 78;}

                        else if ( ((LA25_67>='0' && LA25_67<='9')||(LA25_67>='A' && LA25_67<='F')||(LA25_67>='H' && LA25_67<='Z')||LA25_67=='_'||(LA25_67>='a' && LA25_67<='z')) ) {s = 79;}

                        else if ( ((LA25_67>='\u0000' && LA25_67<='/')||(LA25_67>=':' && LA25_67<='@')||(LA25_67>='[' && LA25_67<='^')||LA25_67=='`'||(LA25_67>='{' && LA25_67<='\uFFFF')) ) {s = 19;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_66 = input.LA(1);

                        s = -1;
                        if ( (LA25_66=='G') ) {s = 78;}

                        else if ( ((LA25_66>='\u0000' && LA25_66<='/')||(LA25_66>=':' && LA25_66<='@')||(LA25_66>='[' && LA25_66<='^')||LA25_66=='`'||(LA25_66>='{' && LA25_66<='\uFFFF')) ) {s = 19;}

                        else if ( ((LA25_66>='0' && LA25_66<='9')||(LA25_66>='A' && LA25_66<='F')||(LA25_66>='H' && LA25_66<='Z')||LA25_66=='_'||(LA25_66>='a' && LA25_66<='z')) ) {s = 79;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA25_57 = input.LA(1);

                        s = -1;
                        if ( (LA25_57=='\'') ) {s = 73;}

                        else if ( (LA25_57=='\\') ) {s = 56;}

                        else if ( (LA25_57=='-'||(LA25_57>='0' && LA25_57<='9')||(LA25_57>='A' && LA25_57<='Z')||(LA25_57>='a' && LA25_57<='z')) ) {s = 57;}

                        else if ( ((LA25_57>='\u0000' && LA25_57<='&')||(LA25_57>='(' && LA25_57<=',')||(LA25_57>='.' && LA25_57<='/')||(LA25_57>=':' && LA25_57<='@')||LA25_57=='['||(LA25_57>=']' && LA25_57<='`')||(LA25_57>='{' && LA25_57<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA25_72 = input.LA(1);

                        s = -1;
                        if ( (LA25_72=='\'') ) {s = 73;}

                        else if ( (LA25_72=='\\') ) {s = 56;}

                        else if ( (LA25_72=='-'||(LA25_72>='0' && LA25_72<='9')||(LA25_72>='A' && LA25_72<='Z')||(LA25_72>='a' && LA25_72<='z')) ) {s = 57;}

                        else if ( ((LA25_72>='\u0000' && LA25_72<='&')||(LA25_72>='(' && LA25_72<=',')||(LA25_72>='.' && LA25_72<='/')||(LA25_72>=':' && LA25_72<='@')||LA25_72=='['||(LA25_72>=']' && LA25_72<='`')||(LA25_72>='{' && LA25_72<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA25_13 = input.LA(1);

                        s = -1;
                        if ( (LA25_13=='\\') ) {s = 45;}

                        else if ( (LA25_13=='-'||(LA25_13>='0' && LA25_13<='9')||(LA25_13>='A' && LA25_13<='Z')||(LA25_13>='a' && LA25_13<='z')) ) {s = 46;}

                        else if ( ((LA25_13>='\u0000' && LA25_13<=',')||(LA25_13>='.' && LA25_13<='/')||(LA25_13>=':' && LA25_13<='@')||LA25_13=='['||(LA25_13>=']' && LA25_13<='`')||(LA25_13>='{' && LA25_13<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA25_29 = input.LA(1);

                        s = -1;
                        if ( (LA25_29=='\\') ) {s = 56;}

                        else if ( (LA25_29=='-'||(LA25_29>='0' && LA25_29<='9')||(LA25_29>='A' && LA25_29<='Z')||(LA25_29>='a' && LA25_29<='z')) ) {s = 57;}

                        else if ( ((LA25_29>='\u0000' && LA25_29<=',')||(LA25_29>='.' && LA25_29<='/')||(LA25_29>=':' && LA25_29<='@')||LA25_29=='['||(LA25_29>=']' && LA25_29<='`')||(LA25_29>='{' && LA25_29<='\uFFFF')) ) {s = 31;}

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA25_78 = input.LA(1);

                        s = -1;
                        if ( (LA25_78=='O') ) {s = 87;}

                        else if ( (LA25_78=='G') ) {s = 78;}

                        else if ( ((LA25_78>='0' && LA25_78<='9')||(LA25_78>='A' && LA25_78<='F')||(LA25_78>='H' && LA25_78<='N')||(LA25_78>='P' && LA25_78<='Z')||LA25_78=='_'||(LA25_78>='a' && LA25_78<='z')) ) {s = 79;}

                        else if ( ((LA25_78>='\u0000' && LA25_78<='/')||(LA25_78>=':' && LA25_78<='@')||(LA25_78>='[' && LA25_78<='^')||LA25_78=='`'||(LA25_78>='{' && LA25_78<='\uFFFF')) ) {s = 19;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA25_88 = input.LA(1);

                        s = -1;
                        if ( (LA25_88=='G') ) {s = 78;}

                        else if ( ((LA25_88>='0' && LA25_88<='9')||(LA25_88>='A' && LA25_88<='F')||(LA25_88>='H' && LA25_88<='Z')||LA25_88=='_'||(LA25_88>='a' && LA25_88<='z')) ) {s = 79;}

                        else if ( ((LA25_88>='\u0000' && LA25_88<='/')||(LA25_88>=':' && LA25_88<='@')||(LA25_88>='[' && LA25_88<='^')||LA25_88=='`'||(LA25_88>='{' && LA25_88<='\uFFFF')) ) {s = 19;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA25_92 = input.LA(1);

                        s = -1;
                        if ( (LA25_92=='G') ) {s = 78;}

                        else if ( ((LA25_92>='\u0000' && LA25_92<='/')||(LA25_92>=':' && LA25_92<='@')||(LA25_92>='[' && LA25_92<='^')||LA25_92=='`'||(LA25_92>='{' && LA25_92<='\uFFFF')) ) {s = 19;}

                        else if ( ((LA25_92>='0' && LA25_92<='9')||(LA25_92>='A' && LA25_92<='F')||(LA25_92>='H' && LA25_92<='Z')||LA25_92=='_'||(LA25_92>='a' && LA25_92<='z')) ) {s = 79;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA25_71 = input.LA(1);

                        s = -1;
                        if ( ((LA25_71>='\u0000' && LA25_71<='\uFFFF')) ) {s = 31;}

                        else s = 64;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA25_46 = input.LA(1);

                        s = -1;
                        if ( (LA25_46=='\"') ) {s = 65;}

                        else if ( (LA25_46=='\\') ) {s = 45;}

                        else if ( (LA25_46=='-'||(LA25_46>='0' && LA25_46<='9')||(LA25_46>='A' && LA25_46<='Z')||(LA25_46>='a' && LA25_46<='z')) ) {s = 46;}

                        else if ( ((LA25_46>='\u0000' && LA25_46<='!')||(LA25_46>='#' && LA25_46<=',')||(LA25_46>='.' && LA25_46<='/')||(LA25_46>=':' && LA25_46<='@')||LA25_46=='['||(LA25_46>=']' && LA25_46<='`')||(LA25_46>='{' && LA25_46<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0==' ') ) {s = 1;}

                        else if ( (LA25_0=='N') ) {s = 2;}

                        else if ( (LA25_0=='I') ) {s = 3;}

                        else if ( (LA25_0=='.') ) {s = 4;}

                        else if ( (LA25_0=='(') ) {s = 5;}

                        else if ( (LA25_0==')') ) {s = 6;}

                        else if ( (LA25_0=='V') ) {s = 7;}

                        else if ( (LA25_0==',') ) {s = 8;}

                        else if ( (LA25_0=='[') ) {s = 9;}

                        else if ( (LA25_0==']') ) {s = 10;}

                        else if ( ((LA25_0>='0' && LA25_0<='9')) ) {s = 11;}

                        else if ( (LA25_0=='C') ) {s = 12;}

                        else if ( (LA25_0=='\"') ) {s = 13;}

                        else if ( (LA25_0=='U') ) {s = 14;}

                        else if ( (LA25_0=='S') ) {s = 15;}

                        else if ( (LA25_0=='A') ) {s = 16;}

                        else if ( (LA25_0=='G') ) {s = 17;}

                        else if ( (LA25_0=='p') ) {s = 18;}

                        else if ( (LA25_0=='^') ) {s = 20;}

                        else if ( (LA25_0=='B'||(LA25_0>='D' && LA25_0<='F')||LA25_0=='H'||(LA25_0>='J' && LA25_0<='M')||(LA25_0>='O' && LA25_0<='R')||LA25_0=='T'||(LA25_0>='W' && LA25_0<='Z')||LA25_0=='_'||(LA25_0>='a' && LA25_0<='o')||(LA25_0>='q' && LA25_0<='z')) ) {s = 21;}

                        else if ( (LA25_0=='\'') ) {s = 22;}

                        else if ( (LA25_0=='/') ) {s = 23;}

                        else if ( ((LA25_0>='\t' && LA25_0<='\n')||LA25_0=='\r') ) {s = 24;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='!'||(LA25_0>='#' && LA25_0<='&')||(LA25_0>='*' && LA25_0<='+')||LA25_0=='-'||(LA25_0>=':' && LA25_0<='@')||LA25_0=='\\'||LA25_0=='`'||(LA25_0>='{' && LA25_0<='\uFFFF')) ) {s = 25;}

                        else s = 19;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA25_62 = input.LA(1);

                        s = -1;
                        if ( ((LA25_62>='\u0000' && LA25_62<='\uFFFF')) ) {s = 47;}

                        else s = 64;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA25_63 = input.LA(1);

                        s = -1;
                        if ( (LA25_63=='\"') ) {s = 65;}

                        else if ( (LA25_63=='\\') ) {s = 45;}

                        else if ( (LA25_63=='-'||(LA25_63>='0' && LA25_63<='9')||(LA25_63>='A' && LA25_63<='Z')||(LA25_63>='a' && LA25_63<='z')) ) {s = 46;}

                        else if ( ((LA25_63>='\u0000' && LA25_63<='!')||(LA25_63>='#' && LA25_63<=',')||(LA25_63>='.' && LA25_63<='/')||(LA25_63>=':' && LA25_63<='@')||LA25_63=='['||(LA25_63>=']' && LA25_63<='`')||(LA25_63>='{' && LA25_63<='\uFFFF')) ) {s = 47;}

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA25_79 = input.LA(1);

                        s = -1;
                        if ( (LA25_79=='G') ) {s = 78;}

                        else if ( ((LA25_79>='0' && LA25_79<='9')||(LA25_79>='A' && LA25_79<='F')||(LA25_79>='H' && LA25_79<='Z')||LA25_79=='_'||(LA25_79>='a' && LA25_79<='z')) ) {s = 79;}

                        else if ( ((LA25_79>='\u0000' && LA25_79<='/')||(LA25_79>=':' && LA25_79<='@')||(LA25_79>='[' && LA25_79<='^')||LA25_79=='`'||(LA25_79>='{' && LA25_79<='\uFFFF')) ) {s = 19;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA25_22 = input.LA(1);

                        s = -1;
                        if ( ((LA25_22>='\u0000' && LA25_22<='\uFFFF')) ) {s = 47;}

                        else s = 25;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}