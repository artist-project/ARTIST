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
package eu.artist.postmigration.nfrvt.lang.gel.parser.antlr.internal; 

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
import eu.artist.postmigration.nfrvt.lang.gel.services.GELGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGELParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_EBIGDECIMAL", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'evaluation'", "'{'", "'date'", "','", "'migration'", "'['", "']'", "'property-evaluations'", "'}'", "'transformation'", "'pattern'", "'source'", "'target'", "'qualitative'", "'property'", "'value'", "'quantitative'", "'realizations'", "'strategy'", "'level'", "'type'", "'values'", "'precision'", "'goalmodel-evaluation'", "'goalmodel'", "'verdict'", "'reason'", "'goal-evaluations'", "'soft-goal-evaluation'", "'goal'", "'difference'", "'hard-goal-evaluation'", "'condition-evaluation'", "'composite-goal-evaluation'", "'value-evaluation'", "'result'", "'evaluations'", "'expression-evaluation'", "'arithmetic-evaluation'", "'arithmetic-evaluations'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'model'", "'code'", "'calculated'", "'measured'", "'estimated'", "'PASS'", "'FAIL'", "'INCONCLUSIVE'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__93=93;
    public static final int T__19=19;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__16=16;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__99=99;
    public static final int T__98=98;
    public static final int T__97=97;
    public static final int T__96=96;
    public static final int T__95=95;
    public static final int RULE_SMALL_DECIMAL=11;
    public static final int RULE_EBIGDECIMAL=6;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int RULE_ML_COMMENT=12;
    public static final int RULE_STRING=4;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=10;
    public static final int RULE_EBOOLEAN=7;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__61=61;
    public static final int T__60=60;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int RULE_INT=9;
    public static final int T__50=50;
    public static final int T__42=42;
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
    public static final int RULE_NULL=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;

    // delegates
    // delegators


        public InternalGELParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGELParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGELParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g"; }



     	private GELGrammarAccess grammarAccess;
     	
        public InternalGELParser(TokenStream input, GELGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "MigrationEvaluation";	
       	}
       	
       	@Override
       	protected GELGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleMigrationEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:68:1: entryRuleMigrationEvaluation returns [EObject current=null] : iv_ruleMigrationEvaluation= ruleMigrationEvaluation EOF ;
    public final EObject entryRuleMigrationEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:69:2: (iv_ruleMigrationEvaluation= ruleMigrationEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:70:2: iv_ruleMigrationEvaluation= ruleMigrationEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationEvaluation_in_entryRuleMigrationEvaluation75);
            iv_ruleMigrationEvaluation=ruleMigrationEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationEvaluation85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMigrationEvaluation"


    // $ANTLR start "ruleMigrationEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:77:1: ruleMigrationEvaluation returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' ) ;
    public final EObject ruleMigrationEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_date_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_transformations_9_0 = null;

        EObject lv_propertyEvaluations_14_0 = null;

        EObject lv_evaluation_17_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:80:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_STRING ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==91) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:83:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_ruleMigrationEvaluation131);
            	    lv_imports_0_0=ruleImportNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationEvaluationRule());
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleMigrationEvaluation144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationEvaluationAccess().getEvaluationKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:105:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMigrationEvaluation165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMigrationEvaluationRule());
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleMigrationEvaluation177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMigrationEvaluationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleMigrationEvaluation189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMigrationEvaluationAccess().getDateKeyword_4());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:129:1: ( (lv_date_5_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:130:1: (lv_date_5_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:130:1: (lv_date_5_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:131:3: lv_date_5_0= RULE_STRING
            {
            lv_date_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleMigrationEvaluation206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_date_5_0, grammarAccess.getMigrationEvaluationAccess().getDateSTRINGTerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"date",
                      		lv_date_5_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,19,FOLLOW_19_in_ruleMigrationEvaluation223); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMigrationEvaluationAccess().getCommaKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleMigrationEvaluation235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMigrationEvaluationAccess().getMigrationKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleMigrationEvaluation247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMigrationEvaluationAccess().getLeftSquareBracketKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:159:1: ( (lv_transformations_9_0= ruleTransformation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==25) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:160:1: (lv_transformations_9_0= ruleTransformation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:160:1: (lv_transformations_9_0= ruleTransformation )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:161:3: lv_transformations_9_0= ruleTransformation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getTransformationsTransformationParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransformation_in_ruleMigrationEvaluation268);
            	    lv_transformations_9_0=ruleTransformation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationEvaluationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"transformations",
            	              		lv_transformations_9_0, 
            	              		"Transformation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleMigrationEvaluation281); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMigrationEvaluationAccess().getRightSquareBracketKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleMigrationEvaluation293); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMigrationEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,23,FOLLOW_23_in_ruleMigrationEvaluation305); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMigrationEvaluationAccess().getPropertyEvaluationsKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleMigrationEvaluation317); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getMigrationEvaluationAccess().getLeftSquareBracketKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:193:1: ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==29||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:194:1: (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:194:1: (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:195:3: lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getPropertyEvaluationsAppliedPropertyEvaluationParserRuleCall_14_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAppliedPropertyEvaluation_in_ruleMigrationEvaluation338);
            	    lv_propertyEvaluations_14_0=ruleAppliedPropertyEvaluation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getMigrationEvaluationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"propertyEvaluations",
            	              		lv_propertyEvaluations_14_0, 
            	              		"AppliedPropertyEvaluation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleMigrationEvaluation351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getMigrationEvaluationAccess().getRightSquareBracketKeyword_15());
                  
            }
            otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleMigrationEvaluation363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getMigrationEvaluationAccess().getCommaKeyword_16());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:219:1: ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:220:1: (lv_evaluation_17_0= ruleGoalModelEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:220:1: (lv_evaluation_17_0= ruleGoalModelEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:221:3: lv_evaluation_17_0= ruleGoalModelEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getEvaluationGoalModelEvaluationParserRuleCall_17_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalModelEvaluation_in_ruleMigrationEvaluation384);
            lv_evaluation_17_0=ruleGoalModelEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMigrationEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"evaluation",
                      		lv_evaluation_17_0, 
                      		"GoalModelEvaluation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleMigrationEvaluation396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getMigrationEvaluationAccess().getRightCurlyBracketKeyword_18());
                  
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
    // $ANTLR end "ruleMigrationEvaluation"


    // $ANTLR start "entryRuleTransformation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:249:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:250:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:251:2: iv_ruleTransformation= ruleTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationRule()); 
            }
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation432);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation442); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransformation"


    // $ANTLR start "ruleTransformation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:258:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? otherlv_15= '}' ) ;
    public final EObject ruleTransformation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:261:28: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? otherlv_15= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:262:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? otherlv_15= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:262:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? otherlv_15= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:262:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleTransformation479); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:266:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:267:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:267:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:268:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation496); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getTransformationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getTransformationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleTransformation513); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,26,FOLLOW_26_in_ruleTransformation525); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getPatternKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:292:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:293:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:293:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:294:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransformationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationAccess().getPatternPatternCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation548);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:307:2: (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==27) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:307:4: otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleTransformation561); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTransformationAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,27,FOLLOW_27_in_ruleTransformation573); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getSourceKeyword_5_1());
                          
                    }
                    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleTransformation585); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_5_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:319:1: ( ( ruleQualifiedName ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:320:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:320:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:321:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTransformationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransformationAccess().getSourceNamedElementCrossReference_5_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation608);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleTransformation621); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_5_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:338:3: (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:338:5: otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleTransformation636); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTransformationAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_11=(Token)match(input,28,FOLLOW_28_in_ruleTransformation648); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTransformationAccess().getTargetKeyword_6_1());
                          
                    }
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleTransformation660); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:350:1: ( ( ruleQualifiedName ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:351:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:351:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:352:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTransformationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransformationAccess().getTargetNamedElementCrossReference_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation683);
                    	    ruleQualifiedName();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleTransformation696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleTransformation710); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleTransformation"


    // $ANTLR start "entryRuleAppliedPropertyEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:381:1: entryRuleAppliedPropertyEvaluation returns [EObject current=null] : iv_ruleAppliedPropertyEvaluation= ruleAppliedPropertyEvaluation EOF ;
    public final EObject entryRuleAppliedPropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedPropertyEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:382:2: (iv_ruleAppliedPropertyEvaluation= ruleAppliedPropertyEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:383:2: iv_ruleAppliedPropertyEvaluation= ruleAppliedPropertyEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedPropertyEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedPropertyEvaluation_in_entryRuleAppliedPropertyEvaluation746);
            iv_ruleAppliedPropertyEvaluation=ruleAppliedPropertyEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedPropertyEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedPropertyEvaluation756); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedPropertyEvaluation"


    // $ANTLR start "ruleAppliedPropertyEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:390:1: ruleAppliedPropertyEvaluation returns [EObject current=null] : (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation ) ;
    public final EObject ruleAppliedPropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject this_AppliedQualitativePropertyEvaluation_0 = null;

        EObject this_AppliedQuantitativePropertyEvaluation_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:393:28: ( (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:394:1: (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:394:1: (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            else if ( (LA8_0==32) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:395:5: this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyEvaluationAccess().getAppliedQualitativePropertyEvaluationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation803);
                    this_AppliedQualitativePropertyEvaluation_0=ruleAppliedQualitativePropertyEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AppliedQualitativePropertyEvaluation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:405:5: this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyEvaluationAccess().getAppliedQuantitativePropertyEvaluationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation830);
                    this_AppliedQuantitativePropertyEvaluation_1=ruleAppliedQuantitativePropertyEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AppliedQuantitativePropertyEvaluation_1; 
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
    // $ANTLR end "ruleAppliedPropertyEvaluation"


    // $ANTLR start "entryRuleAppliedQualitativePropertyEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:421:1: entryRuleAppliedQualitativePropertyEvaluation returns [EObject current=null] : iv_ruleAppliedQualitativePropertyEvaluation= ruleAppliedQualitativePropertyEvaluation EOF ;
    public final EObject entryRuleAppliedQualitativePropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQualitativePropertyEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:422:2: (iv_ruleAppliedQualitativePropertyEvaluation= ruleAppliedQualitativePropertyEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:423:2: iv_ruleAppliedQualitativePropertyEvaluation= ruleAppliedQualitativePropertyEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_entryRuleAppliedQualitativePropertyEvaluation865);
            iv_ruleAppliedQualitativePropertyEvaluation=ruleAppliedQualitativePropertyEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQualitativePropertyEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQualitativePropertyEvaluation875); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedQualitativePropertyEvaluation"


    // $ANTLR start "ruleAppliedQualitativePropertyEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:430:1: ruleAppliedQualitativePropertyEvaluation returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' ) ;
    public final EObject ruleAppliedQualitativePropertyEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_value_7_0 = null;

        EObject lv_evaluation_9_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:433:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:434:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:434:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:434:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQualitativePropertyEvaluation912); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getQualitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:438:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:439:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:439:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:440:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQualitativePropertyEvaluation929); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAppliedQualitativePropertyEvaluation946); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleAppliedQualitativePropertyEvaluation958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:464:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:465:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:465:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:466:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getPropertyAppliedQualitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativePropertyEvaluation981);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQualitativePropertyEvaluation993); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAppliedQualitativePropertyEvaluation1005); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getValueKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:487:1: ( (lv_value_7_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:488:1: (lv_value_7_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:488:1: (lv_value_7_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:489:3: lv_value_7_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getValueValueSpecificationParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleAppliedQualitativePropertyEvaluation1026);
            lv_value_7_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAppliedQualitativePropertyEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_7_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQualitativePropertyEvaluation1038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getCommaKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:509:1: ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:510:1: (lv_evaluation_9_0= ruleNumberExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:510:1: (lv_evaluation_9_0= ruleNumberExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:511:3: lv_evaluation_9_0= ruleNumberExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getEvaluationNumberExpressionEvaluationParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_ruleAppliedQualitativePropertyEvaluation1059);
            lv_evaluation_9_0=ruleNumberExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAppliedQualitativePropertyEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"evaluation",
                      		lv_evaluation_9_0, 
                      		"NumberExpressionEvaluation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,24,FOLLOW_24_in_ruleAppliedQualitativePropertyEvaluation1071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleAppliedQualitativePropertyEvaluation"


    // $ANTLR start "entryRuleAppliedQuantitativePropertyEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:539:1: entryRuleAppliedQuantitativePropertyEvaluation returns [EObject current=null] : iv_ruleAppliedQuantitativePropertyEvaluation= ruleAppliedQuantitativePropertyEvaluation EOF ;
    public final EObject entryRuleAppliedQuantitativePropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativePropertyEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:540:2: (iv_ruleAppliedQuantitativePropertyEvaluation= ruleAppliedQuantitativePropertyEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:541:2: iv_ruleAppliedQuantitativePropertyEvaluation= ruleAppliedQuantitativePropertyEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_entryRuleAppliedQuantitativePropertyEvaluation1107);
            iv_ruleAppliedQuantitativePropertyEvaluation=ruleAppliedQuantitativePropertyEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativePropertyEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyEvaluation1117); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedQuantitativePropertyEvaluation"


    // $ANTLR start "ruleAppliedQuantitativePropertyEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:548:1: ruleAppliedQuantitativePropertyEvaluation returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' ) ;
    public final EObject ruleAppliedQuantitativePropertyEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        EObject lv_value_7_0 = null;

        EObject lv_evaluation_9_0 = null;

        EObject lv_realizations_13_0 = null;

        EObject lv_realizations_15_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:551:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:552:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:552:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:552:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAppliedQuantitativePropertyEvaluation1154); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:556:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:557:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:557:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:558:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQuantitativePropertyEvaluation1171); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAppliedQuantitativePropertyEvaluation1188); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleAppliedQuantitativePropertyEvaluation1200); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:582:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:583:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:583:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:584:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getPropertyAppliedQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1223);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1235); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAppliedQuantitativePropertyEvaluation1247); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getValueKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:605:1: ( (lv_value_7_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:606:1: (lv_value_7_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:606:1: (lv_value_7_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:607:3: lv_value_7_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getValueValueSpecificationParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleAppliedQuantitativePropertyEvaluation1268);
            lv_value_7_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_7_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:627:1: ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:628:1: (lv_evaluation_9_0= ruleValueExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:628:1: (lv_evaluation_9_0= ruleValueExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:629:3: lv_evaluation_9_0= ruleValueExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getEvaluationValueExpressionEvaluationParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_ruleAppliedQuantitativePropertyEvaluation1301);
            lv_evaluation_9_0=ruleValueExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"evaluation",
                      		lv_evaluation_9_0, 
                      		"ValueExpressionEvaluation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:645:2: (otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==19) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:645:4: otherlv_10= ',' otherlv_11= 'realizations' otherlv_12= '[' ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )? otherlv_16= ']'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1314); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_10_0());
                          
                    }
                    otherlv_11=(Token)match(input,33,FOLLOW_33_in_ruleAppliedQuantitativePropertyEvaluation1326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRealizationsKeyword_10_1());
                          
                    }
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativePropertyEvaluation1338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getLeftSquareBracketKeyword_10_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:657:1: ( ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:657:2: ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) ) (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )*
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:657:2: ( (lv_realizations_13_0= ruleQuantitativePropertyRealization ) )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:658:1: (lv_realizations_13_0= ruleQuantitativePropertyRealization )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:658:1: (lv_realizations_13_0= ruleQuantitativePropertyRealization )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:659:3: lv_realizations_13_0= ruleQuantitativePropertyRealization
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRealizationsQuantitativePropertyRealizationParserRuleCall_10_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQuantitativePropertyRealization_in_ruleAppliedQuantitativePropertyEvaluation1360);
                            lv_realizations_13_0=ruleQuantitativePropertyRealization();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
                              	        }
                                     		add(
                                     			current, 
                                     			"realizations",
                                      		lv_realizations_13_0, 
                                      		"QuantitativePropertyRealization");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:675:2: (otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==19) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:675:4: otherlv_14= ',' ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) )
                            	    {
                            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1373); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_10_3_1_0());
                            	          
                            	    }
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:679:1: ( (lv_realizations_15_0= ruleQuantitativePropertyRealization ) )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:680:1: (lv_realizations_15_0= ruleQuantitativePropertyRealization )
                            	    {
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:680:1: (lv_realizations_15_0= ruleQuantitativePropertyRealization )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:681:3: lv_realizations_15_0= ruleQuantitativePropertyRealization
                            	    {
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRealizationsQuantitativePropertyRealizationParserRuleCall_10_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleQuantitativePropertyRealization_in_ruleAppliedQuantitativePropertyEvaluation1394);
                            	    lv_realizations_15_0=ruleQuantitativePropertyRealization();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      	        if (current==null) {
                            	      	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
                            	      	        }
                            	             		add(
                            	             			current, 
                            	             			"realizations",
                            	              		lv_realizations_15_0, 
                            	              		"QuantitativePropertyRealization");
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
                            break;

                    }

                    otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleAppliedQuantitativePropertyEvaluation1410); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRightSquareBracketKeyword_10_4());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,24,FOLLOW_24_in_ruleAppliedQuantitativePropertyEvaluation1424); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRightCurlyBracketKeyword_11());
                  
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
    // $ANTLR end "ruleAppliedQuantitativePropertyEvaluation"


    // $ANTLR start "entryRuleQuantitativePropertyRealization"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:713:1: entryRuleQuantitativePropertyRealization returns [EObject current=null] : iv_ruleQuantitativePropertyRealization= ruleQuantitativePropertyRealization EOF ;
    public final EObject entryRuleQuantitativePropertyRealization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuantitativePropertyRealization = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:714:2: (iv_ruleQuantitativePropertyRealization= ruleQuantitativePropertyRealization EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:715:2: iv_ruleQuantitativePropertyRealization= ruleQuantitativePropertyRealization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQuantitativePropertyRealizationRule()); 
            }
            pushFollow(FOLLOW_ruleQuantitativePropertyRealization_in_entryRuleQuantitativePropertyRealization1460);
            iv_ruleQuantitativePropertyRealization=ruleQuantitativePropertyRealization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQuantitativePropertyRealization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQuantitativePropertyRealization1470); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQuantitativePropertyRealization"


    // $ANTLR start "ruleQuantitativePropertyRealization"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:722:1: ruleQuantitativePropertyRealization returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ',' )? otherlv_5= 'level' ( (lv_level_6_0= ruleRealizationLevelKind ) ) otherlv_7= ',' otherlv_8= 'type' ( (lv_type_9_0= ruleRealizationTypeKind ) ) otherlv_10= ',' otherlv_11= 'values' otherlv_12= '[' ( (lv_values_13_0= ruleValueSpecification ) ) (otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) ) )* otherlv_16= ']' (otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) ) )? otherlv_20= '}' ) ;
    public final EObject ruleQuantitativePropertyRealization() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_precision_19_0=null;
        Token otherlv_20=null;
        Enumerator lv_level_6_0 = null;

        Enumerator lv_type_9_0 = null;

        EObject lv_values_13_0 = null;

        EObject lv_values_15_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:725:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ',' )? otherlv_5= 'level' ( (lv_level_6_0= ruleRealizationLevelKind ) ) otherlv_7= ',' otherlv_8= 'type' ( (lv_type_9_0= ruleRealizationTypeKind ) ) otherlv_10= ',' otherlv_11= 'values' otherlv_12= '[' ( (lv_values_13_0= ruleValueSpecification ) ) (otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) ) )* otherlv_16= ']' (otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) ) )? otherlv_20= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ',' )? otherlv_5= 'level' ( (lv_level_6_0= ruleRealizationLevelKind ) ) otherlv_7= ',' otherlv_8= 'type' ( (lv_type_9_0= ruleRealizationTypeKind ) ) otherlv_10= ',' otherlv_11= 'values' otherlv_12= '[' ( (lv_values_13_0= ruleValueSpecification ) ) (otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) ) )* otherlv_16= ']' (otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) ) )? otherlv_20= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:726:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ',' )? otherlv_5= 'level' ( (lv_level_6_0= ruleRealizationLevelKind ) ) otherlv_7= ',' otherlv_8= 'type' ( (lv_type_9_0= ruleRealizationTypeKind ) ) otherlv_10= ',' otherlv_11= 'values' otherlv_12= '[' ( (lv_values_13_0= ruleValueSpecification ) ) (otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) ) )* otherlv_16= ']' (otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) ) )? otherlv_20= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:726:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' (otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ',' )? otherlv_5= 'level' ( (lv_level_6_0= ruleRealizationLevelKind ) ) otherlv_7= ',' otherlv_8= 'type' ( (lv_type_9_0= ruleRealizationTypeKind ) ) otherlv_10= ',' otherlv_11= 'values' otherlv_12= '[' ( (lv_values_13_0= ruleValueSpecification ) ) (otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) ) )* otherlv_16= ']' (otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) ) )? otherlv_20= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:726:2: ( (lv_name_0_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:727:1: (lv_name_0_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:727:1: (lv_name_0_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:728:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQuantitativePropertyRealization1512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getQuantitativePropertyRealizationAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getQuantitativePropertyRealizationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleQuantitativePropertyRealization1529); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getQuantitativePropertyRealizationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:748:1: (otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ',' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==34) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:748:3: otherlv_2= 'strategy' ( ( ruleQualifiedName ) )? otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,34,FOLLOW_34_in_ruleQuantitativePropertyRealization1542); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getQuantitativePropertyRealizationAccess().getStrategyKeyword_2_0());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:752:1: ( ( ruleQualifiedName ) )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:753:1: ( ruleQualifiedName )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:753:1: ( ruleQualifiedName )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:754:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getQuantitativePropertyRealizationRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getQuantitativePropertyRealizationAccess().getStrategyEvaluationStrategyCrossReference_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQuantitativePropertyRealization1565);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleQuantitativePropertyRealization1578); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getQuantitativePropertyRealizationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,35,FOLLOW_35_in_ruleQuantitativePropertyRealization1592); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getQuantitativePropertyRealizationAccess().getLevelKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:775:1: ( (lv_level_6_0= ruleRealizationLevelKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:776:1: (lv_level_6_0= ruleRealizationLevelKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:776:1: (lv_level_6_0= ruleRealizationLevelKind )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:777:3: lv_level_6_0= ruleRealizationLevelKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantitativePropertyRealizationAccess().getLevelRealizationLevelKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRealizationLevelKind_in_ruleQuantitativePropertyRealization1613);
            lv_level_6_0=ruleRealizationLevelKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantitativePropertyRealizationRule());
              	        }
                     		set(
                     			current, 
                     			"level",
                      		lv_level_6_0, 
                      		"RealizationLevelKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleQuantitativePropertyRealization1625); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getQuantitativePropertyRealizationAccess().getCommaKeyword_5());
                  
            }
            otherlv_8=(Token)match(input,36,FOLLOW_36_in_ruleQuantitativePropertyRealization1637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getQuantitativePropertyRealizationAccess().getTypeKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:801:1: ( (lv_type_9_0= ruleRealizationTypeKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:802:1: (lv_type_9_0= ruleRealizationTypeKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:802:1: (lv_type_9_0= ruleRealizationTypeKind )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:803:3: lv_type_9_0= ruleRealizationTypeKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantitativePropertyRealizationAccess().getTypeRealizationTypeKindEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleRealizationTypeKind_in_ruleQuantitativePropertyRealization1658);
            lv_type_9_0=ruleRealizationTypeKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantitativePropertyRealizationRule());
              	        }
                     		set(
                     			current, 
                     			"type",
                      		lv_type_9_0, 
                      		"RealizationTypeKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleQuantitativePropertyRealization1670); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getQuantitativePropertyRealizationAccess().getCommaKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,37,FOLLOW_37_in_ruleQuantitativePropertyRealization1682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getQuantitativePropertyRealizationAccess().getValuesKeyword_9());
                  
            }
            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleQuantitativePropertyRealization1694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getQuantitativePropertyRealizationAccess().getLeftSquareBracketKeyword_10());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:831:1: ( (lv_values_13_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:832:1: (lv_values_13_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:832:1: (lv_values_13_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:833:3: lv_values_13_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getQuantitativePropertyRealizationAccess().getValuesValueSpecificationParserRuleCall_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleQuantitativePropertyRealization1715);
            lv_values_13_0=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getQuantitativePropertyRealizationRule());
              	        }
                     		add(
                     			current, 
                     			"values",
                      		lv_values_13_0, 
                      		"ValueSpecification");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:849:2: (otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==19) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:849:4: otherlv_14= ',' ( (lv_values_15_0= ruleValueSpecification ) )
            	    {
            	    otherlv_14=(Token)match(input,19,FOLLOW_19_in_ruleQuantitativePropertyRealization1728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getQuantitativePropertyRealizationAccess().getCommaKeyword_12_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:853:1: ( (lv_values_15_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:854:1: (lv_values_15_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:854:1: (lv_values_15_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:855:3: lv_values_15_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getQuantitativePropertyRealizationAccess().getValuesValueSpecificationParserRuleCall_12_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleQuantitativePropertyRealization1749);
            	    lv_values_15_0=ruleValueSpecification();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getQuantitativePropertyRealizationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"values",
            	              		lv_values_15_0, 
            	              		"ValueSpecification");
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

            otherlv_16=(Token)match(input,22,FOLLOW_22_in_ruleQuantitativePropertyRealization1763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getQuantitativePropertyRealizationAccess().getRightSquareBracketKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:875:1: (otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==19) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:875:3: otherlv_17= ',' otherlv_18= 'precision' ( (lv_precision_19_0= RULE_EBIGDECIMAL ) )
                    {
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleQuantitativePropertyRealization1776); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getQuantitativePropertyRealizationAccess().getCommaKeyword_14_0());
                          
                    }
                    otherlv_18=(Token)match(input,38,FOLLOW_38_in_ruleQuantitativePropertyRealization1788); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_18, grammarAccess.getQuantitativePropertyRealizationAccess().getPrecisionKeyword_14_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:883:1: ( (lv_precision_19_0= RULE_EBIGDECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:884:1: (lv_precision_19_0= RULE_EBIGDECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:884:1: (lv_precision_19_0= RULE_EBIGDECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:885:3: lv_precision_19_0= RULE_EBIGDECIMAL
                    {
                    lv_precision_19_0=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleQuantitativePropertyRealization1805); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_precision_19_0, grammarAccess.getQuantitativePropertyRealizationAccess().getPrecisionEBIGDECIMALTerminalRuleCall_14_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getQuantitativePropertyRealizationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"precision",
                              		lv_precision_19_0, 
                              		"EBIGDECIMAL");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,24,FOLLOW_24_in_ruleQuantitativePropertyRealization1824); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_20, grammarAccess.getQuantitativePropertyRealizationAccess().getRightCurlyBracketKeyword_15());
                  
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
    // $ANTLR end "ruleQuantitativePropertyRealization"


    // $ANTLR start "entryRuleGoalModelEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:913:1: entryRuleGoalModelEvaluation returns [EObject current=null] : iv_ruleGoalModelEvaluation= ruleGoalModelEvaluation EOF ;
    public final EObject entryRuleGoalModelEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalModelEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:914:2: (iv_ruleGoalModelEvaluation= ruleGoalModelEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:915:2: iv_ruleGoalModelEvaluation= ruleGoalModelEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalModelEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalModelEvaluation_in_entryRuleGoalModelEvaluation1860);
            iv_ruleGoalModelEvaluation=ruleGoalModelEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalModelEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalModelEvaluation1870); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalModelEvaluation"


    // $ANTLR start "ruleGoalModelEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:922:1: ruleGoalModelEvaluation returns [EObject current=null] : (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' ) ;
    public final EObject ruleGoalModelEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token lv_reason_9_0=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Enumerator lv_verdict_6_0 = null;

        EObject lv_evaluations_13_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:925:28: ( (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:926:1: (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:926:1: (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:926:3: otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleGoalModelEvaluation1907); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGoalModelEvaluationAccess().getGoalmodelEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGoalModelEvaluation1919); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalModelEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,40,FOLLOW_40_in_ruleGoalModelEvaluation1931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGoalModelEvaluationAccess().getGoalmodelKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:938:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:939:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:939:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:940:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalModelEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalModelEvaluationAccess().getGoalModelGoalModelCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalModelEvaluation1954);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleGoalModelEvaluation1966); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGoalModelEvaluationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,41,FOLLOW_41_in_ruleGoalModelEvaluation1978); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGoalModelEvaluationAccess().getVerdictKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:961:1: ( (lv_verdict_6_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:962:1: (lv_verdict_6_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:962:1: (lv_verdict_6_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:963:3: lv_verdict_6_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalModelEvaluationAccess().getVerdictVerdictEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleGoalModelEvaluation1999);
            lv_verdict_6_0=ruleVerdict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGoalModelEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"verdict",
                      		lv_verdict_6_0, 
                      		"Verdict");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleGoalModelEvaluation2011); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getGoalModelEvaluationAccess().getCommaKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,42,FOLLOW_42_in_ruleGoalModelEvaluation2023); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getGoalModelEvaluationAccess().getReasonKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:987:1: ( (lv_reason_9_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:988:1: (lv_reason_9_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:988:1: (lv_reason_9_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:989:3: lv_reason_9_0= RULE_STRING
            {
            lv_reason_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoalModelEvaluation2040); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_9_0, grammarAccess.getGoalModelEvaluationAccess().getReasonSTRINGTerminalRuleCall_9_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalModelEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_9_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleGoalModelEvaluation2057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getGoalModelEvaluationAccess().getCommaKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,43,FOLLOW_43_in_ruleGoalModelEvaluation2069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getGoalModelEvaluationAccess().getGoalEvaluationsKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleGoalModelEvaluation2081); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getGoalModelEvaluationAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1017:1: ( (lv_evaluations_13_0= ruleGoalEvaluation ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==44||LA16_0==47||LA16_0==49) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1018:1: (lv_evaluations_13_0= ruleGoalEvaluation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1018:1: (lv_evaluations_13_0= ruleGoalEvaluation )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1019:3: lv_evaluations_13_0= ruleGoalEvaluation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalModelEvaluationAccess().getEvaluationsGoalEvaluationParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalEvaluation_in_ruleGoalModelEvaluation2102);
            	    lv_evaluations_13_0=ruleGoalEvaluation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalModelEvaluationRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"evaluations",
            	              		lv_evaluations_13_0, 
            	              		"GoalEvaluation");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleGoalModelEvaluation2115); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getGoalModelEvaluationAccess().getRightSquareBracketKeyword_14());
                  
            }
            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleGoalModelEvaluation2127); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getGoalModelEvaluationAccess().getRightCurlyBracketKeyword_15());
                  
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
    // $ANTLR end "ruleGoalModelEvaluation"


    // $ANTLR start "entryRuleGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1051:1: entryRuleGoalEvaluation returns [EObject current=null] : iv_ruleGoalEvaluation= ruleGoalEvaluation EOF ;
    public final EObject entryRuleGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1052:2: (iv_ruleGoalEvaluation= ruleGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1053:2: iv_ruleGoalEvaluation= ruleGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalEvaluation_in_entryRuleGoalEvaluation2163);
            iv_ruleGoalEvaluation=ruleGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalEvaluation2173); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalEvaluation"


    // $ANTLR start "ruleGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1060:1: ruleGoalEvaluation returns [EObject current=null] : (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation ) ;
    public final EObject ruleGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject this_SoftGoalEvaluation_0 = null;

        EObject this_HardGoalEvaluation_1 = null;

        EObject this_CompositeGoalEvaluation_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1063:28: ( (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1064:1: (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1064:1: (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation )
            int alt17=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt17=1;
                }
                break;
            case 47:
                {
                alt17=2;
                }
                break;
            case 49:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1065:5: this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalEvaluationAccess().getSoftGoalEvaluationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSoftGoalEvaluation_in_ruleGoalEvaluation2220);
                    this_SoftGoalEvaluation_0=ruleSoftGoalEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SoftGoalEvaluation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1075:5: this_HardGoalEvaluation_1= ruleHardGoalEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalEvaluationAccess().getHardGoalEvaluationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHardGoalEvaluation_in_ruleGoalEvaluation2247);
                    this_HardGoalEvaluation_1=ruleHardGoalEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HardGoalEvaluation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1085:5: this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalEvaluationAccess().getCompositeGoalEvaluationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeGoalEvaluation_in_ruleGoalEvaluation2274);
                    this_CompositeGoalEvaluation_2=ruleCompositeGoalEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeGoalEvaluation_2; 
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
    // $ANTLR end "ruleGoalEvaluation"


    // $ANTLR start "entryRuleSoftGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1101:1: entryRuleSoftGoalEvaluation returns [EObject current=null] : iv_ruleSoftGoalEvaluation= ruleSoftGoalEvaluation EOF ;
    public final EObject entryRuleSoftGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1102:2: (iv_ruleSoftGoalEvaluation= ruleSoftGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1103:2: iv_ruleSoftGoalEvaluation= ruleSoftGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoalEvaluation_in_entryRuleSoftGoalEvaluation2309);
            iv_ruleSoftGoalEvaluation=ruleSoftGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoalEvaluation2319); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoftGoalEvaluation"


    // $ANTLR start "ruleSoftGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1110:1: ruleSoftGoalEvaluation returns [EObject current=null] : (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' ) ;
    public final EObject ruleSoftGoalEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_reason_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_verdict_7_0 = null;

        AntlrDatatypeRuleToken lv_difference_13_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1113:28: ( (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1114:1: (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1114:1: (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1114:3: otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,44,FOLLOW_44_in_ruleSoftGoalEvaluation2356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSoftGoalEvaluationAccess().getSoftGoalEvaluationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1118:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1119:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1119:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1120:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftGoalEvaluation2373); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSoftGoalEvaluationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSoftGoalEvaluation2390); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSoftGoalEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleSoftGoalEvaluation2402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSoftGoalEvaluationAccess().getGoalKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1144:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1145:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1145:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1146:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalEvaluationAccess().getGoalSoftGoalCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoalEvaluation2425);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoalEvaluation2437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSoftGoalEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleSoftGoalEvaluation2449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSoftGoalEvaluationAccess().getVerdictKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1167:1: ( (lv_verdict_7_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1168:1: (lv_verdict_7_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1168:1: (lv_verdict_7_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1169:3: lv_verdict_7_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleSoftGoalEvaluation2470);
            lv_verdict_7_0=ruleVerdict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSoftGoalEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"verdict",
                      		lv_verdict_7_0, 
                      		"Verdict");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoalEvaluation2482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSoftGoalEvaluationAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleSoftGoalEvaluation2494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSoftGoalEvaluationAccess().getReasonKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1193:1: ( (lv_reason_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1194:1: (lv_reason_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1194:1: (lv_reason_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1195:3: lv_reason_10_0= RULE_STRING
            {
            lv_reason_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftGoalEvaluation2511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_10_0, grammarAccess.getSoftGoalEvaluationAccess().getReasonSTRINGTerminalRuleCall_10_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_10_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoalEvaluation2528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getSoftGoalEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleSoftGoalEvaluation2540); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSoftGoalEvaluationAccess().getDifferenceKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1219:1: ( (lv_difference_13_0= ruleNumber ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_EBIGDECIMAL||(LA18_0>=RULE_INT && LA18_0<=RULE_SMALL_DECIMAL)) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1220:1: (lv_difference_13_0= ruleNumber )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1220:1: (lv_difference_13_0= ruleNumber )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1221:3: lv_difference_13_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSoftGoalEvaluationAccess().getDifferenceNumberParserRuleCall_13_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleSoftGoalEvaluation2561);
                    lv_difference_13_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSoftGoalEvaluationRule());
                      	        }
                             		set(
                             			current, 
                             			"difference",
                              		lv_difference_13_0, 
                              		"Number");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleSoftGoalEvaluation2574); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getSoftGoalEvaluationAccess().getRightCurlyBracketKeyword_14());
                  
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
    // $ANTLR end "ruleSoftGoalEvaluation"


    // $ANTLR start "entryRuleHardGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1249:1: entryRuleHardGoalEvaluation returns [EObject current=null] : iv_ruleHardGoalEvaluation= ruleHardGoalEvaluation EOF ;
    public final EObject entryRuleHardGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1250:2: (iv_ruleHardGoalEvaluation= ruleHardGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1251:2: iv_ruleHardGoalEvaluation= ruleHardGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleHardGoalEvaluation_in_entryRuleHardGoalEvaluation2610);
            iv_ruleHardGoalEvaluation=ruleHardGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardGoalEvaluation2620); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHardGoalEvaluation"


    // $ANTLR start "ruleHardGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1258:1: ruleHardGoalEvaluation returns [EObject current=null] : (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) ;
    public final EObject ruleHardGoalEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_reason_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_verdict_7_0 = null;

        EObject lv_conditionEvaluation_13_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1261:28: ( (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1262:1: (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1262:1: (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1262:3: otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleHardGoalEvaluation2657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHardGoalEvaluationAccess().getHardGoalEvaluationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1266:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1267:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1267:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1268:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHardGoalEvaluation2674); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getHardGoalEvaluationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHardGoalEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleHardGoalEvaluation2691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHardGoalEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleHardGoalEvaluation2703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHardGoalEvaluationAccess().getGoalKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1292:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1293:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1293:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1294:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getHardGoalEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalEvaluationAccess().getGoalHardGoalCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleHardGoalEvaluation2726);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleHardGoalEvaluation2738); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHardGoalEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleHardGoalEvaluation2750); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHardGoalEvaluationAccess().getVerdictKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1315:1: ( (lv_verdict_7_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1316:1: (lv_verdict_7_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1316:1: (lv_verdict_7_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1317:3: lv_verdict_7_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleHardGoalEvaluation2771);
            lv_verdict_7_0=ruleVerdict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHardGoalEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"verdict",
                      		lv_verdict_7_0, 
                      		"Verdict");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleHardGoalEvaluation2783); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getHardGoalEvaluationAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleHardGoalEvaluation2795); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHardGoalEvaluationAccess().getReasonKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1341:1: ( (lv_reason_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1342:1: (lv_reason_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1342:1: (lv_reason_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1343:3: lv_reason_10_0= RULE_STRING
            {
            lv_reason_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHardGoalEvaluation2812); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_10_0, grammarAccess.getHardGoalEvaluationAccess().getReasonSTRINGTerminalRuleCall_10_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHardGoalEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_10_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleHardGoalEvaluation2829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getHardGoalEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleHardGoalEvaluation2841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getHardGoalEvaluationAccess().getConditionEvaluationKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1367:1: ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1368:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1368:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1369:3: lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalEvaluationAccess().getConditionEvaluationBooleanExpressionEvaluationParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_ruleHardGoalEvaluation2862);
            lv_conditionEvaluation_13_0=ruleBooleanExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHardGoalEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"conditionEvaluation",
                      		lv_conditionEvaluation_13_0, 
                      		"BooleanExpressionEvaluation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleHardGoalEvaluation2874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getHardGoalEvaluationAccess().getRightCurlyBracketKeyword_14());
                  
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
    // $ANTLR end "ruleHardGoalEvaluation"


    // $ANTLR start "entryRuleCompositeGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1397:1: entryRuleCompositeGoalEvaluation returns [EObject current=null] : iv_ruleCompositeGoalEvaluation= ruleCompositeGoalEvaluation EOF ;
    public final EObject entryRuleCompositeGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1398:2: (iv_ruleCompositeGoalEvaluation= ruleCompositeGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1399:2: iv_ruleCompositeGoalEvaluation= ruleCompositeGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeGoalEvaluation_in_entryRuleCompositeGoalEvaluation2910);
            iv_ruleCompositeGoalEvaluation=ruleCompositeGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeGoalEvaluation2920); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeGoalEvaluation"


    // $ANTLR start "ruleCompositeGoalEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1406:1: ruleCompositeGoalEvaluation returns [EObject current=null] : (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) ;
    public final EObject ruleCompositeGoalEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_reason_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Enumerator lv_verdict_7_0 = null;

        EObject lv_conditionEvaluation_13_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1409:28: ( (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1410:1: (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1410:1: (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1410:3: otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_49_in_ruleCompositeGoalEvaluation2957); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeGoalEvaluationAccess().getCompositeGoalEvaluationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1414:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1415:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1415:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1416:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeGoalEvaluation2974); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getCompositeGoalEvaluationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeGoalEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCompositeGoalEvaluation2991); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeGoalEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleCompositeGoalEvaluation3003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeGoalEvaluationAccess().getGoalKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1440:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1441:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1441:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1442:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeGoalEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalEvaluationAccess().getGoalCompositeGoalCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeGoalEvaluation3026);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleCompositeGoalEvaluation3038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCompositeGoalEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,41,FOLLOW_41_in_ruleCompositeGoalEvaluation3050); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeGoalEvaluationAccess().getVerdictKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1463:1: ( (lv_verdict_7_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1464:1: (lv_verdict_7_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1464:1: (lv_verdict_7_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1465:3: lv_verdict_7_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleCompositeGoalEvaluation3071);
            lv_verdict_7_0=ruleVerdict();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeGoalEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"verdict",
                      		lv_verdict_7_0, 
                      		"Verdict");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleCompositeGoalEvaluation3083); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeGoalEvaluationAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,42,FOLLOW_42_in_ruleCompositeGoalEvaluation3095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeGoalEvaluationAccess().getReasonKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1489:1: ( (lv_reason_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1490:1: (lv_reason_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1490:1: (lv_reason_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1491:3: lv_reason_10_0= RULE_STRING
            {
            lv_reason_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompositeGoalEvaluation3112); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_10_0, grammarAccess.getCompositeGoalEvaluationAccess().getReasonSTRINGTerminalRuleCall_10_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeGoalEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_10_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleCompositeGoalEvaluation3129); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCompositeGoalEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,48,FOLLOW_48_in_ruleCompositeGoalEvaluation3141); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCompositeGoalEvaluationAccess().getConditionEvaluationKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1515:1: ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1516:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1516:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1517:3: lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalEvaluationAccess().getConditionEvaluationBooleanExpressionEvaluationParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_ruleCompositeGoalEvaluation3162);
            lv_conditionEvaluation_13_0=ruleBooleanExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeGoalEvaluationRule());
              	        }
                     		set(
                     			current, 
                     			"conditionEvaluation",
                      		lv_conditionEvaluation_13_0, 
                      		"BooleanExpressionEvaluation");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleCompositeGoalEvaluation3174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getCompositeGoalEvaluationAccess().getRightCurlyBracketKeyword_14());
                  
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
    // $ANTLR end "ruleCompositeGoalEvaluation"


    // $ANTLR start "entryRuleValueExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1545:1: entryRuleValueExpressionEvaluation returns [EObject current=null] : iv_ruleValueExpressionEvaluation= ruleValueExpressionEvaluation EOF ;
    public final EObject entryRuleValueExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1546:2: (iv_ruleValueExpressionEvaluation= ruleValueExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1547:2: iv_ruleValueExpressionEvaluation= ruleValueExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_entryRuleValueExpressionEvaluation3210);
            iv_ruleValueExpressionEvaluation=ruleValueExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpressionEvaluation3220); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueExpressionEvaluation"


    // $ANTLR start "ruleValueExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1554:1: ruleValueExpressionEvaluation returns [EObject current=null] : (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation ) ;
    public final EObject ruleValueExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueSpecificationExpressionEvaluation_0 = null;

        EObject this_BooleanExpressionEvaluation_1 = null;

        EObject this_NumberExpressionEvaluation_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1557:28: ( (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1558:1: (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1558:1: (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation )
            int alt19=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt19=1;
                }
                break;
            case 53:
                {
                alt19=2;
                }
                break;
            case 54:
                {
                alt19=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1559:5: this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionEvaluationAccess().getValueSpecificationExpressionEvaluationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueSpecificationExpressionEvaluation_in_ruleValueExpressionEvaluation3267);
                    this_ValueSpecificationExpressionEvaluation_0=ruleValueSpecificationExpressionEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ValueSpecificationExpressionEvaluation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1569:5: this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionEvaluationAccess().getBooleanExpressionEvaluationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_ruleValueExpressionEvaluation3294);
                    this_BooleanExpressionEvaluation_1=ruleBooleanExpressionEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_BooleanExpressionEvaluation_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1579:5: this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionEvaluationAccess().getNumberExpressionEvaluationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_ruleValueExpressionEvaluation3321);
                    this_NumberExpressionEvaluation_2=ruleNumberExpressionEvaluation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberExpressionEvaluation_2; 
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
    // $ANTLR end "ruleValueExpressionEvaluation"


    // $ANTLR start "entryRuleValueSpecificationExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1595:1: entryRuleValueSpecificationExpressionEvaluation returns [EObject current=null] : iv_ruleValueSpecificationExpressionEvaluation= ruleValueSpecificationExpressionEvaluation EOF ;
    public final EObject entryRuleValueSpecificationExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecificationExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1596:2: (iv_ruleValueSpecificationExpressionEvaluation= ruleValueSpecificationExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1597:2: iv_ruleValueSpecificationExpressionEvaluation= ruleValueSpecificationExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecificationExpressionEvaluation_in_entryRuleValueSpecificationExpressionEvaluation3356);
            iv_ruleValueSpecificationExpressionEvaluation=ruleValueSpecificationExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecificationExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecificationExpressionEvaluation3366); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueSpecificationExpressionEvaluation"


    // $ANTLR start "ruleValueSpecificationExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1604:1: ruleValueSpecificationExpressionEvaluation returns [EObject current=null] : (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) ;
    public final EObject ruleValueSpecificationExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_reason_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_result_3_0 = null;

        EObject lv_evaluations_10_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1607:28: ( (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1608:1: (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1608:1: (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1608:3: otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,50,FOLLOW_50_in_ruleValueSpecificationExpressionEvaluation3403); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getValueEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleValueSpecificationExpressionEvaluation3415); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleValueSpecificationExpressionEvaluation3427); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getResultKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1620:1: ( (lv_result_3_0= ruleValueSpecification ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_SMALL_DECIMAL)||LA20_0==59) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1621:1: (lv_result_3_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1621:1: (lv_result_3_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1622:3: lv_result_3_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueSpecificationExpressionEvaluationAccess().getResultValueSpecificationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleValueSpecificationExpressionEvaluation3448);
                    lv_result_3_0=ruleValueSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getValueSpecificationExpressionEvaluationRule());
                      	        }
                             		set(
                             			current, 
                             			"result",
                              		lv_result_3_0, 
                              		"ValueSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleValueSpecificationExpressionEvaluation3461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleValueSpecificationExpressionEvaluation3473); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getReasonKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1646:1: ( (lv_reason_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1647:1: (lv_reason_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1647:1: (lv_reason_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1648:3: lv_reason_6_0= RULE_STRING
            {
            lv_reason_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueSpecificationExpressionEvaluation3490); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_6_0, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getReasonSTRINGTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getValueSpecificationExpressionEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_6_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1664:2: (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==19) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1664:4: otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleValueSpecificationExpressionEvaluation3508); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,52,FOLLOW_52_in_ruleValueSpecificationExpressionEvaluation3520); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getEvaluationsKeyword_7_1());
                          
                    }
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleValueSpecificationExpressionEvaluation3532); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1676:1: ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==50||(LA21_0>=53 && LA21_0<=54)) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1677:1: (lv_evaluations_10_0= ruleValueExpressionEvaluation )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1677:1: (lv_evaluations_10_0= ruleValueExpressionEvaluation )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1678:3: lv_evaluations_10_0= ruleValueExpressionEvaluation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueSpecificationExpressionEvaluationAccess().getEvaluationsValueExpressionEvaluationParserRuleCall_7_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_ruleValueSpecificationExpressionEvaluation3553);
                    	    lv_evaluations_10_0=ruleValueExpressionEvaluation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getValueSpecificationExpressionEvaluationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"evaluations",
                    	              		lv_evaluations_10_0, 
                    	              		"ValueExpressionEvaluation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleValueSpecificationExpressionEvaluation3566); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getRightSquareBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleValueSpecificationExpressionEvaluation3580); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleValueSpecificationExpressionEvaluation"


    // $ANTLR start "entryRuleBooleanExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1710:1: entryRuleBooleanExpressionEvaluation returns [EObject current=null] : iv_ruleBooleanExpressionEvaluation= ruleBooleanExpressionEvaluation EOF ;
    public final EObject entryRuleBooleanExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1711:2: (iv_ruleBooleanExpressionEvaluation= ruleBooleanExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1712:2: iv_ruleBooleanExpressionEvaluation= ruleBooleanExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_entryRuleBooleanExpressionEvaluation3616);
            iv_ruleBooleanExpressionEvaluation=ruleBooleanExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpressionEvaluation3626); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanExpressionEvaluation"


    // $ANTLR start "ruleBooleanExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1719:1: ruleBooleanExpressionEvaluation returns [EObject current=null] : (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' ) ;
    public final EObject ruleBooleanExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_reason_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        EObject lv_result_3_0 = null;

        AntlrDatatypeRuleToken lv_difference_9_0 = null;

        EObject lv_evaluations_13_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1722:28: ( (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1723:1: (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1723:1: (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1723:3: otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleBooleanExpressionEvaluation3663); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionEvaluationAccess().getExpressionEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleBooleanExpressionEvaluation3675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBooleanExpressionEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1731:1: (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==51) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1731:3: otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleBooleanExpressionEvaluation3688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionEvaluationAccess().getResultKeyword_2_0());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1735:1: ( (lv_result_3_0= ruleBooleanLiteral ) )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==RULE_EBOOLEAN) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1736:1: (lv_result_3_0= ruleBooleanLiteral )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1736:1: (lv_result_3_0= ruleBooleanLiteral )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1737:3: lv_result_3_0= ruleBooleanLiteral
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBooleanExpressionEvaluationAccess().getResultBooleanLiteralParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanExpressionEvaluation3709);
                            lv_result_3_0=ruleBooleanLiteral();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBooleanExpressionEvaluationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"result",
                                      		lv_result_3_0, 
                                      		"BooleanLiteral");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleBooleanExpressionEvaluation3722); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleBooleanExpressionEvaluation3736); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBooleanExpressionEvaluationAccess().getReasonKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1761:1: ( (lv_reason_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1762:1: (lv_reason_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1762:1: (lv_reason_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1763:3: lv_reason_6_0= RULE_STRING
            {
            lv_reason_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBooleanExpressionEvaluation3753); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_6_0, grammarAccess.getBooleanExpressionEvaluationAccess().getReasonSTRINGTerminalRuleCall_4_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getBooleanExpressionEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_6_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1779:2: (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==19) ) {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==46) ) {
                    alt26=1;
                }
            }
            switch (alt26) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1779:4: otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )?
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleBooleanExpressionEvaluation3771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_8=(Token)match(input,46,FOLLOW_46_in_ruleBooleanExpressionEvaluation3783); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBooleanExpressionEvaluationAccess().getDifferenceKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1787:1: ( (lv_difference_9_0= ruleNumber ) )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==RULE_EBIGDECIMAL||(LA25_0>=RULE_INT && LA25_0<=RULE_SMALL_DECIMAL)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1788:1: (lv_difference_9_0= ruleNumber )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1788:1: (lv_difference_9_0= ruleNumber )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1789:3: lv_difference_9_0= ruleNumber
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBooleanExpressionEvaluationAccess().getDifferenceNumberParserRuleCall_5_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumber_in_ruleBooleanExpressionEvaluation3804);
                            lv_difference_9_0=ruleNumber();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getBooleanExpressionEvaluationRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"difference",
                                      		lv_difference_9_0, 
                                      		"Number");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }
                            break;

                    }


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1805:5: (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==19) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1805:7: otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleBooleanExpressionEvaluation3820); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_11=(Token)match(input,52,FOLLOW_52_in_ruleBooleanExpressionEvaluation3832); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBooleanExpressionEvaluationAccess().getEvaluationsKeyword_6_1());
                          
                    }
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleBooleanExpressionEvaluation3844); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBooleanExpressionEvaluationAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1817:1: ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==50||(LA27_0>=53 && LA27_0<=54)) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1818:1: (lv_evaluations_13_0= ruleValueExpressionEvaluation )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1818:1: (lv_evaluations_13_0= ruleValueExpressionEvaluation )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1819:3: lv_evaluations_13_0= ruleValueExpressionEvaluation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBooleanExpressionEvaluationAccess().getEvaluationsValueExpressionEvaluationParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_ruleBooleanExpressionEvaluation3865);
                    	    lv_evaluations_13_0=ruleValueExpressionEvaluation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getBooleanExpressionEvaluationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"evaluations",
                    	              		lv_evaluations_13_0, 
                    	              		"ValueExpressionEvaluation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleBooleanExpressionEvaluation3878); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBooleanExpressionEvaluationAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,24,FOLLOW_24_in_ruleBooleanExpressionEvaluation3892); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getBooleanExpressionEvaluationAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleBooleanExpressionEvaluation"


    // $ANTLR start "entryRuleNumberExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1851:1: entryRuleNumberExpressionEvaluation returns [EObject current=null] : iv_ruleNumberExpressionEvaluation= ruleNumberExpressionEvaluation EOF ;
    public final EObject entryRuleNumberExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1852:2: (iv_ruleNumberExpressionEvaluation= ruleNumberExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1853:2: iv_ruleNumberExpressionEvaluation= ruleNumberExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_entryRuleNumberExpressionEvaluation3928);
            iv_ruleNumberExpressionEvaluation=ruleNumberExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpressionEvaluation3938); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberExpressionEvaluation"


    // $ANTLR start "ruleNumberExpressionEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1860:1: ruleNumberExpressionEvaluation returns [EObject current=null] : (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) ;
    public final EObject ruleNumberExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_reason_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_result_3_0 = null;

        EObject lv_evaluations_10_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1863:28: ( (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1864:1: (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1864:1: (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1864:3: otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_54_in_ruleNumberExpressionEvaluation3975); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberExpressionEvaluationAccess().getArithmeticEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleNumberExpressionEvaluation3987); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumberExpressionEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleNumberExpressionEvaluation3999); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNumberExpressionEvaluationAccess().getResultKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1876:1: ( (lv_result_3_0= ruleNumberLiteral ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_EBIGDECIMAL||(LA29_0>=RULE_INT && LA29_0<=RULE_SMALL_DECIMAL)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1877:1: (lv_result_3_0= ruleNumberLiteral )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1877:1: (lv_result_3_0= ruleNumberLiteral )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1878:3: lv_result_3_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberExpressionEvaluationAccess().getResultNumberLiteralParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpressionEvaluation4020);
                    lv_result_3_0=ruleNumberLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getNumberExpressionEvaluationRule());
                      	        }
                             		set(
                             			current, 
                             			"result",
                              		lv_result_3_0, 
                              		"NumberLiteral");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleNumberExpressionEvaluation4033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNumberExpressionEvaluationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleNumberExpressionEvaluation4045); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNumberExpressionEvaluationAccess().getReasonKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1902:1: ( (lv_reason_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1903:1: (lv_reason_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1903:1: (lv_reason_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1904:3: lv_reason_6_0= RULE_STRING
            {
            lv_reason_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberExpressionEvaluation4062); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_reason_6_0, grammarAccess.getNumberExpressionEvaluationAccess().getReasonSTRINGTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getNumberExpressionEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"reason",
                      		lv_reason_6_0, 
                      		"STRING");
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1920:2: (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1920:4: otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleNumberExpressionEvaluation4080); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNumberExpressionEvaluationAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleNumberExpressionEvaluation4092); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getNumberExpressionEvaluationAccess().getArithmeticEvaluationsKeyword_7_1());
                          
                    }
                    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleNumberExpressionEvaluation4104); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNumberExpressionEvaluationAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1932:1: ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==54) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1933:1: (lv_evaluations_10_0= ruleNumberExpressionEvaluation )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1933:1: (lv_evaluations_10_0= ruleNumberExpressionEvaluation )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1934:3: lv_evaluations_10_0= ruleNumberExpressionEvaluation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNumberExpressionEvaluationAccess().getEvaluationsNumberExpressionEvaluationParserRuleCall_7_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_ruleNumberExpressionEvaluation4125);
                    	    lv_evaluations_10_0=ruleNumberExpressionEvaluation();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getNumberExpressionEvaluationRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"evaluations",
                    	              		lv_evaluations_10_0, 
                    	              		"NumberExpressionEvaluation");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleNumberExpressionEvaluation4138); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getNumberExpressionEvaluationAccess().getRightSquareBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleNumberExpressionEvaluation4152); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getNumberExpressionEvaluationAccess().getRightCurlyBracketKeyword_8());
                  
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
    // $ANTLR end "ruleNumberExpressionEvaluation"


    // $ANTLR start "entryRuleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1966:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1967:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1968:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4188);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4198); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1975:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1978:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1980:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression4244);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1996:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1997:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1998:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication4278);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication4288); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2005:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2008:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2009:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2009:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2010:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4335);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2018:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=66 && LA32_0<=67)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2018:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2018:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2019:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2024:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2025:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2025:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2026:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication4365);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2042:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2043:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2043:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2044:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4386);
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
            	    break loop32;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2068:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2069:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2070:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction4424);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction4434); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2077:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2080:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2081:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2081:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2082:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4481);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2090:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=60 && LA34_0<=63)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2090:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2090:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2091:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2096:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2097:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2097:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2098:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2098:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt33=2;
            	    int LA33_0 = input.LA(1);

            	    if ( ((LA33_0>=60 && LA33_0<=61)) ) {
            	        alt33=1;
            	    }
            	    else if ( ((LA33_0>=62 && LA33_0<=63)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2099:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction4513);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2114:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction4532);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2132:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2133:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2133:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2134:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4556);
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
            	    break loop34;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2158:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2159:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2160:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction4594);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction4604); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2167:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2170:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2171:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2171:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2172:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4651);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2180:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=64 && LA35_0<=65)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2180:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2180:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2181:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2186:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2187:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2187:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2188:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction4681);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2204:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2205:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2205:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2206:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4702);
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
            	    break loop35;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2230:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2231:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2232:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison4740);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison4750); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2239:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2242:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2243:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2243:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2244:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison4797);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2252:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( ((LA37_0>=68 && LA37_0<=70)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2252:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2252:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2253:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2258:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2259:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2259:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2260:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2260:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt36=2;
            	    int LA36_0 = input.LA(1);

            	    if ( (LA36_0==68) ) {
            	        alt36=1;
            	    }
            	    else if ( ((LA36_0>=69 && LA36_0<=70)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2261:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison4829);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2276:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison4848);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2294:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2295:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2295:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2296:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison4872);
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
            	    break loop37;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2320:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2321:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2322:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit4910);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit4920); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2329:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2332:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2333:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2333:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 71:
            case 72:
                {
                alt38=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_EBIGDECIMAL:
            case RULE_NULL:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case 56:
            case 59:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
                {
                alt38=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt38=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2334:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit4967);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2344:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit4994);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2354:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5021);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2370:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2371:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2372:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation5056);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation5066); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2379:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2382:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2383:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2383:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2383:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2383:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2384:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2384:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2385:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation5112);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2401:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2402:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2402:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2403:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation5133);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2427:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2428:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2429:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5169);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression5179); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2436:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2439:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2440:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2440:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2441:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5226);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( ((LA40_0>=73 && LA40_0<=76)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt39=4;
            	    switch ( input.LA(1) ) {
            	    case 73:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 74:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 76:
            	        {
            	        alt39=3;
            	        }
            	        break;
            	    case 75:
            	        {
            	        alt39=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 39, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt39) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2449:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2450:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2455:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2456:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2456:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2457:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5258);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2474:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2474:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2474:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2474:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2475:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2480:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2481:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2481:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2482:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5296);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2499:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2499:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2499:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2499:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2500:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2505:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2506:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2506:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2507:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5334);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2524:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2524:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2524:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2524:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2525:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2530:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2531:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2531:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2532:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5372);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2548:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2549:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2549:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2550:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5395);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2574:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2575:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2576:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5433);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression5443); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2583:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2586:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2587:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2587:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt41=7;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2588:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5490);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2598:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5517);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2608:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5544);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2618:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression5571);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2628:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression5598);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2638:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5625);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2648:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5652);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2664:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2665:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2666:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5687);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression5697); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2673:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2676:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2678:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5743);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2694:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2695:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2696:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5777);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression5787); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2703:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2706:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2707:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2707:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2708:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5834);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2716:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=77 && LA43_0<=78)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2716:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2716:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2717:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2722:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2723:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2723:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2724:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2724:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==78) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==77) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2725:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression5866);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2740:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression5885);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2758:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2759:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2759:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2760:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5909);
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
            	    break loop43;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2784:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2785:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2786:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression5947);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression5957); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2793:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2796:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2797:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2797:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2798:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6004);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2806:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==59||(LA45_0>=79 && LA45_0<=80)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2806:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2806:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2807:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2812:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2813:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2813:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2814:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2814:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt44=3;
            	    switch ( input.LA(1) ) {
            	    case 59:
            	        {
            	        alt44=1;
            	        }
            	        break;
            	    case 79:
            	        {
            	        alt44=2;
            	        }
            	        break;
            	    case 80:
            	        {
            	        alt44=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt44) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2815:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6036);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2830:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6055);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2845:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6074);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2863:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2864:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2864:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2865:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6098);
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
            	    break loop45;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2889:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2890:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2891:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression6136);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression6146); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2898:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2901:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2902:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2902:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_EBIGDECIMAL||(LA46_0>=RULE_INT && LA46_0<=RULE_SMALL_DECIMAL)) ) {
                alt46=1;
            }
            else if ( ((LA46_0>=81 && LA46_0<=88)) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2903:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression6193);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2913:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression6220);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2929:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2930:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2931:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6255);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction6265); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2938:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2941:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2942:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2942:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt47=8;
            switch ( input.LA(1) ) {
            case 81:
                {
                alt47=1;
                }
                break;
            case 82:
                {
                alt47=2;
                }
                break;
            case 83:
                {
                alt47=3;
                }
                break;
            case 84:
                {
                alt47=4;
                }
                break;
            case 85:
                {
                alt47=5;
                }
                break;
            case 86:
                {
                alt47=6;
                }
                break;
            case 87:
                {
                alt47=7;
                }
                break;
            case 88:
                {
                alt47=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2943:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6312);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2953:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6339);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2963:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction6366);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2973:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction6393);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2983:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6420);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2993:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6447);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3003:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6474);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3013:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6501);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3029:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3030:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3031:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6536);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction6546); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3038:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3041:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3042:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3042:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3042:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3042:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3043:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3043:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3044:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6592);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleMaximumFunction6604); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3064:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3065:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3065:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3066:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6625);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3082:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==19) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3082:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMaximumFunction6638); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3086:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3087:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3087:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3088:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6659);
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
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleMaximumFunction6673); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3116:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3117:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3118:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6709);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction6719); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3125:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3128:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3129:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3129:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3129:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3129:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3130:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3130:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3131:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction6765);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleMinimumFunction6777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3151:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3152:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3152:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3153:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6798);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3169:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==19) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3169:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleMinimumFunction6811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3173:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3174:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3174:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3175:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6832);
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
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleMinimumFunction6846); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3203:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3204:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3205:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6882);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction6892); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3212:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3215:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3216:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3216:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3216:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3216:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3217:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3217:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3218:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction6938);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleAverageFunction6950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3238:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3239:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3239:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3240:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction6971);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3256:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==19) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3256:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleAverageFunction6984); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3260:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3261:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3261:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3262:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7005);
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
            	    break loop50;
                }
            } while (true);

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleAverageFunction7019); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3290:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3291:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3292:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction7055);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction7065); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3299:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3302:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3303:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3303:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3303:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3303:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3304:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3304:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3305:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction7111);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleSumFunction7123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3325:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3326:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3326:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3327:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7144);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3343:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==19) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3343:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleSumFunction7157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3347:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3348:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3348:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3349:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7178);
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
            	    break loop51;
                }
            } while (true);

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleSumFunction7192); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3377:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3378:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3379:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7228);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction7238); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3386:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3389:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3390:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3390:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3390:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3390:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3391:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3391:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3392:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7284);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleExponentialFunction7296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3412:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3413:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3413:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3414:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7317);
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

            otherlv_3=(Token)match(input,19,FOLLOW_19_in_ruleExponentialFunction7329); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3434:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3435:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3435:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3436:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7350);
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

            otherlv_5=(Token)match(input,57,FOLLOW_57_in_ruleExponentialFunction7362); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3464:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3465:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3466:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7398);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction7408); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3473:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3476:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3477:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3477:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3477:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3477:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3478:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3478:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3479:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7454);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleAbsoluteFunction7466); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3499:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3500:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3500:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3501:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7487);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleAbsoluteFunction7499); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3529:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3530:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3531:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7535);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7545); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3538:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3541:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3542:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3542:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3542:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3542:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3543:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3543:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3544:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7591);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNaturalLogarithmFunction7603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3564:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3565:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3565:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3566:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7624);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleNaturalLogarithmFunction7636); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3594:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3595:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3596:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7672);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7682); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3603:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3606:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3607:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3607:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3607:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3607:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3608:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3608:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3609:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7728);
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

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleCommonLogarithmFunction7740); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3629:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3630:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3630:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3631:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7761);
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

            otherlv_3=(Token)match(input,57,FOLLOW_57_in_ruleCommonLogarithmFunction7773); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3659:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3660:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3661:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7809);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7819); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3668:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3671:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3672:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3672:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3673:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7860);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3680:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3681:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3681:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3682:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7880);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7896);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3714:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3715:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3716:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7931);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification7941); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3723:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3726:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3727:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3727:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt52=3;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3728:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification7988);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3738:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8015);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3748:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8042);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3764:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3765:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3766:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8077);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8087); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3773:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3776:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3777:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3777:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3777:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3777:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3778:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3778:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3779:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8135);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3792:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==21) ) {
                alt53=1;
            }
            else if ( (LA53_0==17) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3792:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3792:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3793:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3793:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3794:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8157);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3811:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3811:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3812:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3812:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3813:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8184);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3837:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3838:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3839:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection8221);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection8231); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3846:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3849:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3850:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3850:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3850:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_21_in_ruleCollection8268); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3854:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3855:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3855:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3856:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8289);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3872:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==19) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3872:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleCollection8302); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3876:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3877:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3877:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3878:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8323);
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
            	    break loop54;
                }
            } while (true);

            otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleCollection8337); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3906:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3907:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3908:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple8373);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple8383); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3915:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3918:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3919:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3919:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3919:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple8420); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3923:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3924:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3924:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3925:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8441);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3941:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==19) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3941:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,19,FOLLOW_19_in_ruleTuple8454); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3945:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3946:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3946:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3947:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8475);
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
            	    break loop55;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTuple8489); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3975:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3976:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3977:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8525);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair8535); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3984:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3987:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3988:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3988:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3988:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3988:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3989:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3989:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3990:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8583);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,58,FOLLOW_58_in_rulePropertyValuePair8595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4007:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4008:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4008:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4009:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8616);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4033:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4034:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4035:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8652);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8662); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4042:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4045:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4046:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4046:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4047:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4047:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4048:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8709);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4069:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4070:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4071:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8744);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression8754); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4078:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4081:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4082:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4082:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt56=5;
            switch ( input.LA(1) ) {
            case RULE_EBIGDECIMAL:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
                {
                alt56=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt56=2;
                }
                break;
            case RULE_NULL:
                {
                alt56=3;
                }
                break;
            case RULE_STRING:
                {
                alt56=4;
                }
                break;
            case 59:
                {
                alt56=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4083:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8801);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4093:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8828);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4103:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8855);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4113:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8882);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4123:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8909);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4139:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4140:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4141:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8944);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8954); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4148:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4151:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4152:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4152:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4153:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4153:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4154:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral8995); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4178:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4179:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4180:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9035);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9045); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4187:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4190:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4191:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4191:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4192:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4192:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4193:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral9090);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4217:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4218:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4219:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9125);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9135); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4226:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4229:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4230:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4230:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4231:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4231:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4232:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral9176); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4256:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4257:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4258:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9216);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9226); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4265:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4268:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4269:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4269:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4270:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4270:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4271:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9267); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4295:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4296:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4297:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9307);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral9317); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4304:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4307:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4308:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4308:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4309:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4309:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4310:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,59,FOLLOW_59_in_ruleUnlimitedLiteral9359); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4331:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4332:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4333:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator9407);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator9417); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4340:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4343:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4344:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4344:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4344:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4344:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4345:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4350:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==60) ) {
                alt57=1;
            }
            else if ( (LA57_0==61) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4350:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleOrOperator9464); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4355:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleOrOperator9482); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4367:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4368:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4369:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9519);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator9529); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4376:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4379:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4380:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4380:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4380:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4380:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4381:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4386:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==62) ) {
                alt58=1;
            }
            else if ( (LA58_0==63) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4386:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleXOrOperator9576); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4391:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleXOrOperator9594); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4403:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4404:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4405:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator9631);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator9641); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4412:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4415:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4416:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4416:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4416:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4416:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4417:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4422:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==64) ) {
                alt59=1;
            }
            else if ( (LA59_0==65) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4422:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAndOperator9688); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4427:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleAndOperator9706); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4439:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4440:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4441:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9743);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator9753); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4448:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4451:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4452:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4452:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4452:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4452:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4453:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4458:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==66) ) {
                alt60=1;
            }
            else if ( (LA60_0==67) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4458:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleImplicationOperator9800); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4463:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleImplicationOperator9818); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4475:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4476:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4477:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9855);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator9865); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4484:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4487:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4488:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4488:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4488:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4488:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4489:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleEqualsOperator9911); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4506:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4507:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4508:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator9947);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator9957); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4515:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4518:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4519:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4519:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4519:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4519:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4520:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4525:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==69) ) {
                alt61=1;
            }
            else if ( (LA61_0==70) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4525:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleNotEqualsOperator10004); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4530:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleNotEqualsOperator10022); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4542:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4543:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4544:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator10059);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator10069); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4551:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4554:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4555:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4555:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4555:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4555:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4556:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4561:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==71) ) {
                alt62=1;
            }
            else if ( (LA62_0==72) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4561:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleNotOperator10116); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4566:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,72,FOLLOW_72_in_ruleNotOperator10134); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4578:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4579:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4580:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10171);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator10181); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4587:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4590:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4591:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4591:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4591:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4591:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4592:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleGreaterThanOperator10227); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4609:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4610:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4611:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10263);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10273); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4618:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4621:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4622:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4622:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4622:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4622:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4623:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleGreaterOrEqualThanOperator10319); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4640:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4641:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4642:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10355);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator10365); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4649:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4652:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4653:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4653:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4653:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4653:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4654:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleLessThanOperator10411); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4671:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4672:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4673:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10447);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10457); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4680:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4683:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4684:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4684:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4684:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4684:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4685:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleLessOrEqualThanOperator10503); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4702:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4703:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4704:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10539);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator10549); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4711:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4714:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4715:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4715:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4715:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4715:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4716:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleAdditionOperator10595); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4733:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4734:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4735:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10631);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator10641); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4742:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4745:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4746:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4746:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4746:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4746:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4747:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleSubstractionOperator10687); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4764:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4765:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4766:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10723);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator10733); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4773:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4776:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4777:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4777:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4777:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4777:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4778:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleMultiplicationOperator10779); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4795:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4796:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4797:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10815);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator10825); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4804:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4807:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4808:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4808:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4808:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4808:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4809:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleDivisionOperator10871); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4826:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4827:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4828:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10907);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator10917); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4835:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4838:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4839:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4839:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4839:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4839:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4840:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleModulusOperator10963); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4857:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4858:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4859:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator10999);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator11009); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4866:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4869:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4870:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4870:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4870:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4870:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4871:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleMaxOperator11055); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4888:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4889:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4890:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator11091);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator11101); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4897:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4900:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4901:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4901:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4901:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4901:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4902:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleMinOperator11147); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4919:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4920:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4921:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11183);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator11193); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4928:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4931:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4932:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4932:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4932:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4932:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4933:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleAvgOperator11239); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4950:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4951:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4952:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator11275);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator11285); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4959:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4962:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4963:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4963:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4963:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4963:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4964:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleSumOperator11331); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4981:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4982:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4983:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11367);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator11377); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4990:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4993:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4994:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4994:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4994:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4994:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4995:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleExponentialOperator11423); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5012:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5013:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5014:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11459);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator11469); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5021:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5024:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5025:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5025:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5025:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5025:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5026:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleAbsoluteOperator11515); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5043:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5044:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5045:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11551);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11561); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5052:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5055:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5056:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5056:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5056:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5056:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5057:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,87,FOLLOW_87_in_ruleNaturalLogarithmOperator11607); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5074:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5075:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5076:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11643);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11653); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5083:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5086:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5087:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5087:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5087:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5087:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5088:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,88,FOLLOW_88_in_ruleCommonLogarithmOperator11699); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5105:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5106:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5107:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11736);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11747); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5114:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5117:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5119:2: kw= '('
            {
            kw=(Token)match(input,56,FOLLOW_56_in_ruleLeftParenthesis11784); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5132:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5133:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5134:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11824);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis11835); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5141:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5144:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5146:2: kw= ')'
            {
            kw=(Token)match(input,57,FOLLOW_57_in_ruleRightParenthesis11872); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5159:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5160:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5161:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11912);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11923); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5168:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5171:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5172:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5172:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5172:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11963); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5179:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==89) && (synpred1_InternalGEL())) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5179:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5179:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5179:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,89,FOLLOW_89_in_ruleQualifiedName11991); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12007); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5202:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5203:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5204:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12055);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12066); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5211:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5214:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5215:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5215:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5216:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12113);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5226:1: (kw= '.*' )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==90) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5227:2: kw= '.*'
                    {
                    kw=(Token)match(input,90,FOLLOW_90_in_ruleQualifiedNameWithWildcard12132); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5244:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5245:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5246:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12178);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace12188); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5253:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5256:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5257:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5257:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5257:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,91,FOLLOW_91_in_ruleImportNamespace12225); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5261:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5262:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5262:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5263:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12246);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5287:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5288:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5289:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12283);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12294); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5296:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5299:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5300:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5300:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt65=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt65=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt65=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt65=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5300:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12334); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5308:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5316:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12386); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5324:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12412); if (state.failed) return current;
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


    // $ANTLR start "ruleRealizationLevelKind"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5343:1: ruleRealizationLevelKind returns [Enumerator current=null] : ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) ) ;
    public final Enumerator ruleRealizationLevelKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5345:28: ( ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5346:1: ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5346:1: ( (enumLiteral_0= 'model' ) | (enumLiteral_1= 'code' ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==92) ) {
                alt66=1;
            }
            else if ( (LA66_0==93) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5346:2: (enumLiteral_0= 'model' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5346:2: (enumLiteral_0= 'model' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5346:4: enumLiteral_0= 'model'
                    {
                    enumLiteral_0=(Token)match(input,92,FOLLOW_92_in_ruleRealizationLevelKind12475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRealizationLevelKindAccess().getMODELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRealizationLevelKindAccess().getMODELEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5352:6: (enumLiteral_1= 'code' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5352:6: (enumLiteral_1= 'code' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5352:8: enumLiteral_1= 'code'
                    {
                    enumLiteral_1=(Token)match(input,93,FOLLOW_93_in_ruleRealizationLevelKind12492); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRealizationLevelKindAccess().getCODEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRealizationLevelKindAccess().getCODEEnumLiteralDeclaration_1()); 
                          
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
    // $ANTLR end "ruleRealizationLevelKind"


    // $ANTLR start "ruleRealizationTypeKind"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5362:1: ruleRealizationTypeKind returns [Enumerator current=null] : ( (enumLiteral_0= 'calculated' ) | (enumLiteral_1= 'measured' ) | (enumLiteral_2= 'estimated' ) ) ;
    public final Enumerator ruleRealizationTypeKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5364:28: ( ( (enumLiteral_0= 'calculated' ) | (enumLiteral_1= 'measured' ) | (enumLiteral_2= 'estimated' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5365:1: ( (enumLiteral_0= 'calculated' ) | (enumLiteral_1= 'measured' ) | (enumLiteral_2= 'estimated' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5365:1: ( (enumLiteral_0= 'calculated' ) | (enumLiteral_1= 'measured' ) | (enumLiteral_2= 'estimated' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 94:
                {
                alt67=1;
                }
                break;
            case 95:
                {
                alt67=2;
                }
                break;
            case 96:
                {
                alt67=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5365:2: (enumLiteral_0= 'calculated' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5365:2: (enumLiteral_0= 'calculated' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5365:4: enumLiteral_0= 'calculated'
                    {
                    enumLiteral_0=(Token)match(input,94,FOLLOW_94_in_ruleRealizationTypeKind12537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRealizationTypeKindAccess().getCALCULATEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getRealizationTypeKindAccess().getCALCULATEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5371:6: (enumLiteral_1= 'measured' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5371:6: (enumLiteral_1= 'measured' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5371:8: enumLiteral_1= 'measured'
                    {
                    enumLiteral_1=(Token)match(input,95,FOLLOW_95_in_ruleRealizationTypeKind12554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRealizationTypeKindAccess().getMEASUREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getRealizationTypeKindAccess().getMEASUREDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5377:6: (enumLiteral_2= 'estimated' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5377:6: (enumLiteral_2= 'estimated' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5377:8: enumLiteral_2= 'estimated'
                    {
                    enumLiteral_2=(Token)match(input,96,FOLLOW_96_in_ruleRealizationTypeKind12571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getRealizationTypeKindAccess().getESTIMATEDEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getRealizationTypeKindAccess().getESTIMATEDEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleRealizationTypeKind"


    // $ANTLR start "ruleVerdict"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5387:1: ruleVerdict returns [Enumerator current=null] : ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) ) ;
    public final Enumerator ruleVerdict() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5389:28: ( ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5390:1: ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5390:1: ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) )
            int alt68=3;
            switch ( input.LA(1) ) {
            case 97:
                {
                alt68=1;
                }
                break;
            case 98:
                {
                alt68=2;
                }
                break;
            case 99:
                {
                alt68=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5390:2: (enumLiteral_0= 'PASS' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5390:2: (enumLiteral_0= 'PASS' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5390:4: enumLiteral_0= 'PASS'
                    {
                    enumLiteral_0=(Token)match(input,97,FOLLOW_97_in_ruleVerdict12616); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerdictAccess().getPASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVerdictAccess().getPASSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5396:6: (enumLiteral_1= 'FAIL' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5396:6: (enumLiteral_1= 'FAIL' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5396:8: enumLiteral_1= 'FAIL'
                    {
                    enumLiteral_1=(Token)match(input,98,FOLLOW_98_in_ruleVerdict12633); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerdictAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVerdictAccess().getFAILEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5402:6: (enumLiteral_2= 'INCONCLUSIVE' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5402:6: (enumLiteral_2= 'INCONCLUSIVE' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5402:8: enumLiteral_2= 'INCONCLUSIVE'
                    {
                    enumLiteral_2=(Token)match(input,99,FOLLOW_99_in_ruleVerdict12650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerdictAccess().getINCONCLUSIVEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVerdictAccess().getINCONCLUSIVEEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleVerdict"

    // $ANTLR start synpred1_InternalGEL
    public final void synpred1_InternalGEL_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5179:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5180:2: '.'
        {
        match(input,89,FOLLOW_89_in_synpred1_InternalGEL11982); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGEL

    // Delegated rules

    public final boolean synpred1_InternalGEL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGEL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA41 dfa41 = new DFA41(this);
    protected DFA52 dfa52 = new DFA52(this);
    static final String DFA41_eotS =
        "\13\uffff";
    static final String DFA41_eofS =
        "\2\uffff\1\11\7\uffff\1\11";
    static final String DFA41_minS =
        "\1\4\1\uffff\1\21\4\uffff\1\5\2\uffff\1\21";
    static final String DFA41_maxS =
        "\1\130\1\uffff\1\131\4\uffff\1\5\2\uffff\1\131";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA41_specialS =
        "\13\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\4\1\2\1\1\1\uffff\1\3\3\1\54\uffff\1\6\2\uffff\1\5\25\uffff"+
            "\10\1",
            "",
            "\1\10\3\uffff\1\10\43\uffff\1\11\2\uffff\13\11\2\uffff\4\11"+
            "\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\10\3\uffff\1\10\43\uffff\1\11\2\uffff\13\11\2\uffff\4\11"+
            "\14\uffff\1\7"
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "2587:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA52_eotS =
        "\7\uffff";
    static final String DFA52_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA52_minS =
        "\1\4\1\uffff\1\21\1\5\2\uffff\1\21";
    static final String DFA52_maxS =
        "\1\73\1\uffff\1\131\1\5\2\uffff\1\131";
    static final String DFA52_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA52_specialS =
        "\7\uffff}>";
    static final String[] DFA52_transitionS = {
            "\1\1\1\2\6\1\57\uffff\1\1",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5\100\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\uffff\1\5\1\uffff\1\4\1\5\1\uffff\1\5\100\uffff\1\3"
    };

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "3727:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleMigrationEvaluation_in_entryRuleMigrationEvaluation75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationEvaluation85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleMigrationEvaluation131 = new BitSet(new long[]{0x0000000000010000L,0x0000000008000000L});
    public static final BitSet FOLLOW_16_in_ruleMigrationEvaluation144 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMigrationEvaluation165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationEvaluation177 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationEvaluation189 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleMigrationEvaluation206 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationEvaluation223 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationEvaluation235 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMigrationEvaluation247 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_ruleTransformation_in_ruleMigrationEvaluation268 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_22_in_ruleMigrationEvaluation281 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationEvaluation293 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleMigrationEvaluation305 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMigrationEvaluation317 = new BitSet(new long[]{0x0000000120400000L});
    public static final BitSet FOLLOW_ruleAppliedPropertyEvaluation_in_ruleMigrationEvaluation338 = new BitSet(new long[]{0x0000000120400000L});
    public static final BitSet FOLLOW_22_in_ruleMigrationEvaluation351 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationEvaluation363 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ruleGoalModelEvaluation_in_ruleMigrationEvaluation384 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMigrationEvaluation396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation432 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleTransformation479 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation496 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleTransformation513 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleTransformation525 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation548 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleTransformation561 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTransformation573 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransformation585 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation608 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_ruleTransformation621 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleTransformation636 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransformation648 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleTransformation660 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation683 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_22_in_ruleTransformation696 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleTransformation710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedPropertyEvaluation_in_entryRuleAppliedPropertyEvaluation746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedPropertyEvaluation756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_entryRuleAppliedQualitativePropertyEvaluation865 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQualitativePropertyEvaluation875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQualitativePropertyEvaluation912 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQualitativePropertyEvaluation929 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAppliedQualitativePropertyEvaluation946 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAppliedQualitativePropertyEvaluation958 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativePropertyEvaluation981 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQualitativePropertyEvaluation993 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAppliedQualitativePropertyEvaluation1005 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleAppliedQualitativePropertyEvaluation1026 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQualitativePropertyEvaluation1038 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_ruleAppliedQualitativePropertyEvaluation1059 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAppliedQualitativePropertyEvaluation1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_entryRuleAppliedQuantitativePropertyEvaluation1107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyEvaluation1117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAppliedQuantitativePropertyEvaluation1154 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQuantitativePropertyEvaluation1171 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAppliedQuantitativePropertyEvaluation1188 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAppliedQuantitativePropertyEvaluation1200 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1223 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1235 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAppliedQuantitativePropertyEvaluation1247 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleAppliedQuantitativePropertyEvaluation1268 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1280 = new BitSet(new long[]{0x0064000000000000L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_ruleAppliedQuantitativePropertyEvaluation1301 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1314 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAppliedQuantitativePropertyEvaluation1326 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativePropertyEvaluation1338 = new BitSet(new long[]{0x0000000000400020L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyRealization_in_ruleAppliedQuantitativePropertyEvaluation1360 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQuantitativePropertyEvaluation1373 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyRealization_in_ruleAppliedQuantitativePropertyEvaluation1394 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleAppliedQuantitativePropertyEvaluation1410 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAppliedQuantitativePropertyEvaluation1424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQuantitativePropertyRealization_in_entryRuleQuantitativePropertyRealization1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQuantitativePropertyRealization1470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQuantitativePropertyRealization1512 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleQuantitativePropertyRealization1529 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_34_in_ruleQuantitativePropertyRealization1542 = new BitSet(new long[]{0x0000000000080020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQuantitativePropertyRealization1565 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantitativePropertyRealization1578 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleQuantitativePropertyRealization1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000030000000L});
    public static final BitSet FOLLOW_ruleRealizationLevelKind_in_ruleQuantitativePropertyRealization1613 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantitativePropertyRealization1625 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleQuantitativePropertyRealization1637 = new BitSet(new long[]{0x0000000000000000L,0x00000001C0000000L});
    public static final BitSet FOLLOW_ruleRealizationTypeKind_in_ruleQuantitativePropertyRealization1658 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantitativePropertyRealization1670 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleQuantitativePropertyRealization1682 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleQuantitativePropertyRealization1694 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleQuantitativePropertyRealization1715 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleQuantitativePropertyRealization1728 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleQuantitativePropertyRealization1749 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleQuantitativePropertyRealization1763 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleQuantitativePropertyRealization1776 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleQuantitativePropertyRealization1788 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleQuantitativePropertyRealization1805 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleQuantitativePropertyRealization1824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalModelEvaluation_in_entryRuleGoalModelEvaluation1860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalModelEvaluation1870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleGoalModelEvaluation1907 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoalModelEvaluation1919 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleGoalModelEvaluation1931 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalModelEvaluation1954 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModelEvaluation1966 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoalModelEvaluation1978 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleGoalModelEvaluation1999 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModelEvaluation2011 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleGoalModelEvaluation2023 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoalModelEvaluation2040 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModelEvaluation2057 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleGoalModelEvaluation2069 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModelEvaluation2081 = new BitSet(new long[]{0x0002900000400000L});
    public static final BitSet FOLLOW_ruleGoalEvaluation_in_ruleGoalModelEvaluation2102 = new BitSet(new long[]{0x0002900000400000L});
    public static final BitSet FOLLOW_22_in_ruleGoalModelEvaluation2115 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGoalModelEvaluation2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalEvaluation_in_entryRuleGoalEvaluation2163 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalEvaluation2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalEvaluation_in_ruleGoalEvaluation2220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoalEvaluation_in_ruleGoalEvaluation2247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoalEvaluation_in_ruleGoalEvaluation2274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalEvaluation_in_entryRuleSoftGoalEvaluation2309 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoalEvaluation2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleSoftGoalEvaluation2356 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftGoalEvaluation2373 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftGoalEvaluation2390 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleSoftGoalEvaluation2402 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoalEvaluation2425 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoalEvaluation2437 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleSoftGoalEvaluation2449 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleSoftGoalEvaluation2470 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoalEvaluation2482 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleSoftGoalEvaluation2494 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftGoalEvaluation2511 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoalEvaluation2528 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleSoftGoalEvaluation2540 = new BitSet(new long[]{0x0000000001000E40L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleSoftGoalEvaluation2561 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSoftGoalEvaluation2574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoalEvaluation_in_entryRuleHardGoalEvaluation2610 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardGoalEvaluation2620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleHardGoalEvaluation2657 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHardGoalEvaluation2674 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHardGoalEvaluation2691 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleHardGoalEvaluation2703 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHardGoalEvaluation2726 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHardGoalEvaluation2738 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleHardGoalEvaluation2750 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleHardGoalEvaluation2771 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHardGoalEvaluation2783 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleHardGoalEvaluation2795 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHardGoalEvaluation2812 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleHardGoalEvaluation2829 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleHardGoalEvaluation2841 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_ruleHardGoalEvaluation2862 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleHardGoalEvaluation2874 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoalEvaluation_in_entryRuleCompositeGoalEvaluation2910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeGoalEvaluation2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleCompositeGoalEvaluation2957 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeGoalEvaluation2974 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeGoalEvaluation2991 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCompositeGoalEvaluation3003 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeGoalEvaluation3026 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeGoalEvaluation3038 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCompositeGoalEvaluation3050 = new BitSet(new long[]{0x0000000000000000L,0x0000000E00000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleCompositeGoalEvaluation3071 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeGoalEvaluation3083 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleCompositeGoalEvaluation3095 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompositeGoalEvaluation3112 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleCompositeGoalEvaluation3129 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_ruleCompositeGoalEvaluation3141 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_ruleCompositeGoalEvaluation3162 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCompositeGoalEvaluation3174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_entryRuleValueExpressionEvaluation3210 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpressionEvaluation3220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecificationExpressionEvaluation_in_ruleValueExpressionEvaluation3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_ruleValueExpressionEvaluation3294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_ruleValueExpressionEvaluation3321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecificationExpressionEvaluation_in_entryRuleValueSpecificationExpressionEvaluation3356 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecificationExpressionEvaluation3366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleValueSpecificationExpressionEvaluation3403 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleValueSpecificationExpressionEvaluation3415 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleValueSpecificationExpressionEvaluation3427 = new BitSet(new long[]{0x0800000000080FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleValueSpecificationExpressionEvaluation3448 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleValueSpecificationExpressionEvaluation3461 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleValueSpecificationExpressionEvaluation3473 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueSpecificationExpressionEvaluation3490 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleValueSpecificationExpressionEvaluation3508 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleValueSpecificationExpressionEvaluation3520 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleValueSpecificationExpressionEvaluation3532 = new BitSet(new long[]{0x0064000000400000L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_ruleValueSpecificationExpressionEvaluation3553 = new BitSet(new long[]{0x0064000000400000L});
    public static final BitSet FOLLOW_22_in_ruleValueSpecificationExpressionEvaluation3566 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleValueSpecificationExpressionEvaluation3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_entryRuleBooleanExpressionEvaluation3616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpressionEvaluation3626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleBooleanExpressionEvaluation3663 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBooleanExpressionEvaluation3675 = new BitSet(new long[]{0x0008040000000000L});
    public static final BitSet FOLLOW_51_in_ruleBooleanExpressionEvaluation3688 = new BitSet(new long[]{0x0000000000080080L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanExpressionEvaluation3709 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanExpressionEvaluation3722 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleBooleanExpressionEvaluation3736 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBooleanExpressionEvaluation3753 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanExpressionEvaluation3771 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleBooleanExpressionEvaluation3783 = new BitSet(new long[]{0x0000000001080E40L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleBooleanExpressionEvaluation3804 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleBooleanExpressionEvaluation3820 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_ruleBooleanExpressionEvaluation3832 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleBooleanExpressionEvaluation3844 = new BitSet(new long[]{0x0064000000400000L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_ruleBooleanExpressionEvaluation3865 = new BitSet(new long[]{0x0064000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBooleanExpressionEvaluation3878 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleBooleanExpressionEvaluation3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_entryRuleNumberExpressionEvaluation3928 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpressionEvaluation3938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleNumberExpressionEvaluation3975 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleNumberExpressionEvaluation3987 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleNumberExpressionEvaluation3999 = new BitSet(new long[]{0x0000000000080E40L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpressionEvaluation4020 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleNumberExpressionEvaluation4033 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleNumberExpressionEvaluation4045 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberExpressionEvaluation4062 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleNumberExpressionEvaluation4080 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleNumberExpressionEvaluation4092 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleNumberExpressionEvaluation4104 = new BitSet(new long[]{0x0040000000400000L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_ruleNumberExpressionEvaluation4125 = new BitSet(new long[]{0x0040000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNumberExpressionEvaluation4138 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleNumberExpressionEvaluation4152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4188 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4198 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression4244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication4278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication4288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4335 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication4365 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4386 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction4424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction4434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4481 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction4513 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction4532 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4556 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction4594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4651 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction4681 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4702 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison4740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison4750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison4797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison4829 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison4848 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison4872 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000070L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit4910 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit4920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit4967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit4994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation5056 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation5066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation5112 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression5179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5226 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5258 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5296 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5334 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5372 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001E00L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression5571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression5598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5777 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5834 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression5866 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression5885 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5909 = new BitSet(new long[]{0x0000000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression5947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression5957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6004 = new BitSet(new long[]{0x0800000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6036 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6055 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6074 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6098 = new BitSet(new long[]{0x0800000000000002L,0x0000000000018000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression6136 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression6146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression6220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6255 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction6366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction6393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6536 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction6546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6592 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleMaximumFunction6604 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6625 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMaximumFunction6638 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6659 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_57_in_ruleMaximumFunction6673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction6765 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleMinimumFunction6777 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6798 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMinimumFunction6811 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6832 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_57_in_ruleMinimumFunction6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction6938 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleAverageFunction6950 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction6971 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAverageFunction6984 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7005 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_57_in_ruleAverageFunction7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction7055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction7111 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleSumFunction7123 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7144 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSumFunction7157 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7178 = new BitSet(new long[]{0x0200000000080000L});
    public static final BitSet FOLLOW_57_in_ruleSumFunction7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7284 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleExponentialFunction7296 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7317 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleExponentialFunction7329 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7350 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleExponentialFunction7362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction7408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7454 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleAbsoluteFunction7466 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7487 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleAbsoluteFunction7499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7591 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleNaturalLogarithmFunction7603 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7624 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleNaturalLogarithmFunction7636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7672 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7728 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_ruleCommonLogarithmFunction7740 = new BitSet(new long[]{0x0000000000000E40L,0x0000000001FE0000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7761 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_ruleCommonLogarithmFunction7773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7860 = new BitSet(new long[]{0x0900000000000FF0L,0x0000000001FE0180L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7880 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7931 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification7941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification7988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8077 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8135 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection8221 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection8231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleCollection8268 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8289 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_19_in_ruleCollection8302 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8323 = new BitSet(new long[]{0x0000000000480000L});
    public static final BitSet FOLLOW_22_in_ruleCollection8337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple8373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple8383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple8420 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8441 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_19_in_ruleTuple8454 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8475 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_24_in_ruleTuple8489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8525 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair8535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8583 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_rulePropertyValuePair8595 = new BitSet(new long[]{0x0800000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8652 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8744 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression8754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9035 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral9176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral9317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleUnlimitedLiteral9359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator9407 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator9417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOrOperator9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleOrOperator9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9519 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator9529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleXOrOperator9576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleXOrOperator9594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator9631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator9641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAndOperator9688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAndOperator9706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9743 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleImplicationOperator9800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleImplicationOperator9818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9855 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator9865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleEqualsOperator9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator9947 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator9957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNotEqualsOperator10004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNotEqualsOperator10022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator10059 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleNotOperator10116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleNotOperator10134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10171 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator10181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleGreaterThanOperator10227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10263 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleGreaterOrEqualThanOperator10319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator10365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleLessThanOperator10411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleLessOrEqualThanOperator10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator10549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleAdditionOperator10595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10631 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator10641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleSubstractionOperator10687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator10733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleMultiplicationOperator10779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10815 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator10825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleDivisionOperator10871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator10917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleModulusOperator10963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator10999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator11009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleMaxOperator11055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator11091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator11101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleMinOperator11147 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11183 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator11193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleAvgOperator11239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator11275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator11285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleSumOperator11331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator11377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleExponentialOperator11423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator11469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleAbsoluteOperator11515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11551 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_ruleNaturalLogarithmOperator11607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11643 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_ruleCommonLogarithmOperator11699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLeftParenthesis11784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis11835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleRightParenthesis11872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11912 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11963 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_ruleQualifiedName11991 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12007 = new BitSet(new long[]{0x0000000000000002L,0x0000000002000000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12113 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_ruleQualifiedNameWithWildcard12132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12178 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace12188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleImportNamespace12225 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleRealizationLevelKind12475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_ruleRealizationLevelKind12492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_ruleRealizationTypeKind12537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_ruleRealizationTypeKind12554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_ruleRealizationTypeKind12571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_97_in_ruleVerdict12616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_98_in_ruleVerdict12633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_99_in_ruleVerdict12650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_synpred1_InternalGEL11982 = new BitSet(new long[]{0x0000000000000002L});

}