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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:821:1: ruleSoftGoal returns [EObject current=null] : (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'threshold' ( (lv_threshold_13_0= ruleImpact ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' ) ;
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
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Enumerator lv_kind_4_0 = null;

        AntlrDatatypeRuleToken lv_threshold_13_0 = null;

        EObject lv_impacts_17_0 = null;

        EObject lv_impacts_19_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:824:28: ( (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'threshold' ( (lv_threshold_13_0= ruleImpact ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'threshold' ( (lv_threshold_13_0= ruleImpact ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'threshold' ( (lv_threshold_13_0= ruleImpact ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:825:3: otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' ( ( ruleQualifiedName ) ) otherlv_11= ',' otherlv_12= 'threshold' ( (lv_threshold_13_0= ruleImpact ) ) (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']' )? otherlv_21= '}'
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
            otherlv_12=(Token)match(input,36,FOLLOW_36_in_ruleSoftGoal1916); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSoftGoalAccess().getThresholdKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:930:1: ( (lv_threshold_13_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:931:1: (lv_threshold_13_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:931:1: (lv_threshold_13_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:932:3: lv_threshold_13_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getThresholdImpactParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoal1937);
            lv_threshold_13_0=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
              	        }
                     		set(
                     			current, 
                     			"threshold",
                      		lv_threshold_13_0, 
                      		"Impact");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:948:2: (otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==20) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:948:4: otherlv_14= ',' otherlv_15= 'impacts' otherlv_16= '[' ( (lv_impacts_17_0= ruleSoftGoalImpact ) ) (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )* otherlv_20= ']'
                    {
                    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal1950); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getSoftGoalAccess().getCommaKeyword_14_0());
                          
                    }
                    otherlv_15=(Token)match(input,37,FOLLOW_37_in_ruleSoftGoal1962); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSoftGoalAccess().getImpactsKeyword_14_1());
                          
                    }
                    otherlv_16=(Token)match(input,19,FOLLOW_19_in_ruleSoftGoal1974); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSoftGoalAccess().getLeftSquareBracketKeyword_14_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:960:1: ( (lv_impacts_17_0= ruleSoftGoalImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:961:1: (lv_impacts_17_0= ruleSoftGoalImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:961:1: (lv_impacts_17_0= ruleSoftGoalImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:962:3: lv_impacts_17_0= ruleSoftGoalImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_14_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal1995);
                    lv_impacts_17_0=ruleSoftGoalImpact();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
                      	        }
                             		add(
                             			current, 
                             			"impacts",
                              		lv_impacts_17_0, 
                              		"SoftGoalImpact");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:978:2: (otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:978:4: otherlv_18= ',' ( (lv_impacts_19_0= ruleSoftGoalImpact ) )
                    	    {
                    	    otherlv_18=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal2008); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_18, grammarAccess.getSoftGoalAccess().getCommaKeyword_14_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:982:1: ( (lv_impacts_19_0= ruleSoftGoalImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:983:1: (lv_impacts_19_0= ruleSoftGoalImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:983:1: (lv_impacts_19_0= ruleSoftGoalImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:984:3: lv_impacts_19_0= ruleSoftGoalImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_14_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2029);
                    	    lv_impacts_19_0=ruleSoftGoalImpact();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getSoftGoalRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"impacts",
                    	              		lv_impacts_19_0, 
                    	              		"SoftGoalImpact");
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

                    otherlv_20=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2043); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getSoftGoalAccess().getRightSquareBracketKeyword_14_5());
                          
                    }

                    }
                    break;

            }

            otherlv_21=(Token)match(input,24,FOLLOW_24_in_ruleSoftGoal2057); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getSoftGoalAccess().getRightCurlyBracketKeyword_15());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1016:1: entryRuleSoftGoalImpact returns [EObject current=null] : iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF ;
    public final EObject entryRuleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoalImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1017:2: (iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1018:2: iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalImpactRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2093);
            iv_ruleSoftGoalImpact=ruleSoftGoalImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoalImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoalImpact2103); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1025:1: ruleSoftGoalImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject ruleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1028:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1029:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1029:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1029:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1029:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1030:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1030:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1031:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getTargetSoftGoalCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2151);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1044:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1045:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1045:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1046:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoalImpact2172);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1070:1: entryRuleHardGoal returns [EObject current=null] : iv_ruleHardGoal= ruleHardGoal EOF ;
    public final EObject entryRuleHardGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1071:2: (iv_ruleHardGoal= ruleHardGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1072:2: iv_ruleHardGoal= ruleHardGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardGoalRule()); 
            }
            pushFollow(FOLLOW_ruleHardGoal_in_entryRuleHardGoal2208);
            iv_ruleHardGoal=ruleHardGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardGoal2218); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:1: ruleHardGoal returns [EObject current=null] : (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1082:28: ( (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1083:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1083:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1083:3: otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_38_in_ruleHardGoal2255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHardGoalAccess().getHardgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1087:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1088:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1088:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1089:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHardGoal2272); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleHardGoal2289); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHardGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleHardGoal2301); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHardGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1113:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1114:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1114:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1115:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleHardGoal2322);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2334); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHardGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleHardGoal2346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHardGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1139:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1140:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1140:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1141:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHardGoal2363); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getHardGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleHardGoal2392); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHardGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1165:1: ( (lv_condition_10_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1166:1: (lv_condition_10_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1166:1: (lv_condition_10_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1167:3: lv_condition_10_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getConditionExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleHardGoal2413);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1183:2: (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==20) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1183:4: otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleHardGoal2426); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHardGoalAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_12=(Token)match(input,40,FOLLOW_40_in_ruleHardGoal2438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getHardGoalAccess().getSuccessRateKeyword_11_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1191:1: ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1192:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1192:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1193:3: lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_successRate_13_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2455); if (state.failed) return current;
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

            otherlv_14=(Token)match(input,24,FOLLOW_24_in_ruleHardGoal2474); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1221:1: entryRuleCompositeGoal returns [EObject current=null] : iv_ruleCompositeGoal= ruleCompositeGoal EOF ;
    public final EObject entryRuleCompositeGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1222:2: (iv_ruleCompositeGoal= ruleCompositeGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1223:2: iv_ruleCompositeGoal= ruleCompositeGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeGoalRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2510);
            iv_ruleCompositeGoal=ruleCompositeGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeGoal2520); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1230:1: ruleCompositeGoal returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1233:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1234:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1234:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1234:3: otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,41,FOLLOW_41_in_ruleCompositeGoal2557); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeGoalAccess().getCompositeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1238:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1239:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1239:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1240:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeGoal2574); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,17,FOLLOW_17_in_ruleCompositeGoal2591); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,34,FOLLOW_34_in_ruleCompositeGoal2603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1264:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1265:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1265:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1266:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleCompositeGoal2624);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoal2636); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCompositeGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,35,FOLLOW_35_in_ruleCompositeGoal2648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1290:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1291:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1291:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1292:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompositeGoal2665); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoal2682); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,39,FOLLOW_39_in_ruleCompositeGoal2694); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1316:1: ( (lv_condition_10_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1317:1: (lv_condition_10_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1317:1: (lv_condition_10_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1318:3: lv_condition_10_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getConditionGoalExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2715);
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

            otherlv_11=(Token)match(input,24,FOLLOW_24_in_ruleCompositeGoal2727); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1346:1: entryRuleGoalExpression returns [EObject current=null] : iv_ruleGoalExpression= ruleGoalExpression EOF ;
    public final EObject entryRuleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1347:2: (iv_ruleGoalExpression= ruleGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1348:2: iv_ruleGoalExpression= ruleGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2763);
            iv_ruleGoalExpression=ruleGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalExpression2773); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1355:1: ruleGoalExpression returns [EObject current=null] : this_GoalImplication_0= ruleGoalImplication ;
    public final EObject ruleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GoalImplication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1358:28: (this_GoalImplication_0= ruleGoalImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1360:5: this_GoalImplication_0= ruleGoalImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalExpressionAccess().getGoalImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_ruleGoalExpression2819);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1376:1: entryRuleGoalImplication returns [EObject current=null] : iv_ruleGoalImplication= ruleGoalImplication EOF ;
    public final EObject entryRuleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1377:2: (iv_ruleGoalImplication= ruleGoalImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1378:2: iv_ruleGoalImplication= ruleGoalImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2853);
            iv_ruleGoalImplication=ruleGoalImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalImplication2863); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1385:1: ruleGoalImplication returns [EObject current=null] : (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) ;
    public final EObject ruleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject this_GoalDisjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1388:28: ( (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1389:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1389:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1390:5: this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalImplicationAccess().getGoalDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2910);
            this_GoalDisjunction_0=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalDisjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1398:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=53 && LA19_0<=54)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1398:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1398:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1399:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1404:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1405:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1405:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1406:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleGoalImplication2940);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1422:2: ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1423:1: (lv_right_3_0= ruleGoalDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1423:1: (lv_right_3_0= ruleGoalDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1424:3: lv_right_3_0= ruleGoalDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getRightGoalDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2961);
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
            	    break loop19;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1448:1: entryRuleGoalDisjunction returns [EObject current=null] : iv_ruleGoalDisjunction= ruleGoalDisjunction EOF ;
    public final EObject entryRuleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1449:2: (iv_ruleGoalDisjunction= ruleGoalDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1450:2: iv_ruleGoalDisjunction= ruleGoalDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction2999);
            iv_ruleGoalDisjunction=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalDisjunction3009); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1457:1: ruleGoalDisjunction returns [EObject current=null] : (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) ;
    public final EObject ruleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalConjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1460:28: ( (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1461:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1461:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1462:5: this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getGoalConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3056);
            this_GoalConjunction_0=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalConjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1470:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=47 && LA21_0<=50)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1470:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1470:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1471:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1476:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1477:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1477:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1478:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1478:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=47 && LA20_0<=48)) ) {
            	        alt20=1;
            	    }
            	    else if ( ((LA20_0>=49 && LA20_0<=50)) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1479:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3088);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1494:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3107);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1512:2: ( (lv_right_3_0= ruleGoalConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1513:1: (lv_right_3_0= ruleGoalConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1513:1: (lv_right_3_0= ruleGoalConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1514:3: lv_right_3_0= ruleGoalConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getRightGoalConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3131);
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
            	    break loop21;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1538:1: entryRuleGoalConjunction returns [EObject current=null] : iv_ruleGoalConjunction= ruleGoalConjunction EOF ;
    public final EObject entryRuleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1539:2: (iv_ruleGoalConjunction= ruleGoalConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1540:2: iv_ruleGoalConjunction= ruleGoalConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3169);
            iv_ruleGoalConjunction=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalConjunction3179); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1547:1: ruleGoalConjunction returns [EObject current=null] : (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) ;
    public final EObject ruleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalComparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1550:28: ( (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1551:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1551:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1552:5: this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalConjunctionAccess().getGoalComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3226);
            this_GoalComparison_0=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalComparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1560:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=51 && LA22_0<=52)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1560:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1560:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1561:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1566:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1567:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1567:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1568:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleGoalConjunction3256);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1584:2: ( (lv_right_3_0= ruleGoalComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1585:1: (lv_right_3_0= ruleGoalComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1585:1: (lv_right_3_0= ruleGoalComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1586:3: lv_right_3_0= ruleGoalComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getRightGoalComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3277);
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
    // $ANTLR end "ruleGoalConjunction"


    // $ANTLR start "entryRuleGoalComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1610:1: entryRuleGoalComparison returns [EObject current=null] : iv_ruleGoalComparison= ruleGoalComparison EOF ;
    public final EObject entryRuleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1611:2: (iv_ruleGoalComparison= ruleGoalComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1612:2: iv_ruleGoalComparison= ruleGoalComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3315);
            iv_ruleGoalComparison=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalComparison3325); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1619:1: ruleGoalComparison returns [EObject current=null] : (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) ;
    public final EObject ruleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject this_GoalBooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1622:28: ( (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1623:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1623:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1624:5: this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalComparisonAccess().getGoalBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3372);
            this_GoalBooleanUnit_0=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalBooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1632:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=55 && LA24_0<=57)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1632:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1632:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1633:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1638:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1639:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1639:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1640:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1640:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==55) ) {
            	        alt23=1;
            	    }
            	    else if ( ((LA23_0>=56 && LA23_0<=57)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1641:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3404);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1656:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3423);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1674:2: ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1675:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1675:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1676:3: lv_right_3_0= ruleGoalBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getRightGoalBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3447);
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
    // $ANTLR end "ruleGoalComparison"


    // $ANTLR start "entryRuleGoalBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1700:1: entryRuleGoalBooleanUnit returns [EObject current=null] : iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF ;
    public final EObject entryRuleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1701:2: (iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1702:2: iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3485);
            iv_ruleGoalBooleanUnit=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanUnit3495); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1709:1: ruleGoalBooleanUnit returns [EObject current=null] : (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) ;
    public final EObject ruleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_GoalNegation_0 = null;

        EObject this_GoalBooleanLiteral_1 = null;

        EObject this_GoalReference_2 = null;

        EObject this_ParenthesizedGoalExpression_3 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1712:28: ( (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1713:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1713:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            int alt25=4;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt25=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt25=2;
                }
                break;
            case 42:
                {
                alt25=3;
                }
                break;
            case 43:
                {
                alt25=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1714:5: this_GoalNegation_0= ruleGoalNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3542);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1724:5: this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3569);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1734:5: this_GoalReference_2= ruleGoalReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3596);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1744:5: this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getParenthesizedGoalExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3623);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1760:1: entryRuleGoalNegation returns [EObject current=null] : iv_ruleGoalNegation= ruleGoalNegation EOF ;
    public final EObject entryRuleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1761:2: (iv_ruleGoalNegation= ruleGoalNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1762:2: iv_ruleGoalNegation= ruleGoalNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalNegationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3658);
            iv_ruleGoalNegation=ruleGoalNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalNegation3668); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1769:1: ruleGoalNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) ;
    public final EObject ruleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1772:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1773:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1773:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1773:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1773:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1774:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1774:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1775:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleGoalNegation3714);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1791:2: ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1792:1: (lv_value_1_0= ruleGoalBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1792:1: (lv_value_1_0= ruleGoalBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1793:3: lv_value_1_0= ruleGoalBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getValueGoalBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3735);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1817:1: entryRuleGoalBooleanLiteral returns [EObject current=null] : iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF ;
    public final EObject entryRuleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1818:2: (iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1819:2: iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3771);
            iv_ruleGoalBooleanLiteral=ruleGoalBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3781); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1826:1: ruleGoalBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1829:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1830:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1830:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1831:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1831:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1832:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3822); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1856:1: entryRuleGoalReference returns [EObject current=null] : iv_ruleGoalReference= ruleGoalReference EOF ;
    public final EObject entryRuleGoalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalReference = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1857:2: (iv_ruleGoalReference= ruleGoalReference EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1858:2: iv_ruleGoalReference= ruleGoalReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleGoalReference_in_entryRuleGoalReference3862);
            iv_ruleGoalReference=ruleGoalReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalReference3872); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1865:1: ruleGoalReference returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGoalReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1868:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1869:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1869:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1869:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1869:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1870:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGoalReferenceAccess().getGoalReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleGoalReference3918); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalReferenceAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1879:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1880:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1880:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1881:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalReferenceAccess().getValueGoalCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalReference3941);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1902:1: entryRuleParenthesizedGoalExpression returns [EObject current=null] : iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF ;
    public final EObject entryRuleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1903:2: (iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1904:2: iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression3977);
            iv_ruleParenthesizedGoalExpression=ruleParenthesizedGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression3987); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1911:1: ruleParenthesizedGoalExpression returns [EObject current=null] : ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1914:28: ( ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:2: () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1916:5: 
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
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4037);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1929:1: ( (lv_value_2_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1930:1: (lv_value_2_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1930:1: (lv_value_2_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1931:3: lv_value_2_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedGoalExpressionAccess().getValueGoalExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4057);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4073);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1963:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1964:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1965:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4108);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression4118); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1972:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;

        EObject this_AppliedQuantitativePropertyExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1975:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1976:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1976:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            int alt26=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt26=1;
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
                alt26=2;
                }
                break;
            case 42:
                {
                alt26=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1977:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4165);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1987:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression4192);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1997:5: this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getAppliedQuantitativePropertyExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4219);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2013:1: entryRuleAppliedQuantitativePropertyExpression returns [EObject current=null] : iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF ;
    public final EObject entryRuleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativePropertyExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2014:2: (iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2015:2: iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4254);
            iv_ruleAppliedQuantitativePropertyExpression=ruleAppliedQuantitativePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4264); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2022:1: ruleAppliedQuantitativePropertyExpression returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2025:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2026:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2027:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getAppliedQuantitativePropertyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,42,FOLLOW_42_in_ruleAppliedQuantitativePropertyExpression4310); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2036:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2037:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2037:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2038:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getValueAppliedQuantitativePropertyCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4333);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2059:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2060:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2061:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4369);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4379); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2068:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2071:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2073:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression4425);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2089:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2090:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2091:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication4459);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication4469); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2098:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2101:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2102:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2102:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2103:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4516);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2111:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=53 && LA27_0<=54)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2111:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2111:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2112:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2117:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2118:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2118:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2119:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication4546);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2135:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2136:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2136:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2137:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4567);
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2161:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2162:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2163:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction4605);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction4615); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2170:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2173:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2174:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2174:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2175:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4662);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2183:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=47 && LA29_0<=50)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2183:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2183:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2184:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2189:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2190:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2190:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2191:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2191:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( ((LA28_0>=47 && LA28_0<=48)) ) {
            	        alt28=1;
            	    }
            	    else if ( ((LA28_0>=49 && LA28_0<=50)) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2192:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction4694);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2207:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction4713);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2225:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2226:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2226:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2227:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4737);
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
            	    break loop29;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2251:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2252:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2253:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction4775);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction4785); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2260:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2263:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2264:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2264:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2265:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4832);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2273:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=51 && LA30_0<=52)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2273:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2273:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2274:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2279:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2280:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2280:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2281:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction4862);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2297:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2298:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2298:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2299:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4883);
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2323:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2324:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2325:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison4921);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison4931); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2332:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2335:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2336:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2336:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2337:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison4978);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2345:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=55 && LA32_0<=57)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2345:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2345:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2346:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2351:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2352:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2352:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2353:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2353:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==55) ) {
            	        alt31=1;
            	    }
            	    else if ( ((LA31_0>=56 && LA31_0<=57)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2354:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison5010);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2369:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison5029);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2387:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2388:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2388:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2389:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison5053);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2413:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2414:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2415:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5091);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit5101); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2422:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2425:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2426:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2426:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 58:
            case 59:
                {
                alt33=1;
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
                alt33=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt33=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2427:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit5148);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2437:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5175);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2447:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5202);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2463:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2464:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2465:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation5237);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation5247); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2472:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2475:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2476:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2477:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2477:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2478:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation5293);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2494:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2495:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2495:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2496:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation5314);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2520:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2521:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2522:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5350);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression5360); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2529:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2532:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2533:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2533:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2534:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5407);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=60 && LA35_0<=63)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt34=4;
            	    switch ( input.LA(1) ) {
            	    case 60:
            	        {
            	        alt34=1;
            	        }
            	        break;
            	    case 61:
            	        {
            	        alt34=2;
            	        }
            	        break;
            	    case 63:
            	        {
            	        alt34=3;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt34=4;
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2542:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2543:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2548:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2549:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2549:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2550:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5439);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2567:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2567:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2567:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2567:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2568:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2573:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2574:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2574:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2575:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5477);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2592:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2593:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2598:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2599:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2599:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2600:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5515);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2617:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2618:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2623:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2624:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2624:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2625:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5553);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2641:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2642:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2642:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2643:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5576);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2667:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2668:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2669:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5614);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression5624); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2676:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2679:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2680:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2680:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt36=7;
            alt36 = dfa36.predict(input);
            switch (alt36) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2681:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5671);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2691:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5698);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2701:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5725);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2711:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression5752);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2721:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression5779);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2731:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5806);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2741:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5833);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2757:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2758:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2759:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5868);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression5878); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2766:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2769:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2771:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5924);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2787:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2788:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2789:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5958);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression5968); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2796:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2799:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2800:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2800:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2801:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6015);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2809:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=64 && LA38_0<=65)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2809:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2809:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2810:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2815:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2816:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2816:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2817:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2817:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt37=2;
            	    int LA37_0 = input.LA(1);

            	    if ( (LA37_0==65) ) {
            	        alt37=1;
            	    }
            	    else if ( (LA37_0==64) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2818:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6047);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2833:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6066);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2851:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2852:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2852:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2853:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6090);
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
    // $ANTLR end "ruleAdditiveExpression"


    // $ANTLR start "entryRuleMultiplicativeExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2877:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2878:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2879:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6128);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression6138); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2886:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2889:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2890:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2890:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2891:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6185);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2899:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==46||(LA40_0>=66 && LA40_0<=67)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2899:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2899:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2900:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2905:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2906:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2906:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2907:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2907:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt39=3;
            	    switch ( input.LA(1) ) {
            	    case 46:
            	        {
            	        alt39=1;
            	        }
            	        break;
            	    case 66:
            	        {
            	        alt39=2;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt39=3;
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2908:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6217);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2923:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6236);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2938:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6255);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2956:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2957:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2957:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2958:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6279);
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
    // $ANTLR end "ruleMultiplicativeExpression"


    // $ANTLR start "entryRuleNumberFunction"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2982:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2983:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2984:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6317);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction6327); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2991:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2994:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2995:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2995:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt41=8;
            switch ( input.LA(1) ) {
            case 68:
                {
                alt41=1;
                }
                break;
            case 69:
                {
                alt41=2;
                }
                break;
            case 70:
                {
                alt41=3;
                }
                break;
            case 71:
                {
                alt41=4;
                }
                break;
            case 72:
                {
                alt41=5;
                }
                break;
            case 73:
                {
                alt41=6;
                }
                break;
            case 74:
                {
                alt41=7;
                }
                break;
            case 75:
                {
                alt41=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2996:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6374);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3006:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6401);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3016:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction6428);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3026:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction6455);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3036:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6482);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3046:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6509);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3056:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6536);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3066:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6563);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3082:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3083:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3084:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6598);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction6608); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3091:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3094:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3095:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3095:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3095:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3095:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3096:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3096:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3097:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6654);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMaximumFunction6666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3117:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3118:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3118:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3119:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6687);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3135:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==20) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3135:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMaximumFunction6700); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3139:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3140:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3140:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3141:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6721);
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
            	    break loop42;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleMaximumFunction6735); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3169:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3170:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3171:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6771);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction6781); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3178:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3181:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3182:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3182:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3182:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3182:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3183:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3183:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3184:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction6827);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleMinimumFunction6839); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3204:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3205:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3205:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3206:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6860);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3222:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==20) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3222:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMinimumFunction6873); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3226:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3227:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3227:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3228:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6894);
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
            	    break loop43;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleMinimumFunction6908); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3256:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3257:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3258:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6944);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction6954); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3265:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3268:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3269:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3269:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3269:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3269:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3270:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3270:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3271:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction7000);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAverageFunction7012); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3291:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3292:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3292:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3293:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7033);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3309:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==20) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3309:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAverageFunction7046); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3313:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3314:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3314:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3315:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7067);
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
            	    break loop44;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleAverageFunction7081); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3343:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3344:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3345:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction7117);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction7127); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3352:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3355:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3356:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3356:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3356:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3356:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3357:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3357:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3358:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction7173);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleSumFunction7185); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3378:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3379:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3379:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3380:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7206);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3396:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==20) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3396:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSumFunction7219); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3400:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3401:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3401:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3402:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7240);
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
            	    break loop45;
                }
            } while (true);

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleSumFunction7254); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3430:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3431:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3432:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7290);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction7300); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3439:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3442:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3443:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3443:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3443:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3443:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3444:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3444:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3445:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7346);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleExponentialFunction7358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3465:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3466:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3466:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3467:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7379);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExponentialFunction7391); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3487:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3488:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3488:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3489:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7412);
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

            otherlv_5=(Token)match(input,44,FOLLOW_44_in_ruleExponentialFunction7424); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3517:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3518:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3519:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7460);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction7470); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3526:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3529:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3530:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3530:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3530:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3530:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3531:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3531:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3532:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7516);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleAbsoluteFunction7528); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3552:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3553:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3553:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3554:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7549);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleAbsoluteFunction7561); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3582:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3583:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3584:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7597);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7607); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3591:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3594:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3595:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3595:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3595:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3595:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3596:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3596:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3597:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7653);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleNaturalLogarithmFunction7665); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3617:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3618:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3618:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3619:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7686);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleNaturalLogarithmFunction7698); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3647:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3648:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3649:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7734);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7744); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3656:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3659:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3660:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3660:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3660:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3660:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3661:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3661:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3662:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7790);
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

            otherlv_1=(Token)match(input,43,FOLLOW_43_in_ruleCommonLogarithmFunction7802); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3682:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3683:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3683:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3684:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7823);
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

            otherlv_3=(Token)match(input,44,FOLLOW_44_in_ruleCommonLogarithmFunction7835); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3712:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3713:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3714:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7871);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7881); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3721:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3724:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3725:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3725:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3726:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7922);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3733:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3734:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3734:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3735:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7942);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7958);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3767:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3768:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3769:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7993);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification8003); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3776:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3779:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3780:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3780:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt46=3;
            alt46 = dfa46.predict(input);
            switch (alt46) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3781:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8050);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3791:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8077);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3801:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8104);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3817:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3818:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3819:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8139);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8149); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3826:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3829:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3830:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3831:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3831:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3832:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8197);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3845:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==19) ) {
                alt47=1;
            }
            else if ( (LA47_0==17) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3845:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3845:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3846:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3846:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3847:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8219);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3864:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3864:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3865:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3865:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3866:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8246);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3890:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3891:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3892:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection8283);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection8293); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3899:1: ruleCollection returns [EObject current=null] : (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_values_1_0 = null;

        EObject lv_values_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3902:28: ( (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3903:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3903:1: (otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3903:3: otherlv_0= '[' ( (lv_values_1_0= ruleValueSpecification ) ) (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleCollection8330); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3907:1: ( (lv_values_1_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3908:1: (lv_values_1_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3908:1: (lv_values_1_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3909:3: lv_values_1_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8351);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3925:2: (otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3925:4: otherlv_2= ',' ( (lv_values_3_0= ruleValueSpecification ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleCollection8364); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getCollectionAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3929:1: ( (lv_values_3_0= ruleValueSpecification ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3930:1: (lv_values_3_0= ruleValueSpecification )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3930:1: (lv_values_3_0= ruleValueSpecification )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3931:3: lv_values_3_0= ruleValueSpecification
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8385);
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
            	    break loop48;
                }
            } while (true);

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleCollection8399); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3959:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3960:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3961:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple8435);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple8445); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3968:1: ruleTuple returns [EObject current=null] : (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_tuples_1_0 = null;

        EObject lv_tuples_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3971:28: ( (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3972:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3972:1: (otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3972:3: otherlv_0= '{' ( (lv_tuples_1_0= rulePropertyValuePair ) ) (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleTuple8482); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3976:1: ( (lv_tuples_1_0= rulePropertyValuePair ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3977:1: (lv_tuples_1_0= rulePropertyValuePair )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3977:1: (lv_tuples_1_0= rulePropertyValuePair )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3978:3: lv_tuples_1_0= rulePropertyValuePair
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8503);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3994:2: (otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3994:4: otherlv_2= ',' ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    {
            	    otherlv_2=(Token)match(input,20,FOLLOW_20_in_ruleTuple8516); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getTupleAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3998:1: ( (lv_tuples_3_0= rulePropertyValuePair ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3999:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3999:1: (lv_tuples_3_0= rulePropertyValuePair )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4000:3: lv_tuples_3_0= rulePropertyValuePair
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8537);
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
            	    break loop49;
                }
            } while (true);

            otherlv_4=(Token)match(input,24,FOLLOW_24_in_ruleTuple8551); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4028:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4029:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4030:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8587);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair8597); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4037:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4040:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4041:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4041:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4041:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4041:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4042:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4042:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4043:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8645);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,45,FOLLOW_45_in_rulePropertyValuePair8657); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4060:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4061:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4061:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4062:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8678);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4086:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4087:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4088:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8714);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8724); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4095:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4098:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4099:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4099:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4100:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4100:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4101:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8771);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4122:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4123:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4124:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8806);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression8816); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4131:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4134:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4135:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4135:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt50=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt50=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt50=2;
                }
                break;
            case RULE_NULL:
                {
                alt50=3;
                }
                break;
            case RULE_STRING:
                {
                alt50=4;
                }
                break;
            case 46:
                {
                alt50=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4136:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8863);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4146:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8890);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4156:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8917);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4166:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8944);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4176:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8971);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4192:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4193:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4194:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9006);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9016); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4201:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4204:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4205:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4205:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4206:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4206:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4207:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9057); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4231:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4232:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4233:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9097);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9107); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4240:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4243:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4244:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4244:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4245:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4245:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4246:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral9152);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4270:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4271:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4272:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9187);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9197); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4279:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4282:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4283:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4283:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4284:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4284:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4285:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral9238); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4309:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4310:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4311:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9278);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9288); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4318:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4321:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4322:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4322:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4323:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4323:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4324:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9329); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4348:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4349:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4350:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9369);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral9379); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4357:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4360:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4361:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4361:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4362:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4362:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4363:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,46,FOLLOW_46_in_ruleUnlimitedLiteral9421); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4384:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4385:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4386:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator9469);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator9479); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4393:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4396:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4397:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4397:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4397:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4397:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4398:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4403:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==47) ) {
                alt51=1;
            }
            else if ( (LA51_0==48) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4403:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleOrOperator9526); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4408:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,48,FOLLOW_48_in_ruleOrOperator9544); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4420:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4421:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4422:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9581);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator9591); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4429:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4432:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4433:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4433:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4433:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4433:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4434:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4439:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==49) ) {
                alt52=1;
            }
            else if ( (LA52_0==50) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4439:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,49,FOLLOW_49_in_ruleXOrOperator9638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4444:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_50_in_ruleXOrOperator9656); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4456:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4457:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4458:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator9693);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator9703); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4465:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4468:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4469:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4469:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4469:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4469:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4470:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4475:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==51) ) {
                alt53=1;
            }
            else if ( (LA53_0==52) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4475:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,51,FOLLOW_51_in_ruleAndOperator9750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4480:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,52,FOLLOW_52_in_ruleAndOperator9768); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4492:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4493:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4494:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9805);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator9815); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4501:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4504:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4505:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4505:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4505:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4505:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4506:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4511:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==53) ) {
                alt54=1;
            }
            else if ( (LA54_0==54) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4511:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,53,FOLLOW_53_in_ruleImplicationOperator9862); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4516:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_54_in_ruleImplicationOperator9880); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4528:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4529:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4530:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9917);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator9927); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4537:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4540:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4541:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4541:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4541:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4541:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4542:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_55_in_ruleEqualsOperator9973); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4559:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4560:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4561:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10009);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator10019); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4568:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4571:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4572:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4572:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4572:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4572:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4573:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4578:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==56) ) {
                alt55=1;
            }
            else if ( (LA55_0==57) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4578:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleNotEqualsOperator10066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4583:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_57_in_ruleNotEqualsOperator10084); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4595:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4596:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4597:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator10121);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator10131); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4604:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4607:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4608:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4608:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4608:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4608:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4614:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==58) ) {
                alt56=1;
            }
            else if ( (LA56_0==59) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4614:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleNotOperator10178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4619:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleNotOperator10196); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4631:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4632:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4633:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10233);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator10243); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4640:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4643:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4644:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4644:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4644:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4644:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4645:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleGreaterThanOperator10289); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4662:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4663:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4664:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10325);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10335); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4671:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4674:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4675:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4675:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4675:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4675:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4676:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleGreaterOrEqualThanOperator10381); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4693:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4694:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4695:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10417);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator10427); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4702:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4705:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4706:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4706:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4706:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4706:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4707:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleLessThanOperator10473); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4724:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4725:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4726:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10509);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10519); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4733:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4736:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4737:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4737:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4737:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4737:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4738:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleLessOrEqualThanOperator10565); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4755:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4756:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4757:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10601);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator10611); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4764:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4767:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4768:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4768:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4768:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4768:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4769:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleAdditionOperator10657); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4786:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4787:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4788:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10693);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator10703); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4795:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4798:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4799:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4799:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4799:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4799:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4800:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleSubstractionOperator10749); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4817:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4818:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4819:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10785);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator10795); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4826:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4829:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4830:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4830:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4830:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4830:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4831:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_ruleMultiplicationOperator10841); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4848:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4849:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4850:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10877);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator10887); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4857:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4860:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4861:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4861:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4861:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4861:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4862:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleDivisionOperator10933); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4879:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4880:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4881:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10969);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator10979); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4888:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4891:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4892:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4892:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4892:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4892:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4893:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleModulusOperator11025); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4910:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4911:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4912:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11061);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator11071); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4919:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4922:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4923:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4923:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4923:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4923:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4924:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleMaxOperator11117); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4941:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4942:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4943:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator11153);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator11163); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4950:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4953:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4954:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4954:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4954:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4954:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4955:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleMinOperator11209); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4972:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4973:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4974:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11245);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator11255); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4981:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4984:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4985:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4985:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4985:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4985:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4986:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleAvgOperator11301); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5003:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5004:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5005:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator11337);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator11347); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5012:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5015:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5016:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5016:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5016:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5016:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5017:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleSumOperator11393); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5034:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5035:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5036:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11429);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator11439); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5043:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5046:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5047:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5047:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5047:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5047:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5048:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleExponentialOperator11485); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5065:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5066:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5067:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11521);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator11531); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5074:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5077:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5078:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5078:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5078:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5078:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5079:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleAbsoluteOperator11577); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5096:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5097:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5098:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11613);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11623); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5105:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5108:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5109:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5109:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5109:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5109:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5110:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleNaturalLogarithmOperator11669); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5127:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5128:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5129:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11705);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11715); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5136:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5139:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5140:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5140:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5140:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5140:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5141:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleCommonLogarithmOperator11761); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5158:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5159:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5160:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11798);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11809); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5167:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5170:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5172:2: kw= '('
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleLeftParenthesis11846); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5185:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5186:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5187:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11886);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis11897); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5194:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5197:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5199:2: kw= ')'
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleRightParenthesis11934); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5212:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5213:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5214:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11974);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11985); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5221:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5224:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5225:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5225:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5225:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5232:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==76) && (synpred1_InternalGML())) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5232:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5232:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5232:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,76,FOLLOW_76_in_ruleQualifiedName12053); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12069); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop57;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5255:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5256:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5257:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12117);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12128); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5264:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5267:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5268:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5268:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5269:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12175);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5279:1: (kw= '.*' )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==77) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5280:2: kw= '.*'
                    {
                    kw=(Token)match(input,77,FOLLOW_77_in_ruleQualifiedNameWithWildcard12194); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5297:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5298:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5299:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12240);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace12250); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5306:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5309:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5310:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5310:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5310:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,78,FOLLOW_78_in_ruleImportNamespace12287); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5315:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5315:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5316:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12308);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5340:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5341:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5342:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12345);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12356); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5349:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5352:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5353:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5353:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt59=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt59=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt59=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt59=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt59=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5353:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12396); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5361:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12422); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5369:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12448); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5377:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12474); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5392:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5393:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5394:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact12520);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact12531); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5401:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5404:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5405:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5405:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_SMALL_DECIMAL) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5405:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12571); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5413:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12597); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5430:1: ruleGoalKind returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) ;
    public final Enumerator ruleGoalKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5432:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5433:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5433:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            int alt61=3;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt61=1;
                }
                break;
            case 80:
                {
                alt61=2;
                }
                break;
            case 81:
                {
                alt61=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5433:2: (enumLiteral_0= 'required' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5433:2: (enumLiteral_0= 'required' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5433:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_79_in_ruleGoalKind12658); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5439:6: (enumLiteral_1= 'offered' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5439:6: (enumLiteral_1= 'offered' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5439:8: enumLiteral_1= 'offered'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_80_in_ruleGoalKind12675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5445:6: (enumLiteral_2= 'contract' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5445:6: (enumLiteral_2= 'contract' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5445:8: enumLiteral_2= 'contract'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_81_in_ruleGoalKind12692); if (state.failed) return current;
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
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5232:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5233:2: '.'
        {
        match(input,76,FOLLOW_76_in_synpred1_InternalGML12044); if (state.failed) return ;

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


    protected DFA36 dfa36 = new DFA36(this);
    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA36_eotS =
        "\13\uffff";
    static final String DFA36_eofS =
        "\2\uffff\1\10\7\uffff\1\10";
    static final String DFA36_minS =
        "\1\4\1\uffff\1\21\4\uffff\1\4\2\uffff\1\21";
    static final String DFA36_maxS =
        "\1\113\1\uffff\1\114\4\uffff\1\4\2\uffff\1\114";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\2\1\3\1\uffff";
    static final String DFA36_specialS =
        "\13\uffff}>";
    static final String[] DFA36_transitionS = {
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

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "2680:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA46_eotS =
        "\7\uffff";
    static final String DFA46_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA46_minS =
        "\1\4\1\uffff\1\21\1\4\2\uffff\1\21";
    static final String DFA46_maxS =
        "\1\56\1\uffff\1\114\1\4\2\uffff\1\114";
    static final String DFA46_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA46_specialS =
        "\7\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\2\7\1\42\uffff\1\1",
            "",
            "\1\4\1\uffff\1\4\2\5\2\uffff\1\5\63\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\uffff\1\4\2\5\2\uffff\1\5\63\uffff\1\3"
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "3780:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
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
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1904 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSoftGoal1916 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoal1937 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal1950 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSoftGoal1962 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleSoftGoal1974 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal1995 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal2008 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2029 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2043 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleSoftGoal2057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoalImpact2103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2151 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoalImpact2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_entryRuleHardGoal2208 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardGoal2218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleHardGoal2255 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHardGoal2272 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleHardGoal2289 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleHardGoal2301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleHardGoal2322 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2334 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleHardGoal2346 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHardGoal2363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2380 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleHardGoal2392 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleHardGoal2413 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoal2426 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleHardGoal2438 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2455 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleHardGoal2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2510 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeGoal2520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleCompositeGoal2557 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeGoal2574 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleCompositeGoal2591 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleCompositeGoal2603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000038000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleCompositeGoal2624 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoal2636 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCompositeGoal2648 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompositeGoal2665 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoal2682 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCompositeGoal2694 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2715 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCompositeGoal2727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2763 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalExpression2773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_ruleGoalExpression2819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2853 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalImplication2863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2910 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleGoalImplication2940 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication2961 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction2999 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalDisjunction3009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3056 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3088 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3107 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3131 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3169 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalConjunction3179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3226 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleGoalConjunction3256 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3277 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3315 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalComparison3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3372 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3404 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3423 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3447 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanUnit3495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalNegation3668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleGoalNegation3714 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_entryRuleGoalReference3862 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalReference3872 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleGoalReference3918 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalReference3941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression3977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4037 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4057 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4254 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleAppliedQuantitativePropertyExpression4310 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication4459 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication4469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4516 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication4546 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4567 = new BitSet(new long[]{0x0060000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction4605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction4615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4662 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction4694 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction4713 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4737 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction4775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4832 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction4862 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4883 = new BitSet(new long[]{0x0018000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison4921 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison4931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison4978 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison5010 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison5029 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison5053 = new BitSet(new long[]{0x0380000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5091 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit5101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit5148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation5237 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation5293 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation5314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5350 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression5360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5407 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5439 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5477 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5515 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5553 = new BitSet(new long[]{0x00004C0000000EF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5576 = new BitSet(new long[]{0xF000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression5624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression5752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression5779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6047 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6066 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6090 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6128 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression6138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6185 = new BitSet(new long[]{0x0000400000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6217 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6236 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6255 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6279 = new BitSet(new long[]{0x0000400000000002L,0x000000000000000CL});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6317 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction6327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction6428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction6455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6598 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction6608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6654 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMaximumFunction6666 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6687 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleMaximumFunction6700 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6721 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleMaximumFunction6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6771 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction6781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction6827 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleMinimumFunction6839 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6860 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleMinimumFunction6873 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6894 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleMinimumFunction6908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction6954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction7000 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAverageFunction7012 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7033 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleAverageFunction7046 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7067 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleAverageFunction7081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction7117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction7127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction7173 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSumFunction7185 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7206 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_20_in_ruleSumFunction7219 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7240 = new BitSet(new long[]{0x0000100000100000L});
    public static final BitSet FOLLOW_44_in_ruleSumFunction7254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7290 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction7300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7346 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleExponentialFunction7358 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7379 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExponentialFunction7391 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7412 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExponentialFunction7424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction7470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7516 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleAbsoluteFunction7528 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7549 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAbsoluteFunction7561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7597 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7653 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleNaturalLogarithmFunction7665 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7686 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNaturalLogarithmFunction7698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7734 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7744 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7790 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCommonLogarithmFunction7802 = new BitSet(new long[]{0x0000040000000CC0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7823 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommonLogarithmFunction7835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7871 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7881 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7922 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7942 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7993 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification8003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8139 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8197 = new BitSet(new long[]{0x00000000000A0000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection8283 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection8293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleCollection8330 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8351 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_20_in_ruleCollection8364 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8385 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_21_in_ruleCollection8399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple8435 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple8445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleTuple8482 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8503 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_20_in_ruleTuple8516 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8537 = new BitSet(new long[]{0x0000000001100000L});
    public static final BitSet FOLLOW_24_in_ruleTuple8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair8597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8645 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_rulePropertyValuePair8657 = new BitSet(new long[]{0x0C004C0000000FF0L,0x0000000000000FF0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8714 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression8816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9097 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral9152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral9238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral9379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleUnlimitedLiteral9421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator9469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator9479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleOrOperator9526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOrOperator9544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9581 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator9591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleXOrOperator9638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXOrOperator9656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator9693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator9703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleAndOperator9750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAndOperator9768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9805 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator9815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleImplicationOperator9862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicationOperator9880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9917 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator9927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleEqualsOperator9973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10009 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator10019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleNotEqualsOperator10066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNotEqualsOperator10084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator10121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator10131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNotOperator10178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNotOperator10196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10233 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator10243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleGreaterThanOperator10289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10325 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGreaterOrEqualThanOperator10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10417 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator10427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleLessThanOperator10473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLessOrEqualThanOperator10565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10601 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator10611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleAdditionOperator10657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10693 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator10703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleSubstractionOperator10749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10785 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator10795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleMultiplicationOperator10841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator10887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleDivisionOperator10933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator10979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleModulusOperator11025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator11071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleMaxOperator11117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator11153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator11163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleMinOperator11209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11245 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleAvgOperator11301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator11337 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator11347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleSumOperator11393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11429 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator11439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleExponentialOperator11485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator11531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleAbsoluteOperator11577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11613 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleNaturalLogarithmOperator11669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleCommonLogarithmOperator11761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleLeftParenthesis11846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis11897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleRightParenthesis11934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11974 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12025 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_ruleQualifiedName12053 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12069 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12175 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleQualifiedNameWithWildcard12194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12240 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace12250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleImportNamespace12287 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12345 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12396 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact12520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleGoalKind12658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGoalKind12675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGoalKind12692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_synpred1_InternalGML12044 = new BitSet(new long[]{0x0000000000000002L});

}