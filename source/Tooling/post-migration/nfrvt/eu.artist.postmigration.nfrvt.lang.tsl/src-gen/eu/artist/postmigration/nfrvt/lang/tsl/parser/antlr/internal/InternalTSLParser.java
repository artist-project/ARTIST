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
package eu.artist.postmigration.nfrvt.lang.tsl.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.artist.postmigration.nfrvt.lang.tsl.services.TSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalTSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pattern-catalogue'", "'{'", "'}'", "'pattern'", "'context'", "','", "'problem'", "'solution'", "'property-impacts'", "'['", "']'", "'pattern-impacts'", "'related-patterns'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'"
    };
    public static final int RULE_ID=4;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__62=62;
    public static final int T__27=27;
    public static final int T__63=63;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int EOF=-1;
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
    public static final int RULE_EBIGDECIMAL=11;
    public static final int T__43=43;
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
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=9;
    public static final int RULE_EBOOLEAN=6;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalTSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalTSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalTSLParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g"; }



     	private TSLGrammarAccess grammarAccess;
     	
        public InternalTSLParser(TokenStream input, TSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PatternCatalogue";	
       	}
       	
       	@Override
       	protected TSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePatternCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:67:1: entryRulePatternCatalogue returns [EObject current=null] : iv_rulePatternCatalogue= rulePatternCatalogue EOF ;
    public final EObject entryRulePatternCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternCatalogue = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:68:2: (iv_rulePatternCatalogue= rulePatternCatalogue EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:69:2: iv_rulePatternCatalogue= rulePatternCatalogue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternCatalogueRule()); 
            }
            pushFollow(FOLLOW_rulePatternCatalogue_in_entryRulePatternCatalogue75);
            iv_rulePatternCatalogue=rulePatternCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternCatalogue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternCatalogue85); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternCatalogue"


    // $ANTLR start "rulePatternCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:76:1: rulePatternCatalogue returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' ) ;
    public final EObject rulePatternCatalogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_patterns_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:79:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:80:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:80:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:80:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'pattern-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_patterns_4_0= rulePattern ) )* otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:80:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==64) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:81:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:81:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:82:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternCatalogueAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_rulePatternCatalogue131);
            	    lv_imports_0_0=ruleImportNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternCatalogueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"imports",
            	              		lv_imports_0_0, 
            	              		"ImportNamespace");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_rulePatternCatalogue144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPatternCatalogueAccess().getPatternCatalogueKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:102:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:103:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:103:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:104:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternCatalogueAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePatternCatalogue165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPatternCatalogueRule());
              	        }
                     		set(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"QualifiedName");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePatternCatalogue177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPatternCatalogueAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:124:1: ( (lv_patterns_4_0= rulePattern ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:125:1: (lv_patterns_4_0= rulePattern )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:125:1: (lv_patterns_4_0= rulePattern )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:126:3: lv_patterns_4_0= rulePattern
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getPatternCatalogueAccess().getPatternsPatternParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePattern_in_rulePatternCatalogue198);
            	    lv_patterns_4_0=rulePattern();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getPatternCatalogueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"patterns",
            	              		lv_patterns_4_0, 
            	              		"Pattern");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_rulePatternCatalogue211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPatternCatalogueAccess().getRightCurlyBracketKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePatternCatalogue"


    // $ANTLR start "entryRulePattern"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:154:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:155:2: (iv_rulePattern= rulePattern EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:156:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_rulePattern_in_entryRulePattern247);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePattern257); if (state.failed) return current;

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:163:1: rulePattern returns [EObject current=null] : (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_context_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_problem_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_solution_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_32=null;
        EObject lv_propertyImpacts_14_0 = null;

        EObject lv_propertyImpacts_16_0 = null;

        EObject lv_patternImpacts_21_0 = null;

        EObject lv_patternImpacts_23_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:166:28: ( (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:167:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:167:1: (otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:167:3: otherlv_0= 'pattern' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'context' ( (lv_context_4_0= RULE_STRING ) ) otherlv_5= ',' otherlv_6= 'problem' ( (lv_problem_7_0= RULE_STRING ) ) otherlv_8= ',' otherlv_9= 'solution' ( (lv_solution_10_0= RULE_STRING ) ) (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )? (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )? (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )? otherlv_32= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_rulePattern294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getPatternKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:171:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:172:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:172:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:173:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePattern311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_rulePattern328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,20,FOLLOW_20_in_rulePattern340); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getContextKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:197:1: ( (lv_context_4_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:198:1: (lv_context_4_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:198:1: (lv_context_4_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:199:3: lv_context_4_0= RULE_STRING
            {
            lv_context_4_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern357); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_context_4_0, grammarAccess.getPatternAccess().getContextSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"context",
                      		lv_context_4_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_rulePattern374); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,22,FOLLOW_22_in_rulePattern386); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getPatternAccess().getProblemKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:223:1: ( (lv_problem_7_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:224:1: (lv_problem_7_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:224:1: (lv_problem_7_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:225:3: lv_problem_7_0= RULE_STRING
            {
            lv_problem_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_problem_7_0, grammarAccess.getPatternAccess().getProblemSTRINGTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"problem",
                      		lv_problem_7_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_rulePattern420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,23,FOLLOW_23_in_rulePattern432); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getSolutionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:249:1: ( (lv_solution_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:250:1: (lv_solution_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:250:1: (lv_solution_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:251:3: lv_solution_10_0= RULE_STRING
            {
            lv_solution_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rulePattern449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_solution_10_0, grammarAccess.getPatternAccess().getSolutionSTRINGTerminalRuleCall_10_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"solution",
                      		lv_solution_10_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:267:2: (otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==21) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==24) ) {
                    alt4=1;
                }
            }
            switch (alt4) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:267:4: otherlv_11= ',' otherlv_12= 'property-impacts' otherlv_13= '[' ( (lv_propertyImpacts_14_0= rulePropertyImpact ) ) (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )* otherlv_17= ']'
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_rulePattern467); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getPatternAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_12=(Token)match(input,24,FOLLOW_24_in_rulePattern479); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPropertyImpactsKeyword_11_1());
                          
                    }
                    otherlv_13=(Token)match(input,25,FOLLOW_25_in_rulePattern491); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_13, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_11_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:279:1: ( (lv_propertyImpacts_14_0= rulePropertyImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:280:1: (lv_propertyImpacts_14_0= rulePropertyImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:280:1: (lv_propertyImpacts_14_0= rulePropertyImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:281:3: lv_propertyImpacts_14_0= rulePropertyImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getPropertyImpactsPropertyImpactParserRuleCall_11_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyImpact_in_rulePattern512);
                    lv_propertyImpacts_14_0=rulePropertyImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                      	        }
                             		add(
                             			current, 
                             			"propertyImpacts",
                              		lv_propertyImpacts_14_0, 
                              		"PropertyImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:297:2: (otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:297:4: otherlv_15= ',' ( (lv_propertyImpacts_16_0= rulePropertyImpact ) )
                    	    {
                    	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_rulePattern525); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_15, grammarAccess.getPatternAccess().getCommaKeyword_11_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:301:1: ( (lv_propertyImpacts_16_0= rulePropertyImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:302:1: (lv_propertyImpacts_16_0= rulePropertyImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:302:1: (lv_propertyImpacts_16_0= rulePropertyImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:303:3: lv_propertyImpacts_16_0= rulePropertyImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getPropertyImpactsPropertyImpactParserRuleCall_11_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyImpact_in_rulePattern546);
                    	    lv_propertyImpacts_16_0=rulePropertyImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"propertyImpacts",
                    	              		lv_propertyImpacts_16_0, 
                    	              		"PropertyImpact");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,26,FOLLOW_26_in_rulePattern560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_11_5());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:323:3: (otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==27) ) {
                    alt6=1;
                }
            }
            switch (alt6) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:323:5: otherlv_18= ',' otherlv_19= 'pattern-impacts' otherlv_20= '[' ( (lv_patternImpacts_21_0= rulePatternImpact ) ) (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )* otherlv_24= ']'
                    {
                    otherlv_18=(Token)match(input,21,FOLLOW_21_in_rulePattern575); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getPatternAccess().getCommaKeyword_12_0());
                          
                    }
                    otherlv_19=(Token)match(input,27,FOLLOW_27_in_rulePattern587); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getPatternImpactsKeyword_12_1());
                          
                    }
                    otherlv_20=(Token)match(input,25,FOLLOW_25_in_rulePattern599); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_12_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:335:1: ( (lv_patternImpacts_21_0= rulePatternImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:336:1: (lv_patternImpacts_21_0= rulePatternImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:336:1: (lv_patternImpacts_21_0= rulePatternImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:337:3: lv_patternImpacts_21_0= rulePatternImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getPatternImpactsPatternImpactParserRuleCall_12_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePatternImpact_in_rulePattern620);
                    lv_patternImpacts_21_0=rulePatternImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                      	        }
                             		add(
                             			current, 
                             			"patternImpacts",
                              		lv_patternImpacts_21_0, 
                              		"PatternImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:353:2: (otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==21) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:353:4: otherlv_22= ',' ( (lv_patternImpacts_23_0= rulePatternImpact ) )
                    	    {
                    	    otherlv_22=(Token)match(input,21,FOLLOW_21_in_rulePattern633); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_22, grammarAccess.getPatternAccess().getCommaKeyword_12_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:357:1: ( (lv_patternImpacts_23_0= rulePatternImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:358:1: (lv_patternImpacts_23_0= rulePatternImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:358:1: (lv_patternImpacts_23_0= rulePatternImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:359:3: lv_patternImpacts_23_0= rulePatternImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getPatternImpactsPatternImpactParserRuleCall_12_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePatternImpact_in_rulePattern654);
                    	    lv_patternImpacts_23_0=rulePatternImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getPatternRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"patternImpacts",
                    	              		lv_patternImpacts_23_0, 
                    	              		"PatternImpact");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_24=(Token)match(input,26,FOLLOW_26_in_rulePattern668); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_24, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_12_5());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:379:3: (otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:379:5: otherlv_25= ',' otherlv_26= 'related-patterns' otherlv_27= '[' ( ( ruleQualifiedName ) ) (otherlv_29= ',' ( ( ruleQualifiedName ) ) )* otherlv_31= ']'
                    {
                    otherlv_25=(Token)match(input,21,FOLLOW_21_in_rulePattern683); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_25, grammarAccess.getPatternAccess().getCommaKeyword_13_0());
                          
                    }
                    otherlv_26=(Token)match(input,28,FOLLOW_28_in_rulePattern695); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_26, grammarAccess.getPatternAccess().getRelatedPatternsKeyword_13_1());
                          
                    }
                    otherlv_27=(Token)match(input,25,FOLLOW_25_in_rulePattern707); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_13_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:391:1: ( ( ruleQualifiedName ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:392:1: ( ruleQualifiedName )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:392:1: ( ruleQualifiedName )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:393:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getPatternRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPatternAccess().getRelatedPatternsPatternCrossReference_13_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_rulePattern730);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:406:2: (otherlv_29= ',' ( ( ruleQualifiedName ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==21) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:406:4: otherlv_29= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_29=(Token)match(input,21,FOLLOW_21_in_rulePattern743); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_29, grammarAccess.getPatternAccess().getCommaKeyword_13_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:410:1: ( ( ruleQualifiedName ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:411:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:411:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:412:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getPatternRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getPatternAccess().getRelatedPatternsPatternCrossReference_13_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_rulePattern766);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_31=(Token)match(input,26,FOLLOW_26_in_rulePattern780); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_31, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_13_5());
                          
                    }

                    }
                    break;

            }

            otherlv_32=(Token)match(input,18,FOLLOW_18_in_rulePattern794); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_32, grammarAccess.getPatternAccess().getRightCurlyBracketKeyword_14());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRulePatternImpact"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:441:1: entryRulePatternImpact returns [EObject current=null] : iv_rulePatternImpact= rulePatternImpact EOF ;
    public final EObject entryRulePatternImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatternImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:442:2: (iv_rulePatternImpact= rulePatternImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:443:2: iv_rulePatternImpact= rulePatternImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternImpactRule()); 
            }
            pushFollow(FOLLOW_rulePatternImpact_in_entryRulePatternImpact830);
            iv_rulePatternImpact=rulePatternImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePatternImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePatternImpact840); if (state.failed) return current;

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
    // $ANTLR end "entryRulePatternImpact"


    // $ANTLR start "rulePatternImpact"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:450:1: rulePatternImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject rulePatternImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:453:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:454:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:454:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:454:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:454:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:455:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:455:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:456:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPatternImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternImpactAccess().getTargetPatternCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePatternImpact888);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:469:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:470:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:470:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:471:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPatternImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_rulePatternImpact909);
            lv_impact_1_0=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPatternImpactRule());
              	        }
                     		set(
                     			current, 
                     			"impact",
                      		lv_impact_1_0, 
                      		"Impact");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePatternImpact"


    // $ANTLR start "entryRulePropertyImpact"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:495:1: entryRulePropertyImpact returns [EObject current=null] : iv_rulePropertyImpact= rulePropertyImpact EOF ;
    public final EObject entryRulePropertyImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:496:2: (iv_rulePropertyImpact= rulePropertyImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:497:2: iv_rulePropertyImpact= rulePropertyImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyImpactRule()); 
            }
            pushFollow(FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact945);
            iv_rulePropertyImpact=rulePropertyImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyImpact955); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyImpact"


    // $ANTLR start "rulePropertyImpact"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:504:1: rulePropertyImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject rulePropertyImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:507:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:508:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:508:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:508:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:508:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:509:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:509:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:510:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getTargetPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyImpact1003);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:523:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:524:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:524:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:525:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_rulePropertyImpact1024);
            lv_impact_1_0=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyImpactRule());
              	        }
                     		set(
                     			current, 
                     			"impact",
                      		lv_impact_1_0, 
                      		"Impact");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyImpact"


    // $ANTLR start "entryRuleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:549:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:550:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:551:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression1060);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression1070); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:558:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:561:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:563:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression1116);
            this_Implication_0=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Implication_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleImplication"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:579:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:580:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:581:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication1150);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication1160); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImplication"


    // $ANTLR start "ruleImplication"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:588:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:591:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:592:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:592:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:593:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication1207);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:601:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=39 && LA9_0<=40)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:601:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:601:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:602:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:607:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:608:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:608:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:609:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication1237);
            	    lv_operator_2_0=ruleImplicationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"ImplicationOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:625:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:626:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:626:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:627:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication1258);
            	    lv_right_3_0=ruleDisjunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getImplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Disjunction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:651:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:652:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:653:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction1296);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction1306); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDisjunction"


    // $ANTLR start "ruleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:660:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:663:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:664:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:664:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:665:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction1353);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:673:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=33 && LA11_0<=36)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:673:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:673:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:674:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:679:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:680:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:680:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:681:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:681:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( ((LA10_0>=33 && LA10_0<=34)) ) {
            	        alt10=1;
            	    }
            	    else if ( ((LA10_0>=35 && LA10_0<=36)) ) {
            	        alt10=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 10, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:682:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction1385);
            	            lv_operator_2_1=ruleOrOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_1, 
            	                      		"OrOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:697:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction1404);
            	            lv_operator_2_2=ruleXOrOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_2, 
            	                      		"XOrOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:715:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:716:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:716:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:717:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction1428);
            	    lv_right_3_0=ruleConjunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getDisjunctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Conjunction");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:741:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:742:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:743:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1466);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1476); if (state.failed) return current;

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
    // $ANTLR end "entryRuleConjunction"


    // $ANTLR start "ruleConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:750:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:753:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:754:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:754:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:755:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction1523);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:763:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=37 && LA12_0<=38)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:763:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:763:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:764:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:769:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:770:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:770:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:771:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction1553);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"operator",
            	              		lv_operator_2_0, 
            	              		"AndOperator");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:787:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:788:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:788:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:789:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction1574);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getConjunctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"Comparison");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:813:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:814:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:815:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1612);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1622); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:822:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:825:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:826:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:826:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:827:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison1669);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:835:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=41 && LA14_0<=43)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:835:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:835:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:836:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:841:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:842:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:842:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:843:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:843:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt13=2;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==41) ) {
            	        alt13=1;
            	    }
            	    else if ( ((LA13_0>=42 && LA13_0<=43)) ) {
            	        alt13=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 13, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:844:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison1701);
            	            lv_operator_2_1=ruleEqualsOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_1, 
            	                      		"EqualsOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:859:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison1720);
            	            lv_operator_2_2=ruleNotEqualsOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_2, 
            	                      		"NotEqualsOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:877:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:878:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:878:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:879:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison1744);
            	    lv_right_3_0=ruleBooleanUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"BooleanUnit");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:903:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:904:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:905:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit1782);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit1792); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanUnit"


    // $ANTLR start "ruleBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:912:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:915:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:916:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:916:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 44:
            case 45:
                {
                alt15=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_NULL:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 29:
            case 32:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
                {
                alt15=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:917:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit1839);
                    this_Negation_0=ruleNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_Negation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:927:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit1866);
                    this_RelationalExpression_1=ruleRelationalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_RelationalExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:937:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit1893);
                    this_BooleanLiteral_2=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanUnit"


    // $ANTLR start "entryRuleNegation"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:953:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:954:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:955:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1928);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNegation"


    // $ANTLR start "ruleNegation"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:962:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:965:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:966:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:966:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:966:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:966:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:967:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:967:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:968:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation1984);
            lv_operator_0_0=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegationRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"NotOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:984:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:985:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:985:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:986:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation2005);
            lv_value_1_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNegationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"BooleanUnit");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNegation"


    // $ANTLR start "entryRuleRelationalExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1010:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1011:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1012:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2041);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression2051); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRelationalExpression"


    // $ANTLR start "ruleRelationalExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1019:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
    public final EObject ruleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ComparableExpression_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_operator_4_0 = null;

        EObject lv_operator_6_0 = null;

        EObject lv_operator_8_0 = null;

        EObject lv_right_9_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1022:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1023:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1023:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1024:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2098);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=46 && LA17_0<=49)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt16=4;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt16=1;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt16=2;
            	        }
            	        break;
            	    case 49:
            	        {
            	        alt16=3;
            	        }
            	        break;
            	    case 48:
            	        {
            	        alt16=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt16) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1032:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1033:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1038:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1039:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1039:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1040:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression2130);
            	            lv_operator_2_0=ruleGreaterThanOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_0, 
            	                      		"GreaterThanOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1057:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1057:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1057:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1057:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1058:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1063:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1064:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1064:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1065:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression2168);
            	            lv_operator_4_0=ruleGreaterOrEqualThanOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_4_0, 
            	                      		"GreaterOrEqualThanOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1082:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1082:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1082:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1082:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1083:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1088:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1089:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1089:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1090:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression2206);
            	            lv_operator_6_0=ruleLessOrEqualThanOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_6_0, 
            	                      		"LessOrEqualThanOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1107:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1107:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1107:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1107:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1108:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1113:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1114:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1114:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1115:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression2244);
            	            lv_operator_8_0=ruleLessThanOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_8_0, 
            	                      		"LessThanOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1131:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1132:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1132:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1133:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2267);
            	    lv_right_9_0=ruleComparableExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRelationalExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_9_0, 
            	              		"ComparableExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1157:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1158:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1159:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression2305);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression2315); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparableExpression"


    // $ANTLR start "ruleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1166:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
    public final EObject ruleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ArithmeticExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;

        EObject this_NullLiteral_3 = null;

        EObject this_StringLiteral_4 = null;

        EObject this_UnlimitedLiteral_5 = null;

        EObject this_ParenthesizedExpression_6 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1169:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1170:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1170:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt18=7;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1171:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression2362);
                    this_ArithmeticExpression_0=ruleArithmeticExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ArithmeticExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1181:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression2389);
                    this_InstanceSpecificationExpression_1=ruleInstanceSpecificationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceSpecificationExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1191:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression2416);
                    this_ObjectSpecificationExpression_2=ruleObjectSpecificationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObjectSpecificationExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1201:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression2443);
                    this_NullLiteral_3=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1211:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression2470);
                    this_StringLiteral_4=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1221:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression2497);
                    this_UnlimitedLiteral_5=ruleUnlimitedLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnlimitedLiteral_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1231:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression2524);
                    this_ParenthesizedExpression_6=ruleParenthesizedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedExpression_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleComparableExpression"


    // $ANTLR start "entryRuleArithmeticExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1247:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1248:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1249:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2559);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression2569); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArithmeticExpression"


    // $ANTLR start "ruleArithmeticExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1256:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1259:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1261:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression2615);
            this_AdditiveExpression_0=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AdditiveExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArithmeticExpression"


    // $ANTLR start "entryRuleAdditiveExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1277:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1278:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1279:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2649);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2659); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditiveExpression"


    // $ANTLR start "ruleAdditiveExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1286:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1289:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1290:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1290:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1291:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2706);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1299:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=50 && LA20_0<=51)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1299:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1299:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1300:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1305:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1306:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1306:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1307:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1307:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==51) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==50) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1308:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression2738);
            	            lv_operator_2_1=ruleSubstractionOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_1, 
            	                      		"SubstractionOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1323:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression2757);
            	            lv_operator_2_2=ruleAdditionOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_2, 
            	                      		"AdditionOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1341:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1342:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1342:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1343:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2781);
            	    lv_right_3_0=ruleMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAdditiveExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"MultiplicativeExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1367:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1368:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1369:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2819);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2829); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicativeExpression"


    // $ANTLR start "ruleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1376:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1379:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1380:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1380:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1381:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2876);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1389:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==32||(LA22_0>=52 && LA22_0<=53)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1389:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1389:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1390:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1395:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1396:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1396:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1397:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1397:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1398:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression2908);
            	            lv_operator_2_1=ruleMultiplicationOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_1, 
            	                      		"MultiplicationOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1413:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression2927);
            	            lv_operator_2_2=ruleDivisionOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_2, 
            	                      		"DivisionOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1428:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression2946);
            	            lv_operator_2_3=ruleModulusOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	              	        }
            	                     		set(
            	                     			current, 
            	                     			"operator",
            	                      		lv_operator_2_3, 
            	                      		"ModulusOperator");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1446:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1447:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1447:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1448:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2970);
            	    lv_right_3_0=ruleNumberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMultiplicativeExpressionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"NumberExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1472:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1473:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1474:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression3008);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression3018); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberExpression"


    // $ANTLR start "ruleNumberExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1481:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1484:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1485:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1485:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=RULE_INT && LA23_0<=RULE_EBIGDECIMAL)) ) {
                alt23=1;
            }
            else if ( ((LA23_0>=54 && LA23_0<=61)) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1486:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression3065);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1496:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression3092);
                    this_NumberFunction_1=ruleNumberFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberFunction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberExpression"


    // $ANTLR start "entryRuleNumberFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1512:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1513:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1514:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction3127);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction3137); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberFunction"


    // $ANTLR start "ruleNumberFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1521:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
    public final EObject ruleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject this_MaximumFunction_0 = null;

        EObject this_MinimumFunction_1 = null;

        EObject this_AverageFunction_2 = null;

        EObject this_SumFunction_3 = null;

        EObject this_ExponentialFunction_4 = null;

        EObject this_AbsoluteFunction_5 = null;

        EObject this_NaturalLogarithmFunction_6 = null;

        EObject this_CommonLogarithmFunction_7 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1524:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1525:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1525:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt24=8;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt24=1;
                }
                break;
            case 55:
                {
                alt24=2;
                }
                break;
            case 56:
                {
                alt24=3;
                }
                break;
            case 57:
                {
                alt24=4;
                }
                break;
            case 58:
                {
                alt24=5;
                }
                break;
            case 59:
                {
                alt24=6;
                }
                break;
            case 60:
                {
                alt24=7;
                }
                break;
            case 61:
                {
                alt24=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1526:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction3184);
                    this_MaximumFunction_0=ruleMaximumFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MaximumFunction_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1536:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction3211);
                    this_MinimumFunction_1=ruleMinimumFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_MinimumFunction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1546:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction3238);
                    this_AverageFunction_2=ruleAverageFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AverageFunction_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1556:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction3265);
                    this_SumFunction_3=ruleSumFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SumFunction_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1566:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction3292);
                    this_ExponentialFunction_4=ruleExponentialFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ExponentialFunction_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 6 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1576:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction3319);
                    this_AbsoluteFunction_5=ruleAbsoluteFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AbsoluteFunction_5; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 7 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1586:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction3346);
                    this_NaturalLogarithmFunction_6=ruleNaturalLogarithmFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NaturalLogarithmFunction_6; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 8 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1596:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction3373);
                    this_CommonLogarithmFunction_7=ruleCommonLogarithmFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CommonLogarithmFunction_7; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberFunction"


    // $ANTLR start "entryRuleMaximumFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1612:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1613:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1614:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction3408);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction3418); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMaximumFunction"


    // $ANTLR start "ruleMaximumFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1621:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleMaximumFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operator_0_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1624:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1625:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1625:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1625:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1625:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1626:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1626:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1627:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction3464);
            lv_operator_0_0=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMaximumFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"MaxOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMaximumFunction3476); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1647:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1648:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1648:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1649:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3497);
            lv_values_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMaximumFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1665:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==21) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1665:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMaximumFunction3510); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1669:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1670:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1670:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1671:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3531);
            	    lv_values_4_0=ruleNumberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMaximumFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"NumberExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleMaximumFunction3545); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMaximumFunctionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMaximumFunction"


    // $ANTLR start "entryRuleMinimumFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1699:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1700:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1701:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction3581);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction3591); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMinimumFunction"


    // $ANTLR start "ruleMinimumFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1708:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleMinimumFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operator_0_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1711:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1712:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1712:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1712:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1712:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1713:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1713:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1714:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction3637);
            lv_operator_0_0=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMinimumFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"MinOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleMinimumFunction3649); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1734:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1735:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1735:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1736:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3670);
            lv_values_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMinimumFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1752:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==21) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1752:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMinimumFunction3683); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1756:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1757:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1757:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1758:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3704);
            	    lv_values_4_0=ruleNumberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMinimumFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"NumberExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleMinimumFunction3718); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getMinimumFunctionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMinimumFunction"


    // $ANTLR start "entryRuleAverageFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1786:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1787:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1788:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction3754);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction3764); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAverageFunction"


    // $ANTLR start "ruleAverageFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1795:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleAverageFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operator_0_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1798:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1799:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1799:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1799:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1799:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1800:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1800:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1801:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction3810);
            lv_operator_0_0=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAverageFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"AvgOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAverageFunction3822); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1821:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1822:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1822:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1823:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction3843);
            lv_values_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAverageFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1839:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1839:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAverageFunction3856); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1843:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1844:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1844:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1845:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction3877);
            	    lv_values_4_0=ruleNumberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAverageFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"NumberExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleAverageFunction3891); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAverageFunctionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAverageFunction"


    // $ANTLR start "entryRuleSumFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1873:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1874:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1875:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction3927);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction3937); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSumFunction"


    // $ANTLR start "ruleSumFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1882:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleSumFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operator_0_0 = null;

        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1885:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1886:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1886:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1886:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1886:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1887:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1887:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1888:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction3983);
            lv_operator_0_0=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSumFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"SumOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleSumFunction3995); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1908:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1909:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1909:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1910:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4016);
            lv_values_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSumFunctionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1926:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1926:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSumFunction4029); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1930:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1931:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1931:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1932:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction4050);
            	    lv_values_4_0=ruleNumberExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getSumFunctionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_4_0, 
            	              		"NumberExpression");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleSumFunction4064); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSumFunctionAccess().getRightParenthesisKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSumFunction"


    // $ANTLR start "entryRuleExponentialFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1960:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1961:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1962:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction4100);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction4110); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExponentialFunction"


    // $ANTLR start "ruleExponentialFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1969:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleExponentialFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_operator_0_0 = null;

        EObject lv_base_2_0 = null;

        EObject lv_exponent_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1972:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1973:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1973:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1973:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1973:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1974:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1974:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1975:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction4156);
            lv_operator_0_0=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExponentialFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"ExponentialOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleExponentialFunction4168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1995:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1996:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1996:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:1997:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4189);
            lv_base_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExponentialFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"base",
                      		lv_base_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleExponentialFunction4201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2017:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2018:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2018:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2019:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4222);
            lv_exponent_4_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getExponentialFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"exponent",
                      		lv_exponent_4_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_30_in_ruleExponentialFunction4234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getExponentialFunctionAccess().getRightParenthesisKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExponentialFunction"


    // $ANTLR start "entryRuleAbsoluteFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2047:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2048:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2049:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction4270);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction4280); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbsoluteFunction"


    // $ANTLR start "ruleAbsoluteFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2056:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2059:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2060:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2060:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2060:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2060:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2061:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2061:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2062:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction4326);
            lv_operator_0_0=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAbsoluteFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"AbsoluteOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleAbsoluteFunction4338); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2082:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2083:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2083:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2084:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction4359);
            lv_value_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAbsoluteFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleAbsoluteFunction4371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAbsoluteFunctionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAbsoluteFunction"


    // $ANTLR start "entryRuleNaturalLogarithmFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2112:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2113:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2114:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction4407);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction4417); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNaturalLogarithmFunction"


    // $ANTLR start "ruleNaturalLogarithmFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2121:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2124:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2125:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2125:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2125:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2125:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2126:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2126:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2127:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction4463);
            lv_operator_0_0=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNaturalLogarithmFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"NaturalLogarithmOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleNaturalLogarithmFunction4475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2147:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2148:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2148:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2149:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction4496);
            lv_value_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNaturalLogarithmFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleNaturalLogarithmFunction4508); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getNaturalLogarithmFunctionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNaturalLogarithmFunction"


    // $ANTLR start "entryRuleCommonLogarithmFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2177:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2178:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2179:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction4544);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction4554); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommonLogarithmFunction"


    // $ANTLR start "ruleCommonLogarithmFunction"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2186:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2189:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2190:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2190:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2190:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2190:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2191:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2191:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2192:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction4600);
            lv_operator_0_0=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommonLogarithmFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"operator",
                      		lv_operator_0_0, 
                      		"CommonLogarithmOperator");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleCommonLogarithmFunction4612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2212:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2213:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2213:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2214:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction4633);
            lv_value_2_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCommonLogarithmFunctionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"NumberExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleCommonLogarithmFunction4645); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCommonLogarithmFunctionAccess().getRightParenthesisKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCommonLogarithmFunction"


    // $ANTLR start "entryRuleParenthesizedExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2242:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2243:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2244:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4681);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression4691); if (state.failed) return current;

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
    // $ANTLR end "entryRuleParenthesizedExpression"


    // $ANTLR start "ruleParenthesizedExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2251:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2254:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2255:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2255:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2256:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression4732);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2263:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2264:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2264:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2265:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression4752);
            lv_value_1_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getRightParenthesisParserRuleCall_2()); 
                  
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression4768);
            ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleParenthesizedExpression"


    // $ANTLR start "entryRuleValueSpecification"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2297:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2298:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2299:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification4803);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification4813); if (state.failed) return current;

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
    // $ANTLR end "entryRuleValueSpecification"


    // $ANTLR start "ruleValueSpecification"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2306:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2309:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2310:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2310:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt29=3;
            alt29 = dfa29.predict(input);
            switch (alt29) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2311:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification4860);
                    this_LiteralValueExpression_0=ruleLiteralValueExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_LiteralValueExpression_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2321:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification4887);
                    this_InstanceSpecificationExpression_1=ruleInstanceSpecificationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_InstanceSpecificationExpression_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2331:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification4914);
                    this_ObjectSpecificationExpression_2=ruleObjectSpecificationExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ObjectSpecificationExpression_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleValueSpecification"


    // $ANTLR start "entryRuleObjectSpecificationExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2347:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2348:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2349:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression4949);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression4959); if (state.failed) return current;

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
    // $ANTLR end "entryRuleObjectSpecificationExpression"


    // $ANTLR start "ruleObjectSpecificationExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2356:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2359:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2360:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2360:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2360:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2360:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2361:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2361:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2362:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5007);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2375:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            else if ( (LA30_0==17) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2375:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2375:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2376:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2376:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2377:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5029);
                    lv_value_1_0=ruleCollection();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getObjectSpecificationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_1_0, 
                              		"Collection");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2394:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2394:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2395:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2395:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2396:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5056);
                    lv_value_2_0=ruleTuple();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getObjectSpecificationExpressionRule());
                      	        }
                             		set(
                             			current, 
                             			"value",
                              		lv_value_2_0, 
                              		"Tuple");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleObjectSpecificationExpression"


    // $ANTLR start "entryRuleCollection"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2420:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2421:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2422:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection5093);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection5103); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCollection"


    // $ANTLR start "ruleCollection"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2429:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2432:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2433:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2433:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2433:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleCollection5140); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2437:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2438:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2438:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2439:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5161);
            lv_values_1_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCollectionRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_1_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2455:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==21) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2455:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCollection5174); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2459:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2460:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2460:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2461:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection5195);
            	    lv_values_3_0=ruleValueSpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getCollectionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_3_0, 
            	              		"ValueSpecification");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleCollection5209); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getCollectionAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCollection"


    // $ANTLR start "entryRuleTuple"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2489:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2490:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2491:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple5245);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple5255); if (state.failed) return current;

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
    // $ANTLR end "entryRuleTuple"


    // $ANTLR start "ruleTuple"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2498:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2501:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2502:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2502:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2502:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple5292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2506:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2507:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2507:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2508:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple5313);
            lv_tuples_1_0=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getTupleRule());
              	        }
                     		add(
                     			current, 
                     			"tuples",
                      		lv_tuples_1_0, 
                      		"PropertyValuePair");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2524:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==21) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2524:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTuple5326); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2528:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2529:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2529:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2530:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple5347);
            	    lv_tuples_3_0=rulePropertyValuePair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getTupleRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"tuples",
            	              		lv_tuples_3_0, 
            	              		"PropertyValuePair");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTuple5361); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getTupleAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleTuple"


    // $ANTLR start "entryRulePropertyValuePair"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2558:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2559:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2560:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair5397);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair5407); if (state.failed) return current;

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
    // $ANTLR end "entryRulePropertyValuePair"


    // $ANTLR start "rulePropertyValuePair"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2567:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2570:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2571:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2571:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2571:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2571:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2572:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2572:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2573:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair5455);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,31,FOLLOW_31_in_rulePropertyValuePair5467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2590:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2591:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2591:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2592:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair5488);
            lv_value_2_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getPropertyValuePairRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "rulePropertyValuePair"


    // $ANTLR start "entryRuleInstanceSpecificationExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2616:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2617:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2618:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression5524);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression5534); if (state.failed) return current;

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
    // $ANTLR end "entryRuleInstanceSpecificationExpression"


    // $ANTLR start "ruleInstanceSpecificationExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2625:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2628:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2629:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2629:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2630:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2630:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2631:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression5581);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleInstanceSpecificationExpression"


    // $ANTLR start "entryRuleLiteralValueExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2652:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2653:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2654:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression5616);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression5626); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLiteralValueExpression"


    // $ANTLR start "ruleLiteralValueExpression"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2661:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2664:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2665:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2665:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt33=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt33=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt33=2;
                }
                break;
            case RULE_NULL:
                {
                alt33=3;
                }
                break;
            case RULE_STRING:
                {
                alt33=4;
                }
                break;
            case 32:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2666:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression5673);
                    this_NumberLiteral_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberLiteral_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2676:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression5700);
                    this_BooleanLiteral_1=ruleBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2686:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression5727);
                    this_NullLiteral_2=ruleNullLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NullLiteral_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2696:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression5754);
                    this_StringLiteral_3=ruleStringLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_StringLiteral_3; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2706:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression5781);
                    this_UnlimitedLiteral_4=ruleUnlimitedLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_UnlimitedLiteral_4; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLiteralValueExpression"


    // $ANTLR start "entryRuleBooleanLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2722:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2723:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2724:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5816);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5826); if (state.failed) return current;

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
    // $ANTLR end "entryRuleBooleanLiteral"


    // $ANTLR start "ruleBooleanLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2731:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2734:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2735:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2735:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2736:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2736:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2737:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral5867); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getBooleanLiteralAccess().getValueEBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"EBOOLEAN");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleBooleanLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2761:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2762:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2763:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5907);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral5917); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2770:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2773:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2774:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2774:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2775:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2775:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2776:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral5962);
            lv_value_0_0=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNumberLiteralRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"Number");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "entryRuleNullLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2800:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2801:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2802:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5997);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral6007); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNullLiteral"


    // $ANTLR start "ruleNullLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2809:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2812:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2813:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2813:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2814:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2814:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2815:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral6048); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getNullLiteralAccess().getValueNULLTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNullLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"NULL");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNullLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2839:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2840:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2841:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6088);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral6098); if (state.failed) return current;

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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2848:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2851:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2852:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2852:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2853:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2853:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2854:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral6139); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getStringLiteralRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"value",
                      		lv_value_0_0, 
                      		"STRING");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleUnlimitedLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2878:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2879:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2880:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral6179);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral6189); if (state.failed) return current;

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
    // $ANTLR end "entryRuleUnlimitedLiteral"


    // $ANTLR start "ruleUnlimitedLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2887:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2890:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2891:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2891:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2892:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2892:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2893:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,32,FOLLOW_32_in_ruleUnlimitedLiteral6231); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      newLeafNode(lv_value_0_0, grammarAccess.getUnlimitedLiteralAccess().getValueAsteriskKeyword_0());
                  
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getUnlimitedLiteralRule());
              	        }
                     		setWithLastConsumed(current, "value", lv_value_0_0, "*");
              	    
            }

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleUnlimitedLiteral"


    // $ANTLR start "entryRuleOrOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2914:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2915:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2916:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator6279);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator6289); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrOperator"


    // $ANTLR start "ruleOrOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2923:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2926:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2927:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2927:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2927:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2927:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2933:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==33) ) {
                alt34=1;
            }
            else if ( (LA34_0==34) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2933:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleOrOperator6336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2938:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleOrOperator6354); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getOrOperatorAccess().getVerticalLineVerticalLineKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrOperator"


    // $ANTLR start "entryRuleXOrOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2950:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2951:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2952:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator6391);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator6401); if (state.failed) return current;

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
    // $ANTLR end "entryRuleXOrOperator"


    // $ANTLR start "ruleXOrOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2959:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2962:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2963:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2963:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2963:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2963:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2964:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2969:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==35) ) {
                alt35=1;
            }
            else if ( (LA35_0==36) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2969:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleXOrOperator6448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2974:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleXOrOperator6466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getXOrOperatorAccess().getCircumflexAccentKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXOrOperator"


    // $ANTLR start "entryRuleAndOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2986:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2987:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2988:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator6503);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator6513); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndOperator"


    // $ANTLR start "ruleAndOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2995:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2998:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2999:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2999:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2999:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:2999:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3000:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3005:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            else if ( (LA36_0==38) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3005:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAndOperator6560); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3010:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleAndOperator6578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAndOperatorAccess().getAmpersandAmpersandKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndOperator"


    // $ANTLR start "entryRuleImplicationOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3022:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3023:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3024:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator6615);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator6625); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImplicationOperator"


    // $ANTLR start "ruleImplicationOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3031:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3034:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3035:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3035:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3035:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3035:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3036:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3041:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==39) ) {
                alt37=1;
            }
            else if ( (LA37_0==40) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3041:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleImplicationOperator6672); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3046:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleImplicationOperator6690); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getImplicationOperatorAccess().getHyphenMinusGreaterThanSignKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImplicationOperator"


    // $ANTLR start "entryRuleEqualsOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3058:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3059:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3060:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator6727);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator6737); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEqualsOperator"


    // $ANTLR start "ruleEqualsOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3067:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3070:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3071:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3071:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3071:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3071:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3072:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,41,FOLLOW_41_in_ruleEqualsOperator6783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEqualsOperatorAccess().getEqualsSignEqualsSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleEqualsOperator"


    // $ANTLR start "entryRuleNotEqualsOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3089:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3090:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3091:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator6819);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator6829); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotEqualsOperator"


    // $ANTLR start "ruleNotEqualsOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3098:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3101:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3102:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3102:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3102:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3102:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3103:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3108:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==42) ) {
                alt38=1;
            }
            else if ( (LA38_0==43) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3108:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleNotEqualsOperator6876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3113:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleNotEqualsOperator6894); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNotEqualsOperatorAccess().getLessThanSignGreaterThanSignKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotEqualsOperator"


    // $ANTLR start "entryRuleNotOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3125:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3126:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3127:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator6931);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator6941); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNotOperator"


    // $ANTLR start "ruleNotOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3134:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3137:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3138:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3138:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3138:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3138:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3139:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3144:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==44) ) {
                alt39=1;
            }
            else if ( (LA39_0==45) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3144:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleNotOperator6988); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3149:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,45,FOLLOW_45_in_ruleNotOperator7006); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getNotOperatorAccess().getNotKeyword_1_1());
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNotOperator"


    // $ANTLR start "entryRuleGreaterThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3161:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3162:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3163:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7043);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator7053); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGreaterThanOperator"


    // $ANTLR start "ruleGreaterThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3170:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3173:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3174:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3174:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3174:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3174:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3175:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleGreaterThanOperator7099); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGreaterThanOperatorAccess().getGreaterThanSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGreaterThanOperator"


    // $ANTLR start "entryRuleGreaterOrEqualThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3192:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3193:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3194:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7135);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7145); if (state.failed) return current;

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
    // $ANTLR end "entryRuleGreaterOrEqualThanOperator"


    // $ANTLR start "ruleGreaterOrEqualThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3201:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3204:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3205:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3205:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3205:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3205:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3206:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleGreaterOrEqualThanOperator7191); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterThanSignEqualsSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGreaterOrEqualThanOperator"


    // $ANTLR start "entryRuleLessThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3223:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3224:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3225:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator7227);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator7237); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLessThanOperator"


    // $ANTLR start "ruleLessThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3232:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3235:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3236:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3236:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3236:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3236:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3237:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleLessThanOperator7283); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLessThanOperatorAccess().getLessThanSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLessThanOperator"


    // $ANTLR start "entryRuleLessOrEqualThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3254:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3255:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3256:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator7319);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator7329); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLessOrEqualThanOperator"


    // $ANTLR start "ruleLessOrEqualThanOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3263:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3266:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3267:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3267:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3267:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3267:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3268:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleLessOrEqualThanOperator7375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLessOrEqualThanOperatorAccess().getLessThanSignEqualsSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLessOrEqualThanOperator"


    // $ANTLR start "entryRuleAdditionOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3285:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3286:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3287:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator7411);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator7421); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAdditionOperator"


    // $ANTLR start "ruleAdditionOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3294:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3297:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3298:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3298:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3298:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3298:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3299:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleAdditionOperator7467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAdditionOperatorAccess().getPlusSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAdditionOperator"


    // $ANTLR start "entryRuleSubstractionOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3316:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3317:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3318:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator7503);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator7513); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSubstractionOperator"


    // $ANTLR start "ruleSubstractionOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3325:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3328:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3329:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3329:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3329:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3329:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3330:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleSubstractionOperator7559); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSubstractionOperatorAccess().getHyphenMinusKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSubstractionOperator"


    // $ANTLR start "entryRuleMultiplicationOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3347:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3348:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3349:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7595);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator7605); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMultiplicationOperator"


    // $ANTLR start "ruleMultiplicationOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3356:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3359:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3360:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3360:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3360:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3360:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3361:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_32_in_ruleMultiplicationOperator7651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMultiplicationOperatorAccess().getAsteriskKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMultiplicationOperator"


    // $ANTLR start "entryRuleDivisionOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3378:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3379:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3380:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7687);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator7697); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDivisionOperator"


    // $ANTLR start "ruleDivisionOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3387:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3390:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3391:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3391:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3391:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3391:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3392:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleDivisionOperator7743); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDivisionOperatorAccess().getSolidusKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDivisionOperator"


    // $ANTLR start "entryRuleModulusOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3409:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3410:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3411:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator7779);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator7789); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModulusOperator"


    // $ANTLR start "ruleModulusOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3418:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3421:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3422:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3422:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3422:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3422:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3423:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleModulusOperator7835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getModulusOperatorAccess().getPercentSignKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleModulusOperator"


    // $ANTLR start "entryRuleMaxOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3440:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3441:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3442:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator7871);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator7881); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMaxOperator"


    // $ANTLR start "ruleMaxOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3449:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3452:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3453:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3453:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3453:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3453:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3454:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleMaxOperator7927); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaxOperatorAccess().getMaxKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMaxOperator"


    // $ANTLR start "entryRuleMinOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3471:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3472:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3473:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator7963);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator7973); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMinOperator"


    // $ANTLR start "ruleMinOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3480:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3483:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3484:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3484:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3484:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3484:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleMinOperator8019); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinOperatorAccess().getMinKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleMinOperator"


    // $ANTLR start "entryRuleAvgOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3502:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3503:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3504:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8055);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator8065); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAvgOperator"


    // $ANTLR start "ruleAvgOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3511:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3514:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3515:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3515:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3515:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3515:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3516:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleAvgOperator8111); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAvgOperatorAccess().getAvgKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAvgOperator"


    // $ANTLR start "entryRuleSumOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3533:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3534:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3535:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator8147);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator8157); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSumOperator"


    // $ANTLR start "ruleSumOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3542:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3545:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3546:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3546:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3546:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3546:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3547:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleSumOperator8203); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumOperatorAccess().getSumKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleSumOperator"


    // $ANTLR start "entryRuleExponentialOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3564:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3565:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3566:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator8239);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator8249); if (state.failed) return current;

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
    // $ANTLR end "entryRuleExponentialOperator"


    // $ANTLR start "ruleExponentialOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3573:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3576:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3577:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3577:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3577:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3577:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3578:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleExponentialOperator8295); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialOperatorAccess().getExpKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExponentialOperator"


    // $ANTLR start "entryRuleAbsoluteOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3595:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3596:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3597:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator8331);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator8341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAbsoluteOperator"


    // $ANTLR start "ruleAbsoluteOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3604:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3607:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3608:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3608:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3608:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3608:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleAbsoluteOperator8387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteOperatorAccess().getAbsKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAbsoluteOperator"


    // $ANTLR start "entryRuleNaturalLogarithmOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3626:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3627:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3628:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator8423);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator8433); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNaturalLogarithmOperator"


    // $ANTLR start "ruleNaturalLogarithmOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3635:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3638:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3639:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3639:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3639:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3639:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleNaturalLogarithmOperator8479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmOperatorAccess().getLnKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNaturalLogarithmOperator"


    // $ANTLR start "entryRuleCommonLogarithmOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3657:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3658:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3659:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator8515);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator8525); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCommonLogarithmOperator"


    // $ANTLR start "ruleCommonLogarithmOperator"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3666:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3669:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3670:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3670:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3670:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3670:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleCommonLogarithmOperator8571); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmOperatorAccess().getLogKeyword_1());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleCommonLogarithmOperator"


    // $ANTLR start "entryRuleLeftParenthesis"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3688:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3689:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3690:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis8608);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis8619); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLeftParenthesis"


    // $ANTLR start "ruleLeftParenthesis"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3697:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3700:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3702:2: kw= '('
            {
            kw=(Token)match(input,29,FOLLOW_29_in_ruleLeftParenthesis8656); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getLeftParenthesisAccess().getLeftParenthesisKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleLeftParenthesis"


    // $ANTLR start "entryRuleRightParenthesis"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3715:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3716:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3717:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis8696);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis8707); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRightParenthesis"


    // $ANTLR start "ruleRightParenthesis"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3724:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3727:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3729:2: kw= ')'
            {
            kw=(Token)match(input,30,FOLLOW_30_in_ruleRightParenthesis8744); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getRightParenthesisAccess().getRightParenthesisKeyword()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRightParenthesis"


    // $ANTLR start "entryRuleQualifiedName"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3742:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3743:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3744:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8784);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8795); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3751:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3754:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3755:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3755:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3755:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3762:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==62) && (synpred1_InternalTSL())) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3762:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3762:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3762:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,62,FOLLOW_62_in_ruleQualifiedName8863); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8879); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3785:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3786:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3787:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8927);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8938); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3794:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3797:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3798:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3798:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3799:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8985);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3809:1: (kw= '.*' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==63) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3810:2: kw= '.*'
                    {
                    kw=(Token)match(input,63,FOLLOW_63_in_ruleQualifiedNameWithWildcard9004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleImportNamespace"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3827:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3828:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3829:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9050);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace9060); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImportNamespace"


    // $ANTLR start "ruleImportNamespace"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3836:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3839:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3840:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3840:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3840:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_64_in_ruleImportNamespace9097); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3844:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3845:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3845:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3846:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9118);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getImportNamespaceRule());
              	        }
                     		set(
                     			current, 
                     			"importedNamespace",
                      		lv_importedNamespace_1_0, 
                      		"QualifiedNameWithWildcard");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImportNamespace"


    // $ANTLR start "entryRuleNumber"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3870:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3871:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3872:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber9155);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber9166); if (state.failed) return current;

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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3879:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3882:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3883:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3883:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt42=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt42=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt42=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt42=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt42=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }

            switch (alt42) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3883:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber9206); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3891:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber9232); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3899:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber9258); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3907:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber9284); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_EBIGDECIMAL_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_EBIGDECIMAL_3, grammarAccess.getNumberAccess().getEBIGDECIMALTerminalRuleCall_3()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleImpact"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3922:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3923:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3924:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact9330);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact9341); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImpact"


    // $ANTLR start "ruleImpact"
    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3931:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3934:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3935:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3935:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_SMALL_DECIMAL) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3935:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact9381); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3943:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact9407); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_1, grammarAccess.getImpactAccess().getSMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImpact"

    // $ANTLR start synpred1_InternalTSL
    public final void synpred1_InternalTSL_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3762:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.tsl/src-gen/eu/artist/postmigration/nfrvt/lang/tsl/parser/antlr/internal/InternalTSL.g:3763:2: '.'
        {
        match(input,62,FOLLOW_62_in_synpred1_InternalTSL8854); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalTSL

    // Delegated rules

    public final boolean synpred1_InternalTSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalTSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA29 dfa29 = new DFA29(this);
    static final String DFA18_eotS =
        "\13\uffff";
    static final String DFA18_eofS =
        "\2\uffff\1\11\7\uffff\1\11";
    static final String DFA18_minS =
        "\1\4\1\uffff\1\21\4\uffff\1\4\2\uffff\1\21";
    static final String DFA18_maxS =
        "\1\75\1\uffff\1\76\4\uffff\1\4\2\uffff\1\76";
    static final String DFA18_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA18_specialS =
        "\13\uffff}>";
    static final String[] DFA18_transitionS = {
            "\1\2\1\4\1\uffff\1\3\4\1\21\uffff\1\6\2\uffff\1\5\25\uffff"+
            "\10\1",
            "",
            "\1\10\7\uffff\1\10\4\uffff\1\11\2\uffff\13\11\2\uffff\4\11"+
            "\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\10\7\uffff\1\10\4\uffff\1\11\2\uffff\13\11\2\uffff\4\11"+
            "\14\uffff\1\7"
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1170:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA29_eotS =
        "\7\uffff";
    static final String DFA29_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA29_minS =
        "\1\4\1\uffff\1\21\1\4\2\uffff\1\21";
    static final String DFA29_maxS =
        "\1\40\1\uffff\1\76\1\4\2\uffff\1\76";
    static final String DFA29_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA29_specialS =
        "\7\uffff}>";
    static final String[] DFA29_transitionS = {
            "\1\2\7\1\24\uffff\1\1",
            "",
            "\1\4\1\5\2\uffff\1\5\3\uffff\1\4\1\5\43\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\5\2\uffff\1\5\3\uffff\1\4\1\5\43\uffff\1\3"
    };

    static final short[] DFA29_eot = DFA.unpackEncodedString(DFA29_eotS);
    static final short[] DFA29_eof = DFA.unpackEncodedString(DFA29_eofS);
    static final char[] DFA29_min = DFA.unpackEncodedStringToUnsignedChars(DFA29_minS);
    static final char[] DFA29_max = DFA.unpackEncodedStringToUnsignedChars(DFA29_maxS);
    static final short[] DFA29_accept = DFA.unpackEncodedString(DFA29_acceptS);
    static final short[] DFA29_special = DFA.unpackEncodedString(DFA29_specialS);
    static final short[][] DFA29_transition;

    static {
        int numStates = DFA29_transitionS.length;
        DFA29_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA29_transition[i] = DFA.unpackEncodedString(DFA29_transitionS[i]);
        }
    }

    class DFA29 extends DFA {

        public DFA29(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 29;
            this.eot = DFA29_eot;
            this.eof = DFA29_eof;
            this.min = DFA29_min;
            this.max = DFA29_max;
            this.accept = DFA29_accept;
            this.special = DFA29_special;
            this.transition = DFA29_transition;
        }
        public String getDescription() {
            return "2310:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_rulePatternCatalogue_in_entryRulePatternCatalogue75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternCatalogue85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_rulePatternCatalogue131 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000001L});
    public static final BitSet FOLLOW_16_in_rulePatternCatalogue144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePatternCatalogue165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePatternCatalogue177 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_rulePattern_in_rulePatternCatalogue198 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_rulePatternCatalogue211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePattern_in_entryRulePattern247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePattern257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rulePattern294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePattern311 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePattern328 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePattern340 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern357 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePattern374 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_rulePattern386 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern403 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_rulePattern420 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePattern432 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_rulePattern449 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_rulePattern467 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePattern479 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePattern491 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_rulePattern512 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_rulePattern525 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_rulePattern546 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_rulePattern560 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_rulePattern575 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_rulePattern587 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePattern599 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePatternImpact_in_rulePattern620 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_rulePattern633 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePatternImpact_in_rulePattern654 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_rulePattern668 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_rulePattern683 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_rulePattern695 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePattern707 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePattern730 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_rulePattern743 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePattern766 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_rulePattern780 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_rulePattern794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePatternImpact_in_entryRulePatternImpact830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePatternImpact840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePatternImpact888 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleImpact_in_rulePatternImpact909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyImpact_in_entryRulePropertyImpact945 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyImpact955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyImpact1003 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_ruleImpact_in_rulePropertyImpact1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression1060 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication1207 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication1237 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication1258 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction1296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction1353 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction1385 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction1404 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction1428 = new BitSet(new long[]{0x0000001E00000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1466 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction1523 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction1553 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction1574 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison1669 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison1701 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison1720 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison1744 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit1782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit1792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit1839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit1866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit1893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation1984 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation2005 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression2041 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression2051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2098 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression2130 = new BitSet(new long[]{0x3FC0000120000FB0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression2168 = new BitSet(new long[]{0x3FC0000120000FB0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression2206 = new BitSet(new long[]{0x3FC0000120000FB0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression2244 = new BitSet(new long[]{0x3FC0000120000FB0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression2267 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression2305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression2315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression2497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression2524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2559 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression2569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression2615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression2659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2706 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression2738 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression2757 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2781 = new BitSet(new long[]{0x000C000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2876 = new BitSet(new long[]{0x0030000100000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression2908 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression2927 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression2946 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2970 = new BitSet(new long[]{0x0030000100000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression3008 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction3127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction3137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction3238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction3265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction3292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction3319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction3373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction3408 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction3418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction3464 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMaximumFunction3476 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3497 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleMaximumFunction3510 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3531 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleMaximumFunction3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction3581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction3591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction3637 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleMinimumFunction3649 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3670 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleMinimumFunction3683 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3704 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleMinimumFunction3718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction3754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction3764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction3810 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAverageFunction3822 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction3843 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageFunction3856 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction3877 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleAverageFunction3891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction3927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction3937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction3983 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSumFunction3995 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4016 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_21_in_ruleSumFunction4029 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction4050 = new BitSet(new long[]{0x0000000040200000L});
    public static final BitSet FOLLOW_30_in_ruleSumFunction4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction4100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction4156 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleExponentialFunction4168 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4189 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExponentialFunction4201 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction4222 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleExponentialFunction4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction4270 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction4326 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAbsoluteFunction4338 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction4359 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAbsoluteFunction4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction4407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction4417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction4463 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleNaturalLogarithmFunction4475 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction4496 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleNaturalLogarithmFunction4508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction4544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction4554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction4600 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleCommonLogarithmFunction4612 = new BitSet(new long[]{0x3FC0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction4633 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleCommonLogarithmFunction4645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4681 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression4691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression4732 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression4752 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression4768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification4803 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification4813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification4860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification4887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification4914 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression4949 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression4959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression5007 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression5029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression5056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection5093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection5103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCollection5140 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5161 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleCollection5174 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection5195 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleCollection5209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple5245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple5255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple5292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple5313 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleTuple5326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple5347 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleTuple5361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair5397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair5407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair5455 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePropertyValuePair5467 = new BitSet(new long[]{0x3FC0300120000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair5488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression5524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression5616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression5626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression5673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression5700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression5727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression5754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression5781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5816 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral5867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral5962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5997 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral6007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral6048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral6088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral6098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral6139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral6179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral6189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleUnlimitedLiteral6231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator6279 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator6289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleOrOperator6336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleOrOperator6354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator6391 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleXOrOperator6448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleXOrOperator6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator6503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator6513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAndOperator6560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleAndOperator6578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator6615 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator6625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleImplicationOperator6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleImplicationOperator6690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator6727 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator6737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleEqualsOperator6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator6819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator6829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNotEqualsOperator6876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNotEqualsOperator6894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator6931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator6941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleNotOperator6988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleNotOperator7006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator7043 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator7053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleGreaterThanOperator7099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator7135 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator7145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleGreaterOrEqualThanOperator7191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator7227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator7237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleLessThanOperator7283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator7319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator7329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleLessOrEqualThanOperator7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator7411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator7421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleAdditionOperator7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator7503 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator7513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleSubstractionOperator7559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator7605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleMultiplicationOperator7651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator7697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleDivisionOperator7743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator7779 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator7789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleModulusOperator7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator7871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleMaxOperator7927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator7963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator7973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleMinOperator8019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator8055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleAvgOperator8111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator8147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleSumOperator8203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator8239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator8249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleExponentialOperator8295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator8331 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator8341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleAbsoluteOperator8387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator8423 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator8433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNaturalLogarithmOperator8479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator8515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator8525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleCommonLogarithmOperator8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis8608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleLeftParenthesis8656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis8696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis8707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleRightParenthesis8744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8835 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleQualifiedName8863 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8879 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8985 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleQualifiedNameWithWildcard9004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace9050 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleImportNamespace9097 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace9118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber9155 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber9206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber9232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber9258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber9284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact9330 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact9341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact9381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact9407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_synpred1_InternalTSL8854 = new BitSet(new long[]{0x0000000000000002L});

}