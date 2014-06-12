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
package eu.artist.postmigration.nfrvt.lang.gml.parser.antlr.internal; 

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
import eu.artist.postmigration.nfrvt.lang.gml.services.GMLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalGMLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_EBOOLEAN", "RULE_NULL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'goalmodel'", "'{'", "'workloads'", "'['", "','", "']'", "'applied-properties'", "'goals'", "'}'", "'activity'", "'pattern'", "'qualitative'", "'property'", "'context'", "'quantitative'", "'function'", "'workload'", "'softgoal'", "'kind'", "'priority'", "'threshold'", "'impacts'", "'hardgoal'", "'condition'", "'successRate'", "'composite'", "'$'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'required'", "'offered'", "'contract'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int RULE_ID=4;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__29=29;
    public static final int T__65=65;
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
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int RULE_SMALL_DECIMAL=10;
    public static final int T__42=42;
    public static final int RULE_EBIGDECIMAL=11;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__80=80;
    public static final int T__46=46;
    public static final int T__81=81;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=13;
    public static final int RULE_NULL=9;
    public static final int RULE_ML_COMMENT=12;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=5;
    public static final int T__32=32;
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int RULE_EBOOLEAN=8;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=14;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;

    // delegates
    // delegators


        public InternalGMLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGMLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGMLParser.tokenNames; }
    public String getGrammarFileName() { return "../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g"; }



     	private GMLGrammarAccess grammarAccess;
     	
        public InternalGMLParser(TokenStream input, GMLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "GoalModel";	
       	}
       	
       	@Override
       	protected GMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGoalModel"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:68:1: entryRuleGoalModel returns [EObject current=null] : iv_ruleGoalModel= ruleGoalModel EOF ;
    public final EObject entryRuleGoalModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:69:2: (iv_ruleGoalModel= ruleGoalModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:70:2: iv_ruleGoalModel= ruleGoalModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalModelRule()); 
            }
            pushFollow(FOLLOW_ruleGoalModel_in_entryRuleGoalModel75);
            iv_ruleGoalModel=ruleGoalModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalModel"


    // $ANTLR start "ruleGoalModel"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:77:1: ruleGoalModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' ) ;
    public final EObject ruleGoalModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_imports_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_workloads_6_0 = null;

        EObject lv_workloads_8_0 = null;

        EObject lv_appliedProperties_12_0 = null;

        EObject lv_appliedProperties_14_0 = null;

        EObject lv_goals_18_0 = null;

        EObject lv_goals_20_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:80:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:81:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:81:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==78) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:82:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:83:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_ruleGoalModel131);
            	    lv_imports_0_0=ruleImportNamespace();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
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

            otherlv_1=(Token)match(input,16,FOLLOW_16_in_ruleGoalModel144); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalModelAccess().getGoalmodelKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:103:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:104:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:104:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:105:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalModelAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalModel165);
            lv_name_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
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

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleGoalModel177); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGoalModelAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleGoalModel189); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGoalModelAccess().getWorkloadsKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,19,FOLLOW_19_in_ruleGoalModel201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGoalModelAccess().getLeftSquareBracketKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:133:1: ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:133:2: ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:133:2: ( (lv_workloads_6_0= ruleWorkload ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:134:1: (lv_workloads_6_0= ruleWorkload )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:134:1: (lv_workloads_6_0= ruleWorkload )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:135:3: lv_workloads_6_0= ruleWorkload
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGoalModelAccess().getWorkloadsWorkloadParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWorkload_in_ruleGoalModel223);
                    lv_workloads_6_0=ruleWorkload();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
                      	        }
                             		add(
                             			current, 
                             			"workloads",
                              		lv_workloads_6_0, 
                              		"Workload");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:151:2: (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==20) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:151:4: otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) )
                    	    {
                    	    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGoalModel236); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getGoalModelAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:155:1: ( (lv_workloads_8_0= ruleWorkload ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:156:1: (lv_workloads_8_0= ruleWorkload )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:156:1: (lv_workloads_8_0= ruleWorkload )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:157:3: lv_workloads_8_0= ruleWorkload
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getWorkloadsWorkloadParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleWorkload_in_ruleGoalModel257);
                    	    lv_workloads_8_0=ruleWorkload();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"workloads",
                    	              		lv_workloads_8_0, 
                    	              		"Workload");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleGoalModel273); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getGoalModelAccess().getRightSquareBracketKeyword_7());
                  
            }
            otherlv_10=(Token)match(input,22,FOLLOW_22_in_ruleGoalModel285); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getGoalModelAccess().getAppliedPropertiesKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,19,FOLLOW_19_in_ruleGoalModel297); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getGoalModelAccess().getLeftSquareBracketKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:185:1: ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27||LA5_0==30) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:185:2: ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:185:2: ( (lv_appliedProperties_12_0= ruleAppliedProperty ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:186:1: (lv_appliedProperties_12_0= ruleAppliedProperty )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:186:1: (lv_appliedProperties_12_0= ruleAppliedProperty )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:187:3: lv_appliedProperties_12_0= ruleAppliedProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGoalModelAccess().getAppliedPropertiesAppliedPropertyParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAppliedProperty_in_ruleGoalModel319);
                    lv_appliedProperties_12_0=ruleAppliedProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
                      	        }
                             		add(
                             			current, 
                             			"appliedProperties",
                              		lv_appliedProperties_12_0, 
                              		"AppliedProperty");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:203:2: (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:203:4: otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,20,FOLLOW_20_in_ruleGoalModel332); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getGoalModelAccess().getCommaKeyword_10_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:207:1: ( (lv_appliedProperties_14_0= ruleAppliedProperty ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:208:1: (lv_appliedProperties_14_0= ruleAppliedProperty )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:208:1: (lv_appliedProperties_14_0= ruleAppliedProperty )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:209:3: lv_appliedProperties_14_0= ruleAppliedProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getAppliedPropertiesAppliedPropertyParserRuleCall_10_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAppliedProperty_in_ruleGoalModel353);
                    	    lv_appliedProperties_14_0=ruleAppliedProperty();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"appliedProperties",
                    	              		lv_appliedProperties_14_0, 
                    	              		"AppliedProperty");
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


                    }
                    break;

            }

            otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleGoalModel369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getGoalModelAccess().getRightSquareBracketKeyword_11());
                  
            }
            otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleGoalModel381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getGoalModelAccess().getGoalsKeyword_12());
                  
            }
            otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleGoalModel393); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getGoalModelAccess().getLeftSquareBracketKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:237:1: ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33||LA7_0==38||LA7_0==41) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:237:2: ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:237:2: ( (lv_goals_18_0= ruleGoal ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:238:1: (lv_goals_18_0= ruleGoal )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:238:1: (lv_goals_18_0= ruleGoal )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:239:3: lv_goals_18_0= ruleGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGoalModelAccess().getGoalsGoalParserRuleCall_14_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGoal_in_ruleGoalModel415);
                    lv_goals_18_0=ruleGoal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
                      	        }
                             		add(
                             			current, 
                             			"goals",
                              		lv_goals_18_0, 
                              		"Goal");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:255:2: (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==20) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:255:4: otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) )
                    	    {
                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleGoalModel428); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getGoalModelAccess().getCommaKeyword_14_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:259:1: ( (lv_goals_20_0= ruleGoal ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:260:1: (lv_goals_20_0= ruleGoal )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:260:1: (lv_goals_20_0= ruleGoal )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:261:3: lv_goals_20_0= ruleGoal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getGoalsGoalParserRuleCall_14_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleGoal_in_ruleGoalModel449);
                    	    lv_goals_20_0=ruleGoal();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getGoalModelRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"goals",
                    	              		lv_goals_20_0, 
                    	              		"Goal");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleGoalModel465); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getGoalModelAccess().getRightSquareBracketKeyword_15());
                  
            }
            otherlv_22=(Token)match(input,24,FOLLOW_24_in_ruleGoalModel477); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getGoalModelAccess().getRightCurlyBracketKeyword_16());
                  
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
    // $ANTLR end "ruleGoalModel"


    // $ANTLR start "entryRuleWorkload"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:293:1: entryRuleWorkload returns [EObject current=null] : iv_ruleWorkload= ruleWorkload EOF ;
    public final EObject entryRuleWorkload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkload = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:294:2: (iv_ruleWorkload= ruleWorkload EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:295:2: iv_ruleWorkload= ruleWorkload EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkloadRule()); 
            }
            pushFollow(FOLLOW_ruleWorkload_in_entryRuleWorkload513);
            iv_ruleWorkload=ruleWorkload();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkload; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkload523); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWorkload"


    // $ANTLR start "ruleWorkload"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:302:1: ruleWorkload returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
    public final EObject ruleWorkload() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_pattern_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:305:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:306:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:306:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:306:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:306:2: ( (lv_name_0_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:307:1: (lv_name_0_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:307:1: (lv_name_0_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:308:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkload565); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_0_0, grammarAccess.getWorkloadAccess().getNameIDTerminalRuleCall_0_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWorkloadRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_0_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleWorkload582); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWorkloadAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleWorkload594); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWorkloadAccess().getActivityKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:332:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:333:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:333:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:334:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getWorkloadRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWorkloadAccess().getActivityActivityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWorkload617);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleWorkload629); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWorkloadAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,26,FOLLOW_26_in_ruleWorkload641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getWorkloadAccess().getPatternKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:355:1: ( (lv_pattern_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:356:1: (lv_pattern_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:356:1: (lv_pattern_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:357:3: lv_pattern_6_0= RULE_STRING
            {
            lv_pattern_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkload658); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_pattern_6_0, grammarAccess.getWorkloadAccess().getPatternSTRINGTerminalRuleCall_6_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getWorkloadRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"pattern",
                      		lv_pattern_6_0, 
                      		"STRING");
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,24,FOLLOW_24_in_ruleWorkload675); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getWorkloadAccess().getRightCurlyBracketKeyword_7());
                  
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
    // $ANTLR end "ruleWorkload"


    // $ANTLR start "entryRuleAppliedProperty"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:385:1: entryRuleAppliedProperty returns [EObject current=null] : iv_ruleAppliedProperty= ruleAppliedProperty EOF ;
    public final EObject entryRuleAppliedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:386:2: (iv_ruleAppliedProperty= ruleAppliedProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:387:2: iv_ruleAppliedProperty= ruleAppliedProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedProperty_in_entryRuleAppliedProperty711);
            iv_ruleAppliedProperty=ruleAppliedProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedProperty721); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedProperty"


    // $ANTLR start "ruleAppliedProperty"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:394:1: ruleAppliedProperty returns [EObject current=null] : (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty ) ;
    public final EObject ruleAppliedProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AppliedQualitativeProperty_0 = null;

        EObject this_AppliedQuantitativeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:397:28: ( (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:398:1: (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:398:1: (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==27) ) {
                alt8=1;
            }
            else if ( (LA8_0==30) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:399:5: this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyAccess().getAppliedQualitativePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQualitativeProperty_in_ruleAppliedProperty768);
                    this_AppliedQualitativeProperty_0=ruleAppliedQualitativeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AppliedQualitativeProperty_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:409:5: this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyAccess().getAppliedQuantitativePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativeProperty_in_ruleAppliedProperty795);
                    this_AppliedQuantitativeProperty_1=ruleAppliedQuantitativeProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AppliedQuantitativeProperty_1; 
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
    // $ANTLR end "ruleAppliedProperty"


    // $ANTLR start "entryRuleAppliedQualitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:425:1: entryRuleAppliedQualitativeProperty returns [EObject current=null] : iv_ruleAppliedQualitativeProperty= ruleAppliedQualitativeProperty EOF ;
    public final EObject entryRuleAppliedQualitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQualitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:426:2: (iv_ruleAppliedQualitativeProperty= ruleAppliedQualitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:427:2: iv_ruleAppliedQualitativeProperty= ruleAppliedQualitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQualitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQualitativeProperty_in_entryRuleAppliedQualitativeProperty830);
            iv_ruleAppliedQualitativeProperty=ruleAppliedQualitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQualitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQualitativeProperty840); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedQualitativeProperty"


    // $ANTLR start "ruleAppliedQualitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:434:1: ruleAppliedQualitativeProperty returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' otherlv_12= '}' ) ;
    public final EObject ruleAppliedQualitativeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:437:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:438:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:438:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:438:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAppliedQualitativeProperty877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQualitativePropertyAccess().getQualitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:442:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:443:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:443:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:444:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQualitativeProperty894); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAppliedQualitativePropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAppliedQualitativeProperty911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQualitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAppliedQualitativeProperty923); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQualitativePropertyAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:468:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:469:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:469:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:470:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getPropertyQualitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty946);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativeProperty958); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAppliedQualitativePropertyAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQualitativeProperty970); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAppliedQualitativePropertyAccess().getContextKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQualitativeProperty982); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAppliedQualitativePropertyAccess().getLeftSquareBracketKeyword_7());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:495:1: ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:495:2: ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:495:2: ( ( ruleQualifiedName ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:496:1: ( ruleQualifiedName )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:496:1: ( ruleQualifiedName )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:497:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getContextNamedElementCrossReference_8_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1006);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:510:2: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==20) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:510:4: otherlv_9= ',' ( ( ruleQualifiedName ) )
                    	    {
                    	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativeProperty1019); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_9, grammarAccess.getAppliedQualitativePropertyAccess().getCommaKeyword_8_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:514:1: ( ( ruleQualifiedName ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:515:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:515:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:516:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getContextNamedElementCrossReference_8_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1042);
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
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQualitativeProperty1058); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getAppliedQualitativePropertyAccess().getRightSquareBracketKeyword_9());
                  
            }
            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleAppliedQualitativeProperty1070); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getAppliedQualitativePropertyAccess().getRightCurlyBracketKeyword_10());
                  
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
    // $ANTLR end "ruleAppliedQualitativeProperty"


    // $ANTLR start "entryRuleAppliedQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:545:1: entryRuleAppliedQuantitativeProperty returns [EObject current=null] : iv_ruleAppliedQuantitativeProperty= ruleAppliedQuantitativeProperty EOF ;
    public final EObject entryRuleAppliedQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:546:2: (iv_ruleAppliedQuantitativeProperty= ruleAppliedQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:547:2: iv_ruleAppliedQuantitativeProperty= ruleAppliedQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativeProperty_in_entryRuleAppliedQuantitativeProperty1106);
            iv_ruleAppliedQuantitativeProperty=ruleAppliedQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativeProperty1116); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedQuantitativeProperty"


    // $ANTLR start "ruleAppliedQuantitativeProperty"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:554:1: ruleAppliedQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' (otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ',' )? otherlv_9= 'context' otherlv_10= '[' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* otherlv_14= ']' (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' ) ;
    public final EObject ruleAppliedQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        EObject lv_function_7_1 = null;

        EObject lv_function_7_2 = null;

        EObject lv_function_7_3 = null;

        EObject lv_function_7_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:557:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' (otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ',' )? otherlv_9= 'context' otherlv_10= '[' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* otherlv_14= ']' (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:558:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' (otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ',' )? otherlv_9= 'context' otherlv_10= '[' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* otherlv_14= ']' (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:558:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' (otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ',' )? otherlv_9= 'context' otherlv_10= '[' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* otherlv_14= ']' (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:558:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' (otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ',' )? otherlv_9= 'context' otherlv_10= '[' ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* otherlv_14= ']' (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleAppliedQuantitativeProperty1153); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQuantitativePropertyAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:562:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:563:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:563:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:564:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQuantitativeProperty1170); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getAppliedQuantitativePropertyAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAppliedQuantitativeProperty1187); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAppliedQuantitativeProperty1199); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQuantitativePropertyAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:588:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:589:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:589:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:590:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getPropertyQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1222);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:607:1: (otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ',' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==31) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:607:3: otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) otherlv_8= ','
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAppliedQuantitativeProperty1247); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionKeyword_6_0());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:611:1: ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:612:1: ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:612:1: ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:613:1: (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:613:1: (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator )
                    int alt11=4;
                    switch ( input.LA(1) ) {
                    case 69:
                        {
                        alt11=1;
                        }
                        break;
                    case 68:
                        {
                        alt11=2;
                        }
                        break;
                    case 70:
                        {
                        alt11=3;
                        }
                        break;
                    case 71:
                        {
                        alt11=4;
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
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:614:3: lv_function_7_1= ruleMinOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionMinOperatorParserRuleCall_6_1_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMinOperator_in_ruleAppliedQuantitativeProperty1270);
                            lv_function_7_1=ruleMinOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"function",
                                      		lv_function_7_1, 
                                      		"MinOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 2 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:629:8: lv_function_7_2= ruleMaxOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionMaxOperatorParserRuleCall_6_1_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMaxOperator_in_ruleAppliedQuantitativeProperty1289);
                            lv_function_7_2=ruleMaxOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"function",
                                      		lv_function_7_2, 
                                      		"MaxOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 3 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:644:8: lv_function_7_3= ruleAvgOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionAvgOperatorParserRuleCall_6_1_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAppliedQuantitativeProperty1308);
                            lv_function_7_3=ruleAvgOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"function",
                                      		lv_function_7_3, 
                                      		"AvgOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;
                        case 4 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:659:8: lv_function_7_4= ruleSumOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionSumOperatorParserRuleCall_6_1_0_3()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSumOperator_in_ruleAppliedQuantitativeProperty1327);
                            lv_function_7_4=ruleSumOperator();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              	        if (current==null) {
                              	            current = createModelElementForParent(grammarAccess.getAppliedQuantitativePropertyRule());
                              	        }
                                     		set(
                                     			current, 
                                     			"function",
                                      		lv_function_7_4, 
                                      		"SumOperator");
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }
                            break;

                    }


                    }


                    }

                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1342); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_6_2());
                          
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQuantitativeProperty1356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getAppliedQuantitativePropertyAccess().getContextKeyword_7());
                  
            }
            otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQuantitativeProperty1368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getAppliedQuantitativePropertyAccess().getLeftSquareBracketKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:689:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:690:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:690:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:691:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getContextNamedElementCrossReference_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1391);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:704:2: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==20) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:704:4: otherlv_12= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1404); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_10_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:708:1: ( ( ruleQualifiedName ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:709:1: ( ruleQualifiedName )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:709:1: ( ruleQualifiedName )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:710:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getContextNamedElementCrossReference_10_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1427);
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
            	    break loop13;
                }
            } while (true);

            otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativeProperty1441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getAppliedQuantitativePropertyAccess().getRightSquareBracketKeyword_11());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:727:1: (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:727:3: otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) )
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1454); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_12_0());
                          
                    }
                    otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleAppliedQuantitativeProperty1466); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadKeyword_12_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:735:1: ( ( ruleQualifiedName ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:736:1: ( ruleQualifiedName )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:736:1: ( ruleQualifiedName )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:737:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadWorkloadCrossReference_12_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1489);
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

            }

            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleAppliedQuantitativeProperty1503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getAppliedQuantitativePropertyAccess().getRightCurlyBracketKeyword_13());
                  
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
    // $ANTLR end "ruleAppliedQuantitativeProperty"


    // $ANTLR start "entryRuleGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:762:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:763:2: (iv_ruleGoal= ruleGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:764:2: iv_ruleGoal= ruleGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalRule()); 
            }
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1539);
            iv_ruleGoal=ruleGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1549); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:771:1: ruleGoal returns [EObject current=null] : (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        EObject this_SoftGoal_0 = null;

        EObject this_HardGoal_1 = null;

        EObject this_CompositeGoal_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:774:28: ( (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:775:1: (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:775:1: (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal )
            int alt15=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt15=1;
                }
                break;
            case 38:
                {
                alt15=2;
                }
                break;
            case 41:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:776:5: this_SoftGoal_0= ruleSoftGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getSoftGoalParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSoftGoal_in_ruleGoal1596);
                    this_SoftGoal_0=ruleSoftGoal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_SoftGoal_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:786:5: this_HardGoal_1= ruleHardGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getHardGoalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHardGoal_in_ruleGoal1623);
                    this_HardGoal_1=ruleHardGoal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_HardGoal_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:796:5: this_CompositeGoal_2= ruleCompositeGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getCompositeGoalParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeGoal_in_ruleGoal1650);
                    this_CompositeGoal_2=ruleCompositeGoal();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_CompositeGoal_2; 
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleSoftGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:812:1: entryRuleSoftGoal returns [EObject current=null] : iv_ruleSoftGoal= ruleSoftGoal EOF ;
    public final EObject entryRuleSoftGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:813:2: (iv_ruleSoftGoal= ruleSoftGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:814:2: iv_ruleSoftGoal= ruleSoftGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoal_in_entryRuleSoftGoal1685);
            iv_ruleSoftGoal=ruleSoftGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoal1695); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoftGoal"


    // $ANTLR start "ruleSoftGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:821:1: ruleSoftGoal returns [EObject current=null] : (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'context' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'threshold' ( (lv_threshold_20_0= ruleImpact ) ) (otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']' )? otherlv_28= '}' ) ;
    public final EObject ruleSoftGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_priority_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_28=null;
        Enumerator lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_threshold_20_0 = null;

        EObject lv_impacts_24_0 = null;

        EObject lv_impacts_26_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:824:28: ( (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'context' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'threshold' ( (lv_threshold_20_0= ruleImpact ) ) (otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']' )? otherlv_28= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'context' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'threshold' ( (lv_threshold_20_0= ruleImpact ) ) (otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']' )? otherlv_28= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'context' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'threshold' ( (lv_threshold_20_0= ruleImpact ) ) (otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']' )? otherlv_28= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:3: otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'context' otherlv_13= '[' ( ( ruleQualifiedName ) ) (otherlv_15= ',' ( ( ruleQualifiedName ) ) )* otherlv_17= ']' otherlv_18= ',' otherlv_19= 'threshold' ( (lv_threshold_20_0= ruleImpact ) ) (otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']' )? otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSoftGoal1732); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSoftGoalAccess().getSoftgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:829:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:830:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:830:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:831:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftGoal1749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getSoftGoalAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSoftGoal1766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSoftGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleSoftGoal1778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSoftGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:855:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:856:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:856:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:857:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleSoftGoal1799);
            lv_kind_4_0=ruleGoalKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_4_0, 
                      		"GoalKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1811); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSoftGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleSoftGoal1823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSoftGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:881:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:882:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:882:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:883:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftGoal1840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_7_0, grammarAccess.getSoftGoalAccess().getPriorityINTTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1857); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSoftGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleSoftGoal1869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSoftGoalAccess().getPropertyKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:907:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:908:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:908:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:909:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getPropertyAppliedQualitativePropertyCrossReference_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoal1892);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1904); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getSoftGoalAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,29,FOLLOW_29_in_ruleSoftGoal1916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSoftGoalAccess().getContextKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoal1928); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSoftGoalAccess().getLeftSquareBracketKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:934:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:935:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:935:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:936:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getContextNamedElementCrossReference_14_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoal1951);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:949:2: (otherlv_15= ',' ( ( ruleQualifiedName ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==20) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:949:4: otherlv_15= ',' ( ( ruleQualifiedName ) )
            	    {
            	    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1964); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getSoftGoalAccess().getCommaKeyword_15_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:953:1: ( ( ruleQualifiedName ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:954:1: ( ruleQualifiedName )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:954:1: ( ruleQualifiedName )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:955:3: ruleQualifiedName
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getSoftGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getContextNamedElementCrossReference_15_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoal1987);
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
            	    break loop16;
                }
            } while (true);

            otherlv_17=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getSoftGoalAccess().getRightSquareBracketKeyword_16());
                  
            }
            otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal2013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getSoftGoalAccess().getCommaKeyword_17());
                  
            }
            otherlv_19=(Token)match(input,36,FOLLOW_36_in_ruleSoftGoal2025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_19, grammarAccess.getSoftGoalAccess().getThresholdKeyword_18());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:980:1: ( (lv_threshold_20_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:981:1: (lv_threshold_20_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:981:1: (lv_threshold_20_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:982:3: lv_threshold_20_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getThresholdImpactParserRuleCall_19_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoal2046);
            lv_threshold_20_0=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
              	        }
                     		set(
                     			current, 
                     			"threshold",
                      		lv_threshold_20_0, 
                      		"Impact");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:998:2: (otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:998:4: otherlv_21= ',' otherlv_22= 'impacts' otherlv_23= '[' ( (lv_impacts_24_0= ruleSoftGoalImpact ) ) (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )* otherlv_27= ']'
                    {
                    otherlv_21=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal2059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSoftGoalAccess().getCommaKeyword_20_0());
                          
                    }
                    otherlv_22=(Token)match(input,37,FOLLOW_37_in_ruleSoftGoal2071); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_22, grammarAccess.getSoftGoalAccess().getImpactsKeyword_20_1());
                          
                    }
                    otherlv_23=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoal2083); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_23, grammarAccess.getSoftGoalAccess().getLeftSquareBracketKeyword_20_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1010:1: ( (lv_impacts_24_0= ruleSoftGoalImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1011:1: (lv_impacts_24_0= ruleSoftGoalImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1011:1: (lv_impacts_24_0= ruleSoftGoalImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1012:3: lv_impacts_24_0= ruleSoftGoalImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_20_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2104);
                    lv_impacts_24_0=ruleSoftGoalImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
                      	        }
                             		add(
                             			current, 
                             			"impacts",
                              		lv_impacts_24_0, 
                              		"SoftGoalImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1028:2: (otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==20) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1028:4: otherlv_25= ',' ( (lv_impacts_26_0= ruleSoftGoalImpact ) )
                    	    {
                    	    otherlv_25=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal2117); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_25, grammarAccess.getSoftGoalAccess().getCommaKeyword_20_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1032:1: ( (lv_impacts_26_0= ruleSoftGoalImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1033:1: (lv_impacts_26_0= ruleSoftGoalImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1033:1: (lv_impacts_26_0= ruleSoftGoalImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1034:3: lv_impacts_26_0= ruleSoftGoalImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_20_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2138);
                    	    lv_impacts_26_0=ruleSoftGoalImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"impacts",
                    	              		lv_impacts_26_0, 
                    	              		"SoftGoalImpact");
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

                    otherlv_27=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2152); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_27, grammarAccess.getSoftGoalAccess().getRightSquareBracketKeyword_20_5());
                          
                    }

                    }
                    break;

            }

            otherlv_28=(Token)match(input,24,FOLLOW_24_in_ruleSoftGoal2166); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_28, grammarAccess.getSoftGoalAccess().getRightCurlyBracketKeyword_21());
                  
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
    // $ANTLR end "ruleSoftGoal"


    // $ANTLR start "entryRuleSoftGoalImpact"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1066:1: entryRuleSoftGoalImpact returns [EObject current=null] : iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF ;
    public final EObject entryRuleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoalImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1067:2: (iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1068:2: iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalImpactRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2202);
            iv_ruleSoftGoalImpact=ruleSoftGoalImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoalImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoalImpact2212); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSoftGoalImpact"


    // $ANTLR start "ruleSoftGoalImpact"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1075:1: ruleSoftGoalImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject ruleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1078:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1080:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1080:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1081:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getTargetSoftGoalCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2260);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1094:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1095:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1095:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1096:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoalImpact2281);
            lv_impact_1_0=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSoftGoalImpactRule());
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
    // $ANTLR end "ruleSoftGoalImpact"


    // $ANTLR start "entryRuleHardGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1120:1: entryRuleHardGoal returns [EObject current=null] : iv_ruleHardGoal= ruleHardGoal EOF ;
    public final EObject entryRuleHardGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1121:2: (iv_ruleHardGoal= ruleHardGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1122:2: iv_ruleHardGoal= ruleHardGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardGoalRule()); 
            }
            pushFollow(FOLLOW_ruleHardGoal_in_entryRuleHardGoal2317);
            iv_ruleHardGoal=ruleHardGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardGoal2327); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHardGoal"


    // $ANTLR start "ruleHardGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1129:1: ruleHardGoal returns [EObject current=null] : (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) ;
    public final EObject ruleHardGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_priority_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_successRate_13_0=null;
        Token otherlv_14=null;
        Enumerator lv_kind_4_0 = null;

        EObject lv_condition_10_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1132:28: ( (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1133:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1133:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1133:3: otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleHardGoal2364); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHardGoalAccess().getHardgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1137:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1138:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1138:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1139:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHardGoal2381); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getHardGoalAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHardGoalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleHardGoal2398); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHardGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleHardGoal2410); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHardGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1163:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1164:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1164:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1165:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleHardGoal2431);
            lv_kind_4_0=ruleGoalKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHardGoalRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_4_0, 
                      		"GoalKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2443); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHardGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleHardGoal2455); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHardGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1189:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1190:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1190:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1191:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHardGoal2472); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_7_0, grammarAccess.getHardGoalAccess().getPriorityINTTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getHardGoalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2489); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getHardGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleHardGoal2501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHardGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1215:1: ( (lv_condition_10_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1216:1: (lv_condition_10_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1216:1: (lv_condition_10_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1217:3: lv_condition_10_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getConditionExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleHardGoal2522);
            lv_condition_10_0=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getHardGoalRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_10_0, 
                      		"Expression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1233:2: (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==20) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1233:4: otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHardGoalAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleHardGoal2547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getHardGoalAccess().getSuccessRateKeyword_11_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1241:1: ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1242:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1242:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1243:3: lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_successRate_13_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2564); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_successRate_13_0, grammarAccess.getHardGoalAccess().getSuccessRatePOSITIVE_SMALL_DECIMALTerminalRuleCall_11_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getHardGoalRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"successRate",
                              		lv_successRate_13_0, 
                              		"POSITIVE_SMALL_DECIMAL");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleHardGoal2583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getHardGoalAccess().getRightCurlyBracketKeyword_12());
                  
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
    // $ANTLR end "ruleHardGoal"


    // $ANTLR start "entryRuleCompositeGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1271:1: entryRuleCompositeGoal returns [EObject current=null] : iv_ruleCompositeGoal= ruleCompositeGoal EOF ;
    public final EObject entryRuleCompositeGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1272:2: (iv_ruleCompositeGoal= ruleCompositeGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1273:2: iv_ruleCompositeGoal= ruleCompositeGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeGoalRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2619);
            iv_ruleCompositeGoal=ruleCompositeGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeGoal2629); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompositeGoal"


    // $ANTLR start "ruleCompositeGoal"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1280:1: ruleCompositeGoal returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) ;
    public final EObject ruleCompositeGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_priority_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_kind_4_0 = null;

        EObject lv_condition_10_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1283:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1284:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1284:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1284:3: otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCompositeGoal2666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeGoalAccess().getCompositeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1288:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1289:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1289:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1290:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeGoal2683); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getCompositeGoalAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeGoalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCompositeGoal2700); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCompositeGoal2712); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1314:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1315:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1315:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1316:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleCompositeGoal2733);
            lv_kind_4_0=ruleGoalKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeGoalRule());
              	        }
                     		set(
                     			current, 
                     			"kind",
                      		lv_kind_4_0, 
                      		"GoalKind");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoal2745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCompositeGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleCompositeGoal2757); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1340:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1341:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1341:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1342:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompositeGoal2774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_priority_7_0, grammarAccess.getCompositeGoalAccess().getPriorityINTTerminalRuleCall_7_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeGoalRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"priority",
                      		lv_priority_7_0, 
                      		"INT");
              	    
            }

            }


            }

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoal2791); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleCompositeGoal2803); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1366:1: ( (lv_condition_10_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1367:1: (lv_condition_10_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1367:1: (lv_condition_10_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1368:3: lv_condition_10_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getConditionGoalExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2824);
            lv_condition_10_0=ruleGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCompositeGoalRule());
              	        }
                     		set(
                     			current, 
                     			"condition",
                      		lv_condition_10_0, 
                      		"GoalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleCompositeGoal2836); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCompositeGoalAccess().getRightCurlyBracketKeyword_11());
                  
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
    // $ANTLR end "ruleCompositeGoal"


    // $ANTLR start "entryRuleGoalExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1396:1: entryRuleGoalExpression returns [EObject current=null] : iv_ruleGoalExpression= ruleGoalExpression EOF ;
    public final EObject entryRuleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1397:2: (iv_ruleGoalExpression= ruleGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1398:2: iv_ruleGoalExpression= ruleGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2872);
            iv_ruleGoalExpression=ruleGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalExpression2882); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalExpression"


    // $ANTLR start "ruleGoalExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1405:1: ruleGoalExpression returns [EObject current=null] : this_GoalImplication_0= ruleGoalImplication ;
    public final EObject ruleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GoalImplication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1408:28: (this_GoalImplication_0= ruleGoalImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1410:5: this_GoalImplication_0= ruleGoalImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalExpressionAccess().getGoalImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_ruleGoalExpression2928);
            this_GoalImplication_0=ruleGoalImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalImplication_0; 
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
    // $ANTLR end "ruleGoalExpression"


    // $ANTLR start "entryRuleGoalImplication"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1426:1: entryRuleGoalImplication returns [EObject current=null] : iv_ruleGoalImplication= ruleGoalImplication EOF ;
    public final EObject entryRuleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1427:2: (iv_ruleGoalImplication= ruleGoalImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1428:2: iv_ruleGoalImplication= ruleGoalImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2962);
            iv_ruleGoalImplication=ruleGoalImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalImplication2972); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalImplication"


    // $ANTLR start "ruleGoalImplication"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1435:1: ruleGoalImplication returns [EObject current=null] : (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) ;
    public final EObject ruleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject this_GoalDisjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1438:28: ( (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1439:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1439:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1440:5: this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalImplicationAccess().getGoalDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3019);
            this_GoalDisjunction_0=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalDisjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1448:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=53 && LA20_0<=54)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1448:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1448:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1449:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1454:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1455:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1455:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1456:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleGoalImplication3049);
            	    lv_operator_2_0=ruleImplicationOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalImplicationRule());
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1472:2: ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1473:1: (lv_right_3_0= ruleGoalDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1473:1: (lv_right_3_0= ruleGoalDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1474:3: lv_right_3_0= ruleGoalDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getRightGoalDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3070);
            	    lv_right_3_0=ruleGoalDisjunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalImplicationRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"GoalDisjunction");
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
    // $ANTLR end "ruleGoalImplication"


    // $ANTLR start "entryRuleGoalDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1498:1: entryRuleGoalDisjunction returns [EObject current=null] : iv_ruleGoalDisjunction= ruleGoalDisjunction EOF ;
    public final EObject entryRuleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1499:2: (iv_ruleGoalDisjunction= ruleGoalDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1500:2: iv_ruleGoalDisjunction= ruleGoalDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction3108);
            iv_ruleGoalDisjunction=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalDisjunction3118); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalDisjunction"


    // $ANTLR start "ruleGoalDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1507:1: ruleGoalDisjunction returns [EObject current=null] : (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) ;
    public final EObject ruleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalConjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1510:28: ( (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1511:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1511:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1512:5: this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getGoalConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3165);
            this_GoalConjunction_0=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalConjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1520:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=47 && LA22_0<=50)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1520:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1520:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1521:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1526:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1527:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1527:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1528:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1528:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( ((LA21_0>=47 && LA21_0<=48)) ) {
            	        alt21=1;
            	    }
            	    else if ( ((LA21_0>=49 && LA21_0<=50)) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1529:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3197);
            	            lv_operator_2_1=ruleOrOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getGoalDisjunctionRule());
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1544:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3216);
            	            lv_operator_2_2=ruleXOrOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getGoalDisjunctionRule());
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1562:2: ( (lv_right_3_0= ruleGoalConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1563:1: (lv_right_3_0= ruleGoalConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1563:1: (lv_right_3_0= ruleGoalConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1564:3: lv_right_3_0= ruleGoalConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getRightGoalConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3240);
            	    lv_right_3_0=ruleGoalConjunction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalDisjunctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"GoalConjunction");
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
    // $ANTLR end "ruleGoalDisjunction"


    // $ANTLR start "entryRuleGoalConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1588:1: entryRuleGoalConjunction returns [EObject current=null] : iv_ruleGoalConjunction= ruleGoalConjunction EOF ;
    public final EObject entryRuleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1589:2: (iv_ruleGoalConjunction= ruleGoalConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1590:2: iv_ruleGoalConjunction= ruleGoalConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3278);
            iv_ruleGoalConjunction=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalConjunction3288); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalConjunction"


    // $ANTLR start "ruleGoalConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1597:1: ruleGoalConjunction returns [EObject current=null] : (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) ;
    public final EObject ruleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalComparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1600:28: ( (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1601:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1601:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1602:5: this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalConjunctionAccess().getGoalComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3335);
            this_GoalComparison_0=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalComparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1610:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=51 && LA23_0<=52)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1610:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1610:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1611:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1616:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1617:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1617:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1618:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleGoalConjunction3365);
            	    lv_operator_2_0=ruleAndOperator();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalConjunctionRule());
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1634:2: ( (lv_right_3_0= ruleGoalComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1635:1: (lv_right_3_0= ruleGoalComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1635:1: (lv_right_3_0= ruleGoalComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1636:3: lv_right_3_0= ruleGoalComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getRightGoalComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3386);
            	    lv_right_3_0=ruleGoalComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalConjunctionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"GoalComparison");
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
    // $ANTLR end "ruleGoalConjunction"


    // $ANTLR start "entryRuleGoalComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1660:1: entryRuleGoalComparison returns [EObject current=null] : iv_ruleGoalComparison= ruleGoalComparison EOF ;
    public final EObject entryRuleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1661:2: (iv_ruleGoalComparison= ruleGoalComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1662:2: iv_ruleGoalComparison= ruleGoalComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3424);
            iv_ruleGoalComparison=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalComparison3434); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalComparison"


    // $ANTLR start "ruleGoalComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1669:1: ruleGoalComparison returns [EObject current=null] : (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) ;
    public final EObject ruleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject this_GoalBooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1672:28: ( (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1673:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1673:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1674:5: this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalComparisonAccess().getGoalBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3481);
            this_GoalBooleanUnit_0=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalBooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1682:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=55 && LA25_0<=57)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1682:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1682:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1683:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1688:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1689:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1689:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1690:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1690:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==55) ) {
            	        alt24=1;
            	    }
            	    else if ( ((LA24_0>=56 && LA24_0<=57)) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1691:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3513);
            	            lv_operator_2_1=ruleEqualsOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getGoalComparisonRule());
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1706:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3532);
            	            lv_operator_2_2=ruleNotEqualsOperator();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getGoalComparisonRule());
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1724:2: ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1725:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1725:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1726:3: lv_right_3_0= ruleGoalBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getRightGoalBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3556);
            	    lv_right_3_0=ruleGoalBooleanUnit();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalComparisonRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"GoalBooleanUnit");
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
    // $ANTLR end "ruleGoalComparison"


    // $ANTLR start "entryRuleGoalBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1750:1: entryRuleGoalBooleanUnit returns [EObject current=null] : iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF ;
    public final EObject entryRuleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1751:2: (iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1752:2: iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3594);
            iv_ruleGoalBooleanUnit=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanUnit3604); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalBooleanUnit"


    // $ANTLR start "ruleGoalBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1759:1: ruleGoalBooleanUnit returns [EObject current=null] : (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) ;
    public final EObject ruleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_GoalNegation_0 = null;

        EObject this_GoalBooleanLiteral_1 = null;

        EObject this_GoalReference_2 = null;

        EObject this_ParenthesizedGoalExpression_3 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1762:28: ( (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1763:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1763:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            int alt26=4;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt26=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
                }
                break;
            case 43:
                {
                alt26=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1764:5: this_GoalNegation_0= ruleGoalNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3651);
                    this_GoalNegation_0=ruleGoalNegation();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GoalNegation_0; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1774:5: this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3678);
                    this_GoalBooleanLiteral_1=ruleGoalBooleanLiteral();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GoalBooleanLiteral_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1784:5: this_GoalReference_2= ruleGoalReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3705);
                    this_GoalReference_2=ruleGoalReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_GoalReference_2; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1794:5: this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getParenthesizedGoalExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3732);
                    this_ParenthesizedGoalExpression_3=ruleParenthesizedGoalExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_ParenthesizedGoalExpression_3; 
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
    // $ANTLR end "ruleGoalBooleanUnit"


    // $ANTLR start "entryRuleGoalNegation"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1810:1: entryRuleGoalNegation returns [EObject current=null] : iv_ruleGoalNegation= ruleGoalNegation EOF ;
    public final EObject entryRuleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1811:2: (iv_ruleGoalNegation= ruleGoalNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1812:2: iv_ruleGoalNegation= ruleGoalNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalNegationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3767);
            iv_ruleGoalNegation=ruleGoalNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalNegation3777); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalNegation"


    // $ANTLR start "ruleGoalNegation"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1819:1: ruleGoalNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) ;
    public final EObject ruleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1822:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1823:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1823:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1823:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1823:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1824:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1824:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1825:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleGoalNegation3823);
            lv_operator_0_0=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGoalNegationRule());
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1841:2: ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1842:1: (lv_value_1_0= ruleGoalBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1842:1: (lv_value_1_0= ruleGoalBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1843:3: lv_value_1_0= ruleGoalBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getValueGoalBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3844);
            lv_value_1_0=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getGoalNegationRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_1_0, 
                      		"GoalBooleanUnit");
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
    // $ANTLR end "ruleGoalNegation"


    // $ANTLR start "entryRuleGoalBooleanLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1867:1: entryRuleGoalBooleanLiteral returns [EObject current=null] : iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF ;
    public final EObject entryRuleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1868:2: (iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1869:2: iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3880);
            iv_ruleGoalBooleanLiteral=ruleGoalBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3890); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalBooleanLiteral"


    // $ANTLR start "ruleGoalBooleanLiteral"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1876:1: ruleGoalBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1879:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1880:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1880:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1881:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1881:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1882:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_value_0_0, grammarAccess.getGoalBooleanLiteralAccess().getValueEBOOLEANTerminalRuleCall_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalBooleanLiteralRule());
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
    // $ANTLR end "ruleGoalBooleanLiteral"


    // $ANTLR start "entryRuleGoalReference"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1906:1: entryRuleGoalReference returns [EObject current=null] : iv_ruleGoalReference= ruleGoalReference EOF ;
    public final EObject entryRuleGoalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalReference = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1907:2: (iv_ruleGoalReference= ruleGoalReference EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1908:2: iv_ruleGoalReference= ruleGoalReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleGoalReference_in_entryRuleGoalReference3971);
            iv_ruleGoalReference=ruleGoalReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalReference3981); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoalReference"


    // $ANTLR start "ruleGoalReference"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:1: ruleGoalReference returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGoalReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1918:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1920:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGoalReferenceAccess().getGoalReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleGoalReference4027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalReferenceAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1929:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1930:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1930:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1931:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalReferenceAccess().getValueGoalCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalReference4050);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleGoalReference"


    // $ANTLR start "entryRuleParenthesizedGoalExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1952:1: entryRuleParenthesizedGoalExpression returns [EObject current=null] : iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF ;
    public final EObject entryRuleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1953:2: (iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1954:2: iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression4086);
            iv_ruleParenthesizedGoalExpression=ruleParenthesizedGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression4096); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParenthesizedGoalExpression"


    // $ANTLR start "ruleParenthesizedGoalExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1961:1: ruleParenthesizedGoalExpression returns [EObject current=null] : ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1964:28: ( ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1965:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1965:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1965:2: () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1965:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1966:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getParenthesizedGoalExpressionAccess().getParenthesizedGoalExpressionAction_0(),
                          current);
                  
            }

            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedGoalExpressionAccess().getLeftParenthesisParserRuleCall_1()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4146);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1979:1: ( (lv_value_2_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1980:1: (lv_value_2_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1980:1: (lv_value_2_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1981:3: lv_value_2_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedGoalExpressionAccess().getValueGoalExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4166);
            lv_value_2_0=ruleGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getParenthesizedGoalExpressionRule());
              	        }
                     		set(
                     			current, 
                     			"value",
                      		lv_value_2_0, 
                      		"GoalExpression");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedGoalExpressionAccess().getRightParenthesisParserRuleCall_3()); 
                  
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4182);
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
    // $ANTLR end "ruleParenthesizedGoalExpression"


    // $ANTLR start "entryRuleNumberExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2013:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2014:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2015:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4217);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression4227); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2022:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;

        EObject this_AppliedQuantitativePropertyExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2025:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            int alt27=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt27=1;
                }
                break;
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt27=2;
                }
                break;
            case 42:
                {
                alt27=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2027:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4274);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2037:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression4301);
                    this_NumberFunction_1=ruleNumberFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_NumberFunction_1; 
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2047:5: this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getAppliedQuantitativePropertyExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4328);
                    this_AppliedQuantitativePropertyExpression_2=ruleAppliedQuantitativePropertyExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_AppliedQuantitativePropertyExpression_2; 
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


    // $ANTLR start "entryRuleAppliedQuantitativePropertyExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2063:1: entryRuleAppliedQuantitativePropertyExpression returns [EObject current=null] : iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF ;
    public final EObject entryRuleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativePropertyExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2064:2: (iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2065:2: iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4363);
            iv_ruleAppliedQuantitativePropertyExpression=ruleAppliedQuantitativePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4373); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAppliedQuantitativePropertyExpression"


    // $ANTLR start "ruleAppliedQuantitativePropertyExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2072:1: ruleAppliedQuantitativePropertyExpression returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2075:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2076:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2076:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2076:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2076:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2077:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getAppliedQuantitativePropertyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleAppliedQuantitativePropertyExpression4419); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2086:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2087:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2087:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2088:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getValueAppliedQuantitativePropertyCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4442);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
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
    // $ANTLR end "ruleAppliedQuantitativePropertyExpression"


    // $ANTLR start "entryRuleExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2109:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2110:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2111:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4478);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4488); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2118:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2121:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2123:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression4534);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2139:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2140:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2141:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication4568);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication4578); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2148:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2151:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2152:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2152:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2153:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4625);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2161:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=53 && LA28_0<=54)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2161:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2161:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2162:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2167:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2168:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2168:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2169:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication4655);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2185:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2186:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2186:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2187:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4676);
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
            	    break loop28;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2211:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2212:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2213:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction4714);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction4724); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2220:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2223:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2224:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2224:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2225:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4771);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2233:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=47 && LA30_0<=50)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2233:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2233:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2234:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2239:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2240:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2240:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2241:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2241:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( ((LA29_0>=47 && LA29_0<=48)) ) {
            	        alt29=1;
            	    }
            	    else if ( ((LA29_0>=49 && LA29_0<=50)) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2242:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction4803);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2257:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction4822);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2275:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2276:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2276:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2277:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4846);
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
            	    break loop30;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2301:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2302:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2303:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction4884);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction4894); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2310:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2313:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2314:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2314:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2315:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4941);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2323:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=51 && LA31_0<=52)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2323:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2323:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2324:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2329:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2330:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2330:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2331:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction4971);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2347:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2348:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2348:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2349:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4992);
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
            	    break loop31;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2373:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2374:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2375:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison5030);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison5040); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2382:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2385:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2386:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2386:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2387:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison5087);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2395:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=55 && LA33_0<=57)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2395:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2395:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2396:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2401:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2402:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2402:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2403:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2403:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( (LA32_0==55) ) {
            	        alt32=1;
            	    }
            	    else if ( ((LA32_0>=56 && LA32_0<=57)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2404:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison5119);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2419:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison5138);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2437:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2438:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2438:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2439:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison5162);
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
            	    break loop33;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2463:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2464:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2465:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5200);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit5210); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2472:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2475:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt34=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_NULL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 42:
            case 43:
            case 46:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
                {
                alt34=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2477:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit5257);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2487:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5284);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2497:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5311);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2513:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2514:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2515:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation5346);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation5356); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2522:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2525:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2526:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2526:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2526:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2526:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2527:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2527:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2528:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation5402);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2544:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2545:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2545:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation5423);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2570:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2571:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2572:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5459);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression5469); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2579:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2582:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2583:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2583:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2584:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5516);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=60 && LA36_0<=63)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt35=4;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt35=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt35=2;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt35=3;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt35=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt35) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2593:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2598:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2599:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2599:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2600:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5548);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2618:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2623:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2624:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2624:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2625:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5586);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2642:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2642:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2642:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2642:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2643:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2648:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2649:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2649:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2650:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5624);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2667:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2667:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2667:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2667:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2668:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2673:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2674:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2674:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2675:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5662);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2691:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2692:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2692:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2693:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5685);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2717:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2718:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2719:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5723);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression5733); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2726:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2729:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2730:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2730:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt37=7;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2731:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5780);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2741:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5807);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2751:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5834);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2761:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression5861);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2771:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression5888);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2781:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5915);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2791:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5942);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2807:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2808:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2809:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5977);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression5987); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2816:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2819:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2821:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression6033);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2837:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2838:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2839:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6067);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression6077); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2846:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2849:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2850:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2850:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2851:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6124);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2859:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=64 && LA39_0<=65)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2859:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2859:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2860:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2865:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2866:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2866:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2867:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2867:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==65) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==64) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2868:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6156);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2883:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6175);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2901:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2902:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2902:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2903:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6199);
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
            	    break loop39;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2927:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2928:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2929:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6237);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression6247); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2936:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2939:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2940:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2940:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2941:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6294);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2949:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==46||(LA41_0>=66 && LA41_0<=67)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2949:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2949:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2950:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2955:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2956:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2956:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2957:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2957:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt40=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt40=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt40=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt40=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt40) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2958:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6326);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2973:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6345);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2988:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6364);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3006:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3007:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3007:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3008:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6388);
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
            	    break loop41;
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


    // $ANTLR start "entryRuleNumberFunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3032:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3033:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3034:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6426);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction6436); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3041:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3044:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3045:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3045:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt42=8;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt42=1;
                }
                break;
            case 69:
                {
                alt42=2;
                }
                break;
            case 70:
                {
                alt42=3;
                }
                break;
            case 71:
                {
                alt42=4;
                }
                break;
            case 72:
                {
                alt42=5;
                }
                break;
            case 73:
                {
                alt42=6;
                }
                break;
            case 74:
                {
                alt42=7;
                }
                break;
            case 75:
                {
                alt42=8;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3046:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6483);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3056:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6510);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3066:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction6537);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3076:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction6564);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3086:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6591);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3096:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6618);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3106:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6645);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3116:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6672);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3132:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3133:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3134:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6707);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction6717); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3141:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3144:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3145:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3145:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3145:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3145:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3146:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3146:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3147:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6763);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMaximumFunction6775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3167:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3168:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3168:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3169:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6796);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3185:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==20) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3185:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMaximumFunction6809); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3189:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3190:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3190:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3191:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6830);
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
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleMaximumFunction6844); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3219:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3220:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3221:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6880);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction6890); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3228:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3231:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3232:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3232:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3232:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3232:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3233:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3233:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3234:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction6936);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMinimumFunction6948); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3254:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3255:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3255:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3256:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6969);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3272:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==20) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3272:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMinimumFunction6982); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3276:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3277:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3277:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3278:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction7003);
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
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleMinimumFunction7017); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3306:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3307:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3308:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction7053);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction7063); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3315:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3318:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3319:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3319:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3319:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3319:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3320:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3320:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3321:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction7109);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAverageFunction7121); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3341:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3342:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3342:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3343:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7142);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3359:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==20) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3359:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAverageFunction7155); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3363:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3364:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3364:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3365:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7176);
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
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleAverageFunction7190); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3393:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3394:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3395:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction7226);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction7236); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3402:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3405:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3406:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3406:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3406:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3406:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3407:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3407:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3408:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction7282);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSumFunction7294); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3428:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3429:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3429:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3430:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7315);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3446:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==20) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3446:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSumFunction7328); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3450:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3451:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3451:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3452:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7349);
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
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleSumFunction7363); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3480:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3481:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3482:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7399);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction7409); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3489:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3492:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3493:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3493:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3493:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3493:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3494:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3494:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3495:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7455);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleExponentialFunction7467); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3515:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3516:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3516:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3517:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7488);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExponentialFunction7500); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3537:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3538:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3538:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3539:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7521);
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

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleExponentialFunction7533); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3567:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3568:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3569:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7569);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction7579); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3576:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3579:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3580:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3580:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3580:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3580:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3581:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3581:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3582:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7625);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAbsoluteFunction7637); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3602:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3603:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3603:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3604:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7658);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleAbsoluteFunction7670); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3632:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3633:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3634:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7706);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7716); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3641:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3644:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3645:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3645:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3645:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3645:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3646:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3646:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3647:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7762);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleNaturalLogarithmFunction7774); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3667:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3668:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3668:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3669:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7795);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleNaturalLogarithmFunction7807); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3697:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3698:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3699:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7843);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7853); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3706:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3709:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3710:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3710:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3710:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3710:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3711:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3711:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3712:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7899);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleCommonLogarithmFunction7911); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3732:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3733:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3733:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3734:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7932);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleCommonLogarithmFunction7944); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3762:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3763:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3764:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7980);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7990); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3771:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3774:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3775:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3775:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3776:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression8031);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3783:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3784:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3784:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3785:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression8051);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression8067);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3817:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3818:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3819:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8102);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification8112); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3826:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3829:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt47=3;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3831:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8159);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3841:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8186);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3851:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8213);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3867:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3868:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3869:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8248);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8258); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3876:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3879:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3880:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3880:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3880:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3880:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3881:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3881:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3882:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8306);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3895:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==19) ) {
                alt48=1;
            }
            else if ( (LA48_0==17) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3895:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3895:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3896:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3896:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3897:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8328);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3914:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3914:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3915:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3915:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3916:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8355);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3940:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3941:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3942:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection8392);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection8402); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3949:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3952:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3953:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3953:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3953:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCollection8439); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3957:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3958:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3958:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3959:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8460);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3975:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3975:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCollection8473); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3979:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3980:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3980:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3981:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8494);
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
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCollection8508); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4009:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4010:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4011:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple8544);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple8554); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4018:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4021:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4022:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4022:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4022:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple8591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4026:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4027:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4027:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4028:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8612);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4044:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4044:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTuple8625); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4048:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4049:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4049:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4050:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8646);
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
            	    break loop50;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTuple8660); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4078:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4079:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4080:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8696);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair8706); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4087:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4090:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4091:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4091:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4091:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4091:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4092:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4092:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4093:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8754);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_rulePropertyValuePair8766); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4110:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4111:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4111:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4112:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8787);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4136:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4137:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4138:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8823);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8833); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4145:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4148:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4149:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4149:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4150:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4150:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4151:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8880);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4172:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4173:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4174:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8915);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression8925); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4181:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4184:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4185:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4185:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt51=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt51=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt51=2;
                }
                break;
            case RULE_NULL:
                {
                alt51=3;
                }
                break;
            case RULE_STRING:
                {
                alt51=4;
                }
                break;
            case 46:
                {
                alt51=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }

            switch (alt51) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4186:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8972);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4196:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8999);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4206:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression9026);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4216:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression9053);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4226:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression9080);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4242:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4243:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4244:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9115);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9125); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4251:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4254:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4255:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4255:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4256:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4256:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4257:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9166); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4281:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4282:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4283:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9206);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9216); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4290:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4293:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4294:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4294:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4295:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4295:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4296:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral9261);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4320:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4321:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4322:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9296);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9306); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4329:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4332:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4333:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4333:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4334:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4334:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4335:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral9347); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4359:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4360:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4361:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9387);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9397); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4368:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4371:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4372:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4372:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4373:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4373:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4374:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9438); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4398:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4399:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4400:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9478);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral9488); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4407:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4410:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4411:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4411:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4412:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4412:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4413:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,46,FOLLOW_46_in_ruleUnlimitedLiteral9530); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4434:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4435:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4436:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator9578);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator9588); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4446:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4447:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4447:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4447:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4447:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4448:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4453:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==47) ) {
                alt52=1;
            }
            else if ( (LA52_0==48) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4453:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleOrOperator9635); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4458:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleOrOperator9653); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4470:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4471:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4472:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9690);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator9700); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4482:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4483:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4483:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4483:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4483:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4484:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4489:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==49) ) {
                alt53=1;
            }
            else if ( (LA53_0==50) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4489:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXOrOperator9747); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4494:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXOrOperator9765); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4506:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4507:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4508:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator9802);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator9812); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4518:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4519:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4519:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4519:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4519:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4520:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4525:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==51) ) {
                alt54=1;
            }
            else if ( (LA54_0==52) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4525:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAndOperator9859); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4530:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleAndOperator9877); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4542:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4543:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4544:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9914);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator9924); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4551:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4554:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4555:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4555:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4555:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4555:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4556:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4561:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==53) ) {
                alt55=1;
            }
            else if ( (LA55_0==54) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4561:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleImplicationOperator9971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4566:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleImplicationOperator9989); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4578:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4579:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4580:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator10026);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator10036); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4587:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4590:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4591:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4591:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4591:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4591:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4592:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleEqualsOperator10082); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4609:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4610:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4611:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10118);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator10128); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4621:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4622:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4622:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4622:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4622:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4623:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4628:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==56) ) {
                alt56=1;
            }
            else if ( (LA56_0==57) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4628:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNotEqualsOperator10175); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4633:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleNotEqualsOperator10193); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4645:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4646:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4647:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator10230);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator10240); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4654:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4657:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4658:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4658:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4658:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4658:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4659:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4664:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==58) ) {
                alt57=1;
            }
            else if ( (LA57_0==59) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4664:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleNotOperator10287); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4669:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleNotOperator10305); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4681:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4682:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4683:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10342);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator10352); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4690:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4693:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4694:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4694:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4694:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4694:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4695:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleGreaterThanOperator10398); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4712:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4713:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4714:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10434);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10444); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4721:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4724:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4725:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4725:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4725:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4725:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4726:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleGreaterOrEqualThanOperator10490); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4743:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4744:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4745:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10526);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator10536); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4752:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4755:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4756:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4756:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4756:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4756:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4757:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleLessThanOperator10582); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4774:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4775:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4776:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10618);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10628); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4783:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4786:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4787:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4787:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4787:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4787:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4788:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleLessOrEqualThanOperator10674); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4805:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4806:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4807:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10710);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator10720); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4814:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4817:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4818:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4818:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4818:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4818:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4819:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAdditionOperator10766); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4836:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4837:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4838:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10802);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator10812); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4845:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4848:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4849:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4849:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4849:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4849:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4850:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleSubstractionOperator10858); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4867:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4868:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4869:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10894);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator10904); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4876:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4879:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4880:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4880:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4880:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4880:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4881:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicationOperator10950); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4898:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4899:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4900:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10986);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator10996); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4907:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4910:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4911:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4911:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4911:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4911:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4912:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleDivisionOperator11042); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4929:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4930:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4931:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator11078);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator11088); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4938:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4941:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4942:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4942:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4942:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4942:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4943:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleModulusOperator11134); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4960:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4961:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4962:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11170);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator11180); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4969:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4972:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4973:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4973:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4973:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4973:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4974:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleMaxOperator11226); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4991:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4992:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4993:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator11262);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator11272); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5000:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5003:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5004:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5004:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5004:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5004:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5005:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleMinOperator11318); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5022:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5023:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5024:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11354);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator11364); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5031:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5034:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5035:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5035:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5035:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5035:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5036:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleAvgOperator11410); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5053:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5054:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5055:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator11446);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator11456); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5062:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5065:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5066:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5066:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5066:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5066:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5067:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSumOperator11502); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5084:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5085:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5086:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11538);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator11548); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5093:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5096:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5097:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5097:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5097:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5097:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5098:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleExponentialOperator11594); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5115:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5116:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5117:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11630);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator11640); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5124:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5127:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5128:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5128:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5128:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5128:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5129:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleAbsoluteOperator11686); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5146:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5147:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5148:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11722);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11732); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5155:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5158:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5159:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5159:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5159:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5159:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5160:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleNaturalLogarithmOperator11778); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5177:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5178:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5179:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11814);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11824); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5186:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5189:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5190:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5190:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5190:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5190:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5191:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleCommonLogarithmOperator11870); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5208:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5209:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5210:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11907);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11918); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5217:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5220:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5222:2: kw= '('
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleLeftParenthesis11955); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5235:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5236:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5237:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11995);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis12006); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5244:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5247:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5249:2: kw= ')'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleRightParenthesis12043); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5262:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5263:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5264:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12083);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12094); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5271:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5274:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5275:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5275:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5275:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12134); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5282:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==76) && (synpred1_InternalGML())) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5282:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5282:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5282:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,76,FOLLOW_76_in_ruleQualifiedName12162); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12178); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop58;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5305:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5306:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5307:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12226);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12237); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5317:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5318:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5318:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5319:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12284);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5329:1: (kw= '.*' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==77) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5330:2: kw= '.*'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleQualifiedNameWithWildcard12303); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5347:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5348:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5349:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12349);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace12359); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5356:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5359:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5360:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5360:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5360:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleImportNamespace12396); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5364:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5365:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5365:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5366:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12417);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5390:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5391:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5392:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12454);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12465); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5399:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5402:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5403:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5403:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt60=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt60=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt60=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt60=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt60=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5403:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12505); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5411:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5419:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5427:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12583); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5442:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5443:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5444:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact12629);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact12640); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5451:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5454:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5455:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5455:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_SMALL_DECIMAL) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5455:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12680); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5463:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12706); if (state.failed) return current;
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


    // $ANTLR start "ruleGoalKind"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5480:1: ruleGoalKind returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) ;
    public final Enumerator ruleGoalKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5482:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5483:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5483:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            int alt62=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt62=1;
                }
                break;
            case 80:
                {
                alt62=2;
                }
                break;
            case 81:
                {
                alt62=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }

            switch (alt62) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5483:2: (enumLiteral_0= 'required' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5483:2: (enumLiteral_0= 'required' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5483:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleGoalKind12767); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5489:6: (enumLiteral_1= 'offered' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5489:6: (enumLiteral_1= 'offered' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5489:8: enumLiteral_1= 'offered'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleGoalKind12784); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5495:6: (enumLiteral_2= 'contract' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5495:6: (enumLiteral_2= 'contract' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5495:8: enumLiteral_2= 'contract'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleGoalKind12801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getCONTRACTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getGoalKindAccess().getCONTRACTEnumLiteralDeclaration_2()); 
                          
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
    // $ANTLR end "ruleGoalKind"

    // $ANTLR start synpred1_InternalGML
    public final void synpred1_InternalGML_fragment() throws RecognitionException {   
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5282:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5283:2: '.'
        {
        match(input,76,FOLLOW_76_in_synpred1_InternalGML12153); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalGML

    // Delegated rules

    public final boolean synpred1_InternalGML() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalGML_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA37 dfa37 = new DFA37(this);
    protected DFA47 dfa47 = new DFA47(this);
    static final String DFA37_eotS =
        "\13\uffff";
    static final String DFA37_eofS =
        "\2\uffff\1\10\7\uffff\1\10";
    static final String DFA37_minS =
        "\1\4\1\uffff\1\21\4\uffff\1\4\2\uffff\1\21";
    static final String DFA37_maxS =
        "\1\113\1\uffff\1\114\4\uffff\1\4\2\uffff\1\114";
    static final String DFA37_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\2\1\3\1\uffff";
    static final String DFA37_specialS =
        "\13\uffff}>";
    static final String[] DFA37_transitionS = {
            "\1\2\1\4\2\1\1\uffff\1\3\2\1\36\uffff\1\1\1\6\2\uffff\1\5\25"+
            "\uffff\10\1",
            "",
            "\1\11\1\uffff\1\11\1\10\3\uffff\1\10\23\uffff\1\10\2\uffff"+
            "\13\10\2\uffff\4\10\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\11\1\uffff\1\11\1\10\3\uffff\1\10\23\uffff\1\10\2\uffff"+
            "\13\10\2\uffff\4\10\14\uffff\1\7"
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "2730:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA47_eotS =
        "\7\uffff";
    static final String DFA47_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA47_minS =
        "\1\4\1\uffff\1\21\1\4\2\uffff\1\21";
    static final String DFA47_maxS =
        "\1\56\1\uffff\1\114\1\4\2\uffff\1\114";
    static final String DFA47_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA47_specialS =
        "\7\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\2\7\1\42\uffff\1\1",
            "",
            "\1\4\1\uffff\1\4\2\5\2\uffff\1\5\63\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\uffff\1\4\2\5\2\uffff\1\5\63\uffff\1\3"
    };

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "3830:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleGoalModel_in_entryRuleGoalModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleGoalModel131 = new BitSet(new long[]{0x0000000000010000L,0x0000000000004000L});
    public static final BitSet FOLLOW_16_in_ruleGoalModel144 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalModel165 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleGoalModel177 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoalModel189 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModel201 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleWorkload_in_ruleGoalModel223 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel236 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkload_in_ruleGoalModel257 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModel273 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGoalModel285 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModel297 = new BitSet(new long[]{0x0000000048200000L});
    public static final BitSet FOLLOW_ruleAppliedProperty_in_ruleGoalModel319 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel332 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_ruleAppliedProperty_in_ruleGoalModel353 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModel369 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGoalModel381 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModel393 = new BitSet(new long[]{0x0000024200200000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleGoalModel415 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel428 = new BitSet(new long[]{0x0000024200000000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleGoalModel449 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModel465 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGoalModel477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkload_in_entryRuleWorkload513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkload523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkload565 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleWorkload582 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleWorkload594 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWorkload617 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleWorkload629 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleWorkload641 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkload658 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleWorkload675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedProperty_in_entryRuleAppliedProperty711 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedProperty721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativeProperty_in_ruleAppliedProperty768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativeProperty_in_ruleAppliedProperty795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativeProperty_in_entryRuleAppliedQualitativeProperty830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQualitativeProperty840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAppliedQualitativeProperty877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQualitativeProperty894 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAppliedQualitativeProperty911 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAppliedQualitativeProperty923 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty946 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativeProperty958 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQualitativeProperty970 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQualitativeProperty982 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1006 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativeProperty1019 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1042 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQualitativeProperty1058 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAppliedQualitativeProperty1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativeProperty_in_entryRuleAppliedQuantitativeProperty1106 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativeProperty1116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAppliedQuantitativeProperty1153 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQuantitativeProperty1170 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAppliedQuantitativeProperty1187 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAppliedQuantitativeProperty1199 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1222 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1234 = new BitSet(new long[]{0x00000000A0000000L});
    public static final BitSet FOLLOW_31_in_ruleAppliedQuantitativeProperty1247 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleAppliedQuantitativeProperty1270 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleAppliedQuantitativeProperty1289 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAppliedQuantitativeProperty1308 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleAppliedQuantitativeProperty1327 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1342 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQuantitativeProperty1356 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQuantitativeProperty1368 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1391 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1404 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1427 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativeProperty1441 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1454 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAppliedQuantitativeProperty1466 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1489 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAppliedQuantitativeProperty1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoal_in_ruleGoal1596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_ruleGoal1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_ruleGoal1650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoal_in_entryRuleSoftGoal1685 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoal1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSoftGoal1732 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftGoal1749 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftGoal1766 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSoftGoal1778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleSoftGoal1799 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1811 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSoftGoal1823 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftGoal1840 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1857 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSoftGoal1869 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoal1892 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1904 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSoftGoal1916 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoal1928 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoal1951 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1964 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoal1987 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2001 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal2013 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSoftGoal2025 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoal2046 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal2059 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSoftGoal2071 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoal2083 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2104 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal2117 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2138 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2152 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSoftGoal2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoalImpact2212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2260 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoalImpact2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_entryRuleHardGoal2317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardGoal2327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHardGoal2364 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHardGoal2381 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHardGoal2398 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleHardGoal2410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleHardGoal2431 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2443 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleHardGoal2455 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHardGoal2472 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2489 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleHardGoal2501 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleHardGoal2522 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2535 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleHardGoal2547 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2564 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleHardGoal2583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeGoal2629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCompositeGoal2666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeGoal2683 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeGoal2700 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCompositeGoal2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleCompositeGoal2733 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoal2745 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCompositeGoal2757 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompositeGoal2774 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoal2791 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCompositeGoal2803 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2824 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCompositeGoal2836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2872 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalExpression2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_ruleGoalExpression2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2962 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalImplication2972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3019 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleGoalImplication3049 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3070 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction3108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalDisjunction3118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3165 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3197 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3216 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3240 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalConjunction3288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3335 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleGoalConjunction3365 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3386 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3424 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalComparison3434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3481 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3513 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3532 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3556 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3594 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanUnit3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3767 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalNegation3777 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleGoalNegation3823 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_entryRuleGoalReference3971 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalReference3981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGoalReference4027 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalReference4050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression4086 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression4096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4146 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4166 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4217 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression4227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4363 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAppliedQuantitativePropertyExpression4419 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression4534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication4568 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4625 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication4655 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4676 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction4714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction4724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4771 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction4803 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction4822 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4846 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction4884 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction4894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4941 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction4971 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4992 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison5030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison5040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison5087 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison5119 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison5138 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison5162 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit5210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation5346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation5356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation5402 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation5423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression5469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5516 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5548 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5586 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5624 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5662 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5685 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5723 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression5861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression5888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression6033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6156 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6175 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6199 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6294 = new BitSet(new long[]{0x0000400000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6326 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6345 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6364 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6388 = new BitSet(new long[]{0x0000400000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction6436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction6564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6707 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction6717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6763 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMaximumFunction6775 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6796 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleMaximumFunction6809 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6830 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleMaximumFunction6844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6880 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction6890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction6936 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMinimumFunction6948 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6969 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleMinimumFunction6982 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction7003 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleMinimumFunction7017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction7053 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction7063 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction7109 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAverageFunction7121 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7142 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleAverageFunction7155 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7176 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleAverageFunction7190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction7226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction7282 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSumFunction7294 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7315 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleSumFunction7328 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7349 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleSumFunction7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7399 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction7409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7455 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExponentialFunction7467 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7488 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExponentialFunction7500 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7521 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExponentialFunction7533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction7579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7625 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAbsoluteFunction7637 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7658 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAbsoluteFunction7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7706 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7762 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNaturalLogarithmFunction7774 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7795 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNaturalLogarithmFunction7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7843 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7899 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCommonLogarithmFunction7911 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7932 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommonLogarithmFunction7944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7980 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression8031 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression8051 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression8067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8102 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification8112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8306 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection8392 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection8402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCollection8439 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8460 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCollection8473 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8494 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCollection8508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple8544 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple8554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple8591 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8612 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleTuple8625 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8646 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_24_in_ruleTuple8660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8696 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair8706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8754 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePropertyValuePair8766 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8915 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression8925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression9026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression9053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression9080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9115 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9206 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral9261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9296 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral9347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9387 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9478 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral9488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUnlimitedLiteral9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator9578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator9588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOrOperator9635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOrOperator9653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9690 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator9700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXOrOperator9747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXOrOperator9765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator9802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator9812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAndOperator9859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAndOperator9877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9914 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator9924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicationOperator9971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicationOperator9989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator10026 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator10036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEqualsOperator10082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator10128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNotEqualsOperator10175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNotEqualsOperator10193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator10230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator10240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNotOperator10287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNotOperator10305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator10352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGreaterThanOperator10398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGreaterOrEqualThanOperator10490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator10536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLessThanOperator10582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLessOrEqualThanOperator10674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator10720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAdditionOperator10766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator10812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSubstractionOperator10858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10894 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator10904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicationOperator10950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator10996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDivisionOperator11042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator11078 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator11088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleModulusOperator11134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11170 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator11180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleMaxOperator11226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator11262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator11272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleMinOperator11318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator11364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAvgOperator11410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator11446 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator11456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSumOperator11502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11538 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator11548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleExponentialOperator11594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11630 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator11640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAbsoluteOperator11686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleNaturalLogarithmOperator11778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11814 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCommonLogarithmOperator11870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLeftParenthesis11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRightParenthesis12043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12083 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleQualifiedName12162 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12178 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12284 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleQualifiedNameWithWildcard12303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12349 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace12359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleImportNamespace12396 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12454 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact12629 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact12640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleGoalKind12767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGoalKind12784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGoalKind12801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred1_InternalGML12153 = new BitSet(new long[]{0x0000000000000002L});

}