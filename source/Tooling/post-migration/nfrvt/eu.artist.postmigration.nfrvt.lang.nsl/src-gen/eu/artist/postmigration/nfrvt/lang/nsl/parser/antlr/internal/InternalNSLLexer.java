/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
package eu.artist.postmigration.nfrvt.lang.nsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalNSLLexer extends Lexer {
    public static final int T__68=68;
    public static final int RULE_ID=4;
    public static final int T__66=66;
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
    public static final int RULE_ANY_OTHER=15;
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
    public static final int T__16=16;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__18=18;
    public static final int T__53=53;
    public static final int T__17=17;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=8;
    public static final int T__50=50;
    public static final int RULE_SMALL_DECIMAL=10;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int RULE_EBIGDECIMAL=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=7;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=5;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_EBOOLEAN=6;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=9;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators

    public InternalNSLLexer() {;} 
    public InternalNSLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalNSLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:11:7: ( 'property-catalogue' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:11:9: 'property-catalogue'
            {
            match("property-catalogue"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:12:7: ( '{' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:12:9: '{'
            {
            match('{'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:13:7: ( '}' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:13:9: '}'
            {
            match('}'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:14:7: ( 'qualitative' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:14:9: 'qualitative'
            {
            match("qualitative"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:15:7: ( 'description' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:15:9: 'description'
            {
            match("description"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:16:7: ( ',' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:16:9: ','
            {
            match(','); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:17:7: ( 'direction' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:17:9: 'direction'
            {
            match("direction"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:18:7: ( 'properties' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:18:9: 'properties'
            {
            match("properties"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:19:7: ( '[' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:19:9: '['
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:20:7: ( ']' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:20:9: ']'
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

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:21:7: ( 'impacts' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:21:9: 'impacts'
            {
            match("impacts"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:22:7: ( 'quantitative' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:22:9: 'quantitative'
            {
            match("quantitative"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:23:7: ( 'type' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:23:9: 'type'
            {
            match("type"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:24:7: ( 'derived' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:24:9: 'derived'
            {
            match("derived"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:25:7: ( 'expression' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:25:9: 'expression'
            {
            match("expression"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:26:7: ( '(' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:26:9: '('
            {
            match('('); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:27:7: ( ')' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:27:9: ')'
            {
            match(')'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:28:7: ( '=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:28:9: '='
            {
            match('='); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:29:7: ( '*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:29:9: '*'
            {
            match('*'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:30:7: ( 'or' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:30:9: 'or'
            {
            match("or"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:31:7: ( '||' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:31:9: '||'
            {
            match("||"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:32:7: ( 'xor' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:32:9: 'xor'
            {
            match("xor"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:33:7: ( '^' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:33:9: '^'
            {
            match('^'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:34:7: ( 'and' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:34:9: 'and'
            {
            match("and"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:35:7: ( '&&' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:35:9: '&&'
            {
            match("&&"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:36:7: ( '=>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:36:9: '=>'
            {
            match("=>"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:37:7: ( '->' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:37:9: '->'
            {
            match("->"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:38:7: ( '==' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:38:9: '=='
            {
            match("=="); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:39:7: ( '!=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:39:9: '!='
            {
            match("!="); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:40:7: ( '<>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:40:9: '<>'
            {
            match("<>"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:41:7: ( '!' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:41:9: '!'
            {
            match('!'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:42:7: ( 'not' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:42:9: 'not'
            {
            match("not"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:43:7: ( '>' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:43:9: '>'
            {
            match('>'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:44:7: ( '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:44:9: '>='
            {
            match(">="); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:45:7: ( '<' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:45:9: '<'
            {
            match('<'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:46:7: ( '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:46:9: '<='
            {
            match("<="); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:47:7: ( '+' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:47:9: '+'
            {
            match('+'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:48:7: ( '-' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:48:9: '-'
            {
            match('-'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:49:7: ( '/' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:49:9: '/'
            {
            match('/'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:50:7: ( '%' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:50:9: '%'
            {
            match('%'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:51:7: ( 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:51:9: 'max'
            {
            match("max"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:52:7: ( 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:52:9: 'min'
            {
            match("min"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:53:7: ( 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:53:9: 'avg'
            {
            match("avg"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:54:7: ( 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:54:9: 'sum'
            {
            match("sum"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:55:7: ( 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:55:9: 'exp'
            {
            match("exp"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:56:7: ( 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:56:9: 'abs'
            {
            match("abs"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:57:7: ( 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:57:9: 'ln'
            {
            match("ln"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:58:7: ( 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:58:9: 'log'
            {
            match("log"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:59:7: ( '.' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:59:9: '.'
            {
            match('.'); 

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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:60:7: ( '.*' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:60:9: '.*'
            {
            match(".*"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:61:7: ( 'import' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:61:9: 'import'
            {
            match("import"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:62:7: ( 'increasing' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:62:9: 'increasing'
            {
            match("increasing"); 


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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:63:7: ( 'decreasing' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:63:9: 'decreasing'
            {
            match("decreasing"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "RULE_EBOOLEAN"
    public final void mRULE_EBOOLEAN() throws RecognitionException {
        try {
            int _type = RULE_EBOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4296:15: ( ( 'true' | 'false' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4296:17: ( 'true' | 'false' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4296:17: ( 'true' | 'false' )
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4296:18: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4296:25: 'false'
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4298:11: ( 'null' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4298:13: 'null'
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4300:10: ( ( '0' .. '9' )+ )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4300:12: ( '0' .. '9' )+
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4300:12: ( '0' .. '9' )+
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
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4300:13: '0' .. '9'
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:29: ( ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:31: ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:31: ( '1' ( '.' ( '0' )+ )? | '0' ( '.' ( '0' .. '9' )+ )? | '.' ( '0' .. '9' )+ )
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:32: '1' ( '.' ( '0' )+ )?
                    {
                    match('1'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:36: ( '.' ( '0' )+ )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='.') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:37: '.' ( '0' )+
                            {
                            match('.'); 
                            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:41: ( '0' )+
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
                            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:41: '0'
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:48: '0' ( '.' ( '0' .. '9' )+ )?
                    {
                    match('0'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:52: ( '.' ( '0' .. '9' )+ )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='.') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:53: '.' ( '0' .. '9' )+
                            {
                            match('.'); 
                            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:57: ( '0' .. '9' )+
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
                            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:58: '0' .. '9'
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:71: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:75: ( '0' .. '9' )+
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
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4302:76: '0' .. '9'
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4304:20: ( ( '+' | '-' )? RULE_POSITIVE_SMALL_DECIMAL )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4304:22: ( '+' | '-' )? RULE_POSITIVE_SMALL_DECIMAL
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4304:22: ( '+' | '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='+'||LA9_0=='-') ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:18: ( ( '+' | '-' )? ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:20: ( '+' | '-' )? ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:20: ( '+' | '-' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='+'||LA10_0=='-') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:
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

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:31: ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )
            int alt11=3;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:32: RULE_INT
                    {
                    mRULE_INT(); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:41: '.' RULE_INT
                    {
                    match('.'); 
                    mRULE_INT(); 

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4306:54: RULE_INT '.' RULE_INT
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )* )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )*
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:11: ( '^' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='^') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:16: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )
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
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:17: 'a' .. 'z'
                    {
                    matchRange('a','z'); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:26: 'A' .. 'Z'
                    {
                    matchRange('A','Z'); 

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:35: '_'
                    {
                    match('_'); 

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:39: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 5 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:43: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 6 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:47: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 7 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:51: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 8 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:55: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 9 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:59: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 10 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:63: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 11 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:67: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 12 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:71: '='
                    {
                    match('='); 

                    }
                    break;
                case 13 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:75: '\\u00C2\\u00A7'
                    {
                    match("\u00C2\u00A7"); 


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )*
            loop14:
            do {
                int alt14=15;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:92: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); 

            	    }
            	    break;
            	case 2 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:101: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); 

            	    }
            	    break;
            	case 3 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:110: '_'
            	    {
            	    match('_'); 

            	    }
            	    break;
            	case 4 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:114: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;
            	case 5 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:123: '+'
            	    {
            	    match('+'); 

            	    }
            	    break;
            	case 6 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:127: '-'
            	    {
            	    match('-'); 

            	    }
            	    break;
            	case 7 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:131: '%'
            	    {
            	    match('%'); 

            	    }
            	    break;
            	case 8 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:135: '*'
            	    {
            	    match('*'); 

            	    }
            	    break;
            	case 9 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:139: '/'
            	    {
            	    match('/'); 

            	    }
            	    break;
            	case 10 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:143: '#'
            	    {
            	    match('#'); 

            	    }
            	    break;
            	case 11 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:147: '>'
            	    {
            	    match('>'); 

            	    }
            	    break;
            	case 12 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:151: '<'
            	    {
            	    match('<'); 

            	    }
            	    break;
            	case 13 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:155: '='
            	    {
            	    match('='); 

            	    }
            	    break;
            	case 14 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4308:159: '\\u00C2\\u00A7'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\"') ) {
                alt17=1;
            }
            else if ( (LA17_0=='\'') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:66: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop16:
                    do {
                        int alt16=3;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0=='\\') ) {
                            alt16=1;
                        }
                        else if ( ((LA16_0>='\u0000' && LA16_0<='&')||(LA16_0>='(' && LA16_0<='[')||(LA16_0>=']' && LA16_0<='\uFFFF')) ) {
                            alt16=2;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4310:137: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop16;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4312:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4312:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4312:24: ( options {greedy=false; } : . )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0=='*') ) {
                    int LA18_1 = input.LA(2);

                    if ( (LA18_1=='/') ) {
                        alt18=2;
                    }
                    else if ( ((LA18_1>='\u0000' && LA18_1<='.')||(LA18_1>='0' && LA18_1<='\uFFFF')) ) {
                        alt18=1;
                    }


                }
                else if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4312:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop18;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='\u0000' && LA19_0<='\t')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\uFFFF')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop19;
                }
            } while (true);

            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:40: ( ( '\\r' )? '\\n' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='\n'||LA21_0=='\r') ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:41: ( '\\r' )? '\\n'
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:41: ( '\\r' )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0=='\r') ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4314:41: '\\r'
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4316:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4316:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4316:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>='\t' && LA22_0<='\n')||LA22_0=='\r'||LA22_0==' ') ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:
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
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4318:16: ( . )
            // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:4318:18: .
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
        // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_EBOOLEAN | RULE_NULL | RULE_INT | RULE_POSITIVE_SMALL_DECIMAL | RULE_SMALL_DECIMAL | RULE_EBIGDECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt23=65;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:328: RULE_EBOOLEAN
                {
                mRULE_EBOOLEAN(); 

                }
                break;
            case 55 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:342: RULE_NULL
                {
                mRULE_NULL(); 

                }
                break;
            case 56 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:352: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 57 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:361: RULE_POSITIVE_SMALL_DECIMAL
                {
                mRULE_POSITIVE_SMALL_DECIMAL(); 

                }
                break;
            case 58 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:389: RULE_SMALL_DECIMAL
                {
                mRULE_SMALL_DECIMAL(); 

                }
                break;
            case 59 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:408: RULE_EBIGDECIMAL
                {
                mRULE_EBIGDECIMAL(); 

                }
                break;
            case 60 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:425: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 61 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:433: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 62 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:445: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 63 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:461: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 64 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:477: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 65 :
                // ../eu.artist.postmigration.nfrvt.lang.nsl/src-gen/eu/artist/postmigration/nfrvt/lang/nsl/parser/antlr/internal/InternalNSL.g:1:485: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA23 dfa23 = new DFA23(this);
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
            return "4306:31: ( RULE_INT | '.' RULE_INT | RULE_INT '.' RULE_INT )";
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
            return "()* loopback of 4308:91: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' | '+' | '-' | '%' | '*' | '/' | '#' | '>' | '<' | '=' | '\\u00C2\\u00A7' )*";
        }
    }
    static final String DFA23_eotS =
        "\1\uffff\1\60\2\uffff\2\60\3\uffff\3\60\2\uffff\1\102\1\103\1\60"+
        "\1\56\1\60\1\107\1\60\1\56\1\115\1\123\1\126\1\60\1\132\1\133\1"+
        "\136\1\137\3\60\1\146\1\60\3\151\4\uffff\3\56\2\uffff\1\60\3\uffff"+
        "\3\60\3\uffff\5\60\2\uffff\1\173\1\174\2\uffff\1\175\1\uffff\1\60"+
        "\1\uffff\3\60\1\uffff\1\u0082\1\uffff\2\u0083\1\155\3\uffff\1\u0087"+
        "\1\u0088\1\uffff\2\60\1\u008b\2\uffff\2\60\2\uffff\3\60\1\u00ad"+
        "\1\60\2\uffff\1\u00af\1\60\1\uffff\1\151\5\uffff\12\60\1\u00c0\3"+
        "\uffff\1\u00c1\1\u00c2\1\u00c3\1\u00c4\4\uffff\1\u0083\2\uffff\1"+
        "\u00c7\1\60\1\uffff\15\60\2\uffff\1\60\1\uffff\14\60\1\u009c\1\u00cc"+
        "\1\u00cd\1\u00ce\1\uffff\1\u00cf\1\uffff\1\60\2\u00af\12\60\1\u00db"+
        "\1\u00dc\1\60\5\uffff\2\u0083\1\uffff\1\u00de\3\60\4\uffff\13\60"+
        "\2\uffff\1\60\1\uffff\1\u00dc\10\60\1\u00f3\6\60\1\u00fb\2\60\1"+
        "\u00fe\1\uffff\7\60\1\uffff\2\60\1\uffff\10\60\1\u0110\3\60\1\u0114"+
        "\3\60\1\u0118\1\uffff\1\u0119\1\u011a\1\60\1\uffff\1\u011c\1\60"+
        "\1\u011e\3\uffff\1\60\1\uffff\1\u0120\1\uffff\1\60\1\uffff\4\60"+
        "\1\u0126\1\uffff";
    static final String DFA23_eofS =
        "\u0127\uffff";
    static final String DFA23_minS =
        "\1\0\1\162\2\uffff\1\165\1\145\3\uffff\1\155\1\162\1\170\2\uffff"+
        "\2\43\1\162\1\174\1\157\1\43\1\142\1\46\1\43\1\75\1\43\1\157\4\43"+
        "\1\141\1\165\1\156\1\52\1\141\3\56\4\uffff\1\u00a7\2\0\2\uffff\1"+
        "\157\3\uffff\1\141\1\143\1\162\3\uffff\1\160\1\143\1\160\1\165\1"+
        "\160\2\uffff\2\43\2\uffff\1\43\1\uffff\1\162\1\uffff\1\144\1\147"+
        "\1\163\1\uffff\1\43\1\uffff\3\43\1\60\2\uffff\2\43\1\uffff\1\164"+
        "\1\154\1\43\2\uffff\2\0\2\uffff\1\170\1\156\1\155\1\43\1\147\2\uffff"+
        "\1\60\1\154\1\uffff\1\56\2\60\3\uffff\1\160\1\154\1\143\1\151\1"+
        "\162\1\145\1\141\1\162\2\145\1\43\3\uffff\4\43\2\uffff\3\60\2\uffff"+
        "\1\43\1\154\1\uffff\16\0\1\uffff\1\0\1\uffff\14\0\1\u00a7\3\43\1"+
        "\uffff\1\43\1\uffff\1\163\2\60\1\145\1\151\1\164\1\162\1\166\1\145"+
        "\2\143\1\162\1\145\2\43\1\145\5\uffff\2\60\1\uffff\1\43\3\0\4\uffff"+
        "\1\145\1\162\1\164\2\151\1\145\1\141\3\164\1\141\2\uffff\1\163\1"+
        "\uffff\1\43\1\164\1\141\1\164\1\160\1\144\1\163\1\151\1\163\1\43"+
        "\2\163\1\151\1\164\1\141\1\164\1\43\1\151\1\157\1\43\1\uffff\2\151"+
        "\1\55\1\145\1\151\1\164\1\151\1\uffff\2\156\1\uffff\1\156\1\157"+
        "\1\143\1\163\1\166\1\151\1\157\1\147\1\43\1\147\1\156\1\141\1\43"+
        "\1\145\1\166\1\156\1\43\1\uffff\2\43\1\164\1\uffff\1\43\1\145\1"+
        "\43\3\uffff\1\141\1\uffff\1\43\1\uffff\1\154\1\uffff\1\157\1\147"+
        "\1\165\1\145\1\43\1\uffff";
    static final String DFA23_maxS =
        "\1\uffff\1\162\2\uffff\1\165\1\151\3\uffff\1\156\1\171\1\170\2"+
        "\uffff\2\u00c2\1\162\1\174\1\157\1\u00c2\1\166\1\46\1\u00c2\1\75"+
        "\1\u00c2\1\165\4\u00c2\1\151\1\165\1\157\1\71\1\141\3\71\4\uffff"+
        "\1\u00a7\2\uffff\2\uffff\1\157\3\uffff\1\141\1\163\1\162\3\uffff"+
        "\1\160\1\143\1\160\1\165\1\160\2\uffff\2\u00c2\2\uffff\1\u00c2\1"+
        "\uffff\1\162\1\uffff\1\144\1\147\1\163\1\uffff\1\u00c2\1\uffff\3"+
        "\u00c2\1\71\2\uffff\2\u00c2\1\uffff\1\164\1\154\1\u00c2\2\uffff"+
        "\2\uffff\2\uffff\1\170\1\156\1\155\1\u00c2\1\147\2\uffff\1\71\1"+
        "\154\1\uffff\3\71\3\uffff\1\160\1\156\1\143\1\151\1\162\1\145\1"+
        "\157\1\162\2\145\1\u00c2\3\uffff\4\u00c2\2\uffff\3\71\2\uffff\1"+
        "\u00c2\1\154\1\uffff\16\uffff\1\uffff\1\uffff\1\uffff\14\uffff\1"+
        "\u00a7\3\u00c2\1\uffff\1\u00c2\1\uffff\1\163\2\71\1\145\1\151\1"+
        "\164\1\162\1\166\1\145\2\143\1\162\1\145\2\u00c2\1\145\5\uffff\2"+
        "\71\1\uffff\1\u00c2\3\uffff\4\uffff\1\145\1\162\1\164\2\151\1\145"+
        "\1\141\3\164\1\141\2\uffff\1\163\1\uffff\1\u00c2\1\164\1\141\1\164"+
        "\1\160\1\144\1\163\1\151\1\163\1\u00c2\2\163\1\171\1\164\1\141\1"+
        "\164\1\u00c2\1\151\1\157\1\u00c2\1\uffff\2\151\1\55\1\145\1\151"+
        "\1\164\1\151\1\uffff\2\156\1\uffff\1\156\1\157\1\143\1\163\1\166"+
        "\1\151\1\157\1\147\1\u00c2\1\147\1\156\1\141\1\u00c2\1\145\1\166"+
        "\1\156\1\u00c2\1\uffff\2\u00c2\1\164\1\uffff\1\u00c2\1\145\1\u00c2"+
        "\3\uffff\1\141\1\uffff\1\u00c2\1\uffff\1\154\1\uffff\1\157\1\147"+
        "\1\165\1\145\1\u00c2\1\uffff";
    static final String DFA23_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\1\11\1\12\3\uffff\1\20\1\21\30\uffff"+
        "\4\74\3\uffff\1\100\1\101\1\uffff\1\74\1\2\1\3\3\uffff\1\6\1\11"+
        "\1\12\5\uffff\1\20\1\21\2\uffff\1\22\1\23\1\uffff\1\25\1\uffff\1"+
        "\27\3\uffff\1\31\1\uffff\1\46\4\uffff\1\35\1\37\2\uffff\1\43\3\uffff"+
        "\1\41\1\45\2\uffff\1\47\1\50\5\uffff\1\62\1\61\2\uffff\1\70\3\uffff"+
        "\1\73\1\75\1\100\13\uffff\1\32\1\34\1\24\4\uffff\1\33\1\72\3\uffff"+
        "\1\36\1\44\2\uffff\1\42\16\uffff\1\76\1\uffff\1\77\20\uffff\1\57"+
        "\1\uffff\1\71\20\uffff\1\55\1\26\1\30\1\53\1\56\2\uffff\1\40\4\uffff"+
        "\1\51\1\52\1\54\1\60\13\uffff\1\15\1\66\1\uffff\1\67\24\uffff\1"+
        "\63\7\uffff\1\16\2\uffff\1\13\21\uffff\1\7\3\uffff\1\10\3\uffff"+
        "\1\65\1\64\1\17\1\uffff\1\4\1\uffff\1\5\1\uffff\1\14\5\uffff\1\1";
    static final String DFA23_specialS =
        "\1\0\52\uffff\1\22\1\42\57\uffff\1\25\1\6\56\uffff\1\41\1\36\1"+
        "\35\1\40\1\37\1\33\1\32\1\1\1\34\1\30\1\31\1\26\1\27\1\21\1\uffff"+
        "\1\17\1\uffff\1\16\1\15\1\14\1\13\1\12\1\11\1\10\1\7\1\5\1\4\1\3"+
        "\1\2\40\uffff\1\23\1\24\1\20\133\uffff}>";
    static final String[] DFA23_transitionS = {
            "\11\56\2\55\2\56\1\55\22\56\1\55\1\27\1\53\1\51\1\56\1\35\1"+
            "\25\1\54\1\14\1\15\1\17\1\33\1\6\1\26\1\41\1\34\1\44\1\43\10"+
            "\45\2\56\1\30\1\16\1\32\2\56\32\47\1\7\1\56\1\10\1\23\1\50\1"+
            "\56\1\24\2\46\1\5\1\13\1\42\2\46\1\11\2\46\1\40\1\36\1\31\1"+
            "\20\1\1\1\4\1\46\1\37\1\12\3\46\1\22\2\46\1\2\1\21\1\3\104\56"+
            "\1\52\uff3d\56",
            "\1\57",
            "",
            "",
            "\1\63",
            "\1\64\3\uffff\1\65",
            "",
            "",
            "",
            "\1\71\1\72",
            "\1\74\6\uffff\1\73",
            "\1\75",
            "",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\1\60\1\101\1\100\2\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60\107\uffff\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\1\60"+
            "\14\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107"+
            "\uffff\1\60",
            "\1\112\13\uffff\1\110\7\uffff\1\111",
            "\1\113",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\121\1\60\1"+
            "\117\1\116\10\120\2\uffff\2\60\1\114\2\uffff\32\60\4\uffff\1"+
            "\60\1\uffff\32\60\107\uffff\1\60",
            "\1\122",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\1\60\1\125\1\124\2\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60\107\uffff\1\60",
            "\1\127\5\uffff\1\130",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\1\60\1\131\1\60\2\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60\107\uffff\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\121\1\60\1"+
            "\117\1\116\10\120\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1"+
            "\uffff\32\60\107\uffff\1\60",
            "\1\60\1\uffff\1\60\4\uffff\1\134\1\60\1\uffff\1\60\1\uffff"+
            "\1\135\12\60\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\32\60\107\uffff\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\140\7\uffff\1\141",
            "\1\142",
            "\1\143\1\144",
            "\1\145\5\uffff\12\147",
            "\1\150",
            "\1\153\1\uffff\12\152",
            "\1\154\1\uffff\12\152",
            "\1\155\1\uffff\12\152",
            "",
            "",
            "",
            "",
            "\1\60",
            "\0\156",
            "\0\156",
            "",
            "",
            "\1\160",
            "",
            "",
            "",
            "\1\161",
            "\1\164\16\uffff\1\163\1\162",
            "\1\165",
            "",
            "",
            "",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\u0084\1\60"+
            "\12\120\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60"+
            "\107\uffff\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\u0085\1\60"+
            "\12\120\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60"+
            "\107\uffff\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\1\60"+
            "\12\120\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60"+
            "\107\uffff\1\60",
            "\12\u0086",
            "",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\u0089",
            "\1\u008a",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u00ae",
            "",
            "",
            "\12\147",
            "\1\u00b0",
            "",
            "\1\155\1\uffff\12\152",
            "\1\u00b1\11\155",
            "\12\u00b2",
            "",
            "",
            "",
            "\1\u00b3",
            "\1\u00b4\1\uffff\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba\15\uffff\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\21\60\1\u00bf"+
            "\10\60\107\uffff\1\60",
            "",
            "",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "",
            "\1\u00c5\11\155",
            "\12\u00c6",
            "\12\u0086",
            "",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u00c8",
            "",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u00c9\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\u00a7\u009a\1\u00ca\uff58\u009a",
            "",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "\1\u00cb",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\u00d0",
            "\1\u00b1\11\155",
            "\12\u00b2",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u00dd",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c5\11\155",
            "\12\u00c6",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009a\1\u0095\1\u009a\1\u0092\4\u009a\1\u0093\1\u0090"+
            "\1\u009a\1\u0091\1\u009a\1\u0094\12\u008f\2\u009a\1\u0097\1"+
            "\u0098\1\u0096\2\u009a\32\u008d\4\u009a\1\u008e\1\u009a\32\u008c"+
            "\107\u009a\1\u0099\uff3d\u009a",
            "\43\u009c\1\u00a5\1\u009c\1\u00a2\4\u009c\1\u00a3\1\u00a0"+
            "\1\u009c\1\u00a1\1\u009c\1\u00a4\12\u009f\2\u009c\1\u00a7\1"+
            "\u00a8\1\u00a6\2\u009c\32\u009d\4\u009c\1\u009e\1\u009c\32\u009b"+
            "\107\u009c\1\u00a9\uff3d\u009c",
            "",
            "",
            "",
            "",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "\1\u00ea",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f7\17\uffff\1\u00f6",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u00fc",
            "\1\u00fd",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "",
            "\1\u0106",
            "\1\u0107",
            "",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u0115",
            "\1\u0116",
            "\1\u0117",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u011b",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "\1\u011d",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "",
            "",
            "\1\u011f",
            "",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            "",
            "\1\u0121",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\1\60\1\uffff\1\60\4\uffff\2\60\1\uffff\1\60\1\uffff\13\60"+
            "\2\uffff\3\60\2\uffff\32\60\4\uffff\1\60\1\uffff\32\60\107\uffff"+
            "\1\60",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | RULE_EBOOLEAN | RULE_NULL | RULE_INT | RULE_POSITIVE_SMALL_DECIMAL | RULE_SMALL_DECIMAL | RULE_EBIGDECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_0 = input.LA(1);

                        s = -1;
                        if ( (LA23_0=='p') ) {s = 1;}

                        else if ( (LA23_0=='{') ) {s = 2;}

                        else if ( (LA23_0=='}') ) {s = 3;}

                        else if ( (LA23_0=='q') ) {s = 4;}

                        else if ( (LA23_0=='d') ) {s = 5;}

                        else if ( (LA23_0==',') ) {s = 6;}

                        else if ( (LA23_0=='[') ) {s = 7;}

                        else if ( (LA23_0==']') ) {s = 8;}

                        else if ( (LA23_0=='i') ) {s = 9;}

                        else if ( (LA23_0=='t') ) {s = 10;}

                        else if ( (LA23_0=='e') ) {s = 11;}

                        else if ( (LA23_0=='(') ) {s = 12;}

                        else if ( (LA23_0==')') ) {s = 13;}

                        else if ( (LA23_0=='=') ) {s = 14;}

                        else if ( (LA23_0=='*') ) {s = 15;}

                        else if ( (LA23_0=='o') ) {s = 16;}

                        else if ( (LA23_0=='|') ) {s = 17;}

                        else if ( (LA23_0=='x') ) {s = 18;}

                        else if ( (LA23_0=='^') ) {s = 19;}

                        else if ( (LA23_0=='a') ) {s = 20;}

                        else if ( (LA23_0=='&') ) {s = 21;}

                        else if ( (LA23_0=='-') ) {s = 22;}

                        else if ( (LA23_0=='!') ) {s = 23;}

                        else if ( (LA23_0=='<') ) {s = 24;}

                        else if ( (LA23_0=='n') ) {s = 25;}

                        else if ( (LA23_0=='>') ) {s = 26;}

                        else if ( (LA23_0=='+') ) {s = 27;}

                        else if ( (LA23_0=='/') ) {s = 28;}

                        else if ( (LA23_0=='%') ) {s = 29;}

                        else if ( (LA23_0=='m') ) {s = 30;}

                        else if ( (LA23_0=='s') ) {s = 31;}

                        else if ( (LA23_0=='l') ) {s = 32;}

                        else if ( (LA23_0=='.') ) {s = 33;}

                        else if ( (LA23_0=='f') ) {s = 34;}

                        else if ( (LA23_0=='1') ) {s = 35;}

                        else if ( (LA23_0=='0') ) {s = 36;}

                        else if ( ((LA23_0>='2' && LA23_0<='9')) ) {s = 37;}

                        else if ( ((LA23_0>='b' && LA23_0<='c')||(LA23_0>='g' && LA23_0<='h')||(LA23_0>='j' && LA23_0<='k')||LA23_0=='r'||(LA23_0>='u' && LA23_0<='w')||(LA23_0>='y' && LA23_0<='z')) ) {s = 38;}

                        else if ( ((LA23_0>='A' && LA23_0<='Z')) ) {s = 39;}

                        else if ( (LA23_0=='_') ) {s = 40;}

                        else if ( (LA23_0=='#') ) {s = 41;}

                        else if ( (LA23_0=='\u00C2') ) {s = 42;}

                        else if ( (LA23_0=='\"') ) {s = 43;}

                        else if ( (LA23_0=='\'') ) {s = 44;}

                        else if ( ((LA23_0>='\t' && LA23_0<='\n')||LA23_0=='\r'||LA23_0==' ') ) {s = 45;}

                        else if ( ((LA23_0>='\u0000' && LA23_0<='\b')||(LA23_0>='\u000B' && LA23_0<='\f')||(LA23_0>='\u000E' && LA23_0<='\u001F')||LA23_0=='$'||(LA23_0>=':' && LA23_0<=';')||(LA23_0>='?' && LA23_0<='@')||LA23_0=='\\'||LA23_0=='`'||(LA23_0>='~' && LA23_0<='\u00C1')||(LA23_0>='\u00C3' && LA23_0<='\uFFFF')) ) {s = 46;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA23_147 = input.LA(1);

                        s = -1;
                        if ( (LA23_147=='/') ) {s = 201;}

                        else if ( ((LA23_147>='a' && LA23_147<='z')) ) {s = 140;}

                        else if ( ((LA23_147>='A' && LA23_147<='Z')) ) {s = 141;}

                        else if ( (LA23_147=='_') ) {s = 142;}

                        else if ( ((LA23_147>='0' && LA23_147<='9')) ) {s = 143;}

                        else if ( (LA23_147=='+') ) {s = 144;}

                        else if ( (LA23_147=='-') ) {s = 145;}

                        else if ( (LA23_147=='%') ) {s = 146;}

                        else if ( (LA23_147=='*') ) {s = 147;}

                        else if ( (LA23_147=='#') ) {s = 149;}

                        else if ( (LA23_147=='>') ) {s = 150;}

                        else if ( (LA23_147=='<') ) {s = 151;}

                        else if ( (LA23_147=='=') ) {s = 152;}

                        else if ( (LA23_147=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_147>='\u0000' && LA23_147<='\"')||LA23_147=='$'||(LA23_147>='&' && LA23_147<=')')||LA23_147==','||LA23_147=='.'||(LA23_147>=':' && LA23_147<=';')||(LA23_147>='?' && LA23_147<='@')||(LA23_147>='[' && LA23_147<='^')||LA23_147=='`'||(LA23_147>='{' && LA23_147<='\u00C1')||(LA23_147>='\u00C3' && LA23_147<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA23_168 = input.LA(1);

                        s = -1;
                        if ( ((LA23_168>='a' && LA23_168<='z')) ) {s = 155;}

                        else if ( ((LA23_168>='A' && LA23_168<='Z')) ) {s = 157;}

                        else if ( (LA23_168=='_') ) {s = 158;}

                        else if ( ((LA23_168>='0' && LA23_168<='9')) ) {s = 159;}

                        else if ( (LA23_168=='+') ) {s = 160;}

                        else if ( (LA23_168=='-') ) {s = 161;}

                        else if ( (LA23_168=='%') ) {s = 162;}

                        else if ( (LA23_168=='*') ) {s = 163;}

                        else if ( (LA23_168=='/') ) {s = 164;}

                        else if ( (LA23_168=='#') ) {s = 165;}

                        else if ( (LA23_168=='>') ) {s = 166;}

                        else if ( (LA23_168=='<') ) {s = 167;}

                        else if ( (LA23_168=='=') ) {s = 168;}

                        else if ( (LA23_168=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_168>='\u0000' && LA23_168<='\"')||LA23_168=='$'||(LA23_168>='&' && LA23_168<=')')||LA23_168==','||LA23_168=='.'||(LA23_168>=':' && LA23_168<=';')||(LA23_168>='?' && LA23_168<='@')||(LA23_168>='[' && LA23_168<='^')||LA23_168=='`'||(LA23_168>='{' && LA23_168<='\u00C1')||(LA23_168>='\u00C3' && LA23_168<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA23_167 = input.LA(1);

                        s = -1;
                        if ( ((LA23_167>='a' && LA23_167<='z')) ) {s = 155;}

                        else if ( ((LA23_167>='A' && LA23_167<='Z')) ) {s = 157;}

                        else if ( (LA23_167=='_') ) {s = 158;}

                        else if ( ((LA23_167>='0' && LA23_167<='9')) ) {s = 159;}

                        else if ( (LA23_167=='+') ) {s = 160;}

                        else if ( (LA23_167=='-') ) {s = 161;}

                        else if ( (LA23_167=='%') ) {s = 162;}

                        else if ( (LA23_167=='*') ) {s = 163;}

                        else if ( (LA23_167=='/') ) {s = 164;}

                        else if ( (LA23_167=='#') ) {s = 165;}

                        else if ( (LA23_167=='>') ) {s = 166;}

                        else if ( (LA23_167=='<') ) {s = 167;}

                        else if ( (LA23_167=='=') ) {s = 168;}

                        else if ( (LA23_167=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_167>='\u0000' && LA23_167<='\"')||LA23_167=='$'||(LA23_167>='&' && LA23_167<=')')||LA23_167==','||LA23_167=='.'||(LA23_167>=':' && LA23_167<=';')||(LA23_167>='?' && LA23_167<='@')||(LA23_167>='[' && LA23_167<='^')||LA23_167=='`'||(LA23_167>='{' && LA23_167<='\u00C1')||(LA23_167>='\u00C3' && LA23_167<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA23_166 = input.LA(1);

                        s = -1;
                        if ( ((LA23_166>='a' && LA23_166<='z')) ) {s = 155;}

                        else if ( ((LA23_166>='A' && LA23_166<='Z')) ) {s = 157;}

                        else if ( (LA23_166=='_') ) {s = 158;}

                        else if ( ((LA23_166>='0' && LA23_166<='9')) ) {s = 159;}

                        else if ( (LA23_166=='+') ) {s = 160;}

                        else if ( (LA23_166=='-') ) {s = 161;}

                        else if ( (LA23_166=='%') ) {s = 162;}

                        else if ( (LA23_166=='*') ) {s = 163;}

                        else if ( (LA23_166=='/') ) {s = 164;}

                        else if ( (LA23_166=='#') ) {s = 165;}

                        else if ( (LA23_166=='>') ) {s = 166;}

                        else if ( (LA23_166=='<') ) {s = 167;}

                        else if ( (LA23_166=='=') ) {s = 168;}

                        else if ( (LA23_166=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_166>='\u0000' && LA23_166<='\"')||LA23_166=='$'||(LA23_166>='&' && LA23_166<=')')||LA23_166==','||LA23_166=='.'||(LA23_166>=':' && LA23_166<=';')||(LA23_166>='?' && LA23_166<='@')||(LA23_166>='[' && LA23_166<='^')||LA23_166=='`'||(LA23_166>='{' && LA23_166<='\u00C1')||(LA23_166>='\u00C3' && LA23_166<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA23_165 = input.LA(1);

                        s = -1;
                        if ( ((LA23_165>='a' && LA23_165<='z')) ) {s = 155;}

                        else if ( ((LA23_165>='A' && LA23_165<='Z')) ) {s = 157;}

                        else if ( (LA23_165=='_') ) {s = 158;}

                        else if ( ((LA23_165>='0' && LA23_165<='9')) ) {s = 159;}

                        else if ( (LA23_165=='+') ) {s = 160;}

                        else if ( (LA23_165=='-') ) {s = 161;}

                        else if ( (LA23_165=='%') ) {s = 162;}

                        else if ( (LA23_165=='*') ) {s = 163;}

                        else if ( (LA23_165=='/') ) {s = 164;}

                        else if ( (LA23_165=='#') ) {s = 165;}

                        else if ( (LA23_165=='>') ) {s = 166;}

                        else if ( (LA23_165=='<') ) {s = 167;}

                        else if ( (LA23_165=='=') ) {s = 168;}

                        else if ( (LA23_165=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_165>='\u0000' && LA23_165<='\"')||LA23_165=='$'||(LA23_165>='&' && LA23_165<=')')||LA23_165==','||LA23_165=='.'||(LA23_165>=':' && LA23_165<=';')||(LA23_165>='?' && LA23_165<='@')||(LA23_165>='[' && LA23_165<='^')||LA23_165=='`'||(LA23_165>='{' && LA23_165<='\u00C1')||(LA23_165>='\u00C3' && LA23_165<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA23_93 = input.LA(1);

                        s = -1;
                        if ( ((LA23_93>='a' && LA23_93<='z')) ) {s = 155;}

                        else if ( ((LA23_93>='\u0000' && LA23_93<='\"')||LA23_93=='$'||(LA23_93>='&' && LA23_93<=')')||LA23_93==','||LA23_93=='.'||(LA23_93>=':' && LA23_93<=';')||(LA23_93>='?' && LA23_93<='@')||(LA23_93>='[' && LA23_93<='^')||LA23_93=='`'||(LA23_93>='{' && LA23_93<='\u00C1')||(LA23_93>='\u00C3' && LA23_93<='\uFFFF')) ) {s = 156;}

                        else if ( ((LA23_93>='A' && LA23_93<='Z')) ) {s = 157;}

                        else if ( (LA23_93=='_') ) {s = 158;}

                        else if ( ((LA23_93>='0' && LA23_93<='9')) ) {s = 159;}

                        else if ( (LA23_93=='+') ) {s = 160;}

                        else if ( (LA23_93=='-') ) {s = 161;}

                        else if ( (LA23_93=='%') ) {s = 162;}

                        else if ( (LA23_93=='*') ) {s = 163;}

                        else if ( (LA23_93=='/') ) {s = 164;}

                        else if ( (LA23_93=='#') ) {s = 165;}

                        else if ( (LA23_93=='>') ) {s = 166;}

                        else if ( (LA23_93=='<') ) {s = 167;}

                        else if ( (LA23_93=='=') ) {s = 168;}

                        else if ( (LA23_93=='\u00C2') ) {s = 169;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA23_164 = input.LA(1);

                        s = -1;
                        if ( ((LA23_164>='\u0000' && LA23_164<='\"')||LA23_164=='$'||(LA23_164>='&' && LA23_164<=')')||LA23_164==','||LA23_164=='.'||(LA23_164>=':' && LA23_164<=';')||(LA23_164>='?' && LA23_164<='@')||(LA23_164>='[' && LA23_164<='^')||LA23_164=='`'||(LA23_164>='{' && LA23_164<='\u00C1')||(LA23_164>='\u00C3' && LA23_164<='\uFFFF')) ) {s = 156;}

                        else if ( ((LA23_164>='a' && LA23_164<='z')) ) {s = 155;}

                        else if ( ((LA23_164>='A' && LA23_164<='Z')) ) {s = 157;}

                        else if ( (LA23_164=='_') ) {s = 158;}

                        else if ( ((LA23_164>='0' && LA23_164<='9')) ) {s = 159;}

                        else if ( (LA23_164=='+') ) {s = 160;}

                        else if ( (LA23_164=='-') ) {s = 161;}

                        else if ( (LA23_164=='%') ) {s = 162;}

                        else if ( (LA23_164=='*') ) {s = 163;}

                        else if ( (LA23_164=='/') ) {s = 164;}

                        else if ( (LA23_164=='#') ) {s = 165;}

                        else if ( (LA23_164=='>') ) {s = 166;}

                        else if ( (LA23_164=='<') ) {s = 167;}

                        else if ( (LA23_164=='=') ) {s = 168;}

                        else if ( (LA23_164=='\u00C2') ) {s = 169;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA23_163 = input.LA(1);

                        s = -1;
                        if ( ((LA23_163>='a' && LA23_163<='z')) ) {s = 155;}

                        else if ( ((LA23_163>='A' && LA23_163<='Z')) ) {s = 157;}

                        else if ( (LA23_163=='_') ) {s = 158;}

                        else if ( ((LA23_163>='0' && LA23_163<='9')) ) {s = 159;}

                        else if ( (LA23_163=='+') ) {s = 160;}

                        else if ( (LA23_163=='-') ) {s = 161;}

                        else if ( (LA23_163=='%') ) {s = 162;}

                        else if ( (LA23_163=='*') ) {s = 163;}

                        else if ( (LA23_163=='/') ) {s = 164;}

                        else if ( (LA23_163=='#') ) {s = 165;}

                        else if ( (LA23_163=='>') ) {s = 166;}

                        else if ( (LA23_163=='<') ) {s = 167;}

                        else if ( (LA23_163=='=') ) {s = 168;}

                        else if ( (LA23_163=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_163>='\u0000' && LA23_163<='\"')||LA23_163=='$'||(LA23_163>='&' && LA23_163<=')')||LA23_163==','||LA23_163=='.'||(LA23_163>=':' && LA23_163<=';')||(LA23_163>='?' && LA23_163<='@')||(LA23_163>='[' && LA23_163<='^')||LA23_163=='`'||(LA23_163>='{' && LA23_163<='\u00C1')||(LA23_163>='\u00C3' && LA23_163<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA23_162 = input.LA(1);

                        s = -1;
                        if ( ((LA23_162>='a' && LA23_162<='z')) ) {s = 155;}

                        else if ( ((LA23_162>='A' && LA23_162<='Z')) ) {s = 157;}

                        else if ( (LA23_162=='_') ) {s = 158;}

                        else if ( ((LA23_162>='0' && LA23_162<='9')) ) {s = 159;}

                        else if ( (LA23_162=='+') ) {s = 160;}

                        else if ( (LA23_162=='-') ) {s = 161;}

                        else if ( (LA23_162=='%') ) {s = 162;}

                        else if ( (LA23_162=='*') ) {s = 163;}

                        else if ( (LA23_162=='/') ) {s = 164;}

                        else if ( (LA23_162=='#') ) {s = 165;}

                        else if ( (LA23_162=='>') ) {s = 166;}

                        else if ( (LA23_162=='<') ) {s = 167;}

                        else if ( (LA23_162=='=') ) {s = 168;}

                        else if ( (LA23_162=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_162>='\u0000' && LA23_162<='\"')||LA23_162=='$'||(LA23_162>='&' && LA23_162<=')')||LA23_162==','||LA23_162=='.'||(LA23_162>=':' && LA23_162<=';')||(LA23_162>='?' && LA23_162<='@')||(LA23_162>='[' && LA23_162<='^')||LA23_162=='`'||(LA23_162>='{' && LA23_162<='\u00C1')||(LA23_162>='\u00C3' && LA23_162<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA23_161 = input.LA(1);

                        s = -1;
                        if ( ((LA23_161>='a' && LA23_161<='z')) ) {s = 155;}

                        else if ( ((LA23_161>='A' && LA23_161<='Z')) ) {s = 157;}

                        else if ( (LA23_161=='_') ) {s = 158;}

                        else if ( ((LA23_161>='0' && LA23_161<='9')) ) {s = 159;}

                        else if ( (LA23_161=='+') ) {s = 160;}

                        else if ( (LA23_161=='-') ) {s = 161;}

                        else if ( (LA23_161=='%') ) {s = 162;}

                        else if ( (LA23_161=='*') ) {s = 163;}

                        else if ( (LA23_161=='/') ) {s = 164;}

                        else if ( (LA23_161=='#') ) {s = 165;}

                        else if ( (LA23_161=='>') ) {s = 166;}

                        else if ( (LA23_161=='<') ) {s = 167;}

                        else if ( (LA23_161=='=') ) {s = 168;}

                        else if ( (LA23_161=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_161>='\u0000' && LA23_161<='\"')||LA23_161=='$'||(LA23_161>='&' && LA23_161<=')')||LA23_161==','||LA23_161=='.'||(LA23_161>=':' && LA23_161<=';')||(LA23_161>='?' && LA23_161<='@')||(LA23_161>='[' && LA23_161<='^')||LA23_161=='`'||(LA23_161>='{' && LA23_161<='\u00C1')||(LA23_161>='\u00C3' && LA23_161<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA23_160 = input.LA(1);

                        s = -1;
                        if ( ((LA23_160>='a' && LA23_160<='z')) ) {s = 155;}

                        else if ( ((LA23_160>='A' && LA23_160<='Z')) ) {s = 157;}

                        else if ( (LA23_160=='_') ) {s = 158;}

                        else if ( ((LA23_160>='0' && LA23_160<='9')) ) {s = 159;}

                        else if ( (LA23_160=='+') ) {s = 160;}

                        else if ( (LA23_160=='-') ) {s = 161;}

                        else if ( (LA23_160=='%') ) {s = 162;}

                        else if ( (LA23_160=='*') ) {s = 163;}

                        else if ( (LA23_160=='/') ) {s = 164;}

                        else if ( (LA23_160=='#') ) {s = 165;}

                        else if ( (LA23_160=='>') ) {s = 166;}

                        else if ( (LA23_160=='<') ) {s = 167;}

                        else if ( (LA23_160=='=') ) {s = 168;}

                        else if ( (LA23_160=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_160>='\u0000' && LA23_160<='\"')||LA23_160=='$'||(LA23_160>='&' && LA23_160<=')')||LA23_160==','||LA23_160=='.'||(LA23_160>=':' && LA23_160<=';')||(LA23_160>='?' && LA23_160<='@')||(LA23_160>='[' && LA23_160<='^')||LA23_160=='`'||(LA23_160>='{' && LA23_160<='\u00C1')||(LA23_160>='\u00C3' && LA23_160<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA23_159 = input.LA(1);

                        s = -1;
                        if ( ((LA23_159>='\u0000' && LA23_159<='\"')||LA23_159=='$'||(LA23_159>='&' && LA23_159<=')')||LA23_159==','||LA23_159=='.'||(LA23_159>=':' && LA23_159<=';')||(LA23_159>='?' && LA23_159<='@')||(LA23_159>='[' && LA23_159<='^')||LA23_159=='`'||(LA23_159>='{' && LA23_159<='\u00C1')||(LA23_159>='\u00C3' && LA23_159<='\uFFFF')) ) {s = 156;}

                        else if ( ((LA23_159>='a' && LA23_159<='z')) ) {s = 155;}

                        else if ( ((LA23_159>='A' && LA23_159<='Z')) ) {s = 157;}

                        else if ( (LA23_159=='_') ) {s = 158;}

                        else if ( ((LA23_159>='0' && LA23_159<='9')) ) {s = 159;}

                        else if ( (LA23_159=='+') ) {s = 160;}

                        else if ( (LA23_159=='-') ) {s = 161;}

                        else if ( (LA23_159=='%') ) {s = 162;}

                        else if ( (LA23_159=='*') ) {s = 163;}

                        else if ( (LA23_159=='/') ) {s = 164;}

                        else if ( (LA23_159=='#') ) {s = 165;}

                        else if ( (LA23_159=='>') ) {s = 166;}

                        else if ( (LA23_159=='<') ) {s = 167;}

                        else if ( (LA23_159=='=') ) {s = 168;}

                        else if ( (LA23_159=='\u00C2') ) {s = 169;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA23_158 = input.LA(1);

                        s = -1;
                        if ( ((LA23_158>='a' && LA23_158<='z')) ) {s = 155;}

                        else if ( ((LA23_158>='A' && LA23_158<='Z')) ) {s = 157;}

                        else if ( (LA23_158=='_') ) {s = 158;}

                        else if ( ((LA23_158>='0' && LA23_158<='9')) ) {s = 159;}

                        else if ( (LA23_158=='+') ) {s = 160;}

                        else if ( (LA23_158=='-') ) {s = 161;}

                        else if ( (LA23_158=='%') ) {s = 162;}

                        else if ( (LA23_158=='*') ) {s = 163;}

                        else if ( (LA23_158=='/') ) {s = 164;}

                        else if ( (LA23_158=='#') ) {s = 165;}

                        else if ( (LA23_158=='>') ) {s = 166;}

                        else if ( (LA23_158=='<') ) {s = 167;}

                        else if ( (LA23_158=='=') ) {s = 168;}

                        else if ( (LA23_158=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_158>='\u0000' && LA23_158<='\"')||LA23_158=='$'||(LA23_158>='&' && LA23_158<=')')||LA23_158==','||LA23_158=='.'||(LA23_158>=':' && LA23_158<=';')||(LA23_158>='?' && LA23_158<='@')||(LA23_158>='[' && LA23_158<='^')||LA23_158=='`'||(LA23_158>='{' && LA23_158<='\u00C1')||(LA23_158>='\u00C3' && LA23_158<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA23_157 = input.LA(1);

                        s = -1;
                        if ( ((LA23_157>='a' && LA23_157<='z')) ) {s = 155;}

                        else if ( ((LA23_157>='A' && LA23_157<='Z')) ) {s = 157;}

                        else if ( (LA23_157=='_') ) {s = 158;}

                        else if ( ((LA23_157>='0' && LA23_157<='9')) ) {s = 159;}

                        else if ( (LA23_157=='+') ) {s = 160;}

                        else if ( (LA23_157=='-') ) {s = 161;}

                        else if ( (LA23_157=='%') ) {s = 162;}

                        else if ( (LA23_157=='*') ) {s = 163;}

                        else if ( (LA23_157=='/') ) {s = 164;}

                        else if ( (LA23_157=='#') ) {s = 165;}

                        else if ( (LA23_157=='>') ) {s = 166;}

                        else if ( (LA23_157=='<') ) {s = 167;}

                        else if ( (LA23_157=='=') ) {s = 168;}

                        else if ( (LA23_157=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_157>='\u0000' && LA23_157<='\"')||LA23_157=='$'||(LA23_157>='&' && LA23_157<=')')||LA23_157==','||LA23_157=='.'||(LA23_157>=':' && LA23_157<=';')||(LA23_157>='?' && LA23_157<='@')||(LA23_157>='[' && LA23_157<='^')||LA23_157=='`'||(LA23_157>='{' && LA23_157<='\u00C1')||(LA23_157>='\u00C3' && LA23_157<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA23_155 = input.LA(1);

                        s = -1;
                        if ( ((LA23_155>='a' && LA23_155<='z')) ) {s = 155;}

                        else if ( ((LA23_155>='A' && LA23_155<='Z')) ) {s = 157;}

                        else if ( (LA23_155=='_') ) {s = 158;}

                        else if ( ((LA23_155>='0' && LA23_155<='9')) ) {s = 159;}

                        else if ( (LA23_155=='+') ) {s = 160;}

                        else if ( (LA23_155=='-') ) {s = 161;}

                        else if ( (LA23_155=='%') ) {s = 162;}

                        else if ( (LA23_155=='*') ) {s = 163;}

                        else if ( (LA23_155=='/') ) {s = 164;}

                        else if ( (LA23_155=='#') ) {s = 165;}

                        else if ( (LA23_155=='>') ) {s = 166;}

                        else if ( (LA23_155=='<') ) {s = 167;}

                        else if ( (LA23_155=='=') ) {s = 168;}

                        else if ( (LA23_155=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_155>='\u0000' && LA23_155<='\"')||LA23_155=='$'||(LA23_155>='&' && LA23_155<=')')||LA23_155==','||LA23_155=='.'||(LA23_155>=':' && LA23_155<=';')||(LA23_155>='?' && LA23_155<='@')||(LA23_155>='[' && LA23_155<='^')||LA23_155=='`'||(LA23_155>='{' && LA23_155<='\u00C1')||(LA23_155>='\u00C3' && LA23_155<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA23_203 = input.LA(1);

                        s = -1;
                        if ( ((LA23_203>='a' && LA23_203<='z')) ) {s = 155;}

                        else if ( ((LA23_203>='A' && LA23_203<='Z')) ) {s = 157;}

                        else if ( (LA23_203=='_') ) {s = 158;}

                        else if ( ((LA23_203>='0' && LA23_203<='9')) ) {s = 159;}

                        else if ( (LA23_203=='+') ) {s = 160;}

                        else if ( (LA23_203=='-') ) {s = 161;}

                        else if ( (LA23_203=='%') ) {s = 162;}

                        else if ( (LA23_203=='*') ) {s = 163;}

                        else if ( (LA23_203=='/') ) {s = 164;}

                        else if ( (LA23_203=='#') ) {s = 165;}

                        else if ( (LA23_203=='>') ) {s = 166;}

                        else if ( (LA23_203=='<') ) {s = 167;}

                        else if ( (LA23_203=='=') ) {s = 168;}

                        else if ( (LA23_203=='\u00C2') ) {s = 169;}

                        else if ( ((LA23_203>='\u0000' && LA23_203<='\"')||LA23_203=='$'||(LA23_203>='&' && LA23_203<=')')||LA23_203==','||LA23_203=='.'||(LA23_203>=':' && LA23_203<=';')||(LA23_203>='?' && LA23_203<='@')||(LA23_203>='[' && LA23_203<='^')||LA23_203=='`'||(LA23_203>='{' && LA23_203<='\u00C1')||(LA23_203>='\u00C3' && LA23_203<='\uFFFF')) ) {s = 156;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA23_153 = input.LA(1);

                        s = -1;
                        if ( (LA23_153=='\u00A7') ) {s = 202;}

                        else if ( ((LA23_153>='\u0000' && LA23_153<='\u00A6')||(LA23_153>='\u00A8' && LA23_153<='\uFFFF')) ) {s = 154;}

                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA23_43 = input.LA(1);

                        s = -1;
                        if ( ((LA23_43>='\u0000' && LA23_43<='\uFFFF')) ) {s = 110;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA23_201 = input.LA(1);

                        s = -1;
                        if ( (LA23_201=='*') ) {s = 147;}

                        else if ( ((LA23_201>='a' && LA23_201<='z')) ) {s = 140;}

                        else if ( ((LA23_201>='A' && LA23_201<='Z')) ) {s = 141;}

                        else if ( (LA23_201=='_') ) {s = 142;}

                        else if ( ((LA23_201>='0' && LA23_201<='9')) ) {s = 143;}

                        else if ( (LA23_201=='+') ) {s = 144;}

                        else if ( (LA23_201=='-') ) {s = 145;}

                        else if ( (LA23_201=='%') ) {s = 146;}

                        else if ( (LA23_201=='/') ) {s = 148;}

                        else if ( (LA23_201=='#') ) {s = 149;}

                        else if ( (LA23_201=='>') ) {s = 150;}

                        else if ( (LA23_201=='<') ) {s = 151;}

                        else if ( (LA23_201=='=') ) {s = 152;}

                        else if ( (LA23_201=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_201>='\u0000' && LA23_201<='\"')||LA23_201=='$'||(LA23_201>='&' && LA23_201<=')')||LA23_201==','||LA23_201=='.'||(LA23_201>=':' && LA23_201<=';')||(LA23_201>='?' && LA23_201<='@')||(LA23_201>='[' && LA23_201<='^')||LA23_201=='`'||(LA23_201>='{' && LA23_201<='\u00C1')||(LA23_201>='\u00C3' && LA23_201<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA23_202 = input.LA(1);

                        s = -1;
                        if ( ((LA23_202>='a' && LA23_202<='z')) ) {s = 140;}

                        else if ( ((LA23_202>='A' && LA23_202<='Z')) ) {s = 141;}

                        else if ( (LA23_202=='_') ) {s = 142;}

                        else if ( ((LA23_202>='0' && LA23_202<='9')) ) {s = 143;}

                        else if ( (LA23_202=='+') ) {s = 144;}

                        else if ( (LA23_202=='-') ) {s = 145;}

                        else if ( (LA23_202=='%') ) {s = 146;}

                        else if ( (LA23_202=='*') ) {s = 147;}

                        else if ( (LA23_202=='/') ) {s = 148;}

                        else if ( (LA23_202=='#') ) {s = 149;}

                        else if ( (LA23_202=='>') ) {s = 150;}

                        else if ( (LA23_202=='<') ) {s = 151;}

                        else if ( (LA23_202=='=') ) {s = 152;}

                        else if ( (LA23_202=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_202>='\u0000' && LA23_202<='\"')||LA23_202=='$'||(LA23_202>='&' && LA23_202<=')')||LA23_202==','||LA23_202=='.'||(LA23_202>=':' && LA23_202<=';')||(LA23_202>='?' && LA23_202<='@')||(LA23_202>='[' && LA23_202<='^')||LA23_202=='`'||(LA23_202>='{' && LA23_202<='\u00C1')||(LA23_202>='\u00C3' && LA23_202<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA23_92 = input.LA(1);

                        s = -1;
                        if ( ((LA23_92>='a' && LA23_92<='z')) ) {s = 140;}

                        else if ( ((LA23_92>='A' && LA23_92<='Z')) ) {s = 141;}

                        else if ( (LA23_92=='_') ) {s = 142;}

                        else if ( ((LA23_92>='0' && LA23_92<='9')) ) {s = 143;}

                        else if ( (LA23_92=='+') ) {s = 144;}

                        else if ( (LA23_92=='-') ) {s = 145;}

                        else if ( (LA23_92=='%') ) {s = 146;}

                        else if ( (LA23_92=='*') ) {s = 147;}

                        else if ( (LA23_92=='/') ) {s = 148;}

                        else if ( (LA23_92=='#') ) {s = 149;}

                        else if ( (LA23_92=='>') ) {s = 150;}

                        else if ( (LA23_92=='<') ) {s = 151;}

                        else if ( (LA23_92=='=') ) {s = 152;}

                        else if ( (LA23_92=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_92>='\u0000' && LA23_92<='\"')||LA23_92=='$'||(LA23_92>='&' && LA23_92<=')')||LA23_92==','||LA23_92=='.'||(LA23_92>=':' && LA23_92<=';')||(LA23_92>='?' && LA23_92<='@')||(LA23_92>='[' && LA23_92<='^')||LA23_92=='`'||(LA23_92>='{' && LA23_92<='\u00C1')||(LA23_92>='\u00C3' && LA23_92<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA23_151 = input.LA(1);

                        s = -1;
                        if ( (LA23_151=='*') ) {s = 147;}

                        else if ( ((LA23_151>='a' && LA23_151<='z')) ) {s = 140;}

                        else if ( ((LA23_151>='A' && LA23_151<='Z')) ) {s = 141;}

                        else if ( (LA23_151=='_') ) {s = 142;}

                        else if ( ((LA23_151>='0' && LA23_151<='9')) ) {s = 143;}

                        else if ( (LA23_151=='+') ) {s = 144;}

                        else if ( (LA23_151=='-') ) {s = 145;}

                        else if ( (LA23_151=='%') ) {s = 146;}

                        else if ( (LA23_151=='/') ) {s = 148;}

                        else if ( (LA23_151=='#') ) {s = 149;}

                        else if ( (LA23_151=='>') ) {s = 150;}

                        else if ( (LA23_151=='<') ) {s = 151;}

                        else if ( (LA23_151=='=') ) {s = 152;}

                        else if ( (LA23_151=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_151>='\u0000' && LA23_151<='\"')||LA23_151=='$'||(LA23_151>='&' && LA23_151<=')')||LA23_151==','||LA23_151=='.'||(LA23_151>=':' && LA23_151<=';')||(LA23_151>='?' && LA23_151<='@')||(LA23_151>='[' && LA23_151<='^')||LA23_151=='`'||(LA23_151>='{' && LA23_151<='\u00C1')||(LA23_151>='\u00C3' && LA23_151<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA23_152 = input.LA(1);

                        s = -1;
                        if ( (LA23_152=='*') ) {s = 147;}

                        else if ( ((LA23_152>='a' && LA23_152<='z')) ) {s = 140;}

                        else if ( ((LA23_152>='A' && LA23_152<='Z')) ) {s = 141;}

                        else if ( (LA23_152=='_') ) {s = 142;}

                        else if ( ((LA23_152>='0' && LA23_152<='9')) ) {s = 143;}

                        else if ( (LA23_152=='+') ) {s = 144;}

                        else if ( (LA23_152=='-') ) {s = 145;}

                        else if ( (LA23_152=='%') ) {s = 146;}

                        else if ( (LA23_152=='/') ) {s = 148;}

                        else if ( (LA23_152=='#') ) {s = 149;}

                        else if ( (LA23_152=='>') ) {s = 150;}

                        else if ( (LA23_152=='<') ) {s = 151;}

                        else if ( (LA23_152=='=') ) {s = 152;}

                        else if ( (LA23_152=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_152>='\u0000' && LA23_152<='\"')||LA23_152=='$'||(LA23_152>='&' && LA23_152<=')')||LA23_152==','||LA23_152=='.'||(LA23_152>=':' && LA23_152<=';')||(LA23_152>='?' && LA23_152<='@')||(LA23_152>='[' && LA23_152<='^')||LA23_152=='`'||(LA23_152>='{' && LA23_152<='\u00C1')||(LA23_152>='\u00C3' && LA23_152<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA23_149 = input.LA(1);

                        s = -1;
                        if ( (LA23_149=='*') ) {s = 147;}

                        else if ( ((LA23_149>='a' && LA23_149<='z')) ) {s = 140;}

                        else if ( ((LA23_149>='A' && LA23_149<='Z')) ) {s = 141;}

                        else if ( (LA23_149=='_') ) {s = 142;}

                        else if ( ((LA23_149>='0' && LA23_149<='9')) ) {s = 143;}

                        else if ( (LA23_149=='+') ) {s = 144;}

                        else if ( (LA23_149=='-') ) {s = 145;}

                        else if ( (LA23_149=='%') ) {s = 146;}

                        else if ( (LA23_149=='/') ) {s = 148;}

                        else if ( (LA23_149=='#') ) {s = 149;}

                        else if ( (LA23_149=='>') ) {s = 150;}

                        else if ( (LA23_149=='<') ) {s = 151;}

                        else if ( (LA23_149=='=') ) {s = 152;}

                        else if ( (LA23_149=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_149>='\u0000' && LA23_149<='\"')||LA23_149=='$'||(LA23_149>='&' && LA23_149<=')')||LA23_149==','||LA23_149=='.'||(LA23_149>=':' && LA23_149<=';')||(LA23_149>='?' && LA23_149<='@')||(LA23_149>='[' && LA23_149<='^')||LA23_149=='`'||(LA23_149>='{' && LA23_149<='\u00C1')||(LA23_149>='\u00C3' && LA23_149<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA23_150 = input.LA(1);

                        s = -1;
                        if ( (LA23_150=='*') ) {s = 147;}

                        else if ( ((LA23_150>='a' && LA23_150<='z')) ) {s = 140;}

                        else if ( ((LA23_150>='A' && LA23_150<='Z')) ) {s = 141;}

                        else if ( (LA23_150=='_') ) {s = 142;}

                        else if ( ((LA23_150>='0' && LA23_150<='9')) ) {s = 143;}

                        else if ( (LA23_150=='+') ) {s = 144;}

                        else if ( (LA23_150=='-') ) {s = 145;}

                        else if ( (LA23_150=='%') ) {s = 146;}

                        else if ( (LA23_150=='/') ) {s = 148;}

                        else if ( (LA23_150=='#') ) {s = 149;}

                        else if ( (LA23_150=='>') ) {s = 150;}

                        else if ( (LA23_150=='<') ) {s = 151;}

                        else if ( (LA23_150=='=') ) {s = 152;}

                        else if ( (LA23_150=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_150>='\u0000' && LA23_150<='\"')||LA23_150=='$'||(LA23_150>='&' && LA23_150<=')')||LA23_150==','||LA23_150=='.'||(LA23_150>=':' && LA23_150<=';')||(LA23_150>='?' && LA23_150<='@')||(LA23_150>='[' && LA23_150<='^')||LA23_150=='`'||(LA23_150>='{' && LA23_150<='\u00C1')||(LA23_150>='\u00C3' && LA23_150<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA23_146 = input.LA(1);

                        s = -1;
                        if ( ((LA23_146>='a' && LA23_146<='z')) ) {s = 140;}

                        else if ( ((LA23_146>='A' && LA23_146<='Z')) ) {s = 141;}

                        else if ( (LA23_146=='_') ) {s = 142;}

                        else if ( ((LA23_146>='0' && LA23_146<='9')) ) {s = 143;}

                        else if ( (LA23_146=='+') ) {s = 144;}

                        else if ( (LA23_146=='-') ) {s = 145;}

                        else if ( (LA23_146=='%') ) {s = 146;}

                        else if ( (LA23_146=='*') ) {s = 147;}

                        else if ( (LA23_146=='/') ) {s = 148;}

                        else if ( (LA23_146=='#') ) {s = 149;}

                        else if ( (LA23_146=='>') ) {s = 150;}

                        else if ( (LA23_146=='<') ) {s = 151;}

                        else if ( (LA23_146=='=') ) {s = 152;}

                        else if ( (LA23_146=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_146>='\u0000' && LA23_146<='\"')||LA23_146=='$'||(LA23_146>='&' && LA23_146<=')')||LA23_146==','||LA23_146=='.'||(LA23_146>=':' && LA23_146<=';')||(LA23_146>='?' && LA23_146<='@')||(LA23_146>='[' && LA23_146<='^')||LA23_146=='`'||(LA23_146>='{' && LA23_146<='\u00C1')||(LA23_146>='\u00C3' && LA23_146<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA23_145 = input.LA(1);

                        s = -1;
                        if ( (LA23_145=='*') ) {s = 147;}

                        else if ( ((LA23_145>='a' && LA23_145<='z')) ) {s = 140;}

                        else if ( ((LA23_145>='A' && LA23_145<='Z')) ) {s = 141;}

                        else if ( (LA23_145=='_') ) {s = 142;}

                        else if ( ((LA23_145>='0' && LA23_145<='9')) ) {s = 143;}

                        else if ( (LA23_145=='+') ) {s = 144;}

                        else if ( (LA23_145=='-') ) {s = 145;}

                        else if ( (LA23_145=='%') ) {s = 146;}

                        else if ( (LA23_145=='/') ) {s = 148;}

                        else if ( (LA23_145=='#') ) {s = 149;}

                        else if ( (LA23_145=='>') ) {s = 150;}

                        else if ( (LA23_145=='<') ) {s = 151;}

                        else if ( (LA23_145=='=') ) {s = 152;}

                        else if ( (LA23_145=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_145>='\u0000' && LA23_145<='\"')||LA23_145=='$'||(LA23_145>='&' && LA23_145<=')')||LA23_145==','||LA23_145=='.'||(LA23_145>=':' && LA23_145<=';')||(LA23_145>='?' && LA23_145<='@')||(LA23_145>='[' && LA23_145<='^')||LA23_145=='`'||(LA23_145>='{' && LA23_145<='\u00C1')||(LA23_145>='\u00C3' && LA23_145<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA23_148 = input.LA(1);

                        s = -1;
                        if ( (LA23_148=='*') ) {s = 147;}

                        else if ( ((LA23_148>='a' && LA23_148<='z')) ) {s = 140;}

                        else if ( ((LA23_148>='A' && LA23_148<='Z')) ) {s = 141;}

                        else if ( (LA23_148=='_') ) {s = 142;}

                        else if ( ((LA23_148>='0' && LA23_148<='9')) ) {s = 143;}

                        else if ( (LA23_148=='+') ) {s = 144;}

                        else if ( (LA23_148=='-') ) {s = 145;}

                        else if ( (LA23_148=='%') ) {s = 146;}

                        else if ( (LA23_148=='/') ) {s = 148;}

                        else if ( (LA23_148=='#') ) {s = 149;}

                        else if ( (LA23_148=='>') ) {s = 150;}

                        else if ( (LA23_148=='<') ) {s = 151;}

                        else if ( (LA23_148=='=') ) {s = 152;}

                        else if ( (LA23_148=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_148>='\u0000' && LA23_148<='\"')||LA23_148=='$'||(LA23_148>='&' && LA23_148<=')')||LA23_148==','||LA23_148=='.'||(LA23_148>=':' && LA23_148<=';')||(LA23_148>='?' && LA23_148<='@')||(LA23_148>='[' && LA23_148<='^')||LA23_148=='`'||(LA23_148>='{' && LA23_148<='\u00C1')||(LA23_148>='\u00C3' && LA23_148<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA23_142 = input.LA(1);

                        s = -1;
                        if ( (LA23_142=='*') ) {s = 147;}

                        else if ( ((LA23_142>='a' && LA23_142<='z')) ) {s = 140;}

                        else if ( ((LA23_142>='A' && LA23_142<='Z')) ) {s = 141;}

                        else if ( (LA23_142=='_') ) {s = 142;}

                        else if ( ((LA23_142>='0' && LA23_142<='9')) ) {s = 143;}

                        else if ( (LA23_142=='+') ) {s = 144;}

                        else if ( (LA23_142=='-') ) {s = 145;}

                        else if ( (LA23_142=='%') ) {s = 146;}

                        else if ( (LA23_142=='/') ) {s = 148;}

                        else if ( (LA23_142=='#') ) {s = 149;}

                        else if ( (LA23_142=='>') ) {s = 150;}

                        else if ( (LA23_142=='<') ) {s = 151;}

                        else if ( (LA23_142=='=') ) {s = 152;}

                        else if ( (LA23_142=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_142>='\u0000' && LA23_142<='\"')||LA23_142=='$'||(LA23_142>='&' && LA23_142<=')')||LA23_142==','||LA23_142=='.'||(LA23_142>=':' && LA23_142<=';')||(LA23_142>='?' && LA23_142<='@')||(LA23_142>='[' && LA23_142<='^')||LA23_142=='`'||(LA23_142>='{' && LA23_142<='\u00C1')||(LA23_142>='\u00C3' && LA23_142<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA23_141 = input.LA(1);

                        s = -1;
                        if ( (LA23_141=='*') ) {s = 147;}

                        else if ( ((LA23_141>='a' && LA23_141<='z')) ) {s = 140;}

                        else if ( ((LA23_141>='A' && LA23_141<='Z')) ) {s = 141;}

                        else if ( (LA23_141=='_') ) {s = 142;}

                        else if ( ((LA23_141>='0' && LA23_141<='9')) ) {s = 143;}

                        else if ( (LA23_141=='+') ) {s = 144;}

                        else if ( (LA23_141=='-') ) {s = 145;}

                        else if ( (LA23_141=='%') ) {s = 146;}

                        else if ( (LA23_141=='/') ) {s = 148;}

                        else if ( (LA23_141=='#') ) {s = 149;}

                        else if ( (LA23_141=='>') ) {s = 150;}

                        else if ( (LA23_141=='<') ) {s = 151;}

                        else if ( (LA23_141=='=') ) {s = 152;}

                        else if ( (LA23_141=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_141>='\u0000' && LA23_141<='\"')||LA23_141=='$'||(LA23_141>='&' && LA23_141<=')')||LA23_141==','||LA23_141=='.'||(LA23_141>=':' && LA23_141<=';')||(LA23_141>='?' && LA23_141<='@')||(LA23_141>='[' && LA23_141<='^')||LA23_141=='`'||(LA23_141>='{' && LA23_141<='\u00C1')||(LA23_141>='\u00C3' && LA23_141<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA23_144 = input.LA(1);

                        s = -1;
                        if ( (LA23_144=='*') ) {s = 147;}

                        else if ( ((LA23_144>='a' && LA23_144<='z')) ) {s = 140;}

                        else if ( ((LA23_144>='A' && LA23_144<='Z')) ) {s = 141;}

                        else if ( (LA23_144=='_') ) {s = 142;}

                        else if ( ((LA23_144>='0' && LA23_144<='9')) ) {s = 143;}

                        else if ( (LA23_144=='+') ) {s = 144;}

                        else if ( (LA23_144=='-') ) {s = 145;}

                        else if ( (LA23_144=='%') ) {s = 146;}

                        else if ( (LA23_144=='/') ) {s = 148;}

                        else if ( (LA23_144=='#') ) {s = 149;}

                        else if ( (LA23_144=='>') ) {s = 150;}

                        else if ( (LA23_144=='<') ) {s = 151;}

                        else if ( (LA23_144=='=') ) {s = 152;}

                        else if ( (LA23_144=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_144>='\u0000' && LA23_144<='\"')||LA23_144=='$'||(LA23_144>='&' && LA23_144<=')')||LA23_144==','||LA23_144=='.'||(LA23_144>=':' && LA23_144<=';')||(LA23_144>='?' && LA23_144<='@')||(LA23_144>='[' && LA23_144<='^')||LA23_144=='`'||(LA23_144>='{' && LA23_144<='\u00C1')||(LA23_144>='\u00C3' && LA23_144<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA23_143 = input.LA(1);

                        s = -1;
                        if ( (LA23_143=='*') ) {s = 147;}

                        else if ( ((LA23_143>='a' && LA23_143<='z')) ) {s = 140;}

                        else if ( ((LA23_143>='A' && LA23_143<='Z')) ) {s = 141;}

                        else if ( (LA23_143=='_') ) {s = 142;}

                        else if ( ((LA23_143>='0' && LA23_143<='9')) ) {s = 143;}

                        else if ( (LA23_143=='+') ) {s = 144;}

                        else if ( (LA23_143=='-') ) {s = 145;}

                        else if ( (LA23_143=='%') ) {s = 146;}

                        else if ( (LA23_143=='/') ) {s = 148;}

                        else if ( (LA23_143=='#') ) {s = 149;}

                        else if ( (LA23_143=='>') ) {s = 150;}

                        else if ( (LA23_143=='<') ) {s = 151;}

                        else if ( (LA23_143=='=') ) {s = 152;}

                        else if ( (LA23_143=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_143>='\u0000' && LA23_143<='\"')||LA23_143=='$'||(LA23_143>='&' && LA23_143<=')')||LA23_143==','||LA23_143=='.'||(LA23_143>=':' && LA23_143<=';')||(LA23_143>='?' && LA23_143<='@')||(LA23_143>='[' && LA23_143<='^')||LA23_143=='`'||(LA23_143>='{' && LA23_143<='\u00C1')||(LA23_143>='\u00C3' && LA23_143<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA23_140 = input.LA(1);

                        s = -1;
                        if ( (LA23_140=='*') ) {s = 147;}

                        else if ( ((LA23_140>='a' && LA23_140<='z')) ) {s = 140;}

                        else if ( ((LA23_140>='A' && LA23_140<='Z')) ) {s = 141;}

                        else if ( (LA23_140=='_') ) {s = 142;}

                        else if ( ((LA23_140>='0' && LA23_140<='9')) ) {s = 143;}

                        else if ( (LA23_140=='+') ) {s = 144;}

                        else if ( (LA23_140=='-') ) {s = 145;}

                        else if ( (LA23_140=='%') ) {s = 146;}

                        else if ( (LA23_140=='/') ) {s = 148;}

                        else if ( (LA23_140=='#') ) {s = 149;}

                        else if ( (LA23_140=='>') ) {s = 150;}

                        else if ( (LA23_140=='<') ) {s = 151;}

                        else if ( (LA23_140=='=') ) {s = 152;}

                        else if ( (LA23_140=='\u00C2') ) {s = 153;}

                        else if ( ((LA23_140>='\u0000' && LA23_140<='\"')||LA23_140=='$'||(LA23_140>='&' && LA23_140<=')')||LA23_140==','||LA23_140=='.'||(LA23_140>=':' && LA23_140<=';')||(LA23_140>='?' && LA23_140<='@')||(LA23_140>='[' && LA23_140<='^')||LA23_140=='`'||(LA23_140>='{' && LA23_140<='\u00C1')||(LA23_140>='\u00C3' && LA23_140<='\uFFFF')) ) {s = 154;}

                        else s = 48;

                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA23_44 = input.LA(1);

                        s = -1;
                        if ( ((LA23_44>='\u0000' && LA23_44<='\uFFFF')) ) {s = 110;}

                        else s = 46;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}