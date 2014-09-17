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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_EBOOLEAN", "RULE_NULL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'goalmodel'", "'{'", "'workloads'", "'['", "','", "']'", "'applied-properties'", "'goals'", "'}'", "'activity'", "'pattern'", "'qualitative'", "'property'", "'context'", "'quantitative'", "'function'", "'workload'", "'softgoal'", "'kind'", "'priority'", "'$'", "'threshold'", "'impacts'", "'hardgoal'", "'condition'", "'successRate'", "'composite'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'required'", "'offered'", "'contract'"
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

            if ( (LA7_0==33||LA7_0==39||LA7_0==42) ) {
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:434:1: ruleAppliedQualitativeProperty returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:437:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:438:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:438:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:438:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}'
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:483:2: (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==20) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:483:4: otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativeProperty959); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAppliedQualitativePropertyAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQualitativeProperty971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAppliedQualitativePropertyAccess().getContextKeyword_5_1());
                          
                    }
                    otherlv_7=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQualitativeProperty983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAppliedQualitativePropertyAccess().getLeftSquareBracketKeyword_5_2());
                          
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
                               
                              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getContextNamedElementCrossReference_5_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1007);
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
                            	    otherlv_9=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativeProperty1020); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getAppliedQualitativePropertyAccess().getCommaKeyword_5_3_1_0());
                            	          
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
                            	       
                            	      	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getContextNamedElementCrossReference_5_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1043);
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

                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQualitativeProperty1059); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAppliedQualitativePropertyAccess().getRightSquareBracketKeyword_5_4());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleAppliedQualitativeProperty1073); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getAppliedQualitativePropertyAccess().getRightCurlyBracketKeyword_6());
                  
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
            pushFollow(FOLLOW_ruleAppliedQuantitativeProperty_in_entryRuleAppliedQuantitativeProperty1109);
            iv_ruleAppliedQuantitativeProperty=ruleAppliedQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativeProperty1119); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:554:1: ruleAppliedQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:557:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:558:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:558:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:558:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleAppliedQuantitativeProperty1156); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQuantitativePropertyAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:562:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:563:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:563:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:564:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQuantitativeProperty1173); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleAppliedQuantitativeProperty1190); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,28,FOLLOW_28_in_ruleAppliedQuantitativeProperty1202); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1225);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:603:2: (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==20) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==31) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:603:4: otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) )
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1238); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleAppliedQuantitativeProperty1250); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:611:1: ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:612:1: ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:612:1: ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:613:1: (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:613:1: (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator )
                    int alt12=4;
                    switch ( input.LA(1) ) {
                    case 69:
                        {
                        alt12=1;
                        }
                        break;
                    case 68:
                        {
                        alt12=2;
                        }
                        break;
                    case 70:
                        {
                        alt12=3;
                        }
                        break;
                    case 71:
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
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:614:3: lv_function_7_1= ruleMinOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionMinOperatorParserRuleCall_5_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMinOperator_in_ruleAppliedQuantitativeProperty1273);
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
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionMaxOperatorParserRuleCall_5_2_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMaxOperator_in_ruleAppliedQuantitativeProperty1292);
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
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionAvgOperatorParserRuleCall_5_2_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAppliedQuantitativeProperty1311);
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
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionSumOperatorParserRuleCall_5_2_0_3()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSumOperator_in_ruleAppliedQuantitativeProperty1330);
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


                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:677:4: (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==20) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==29) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:677:6: otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1348); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQuantitativeProperty1360); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAppliedQuantitativePropertyAccess().getContextKeyword_6_1());
                          
                    }
                    otherlv_10=(Token)match(input,19,FOLLOW_19_in_ruleAppliedQuantitativeProperty1372); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAppliedQuantitativePropertyAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:689:1: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:689:2: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:689:2: ( ( ruleQualifiedName ) )
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
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getContextNamedElementCrossReference_6_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1396);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:704:2: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==20) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:704:4: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1409); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_6_3_1_0());
                            	          
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
                            	       
                            	      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getContextNamedElementCrossReference_6_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1432);
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
                            	    break loop14;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_14=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativeProperty1448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getAppliedQuantitativePropertyAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:727:3: (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:727:5: otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) )
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1463); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_16=(Token)match(input,32,FOLLOW_32_in_ruleAppliedQuantitativeProperty1475); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadKeyword_7_1());
                          
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
                       
                      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadWorkloadCrossReference_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1498);
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

            otherlv_18=(Token)match(input,24,FOLLOW_24_in_ruleAppliedQuantitativeProperty1512); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_18, grammarAccess.getAppliedQuantitativePropertyAccess().getRightCurlyBracketKeyword_8());
                  
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
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1548);
            iv_ruleGoal=ruleGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1558); if (state.failed) return current;

            }

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
            int alt18=3;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt18=1;
                }
                break;
            case 39:
                {
                alt18=2;
                }
                break;
            case 42:
                {
                alt18=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:776:5: this_SoftGoal_0= ruleSoftGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getSoftGoalParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSoftGoal_in_ruleGoal1605);
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
                    pushFollow(FOLLOW_ruleHardGoal_in_ruleGoal1632);
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
                    pushFollow(FOLLOW_ruleCompositeGoal_in_ruleGoal1659);
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
            pushFollow(FOLLOW_ruleSoftGoal_in_entryRuleSoftGoal1694);
            iv_ruleSoftGoal=ruleSoftGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoal1704); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:821:1: ruleSoftGoal returns [EObject current=null] : (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) ;
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
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Enumerator lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_threshold_14_0 = null;

        EObject lv_impacts_18_0 = null;

        EObject lv_impacts_20_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:824:28: ( (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:3: otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_33_in_ruleSoftGoal1741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSoftGoalAccess().getSoftgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:829:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:830:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:830:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:831:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftGoal1758); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleSoftGoal1775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSoftGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleSoftGoal1787); if (state.failed) return current;
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
            pushFollow(FOLLOW_ruleGoalKind_in_ruleSoftGoal1808);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSoftGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleSoftGoal1832); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSoftGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:881:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:882:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:882:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:883:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftGoal1849); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1866); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSoftGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,28,FOLLOW_28_in_ruleSoftGoal1878); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSoftGoalAccess().getPropertyKeyword_9());
                  
            }
            otherlv_10=(Token)match(input,36,FOLLOW_36_in_ruleSoftGoal1890); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSoftGoalAccess().getDollarSignKeyword_10());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:911:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:912:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:912:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:913:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getPropertyAppliedQualitativePropertyCrossReference_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoal1913);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1925); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSoftGoalAccess().getCommaKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,37,FOLLOW_37_in_ruleSoftGoal1937); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSoftGoalAccess().getThresholdKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:934:1: ( (lv_threshold_14_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:935:1: (lv_threshold_14_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:935:1: (lv_threshold_14_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:936:3: lv_threshold_14_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getThresholdImpactParserRuleCall_14_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoal1958);
            lv_threshold_14_0=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
              	        }
                     		set(
                     			current, 
                     			"threshold",
                      		lv_threshold_14_0, 
                      		"Impact");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:952:2: (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==20) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:952:4: otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']'
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1971); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSoftGoalAccess().getCommaKeyword_15_0());
                          
                    }
                    otherlv_16=(Token)match(input,38,FOLLOW_38_in_ruleSoftGoal1983); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSoftGoalAccess().getImpactsKeyword_15_1());
                          
                    }
                    otherlv_17=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoal1995); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getSoftGoalAccess().getLeftSquareBracketKeyword_15_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:964:1: ( (lv_impacts_18_0= ruleSoftGoalImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:965:1: (lv_impacts_18_0= ruleSoftGoalImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:965:1: (lv_impacts_18_0= ruleSoftGoalImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:966:3: lv_impacts_18_0= ruleSoftGoalImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_15_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2016);
                    lv_impacts_18_0=ruleSoftGoalImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
                      	        }
                             		add(
                             			current, 
                             			"impacts",
                              		lv_impacts_18_0, 
                              		"SoftGoalImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:982:2: (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:982:4: otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) )
                    	    {
                    	    otherlv_19=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal2029); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getSoftGoalAccess().getCommaKeyword_15_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:986:1: ( (lv_impacts_20_0= ruleSoftGoalImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:987:1: (lv_impacts_20_0= ruleSoftGoalImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:987:1: (lv_impacts_20_0= ruleSoftGoalImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:988:3: lv_impacts_20_0= ruleSoftGoalImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_15_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2050);
                    	    lv_impacts_20_0=ruleSoftGoalImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"impacts",
                    	              		lv_impacts_20_0, 
                    	              		"SoftGoalImpact");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);

                    otherlv_21=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2064); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSoftGoalAccess().getRightSquareBracketKeyword_15_5());
                          
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,24,FOLLOW_24_in_ruleSoftGoal2078); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_22, grammarAccess.getSoftGoalAccess().getRightCurlyBracketKeyword_16());
                  
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1020:1: entryRuleSoftGoalImpact returns [EObject current=null] : iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF ;
    public final EObject entryRuleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoalImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1021:2: (iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1022:2: iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalImpactRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2114);
            iv_ruleSoftGoalImpact=ruleSoftGoalImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoalImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoalImpact2124); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1029:1: ruleSoftGoalImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject ruleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1032:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1033:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1033:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1033:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1033:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1034:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1034:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1035:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getTargetSoftGoalCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2172);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1048:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1049:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1049:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1050:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoalImpact2193);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1074:1: entryRuleHardGoal returns [EObject current=null] : iv_ruleHardGoal= ruleHardGoal EOF ;
    public final EObject entryRuleHardGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1075:2: (iv_ruleHardGoal= ruleHardGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1076:2: iv_ruleHardGoal= ruleHardGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardGoalRule()); 
            }
            pushFollow(FOLLOW_ruleHardGoal_in_entryRuleHardGoal2229);
            iv_ruleHardGoal=ruleHardGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardGoal2239); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1083:1: ruleHardGoal returns [EObject current=null] : (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1086:28: ( (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1087:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1087:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1087:3: otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_39_in_ruleHardGoal2276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHardGoalAccess().getHardgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1091:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1092:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1092:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1093:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHardGoal2293); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleHardGoal2310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHardGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleHardGoal2322); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHardGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1117:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1118:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1118:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1119:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleHardGoal2343);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2355); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHardGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleHardGoal2367); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHardGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1143:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1144:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1144:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1145:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHardGoal2384); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2401); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getHardGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleHardGoal2413); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHardGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1169:1: ( (lv_condition_10_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1170:1: (lv_condition_10_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1170:1: (lv_condition_10_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1171:3: lv_condition_10_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getConditionExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleHardGoal2434);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1187:2: (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1187:4: otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2447); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHardGoalAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_12=(Token)match(input,41,FOLLOW_41_in_ruleHardGoal2459); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getHardGoalAccess().getSuccessRateKeyword_11_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1195:1: ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1196:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1196:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1197:3: lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_successRate_13_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2476); if (state.failed) return current;
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

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleHardGoal2495); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1225:1: entryRuleCompositeGoal returns [EObject current=null] : iv_ruleCompositeGoal= ruleCompositeGoal EOF ;
    public final EObject entryRuleCompositeGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1226:2: (iv_ruleCompositeGoal= ruleCompositeGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1227:2: iv_ruleCompositeGoal= ruleCompositeGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeGoalRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2531);
            iv_ruleCompositeGoal=ruleCompositeGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeGoal2541); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1234:1: ruleCompositeGoal returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1237:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1238:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1238:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1238:3: otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleCompositeGoal2578); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeGoalAccess().getCompositeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1242:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1243:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1243:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1244:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeGoal2595); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCompositeGoal2612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCompositeGoal2624); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1268:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1269:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1269:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1270:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleCompositeGoal2645);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoal2657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCompositeGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleCompositeGoal2669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1294:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1295:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1295:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1296:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompositeGoal2686); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoal2703); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleCompositeGoal2715); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1320:1: ( (lv_condition_10_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1321:1: (lv_condition_10_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1321:1: (lv_condition_10_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1322:3: lv_condition_10_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getConditionGoalExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2736);
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

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleCompositeGoal2748); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1350:1: entryRuleGoalExpression returns [EObject current=null] : iv_ruleGoalExpression= ruleGoalExpression EOF ;
    public final EObject entryRuleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1351:2: (iv_ruleGoalExpression= ruleGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1352:2: iv_ruleGoalExpression= ruleGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2784);
            iv_ruleGoalExpression=ruleGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalExpression2794); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1359:1: ruleGoalExpression returns [EObject current=null] : this_GoalImplication_0= ruleGoalImplication ;
    public final EObject ruleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GoalImplication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1362:28: (this_GoalImplication_0= ruleGoalImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1364:5: this_GoalImplication_0= ruleGoalImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalExpressionAccess().getGoalImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_ruleGoalExpression2840);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1380:1: entryRuleGoalImplication returns [EObject current=null] : iv_ruleGoalImplication= ruleGoalImplication EOF ;
    public final EObject entryRuleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1381:2: (iv_ruleGoalImplication= ruleGoalImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1382:2: iv_ruleGoalImplication= ruleGoalImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2874);
            iv_ruleGoalImplication=ruleGoalImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalImplication2884); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1389:1: ruleGoalImplication returns [EObject current=null] : (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) ;
    public final EObject ruleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject this_GoalDisjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1392:28: ( (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1393:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1393:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1394:5: this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalImplicationAccess().getGoalDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2931);
            this_GoalDisjunction_0=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalDisjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1402:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=53 && LA22_0<=54)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1402:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1402:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1403:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1408:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1409:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1409:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1410:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleGoalImplication2961);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1426:2: ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1427:1: (lv_right_3_0= ruleGoalDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1427:1: (lv_right_3_0= ruleGoalDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1428:3: lv_right_3_0= ruleGoalDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getRightGoalDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2982);
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
    // $ANTLR end "ruleGoalImplication"


    // $ANTLR start "entryRuleGoalDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1452:1: entryRuleGoalDisjunction returns [EObject current=null] : iv_ruleGoalDisjunction= ruleGoalDisjunction EOF ;
    public final EObject entryRuleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1453:2: (iv_ruleGoalDisjunction= ruleGoalDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1454:2: iv_ruleGoalDisjunction= ruleGoalDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction3020);
            iv_ruleGoalDisjunction=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalDisjunction3030); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1461:1: ruleGoalDisjunction returns [EObject current=null] : (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) ;
    public final EObject ruleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalConjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1464:28: ( (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1465:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1465:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1466:5: this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getGoalConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3077);
            this_GoalConjunction_0=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalConjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1474:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=47 && LA24_0<=50)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1474:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1474:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1475:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1480:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1481:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1481:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1482:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1482:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( ((LA23_0>=47 && LA23_0<=48)) ) {
            	        alt23=1;
            	    }
            	    else if ( ((LA23_0>=49 && LA23_0<=50)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1483:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3109);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1498:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3128);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1516:2: ( (lv_right_3_0= ruleGoalConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1517:1: (lv_right_3_0= ruleGoalConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1517:1: (lv_right_3_0= ruleGoalConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1518:3: lv_right_3_0= ruleGoalConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getRightGoalConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3152);
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
            	    break loop24;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1542:1: entryRuleGoalConjunction returns [EObject current=null] : iv_ruleGoalConjunction= ruleGoalConjunction EOF ;
    public final EObject entryRuleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1543:2: (iv_ruleGoalConjunction= ruleGoalConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1544:2: iv_ruleGoalConjunction= ruleGoalConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3190);
            iv_ruleGoalConjunction=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalConjunction3200); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1551:1: ruleGoalConjunction returns [EObject current=null] : (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) ;
    public final EObject ruleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalComparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1554:28: ( (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1555:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1555:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1556:5: this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalConjunctionAccess().getGoalComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3247);
            this_GoalComparison_0=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalComparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1564:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=51 && LA25_0<=52)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1564:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1564:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1565:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1570:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1571:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1571:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1572:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleGoalConjunction3277);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1588:2: ( (lv_right_3_0= ruleGoalComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1589:1: (lv_right_3_0= ruleGoalComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1589:1: (lv_right_3_0= ruleGoalComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1590:3: lv_right_3_0= ruleGoalComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getRightGoalComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3298);
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
    // $ANTLR end "ruleGoalConjunction"


    // $ANTLR start "entryRuleGoalComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1614:1: entryRuleGoalComparison returns [EObject current=null] : iv_ruleGoalComparison= ruleGoalComparison EOF ;
    public final EObject entryRuleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1615:2: (iv_ruleGoalComparison= ruleGoalComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1616:2: iv_ruleGoalComparison= ruleGoalComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3336);
            iv_ruleGoalComparison=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalComparison3346); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1623:1: ruleGoalComparison returns [EObject current=null] : (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) ;
    public final EObject ruleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject this_GoalBooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1626:28: ( (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1627:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1627:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1628:5: this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalComparisonAccess().getGoalBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3393);
            this_GoalBooleanUnit_0=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalBooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1636:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=55 && LA27_0<=57)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1636:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1636:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1637:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1642:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1643:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1643:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1644:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1644:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==55) ) {
            	        alt26=1;
            	    }
            	    else if ( ((LA26_0>=56 && LA26_0<=57)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1645:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3425);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1660:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3444);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1678:2: ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1679:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1679:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1680:3: lv_right_3_0= ruleGoalBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getRightGoalBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3468);
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
            	    break loop27;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1704:1: entryRuleGoalBooleanUnit returns [EObject current=null] : iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF ;
    public final EObject entryRuleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1705:2: (iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1706:2: iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3506);
            iv_ruleGoalBooleanUnit=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanUnit3516); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1713:1: ruleGoalBooleanUnit returns [EObject current=null] : (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) ;
    public final EObject ruleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_GoalNegation_0 = null;

        EObject this_GoalBooleanLiteral_1 = null;

        EObject this_GoalReference_2 = null;

        EObject this_ParenthesizedGoalExpression_3 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1716:28: ( (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1717:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1717:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt28=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt28=2;
                }
                break;
            case 36:
                {
                alt28=3;
                }
                break;
            case 43:
                {
                alt28=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1718:5: this_GoalNegation_0= ruleGoalNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3563);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1728:5: this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3590);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1738:5: this_GoalReference_2= ruleGoalReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3617);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1748:5: this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getParenthesizedGoalExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3644);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1764:1: entryRuleGoalNegation returns [EObject current=null] : iv_ruleGoalNegation= ruleGoalNegation EOF ;
    public final EObject entryRuleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1765:2: (iv_ruleGoalNegation= ruleGoalNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1766:2: iv_ruleGoalNegation= ruleGoalNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalNegationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3679);
            iv_ruleGoalNegation=ruleGoalNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalNegation3689); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1773:1: ruleGoalNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) ;
    public final EObject ruleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1776:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1777:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1777:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1777:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1777:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1778:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1778:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1779:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleGoalNegation3735);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1795:2: ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1796:1: (lv_value_1_0= ruleGoalBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1796:1: (lv_value_1_0= ruleGoalBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1797:3: lv_value_1_0= ruleGoalBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getValueGoalBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3756);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1821:1: entryRuleGoalBooleanLiteral returns [EObject current=null] : iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF ;
    public final EObject entryRuleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1822:2: (iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1823:2: iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3792);
            iv_ruleGoalBooleanLiteral=ruleGoalBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3802); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1830:1: ruleGoalBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1833:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1834:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1834:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1835:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1835:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1836:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3843); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1860:1: entryRuleGoalReference returns [EObject current=null] : iv_ruleGoalReference= ruleGoalReference EOF ;
    public final EObject entryRuleGoalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalReference = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1861:2: (iv_ruleGoalReference= ruleGoalReference EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1862:2: iv_ruleGoalReference= ruleGoalReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleGoalReference_in_entryRuleGoalReference3883);
            iv_ruleGoalReference=ruleGoalReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalReference3893); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1869:1: ruleGoalReference returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGoalReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1872:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1873:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1873:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1873:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1873:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1874:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGoalReferenceAccess().getGoalReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleGoalReference3939); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalReferenceAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1883:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1884:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1884:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1885:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalReferenceAccess().getValueGoalCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalReference3962);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1906:1: entryRuleParenthesizedGoalExpression returns [EObject current=null] : iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF ;
    public final EObject entryRuleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1907:2: (iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1908:2: iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression3998);
            iv_ruleParenthesizedGoalExpression=ruleParenthesizedGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression4008); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:1: ruleParenthesizedGoalExpression returns [EObject current=null] : ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1918:28: ( ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:2: () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1919:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1920:5: 
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
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4058);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1933:1: ( (lv_value_2_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1934:1: (lv_value_2_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1934:1: (lv_value_2_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1935:3: lv_value_2_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedGoalExpressionAccess().getValueGoalExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4078);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4094);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1967:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1968:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1969:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4129);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression4139); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1976:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;

        EObject this_AppliedQuantitativePropertyExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1979:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1980:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1980:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            int alt29=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt29=1;
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
                alt29=2;
                }
                break;
            case 36:
                {
                alt29=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1981:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4186);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1991:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression4213);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2001:5: this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getAppliedQuantitativePropertyExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4240);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2017:1: entryRuleAppliedQuantitativePropertyExpression returns [EObject current=null] : iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF ;
    public final EObject entryRuleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativePropertyExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2018:2: (iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2019:2: iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4275);
            iv_ruleAppliedQuantitativePropertyExpression=ruleAppliedQuantitativePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4285); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:1: ruleAppliedQuantitativePropertyExpression returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2029:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2030:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2030:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2030:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2030:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2031:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getAppliedQuantitativePropertyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleAppliedQuantitativePropertyExpression4331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2040:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2041:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2041:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2042:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getValueAppliedQuantitativePropertyCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4354);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2063:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2064:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2065:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4390);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4400); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2072:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2075:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2077:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression4446);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2093:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2094:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2095:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication4480);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication4490); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2102:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2105:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2106:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2106:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2107:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4537);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2115:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=53 && LA30_0<=54)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2115:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2115:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2116:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2121:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2122:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2122:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2123:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication4567);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2139:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2140:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2140:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2141:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4588);
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2165:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2166:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2167:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction4626);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction4636); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2174:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2177:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2178:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2178:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2179:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4683);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2187:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=47 && LA32_0<=50)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2187:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2187:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2188:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2193:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2194:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2194:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2195:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2195:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=47 && LA31_0<=48)) ) {
            	        alt31=1;
            	    }
            	    else if ( ((LA31_0>=49 && LA31_0<=50)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2196:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction4715);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2211:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction4734);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2229:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2230:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2230:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2231:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4758);
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2255:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2256:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2257:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction4796);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction4806); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2264:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2267:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2268:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2268:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2269:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4853);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2277:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=51 && LA33_0<=52)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2277:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2277:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2278:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2283:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2284:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2284:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2285:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction4883);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2301:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2302:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2302:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2303:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4904);
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2327:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2328:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2329:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison4942);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison4952); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2336:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2339:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2340:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2340:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2341:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison4999);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2349:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=55 && LA35_0<=57)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2349:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2349:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2350:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2355:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2356:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2356:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2357:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2357:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==55) ) {
            	        alt34=1;
            	    }
            	    else if ( ((LA34_0>=56 && LA34_0<=57)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2358:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison5031);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2373:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison5050);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2391:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2392:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2392:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2393:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison5074);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2417:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2418:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2419:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5112);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit5122); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2426:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2429:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2430:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2430:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt36=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_NULL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 36:
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
                alt36=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2431:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit5169);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2441:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5196);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2451:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5223);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2467:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2468:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2469:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation5258);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation5268); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2479:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2480:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2480:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2480:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2480:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2481:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2481:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2482:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation5314);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2498:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2499:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2499:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2500:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation5335);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2524:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2525:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2526:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5371);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression5381); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2533:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2536:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2537:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2537:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2538:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5428);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=60 && LA38_0<=63)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt37=4;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt37=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 37, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt37) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2546:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2547:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2552:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2553:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2553:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2554:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5460);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2571:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2571:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2571:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2571:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2572:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2577:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2578:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2578:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2579:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5498);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2596:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2596:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2596:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2596:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2597:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2602:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2603:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2603:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2604:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5536);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2621:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2621:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2621:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2621:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2622:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2627:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2628:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2628:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2629:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5574);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2645:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2646:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2646:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2647:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5597);
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
            	    break loop38;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2671:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2672:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2673:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5635);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression5645); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2680:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2683:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2684:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2684:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt39=7;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2685:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5692);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2695:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5719);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2705:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5746);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2715:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression5773);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2725:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression5800);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2735:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5827);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2745:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5854);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2761:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2762:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2763:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5889);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression5899); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2770:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2773:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2775:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5945);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2791:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2792:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2793:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5979);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression5989); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2800:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2803:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2804:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2804:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2805:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6036);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2813:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=64 && LA41_0<=65)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2813:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2813:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2814:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2819:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2820:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2820:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2821:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2821:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==65) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==64) ) {
            	        alt40=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 40, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt40) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2822:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6068);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2837:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6087);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2855:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2856:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2856:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2857:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6111);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2881:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2882:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2883:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6149);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression6159); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2890:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2893:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2894:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2894:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2895:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6206);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2903:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==46||(LA43_0>=66 && LA43_0<=67)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2903:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2903:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2904:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2909:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2910:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2910:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2911:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2911:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt42=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt42=3;
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2912:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6238);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2927:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6257);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2942:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6276);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2960:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2961:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2961:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2962:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6300);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleNumberFunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2986:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2987:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2988:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6338);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction6348); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2995:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2998:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2999:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2999:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt44=8;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt44=1;
                }
                break;
            case 69:
                {
                alt44=2;
                }
                break;
            case 70:
                {
                alt44=3;
                }
                break;
            case 71:
                {
                alt44=4;
                }
                break;
            case 72:
                {
                alt44=5;
                }
                break;
            case 73:
                {
                alt44=6;
                }
                break;
            case 74:
                {
                alt44=7;
                }
                break;
            case 75:
                {
                alt44=8;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3000:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6395);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3010:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6422);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3020:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction6449);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3030:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction6476);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3040:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6503);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3050:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6530);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3060:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6557);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3070:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6584);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3086:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3087:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3088:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6619);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction6629); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3095:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3098:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3099:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3099:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3099:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3099:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3100:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3100:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3101:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6675);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMaximumFunction6687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3121:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3122:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3122:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3123:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6708);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3139:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==20) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3139:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMaximumFunction6721); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3143:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3144:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3144:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3145:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6742);
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
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleMaximumFunction6756); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3173:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3174:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3175:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6792);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction6802); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3182:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3185:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3186:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3186:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3186:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3186:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3187:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3187:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3188:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction6848);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMinimumFunction6860); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3208:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3209:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3209:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3210:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6881);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3226:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==20) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3226:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMinimumFunction6894); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3230:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3231:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3231:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3232:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6915);
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
            	    break loop46;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleMinimumFunction6929); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3260:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3261:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3262:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6965);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction6975); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3269:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3272:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3273:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3273:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3273:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3273:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3274:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3274:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3275:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction7021);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAverageFunction7033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3295:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3296:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3296:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3297:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7054);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3313:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==20) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3313:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAverageFunction7067); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3317:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3318:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3318:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3319:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7088);
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
            	    break loop47;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleAverageFunction7102); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3347:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3348:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3349:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction7138);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction7148); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3356:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3359:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3360:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3360:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3360:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3360:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3361:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3361:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3362:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction7194);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSumFunction7206); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3382:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3383:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3383:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3384:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7227);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3400:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3400:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSumFunction7240); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3404:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3405:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3405:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3406:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7261);
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
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleSumFunction7275); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3434:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3435:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3436:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7311);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction7321); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3443:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3446:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3447:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3447:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3447:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3447:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3448:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3448:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3449:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7367);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleExponentialFunction7379); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3469:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3470:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3470:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3471:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7400);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExponentialFunction7412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3491:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3492:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3492:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3493:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7433);
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

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleExponentialFunction7445); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3521:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3522:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3523:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7481);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction7491); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3530:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3533:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3534:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3534:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3534:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3534:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3535:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3535:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3536:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7537);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAbsoluteFunction7549); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3556:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3557:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3557:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3558:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7570);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleAbsoluteFunction7582); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3586:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3587:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3588:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7618);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7628); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3595:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3598:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3599:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3599:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3599:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3599:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3600:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3600:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3601:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7674);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleNaturalLogarithmFunction7686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3621:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3622:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3622:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3623:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7707);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleNaturalLogarithmFunction7719); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3651:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3652:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3653:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7755);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7765); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3660:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3663:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3664:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3664:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3664:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3664:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3665:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3665:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3666:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7811);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleCommonLogarithmFunction7823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3686:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3687:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3687:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3688:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7844);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleCommonLogarithmFunction7856); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3716:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3717:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3718:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7892);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7902); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3725:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3728:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3729:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3729:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3730:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7943);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3737:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3738:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3738:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3739:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7963);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7979);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3771:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3772:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3773:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8014);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification8024); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3780:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3783:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3784:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3784:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3785:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8071);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3795:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8098);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3805:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8125);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3821:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3822:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3823:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8160);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8170); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3833:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3834:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3834:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3834:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3834:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3835:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3835:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3836:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8218);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3849:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==19) ) {
                alt50=1;
            }
            else if ( (LA50_0==17) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3849:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3849:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3850:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3850:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3851:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8240);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3868:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3868:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3869:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3869:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3870:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8267);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3894:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3895:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3896:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection8304);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection8314); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3903:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3906:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3907:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3907:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3907:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCollection8351); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3911:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3912:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3912:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3913:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8372);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3929:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==20) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3929:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCollection8385); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3933:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3934:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3934:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3935:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8406);
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
            	    break loop51;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCollection8420); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3963:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3964:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3965:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple8456);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple8466); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3972:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3975:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3976:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3976:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3976:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple8503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3980:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3981:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3981:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3982:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8524);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3998:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==20) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3998:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTuple8537); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4002:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4003:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4003:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4004:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8558);
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
            	    break loop52;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTuple8572); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4032:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4033:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4034:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8608);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair8618); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4041:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4044:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4045:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4045:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4045:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4045:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4046:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4046:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4047:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8666);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_rulePropertyValuePair8678); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4064:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4065:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4065:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4066:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8699);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4090:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4091:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4092:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8735);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8745); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4099:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4102:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4103:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4103:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4104:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4104:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4105:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8792);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4126:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4127:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4128:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8827);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression8837); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4135:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4138:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4139:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4139:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt53=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt53=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt53=2;
                }
                break;
            case RULE_NULL:
                {
                alt53=3;
                }
                break;
            case RULE_STRING:
                {
                alt53=4;
                }
                break;
            case 46:
                {
                alt53=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4140:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8884);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4150:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8911);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4160:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8938);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4170:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8965);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4180:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8992);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4196:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4197:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4198:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9027);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9037); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4205:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4208:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4209:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4209:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4210:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4210:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4211:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9078); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4235:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4236:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4237:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9118);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9128); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4244:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4247:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4248:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4248:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4249:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4249:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4250:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral9173);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4274:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4275:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4276:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9208);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9218); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4283:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4286:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4287:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4287:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4288:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4288:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4289:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral9259); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4313:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4314:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4315:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9299);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9309); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4322:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4325:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4326:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4326:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4327:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4327:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4328:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9350); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4352:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4353:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4354:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9390);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral9400); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4361:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4364:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4365:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4365:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4366:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4366:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4367:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,46,FOLLOW_46_in_ruleUnlimitedLiteral9442); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4388:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4389:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4390:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator9490);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator9500); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4397:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4400:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4401:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4401:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4401:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4401:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4402:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4407:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==47) ) {
                alt54=1;
            }
            else if ( (LA54_0==48) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4407:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleOrOperator9547); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4412:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleOrOperator9565); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4424:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4425:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4426:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9602);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator9612); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4433:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4436:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4437:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4437:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4437:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4437:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4438:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==49) ) {
                alt55=1;
            }
            else if ( (LA55_0==50) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXOrOperator9659); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4448:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXOrOperator9677); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4460:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4461:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4462:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator9714);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator9724); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4469:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4472:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4473:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4473:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4473:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4473:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4474:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==51) ) {
                alt56=1;
            }
            else if ( (LA56_0==52) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAndOperator9771); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4484:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleAndOperator9789); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4496:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4497:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4498:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9826);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator9836); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4505:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4508:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4509:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4509:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4509:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4509:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4510:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==53) ) {
                alt57=1;
            }
            else if ( (LA57_0==54) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleImplicationOperator9883); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4520:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleImplicationOperator9901); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4532:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4533:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4534:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9938);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator9948); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4541:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4544:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4545:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4545:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4545:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4545:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4546:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleEqualsOperator9994); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4563:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4564:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4565:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10030);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator10040); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4572:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4575:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4576:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4576:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4576:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4576:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4577:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4582:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==56) ) {
                alt58=1;
            }
            else if ( (LA58_0==57) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4582:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNotEqualsOperator10087); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4587:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleNotEqualsOperator10105); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4599:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4600:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4601:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator10142);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator10152); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4608:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4611:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4612:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4612:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4612:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4612:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4613:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==58) ) {
                alt59=1;
            }
            else if ( (LA59_0==59) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleNotOperator10199); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4623:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleNotOperator10217); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4635:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4636:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4637:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10254);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator10264); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4644:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4647:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4648:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4648:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4648:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4648:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4649:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleGreaterThanOperator10310); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4666:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4667:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4668:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10346);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10356); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4675:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4678:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4679:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4679:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4679:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4679:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4680:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleGreaterOrEqualThanOperator10402); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4697:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4698:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4699:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10438);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator10448); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4706:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4709:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4710:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4710:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4710:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4710:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4711:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleLessThanOperator10494); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4728:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4729:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4730:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10530);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10540); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4737:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4740:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4741:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4741:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4741:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4741:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4742:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleLessOrEqualThanOperator10586); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4759:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4760:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4761:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10622);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator10632); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4768:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4771:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4772:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4772:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4772:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4772:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4773:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAdditionOperator10678); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4790:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4791:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4792:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10714);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator10724); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4799:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4802:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4803:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4803:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4803:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4803:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4804:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleSubstractionOperator10770); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4821:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4822:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4823:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10806);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator10816); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4830:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4833:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4834:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4834:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4834:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4834:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4835:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicationOperator10862); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4852:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4853:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4854:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10898);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator10908); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4861:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4864:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4865:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4865:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4865:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4865:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4866:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleDivisionOperator10954); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4883:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4884:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4885:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10990);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator11000); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4892:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4895:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4896:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4896:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4896:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4896:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4897:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleModulusOperator11046); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4914:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4915:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4916:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11082);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator11092); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4923:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4926:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4927:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4927:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4927:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4927:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4928:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleMaxOperator11138); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4945:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4946:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4947:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator11174);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator11184); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4954:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4957:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4958:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4958:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4958:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4958:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4959:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleMinOperator11230); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4976:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4977:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4978:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11266);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator11276); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4985:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4988:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4989:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4989:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4989:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4989:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4990:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleAvgOperator11322); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5007:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5008:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5009:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator11358);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator11368); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5016:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5019:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5020:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5020:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5020:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5020:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5021:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSumOperator11414); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5038:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5039:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5040:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11450);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator11460); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5047:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5050:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5051:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5051:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5051:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5051:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5052:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleExponentialOperator11506); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5069:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5070:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5071:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11542);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator11552); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5078:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5081:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5082:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5082:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5082:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5082:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5083:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleAbsoluteOperator11598); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5100:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5101:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5102:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11634);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11644); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5109:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5112:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5113:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5113:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5113:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5113:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5114:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleNaturalLogarithmOperator11690); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5131:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5132:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5133:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11726);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11736); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5140:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5143:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5144:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5144:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5144:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5144:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5145:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleCommonLogarithmOperator11782); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5162:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5163:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5164:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11819);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11830); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5171:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5174:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5176:2: kw= '('
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleLeftParenthesis11867); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5189:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5190:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5191:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11907);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis11918); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5198:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5201:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5203:2: kw= ')'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleRightParenthesis11955); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5216:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5217:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5218:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11995);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12006); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5225:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5228:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5229:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5229:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5229:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12046); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5236:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==76) && (synpred1_InternalGML())) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5236:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5236:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5236:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,76,FOLLOW_76_in_ruleQualifiedName12074); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12090); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5259:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5260:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5261:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12138);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12149); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5268:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5271:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5272:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5272:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5273:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12196);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5283:1: (kw= '.*' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==77) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5284:2: kw= '.*'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleQualifiedNameWithWildcard12215); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5301:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5302:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5303:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12261);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace12271); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5310:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5313:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleImportNamespace12308); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5318:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5319:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5319:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5320:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12329);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5344:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5345:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5346:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12366);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12377); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5353:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5356:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5357:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5357:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt62=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt62=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt62=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt62=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt62=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5357:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12417); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5365:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12443); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5373:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12469); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5381:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12495); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5396:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5397:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5398:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact12541);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact12552); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5405:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5408:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5409:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5409:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_SMALL_DECIMAL) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5409:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12592); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5417:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12618); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5434:1: ruleGoalKind returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) ;
    public final Enumerator ruleGoalKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5436:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5437:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5437:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            int alt64=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt64=1;
                }
                break;
            case 80:
                {
                alt64=2;
                }
                break;
            case 81:
                {
                alt64=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5437:2: (enumLiteral_0= 'required' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5437:2: (enumLiteral_0= 'required' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5437:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleGoalKind12679); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5443:6: (enumLiteral_1= 'offered' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5443:6: (enumLiteral_1= 'offered' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5443:8: enumLiteral_1= 'offered'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleGoalKind12696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5449:6: (enumLiteral_2= 'contract' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5449:6: (enumLiteral_2= 'contract' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5449:8: enumLiteral_2= 'contract'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleGoalKind12713); if (state.failed) return current;
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
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5236:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5237:2: '.'
        {
        match(input,76,FOLLOW_76_in_synpred1_InternalGML12065); if (state.failed) return ;

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


    protected DFA39 dfa39 = new DFA39(this);
    protected DFA49 dfa49 = new DFA49(this);
    static final String DFA39_eotS =
        "\13\uffff";
    static final String DFA39_eofS =
        "\2\uffff\1\11\7\uffff\1\11";
    static final String DFA39_minS =
        "\1\4\1\uffff\1\21\4\uffff\1\4\2\uffff\1\21";
    static final String DFA39_maxS =
        "\1\113\1\uffff\1\114\4\uffff\1\4\2\uffff\1\114";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA39_specialS =
        "\13\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\2\1\4\2\1\1\uffff\1\3\2\1\30\uffff\1\1\6\uffff\1\6\2\uffff"+
            "\1\5\25\uffff\10\1",
            "",
            "\1\10\1\uffff\1\10\1\11\3\uffff\1\11\23\uffff\1\11\2\uffff"+
            "\13\11\2\uffff\4\11\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\10\1\uffff\1\10\1\11\3\uffff\1\11\23\uffff\1\11\2\uffff"+
            "\13\11\2\uffff\4\11\14\uffff\1\7"
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "2684:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA49_eotS =
        "\7\uffff";
    static final String DFA49_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA49_minS =
        "\1\4\1\uffff\1\21\1\4\2\uffff\1\21";
    static final String DFA49_maxS =
        "\1\56\1\uffff\1\114\1\4\2\uffff\1\114";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA49_specialS =
        "\7\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\2\7\1\42\uffff\1\1",
            "",
            "\1\5\1\uffff\1\5\2\4\2\uffff\1\4\63\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\5\1\uffff\1\5\2\4\2\uffff\1\4\63\uffff\1\3"
    };

    static final short[] DFA49_eot = DFA.unpackEncodedString(DFA49_eotS);
    static final short[] DFA49_eof = DFA.unpackEncodedString(DFA49_eofS);
    static final char[] DFA49_min = DFA.unpackEncodedStringToUnsignedChars(DFA49_minS);
    static final char[] DFA49_max = DFA.unpackEncodedStringToUnsignedChars(DFA49_maxS);
    static final short[] DFA49_accept = DFA.unpackEncodedString(DFA49_acceptS);
    static final short[] DFA49_special = DFA.unpackEncodedString(DFA49_specialS);
    static final short[][] DFA49_transition;

    static {
        int numStates = DFA49_transitionS.length;
        DFA49_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA49_transition[i] = DFA.unpackEncodedString(DFA49_transitionS[i]);
        }
    }

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = DFA49_eot;
            this.eof = DFA49_eof;
            this.min = DFA49_min;
            this.max = DFA49_max;
            this.accept = DFA49_accept;
            this.special = DFA49_special;
            this.transition = DFA49_transition;
        }
        public String getDescription() {
            return "3784:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
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
    public static final BitSet FOLLOW_19_in_ruleGoalModel393 = new BitSet(new long[]{0x0000048200200000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleGoalModel415 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel428 = new BitSet(new long[]{0x0000048200000000L});
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
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty946 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativeProperty959 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQualitativeProperty971 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQualitativeProperty983 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1007 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativeProperty1020 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1043 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQualitativeProperty1059 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAppliedQualitativeProperty1073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativeProperty_in_entryRuleAppliedQuantitativeProperty1109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativeProperty1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleAppliedQuantitativeProperty1156 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQuantitativeProperty1173 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAppliedQuantitativeProperty1190 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAppliedQuantitativeProperty1202 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1225 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1238 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleAppliedQuantitativeProperty1250 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleAppliedQuantitativeProperty1273 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleAppliedQuantitativeProperty1292 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAppliedQuantitativeProperty1311 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleAppliedQuantitativeProperty1330 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1348 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQuantitativeProperty1360 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleAppliedQuantitativeProperty1372 = new BitSet(new long[]{0x0000000000200010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1396 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1409 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1432 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativeProperty1448 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1463 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAppliedQuantitativeProperty1475 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1498 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAppliedQuantitativeProperty1512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoal_in_ruleGoal1605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_ruleGoal1632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_ruleGoal1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoal_in_entryRuleSoftGoal1694 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoal1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleSoftGoal1741 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftGoal1758 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSoftGoal1775 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleSoftGoal1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleSoftGoal1808 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1820 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSoftGoal1832 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftGoal1849 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1866 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleSoftGoal1878 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSoftGoal1890 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoal1913 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1925 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSoftGoal1937 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoal1958 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1971 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSoftGoal1983 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoal1995 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2016 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal2029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2050 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2064 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSoftGoal2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2114 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoalImpact2124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2172 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoalImpact2193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_entryRuleHardGoal2229 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardGoal2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleHardGoal2276 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHardGoal2293 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHardGoal2310 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleHardGoal2322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleHardGoal2343 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2355 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleHardGoal2367 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHardGoal2384 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2401 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleHardGoal2413 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleHardGoal2434 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2447 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleHardGoal2459 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2476 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleHardGoal2495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2531 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeGoal2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleCompositeGoal2578 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeGoal2595 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeGoal2612 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCompositeGoal2624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleCompositeGoal2645 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoal2657 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCompositeGoal2669 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompositeGoal2686 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoal2703 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCompositeGoal2715 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2736 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCompositeGoal2748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalExpression2794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_ruleGoalExpression2840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalImplication2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2931 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleGoalImplication2961 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2982 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction3020 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalDisjunction3030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3077 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3109 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3128 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3152 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalConjunction3200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3247 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleGoalConjunction3277 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3298 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3336 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalComparison3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3393 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3425 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3444 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3468 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanUnit3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3679 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalNegation3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleGoalNegation3735 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_entryRuleGoalReference3883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalReference3893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleGoalReference3939 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalReference3962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression3998 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression4008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4058 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4078 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression4213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleAppliedQuantitativePropertyExpression4331 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4537 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication4567 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4588 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction4626 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction4636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4683 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction4715 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction4734 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4758 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction4796 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction4806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4853 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction4883 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4904 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison4942 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison4952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison4999 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison5031 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison5050 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison5074 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit5122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit5169 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation5258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation5268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation5314 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5371 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression5381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5428 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5460 = new BitSet(new long[]{0x0000481000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5498 = new BitSet(new long[]{0x0000481000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5536 = new BitSet(new long[]{0x0000481000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5574 = new BitSet(new long[]{0x0000481000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5597 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5635 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression5645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression5773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression5800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5889 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6036 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6068 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6087 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6111 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression6159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6206 = new BitSet(new long[]{0x0000400000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6238 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6257 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6276 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6300 = new BitSet(new long[]{0x0000400000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction6348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction6449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction6476 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6619 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction6629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6675 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMaximumFunction6687 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6708 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleMaximumFunction6721 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6742 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleMaximumFunction6756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6792 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction6802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction6848 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMinimumFunction6860 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6881 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleMinimumFunction6894 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6915 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleMinimumFunction6929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6965 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction6975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction7021 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAverageFunction7033 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7054 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleAverageFunction7067 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7088 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleAverageFunction7102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction7138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction7148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction7194 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSumFunction7206 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7227 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleSumFunction7240 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7261 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleSumFunction7275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction7321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7367 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExponentialFunction7379 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7400 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExponentialFunction7412 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7433 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExponentialFunction7445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7481 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction7491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7537 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAbsoluteFunction7549 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7570 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAbsoluteFunction7582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7618 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7674 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNaturalLogarithmFunction7686 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7707 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNaturalLogarithmFunction7719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7811 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCommonLogarithmFunction7823 = new BitSet(new long[]{0x0000001000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7844 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommonLogarithmFunction7856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7892 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7943 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7963 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8014 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification8024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8160 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8218 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection8304 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection8314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCollection8351 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8372 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCollection8385 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8406 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCollection8420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple8456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple8466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple8503 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8524 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleTuple8537 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8558 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_24_in_ruleTuple8572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair8618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8666 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePropertyValuePair8678 = new BitSet(new long[]{0x0C00481000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8735 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8827 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9027 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9118 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral9173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9299 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9390 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral9400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUnlimitedLiteral9442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator9490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator9500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOrOperator9547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOrOperator9565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator9612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXOrOperator9659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXOrOperator9677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator9714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator9724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAndOperator9771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAndOperator9789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9826 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator9836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicationOperator9883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicationOperator9901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9938 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator9948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEqualsOperator9994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10030 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator10040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNotEqualsOperator10087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNotEqualsOperator10105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator10142 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator10152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNotOperator10199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNotOperator10217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGreaterThanOperator10310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGreaterOrEqualThanOperator10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator10448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLessThanOperator10494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10530 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLessOrEqualThanOperator10586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10622 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator10632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAdditionOperator10678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator10724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSubstractionOperator10770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator10816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicationOperator10862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10898 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator10908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDivisionOperator10954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator11000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleModulusOperator11046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11082 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator11092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleMaxOperator11138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator11174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator11184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleMinOperator11230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11266 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator11276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAvgOperator11322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator11358 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator11368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSumOperator11414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11450 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator11460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleExponentialOperator11506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator11552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAbsoluteOperator11598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11634 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleNaturalLogarithmOperator11690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11726 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCommonLogarithmOperator11782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11819 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLeftParenthesis11867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11907 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis11918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRightParenthesis11955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11995 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12046 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleQualifiedName12074 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12196 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleQualifiedNameWithWildcard12215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12261 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace12271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleImportNamespace12308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact12541 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact12552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleGoalKind12679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGoalKind12696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGoalKind12713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred1_InternalGML12065 = new BitSet(new long[]{0x0000000000000002L});

}