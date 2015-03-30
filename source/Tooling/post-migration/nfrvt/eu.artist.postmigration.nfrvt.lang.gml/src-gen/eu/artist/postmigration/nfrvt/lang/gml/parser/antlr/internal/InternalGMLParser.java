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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_EBOOLEAN", "RULE_NULL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_DATE_TIME", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'goalmodel'", "'{'", "'workloads'", "'['", "','", "']'", "'applied-properties'", "'goals'", "'}'", "'activity'", "'pattern'", "'qualitative'", "'property'", "'context'", "'quantitative'", "'function'", "'workload'", "'softgoal'", "'kind'", "'priority'", "'$'", "'threshold'", "'impacts'", "'hardgoal'", "'condition'", "'successRate'", "'composite'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'required'", "'offered'", "'contract'"
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
    public static final int RULE_ANY_OTHER=16;
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
    public static final int T__82=82;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_NULL=9;
    public static final int RULE_ML_COMMENT=13;
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
    public static final int RULE_DATE_TIME=12;
    public static final int RULE_EBOOLEAN=8;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;
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
        	return "ARTISTModel";	
       	}
       	
       	@Override
       	protected GMLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleARTISTModel"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:68:1: entryRuleARTISTModel returns [EObject current=null] : iv_ruleARTISTModel= ruleARTISTModel EOF ;
    public final EObject entryRuleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARTISTModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:69:2: (iv_ruleARTISTModel= ruleARTISTModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:70:2: iv_ruleARTISTModel= ruleARTISTModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getARTISTModelRule()); 
            }
            pushFollow(FOLLOW_ruleARTISTModel_in_entryRuleARTISTModel75);
            iv_ruleARTISTModel=ruleARTISTModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleARTISTModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleARTISTModel85); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleARTISTModel"


    // $ANTLR start "ruleARTISTModel"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:77:1: ruleARTISTModel returns [EObject current=null] : this_GoalModel_0= ruleGoalModel ;
    public final EObject ruleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject this_GoalModel_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:80:28: (this_GoalModel_0= ruleGoalModel )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:82:5: this_GoalModel_0= ruleGoalModel
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getARTISTModelAccess().getGoalModelParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalModel_in_ruleARTISTModel131);
            this_GoalModel_0=ruleGoalModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalModel_0; 
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
    // $ANTLR end "ruleARTISTModel"


    // $ANTLR start "entryRuleGoalModel"
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:98:1: entryRuleGoalModel returns [EObject current=null] : iv_ruleGoalModel= ruleGoalModel EOF ;
    public final EObject entryRuleGoalModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:99:2: (iv_ruleGoalModel= ruleGoalModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:100:2: iv_ruleGoalModel= ruleGoalModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalModelRule()); 
            }
            pushFollow(FOLLOW_ruleGoalModel_in_entryRuleGoalModel165);
            iv_ruleGoalModel=ruleGoalModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalModel175); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:107:1: ruleGoalModel returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:110:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:111:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:111:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:111:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'goalmodel' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'workloads' otherlv_5= '[' ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )? otherlv_9= ']' otherlv_10= 'applied-properties' otherlv_11= '[' ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )? otherlv_15= ']' otherlv_16= 'goals' otherlv_17= '[' ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )? otherlv_21= ']' otherlv_22= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:111:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==79) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:112:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:112:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:113:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_ruleGoalModel221);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleGoalModel234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalModelAccess().getGoalmodelKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:133:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:134:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:134:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:135:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalModelAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalModel255);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleGoalModel267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getGoalModelAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleGoalModel279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGoalModelAccess().getWorkloadsKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleGoalModel291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGoalModelAccess().getLeftSquareBracketKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:163:1: ( ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:163:2: ( (lv_workloads_6_0= ruleWorkload ) ) (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:163:2: ( (lv_workloads_6_0= ruleWorkload ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:164:1: (lv_workloads_6_0= ruleWorkload )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:164:1: (lv_workloads_6_0= ruleWorkload )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:165:3: lv_workloads_6_0= ruleWorkload
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGoalModelAccess().getWorkloadsWorkloadParserRuleCall_6_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleWorkload_in_ruleGoalModel313);
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

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:181:2: (otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==21) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:181:4: otherlv_7= ',' ( (lv_workloads_8_0= ruleWorkload ) )
                    	    {
                    	    otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleGoalModel326); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getGoalModelAccess().getCommaKeyword_6_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:185:1: ( (lv_workloads_8_0= ruleWorkload ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:186:1: (lv_workloads_8_0= ruleWorkload )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:186:1: (lv_workloads_8_0= ruleWorkload )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:187:3: lv_workloads_8_0= ruleWorkload
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getWorkloadsWorkloadParserRuleCall_6_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleWorkload_in_ruleGoalModel347);
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

            otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleGoalModel363); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getGoalModelAccess().getRightSquareBracketKeyword_7());
                  
            }
            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleGoalModel375); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getGoalModelAccess().getAppliedPropertiesKeyword_8());
                  
            }
            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleGoalModel387); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getGoalModelAccess().getLeftSquareBracketKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:215:1: ( ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28||LA5_0==31) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:215:2: ( (lv_appliedProperties_12_0= ruleAppliedProperty ) ) (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:215:2: ( (lv_appliedProperties_12_0= ruleAppliedProperty ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:216:1: (lv_appliedProperties_12_0= ruleAppliedProperty )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:216:1: (lv_appliedProperties_12_0= ruleAppliedProperty )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:217:3: lv_appliedProperties_12_0= ruleAppliedProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGoalModelAccess().getAppliedPropertiesAppliedPropertyParserRuleCall_10_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleAppliedProperty_in_ruleGoalModel409);
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

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:233:2: (otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==21) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:233:4: otherlv_13= ',' ( (lv_appliedProperties_14_0= ruleAppliedProperty ) )
                    	    {
                    	    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleGoalModel422); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getGoalModelAccess().getCommaKeyword_10_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:237:1: ( (lv_appliedProperties_14_0= ruleAppliedProperty ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:238:1: (lv_appliedProperties_14_0= ruleAppliedProperty )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:238:1: (lv_appliedProperties_14_0= ruleAppliedProperty )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:239:3: lv_appliedProperties_14_0= ruleAppliedProperty
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getAppliedPropertiesAppliedPropertyParserRuleCall_10_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleAppliedProperty_in_ruleGoalModel443);
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

            otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleGoalModel459); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getGoalModelAccess().getRightSquareBracketKeyword_11());
                  
            }
            otherlv_16=(Token)match(input,24,FOLLOW_24_in_ruleGoalModel471); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getGoalModelAccess().getGoalsKeyword_12());
                  
            }
            otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleGoalModel483); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getGoalModelAccess().getLeftSquareBracketKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:267:1: ( ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )* )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34||LA7_0==40||LA7_0==43) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:267:2: ( (lv_goals_18_0= ruleGoal ) ) (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:267:2: ( (lv_goals_18_0= ruleGoal ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:268:1: (lv_goals_18_0= ruleGoal )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:268:1: (lv_goals_18_0= ruleGoal )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:269:3: lv_goals_18_0= ruleGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getGoalModelAccess().getGoalsGoalParserRuleCall_14_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleGoal_in_ruleGoalModel505);
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

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:285:2: (otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==21) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:285:4: otherlv_19= ',' ( (lv_goals_20_0= ruleGoal ) )
                    	    {
                    	    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleGoalModel518); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getGoalModelAccess().getCommaKeyword_14_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:289:1: ( (lv_goals_20_0= ruleGoal ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:290:1: (lv_goals_20_0= ruleGoal )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:290:1: (lv_goals_20_0= ruleGoal )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:291:3: lv_goals_20_0= ruleGoal
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getGoalModelAccess().getGoalsGoalParserRuleCall_14_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleGoal_in_ruleGoalModel539);
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

            otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleGoalModel555); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_21, grammarAccess.getGoalModelAccess().getRightSquareBracketKeyword_15());
                  
            }
            otherlv_22=(Token)match(input,25,FOLLOW_25_in_ruleGoalModel567); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:323:1: entryRuleWorkload returns [EObject current=null] : iv_ruleWorkload= ruleWorkload EOF ;
    public final EObject entryRuleWorkload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkload = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:324:2: (iv_ruleWorkload= ruleWorkload EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:325:2: iv_ruleWorkload= ruleWorkload EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getWorkloadRule()); 
            }
            pushFollow(FOLLOW_ruleWorkload_in_entryRuleWorkload603);
            iv_ruleWorkload=ruleWorkload();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleWorkload; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleWorkload613); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:332:1: ruleWorkload returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:335:28: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:336:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:336:1: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:336:2: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= '{' otherlv_2= 'activity' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'pattern' ( (lv_pattern_6_0= RULE_STRING ) ) otherlv_7= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:336:2: ( (lv_name_0_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:337:1: (lv_name_0_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:337:1: (lv_name_0_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:338:3: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWorkload655); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleWorkload672); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getWorkloadAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleWorkload684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getWorkloadAccess().getActivityKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:362:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:363:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:363:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:364:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getWorkloadRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getWorkloadAccess().getActivityActivityCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleWorkload707);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,21,FOLLOW_21_in_ruleWorkload719); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getWorkloadAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,27,FOLLOW_27_in_ruleWorkload731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getWorkloadAccess().getPatternKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:385:1: ( (lv_pattern_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:386:1: (lv_pattern_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:386:1: (lv_pattern_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:387:3: lv_pattern_6_0= RULE_STRING
            {
            lv_pattern_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWorkload748); if (state.failed) return current;
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

            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleWorkload765); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:415:1: entryRuleAppliedProperty returns [EObject current=null] : iv_ruleAppliedProperty= ruleAppliedProperty EOF ;
    public final EObject entryRuleAppliedProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:416:2: (iv_ruleAppliedProperty= ruleAppliedProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:417:2: iv_ruleAppliedProperty= ruleAppliedProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedPropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedProperty_in_entryRuleAppliedProperty801);
            iv_ruleAppliedProperty=ruleAppliedProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedProperty811); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:424:1: ruleAppliedProperty returns [EObject current=null] : (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty ) ;
    public final EObject ruleAppliedProperty() throws RecognitionException {
        EObject current = null;

        EObject this_AppliedQualitativeProperty_0 = null;

        EObject this_AppliedQuantitativeProperty_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:427:28: ( (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:428:1: (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:428:1: (this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty | this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            else if ( (LA8_0==31) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:429:5: this_AppliedQualitativeProperty_0= ruleAppliedQualitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyAccess().getAppliedQualitativePropertyParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQualitativeProperty_in_ruleAppliedProperty858);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:439:5: this_AppliedQuantitativeProperty_1= ruleAppliedQuantitativeProperty
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyAccess().getAppliedQuantitativePropertyParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativeProperty_in_ruleAppliedProperty885);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:455:1: entryRuleAppliedQualitativeProperty returns [EObject current=null] : iv_ruleAppliedQualitativeProperty= ruleAppliedQualitativeProperty EOF ;
    public final EObject entryRuleAppliedQualitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQualitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:456:2: (iv_ruleAppliedQualitativeProperty= ruleAppliedQualitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:457:2: iv_ruleAppliedQualitativeProperty= ruleAppliedQualitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQualitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQualitativeProperty_in_entryRuleAppliedQualitativeProperty920);
            iv_ruleAppliedQualitativeProperty=ruleAppliedQualitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQualitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQualitativeProperty930); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:464:1: ruleAppliedQualitativeProperty returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:467:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:468:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:468:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:468:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleAppliedQualitativeProperty967); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQualitativePropertyAccess().getQualitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:472:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:473:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:473:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:474:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQualitativeProperty984); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAppliedQualitativeProperty1001); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQualitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQualitativeProperty1013); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQualitativePropertyAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:498:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:499:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:499:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:500:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getPropertyQualitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1036);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:513:2: (otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:513:4: otherlv_5= ',' otherlv_6= 'context' otherlv_7= '[' ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_11= ']'
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQualitativeProperty1049); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAppliedQualitativePropertyAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,30,FOLLOW_30_in_ruleAppliedQualitativeProperty1061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAppliedQualitativePropertyAccess().getContextKeyword_5_1());
                          
                    }
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativeProperty1073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getAppliedQualitativePropertyAccess().getLeftSquareBracketKeyword_5_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:525:1: ( ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==RULE_ID) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:525:2: ( ( ruleQualifiedName ) ) (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:525:2: ( ( ruleQualifiedName ) )
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:526:1: ( ruleQualifiedName )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:526:1: ( ruleQualifiedName )
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:527:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getContextNamedElementCrossReference_5_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1097);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:540:2: (otherlv_9= ',' ( ( ruleQualifiedName ) ) )*
                            loop9:
                            do {
                                int alt9=2;
                                int LA9_0 = input.LA(1);

                                if ( (LA9_0==21) ) {
                                    alt9=1;
                                }


                                switch (alt9) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:540:4: otherlv_9= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_9=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQualitativeProperty1110); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_9, grammarAccess.getAppliedQualitativePropertyAccess().getCommaKeyword_5_3_1_0());
                            	          
                            	    }
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:544:1: ( ( ruleQualifiedName ) )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:545:1: ( ruleQualifiedName )
                            	    {
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:545:1: ( ruleQualifiedName )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:546:3: ruleQualifiedName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyRule());
                            	      	        }
                            	              
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyAccess().getContextNamedElementCrossReference_5_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1133);
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

                    otherlv_11=(Token)match(input,22,FOLLOW_22_in_ruleAppliedQualitativeProperty1149); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAppliedQualitativePropertyAccess().getRightSquareBracketKeyword_5_4());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleAppliedQualitativeProperty1163); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:575:1: entryRuleAppliedQuantitativeProperty returns [EObject current=null] : iv_ruleAppliedQuantitativeProperty= ruleAppliedQuantitativeProperty EOF ;
    public final EObject entryRuleAppliedQuantitativeProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativeProperty = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:576:2: (iv_ruleAppliedQuantitativeProperty= ruleAppliedQuantitativeProperty EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:577:2: iv_ruleAppliedQuantitativeProperty= ruleAppliedQuantitativeProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativeProperty_in_entryRuleAppliedQuantitativeProperty1199);
            iv_ruleAppliedQuantitativeProperty=ruleAppliedQuantitativeProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativeProperty; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativeProperty1209); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:584:1: ruleAppliedQuantitativeProperty returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:587:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:588:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:588:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:588:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )? (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )? otherlv_18= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleAppliedQuantitativeProperty1246); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQuantitativePropertyAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:592:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:593:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:593:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:594:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQuantitativeProperty1263); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAppliedQuantitativeProperty1280); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQuantitativePropertyAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,29,FOLLOW_29_in_ruleAppliedQuantitativeProperty1292); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQuantitativePropertyAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:618:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:619:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:619:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:620:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getPropertyQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1315);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:633:2: (otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==21) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==32) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:633:4: otherlv_5= ',' otherlv_6= 'function' ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativeProperty1328); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,32,FOLLOW_32_in_ruleAppliedQuantitativeProperty1340); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:641:1: ( ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:642:1: ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:642:1: ( (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:643:1: (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:643:1: (lv_function_7_1= ruleMinOperator | lv_function_7_2= ruleMaxOperator | lv_function_7_3= ruleAvgOperator | lv_function_7_4= ruleSumOperator )
                    int alt12=4;
                    switch ( input.LA(1) ) {
                    case 70:
                        {
                        alt12=1;
                        }
                        break;
                    case 69:
                        {
                        alt12=2;
                        }
                        break;
                    case 71:
                        {
                        alt12=3;
                        }
                        break;
                    case 72:
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
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:644:3: lv_function_7_1= ruleMinOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionMinOperatorParserRuleCall_5_2_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMinOperator_in_ruleAppliedQuantitativeProperty1363);
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
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:659:8: lv_function_7_2= ruleMaxOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionMaxOperatorParserRuleCall_5_2_0_1()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleMaxOperator_in_ruleAppliedQuantitativeProperty1382);
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
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:674:8: lv_function_7_3= ruleAvgOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionAvgOperatorParserRuleCall_5_2_0_2()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAppliedQuantitativeProperty1401);
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
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:689:8: lv_function_7_4= ruleSumOperator
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getFunctionSumOperatorParserRuleCall_5_2_0_3()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleSumOperator_in_ruleAppliedQuantitativeProperty1420);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:707:4: (otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==30) ) {
                    alt16=1;
                }
            }
            switch (alt16) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:707:6: otherlv_8= ',' otherlv_9= 'context' otherlv_10= '[' ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_14= ']'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativeProperty1438); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_9=(Token)match(input,30,FOLLOW_30_in_ruleAppliedQuantitativeProperty1450); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getAppliedQuantitativePropertyAccess().getContextKeyword_6_1());
                          
                    }
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativeProperty1462); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAppliedQuantitativePropertyAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:719:1: ( ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:719:2: ( ( ruleQualifiedName ) ) (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:719:2: ( ( ruleQualifiedName ) )
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:720:1: ( ruleQualifiedName )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:720:1: ( ruleQualifiedName )
                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:721:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getContextNamedElementCrossReference_6_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1486);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:734:2: (otherlv_12= ',' ( ( ruleQualifiedName ) ) )*
                            loop14:
                            do {
                                int alt14=2;
                                int LA14_0 = input.LA(1);

                                if ( (LA14_0==21) ) {
                                    alt14=1;
                                }


                                switch (alt14) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:734:4: otherlv_12= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativeProperty1499); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_12, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_6_3_1_0());
                            	          
                            	    }
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:738:1: ( ( ruleQualifiedName ) )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:739:1: ( ruleQualifiedName )
                            	    {
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:739:1: ( ruleQualifiedName )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:740:3: ruleQualifiedName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
                            	      	        }
                            	              
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getContextNamedElementCrossReference_6_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1522);
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

                    otherlv_14=(Token)match(input,22,FOLLOW_22_in_ruleAppliedQuantitativeProperty1538); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getAppliedQuantitativePropertyAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:757:3: (otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==21) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:757:5: otherlv_15= ',' otherlv_16= 'workload' ( ( ruleQualifiedName ) )
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleAppliedQuantitativeProperty1553); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getAppliedQuantitativePropertyAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_16=(Token)match(input,33,FOLLOW_33_in_ruleAppliedQuantitativeProperty1565); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadKeyword_7_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:765:1: ( ( ruleQualifiedName ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:766:1: ( ruleQualifiedName )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:766:1: ( ruleQualifiedName )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:767:3: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyAccess().getWorkloadWorkloadCrossReference_7_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1588);
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

            otherlv_18=(Token)match(input,25,FOLLOW_25_in_ruleAppliedQuantitativeProperty1602); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:792:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:793:2: (iv_ruleGoal= ruleGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:794:2: iv_ruleGoal= ruleGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalRule()); 
            }
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1638);
            iv_ruleGoal=ruleGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1648); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:801:1: ruleGoal returns [EObject current=null] : (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        EObject this_SoftGoal_0 = null;

        EObject this_HardGoal_1 = null;

        EObject this_CompositeGoal_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:804:28: ( (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:805:1: (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:805:1: (this_SoftGoal_0= ruleSoftGoal | this_HardGoal_1= ruleHardGoal | this_CompositeGoal_2= ruleCompositeGoal )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt18=1;
                }
                break;
            case 40:
                {
                alt18=2;
                }
                break;
            case 43:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:806:5: this_SoftGoal_0= ruleSoftGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getSoftGoalParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSoftGoal_in_ruleGoal1695);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:816:5: this_HardGoal_1= ruleHardGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getHardGoalParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHardGoal_in_ruleGoal1722);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:826:5: this_CompositeGoal_2= ruleCompositeGoal
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalAccess().getCompositeGoalParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeGoal_in_ruleGoal1749);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:842:1: entryRuleSoftGoal returns [EObject current=null] : iv_ruleSoftGoal= ruleSoftGoal EOF ;
    public final EObject entryRuleSoftGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:843:2: (iv_ruleSoftGoal= ruleSoftGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:844:2: iv_ruleSoftGoal= ruleSoftGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoal_in_entryRuleSoftGoal1784);
            iv_ruleSoftGoal=ruleSoftGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoal1794); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:851:1: ruleSoftGoal returns [EObject current=null] : (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:854:28: ( (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:855:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:855:1: (otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:855:3: otherlv_0= 'softgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'property' otherlv_10= '$' ( ( ruleQualifiedName ) ) otherlv_12= ',' otherlv_13= 'threshold' ( (lv_threshold_14_0= ruleImpact ) ) (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )? otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_34_in_ruleSoftGoal1831); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSoftGoalAccess().getSoftgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:859:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:860:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:860:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:861:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftGoal1848); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSoftGoal1865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSoftGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleSoftGoal1877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSoftGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:885:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:886:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:886:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:887:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleSoftGoal1898);
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal1910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSoftGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleSoftGoal1922); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSoftGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:911:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:912:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:912:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:913:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSoftGoal1939); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal1956); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSoftGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleSoftGoal1968); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSoftGoalAccess().getPropertyKeyword_9());
                  
            }
            otherlv_10=(Token)match(input,37,FOLLOW_37_in_ruleSoftGoal1980); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getSoftGoalAccess().getDollarSignKeyword_10());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:941:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:942:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:942:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:943:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getPropertyAppliedQualitativePropertyCrossReference_11_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoal2003);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2015); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSoftGoalAccess().getCommaKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,38,FOLLOW_38_in_ruleSoftGoal2027); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getSoftGoalAccess().getThresholdKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:964:1: ( (lv_threshold_14_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:965:1: (lv_threshold_14_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:965:1: (lv_threshold_14_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:966:3: lv_threshold_14_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalAccess().getThresholdImpactParserRuleCall_14_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoal2048);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:982:2: (otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==21) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:982:4: otherlv_15= ',' otherlv_16= 'impacts' otherlv_17= '[' ( (lv_impacts_18_0= ruleSoftGoalImpact ) ) (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )* otherlv_21= ']'
                    {
                    otherlv_15=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2061); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getSoftGoalAccess().getCommaKeyword_15_0());
                          
                    }
                    otherlv_16=(Token)match(input,39,FOLLOW_39_in_ruleSoftGoal2073); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getSoftGoalAccess().getImpactsKeyword_15_1());
                          
                    }
                    otherlv_17=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoal2085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getSoftGoalAccess().getLeftSquareBracketKeyword_15_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:994:1: ( (lv_impacts_18_0= ruleSoftGoalImpact ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:995:1: (lv_impacts_18_0= ruleSoftGoalImpact )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:995:1: (lv_impacts_18_0= ruleSoftGoalImpact )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:996:3: lv_impacts_18_0= ruleSoftGoalImpact
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_15_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2106);
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

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1012:2: (otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==21) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1012:4: otherlv_19= ',' ( (lv_impacts_20_0= ruleSoftGoalImpact ) )
                    	    {
                    	    otherlv_19=(Token)match(input,21,FOLLOW_21_in_ruleSoftGoal2119); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_19, grammarAccess.getSoftGoalAccess().getCommaKeyword_15_4_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1016:1: ( (lv_impacts_20_0= ruleSoftGoalImpact ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1017:1: (lv_impacts_20_0= ruleSoftGoalImpact )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1017:1: (lv_impacts_20_0= ruleSoftGoalImpact )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1018:3: lv_impacts_20_0= ruleSoftGoalImpact
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getSoftGoalAccess().getImpactsSoftGoalImpactParserRuleCall_15_4_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2140);
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

                    otherlv_21=(Token)match(input,22,FOLLOW_22_in_ruleSoftGoal2154); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getSoftGoalAccess().getRightSquareBracketKeyword_15_5());
                          
                    }

                    }
                    break;

            }

            otherlv_22=(Token)match(input,25,FOLLOW_25_in_ruleSoftGoal2168); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1050:1: entryRuleSoftGoalImpact returns [EObject current=null] : iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF ;
    public final EObject entryRuleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoalImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1051:2: (iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1052:2: iv_ruleSoftGoalImpact= ruleSoftGoalImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalImpactRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2204);
            iv_ruleSoftGoalImpact=ruleSoftGoalImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoalImpact; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoalImpact2214); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1059:1: ruleSoftGoalImpact returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) ;
    public final EObject ruleSoftGoalImpact() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_impact_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1062:28: ( ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1063:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1063:1: ( ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1063:2: ( ( ruleQualifiedName ) ) ( (lv_impact_1_0= ruleImpact ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1063:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1064:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1064:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1065:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalImpactRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getTargetSoftGoalCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2262);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1078:2: ( (lv_impact_1_0= ruleImpact ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:1: (lv_impact_1_0= ruleImpact )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1079:1: (lv_impact_1_0= ruleImpact )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1080:3: lv_impact_1_0= ruleImpact
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalImpactAccess().getImpactImpactParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleImpact_in_ruleSoftGoalImpact2283);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1104:1: entryRuleHardGoal returns [EObject current=null] : iv_ruleHardGoal= ruleHardGoal EOF ;
    public final EObject entryRuleHardGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1105:2: (iv_ruleHardGoal= ruleHardGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1106:2: iv_ruleHardGoal= ruleHardGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardGoalRule()); 
            }
            pushFollow(FOLLOW_ruleHardGoal_in_entryRuleHardGoal2319);
            iv_ruleHardGoal=ruleHardGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardGoal2329); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1113:1: ruleHardGoal returns [EObject current=null] : (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1116:28: ( (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1117:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1117:1: (otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1117:3: otherlv_0= 'hardgoal' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleExpression ) ) (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_40_in_ruleHardGoal2366); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHardGoalAccess().getHardgoalKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1121:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1122:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1122:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1123:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHardGoal2383); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleHardGoal2400); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHardGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleHardGoal2412); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHardGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1147:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1148:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1148:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1149:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleHardGoal2433);
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleHardGoal2445); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHardGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleHardGoal2457); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHardGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1173:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1174:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1174:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1175:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleHardGoal2474); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleHardGoal2491); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getHardGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleHardGoal2503); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHardGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1199:1: ( (lv_condition_10_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1200:1: (lv_condition_10_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1200:1: (lv_condition_10_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1201:3: lv_condition_10_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalAccess().getConditionExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleHardGoal2524);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1217:2: (otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==21) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1217:4: otherlv_11= ',' otherlv_12= 'successRate' ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    {
                    otherlv_11=(Token)match(input,21,FOLLOW_21_in_ruleHardGoal2537); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getHardGoalAccess().getCommaKeyword_11_0());
                          
                    }
                    otherlv_12=(Token)match(input,42,FOLLOW_42_in_ruleHardGoal2549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getHardGoalAccess().getSuccessRateKeyword_11_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1225:1: ( (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1226:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1226:1: (lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1227:3: lv_successRate_13_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    lv_successRate_13_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2566); if (state.failed) return current;
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

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleHardGoal2585); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1255:1: entryRuleCompositeGoal returns [EObject current=null] : iv_ruleCompositeGoal= ruleCompositeGoal EOF ;
    public final EObject entryRuleCompositeGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeGoal = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1256:2: (iv_ruleCompositeGoal= ruleCompositeGoal EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1257:2: iv_ruleCompositeGoal= ruleCompositeGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeGoalRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2621);
            iv_ruleCompositeGoal=ruleCompositeGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeGoal2631); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1264:1: ruleCompositeGoal returns [EObject current=null] : (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1267:28: ( (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1268:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1268:1: (otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1268:3: otherlv_0= 'composite' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'kind' ( (lv_kind_4_0= ruleGoalKind ) ) otherlv_5= ',' otherlv_6= 'priority' ( (lv_priority_7_0= RULE_INT ) ) otherlv_8= ',' otherlv_9= 'condition' ( (lv_condition_10_0= ruleGoalExpression ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_43_in_ruleCompositeGoal2668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeGoalAccess().getCompositeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1272:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1273:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1273:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1274:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeGoal2685); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleCompositeGoal2702); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeGoalAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,35,FOLLOW_35_in_ruleCompositeGoal2714); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeGoalAccess().getKindKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1298:1: ( (lv_kind_4_0= ruleGoalKind ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1299:1: (lv_kind_4_0= ruleGoalKind )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1299:1: (lv_kind_4_0= ruleGoalKind )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1300:3: lv_kind_4_0= ruleGoalKind
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getKindGoalKindEnumRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalKind_in_ruleCompositeGoal2735);
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

            otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleCompositeGoal2747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCompositeGoalAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,36,FOLLOW_36_in_ruleCompositeGoal2759); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeGoalAccess().getPriorityKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1324:1: ( (lv_priority_7_0= RULE_INT ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1325:1: (lv_priority_7_0= RULE_INT )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1325:1: (lv_priority_7_0= RULE_INT )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1326:3: lv_priority_7_0= RULE_INT
            {
            lv_priority_7_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleCompositeGoal2776); if (state.failed) return current;
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

            otherlv_8=(Token)match(input,21,FOLLOW_21_in_ruleCompositeGoal2793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeGoalAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,41,FOLLOW_41_in_ruleCompositeGoal2805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeGoalAccess().getConditionKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1350:1: ( (lv_condition_10_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1351:1: (lv_condition_10_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1351:1: (lv_condition_10_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1352:3: lv_condition_10_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalAccess().getConditionGoalExpressionParserRuleCall_10_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2826);
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

            otherlv_11=(Token)match(input,25,FOLLOW_25_in_ruleCompositeGoal2838); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1380:1: entryRuleGoalExpression returns [EObject current=null] : iv_ruleGoalExpression= ruleGoalExpression EOF ;
    public final EObject entryRuleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1381:2: (iv_ruleGoalExpression= ruleGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1382:2: iv_ruleGoalExpression= ruleGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2874);
            iv_ruleGoalExpression=ruleGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalExpression2884); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1389:1: ruleGoalExpression returns [EObject current=null] : this_GoalImplication_0= ruleGoalImplication ;
    public final EObject ruleGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject this_GoalImplication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1392:28: (this_GoalImplication_0= ruleGoalImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1394:5: this_GoalImplication_0= ruleGoalImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalExpressionAccess().getGoalImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_ruleGoalExpression2930);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1410:1: entryRuleGoalImplication returns [EObject current=null] : iv_ruleGoalImplication= ruleGoalImplication EOF ;
    public final EObject entryRuleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1411:2: (iv_ruleGoalImplication= ruleGoalImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1412:2: iv_ruleGoalImplication= ruleGoalImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2964);
            iv_ruleGoalImplication=ruleGoalImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalImplication2974); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1419:1: ruleGoalImplication returns [EObject current=null] : (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) ;
    public final EObject ruleGoalImplication() throws RecognitionException {
        EObject current = null;

        EObject this_GoalDisjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1422:28: ( (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1423:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1423:1: (this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1424:5: this_GoalDisjunction_0= ruleGoalDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalImplicationAccess().getGoalDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3021);
            this_GoalDisjunction_0=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalDisjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1432:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=54 && LA22_0<=55)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1432:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1432:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1433:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalImplicationAccess().getGoalImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1438:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1439:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1439:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1440:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleGoalImplication3051);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1456:2: ( (lv_right_3_0= ruleGoalDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1457:1: (lv_right_3_0= ruleGoalDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1457:1: (lv_right_3_0= ruleGoalDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1458:3: lv_right_3_0= ruleGoalDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalImplicationAccess().getRightGoalDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3072);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1482:1: entryRuleGoalDisjunction returns [EObject current=null] : iv_ruleGoalDisjunction= ruleGoalDisjunction EOF ;
    public final EObject entryRuleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1483:2: (iv_ruleGoalDisjunction= ruleGoalDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1484:2: iv_ruleGoalDisjunction= ruleGoalDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction3110);
            iv_ruleGoalDisjunction=ruleGoalDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalDisjunction3120); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1491:1: ruleGoalDisjunction returns [EObject current=null] : (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) ;
    public final EObject ruleGoalDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalConjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1494:28: ( (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1495:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1495:1: (this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1496:5: this_GoalConjunction_0= ruleGoalConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getGoalConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3167);
            this_GoalConjunction_0=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalConjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1504:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=48 && LA24_0<=51)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1504:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleGoalConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1504:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1505:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalDisjunctionAccess().getGoalDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1510:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1511:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1511:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1512:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1512:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( ((LA23_0>=48 && LA23_0<=49)) ) {
            	        alt23=1;
            	    }
            	    else if ( ((LA23_0>=50 && LA23_0<=51)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1513:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3199);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1528:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3218);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1546:2: ( (lv_right_3_0= ruleGoalConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1547:1: (lv_right_3_0= ruleGoalConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1547:1: (lv_right_3_0= ruleGoalConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1548:3: lv_right_3_0= ruleGoalConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalDisjunctionAccess().getRightGoalConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3242);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1572:1: entryRuleGoalConjunction returns [EObject current=null] : iv_ruleGoalConjunction= ruleGoalConjunction EOF ;
    public final EObject entryRuleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1573:2: (iv_ruleGoalConjunction= ruleGoalConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1574:2: iv_ruleGoalConjunction= ruleGoalConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3280);
            iv_ruleGoalConjunction=ruleGoalConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalConjunction3290); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1581:1: ruleGoalConjunction returns [EObject current=null] : (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) ;
    public final EObject ruleGoalConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_GoalComparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1584:28: ( (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1585:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1585:1: (this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1586:5: this_GoalComparison_0= ruleGoalComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalConjunctionAccess().getGoalComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3337);
            this_GoalComparison_0=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalComparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1594:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=52 && LA25_0<=53)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1594:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleGoalComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1594:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1595:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalConjunctionAccess().getGoalConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1600:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1601:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1601:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1602:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleGoalConjunction3367);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1618:2: ( (lv_right_3_0= ruleGoalComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1619:1: (lv_right_3_0= ruleGoalComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1619:1: (lv_right_3_0= ruleGoalComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1620:3: lv_right_3_0= ruleGoalComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalConjunctionAccess().getRightGoalComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3388);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1644:1: entryRuleGoalComparison returns [EObject current=null] : iv_ruleGoalComparison= ruleGoalComparison EOF ;
    public final EObject entryRuleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1645:2: (iv_ruleGoalComparison= ruleGoalComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1646:2: iv_ruleGoalComparison= ruleGoalComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3426);
            iv_ruleGoalComparison=ruleGoalComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalComparison3436); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1653:1: ruleGoalComparison returns [EObject current=null] : (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) ;
    public final EObject ruleGoalComparison() throws RecognitionException {
        EObject current = null;

        EObject this_GoalBooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1656:28: ( (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1657:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1657:1: (this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1658:5: this_GoalBooleanUnit_0= ruleGoalBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getGoalComparisonAccess().getGoalBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3483);
            this_GoalBooleanUnit_0=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_GoalBooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1666:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=56 && LA27_0<=58)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1666:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1666:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1667:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getGoalComparisonAccess().getGoalComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1672:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1673:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1673:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1674:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1674:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt26=2;
            	    int LA26_0 = input.LA(1);

            	    if ( (LA26_0==56) ) {
            	        alt26=1;
            	    }
            	    else if ( ((LA26_0>=57 && LA26_0<=58)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1675:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3515);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1690:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3534);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1708:2: ( (lv_right_3_0= ruleGoalBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1709:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1709:1: (lv_right_3_0= ruleGoalBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1710:3: lv_right_3_0= ruleGoalBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalComparisonAccess().getRightGoalBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3558);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1734:1: entryRuleGoalBooleanUnit returns [EObject current=null] : iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF ;
    public final EObject entryRuleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1735:2: (iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1736:2: iv_ruleGoalBooleanUnit= ruleGoalBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3596);
            iv_ruleGoalBooleanUnit=ruleGoalBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanUnit3606); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1743:1: ruleGoalBooleanUnit returns [EObject current=null] : (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) ;
    public final EObject ruleGoalBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_GoalNegation_0 = null;

        EObject this_GoalBooleanLiteral_1 = null;

        EObject this_GoalReference_2 = null;

        EObject this_ParenthesizedGoalExpression_3 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1746:28: ( (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1747:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1747:1: (this_GoalNegation_0= ruleGoalNegation | this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral | this_GoalReference_2= ruleGoalReference | this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression )
            int alt28=4;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
                {
                alt28=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt28=2;
                }
                break;
            case 37:
                {
                alt28=3;
                }
                break;
            case 44:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1748:5: this_GoalNegation_0= ruleGoalNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3653);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1758:5: this_GoalBooleanLiteral_1= ruleGoalBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3680);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1768:5: this_GoalReference_2= ruleGoalReference
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getGoalReferenceParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3707);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1778:5: this_ParenthesizedGoalExpression_3= ruleParenthesizedGoalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalBooleanUnitAccess().getParenthesizedGoalExpressionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3734);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1794:1: entryRuleGoalNegation returns [EObject current=null] : iv_ruleGoalNegation= ruleGoalNegation EOF ;
    public final EObject entryRuleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1795:2: (iv_ruleGoalNegation= ruleGoalNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1796:2: iv_ruleGoalNegation= ruleGoalNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalNegationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3769);
            iv_ruleGoalNegation=ruleGoalNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalNegation3779); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1803:1: ruleGoalNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) ;
    public final EObject ruleGoalNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1806:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1807:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1807:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1807:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1807:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1808:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1808:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1809:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleGoalNegation3825);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1825:2: ( (lv_value_1_0= ruleGoalBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1826:1: (lv_value_1_0= ruleGoalBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1826:1: (lv_value_1_0= ruleGoalBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1827:3: lv_value_1_0= ruleGoalBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalNegationAccess().getValueGoalBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3846);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1851:1: entryRuleGoalBooleanLiteral returns [EObject current=null] : iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF ;
    public final EObject entryRuleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1852:2: (iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1853:2: iv_ruleGoalBooleanLiteral= ruleGoalBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3882);
            iv_ruleGoalBooleanLiteral=ruleGoalBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3892); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1860:1: ruleGoalBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleGoalBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1863:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1864:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1864:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1865:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1865:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1866:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3933); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1890:1: entryRuleGoalReference returns [EObject current=null] : iv_ruleGoalReference= ruleGoalReference EOF ;
    public final EObject entryRuleGoalReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalReference = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1891:2: (iv_ruleGoalReference= ruleGoalReference EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1892:2: iv_ruleGoalReference= ruleGoalReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleGoalReference_in_entryRuleGoalReference3973);
            iv_ruleGoalReference=ruleGoalReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalReference3983); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1899:1: ruleGoalReference returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleGoalReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1902:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1903:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1903:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1903:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1903:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1904:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGoalReferenceAccess().getGoalReferenceAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleGoalReference4029); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalReferenceAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1913:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1914:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1914:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1915:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalReferenceAccess().getValueGoalCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalReference4052);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1936:1: entryRuleParenthesizedGoalExpression returns [EObject current=null] : iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF ;
    public final EObject entryRuleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedGoalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1937:2: (iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1938:2: iv_ruleParenthesizedGoalExpression= ruleParenthesizedGoalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedGoalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression4088);
            iv_ruleParenthesizedGoalExpression=ruleParenthesizedGoalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedGoalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression4098); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1945:1: ruleParenthesizedGoalExpression returns [EObject current=null] : ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedGoalExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1948:28: ( ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1949:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1949:1: ( () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1949:2: () ruleLeftParenthesis ( (lv_value_2_0= ruleGoalExpression ) ) ruleRightParenthesis
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1949:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1950:5: 
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
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4148);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1963:1: ( (lv_value_2_0= ruleGoalExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1964:1: (lv_value_2_0= ruleGoalExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1964:1: (lv_value_2_0= ruleGoalExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1965:3: lv_value_2_0= ruleGoalExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedGoalExpressionAccess().getValueGoalExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4168);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4184);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1997:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1998:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:1999:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4219);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression4229); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2006:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;

        EObject this_AppliedQuantitativePropertyExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2009:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2010:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2010:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction | this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression )
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
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
                {
                alt29=2;
                }
                break;
            case 37:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2011:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4276);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2021:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression4303);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2031:5: this_AppliedQuantitativePropertyExpression_2= ruleAppliedQuantitativePropertyExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getAppliedQuantitativePropertyExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4330);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2047:1: entryRuleAppliedQuantitativePropertyExpression returns [EObject current=null] : iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF ;
    public final EObject entryRuleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativePropertyExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2048:2: (iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2049:2: iv_ruleAppliedQuantitativePropertyExpression= ruleAppliedQuantitativePropertyExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4365);
            iv_ruleAppliedQuantitativePropertyExpression=ruleAppliedQuantitativePropertyExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativePropertyExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4375); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2056:1: ruleAppliedQuantitativePropertyExpression returns [EObject current=null] : ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleAppliedQuantitativePropertyExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2059:28: ( ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2060:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2060:1: ( () otherlv_1= '$' ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2060:2: () otherlv_1= '$' ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2060:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2061:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getAppliedQuantitativePropertyExpressionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleAppliedQuantitativePropertyExpression4421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getDollarSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2070:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2071:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2071:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2072:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyExpressionAccess().getValueAppliedQuantitativePropertyCrossReference_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4444);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2093:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2094:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2095:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4480);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4490); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2102:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2105:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2107:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression4536);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2123:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2124:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2125:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication4570);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication4580); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2132:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2135:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2136:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2136:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2137:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4627);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2145:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=54 && LA30_0<=55)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2145:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2145:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2146:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2151:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2152:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2152:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2153:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication4657);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2169:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2170:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2170:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2171:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4678);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2195:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2196:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2197:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction4716);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction4726); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2204:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2207:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2208:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2208:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2209:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4773);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2217:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=48 && LA32_0<=51)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2217:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2217:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2218:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2223:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2224:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2224:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2225:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2225:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( ((LA31_0>=48 && LA31_0<=49)) ) {
            	        alt31=1;
            	    }
            	    else if ( ((LA31_0>=50 && LA31_0<=51)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2226:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction4805);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2241:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction4824);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2259:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2260:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2260:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2261:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4848);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2285:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2286:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2287:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction4886);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction4896); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2294:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2297:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2298:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2298:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2299:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4943);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2307:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=52 && LA33_0<=53)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2307:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2307:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2308:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2313:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2314:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2314:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2315:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction4973);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2331:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2332:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2332:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2333:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4994);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2357:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2358:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2359:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison5032);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison5042); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2366:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2369:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2370:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2370:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2371:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison5089);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2379:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=56 && LA35_0<=58)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2379:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2379:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2380:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2385:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2386:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2386:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2387:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2387:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==56) ) {
            	        alt34=1;
            	    }
            	    else if ( ((LA34_0>=57 && LA34_0<=58)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2388:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison5121);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2403:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison5140);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2421:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2422:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2422:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2423:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison5164);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2447:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2448:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2449:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5202);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit5212); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2456:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2459:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2460:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2460:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 59:
            case 60:
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
            case 37:
            case 44:
            case 47:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2461:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit5259);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2471:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5286);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2481:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5313);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2497:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2498:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2499:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation5348);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation5358); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2506:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2509:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2510:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2510:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2510:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2510:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2511:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2511:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2512:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation5404);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2528:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2529:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2529:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2530:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation5425);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2554:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2555:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2556:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5461);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression5471); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2563:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2566:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2567:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2567:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2568:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5518);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=61 && LA38_0<=64)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt37=4;
            	    switch ( input.LA(1) ) {
            	    case 61:
            	        {
            	        alt37=1;
            	        }
            	        break;
            	    case 62:
            	        {
            	        alt37=2;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt37=3;
            	        }
            	        break;
            	    case 63:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2576:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2577:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2582:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2583:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2583:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2584:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5550);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2601:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2601:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2601:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2601:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2602:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2607:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2608:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2608:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2609:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5588);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2626:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2626:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2626:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2626:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2627:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2632:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2633:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2633:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2634:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5626);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2651:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2651:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2651:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2651:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2652:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2657:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2658:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2658:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2659:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5664);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2675:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2676:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2676:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2677:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5687);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2701:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2702:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2703:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5725);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression5735); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2710:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2713:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2714:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2714:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt39=7;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2715:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5782);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2725:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5809);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2735:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5836);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2745:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression5863);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2755:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression5890);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2765:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5917);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2775:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5944);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2791:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2792:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2793:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5979);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression5989); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2800:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2803:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2805:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression6035);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2821:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2822:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2823:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6069);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression6079); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2830:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2833:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2834:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2834:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2835:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6126);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2843:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( ((LA41_0>=65 && LA41_0<=66)) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2843:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2843:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2844:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2849:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2850:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2850:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2851:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2851:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt40=2;
            	    int LA40_0 = input.LA(1);

            	    if ( (LA40_0==66) ) {
            	        alt40=1;
            	    }
            	    else if ( (LA40_0==65) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2852:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6158);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2867:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6177);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2885:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2886:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2886:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2887:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6201);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2911:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2912:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2913:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6239);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression6249); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2920:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2923:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2924:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2924:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2925:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6296);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2933:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==47||(LA43_0>=67 && LA43_0<=68)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2933:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2933:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2934:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2939:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2940:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2940:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2941:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2941:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt42=3;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	        {
            	        alt42=1;
            	        }
            	        break;
            	    case 67:
            	        {
            	        alt42=2;
            	        }
            	        break;
            	    case 68:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2942:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6328);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2957:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6347);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2972:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6366);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2990:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2991:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2991:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:2992:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6390);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3016:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3017:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3018:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6428);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction6438); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3025:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3028:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3029:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3029:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt44=8;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt44=1;
                }
                break;
            case 70:
                {
                alt44=2;
                }
                break;
            case 71:
                {
                alt44=3;
                }
                break;
            case 72:
                {
                alt44=4;
                }
                break;
            case 73:
                {
                alt44=5;
                }
                break;
            case 74:
                {
                alt44=6;
                }
                break;
            case 75:
                {
                alt44=7;
                }
                break;
            case 76:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3030:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6485);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3040:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6512);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3050:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction6539);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3060:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction6566);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3070:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6593);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3080:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6620);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3090:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6647);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3100:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6674);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3116:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3117:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3118:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6709);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction6719); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3125:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3128:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3129:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3129:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3129:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3129:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3130:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3130:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3131:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6765);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleMaximumFunction6777); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3151:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3152:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3152:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3153:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6798);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3169:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==21) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3169:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMaximumFunction6811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3173:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3174:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3174:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3175:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6832);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleMaximumFunction6846); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3203:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3204:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3205:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6882);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction6892); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3212:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3215:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3216:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3216:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3216:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3216:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3217:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3217:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3218:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction6938);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleMinimumFunction6950); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3238:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3239:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3239:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3240:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6971);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3256:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==21) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3256:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleMinimumFunction6984); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3260:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3261:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3261:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3262:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction7005);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleMinimumFunction7019); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3290:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3291:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3292:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction7055);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction7065); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3299:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3302:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3303:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3303:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3303:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3303:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3304:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3304:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3305:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction7111);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleAverageFunction7123); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3325:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3326:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3326:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3327:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7144);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3343:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==21) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3343:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleAverageFunction7157); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3347:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3348:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3348:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3349:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction7178);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleAverageFunction7192); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3377:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3378:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3379:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction7228);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction7238); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3386:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3389:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3390:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3390:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3390:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3390:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3391:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3391:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3392:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction7284);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleSumFunction7296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3412:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3413:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3413:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3414:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7317);
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

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3430:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==21) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3430:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleSumFunction7330); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3434:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3435:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3435:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3436:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction7351);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleSumFunction7365); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3464:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3465:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3466:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7401);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction7411); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3473:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3476:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3477:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3477:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3477:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3477:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3478:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3478:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3479:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7457);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleExponentialFunction7469); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3499:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3500:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3500:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3501:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7490);
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

            otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleExponentialFunction7502); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3521:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3522:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3522:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3523:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7523);
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

            otherlv_5=(Token)match(input,45,FOLLOW_45_in_ruleExponentialFunction7535); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3551:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3552:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3553:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7571);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction7581); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3560:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3563:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3564:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3564:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3564:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3564:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3565:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3565:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3566:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7627);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleAbsoluteFunction7639); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3586:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3587:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3587:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3588:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7660);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleAbsoluteFunction7672); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3616:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3617:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3618:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7708);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7718); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3625:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3628:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3629:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3629:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3629:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3629:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3630:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3630:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3631:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7764);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleNaturalLogarithmFunction7776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3651:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3652:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3652:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3653:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7797);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleNaturalLogarithmFunction7809); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3681:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3682:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3683:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7845);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7855); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3690:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3693:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3694:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3694:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3694:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3694:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3695:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3695:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3696:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7901);
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

            otherlv_1=(Token)match(input,44,FOLLOW_44_in_ruleCommonLogarithmFunction7913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3716:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3717:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3717:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3718:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7934);
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

            otherlv_3=(Token)match(input,45,FOLLOW_45_in_ruleCommonLogarithmFunction7946); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3746:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3747:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3748:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7982);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7992); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3755:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3758:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3759:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3759:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3760:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression8033);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3767:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3768:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3768:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3769:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression8053);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression8069);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3801:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3802:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3803:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8104);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification8114); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3810:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3813:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3814:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3814:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt49=3;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3815:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8161);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3825:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8188);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3835:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8215);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3851:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3852:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3853:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8250);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8260); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3860:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3863:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3864:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3864:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3864:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3864:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3865:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3865:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3866:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8308);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3879:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==20) ) {
                alt50=1;
            }
            else if ( (LA50_0==18) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3879:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3879:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3880:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3880:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3881:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8330);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3898:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3898:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3899:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3899:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3900:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8357);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3924:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3925:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3926:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection8394);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection8404); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3933:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3936:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3937:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3937:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3937:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3937:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3938:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCollectionAccess().getCollectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleCollection8450); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3947:1: ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( ((LA52_0>=RULE_ID && LA52_0<=RULE_EBIGDECIMAL)||LA52_0==47) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3947:2: ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3947:2: ( (lv_values_2_0= ruleValueSpecification ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3948:1: (lv_values_2_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3948:1: (lv_values_2_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3949:3: lv_values_2_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8472);
                    lv_values_2_0=ruleValueSpecification();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                      	        }
                             		add(
                             			current, 
                             			"values",
                              		lv_values_2_0, 
                              		"ValueSpecification");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3965:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    loop51:
                    do {
                        int alt51=2;
                        int LA51_0 = input.LA(1);

                        if ( (LA51_0==21) ) {
                            alt51=1;
                        }


                        switch (alt51) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3965:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleCollection8485); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3969:1: ( (lv_values_4_0= ruleValueSpecification ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3970:1: (lv_values_4_0= ruleValueSpecification )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3970:1: (lv_values_4_0= ruleValueSpecification )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3971:3: lv_values_4_0= ruleValueSpecification
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8506);
                    	    lv_values_4_0=ruleValueSpecification();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getCollectionRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"values",
                    	              		lv_values_4_0, 
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_22_in_ruleCollection8522); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCollectionAccess().getRightSquareBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:3999:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4000:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4001:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple8558);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple8568); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4008:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuples_2_0 = null;

        EObject lv_tuples_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4011:28: ( ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4012:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4012:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4012:2: () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4012:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4013:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTuple8614); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4022:1: ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4022:2: ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4022:2: ( (lv_tuples_2_0= rulePropertyValuePair ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4023:1: (lv_tuples_2_0= rulePropertyValuePair )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4023:1: (lv_tuples_2_0= rulePropertyValuePair )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4024:3: lv_tuples_2_0= rulePropertyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8636);
                    lv_tuples_2_0=rulePropertyValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getTupleRule());
                      	        }
                             		add(
                             			current, 
                             			"tuples",
                              		lv_tuples_2_0, 
                              		"PropertyValuePair");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4040:2: (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==21) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4040:4: otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_21_in_ruleTuple8649); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4044:1: ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4045:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4045:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4046:3: lv_tuples_4_0= rulePropertyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8670);
                    	    lv_tuples_4_0=rulePropertyValuePair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      	        if (current==null) {
                    	      	            current = createModelElementForParent(grammarAccess.getTupleRule());
                    	      	        }
                    	             		add(
                    	             			current, 
                    	             			"tuples",
                    	              		lv_tuples_4_0, 
                    	              		"PropertyValuePair");
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleTuple8686); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getTupleAccess().getRightCurlyBracketKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4074:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4075:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4076:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8722);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair8732); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4083:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4086:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4087:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4087:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4087:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4087:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4088:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4088:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4089:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8780);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_46_in_rulePropertyValuePair8792); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4106:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4107:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4107:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4108:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8813);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4132:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4133:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4134:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8849);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8859); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4141:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4144:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4145:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4145:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4146:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4146:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4147:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8906);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4168:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4169:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4170:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8941);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression8951); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4177:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4180:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4181:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4181:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt55=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt55=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt55=2;
                }
                break;
            case RULE_NULL:
                {
                alt55=3;
                }
                break;
            case RULE_STRING:
                {
                alt55=4;
                }
                break;
            case 47:
                {
                alt55=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }

            switch (alt55) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4182:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8998);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4192:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression9025);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4202:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression9052);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4212:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression9079);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4222:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression9106);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4238:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4239:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4240:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9141);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral9151); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4247:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4250:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4251:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4251:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4252:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4252:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4253:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9192); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4277:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4278:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4279:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9232);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral9242); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4286:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4289:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4290:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4290:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4291:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4291:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4292:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral9287);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4316:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4317:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4318:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9322);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral9332); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4325:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4328:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4329:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4329:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4330:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4330:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4331:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral9373); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4355:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4356:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4357:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9413);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9423); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4364:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4367:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4368:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4368:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4369:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4369:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4370:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9464); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4394:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4395:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4396:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9504);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral9514); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4403:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4406:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4407:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4407:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4408:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4408:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4409:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,47,FOLLOW_47_in_ruleUnlimitedLiteral9556); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4430:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4431:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4432:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator9604);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator9614); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4439:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4442:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4443:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4444:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4449:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==48) ) {
                alt56=1;
            }
            else if ( (LA56_0==49) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4449:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,48,FOLLOW_48_in_ruleOrOperator9661); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4454:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleOrOperator9679); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4466:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4467:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4468:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9716);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator9726); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4475:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4478:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4479:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4480:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4485:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==50) ) {
                alt57=1;
            }
            else if ( (LA57_0==51) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4485:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,50,FOLLOW_50_in_ruleXOrOperator9773); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4490:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleXOrOperator9791); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4502:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4503:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4504:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator9828);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator9838); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4511:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4514:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4515:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4516:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4521:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==52) ) {
                alt58=1;
            }
            else if ( (LA58_0==53) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4521:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,52,FOLLOW_52_in_ruleAndOperator9885); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4526:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,53,FOLLOW_53_in_ruleAndOperator9903); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4538:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4539:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4540:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9940);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator9950); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4547:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4550:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4551:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4551:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4551:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4551:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4552:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4557:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==54) ) {
                alt59=1;
            }
            else if ( (LA59_0==55) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4557:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleImplicationOperator9997); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4562:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,55,FOLLOW_55_in_ruleImplicationOperator10015); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4574:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4575:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4576:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator10052);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator10062); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4583:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4586:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4587:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4587:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4587:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4587:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4588:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_ruleEqualsOperator10108); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4605:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4606:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4607:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10144);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator10154); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4614:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4617:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4618:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4619:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4624:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==57) ) {
                alt60=1;
            }
            else if ( (LA60_0==58) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4624:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleNotEqualsOperator10201); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4629:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,58,FOLLOW_58_in_ruleNotEqualsOperator10219); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4641:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4642:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4643:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator10256);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator10266); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4650:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4653:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4654:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4654:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4654:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4654:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4655:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4660:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==59) ) {
                alt61=1;
            }
            else if ( (LA61_0==60) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4660:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleNotOperator10313); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4665:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleNotOperator10331); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4677:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4678:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4679:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10368);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator10378); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4686:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4689:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4690:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4690:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4690:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4690:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4691:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,61,FOLLOW_61_in_ruleGreaterThanOperator10424); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4708:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4709:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4710:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10460);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10470); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4717:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4720:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4721:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4721:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4721:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4721:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4722:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleGreaterOrEqualThanOperator10516); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4739:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4740:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4741:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10552);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator10562); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4748:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4751:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4752:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4752:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4752:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4752:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4753:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,63,FOLLOW_63_in_ruleLessThanOperator10608); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4770:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4771:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4772:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10644);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10654); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4779:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4782:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4783:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4783:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4783:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4783:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4784:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleLessOrEqualThanOperator10700); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4801:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4802:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4803:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10736);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator10746); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4810:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4813:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4814:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4814:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4814:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4814:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4815:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,65,FOLLOW_65_in_ruleAdditionOperator10792); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4832:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4833:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4834:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10828);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator10838); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4841:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4844:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4845:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4845:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4845:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4845:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4846:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleSubstractionOperator10884); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4863:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4864:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4865:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10920);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator10930); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4872:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4875:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4876:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4876:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4876:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4876:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4877:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_47_in_ruleMultiplicationOperator10976); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4894:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4895:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4896:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator11012);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator11022); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4903:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4906:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4907:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4907:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4907:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4907:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4908:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleDivisionOperator11068); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4925:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4926:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4927:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator11104);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator11114); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4934:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4937:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4938:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4938:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4938:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4938:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4939:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_68_in_ruleModulusOperator11160); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4956:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4957:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4958:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11196);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator11206); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4965:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4968:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4969:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4969:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4969:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4969:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4970:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleMaxOperator11252); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4987:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4988:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4989:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator11288);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator11298); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4996:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:4999:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5000:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5000:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5000:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5000:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5001:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,70,FOLLOW_70_in_ruleMinOperator11344); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5018:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5019:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5020:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11380);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator11390); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5027:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5030:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5031:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5031:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5031:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5031:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5032:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleAvgOperator11436); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5049:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5050:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5051:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator11472);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator11482); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5058:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5061:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5062:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5062:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5062:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5062:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5063:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleSumOperator11528); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5080:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5081:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5082:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11564);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator11574); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5089:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5092:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5093:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5093:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5093:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5093:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5094:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleExponentialOperator11620); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5111:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5112:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5113:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11656);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator11666); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5120:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5123:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5124:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5124:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5124:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5124:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5125:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleAbsoluteOperator11712); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5142:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5143:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5144:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11748);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11758); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5151:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5154:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5155:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5155:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5155:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5155:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5156:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleNaturalLogarithmOperator11804); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5173:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5174:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5175:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11840);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11850); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5182:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5185:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5186:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5186:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5186:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5186:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5187:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleCommonLogarithmOperator11896); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5204:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5205:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5206:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11933);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11944); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5213:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5216:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5218:2: kw= '('
            {
            kw=(Token)match(input,44,FOLLOW_44_in_ruleLeftParenthesis11981); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5231:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5232:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5233:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis12021);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis12032); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5240:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5243:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5245:2: kw= ')'
            {
            kw=(Token)match(input,45,FOLLOW_45_in_ruleRightParenthesis12069); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5258:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5259:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5260:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12109);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName12120); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5267:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5270:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5271:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5271:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5271:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5278:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==77) && (synpred1_InternalGML())) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5278:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5278:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5278:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,77,FOLLOW_77_in_ruleQualifiedName12188); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName12204); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5301:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5302:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5303:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12252);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12263); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5310:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5313:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5314:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5315:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12310);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5325:1: (kw= '.*' )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==78) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5326:2: kw= '.*'
                    {
                    kw=(Token)match(input,78,FOLLOW_78_in_ruleQualifiedNameWithWildcard12329); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5343:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5344:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5345:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12375);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace12385); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5352:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5355:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5356:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5356:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5356:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,79,FOLLOW_79_in_ruleImportNamespace12422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5360:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5361:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5361:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5362:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12443);
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5386:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5387:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5388:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12480);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12491); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5395:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5398:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5399:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5399:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt64=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt64=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt64=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt64=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt64=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5399:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12531); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5407:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12557); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5415:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12583); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5423:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12609); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5438:1: entryRuleImpact returns [String current=null] : iv_ruleImpact= ruleImpact EOF ;
    public final String entryRuleImpact() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleImpact = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5439:2: (iv_ruleImpact= ruleImpact EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5440:2: iv_ruleImpact= ruleImpact EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpactRule()); 
            }
            pushFollow(FOLLOW_ruleImpact_in_entryRuleImpact12655);
            iv_ruleImpact=ruleImpact();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpact.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpact12666); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5447:1: ruleImpact returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleImpact() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_POSITIVE_SMALL_DECIMAL_0=null;
        Token this_SMALL_DECIMAL_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5450:28: ( (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5451:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5451:1: (this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_POSITIVE_SMALL_DECIMAL) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_SMALL_DECIMAL) ) {
                alt65=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5451:6: this_POSITIVE_SMALL_DECIMAL_0= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_0=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12706); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_0, grammarAccess.getImpactAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5459:10: this_SMALL_DECIMAL_1= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_1=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12732); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5476:1: ruleGoalKind returns [Enumerator current=null] : ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) ;
    public final Enumerator ruleGoalKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5478:28: ( ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5479:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5479:1: ( (enumLiteral_0= 'required' ) | (enumLiteral_1= 'offered' ) | (enumLiteral_2= 'contract' ) )
            int alt66=3;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt66=1;
                }
                break;
            case 81:
                {
                alt66=2;
                }
                break;
            case 82:
                {
                alt66=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5479:2: (enumLiteral_0= 'required' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5479:2: (enumLiteral_0= 'required' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5479:4: enumLiteral_0= 'required'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_80_in_ruleGoalKind12793); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getGoalKindAccess().getREQUIREDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5485:6: (enumLiteral_1= 'offered' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5485:6: (enumLiteral_1= 'offered' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5485:8: enumLiteral_1= 'offered'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_81_in_ruleGoalKind12810); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getGoalKindAccess().getOFFEREDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5491:6: (enumLiteral_2= 'contract' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5491:6: (enumLiteral_2= 'contract' )
                    // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5491:8: enumLiteral_2= 'contract'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_82_in_ruleGoalKind12827); if (state.failed) return current;
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
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5278:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.gml/src-gen/eu/artist/postmigration/nfrvt/lang/gml/parser/antlr/internal/InternalGML.g:5279:2: '.'
        {
        match(input,77,FOLLOW_77_in_synpred1_InternalGML12179); if (state.failed) return ;

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
        "\1\4\1\uffff\1\22\4\uffff\1\4\2\uffff\1\22";
    static final String DFA39_maxS =
        "\1\114\1\uffff\1\115\4\uffff\1\4\2\uffff\1\115";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA39_specialS =
        "\13\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\2\1\4\2\1\1\uffff\1\3\2\1\31\uffff\1\1\6\uffff\1\6\2\uffff"+
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
            return "2714:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA49_eotS =
        "\7\uffff";
    static final String DFA49_eofS =
        "\2\uffff\1\5\3\uffff\1\5";
    static final String DFA49_minS =
        "\1\4\1\uffff\1\22\1\4\2\uffff\1\22";
    static final String DFA49_maxS =
        "\1\57\1\uffff\1\115\1\4\2\uffff\1\115";
    static final String DFA49_acceptS =
        "\1\uffff\1\1\2\uffff\1\3\1\2\1\uffff";
    static final String DFA49_specialS =
        "\7\uffff}>";
    static final String[] DFA49_transitionS = {
            "\1\2\7\1\43\uffff\1\1",
            "",
            "\1\4\1\uffff\1\4\2\5\2\uffff\1\5\63\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\1\uffff\1\4\2\5\2\uffff\1\5\63\uffff\1\3"
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
            return "3814:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleARTISTModel_in_entryRuleARTISTModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARTISTModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalModel_in_ruleARTISTModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalModel_in_entryRuleGoalModel165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalModel175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleGoalModel221 = new BitSet(new long[]{0x0000000000020000L,0x0000000000008000L});
    public static final BitSet FOLLOW_17_in_ruleGoalModel234 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalModel255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoalModel267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleGoalModel279 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel291 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleWorkload_in_ruleGoalModel313 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModel326 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleWorkload_in_ruleGoalModel347 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleGoalModel363 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleGoalModel375 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel387 = new BitSet(new long[]{0x0000000090400000L});
    public static final BitSet FOLLOW_ruleAppliedProperty_in_ruleGoalModel409 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModel422 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_ruleAppliedProperty_in_ruleGoalModel443 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleGoalModel459 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleGoalModel471 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModel483 = new BitSet(new long[]{0x0000090400400000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleGoalModel505 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleGoalModel518 = new BitSet(new long[]{0x0000090400000000L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleGoalModel539 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleGoalModel555 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGoalModel567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWorkload_in_entryRuleWorkload603 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleWorkload613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWorkload655 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleWorkload672 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleWorkload684 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleWorkload707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleWorkload719 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleWorkload731 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWorkload748 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleWorkload765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedProperty_in_entryRuleAppliedProperty801 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedProperty811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativeProperty_in_ruleAppliedProperty858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativeProperty_in_ruleAppliedProperty885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativeProperty_in_entryRuleAppliedQualitativeProperty920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQualitativeProperty930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAppliedQualitativeProperty967 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQualitativeProperty984 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAppliedQualitativeProperty1001 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQualitativeProperty1013 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1036 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQualitativeProperty1049 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAppliedQualitativeProperty1061 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativeProperty1073 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1097 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQualitativeProperty1110 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativeProperty1133 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleAppliedQualitativeProperty1149 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAppliedQualitativeProperty1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativeProperty_in_entryRuleAppliedQuantitativeProperty1199 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativeProperty1209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleAppliedQuantitativeProperty1246 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQuantitativeProperty1263 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAppliedQuantitativeProperty1280 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAppliedQuantitativeProperty1292 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1315 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativeProperty1328 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_ruleAppliedQuantitativeProperty1340 = new BitSet(new long[]{0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleAppliedQuantitativeProperty1363 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleAppliedQuantitativeProperty1382 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAppliedQuantitativeProperty1401 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleAppliedQuantitativeProperty1420 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativeProperty1438 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleAppliedQuantitativeProperty1450 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativeProperty1462 = new BitSet(new long[]{0x0000000000400010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1486 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativeProperty1499 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1522 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleAppliedQuantitativeProperty1538 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleAppliedQuantitativeProperty1553 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAppliedQuantitativeProperty1565 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativeProperty1588 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAppliedQuantitativeProperty1602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoal_in_ruleGoal1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_ruleGoal1722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_ruleGoal1749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoal_in_entryRuleSoftGoal1784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoal1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleSoftGoal1831 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftGoal1848 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftGoal1865 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleSoftGoal1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleSoftGoal1898 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal1910 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleSoftGoal1922 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSoftGoal1939 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal1956 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleSoftGoal1968 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleSoftGoal1980 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoal2003 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2015 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleSoftGoal2027 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoal2048 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2061 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSoftGoal2073 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoal2085 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2106 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleSoftGoal2119 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_ruleSoftGoal2140 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleSoftGoal2154 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSoftGoal2168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalImpact_in_entryRuleSoftGoalImpact2204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoalImpact2214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoalImpact2262 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_ruleImpact_in_ruleSoftGoalImpact2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoal_in_entryRuleHardGoal2319 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardGoal2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleHardGoal2366 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHardGoal2383 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHardGoal2400 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleHardGoal2412 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleHardGoal2433 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleHardGoal2445 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleHardGoal2457 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleHardGoal2474 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleHardGoal2491 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleHardGoal2503 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleHardGoal2524 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleHardGoal2537 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_ruleHardGoal2549 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleHardGoal2566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleHardGoal2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoal_in_entryRuleCompositeGoal2621 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeGoal2631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleCompositeGoal2668 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeGoal2685 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeGoal2702 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_ruleCompositeGoal2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000070000L});
    public static final BitSet FOLLOW_ruleGoalKind_in_ruleCompositeGoal2735 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeGoal2747 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleCompositeGoal2759 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleCompositeGoal2776 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleCompositeGoal2793 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCompositeGoal2805 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleCompositeGoal2826 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeGoal2838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_entryRuleGoalExpression2874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalExpression2884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_ruleGoalExpression2930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalImplication_in_entryRuleGoalImplication2964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalImplication2974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3021 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleGoalImplication3051 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_ruleGoalImplication3072 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleGoalDisjunction_in_entryRuleGoalDisjunction3110 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalDisjunction3120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3167 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleGoalDisjunction3199 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleGoalDisjunction3218 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_ruleGoalDisjunction3242 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleGoalConjunction_in_entryRuleGoalConjunction3280 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalConjunction3290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3337 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleGoalConjunction3367 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_ruleGoalConjunction3388 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleGoalComparison_in_entryRuleGoalComparison3426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalComparison3436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3483 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleGoalComparison3515 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleGoalComparison3534 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalComparison3558 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_entryRuleGoalBooleanUnit3596 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanUnit3606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_ruleGoalBooleanUnit3653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_ruleGoalBooleanUnit3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_ruleGoalBooleanUnit3707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_ruleGoalBooleanUnit3734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalNegation_in_entryRuleGoalNegation3769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalNegation3779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleGoalNegation3825 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalBooleanUnit_in_ruleGoalNegation3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalBooleanLiteral_in_entryRuleGoalBooleanLiteral3882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalBooleanLiteral3892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleGoalBooleanLiteral3933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalReference_in_entryRuleGoalReference3973 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalReference3983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGoalReference4029 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalReference4052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedGoalExpression_in_entryRuleParenthesizedGoalExpression4088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedGoalExpression4098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedGoalExpression4148 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGoalExpression_in_ruleParenthesizedGoalExpression4168 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedGoalExpression4184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression4219 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression4229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression4276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_ruleNumberExpression4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyExpression_in_entryRuleAppliedQuantitativePropertyExpression4365 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyExpression4375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleAppliedQuantitativePropertyExpression4421 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyExpression4444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression4536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication4570 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication4580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4627 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication4657 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4678 = new BitSet(new long[]{0x00C0000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction4716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction4726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4773 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction4805 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction4824 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4848 = new BitSet(new long[]{0x000F000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction4886 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction4896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4943 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction4973 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4994 = new BitSet(new long[]{0x0030000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison5032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison5042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison5089 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison5121 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison5140 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison5164 = new BitSet(new long[]{0x0700000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit5202 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit5212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit5259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit5286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit5313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation5348 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation5358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation5404 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation5425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression5461 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression5471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5518 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5550 = new BitSet(new long[]{0x0000902000000EF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5588 = new BitSet(new long[]{0x0000902000000EF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5626 = new BitSet(new long[]{0x0000902000000EF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5664 = new BitSet(new long[]{0x0000902000000EF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5687 = new BitSet(new long[]{0xE000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression5735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression5890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5979 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression6069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression6079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6126 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression6158 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression6177 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression6201 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000006L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression6239 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression6249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6296 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression6328 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression6347 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression6366 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression6390 = new BitSet(new long[]{0x0000800000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction6438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction6539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction6566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6709 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction6719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6765 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleMaximumFunction6777 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6798 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_21_in_ruleMaximumFunction6811 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6832 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_ruleMaximumFunction6846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6882 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction6892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction6938 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleMinimumFunction6950 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6971 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_21_in_ruleMinimumFunction6984 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction7005 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_ruleMinimumFunction7019 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction7055 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction7065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction7111 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAverageFunction7123 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7144 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_21_in_ruleAverageFunction7157 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction7178 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_ruleAverageFunction7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction7228 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction7238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction7284 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSumFunction7296 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7317 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_21_in_ruleSumFunction7330 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction7351 = new BitSet(new long[]{0x0000200000200000L});
    public static final BitSet FOLLOW_45_in_ruleSumFunction7365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7401 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction7411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7457 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleExponentialFunction7469 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7490 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleExponentialFunction7502 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7523 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleExponentialFunction7535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction7581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7627 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleAbsoluteFunction7639 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7660 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleAbsoluteFunction7672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7708 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7764 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleNaturalLogarithmFunction7776 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7797 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleNaturalLogarithmFunction7809 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7845 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7901 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleCommonLogarithmFunction7913 = new BitSet(new long[]{0x0000002000000CC0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7934 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_ruleCommonLogarithmFunction7946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7982 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression8033 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression8053 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression8069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification8104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification8114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification8161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification8188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification8215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression8250 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression8260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression8308 = new BitSet(new long[]{0x0000000000140000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression8330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection8394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleCollection8450 = new BitSet(new long[]{0x1800902000400FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8472 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_21_in_ruleCollection8485 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8506 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_22_in_ruleCollection8522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple8558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple8568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTuple8614 = new BitSet(new long[]{0x0000000002000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8636 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_21_in_ruleTuple8649 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8670 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_25_in_ruleTuple8686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair8732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8780 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_rulePropertyValuePair8792 = new BitSet(new long[]{0x1800902000000FF0L,0x0000000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8849 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression8951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression9025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression9079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral9141 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral9192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral9232 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral9242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral9287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral9322 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral9332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral9373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral9514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleUnlimitedLiteral9556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator9604 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator9614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleOrOperator9661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleOrOperator9679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9716 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator9726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleXOrOperator9773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleXOrOperator9791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator9828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator9838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleAndOperator9885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleAndOperator9903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9940 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator9950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleImplicationOperator9997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleImplicationOperator10015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator10052 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator10062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleEqualsOperator10108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator10144 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator10154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleNotEqualsOperator10201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNotEqualsOperator10219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator10256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator10266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleNotOperator10313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleNotOperator10331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10368 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator10378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleGreaterThanOperator10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleGreaterOrEqualThanOperator10516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10552 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator10562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleLessThanOperator10608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10644 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleLessOrEqualThanOperator10700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10736 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator10746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleAdditionOperator10792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10828 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator10838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleSubstractionOperator10884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10920 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator10930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleMultiplicationOperator10976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator11012 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator11022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleDivisionOperator11068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator11104 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator11114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleModulusOperator11160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator11196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator11206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleMaxOperator11252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator11288 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator11298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleMinOperator11344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator11390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleAvgOperator11436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator11472 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator11482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleSumOperator11528 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11564 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator11574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleExponentialOperator11620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11656 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator11666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleAbsoluteOperator11712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11748 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleNaturalLogarithmOperator11804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11840 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleCommonLogarithmOperator11896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleLeftParenthesis11981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis12021 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleRightParenthesis12069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName12109 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName12120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_ruleQualifiedName12188 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName12204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard12252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard12310 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_ruleQualifiedNameWithWildcard12329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace12385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleImportNamespace12422 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12480 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpact_in_entryRuleImpact12655 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpact12666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleImpact12706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleImpact12732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleGoalKind12793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleGoalKind12810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleGoalKind12827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_synpred1_InternalGML12179 = new BitSet(new long[]{0x0000000000000002L});

}