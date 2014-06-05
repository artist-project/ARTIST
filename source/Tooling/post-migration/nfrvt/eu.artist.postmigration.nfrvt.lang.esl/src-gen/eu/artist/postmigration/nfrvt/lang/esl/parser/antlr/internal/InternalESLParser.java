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
package eu.artist.postmigration.nfrvt.lang.esl.parser.antlr.internal; 

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
import eu.artist.postmigration.nfrvt.lang.esl.services.ESLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalESLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'strategy-catalogue'", "'{'", "'}'", "'strategy'", "'javaClass'", "','", "'description'", "'level'", "'evaluates'", "'['", "']'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'model'", "'code'"
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


        public InternalESLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalESLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalESLParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g"; }



     	private ESLGrammarAccess grammarAccess;
     	
        public InternalESLParser(TokenStream input, ESLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "EvaluationStrategyCatalogue";	
       	}
       	
       	@Override
       	protected ESLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleEvaluationStrategyCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:68:1: entryRuleEvaluationStrategyCatalogue returns [EObject current=null] : iv_ruleEvaluationStrategyCatalogue= ruleEvaluationStrategyCatalogue EOF ;
    public final EObject entryRuleEvaluationStrategyCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategyCatalogue = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:69:2: (iv_ruleEvaluationStrategyCatalogue= ruleEvaluationStrategyCatalogue EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:70:2: iv_ruleEvaluationStrategyCatalogue= ruleEvaluationStrategyCatalogue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEvaluationStrategyCatalogueRule()); 
            }
            pushFollow(FOLLOW_ruleEvaluationStrategyCatalogue_in_entryRuleEvaluationStrategyCatalogue75);
            iv_ruleEvaluationStrategyCatalogue=ruleEvaluationStrategyCatalogue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvaluationStrategyCatalogue; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategyCatalogue85); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvaluationStrategyCatalogue"


    // $ANTLR start "ruleEvaluationStrategyCatalogue"
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:77:1: ruleEvaluationStrategyCatalogue returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'strategy-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_strategies_4_0= ruleEvaluationStrategy ) )* otherlv_5= '}' ) ;
    public final EObject ruleEvaluationStrategyCatalogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_strategies_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:80:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'strategy-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_strategies_4_0= ruleEvaluationStrategy ) )* otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'strategy-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_strategies_4_0= ruleEvaluationStrategy ) )* otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'strategy-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_strategies_4_0= ruleEvaluationStrategy ) )* otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'strategy-catalogue' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' ( (lv_strategies_4_0= ruleEvaluationStrategy ) )* otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==62) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:83:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEvaluationStrategyCatalogueAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_ruleEvaluationStrategyCatalogue131);
            	    lv_imports_0_0=ruleImportNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyCatalogueRule());
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleEvaluationStrategyCatalogue144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getEvaluationStrategyCatalogueAccess().getStrategyCatalogueKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:105:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEvaluationStrategyCatalogueAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategyCatalogue165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyCatalogueRule());
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationStrategyCatalogue177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getEvaluationStrategyCatalogueAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:125:1: ( (lv_strategies_4_0= ruleEvaluationStrategy ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==19) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:126:1: (lv_strategies_4_0= ruleEvaluationStrategy )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:126:1: (lv_strategies_4_0= ruleEvaluationStrategy )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:127:3: lv_strategies_4_0= ruleEvaluationStrategy
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEvaluationStrategyCatalogueAccess().getStrategiesEvaluationStrategyParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEvaluationStrategy_in_ruleEvaluationStrategyCatalogue198);
            	    lv_strategies_4_0=ruleEvaluationStrategy();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyCatalogueRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"strategies",
            	              		lv_strategies_4_0, 
            	              		"EvaluationStrategy");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationStrategyCatalogue211); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getEvaluationStrategyCatalogueAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleEvaluationStrategyCatalogue"


    // $ANTLR start "entryRuleEvaluationStrategy"
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:155:1: entryRuleEvaluationStrategy returns [EObject current=null] : iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF ;
    public final EObject entryRuleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvaluationStrategy = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:156:2: (iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:157:2: iv_ruleEvaluationStrategy= ruleEvaluationStrategy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEvaluationStrategyRule()); 
            }
            pushFollow(FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy247);
            iv_ruleEvaluationStrategy=ruleEvaluationStrategy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvaluationStrategy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEvaluationStrategy257); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEvaluationStrategy"


    // $ANTLR start "ruleEvaluationStrategy"
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:164:1: ruleEvaluationStrategy returns [EObject current=null] : (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ',' )? otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) ) ) otherlv_11= ',' otherlv_12= 'evaluates' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= '}' ) ;
    public final EObject ruleEvaluationStrategy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Enumerator lv_level_10_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:167:28: ( (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ',' )? otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) ) ) otherlv_11= ',' otherlv_12= 'evaluates' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:168:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ',' )? otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) ) ) otherlv_11= ',' otherlv_12= 'evaluates' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:168:1: (otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ',' )? otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) ) ) otherlv_11= ',' otherlv_12= 'evaluates' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:168:3: otherlv_0= 'strategy' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ',' )? otherlv_6= 'description' ( (lv_description_7_0= RULE_STRING ) ) (otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) ) ) otherlv_11= ',' otherlv_12= 'evaluates' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleEvaluationStrategy294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getEvaluationStrategyAccess().getStrategyKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:172:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:173:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:173:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:174:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleEvaluationStrategy311); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getEvaluationStrategyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleEvaluationStrategy328); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getEvaluationStrategyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:194:1: (otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ',' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:194:3: otherlv_3= 'javaClass' ( ( ruleQualifiedName ) ) otherlv_5= ','
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleEvaluationStrategy341); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getEvaluationStrategyAccess().getJavaClassKeyword_3_0());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:198:1: ( ( ruleQualifiedName ) )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:199:1: ( ruleQualifiedName )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:199:1: ( ruleQualifiedName )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:200:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getJavaClassJvmDeclaredTypeCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy364);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleEvaluationStrategy376); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_3_2());
                          
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,22,FOLLOW_22_in_ruleEvaluationStrategy390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getEvaluationStrategyAccess().getDescriptionKeyword_4());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:221:1: ( (lv_description_7_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:222:1: (lv_description_7_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:222:1: (lv_description_7_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:223:3: lv_description_7_0= RULE_STRING
            {
            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleEvaluationStrategy407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_description_7_0, grammarAccess.getEvaluationStrategyAccess().getDescriptionSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"description",
                      		lv_description_7_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:239:2: (otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:239:4: otherlv_8= ',' otherlv_9= 'level' ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) )
            {
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleEvaluationStrategy425); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_6_0());
                  
            }
            otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleEvaluationStrategy437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getEvaluationStrategyAccess().getLevelKeyword_6_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:247:1: ( (lv_level_10_0= ruleEvaluationStrategyLevelKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:248:1: (lv_level_10_0= ruleEvaluationStrategyLevelKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:248:1: (lv_level_10_0= ruleEvaluationStrategyLevelKind )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:249:3: lv_level_10_0= ruleEvaluationStrategyLevelKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getLevelEvaluationStrategyLevelKindEnumRuleCall_6_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEvaluationStrategyLevelKind_in_ruleEvaluationStrategy458);
            lv_level_10_0=ruleEvaluationStrategyLevelKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getEvaluationStrategyRule());
              	        }
                     		set(
                     			current, 
                     			"level",
                      		lv_level_10_0, 
                      		"EvaluationStrategyLevelKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleEvaluationStrategy471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_7());
                  
            }
            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleEvaluationStrategy483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getEvaluationStrategyAccess().getEvaluatesKeyword_8());
                  
            }
            otherlv_13=(Token)match(input,25,FOLLOW_25_in_ruleEvaluationStrategy495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getEvaluationStrategyAccess().getLeftSquareBracketKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:277:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:278:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:278:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:279:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getPropertiesQuantitativePropertyCrossReference_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy518);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:292:2: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:292:4: otherlv_15= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleEvaluationStrategy531); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getEvaluationStrategyAccess().getCommaKeyword_11_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:296:1: ( ( ruleQualifiedName ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:297:1: ( ruleQualifiedName )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:297:1: ( ruleQualifiedName )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:298:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getEvaluationStrategyRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEvaluationStrategyAccess().getPropertiesQuantitativePropertyCrossReference_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy554);
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
            	    break loop4;
                }
            } while (true);

            otherlv_17=(Token)match(input,26,FOLLOW_26_in_ruleEvaluationStrategy568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getEvaluationStrategyAccess().getRightSquareBracketKeyword_12());
                  
            }
            otherlv_18=(Token)match(input,18,FOLLOW_18_in_ruleEvaluationStrategy580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getEvaluationStrategyAccess().getRightCurlyBracketKeyword_13());
                  
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
    // $ANTLR end "ruleEvaluationStrategy"


    // $ANTLR start "entryRuleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:327:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:328:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:329:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression616);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression626); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:336:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:339:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:341:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression672);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:357:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:358:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:359:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication706);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication716); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:366:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:369:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:370:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:370:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:371:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication763);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:379:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=37 && LA5_0<=38)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:379:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:379:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:380:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:385:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:386:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:386:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:387:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication793);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:403:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:404:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:404:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:405:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication814);
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
            	    break loop5;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:429:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:430:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:431:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction852);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction862); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:438:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:441:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:442:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:442:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:443:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction909);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:451:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=31 && LA7_0<=34)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:451:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:451:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:452:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:457:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:458:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:458:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:459:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:459:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( ((LA6_0>=31 && LA6_0<=32)) ) {
            	        alt6=1;
            	    }
            	    else if ( ((LA6_0>=33 && LA6_0<=34)) ) {
            	        alt6=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:460:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction941);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:475:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction960);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:493:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:494:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:494:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:495:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction984);
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
            	    break loop7;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:519:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:520:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:521:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction1022);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction1032); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:528:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:531:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:532:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:532:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:533:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction1079);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:541:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=35 && LA8_0<=36)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:541:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:541:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:542:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:547:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:548:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:548:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:549:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction1109);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:565:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:566:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:566:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:567:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction1130);
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
            	    break loop8;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:591:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:592:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:593:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison1168);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison1178); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:600:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:603:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:604:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:604:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:605:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison1225);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:613:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=39 && LA10_0<=41)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:613:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:613:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:614:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:619:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:620:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:620:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:621:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:621:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt9=2;
            	    int LA9_0 = input.LA(1);

            	    if ( (LA9_0==39) ) {
            	        alt9=1;
            	    }
            	    else if ( ((LA9_0>=40 && LA9_0<=41)) ) {
            	        alt9=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt9) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:622:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison1257);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:637:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison1276);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:655:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:656:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:656:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:657:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison1300);
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
            	    break loop10;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:681:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:682:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:683:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit1338);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit1348); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:690:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:693:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:694:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:694:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 42:
            case 43:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_NULL:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 27:
            case 30:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                {
                alt11=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:695:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit1395);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:705:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit1422);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:715:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit1449);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:731:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:732:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:733:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation1484);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation1494); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:740:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:743:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:744:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:744:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:744:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:744:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:745:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:745:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:746:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation1540);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:762:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:763:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:763:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:764:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation1561);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:788:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:789:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:790:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1597);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression1607); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:797:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:800:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:801:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:801:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:802:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1654);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=44 && LA13_0<=47)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt12=4;
            	    switch ( input.LA(1) ) {
            	    case 44:
            	        {
            	        alt12=1;
            	        }
            	        break;
            	    case 45:
            	        {
            	        alt12=2;
            	        }
            	        break;
            	    case 47:
            	        {
            	        alt12=3;
            	        }
            	        break;
            	    case 46:
            	        {
            	        alt12=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 12, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt12) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:810:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:811:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:816:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:817:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:817:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:818:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression1686);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:835:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:835:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:835:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:835:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:836:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:841:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:842:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:842:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:843:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression1724);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:860:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:860:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:860:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:860:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:861:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:866:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:867:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:867:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:868:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression1762);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:885:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:885:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:885:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:885:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:886:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:891:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:892:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:892:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:893:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression1800);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:909:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:910:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:910:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:911:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1823);
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
            	    break loop13;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:935:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:936:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:937:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1861);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression1871); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:944:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:947:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:948:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:948:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt14=7;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:949:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression1918);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:959:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression1945);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:969:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression1972);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:979:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression1999);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:989:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression2026);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:999:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression2053);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1009:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression2080);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1025:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1026:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1027:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2115);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression2125); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1034:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1037:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1039:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression2171);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1055:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1056:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1057:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2205);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression2215); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1064:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1067:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1068:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1068:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1069:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2262);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1077:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=48 && LA16_0<=49)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1077:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1077:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1078:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1083:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1084:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1084:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1085:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1085:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==49) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==48) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1086:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression2294);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1101:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression2313);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1119:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1120:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1120:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1121:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2337);
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
            	    break loop16;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1145:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1146:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1147:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2375);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression2385); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1154:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1157:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1158:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1158:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1159:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2432);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1167:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==30||(LA18_0>=50 && LA18_0<=51)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1167:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1167:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1168:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1173:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1174:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1174:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1175:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1175:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt17=3;
            	    switch ( input.LA(1) ) {
            	    case 30:
            	        {
            	        alt17=1;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt17=2;
            	        }
            	        break;
            	    case 51:
            	        {
            	        alt17=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt17) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1176:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression2464);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1191:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression2483);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1206:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression2502);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1224:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1225:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1225:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1226:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2526);
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
            	    break loop18;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1250:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1251:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1252:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression2564);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression2574); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1259:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1262:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1263:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1263:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_INT && LA19_0<=RULE_EBIGDECIMAL)) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=52 && LA19_0<=59)) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1264:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression2621);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1274:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression2648);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1290:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1291:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1292:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction2683);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction2693); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1299:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1302:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1303:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1303:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt20=8;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt20=1;
                }
                break;
            case 53:
                {
                alt20=2;
                }
                break;
            case 54:
                {
                alt20=3;
                }
                break;
            case 55:
                {
                alt20=4;
                }
                break;
            case 56:
                {
                alt20=5;
                }
                break;
            case 57:
                {
                alt20=6;
                }
                break;
            case 58:
                {
                alt20=7;
                }
                break;
            case 59:
                {
                alt20=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1304:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction2740);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1314:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction2767);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1324:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction2794);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1334:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction2821);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1344:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction2848);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1354:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction2875);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1364:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction2902);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1374:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction2929);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1390:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1391:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1392:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction2964);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction2974); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1399:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1402:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1403:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1403:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1403:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1403:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1404:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1404:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1405:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction3020);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMaximumFunction3032); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1425:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1426:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1426:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1427:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3053);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1443:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1443:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMaximumFunction3066); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1447:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1448:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1448:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1449:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3087);
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
            	    break loop21;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMaximumFunction3101); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1477:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1478:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1479:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction3137);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction3147); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1486:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1489:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1490:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1490:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1490:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1490:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1491:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1491:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1492:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction3193);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleMinimumFunction3205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1512:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1513:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1513:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1514:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3226);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1530:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==21) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1530:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMinimumFunction3239); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1534:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1535:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1535:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1536:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3260);
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
            	    break loop22;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleMinimumFunction3274); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1564:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1565:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1566:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction3310);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction3320); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1573:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1576:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1577:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1577:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1577:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1577:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1578:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1578:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1579:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction3366);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleAverageFunction3378); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1599:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1600:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1600:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1601:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction3399);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1617:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==21) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1617:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAverageFunction3412); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1621:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1622:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1622:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1623:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction3433);
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
            	    break loop23;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleAverageFunction3447); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1651:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1652:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1653:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction3483);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction3493); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1660:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1663:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1664:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1664:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1664:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1664:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1665:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1665:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1666:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction3539);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleSumFunction3551); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1686:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1687:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1687:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1688:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction3572);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1704:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1704:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSumFunction3585); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1708:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1709:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1709:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1710:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction3606);
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
            	    break loop24;
                }
            } while (true);

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleSumFunction3620); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1738:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1739:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1740:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction3656);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction3666); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1747:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1750:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1751:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1751:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1751:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1751:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1752:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1752:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1753:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction3712);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleExponentialFunction3724); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1773:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1774:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1774:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1775:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3745);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleExponentialFunction3757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1795:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1796:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1796:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1797:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3778);
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

            otherlv_5=(Token)match(input,28,FOLLOW_28_in_ruleExponentialFunction3790); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1825:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1826:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1827:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction3826);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction3836); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1834:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1837:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1838:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1838:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1838:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1838:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1839:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1839:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1840:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction3882);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleAbsoluteFunction3894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1860:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1861:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1861:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1862:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction3915);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAbsoluteFunction3927); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1890:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1891:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1892:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction3963);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction3973); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1899:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1902:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1903:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1903:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1903:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1903:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1904:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1904:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1905:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction4019);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleNaturalLogarithmFunction4031); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1925:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1926:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1926:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1927:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction4052);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleNaturalLogarithmFunction4064); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1955:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1956:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1957:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction4100);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction4110); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1964:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1967:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1968:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1968:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1968:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1968:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1969:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1969:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1970:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction4156);
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

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleCommonLogarithmFunction4168); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1990:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1991:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1991:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:1992:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction4189);
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

            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleCommonLogarithmFunction4201); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2020:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2021:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2022:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4237);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression4247); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2029:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2032:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2033:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2033:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2034:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression4288);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2041:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2042:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2042:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2043:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression4308);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression4324);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2075:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2076:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2077:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification4359);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification4369); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2084:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2087:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2088:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2088:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2089:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification4416);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2099:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification4443);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2109:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification4470);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2125:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2126:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2127:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression4505);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression4515); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2134:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2137:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2138:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2138:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2138:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2138:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2139:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2139:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2140:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression4563);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2153:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==25) ) {
                alt26=1;
            }
            else if ( (LA26_0==17) ) {
                alt26=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2153:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2153:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2154:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2154:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2155:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression4585);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2172:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2172:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2173:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2173:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2174:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression4612);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2198:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2199:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2200:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection4649);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection4659); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2207:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2210:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2211:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2211:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2211:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleCollection4696); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2215:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2216:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2216:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2217:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection4717);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2233:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==21) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2233:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleCollection4730); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2237:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2238:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2238:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2239:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection4751);
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
            	    break loop27;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleCollection4765); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2267:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2268:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2269:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple4801);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple4811); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2276:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2279:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2280:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2280:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2280:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple4848); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2284:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2285:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2285:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2286:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple4869);
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

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2302:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==21) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2302:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleTuple4882); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2306:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2307:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2307:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2308:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple4903);
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleTuple4917); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2336:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2337:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2338:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair4953);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair4963); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2345:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2348:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2349:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2349:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2349:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2349:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2350:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2350:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2351:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair5011);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,29,FOLLOW_29_in_rulePropertyValuePair5023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2368:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2369:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2369:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2370:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair5044);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2394:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2395:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2396:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression5080);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression5090); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2403:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2406:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2407:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2407:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2408:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2408:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2409:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression5137);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2430:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2431:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2432:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression5172);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression5182); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2439:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2442:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2443:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2443:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt29=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt29=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt29=2;
                }
                break;
            case RULE_NULL:
                {
                alt29=3;
                }
                break;
            case RULE_STRING:
                {
                alt29=4;
                }
                break;
            case 30:
                {
                alt29=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2444:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression5229);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2454:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression5256);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2464:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression5283);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2474:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression5310);
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2484:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression5337);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2500:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2501:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2502:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5372);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral5382); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2509:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2512:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2513:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2513:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2514:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2514:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2515:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral5423); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2539:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2540:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2541:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5463);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral5473); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2548:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2551:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2552:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2552:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2553:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2553:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2554:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral5518);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2578:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2579:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2580:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5553);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral5563); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2587:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2590:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2591:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2591:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2592:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2592:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2593:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral5604); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2617:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2618:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2619:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5644);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral5654); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2626:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2629:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2630:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2630:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2631:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2631:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2632:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral5695); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2656:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2657:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2658:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral5735);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral5745); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2665:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2668:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2669:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2669:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2670:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2670:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2671:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,30,FOLLOW_30_in_ruleUnlimitedLiteral5787); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2692:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2693:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2694:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator5835);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator5845); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2701:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2704:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2705:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2705:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2705:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2705:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2706:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2711:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==31) ) {
                alt30=1;
            }
            else if ( (LA30_0==32) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2711:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,31,FOLLOW_31_in_ruleOrOperator5892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2716:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_32_in_ruleOrOperator5910); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2728:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2729:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2730:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator5947);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator5957); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2737:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2740:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2741:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2741:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2741:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2741:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2742:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2747:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==33) ) {
                alt31=1;
            }
            else if ( (LA31_0==34) ) {
                alt31=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2747:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleXOrOperator6004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2752:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleXOrOperator6022); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2764:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2765:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2766:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator6059);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator6069); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2773:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2776:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2777:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2777:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2777:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2777:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2778:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2783:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==35) ) {
                alt32=1;
            }
            else if ( (LA32_0==36) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2783:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,35,FOLLOW_35_in_ruleAndOperator6116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2788:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_36_in_ruleAndOperator6134); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2800:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2801:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2802:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator6171);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator6181); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2809:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2812:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2813:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2813:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2813:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2813:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2814:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2819:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==37) ) {
                alt33=1;
            }
            else if ( (LA33_0==38) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }
            switch (alt33) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2819:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleImplicationOperator6228); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2824:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleImplicationOperator6246); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2836:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2837:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2838:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator6283);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator6293); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2845:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2848:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2849:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2849:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2849:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2849:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2850:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,39,FOLLOW_39_in_ruleEqualsOperator6339); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2867:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2868:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2869:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator6375);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator6385); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2876:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2879:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2880:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2880:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2880:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2880:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2881:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2886:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==40) ) {
                alt34=1;
            }
            else if ( (LA34_0==41) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2886:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleNotEqualsOperator6432); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2891:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_ruleNotEqualsOperator6450); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2903:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2904:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2905:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator6487);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator6497); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2912:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2915:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2916:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2916:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2916:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2916:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2917:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2922:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==42) ) {
                alt35=1;
            }
            else if ( (LA35_0==43) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2922:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleNotOperator6544); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2927:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,43,FOLLOW_43_in_ruleNotOperator6562); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2939:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2940:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2941:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator6599);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator6609); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2948:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2951:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2952:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2952:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2952:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2952:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2953:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleGreaterThanOperator6655); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2970:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2971:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2972:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator6691);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator6701); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2979:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2982:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2983:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2983:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2983:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2983:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:2984:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_ruleGreaterOrEqualThanOperator6747); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3001:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3002:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3003:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator6783);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator6793); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3010:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3013:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3014:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3014:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3014:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3014:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3015:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleLessThanOperator6839); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3032:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3033:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3034:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator6875);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator6885); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3041:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3044:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3045:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3045:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3045:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3045:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3046:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleLessOrEqualThanOperator6931); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3063:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3064:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3065:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator6967);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator6977); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3072:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3075:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3076:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3076:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3076:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3076:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3077:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleAdditionOperator7023); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3094:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3095:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3096:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator7059);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator7069); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3103:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3106:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3107:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3107:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3107:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3107:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3108:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleSubstractionOperator7115); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3125:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3126:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3127:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7151);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator7161); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3134:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3137:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3138:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3138:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3138:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3138:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3139:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,30,FOLLOW_30_in_ruleMultiplicationOperator7207); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3156:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3157:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3158:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7243);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator7253); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3165:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3168:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3169:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3169:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3169:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3169:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3170:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleDivisionOperator7299); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3187:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3188:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3189:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator7335);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator7345); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3196:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3199:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3200:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3200:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3200:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3200:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3201:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleModulusOperator7391); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3218:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3219:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3220:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator7427);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator7437); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3227:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3230:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3231:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3231:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3231:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3231:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3232:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleMaxOperator7483); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3249:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3250:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3251:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator7519);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator7529); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3258:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3261:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3262:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3262:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3262:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3262:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3263:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleMinOperator7575); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3280:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3281:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3282:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator7611);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator7621); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3289:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3292:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3293:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3293:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3293:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3293:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3294:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAvgOperator7667); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3311:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3312:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3313:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator7703);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator7713); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3320:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3323:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3324:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3324:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3324:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3324:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3325:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleSumOperator7759); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3342:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3343:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3344:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator7795);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator7805); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3351:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3354:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3355:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3355:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3355:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3355:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3356:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleExponentialOperator7851); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3373:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3374:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3375:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator7887);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator7897); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3382:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3385:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3386:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3386:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3386:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3386:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3387:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleAbsoluteOperator7943); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3404:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3405:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3406:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator7979);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator7989); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3413:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3416:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3417:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3417:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3417:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3417:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3418:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleNaturalLogarithmOperator8035); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3435:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3436:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3437:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator8071);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator8081); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3444:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3447:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3448:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3448:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3448:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3448:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3449:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleCommonLogarithmOperator8127); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3466:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3467:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3468:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis8164);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis8175); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3475:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3478:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3480:2: kw= '('
            {
            kw=(Token)match(input,27,FOLLOW_27_in_ruleLeftParenthesis8212); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3493:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3494:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3495:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis8252);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis8263); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3502:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3505:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3507:2: kw= ')'
            {
            kw=(Token)match(input,28,FOLLOW_28_in_ruleRightParenthesis8300); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3520:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3521:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3522:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8340);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName8351); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3529:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3532:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3533:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3533:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3533:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3540:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==60) && (synpred1_InternalESL())) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3540:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3540:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3540:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,60,FOLLOW_60_in_ruleQualifiedName8419); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName8435); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3563:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3564:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3565:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8483);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8494); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3572:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3575:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3576:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3576:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3577:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8541);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3587:1: (kw= '.*' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==61) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3588:2: kw= '.*'
                    {
                    kw=(Token)match(input,61,FOLLOW_61_in_ruleQualifiedNameWithWildcard8560); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3605:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3606:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3607:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace8606);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace8616); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3614:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3617:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3618:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3618:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3618:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_62_in_ruleImportNamespace8653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3622:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3623:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3623:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3624:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace8674);
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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3648:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3649:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3650:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber8711);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber8722); if (state.failed) return current;

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
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3657:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3660:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3661:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3661:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt38=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt38=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt38=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt38=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt38=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3661:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber8762); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3669:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber8788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3677:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber8814); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3685:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber8840); if (state.failed) return current;
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


    // $ANTLR start "ruleEvaluationStrategyLevelKind"
    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3704:1: ruleEvaluationStrategyLevelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) ) ;
    public final Enumerator ruleEvaluationStrategyLevelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3706:28: ( ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3707:1: ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3707:1: ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==63) ) {
                alt39=1;
            }
            else if ( (LA39_0==64) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3707:2: (enumLiteral_0= 'model' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3707:2: (enumLiteral_0= 'model' )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3707:4: enumLiteral_0= 'model'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_63_in_ruleEvaluationStrategyLevelKind8903); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEvaluationStrategyLevelKindAccess().getMODELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getEvaluationStrategyLevelKindAccess().getMODELEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3713:6: (enumLiteral_1= 'code' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3713:6: (enumLiteral_1= 'code' )
                    // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3713:8: enumLiteral_1= 'code'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_64_in_ruleEvaluationStrategyLevelKind8920); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getEvaluationStrategyLevelKindAccess().getCODEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getEvaluationStrategyLevelKindAccess().getCODEEnumLiteralDeclaration_1()); 
                          
                    }

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
    // $ANTLR end "ruleEvaluationStrategyLevelKind"

    // $ANTLR start synpred1_InternalESL
    public final void synpred1_InternalESL_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3540:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.esl/src-gen/eu/artist/postmigration/nfrvt/lang/esl/parser/antlr/internal/InternalESL.g:3541:2: '.'
        {
        match(input,60,FOLLOW_60_in_synpred1_InternalESL8410); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalESL

    // Delegated rules

    public final boolean synpred1_InternalESL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalESL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA14 dfa14 = new DFA14(this);
    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA14_eotS =
        "\13\uffff";
    static final String DFA14_eofS =
        "\2\uffff\1\10\7\uffff\1\10";
    static final String DFA14_minS =
        "\1\4\1\uffff\1\21\4\uffff\1\4\2\uffff\1\21";
    static final String DFA14_maxS =
        "\1\73\1\uffff\1\74\4\uffff\1\4\2\uffff\1\74";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\2\1\3\1\uffff";
    static final String DFA14_specialS =
        "\13\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\2\1\4\1\uffff\1\3\4\1\17\uffff\1\6\2\uffff\1\5\25\uffff"+
            "\10\1",
            "",
            "\1\11\7\uffff\1\11\2\uffff\1\10\2\uffff\13\10\2\uffff\4\10"+
            "\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\11\7\uffff\1\11\2\uffff\1\10\2\uffff\13\10\2\uffff\4\10"+
            "\14\uffff\1\7"
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
            return "948:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA25_eotS =
        "\7\uffff";
    static final String DFA25_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA25_minS =
        "\1\4\1\uffff\1\21\1\4\2\uffff\1\21";
    static final String DFA25_maxS =
        "\1\36\1\uffff\1\74\1\4\2\uffff\1\74";
    static final String DFA25_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA25_specialS =
        "\7\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\2\7\1\22\uffff\1\1",
            "",
            "\1\4\1\5\2\uffff\1\5\3\uffff\1\4\1\5\41\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\5\2\uffff\1\5\3\uffff\1\4\1\5\41\uffff\1\3"
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
            return "2088:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleEvaluationStrategyCatalogue_in_entryRuleEvaluationStrategyCatalogue75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategyCatalogue85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleEvaluationStrategyCatalogue131 = new BitSet(new long[]{0x4000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleEvaluationStrategyCatalogue144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategyCatalogue165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationStrategyCatalogue177 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_ruleEvaluationStrategyCatalogue198 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationStrategyCatalogue211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEvaluationStrategy_in_entryRuleEvaluationStrategy247 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEvaluationStrategy257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleEvaluationStrategy294 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleEvaluationStrategy311 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleEvaluationStrategy328 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_20_in_ruleEvaluationStrategy341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy364 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEvaluationStrategy376 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleEvaluationStrategy390 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleEvaluationStrategy407 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEvaluationStrategy425 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleEvaluationStrategy437 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleEvaluationStrategyLevelKind_in_ruleEvaluationStrategy458 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleEvaluationStrategy471 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleEvaluationStrategy483 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleEvaluationStrategy495 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy518 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleEvaluationStrategy531 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleEvaluationStrategy554 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleEvaluationStrategy568 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleEvaluationStrategy580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication763 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication793 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication814 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction909 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction941 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction960 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction984 = new BitSet(new long[]{0x0000000780000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction1022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction1032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction1079 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction1109 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction1130 = new BitSet(new long[]{0x0000001800000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison1168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison1178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison1225 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison1257 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison1276 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison1300 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit1395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit1449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation1484 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation1540 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression1597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1654 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression1686 = new BitSet(new long[]{0x0FF0000048000FB0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression1724 = new BitSet(new long[]{0x0FF0000048000FB0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression1762 = new BitSet(new long[]{0x0FF0000048000FB0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression1800 = new BitSet(new long[]{0x0FF0000048000FB0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression1823 = new BitSet(new long[]{0x0000F00000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression1861 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression1871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression1918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression2053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression2115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression2171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression2205 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression2215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2262 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression2294 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression2313 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression2337 = new BitSet(new long[]{0x0003000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression2375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression2385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2432 = new BitSet(new long[]{0x000C000040000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression2464 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression2483 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression2502 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression2526 = new BitSet(new long[]{0x000C000040000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression2564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression2621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction2683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction2693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction2740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction2767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction2821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction2848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction2929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction3020 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMaximumFunction3032 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3053 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleMaximumFunction3066 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction3087 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleMaximumFunction3101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction3137 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction3147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction3193 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleMinimumFunction3205 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3226 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleMinimumFunction3239 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction3260 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleMinimumFunction3274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction3310 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction3320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction3366 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAverageFunction3378 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction3399 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageFunction3412 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction3433 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleAverageFunction3447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction3483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction3493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction3539 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleSumFunction3551 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction3572 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_21_in_ruleSumFunction3585 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction3606 = new BitSet(new long[]{0x0000000010200000L});
    public static final BitSet FOLLOW_28_in_ruleSumFunction3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction3656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction3666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction3712 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleExponentialFunction3724 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3745 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExponentialFunction3757 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction3778 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleExponentialFunction3790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction3826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction3836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction3882 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleAbsoluteFunction3894 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction3915 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAbsoluteFunction3927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction3963 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction4019 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleNaturalLogarithmFunction4031 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction4052 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleNaturalLogarithmFunction4064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction4100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction4110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction4156 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleCommonLogarithmFunction4168 = new BitSet(new long[]{0x0FF0000000000F00L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction4189 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleCommonLogarithmFunction4201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression4237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression4247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression4288 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression4308 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression4324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification4359 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification4369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification4416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification4443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification4470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression4505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression4563 = new BitSet(new long[]{0x0000000002020000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression4585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression4612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection4649 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection4659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleCollection4696 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection4717 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_21_in_ruleCollection4730 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection4751 = new BitSet(new long[]{0x0000000004200000L});
    public static final BitSet FOLLOW_26_in_ruleCollection4765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple4801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple4811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple4848 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple4869 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_21_in_ruleTuple4882 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple4903 = new BitSet(new long[]{0x0000000000240000L});
    public static final BitSet FOLLOW_18_in_ruleTuple4917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair4953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair4963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair5011 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_rulePropertyValuePair5023 = new BitSet(new long[]{0x0FF00C0048000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair5044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression5080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression5090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression5137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression5172 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression5182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression5256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression5283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression5337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral5372 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral5382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral5463 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral5473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral5518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral5553 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral5563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral5604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral5644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral5695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral5735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral5745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleUnlimitedLiteral5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator5835 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator5845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleOrOperator5892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleOrOperator5910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator5947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleXOrOperator6004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleXOrOperator6022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator6059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator6069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAndOperator6116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAndOperator6134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator6171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator6181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleImplicationOperator6228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleImplicationOperator6246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator6283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator6293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleEqualsOperator6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator6375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator6385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleNotEqualsOperator6432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleNotEqualsOperator6450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator6487 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator6497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleNotOperator6544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleNotOperator6562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator6599 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator6609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleGreaterThanOperator6655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator6691 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator6701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleGreaterOrEqualThanOperator6747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator6783 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator6793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleLessThanOperator6839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator6875 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator6885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleLessOrEqualThanOperator6931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator6967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator6977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleAdditionOperator7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator7059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator7069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleSubstractionOperator7115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator7151 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator7161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMultiplicationOperator7207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator7243 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator7253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleDivisionOperator7299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator7335 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator7345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleModulusOperator7391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator7427 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator7437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleMaxOperator7483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator7519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator7529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleMinOperator7575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator7611 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator7621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleAvgOperator7667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator7703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator7713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleSumOperator7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator7795 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator7805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleExponentialOperator7851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator7887 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator7897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleAbsoluteOperator7943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator7979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator7989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNaturalLogarithmOperator8035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator8071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator8081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleCommonLogarithmOperator8127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis8164 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis8175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleLeftParenthesis8212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis8252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis8263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleRightParenthesis8300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName8340 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName8351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8391 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleQualifiedName8419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName8435 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard8483 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard8541 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleQualifiedNameWithWildcard8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace8606 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleImportNamespace8653 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace8674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber8711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber8722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber8762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber8788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber8814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber8840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleEvaluationStrategyLevelKind8903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleEvaluationStrategyLevelKind8920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_synpred1_InternalESL8410 = new BitSet(new long[]{0x0000000000000002L});

}