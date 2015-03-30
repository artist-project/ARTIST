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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DATE_TIME", "RULE_ID", "RULE_STRING", "RULE_EBOOLEAN", "RULE_NULL", "RULE_INT", "RULE_POSITIVE_SMALL_DECIMAL", "RULE_SMALL_DECIMAL", "RULE_EBIGDECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'evaluation'", "'{'", "'date'", "','", "'migration'", "'['", "']'", "'property-evaluations'", "'}'", "'transformation'", "'pattern'", "'source'", "'target'", "'context'", "'info'", "'qualitative'", "'property'", "'value'", "'quantitative'", "'measurements'", "'goalmodel-evaluation'", "'goalmodel'", "'verdict'", "'reason'", "'goal-evaluations'", "'soft-goal-evaluation'", "'goal'", "'difference'", "'hard-goal-evaluation'", "'condition-evaluation'", "'composite-goal-evaluation'", "'value-evaluation'", "'result'", "'evaluations'", "'expression-evaluation'", "'arithmetic-evaluation'", "'arithmetic-evaluations'", "'('", "')'", "'='", "'*'", "'or'", "'||'", "'xor'", "'^'", "'and'", "'&&'", "'=>'", "'->'", "'=='", "'!='", "'<>'", "'!'", "'not'", "'>'", "'>='", "'<'", "'<='", "'+'", "'-'", "'/'", "'%'", "'max'", "'min'", "'avg'", "'sum'", "'exp'", "'abs'", "'ln'", "'log'", "'.'", "'.*'", "'import'", "'PASS'", "'FAIL'", "'INCONCLUSIVE'"
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
    public static final int RULE_ANY_OTHER=16;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_SMALL_DECIMAL=11;
    public static final int RULE_EBIGDECIMAL=12;
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
    public static final int RULE_ML_COMMENT=13;
    public static final int RULE_STRING=6;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int RULE_EBOOLEAN=7;
    public static final int RULE_POSITIVE_SMALL_DECIMAL=10;
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
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_NULL=8;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int RULE_DATE_TIME=4;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=15;

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
        	return "ARTISTModel";	
       	}
       	
       	@Override
       	protected GELGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleARTISTModel"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:68:1: entryRuleARTISTModel returns [EObject current=null] : iv_ruleARTISTModel= ruleARTISTModel EOF ;
    public final EObject entryRuleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleARTISTModel = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:69:2: (iv_ruleARTISTModel= ruleARTISTModel EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:70:2: iv_ruleARTISTModel= ruleARTISTModel EOF
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:77:1: ruleARTISTModel returns [EObject current=null] : this_MigrationEvaluation_0= ruleMigrationEvaluation ;
    public final EObject ruleARTISTModel() throws RecognitionException {
        EObject current = null;

        EObject this_MigrationEvaluation_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:80:28: (this_MigrationEvaluation_0= ruleMigrationEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:82:5: this_MigrationEvaluation_0= ruleMigrationEvaluation
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getARTISTModelAccess().getMigrationEvaluationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleMigrationEvaluation_in_ruleARTISTModel131);
            this_MigrationEvaluation_0=ruleMigrationEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MigrationEvaluation_0; 
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


    // $ANTLR start "entryRuleMigrationEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:98:1: entryRuleMigrationEvaluation returns [EObject current=null] : iv_ruleMigrationEvaluation= ruleMigrationEvaluation EOF ;
    public final EObject entryRuleMigrationEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMigrationEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:99:2: (iv_ruleMigrationEvaluation= ruleMigrationEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:100:2: iv_ruleMigrationEvaluation= ruleMigrationEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMigrationEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleMigrationEvaluation_in_entryRuleMigrationEvaluation165);
            iv_ruleMigrationEvaluation=ruleMigrationEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMigrationEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMigrationEvaluation175); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:107:1: ruleMigrationEvaluation returns [EObject current=null] : ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_DATE_TIME ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:110:28: ( ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_DATE_TIME ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:111:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_DATE_TIME ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:111:1: ( ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_DATE_TIME ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:111:2: ( (lv_imports_0_0= ruleImportNamespace ) )* otherlv_1= 'evaluation' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= '{' otherlv_4= 'date' ( (lv_date_5_0= RULE_DATE_TIME ) ) otherlv_6= ',' otherlv_7= 'migration' otherlv_8= '[' ( (lv_transformations_9_0= ruleTransformation ) )* otherlv_10= ']' otherlv_11= ',' otherlv_12= 'property-evaluations' otherlv_13= '[' ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )* otherlv_15= ']' otherlv_16= ',' ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) ) otherlv_18= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:111:2: ( (lv_imports_0_0= ruleImportNamespace ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==89) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:112:1: (lv_imports_0_0= ruleImportNamespace )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:112:1: (lv_imports_0_0= ruleImportNamespace )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:113:3: lv_imports_0_0= ruleImportNamespace
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getImportsImportNamespaceParserRuleCall_0_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImportNamespace_in_ruleMigrationEvaluation221);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleMigrationEvaluation234); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMigrationEvaluationAccess().getEvaluationKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:133:1: ( (lv_name_2_0= ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:134:1: (lv_name_2_0= ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:134:1: (lv_name_2_0= ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:135:3: lv_name_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getNameQualifiedNameParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleMigrationEvaluation255);
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

            otherlv_3=(Token)match(input,18,FOLLOW_18_in_ruleMigrationEvaluation267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getMigrationEvaluationAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,19,FOLLOW_19_in_ruleMigrationEvaluation279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getMigrationEvaluationAccess().getDateKeyword_4());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:159:1: ( (lv_date_5_0= RULE_DATE_TIME ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:160:1: (lv_date_5_0= RULE_DATE_TIME )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:160:1: (lv_date_5_0= RULE_DATE_TIME )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:161:3: lv_date_5_0= RULE_DATE_TIME
            {
            lv_date_5_0=(Token)match(input,RULE_DATE_TIME,FOLLOW_RULE_DATE_TIME_in_ruleMigrationEvaluation296); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_date_5_0, grammarAccess.getMigrationEvaluationAccess().getDateDATE_TIMETerminalRuleCall_5_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getMigrationEvaluationRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"date",
                      		lv_date_5_0, 
                      		"DATE_TIME");
              	    
            }

            }


            }

            otherlv_6=(Token)match(input,20,FOLLOW_20_in_ruleMigrationEvaluation313); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getMigrationEvaluationAccess().getCommaKeyword_6());
                  
            }
            otherlv_7=(Token)match(input,21,FOLLOW_21_in_ruleMigrationEvaluation325); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMigrationEvaluationAccess().getMigrationKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleMigrationEvaluation337); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getMigrationEvaluationAccess().getLeftSquareBracketKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:189:1: ( (lv_transformations_9_0= ruleTransformation ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==26) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:190:1: (lv_transformations_9_0= ruleTransformation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:190:1: (lv_transformations_9_0= ruleTransformation )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:191:3: lv_transformations_9_0= ruleTransformation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getTransformationsTransformationParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleTransformation_in_ruleMigrationEvaluation358);
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

            otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleMigrationEvaluation371); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getMigrationEvaluationAccess().getRightSquareBracketKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleMigrationEvaluation383); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getMigrationEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,24,FOLLOW_24_in_ruleMigrationEvaluation395); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getMigrationEvaluationAccess().getPropertyEvaluationsKeyword_12());
                  
            }
            otherlv_13=(Token)match(input,22,FOLLOW_22_in_ruleMigrationEvaluation407); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getMigrationEvaluationAccess().getLeftSquareBracketKeyword_13());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:223:1: ( (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==32||LA3_0==35) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:224:1: (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:224:1: (lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:225:3: lv_propertyEvaluations_14_0= ruleAppliedPropertyEvaluation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getPropertyEvaluationsAppliedPropertyEvaluationParserRuleCall_14_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAppliedPropertyEvaluation_in_ruleMigrationEvaluation428);
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

            otherlv_15=(Token)match(input,23,FOLLOW_23_in_ruleMigrationEvaluation441); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getMigrationEvaluationAccess().getRightSquareBracketKeyword_15());
                  
            }
            otherlv_16=(Token)match(input,20,FOLLOW_20_in_ruleMigrationEvaluation453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_16, grammarAccess.getMigrationEvaluationAccess().getCommaKeyword_16());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:249:1: ( (lv_evaluation_17_0= ruleGoalModelEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:250:1: (lv_evaluation_17_0= ruleGoalModelEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:250:1: (lv_evaluation_17_0= ruleGoalModelEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:251:3: lv_evaluation_17_0= ruleGoalModelEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMigrationEvaluationAccess().getEvaluationGoalModelEvaluationParserRuleCall_17_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleGoalModelEvaluation_in_ruleMigrationEvaluation474);
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

            otherlv_18=(Token)match(input,25,FOLLOW_25_in_ruleMigrationEvaluation486); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:279:1: entryRuleTransformation returns [EObject current=null] : iv_ruleTransformation= ruleTransformation EOF ;
    public final EObject entryRuleTransformation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransformation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:280:2: (iv_ruleTransformation= ruleTransformation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:281:2: iv_ruleTransformation= ruleTransformation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTransformationRule()); 
            }
            pushFollow(FOLLOW_ruleTransformation_in_entryRuleTransformation522);
            iv_ruleTransformation=ruleTransformation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTransformation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransformation532); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:288:1: ruleTransformation returns [EObject current=null] : (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']' )? (otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) ) )? otherlv_23= '}' ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_info_22_0=null;
        Token otherlv_23=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:291:28: ( (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']' )? (otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) ) )? otherlv_23= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:292:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']' )? (otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) ) )? otherlv_23= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:292:1: (otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']' )? (otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) ) )? otherlv_23= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:292:3: otherlv_0= 'transformation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'pattern' ( ( ruleQualifiedName ) ) (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )? (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )? (otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']' )? (otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) ) )? otherlv_23= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleTransformation569); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getTransformationAccess().getTransformationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:296:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:297:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:297:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:298:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransformation586); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleTransformation603); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getTransformationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleTransformation615); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getTransformationAccess().getPatternKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:322:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:323:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:323:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:324:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getTransformationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getTransformationAccess().getPatternPatternCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation638);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:337:2: (otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==28) ) {
                    alt5=1;
                }
            }
            switch (alt5) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:337:4: otherlv_5= ',' otherlv_6= 'source' otherlv_7= '[' ( ( ruleQualifiedName ) )* otherlv_9= ']'
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleTransformation651); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getTransformationAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleTransformation663); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getTransformationAccess().getSourceKeyword_5_1());
                          
                    }
                    otherlv_7=(Token)match(input,22,FOLLOW_22_in_ruleTransformation675); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_5_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:349:1: ( ( ruleQualifiedName ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:350:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:350:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:351:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTransformationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransformationAccess().getSourceNamedElementCrossReference_5_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation698);
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

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleTransformation711); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_5_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:368:3: (otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==29) ) {
                    alt7=1;
                }
            }
            switch (alt7) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:368:5: otherlv_10= ',' otherlv_11= 'target' otherlv_12= '[' ( ( ruleQualifiedName ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleTransformation726); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getTransformationAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_11=(Token)match(input,29,FOLLOW_29_in_ruleTransformation738); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getTransformationAccess().getTargetKeyword_6_1());
                          
                    }
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleTransformation750); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:380:1: ( ( ruleQualifiedName ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==RULE_ID) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:381:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:381:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:382:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTransformationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransformationAccess().getTargetNamedElementCrossReference_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation773);
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

                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleTransformation786); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:399:3: (otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==30) ) {
                    alt9=1;
                }
            }
            switch (alt9) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:399:5: otherlv_15= ',' otherlv_16= 'context' otherlv_17= '[' ( ( ruleQualifiedName ) )* otherlv_19= ']'
                    {
                    otherlv_15=(Token)match(input,20,FOLLOW_20_in_ruleTransformation801); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_15, grammarAccess.getTransformationAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_16=(Token)match(input,30,FOLLOW_30_in_ruleTransformation813); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getTransformationAccess().getContextKeyword_7_1());
                          
                    }
                    otherlv_17=(Token)match(input,22,FOLLOW_22_in_ruleTransformation825); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_17, grammarAccess.getTransformationAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:411:1: ( ( ruleQualifiedName ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==RULE_ID) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:412:1: ( ruleQualifiedName )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:412:1: ( ruleQualifiedName )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:413:3: ruleQualifiedName
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getTransformationRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTransformationAccess().getContextNamedElementCrossReference_7_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleTransformation848);
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
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,23,FOLLOW_23_in_ruleTransformation861); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_19, grammarAccess.getTransformationAccess().getRightSquareBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:430:3: (otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:430:5: otherlv_20= ',' otherlv_21= 'info' ( (lv_info_22_0= RULE_STRING ) )
                    {
                    otherlv_20=(Token)match(input,20,FOLLOW_20_in_ruleTransformation876); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_20, grammarAccess.getTransformationAccess().getCommaKeyword_8_0());
                          
                    }
                    otherlv_21=(Token)match(input,31,FOLLOW_31_in_ruleTransformation888); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_21, grammarAccess.getTransformationAccess().getInfoKeyword_8_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:438:1: ( (lv_info_22_0= RULE_STRING ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:439:1: (lv_info_22_0= RULE_STRING )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:439:1: (lv_info_22_0= RULE_STRING )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:440:3: lv_info_22_0= RULE_STRING
                    {
                    lv_info_22_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleTransformation905); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_info_22_0, grammarAccess.getTransformationAccess().getInfoSTRINGTerminalRuleCall_8_2_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getTransformationRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"info",
                              		lv_info_22_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleTransformation924); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_23, grammarAccess.getTransformationAccess().getRightCurlyBracketKeyword_9());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
            }
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:468:1: entryRuleAppliedPropertyEvaluation returns [EObject current=null] : iv_ruleAppliedPropertyEvaluation= ruleAppliedPropertyEvaluation EOF ;
    public final EObject entryRuleAppliedPropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedPropertyEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:469:2: (iv_ruleAppliedPropertyEvaluation= ruleAppliedPropertyEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:470:2: iv_ruleAppliedPropertyEvaluation= ruleAppliedPropertyEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedPropertyEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedPropertyEvaluation_in_entryRuleAppliedPropertyEvaluation960);
            iv_ruleAppliedPropertyEvaluation=ruleAppliedPropertyEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedPropertyEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedPropertyEvaluation970); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:477:1: ruleAppliedPropertyEvaluation returns [EObject current=null] : (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation ) ;
    public final EObject ruleAppliedPropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject this_AppliedQualitativePropertyEvaluation_0 = null;

        EObject this_AppliedQuantitativePropertyEvaluation_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:480:28: ( (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:481:1: (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:481:1: (this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation | this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==32) ) {
                alt11=1;
            }
            else if ( (LA11_0==35) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:482:5: this_AppliedQualitativePropertyEvaluation_0= ruleAppliedQualitativePropertyEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyEvaluationAccess().getAppliedQualitativePropertyEvaluationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation1017);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:492:5: this_AppliedQuantitativePropertyEvaluation_1= ruleAppliedQuantitativePropertyEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAppliedPropertyEvaluationAccess().getAppliedQuantitativePropertyEvaluationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation1044);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:508:1: entryRuleAppliedQualitativePropertyEvaluation returns [EObject current=null] : iv_ruleAppliedQualitativePropertyEvaluation= ruleAppliedQualitativePropertyEvaluation EOF ;
    public final EObject entryRuleAppliedQualitativePropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQualitativePropertyEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:509:2: (iv_ruleAppliedQualitativePropertyEvaluation= ruleAppliedQualitativePropertyEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:510:2: iv_ruleAppliedQualitativePropertyEvaluation= ruleAppliedQualitativePropertyEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_entryRuleAppliedQualitativePropertyEvaluation1079);
            iv_ruleAppliedQualitativePropertyEvaluation=ruleAppliedQualitativePropertyEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQualitativePropertyEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQualitativePropertyEvaluation1089); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:517:1: ruleAppliedQualitativePropertyEvaluation returns [EObject current=null] : (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:520:28: ( (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:521:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:521:1: (otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:521:3: otherlv_0= 'qualitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) ) otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleAppliedQualitativePropertyEvaluation1126); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getQualitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:525:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:526:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:526:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:527:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQualitativePropertyEvaluation1143); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAppliedQualitativePropertyEvaluation1160); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleAppliedQualitativePropertyEvaluation1172); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:551:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:552:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:552:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:553:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQualitativePropertyEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getPropertyAppliedQualitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativePropertyEvaluation1195);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativePropertyEvaluation1207); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleAppliedQualitativePropertyEvaluation1219); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getValueKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:574:1: ( (lv_value_7_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:575:1: (lv_value_7_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:575:1: (lv_value_7_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:576:3: lv_value_7_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getValueValueSpecificationParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleAppliedQualitativePropertyEvaluation1240);
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQualitativePropertyEvaluation1252); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getCommaKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:596:1: ( (lv_evaluation_9_0= ruleNumberExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:597:1: (lv_evaluation_9_0= ruleNumberExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:597:1: (lv_evaluation_9_0= ruleNumberExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:598:3: lv_evaluation_9_0= ruleNumberExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQualitativePropertyEvaluationAccess().getEvaluationNumberExpressionEvaluationParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_ruleAppliedQualitativePropertyEvaluation1273);
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

            otherlv_10=(Token)match(input,25,FOLLOW_25_in_ruleAppliedQualitativePropertyEvaluation1285); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:626:1: entryRuleAppliedQuantitativePropertyEvaluation returns [EObject current=null] : iv_ruleAppliedQuantitativePropertyEvaluation= ruleAppliedQuantitativePropertyEvaluation EOF ;
    public final EObject entryRuleAppliedQuantitativePropertyEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppliedQuantitativePropertyEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:627:2: (iv_ruleAppliedQuantitativePropertyEvaluation= ruleAppliedQuantitativePropertyEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:628:2: iv_ruleAppliedQuantitativePropertyEvaluation= ruleAppliedQuantitativePropertyEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_entryRuleAppliedQuantitativePropertyEvaluation1321);
            iv_ruleAppliedQuantitativePropertyEvaluation=ruleAppliedQuantitativePropertyEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppliedQuantitativePropertyEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyEvaluation1331); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:635:1: ruleAppliedQuantitativePropertyEvaluation returns [EObject current=null] : (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' ) ;
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


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:638:28: ( (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:639:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:639:1: (otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' )? otherlv_17= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:639:3: otherlv_0= 'quantitative' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'property' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'value' ( (lv_value_7_0= ruleValueSpecification ) ) otherlv_8= ',' ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) ) (otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' )? otherlv_17= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleAppliedQuantitativePropertyEvaluation1368); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getQuantitativeKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:643:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:644:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:644:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:645:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAppliedQuantitativePropertyEvaluation1385); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleAppliedQuantitativePropertyEvaluation1402); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,33,FOLLOW_33_in_ruleAppliedQuantitativePropertyEvaluation1414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getPropertyKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:669:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:670:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:670:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:671:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getPropertyAppliedQuantitativePropertyCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1437);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1449); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,34,FOLLOW_34_in_ruleAppliedQuantitativePropertyEvaluation1461); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getValueKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:692:1: ( (lv_value_7_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:693:1: (lv_value_7_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:693:1: (lv_value_7_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:694:3: lv_value_7_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getValueValueSpecificationParserRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_ruleAppliedQuantitativePropertyEvaluation1482);
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1494); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:714:1: ( (lv_evaluation_9_0= ruleValueExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:715:1: (lv_evaluation_9_0= ruleValueExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:715:1: (lv_evaluation_9_0= ruleValueExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:716:3: lv_evaluation_9_0= ruleValueExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getEvaluationValueExpressionEvaluationParserRuleCall_9_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_ruleAppliedQuantitativePropertyEvaluation1515);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:732:2: (otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==20) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:732:4: otherlv_10= ',' otherlv_11= 'measurements' otherlv_12= '[' ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )? otherlv_16= ']'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1528); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_10_0());
                          
                    }
                    otherlv_11=(Token)match(input,36,FOLLOW_36_in_ruleAppliedQuantitativePropertyEvaluation1540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getMeasurementsKeyword_10_1());
                          
                    }
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleAppliedQuantitativePropertyEvaluation1552); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getLeftSquareBracketKeyword_10_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:744:1: ( ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )* )?
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==RULE_ID) ) {
                        alt13=1;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:744:2: ( ( ruleQualifiedName ) ) (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:744:2: ( ( ruleQualifiedName ) )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:745:1: ( ruleQualifiedName )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:745:1: ( ruleQualifiedName )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:746:3: ruleQualifiedName
                            {
                            if ( state.backtracking==0 ) {

                              			if (current==null) {
                              	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
                              	        }
                                      
                            }
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getMeasurementsMeasurementCrossReference_10_3_0_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1576);
                            ruleQualifiedName();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {
                               
                              	        afterParserOrEnumRuleCall();
                              	    
                            }

                            }


                            }

                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:759:2: (otherlv_14= ',' ( ( ruleQualifiedName ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==20) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:759:4: otherlv_14= ',' ( ( ruleQualifiedName ) )
                            	    {
                            	    otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1589); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	          	newLeafNode(otherlv_14, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getCommaKeyword_10_3_1_0());
                            	          
                            	    }
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:763:1: ( ( ruleQualifiedName ) )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:764:1: ( ruleQualifiedName )
                            	    {
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:764:1: ( ruleQualifiedName )
                            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:765:3: ruleQualifiedName
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      			if (current==null) {
                            	      	            current = createModelElement(grammarAccess.getAppliedQuantitativePropertyEvaluationRule());
                            	      	        }
                            	              
                            	    }
                            	    if ( state.backtracking==0 ) {
                            	       
                            	      	        newCompositeNode(grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getMeasurementsMeasurementCrossReference_10_3_1_1_0()); 
                            	      	    
                            	    }
                            	    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1612);
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
                            	    break loop12;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleAppliedQuantitativePropertyEvaluation1628); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_16, grammarAccess.getAppliedQuantitativePropertyEvaluationAccess().getRightSquareBracketKeyword_10_4());
                          
                    }

                    }
                    break;

            }

            otherlv_17=(Token)match(input,25,FOLLOW_25_in_ruleAppliedQuantitativePropertyEvaluation1642); if (state.failed) return current;
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


    // $ANTLR start "entryRuleGoalModelEvaluation"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:794:1: entryRuleGoalModelEvaluation returns [EObject current=null] : iv_ruleGoalModelEvaluation= ruleGoalModelEvaluation EOF ;
    public final EObject entryRuleGoalModelEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalModelEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:795:2: (iv_ruleGoalModelEvaluation= ruleGoalModelEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:796:2: iv_ruleGoalModelEvaluation= ruleGoalModelEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalModelEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalModelEvaluation_in_entryRuleGoalModelEvaluation1678);
            iv_ruleGoalModelEvaluation=ruleGoalModelEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalModelEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalModelEvaluation1688); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:803:1: ruleGoalModelEvaluation returns [EObject current=null] : (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:806:28: ( (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:807:1: (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:807:1: (otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:807:3: otherlv_0= 'goalmodel-evaluation' otherlv_1= '{' otherlv_2= 'goalmodel' ( ( ruleQualifiedName ) ) otherlv_4= ',' otherlv_5= 'verdict' ( (lv_verdict_6_0= ruleVerdict ) ) otherlv_7= ',' otherlv_8= 'reason' ( (lv_reason_9_0= RULE_STRING ) ) otherlv_10= ',' otherlv_11= 'goal-evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleGoalEvaluation ) )* otherlv_14= ']' otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_37_in_ruleGoalModelEvaluation1725); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGoalModelEvaluationAccess().getGoalmodelEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleGoalModelEvaluation1737); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getGoalModelEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,38,FOLLOW_38_in_ruleGoalModelEvaluation1749); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getGoalModelEvaluationAccess().getGoalmodelKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:819:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:820:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:820:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:821:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getGoalModelEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalModelEvaluationAccess().getGoalModelGoalModelCrossReference_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleGoalModelEvaluation1772);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleGoalModelEvaluation1784); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getGoalModelEvaluationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleGoalModelEvaluation1796); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getGoalModelEvaluationAccess().getVerdictKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:842:1: ( (lv_verdict_6_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:843:1: (lv_verdict_6_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:843:1: (lv_verdict_6_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:844:3: lv_verdict_6_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getGoalModelEvaluationAccess().getVerdictVerdictEnumRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleGoalModelEvaluation1817);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleGoalModelEvaluation1829); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getGoalModelEvaluationAccess().getCommaKeyword_7());
                  
            }
            otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleGoalModelEvaluation1841); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getGoalModelEvaluationAccess().getReasonKeyword_8());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:868:1: ( (lv_reason_9_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:869:1: (lv_reason_9_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:869:1: (lv_reason_9_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:870:3: lv_reason_9_0= RULE_STRING
            {
            lv_reason_9_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleGoalModelEvaluation1858); if (state.failed) return current;
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

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleGoalModelEvaluation1875); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getGoalModelEvaluationAccess().getCommaKeyword_10());
                  
            }
            otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleGoalModelEvaluation1887); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getGoalModelEvaluationAccess().getGoalEvaluationsKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleGoalModelEvaluation1899); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getGoalModelEvaluationAccess().getLeftSquareBracketKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:898:1: ( (lv_evaluations_13_0= ruleGoalEvaluation ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==42||LA15_0==45||LA15_0==47) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:899:1: (lv_evaluations_13_0= ruleGoalEvaluation )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:899:1: (lv_evaluations_13_0= ruleGoalEvaluation )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:900:3: lv_evaluations_13_0= ruleGoalEvaluation
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalModelEvaluationAccess().getEvaluationsGoalEvaluationParserRuleCall_13_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleGoalEvaluation_in_ruleGoalModelEvaluation1920);
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
            	    break loop15;
                }
            } while (true);

            otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleGoalModelEvaluation1933); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_14, grammarAccess.getGoalModelEvaluationAccess().getRightSquareBracketKeyword_14());
                  
            }
            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleGoalModelEvaluation1945); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:932:1: entryRuleGoalEvaluation returns [EObject current=null] : iv_ruleGoalEvaluation= ruleGoalEvaluation EOF ;
    public final EObject entryRuleGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:933:2: (iv_ruleGoalEvaluation= ruleGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:934:2: iv_ruleGoalEvaluation= ruleGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleGoalEvaluation_in_entryRuleGoalEvaluation1981);
            iv_ruleGoalEvaluation=ruleGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoalEvaluation1991); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:941:1: ruleGoalEvaluation returns [EObject current=null] : (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation ) ;
    public final EObject ruleGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject this_SoftGoalEvaluation_0 = null;

        EObject this_HardGoalEvaluation_1 = null;

        EObject this_CompositeGoalEvaluation_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:944:28: ( (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:945:1: (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:945:1: (this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation | this_HardGoalEvaluation_1= ruleHardGoalEvaluation | this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation )
            int alt16=3;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt16=1;
                }
                break;
            case 45:
                {
                alt16=2;
                }
                break;
            case 47:
                {
                alt16=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:946:5: this_SoftGoalEvaluation_0= ruleSoftGoalEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalEvaluationAccess().getSoftGoalEvaluationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSoftGoalEvaluation_in_ruleGoalEvaluation2038);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:956:5: this_HardGoalEvaluation_1= ruleHardGoalEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalEvaluationAccess().getHardGoalEvaluationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleHardGoalEvaluation_in_ruleGoalEvaluation2065);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:966:5: this_CompositeGoalEvaluation_2= ruleCompositeGoalEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getGoalEvaluationAccess().getCompositeGoalEvaluationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCompositeGoalEvaluation_in_ruleGoalEvaluation2092);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:982:1: entryRuleSoftGoalEvaluation returns [EObject current=null] : iv_ruleSoftGoalEvaluation= ruleSoftGoalEvaluation EOF ;
    public final EObject entryRuleSoftGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSoftGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:983:2: (iv_ruleSoftGoalEvaluation= ruleSoftGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:984:2: iv_ruleSoftGoalEvaluation= ruleSoftGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSoftGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleSoftGoalEvaluation_in_entryRuleSoftGoalEvaluation2127);
            iv_ruleSoftGoalEvaluation=ruleSoftGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSoftGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSoftGoalEvaluation2137); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:991:1: ruleSoftGoalEvaluation returns [EObject current=null] : (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:994:28: ( (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:995:1: (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:995:1: (otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:995:3: otherlv_0= 'soft-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'difference' ( (lv_difference_13_0= ruleNumber ) )? otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_42_in_ruleSoftGoalEvaluation2174); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSoftGoalEvaluationAccess().getSoftGoalEvaluationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:999:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1000:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1000:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1001:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSoftGoalEvaluation2191); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleSoftGoalEvaluation2208); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getSoftGoalEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleSoftGoalEvaluation2220); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSoftGoalEvaluationAccess().getGoalKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1025:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1026:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1026:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1027:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getSoftGoalEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalEvaluationAccess().getGoalSoftGoalCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleSoftGoalEvaluation2243);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoalEvaluation2255); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getSoftGoalEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleSoftGoalEvaluation2267); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSoftGoalEvaluationAccess().getVerdictKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1048:1: ( (lv_verdict_7_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1049:1: (lv_verdict_7_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1049:1: (lv_verdict_7_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1050:3: lv_verdict_7_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSoftGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleSoftGoalEvaluation2288);
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoalEvaluation2300); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getSoftGoalEvaluationAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleSoftGoalEvaluation2312); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getSoftGoalEvaluationAccess().getReasonKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1074:1: ( (lv_reason_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1075:1: (lv_reason_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1075:1: (lv_reason_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1076:3: lv_reason_10_0= RULE_STRING
            {
            lv_reason_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSoftGoalEvaluation2329); if (state.failed) return current;
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleSoftGoalEvaluation2346); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getSoftGoalEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,44,FOLLOW_44_in_ruleSoftGoalEvaluation2358); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getSoftGoalEvaluationAccess().getDifferenceKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1100:1: ( (lv_difference_13_0= ruleNumber ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=RULE_INT && LA17_0<=RULE_EBIGDECIMAL)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1101:1: (lv_difference_13_0= ruleNumber )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1101:1: (lv_difference_13_0= ruleNumber )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1102:3: lv_difference_13_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getSoftGoalEvaluationAccess().getDifferenceNumberParserRuleCall_13_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumber_in_ruleSoftGoalEvaluation2379);
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

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleSoftGoalEvaluation2392); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1130:1: entryRuleHardGoalEvaluation returns [EObject current=null] : iv_ruleHardGoalEvaluation= ruleHardGoalEvaluation EOF ;
    public final EObject entryRuleHardGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHardGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1131:2: (iv_ruleHardGoalEvaluation= ruleHardGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1132:2: iv_ruleHardGoalEvaluation= ruleHardGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHardGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleHardGoalEvaluation_in_entryRuleHardGoalEvaluation2428);
            iv_ruleHardGoalEvaluation=ruleHardGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHardGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleHardGoalEvaluation2438); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1139:1: ruleHardGoalEvaluation returns [EObject current=null] : (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1142:28: ( (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1143:1: (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1143:1: (otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1143:3: otherlv_0= 'hard-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_45_in_ruleHardGoalEvaluation2475); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getHardGoalEvaluationAccess().getHardGoalEvaluationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1147:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1148:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1148:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1149:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleHardGoalEvaluation2492); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleHardGoalEvaluation2509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getHardGoalEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleHardGoalEvaluation2521); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getHardGoalEvaluationAccess().getGoalKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1173:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1174:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1174:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1175:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getHardGoalEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalEvaluationAccess().getGoalHardGoalCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleHardGoalEvaluation2544);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleHardGoalEvaluation2556); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getHardGoalEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleHardGoalEvaluation2568); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getHardGoalEvaluationAccess().getVerdictKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1196:1: ( (lv_verdict_7_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1197:1: (lv_verdict_7_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1197:1: (lv_verdict_7_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1198:3: lv_verdict_7_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleHardGoalEvaluation2589);
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleHardGoalEvaluation2601); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getHardGoalEvaluationAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleHardGoalEvaluation2613); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getHardGoalEvaluationAccess().getReasonKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1222:1: ( (lv_reason_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1223:1: (lv_reason_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1223:1: (lv_reason_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1224:3: lv_reason_10_0= RULE_STRING
            {
            lv_reason_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleHardGoalEvaluation2630); if (state.failed) return current;
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleHardGoalEvaluation2647); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getHardGoalEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleHardGoalEvaluation2659); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getHardGoalEvaluationAccess().getConditionEvaluationKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1248:1: ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1249:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1249:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1250:3: lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getHardGoalEvaluationAccess().getConditionEvaluationBooleanExpressionEvaluationParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_ruleHardGoalEvaluation2680);
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

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleHardGoalEvaluation2692); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1278:1: entryRuleCompositeGoalEvaluation returns [EObject current=null] : iv_ruleCompositeGoalEvaluation= ruleCompositeGoalEvaluation EOF ;
    public final EObject entryRuleCompositeGoalEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompositeGoalEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1279:2: (iv_ruleCompositeGoalEvaluation= ruleCompositeGoalEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1280:2: iv_ruleCompositeGoalEvaluation= ruleCompositeGoalEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCompositeGoalEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleCompositeGoalEvaluation_in_entryRuleCompositeGoalEvaluation2728);
            iv_ruleCompositeGoalEvaluation=ruleCompositeGoalEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCompositeGoalEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCompositeGoalEvaluation2738); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1287:1: ruleCompositeGoalEvaluation returns [EObject current=null] : (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1290:28: ( (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1291:1: (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1291:1: (otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1291:3: otherlv_0= 'composite-goal-evaluation' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'goal' ( ( ruleQualifiedName ) ) otherlv_5= ',' otherlv_6= 'verdict' ( (lv_verdict_7_0= ruleVerdict ) ) otherlv_8= ',' otherlv_9= 'reason' ( (lv_reason_10_0= RULE_STRING ) ) otherlv_11= ',' otherlv_12= 'condition-evaluation' ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,47,FOLLOW_47_in_ruleCompositeGoalEvaluation2775); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCompositeGoalEvaluationAccess().getCompositeGoalEvaluationKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1295:1: ( (lv_name_1_0= RULE_ID ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1296:1: (lv_name_1_0= RULE_ID )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1296:1: (lv_name_1_0= RULE_ID )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1297:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCompositeGoalEvaluation2792); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleCompositeGoalEvaluation2809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getCompositeGoalEvaluationAccess().getLeftCurlyBracketKeyword_2());
                  
            }
            otherlv_3=(Token)match(input,43,FOLLOW_43_in_ruleCompositeGoalEvaluation2821); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCompositeGoalEvaluationAccess().getGoalKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1321:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1322:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1322:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1323:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getCompositeGoalEvaluationRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalEvaluationAccess().getGoalCompositeGoalCrossReference_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleCompositeGoalEvaluation2844);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoalEvaluation2856); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCompositeGoalEvaluationAccess().getCommaKeyword_5());
                  
            }
            otherlv_6=(Token)match(input,39,FOLLOW_39_in_ruleCompositeGoalEvaluation2868); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getCompositeGoalEvaluationAccess().getVerdictKeyword_6());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1344:1: ( (lv_verdict_7_0= ruleVerdict ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1345:1: (lv_verdict_7_0= ruleVerdict )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1345:1: (lv_verdict_7_0= ruleVerdict )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1346:3: lv_verdict_7_0= ruleVerdict
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalEvaluationAccess().getVerdictVerdictEnumRuleCall_7_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleVerdict_in_ruleCompositeGoalEvaluation2889);
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

            otherlv_8=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoalEvaluation2901); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getCompositeGoalEvaluationAccess().getCommaKeyword_8());
                  
            }
            otherlv_9=(Token)match(input,40,FOLLOW_40_in_ruleCompositeGoalEvaluation2913); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getCompositeGoalEvaluationAccess().getReasonKeyword_9());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1370:1: ( (lv_reason_10_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1371:1: (lv_reason_10_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1371:1: (lv_reason_10_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1372:3: lv_reason_10_0= RULE_STRING
            {
            lv_reason_10_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleCompositeGoalEvaluation2930); if (state.failed) return current;
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

            otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleCompositeGoalEvaluation2947); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getCompositeGoalEvaluationAccess().getCommaKeyword_11());
                  
            }
            otherlv_12=(Token)match(input,46,FOLLOW_46_in_ruleCompositeGoalEvaluation2959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getCompositeGoalEvaluationAccess().getConditionEvaluationKeyword_12());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1396:1: ( (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1397:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1397:1: (lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1398:3: lv_conditionEvaluation_13_0= ruleBooleanExpressionEvaluation
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCompositeGoalEvaluationAccess().getConditionEvaluationBooleanExpressionEvaluationParserRuleCall_13_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_ruleCompositeGoalEvaluation2980);
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

            otherlv_14=(Token)match(input,25,FOLLOW_25_in_ruleCompositeGoalEvaluation2992); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1426:1: entryRuleValueExpressionEvaluation returns [EObject current=null] : iv_ruleValueExpressionEvaluation= ruleValueExpressionEvaluation EOF ;
    public final EObject entryRuleValueExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1427:2: (iv_ruleValueExpressionEvaluation= ruleValueExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1428:2: iv_ruleValueExpressionEvaluation= ruleValueExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_entryRuleValueExpressionEvaluation3028);
            iv_ruleValueExpressionEvaluation=ruleValueExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueExpressionEvaluation3038); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1435:1: ruleValueExpressionEvaluation returns [EObject current=null] : (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation ) ;
    public final EObject ruleValueExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject this_ValueSpecificationExpressionEvaluation_0 = null;

        EObject this_BooleanExpressionEvaluation_1 = null;

        EObject this_NumberExpressionEvaluation_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1438:28: ( (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1439:1: (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1439:1: (this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation | this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation | this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 48:
                {
                alt18=1;
                }
                break;
            case 51:
                {
                alt18=2;
                }
                break;
            case 52:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1440:5: this_ValueSpecificationExpressionEvaluation_0= ruleValueSpecificationExpressionEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionEvaluationAccess().getValueSpecificationExpressionEvaluationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleValueSpecificationExpressionEvaluation_in_ruleValueExpressionEvaluation3085);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1450:5: this_BooleanExpressionEvaluation_1= ruleBooleanExpressionEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionEvaluationAccess().getBooleanExpressionEvaluationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_ruleValueExpressionEvaluation3112);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1460:5: this_NumberExpressionEvaluation_2= ruleNumberExpressionEvaluation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueExpressionEvaluationAccess().getNumberExpressionEvaluationParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_ruleValueExpressionEvaluation3139);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1476:1: entryRuleValueSpecificationExpressionEvaluation returns [EObject current=null] : iv_ruleValueSpecificationExpressionEvaluation= ruleValueSpecificationExpressionEvaluation EOF ;
    public final EObject entryRuleValueSpecificationExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecificationExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1477:2: (iv_ruleValueSpecificationExpressionEvaluation= ruleValueSpecificationExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1478:2: iv_ruleValueSpecificationExpressionEvaluation= ruleValueSpecificationExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecificationExpressionEvaluation_in_entryRuleValueSpecificationExpressionEvaluation3174);
            iv_ruleValueSpecificationExpressionEvaluation=ruleValueSpecificationExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecificationExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecificationExpressionEvaluation3184); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1485:1: ruleValueSpecificationExpressionEvaluation returns [EObject current=null] : (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1488:28: ( (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1489:1: (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1489:1: (otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1489:3: otherlv_0= 'value-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleValueSpecification ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,48,FOLLOW_48_in_ruleValueSpecificationExpressionEvaluation3221); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getValueEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleValueSpecificationExpressionEvaluation3233); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleValueSpecificationExpressionEvaluation3245); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getResultKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1501:1: ( (lv_result_3_0= ruleValueSpecification ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_EBIGDECIMAL)||LA19_0==57) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1502:1: (lv_result_3_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1502:1: (lv_result_3_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1503:3: lv_result_3_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getValueSpecificationExpressionEvaluationAccess().getResultValueSpecificationParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleValueSpecificationExpressionEvaluation3266);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleValueSpecificationExpressionEvaluation3279); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleValueSpecificationExpressionEvaluation3291); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getReasonKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1527:1: ( (lv_reason_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1528:1: (lv_reason_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1528:1: (lv_reason_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1529:3: lv_reason_6_0= RULE_STRING
            {
            lv_reason_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueSpecificationExpressionEvaluation3308); if (state.failed) return current;
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1545:2: (otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==20) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1545:4: otherlv_7= ',' otherlv_8= 'evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleValueSpecificationExpressionEvaluation3326); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,50,FOLLOW_50_in_ruleValueSpecificationExpressionEvaluation3338); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getEvaluationsKeyword_7_1());
                          
                    }
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleValueSpecificationExpressionEvaluation3350); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1557:1: ( (lv_evaluations_10_0= ruleValueExpressionEvaluation ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==48||(LA20_0>=51 && LA20_0<=52)) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1558:1: (lv_evaluations_10_0= ruleValueExpressionEvaluation )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1558:1: (lv_evaluations_10_0= ruleValueExpressionEvaluation )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1559:3: lv_evaluations_10_0= ruleValueExpressionEvaluation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getValueSpecificationExpressionEvaluationAccess().getEvaluationsValueExpressionEvaluationParserRuleCall_7_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_ruleValueSpecificationExpressionEvaluation3371);
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
                    	    break loop20;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleValueSpecificationExpressionEvaluation3384); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getValueSpecificationExpressionEvaluationAccess().getRightSquareBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleValueSpecificationExpressionEvaluation3398); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1591:1: entryRuleBooleanExpressionEvaluation returns [EObject current=null] : iv_ruleBooleanExpressionEvaluation= ruleBooleanExpressionEvaluation EOF ;
    public final EObject entryRuleBooleanExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1592:2: (iv_ruleBooleanExpressionEvaluation= ruleBooleanExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1593:2: iv_ruleBooleanExpressionEvaluation= ruleBooleanExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanExpressionEvaluation_in_entryRuleBooleanExpressionEvaluation3434);
            iv_ruleBooleanExpressionEvaluation=ruleBooleanExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanExpressionEvaluation3444); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1600:1: ruleBooleanExpressionEvaluation returns [EObject current=null] : (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1603:28: ( (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1604:1: (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1604:1: (otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1604:3: otherlv_0= 'expression-evaluation' otherlv_1= '{' (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )? otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )? (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )? otherlv_15= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_51_in_ruleBooleanExpressionEvaluation3481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBooleanExpressionEvaluationAccess().getExpressionEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleBooleanExpressionEvaluation3493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBooleanExpressionEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1612:1: (otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==49) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1612:3: otherlv_2= 'result' ( (lv_result_3_0= ruleBooleanLiteral ) )? otherlv_4= ','
                    {
                    otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleBooleanExpressionEvaluation3506); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getBooleanExpressionEvaluationAccess().getResultKeyword_2_0());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1616:1: ( (lv_result_3_0= ruleBooleanLiteral ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==RULE_EBOOLEAN) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1617:1: (lv_result_3_0= ruleBooleanLiteral )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1617:1: (lv_result_3_0= ruleBooleanLiteral )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1618:3: lv_result_3_0= ruleBooleanLiteral
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBooleanExpressionEvaluationAccess().getResultBooleanLiteralParserRuleCall_2_1_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanExpressionEvaluation3527);
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

                    otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleBooleanExpressionEvaluation3540); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_2_2());
                          
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleBooleanExpressionEvaluation3554); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBooleanExpressionEvaluationAccess().getReasonKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1642:1: ( (lv_reason_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1643:1: (lv_reason_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1643:1: (lv_reason_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1644:3: lv_reason_6_0= RULE_STRING
            {
            lv_reason_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleBooleanExpressionEvaluation3571); if (state.failed) return current;
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1660:2: (otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )? )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==20) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==44) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1660:4: otherlv_7= ',' otherlv_8= 'difference' ( (lv_difference_9_0= ruleNumber ) )?
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleBooleanExpressionEvaluation3589); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_5_0());
                          
                    }
                    otherlv_8=(Token)match(input,44,FOLLOW_44_in_ruleBooleanExpressionEvaluation3601); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getBooleanExpressionEvaluationAccess().getDifferenceKeyword_5_1());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1668:1: ( (lv_difference_9_0= ruleNumber ) )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=RULE_INT && LA24_0<=RULE_EBIGDECIMAL)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1669:1: (lv_difference_9_0= ruleNumber )
                            {
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1669:1: (lv_difference_9_0= ruleNumber )
                            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1670:3: lv_difference_9_0= ruleNumber
                            {
                            if ( state.backtracking==0 ) {
                               
                              	        newCompositeNode(grammarAccess.getBooleanExpressionEvaluationAccess().getDifferenceNumberParserRuleCall_5_2_0()); 
                              	    
                            }
                            pushFollow(FOLLOW_ruleNumber_in_ruleBooleanExpressionEvaluation3622);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1686:5: (otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==20) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1686:7: otherlv_10= ',' otherlv_11= 'evaluations' otherlv_12= '[' ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )* otherlv_14= ']'
                    {
                    otherlv_10=(Token)match(input,20,FOLLOW_20_in_ruleBooleanExpressionEvaluation3638); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_10, grammarAccess.getBooleanExpressionEvaluationAccess().getCommaKeyword_6_0());
                          
                    }
                    otherlv_11=(Token)match(input,50,FOLLOW_50_in_ruleBooleanExpressionEvaluation3650); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getBooleanExpressionEvaluationAccess().getEvaluationsKeyword_6_1());
                          
                    }
                    otherlv_12=(Token)match(input,22,FOLLOW_22_in_ruleBooleanExpressionEvaluation3662); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_12, grammarAccess.getBooleanExpressionEvaluationAccess().getLeftSquareBracketKeyword_6_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1698:1: ( (lv_evaluations_13_0= ruleValueExpressionEvaluation ) )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( (LA26_0==48||(LA26_0>=51 && LA26_0<=52)) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1699:1: (lv_evaluations_13_0= ruleValueExpressionEvaluation )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1699:1: (lv_evaluations_13_0= ruleValueExpressionEvaluation )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1700:3: lv_evaluations_13_0= ruleValueExpressionEvaluation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getBooleanExpressionEvaluationAccess().getEvaluationsValueExpressionEvaluationParserRuleCall_6_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueExpressionEvaluation_in_ruleBooleanExpressionEvaluation3683);
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
                    	    break loop26;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,23,FOLLOW_23_in_ruleBooleanExpressionEvaluation3696); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_14, grammarAccess.getBooleanExpressionEvaluationAccess().getRightSquareBracketKeyword_6_4());
                          
                    }

                    }
                    break;

            }

            otherlv_15=(Token)match(input,25,FOLLOW_25_in_ruleBooleanExpressionEvaluation3710); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1732:1: entryRuleNumberExpressionEvaluation returns [EObject current=null] : iv_ruleNumberExpressionEvaluation= ruleNumberExpressionEvaluation EOF ;
    public final EObject entryRuleNumberExpressionEvaluation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpressionEvaluation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1733:2: (iv_ruleNumberExpressionEvaluation= ruleNumberExpressionEvaluation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1734:2: iv_ruleNumberExpressionEvaluation= ruleNumberExpressionEvaluation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionEvaluationRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_entryRuleNumberExpressionEvaluation3746);
            iv_ruleNumberExpressionEvaluation=ruleNumberExpressionEvaluation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpressionEvaluation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpressionEvaluation3756); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1741:1: ruleNumberExpressionEvaluation returns [EObject current=null] : (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1744:28: ( (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1745:1: (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1745:1: (otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1745:3: otherlv_0= 'arithmetic-evaluation' otherlv_1= '{' otherlv_2= 'result' ( (lv_result_3_0= ruleNumberLiteral ) )? otherlv_4= ',' otherlv_5= 'reason' ( (lv_reason_6_0= RULE_STRING ) ) (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )? otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_52_in_ruleNumberExpressionEvaluation3793); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNumberExpressionEvaluationAccess().getArithmeticEvaluationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleNumberExpressionEvaluation3805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNumberExpressionEvaluationAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            otherlv_2=(Token)match(input,49,FOLLOW_49_in_ruleNumberExpressionEvaluation3817); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getNumberExpressionEvaluationAccess().getResultKeyword_2());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1757:1: ( (lv_result_3_0= ruleNumberLiteral ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_INT && LA28_0<=RULE_EBIGDECIMAL)) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1758:1: (lv_result_3_0= ruleNumberLiteral )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1758:1: (lv_result_3_0= ruleNumberLiteral )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1759:3: lv_result_3_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getNumberExpressionEvaluationAccess().getResultNumberLiteralParserRuleCall_3_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpressionEvaluation3838);
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

            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleNumberExpressionEvaluation3851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getNumberExpressionEvaluationAccess().getCommaKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleNumberExpressionEvaluation3863); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getNumberExpressionEvaluationAccess().getReasonKeyword_5());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1783:1: ( (lv_reason_6_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1784:1: (lv_reason_6_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1784:1: (lv_reason_6_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1785:3: lv_reason_6_0= RULE_STRING
            {
            lv_reason_6_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleNumberExpressionEvaluation3880); if (state.failed) return current;
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1801:2: (otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==20) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1801:4: otherlv_7= ',' otherlv_8= 'arithmetic-evaluations' otherlv_9= '[' ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )* otherlv_11= ']'
                    {
                    otherlv_7=(Token)match(input,20,FOLLOW_20_in_ruleNumberExpressionEvaluation3898); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_7, grammarAccess.getNumberExpressionEvaluationAccess().getCommaKeyword_7_0());
                          
                    }
                    otherlv_8=(Token)match(input,53,FOLLOW_53_in_ruleNumberExpressionEvaluation3910); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_8, grammarAccess.getNumberExpressionEvaluationAccess().getArithmeticEvaluationsKeyword_7_1());
                          
                    }
                    otherlv_9=(Token)match(input,22,FOLLOW_22_in_ruleNumberExpressionEvaluation3922); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getNumberExpressionEvaluationAccess().getLeftSquareBracketKeyword_7_2());
                          
                    }
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1813:1: ( (lv_evaluations_10_0= ruleNumberExpressionEvaluation ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==52) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1814:1: (lv_evaluations_10_0= ruleNumberExpressionEvaluation )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1814:1: (lv_evaluations_10_0= ruleNumberExpressionEvaluation )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1815:3: lv_evaluations_10_0= ruleNumberExpressionEvaluation
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getNumberExpressionEvaluationAccess().getEvaluationsNumberExpressionEvaluationParserRuleCall_7_3_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleNumberExpressionEvaluation_in_ruleNumberExpressionEvaluation3943);
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
                    	    break loop29;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,23,FOLLOW_23_in_ruleNumberExpressionEvaluation3956); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getNumberExpressionEvaluationAccess().getRightSquareBracketKeyword_7_4());
                          
                    }

                    }
                    break;

            }

            otherlv_12=(Token)match(input,25,FOLLOW_25_in_ruleNumberExpressionEvaluation3970); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1847:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1848:2: (iv_ruleExpression= ruleExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1849:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_entryRuleExpression4006);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExpression4016); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1856:1: ruleExpression returns [EObject current=null] : this_Implication_0= ruleImplication ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_Implication_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1859:28: (this_Implication_0= ruleImplication )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1861:5: this_Implication_0= ruleImplication
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getExpressionAccess().getImplicationParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImplication_in_ruleExpression4062);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1877:1: entryRuleImplication returns [EObject current=null] : iv_ruleImplication= ruleImplication EOF ;
    public final EObject entryRuleImplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplication = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1878:2: (iv_ruleImplication= ruleImplication EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1879:2: iv_ruleImplication= ruleImplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationRule()); 
            }
            pushFollow(FOLLOW_ruleImplication_in_entryRuleImplication4096);
            iv_ruleImplication=ruleImplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplication; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplication4106); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1886:1: ruleImplication returns [EObject current=null] : (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) ;
    public final EObject ruleImplication() throws RecognitionException {
        EObject current = null;

        EObject this_Disjunction_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1889:28: ( (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1890:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1890:1: (this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1891:5: this_Disjunction_0= ruleDisjunction ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImplicationAccess().getDisjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4153);
            this_Disjunction_0=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Disjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1899:1: ( () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=64 && LA31_0<=65)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1899:2: () ( (lv_operator_2_0= ruleImplicationOperator ) ) ( (lv_right_3_0= ruleDisjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1899:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1900:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getImplicationAccess().getImplicationLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1905:2: ( (lv_operator_2_0= ruleImplicationOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1906:1: (lv_operator_2_0= ruleImplicationOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1906:1: (lv_operator_2_0= ruleImplicationOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1907:3: lv_operator_2_0= ruleImplicationOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getOperatorImplicationOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleImplicationOperator_in_ruleImplication4183);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1923:2: ( (lv_right_3_0= ruleDisjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1924:1: (lv_right_3_0= ruleDisjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1924:1: (lv_right_3_0= ruleDisjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1925:3: lv_right_3_0= ruleDisjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getImplicationAccess().getRightDisjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDisjunction_in_ruleImplication4204);
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
    // $ANTLR end "ruleImplication"


    // $ANTLR start "entryRuleDisjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1949:1: entryRuleDisjunction returns [EObject current=null] : iv_ruleDisjunction= ruleDisjunction EOF ;
    public final EObject entryRuleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1950:2: (iv_ruleDisjunction= ruleDisjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1951:2: iv_ruleDisjunction= ruleDisjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleDisjunction_in_entryRuleDisjunction4242);
            iv_ruleDisjunction=ruleDisjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDisjunction4252); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1958:1: ruleDisjunction returns [EObject current=null] : (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) ;
    public final EObject ruleDisjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Conjunction_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1961:28: ( (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1962:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1962:1: (this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1963:5: this_Conjunction_0= ruleConjunction ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getDisjunctionAccess().getConjunctionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4299);
            this_Conjunction_0=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Conjunction_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1971:1: ( () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=58 && LA33_0<=61)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1971:2: () ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) ) ( (lv_right_3_0= ruleConjunction ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1971:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1972:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getDisjunctionAccess().getDisjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1977:2: ( ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1978:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1978:1: ( (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1979:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1979:1: (lv_operator_2_1= ruleOrOperator | lv_operator_2_2= ruleXOrOperator )
            	    int alt32=2;
            	    int LA32_0 = input.LA(1);

            	    if ( ((LA32_0>=58 && LA32_0<=59)) ) {
            	        alt32=1;
            	    }
            	    else if ( ((LA32_0>=60 && LA32_0<=61)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1980:3: lv_operator_2_1= ruleOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorOrOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleOrOperator_in_ruleDisjunction4331);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:1995:8: lv_operator_2_2= ruleXOrOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getDisjunctionAccess().getOperatorXOrOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleXOrOperator_in_ruleDisjunction4350);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2013:2: ( (lv_right_3_0= ruleConjunction ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2014:1: (lv_right_3_0= ruleConjunction )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2014:1: (lv_right_3_0= ruleConjunction )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2015:3: lv_right_3_0= ruleConjunction
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getDisjunctionAccess().getRightConjunctionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleConjunction_in_ruleDisjunction4374);
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
    // $ANTLR end "ruleDisjunction"


    // $ANTLR start "entryRuleConjunction"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2039:1: entryRuleConjunction returns [EObject current=null] : iv_ruleConjunction= ruleConjunction EOF ;
    public final EObject entryRuleConjunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2040:2: (iv_ruleConjunction= ruleConjunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2041:2: iv_ruleConjunction= ruleConjunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionRule()); 
            }
            pushFollow(FOLLOW_ruleConjunction_in_entryRuleConjunction4412);
            iv_ruleConjunction=ruleConjunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleConjunction4422); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2048:1: ruleConjunction returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleConjunction() throws RecognitionException {
        EObject current = null;

        EObject this_Comparison_0 = null;

        EObject lv_operator_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2051:28: ( (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2052:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2052:1: (this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2053:5: this_Comparison_0= ruleComparison ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getConjunctionAccess().getComparisonParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4469);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_Comparison_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2061:1: ( () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=62 && LA34_0<=63)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2061:2: () ( (lv_operator_2_0= ruleAndOperator ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2061:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2062:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getConjunctionAccess().getConjunctionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2067:2: ( (lv_operator_2_0= ruleAndOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2068:1: (lv_operator_2_0= ruleAndOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2068:1: (lv_operator_2_0= ruleAndOperator )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2069:3: lv_operator_2_0= ruleAndOperator
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getOperatorAndOperatorParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndOperator_in_ruleConjunction4499);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2085:2: ( (lv_right_3_0= ruleComparison ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2086:1: (lv_right_3_0= ruleComparison )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2086:1: (lv_right_3_0= ruleComparison )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2087:3: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getConjunctionAccess().getRightComparisonParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparison_in_ruleConjunction4520);
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
    // $ANTLR end "ruleConjunction"


    // $ANTLR start "entryRuleComparison"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2111:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2112:2: (iv_ruleComparison= ruleComparison EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2113:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_ruleComparison_in_entryRuleComparison4558);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparison4568); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2120:1: ruleComparison returns [EObject current=null] : (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanUnit_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2123:28: ( (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2124:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2124:1: (this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2125:5: this_BooleanUnit_0= ruleBooleanUnit ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getComparisonAccess().getBooleanUnitParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison4615);
            this_BooleanUnit_0=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_BooleanUnit_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2133:1: ( () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=66 && LA36_0<=68)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2133:2: () ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) ) ( (lv_right_3_0= ruleBooleanUnit ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2133:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2134:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2139:2: ( ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2140:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2140:1: ( (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2141:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2141:1: (lv_operator_2_1= ruleEqualsOperator | lv_operator_2_2= ruleNotEqualsOperator )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==66) ) {
            	        alt35=1;
            	    }
            	    else if ( ((LA35_0>=67 && LA35_0<=68)) ) {
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2142:3: lv_operator_2_1= ruleEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorEqualsOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleEqualsOperator_in_ruleComparison4647);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2157:8: lv_operator_2_2= ruleNotEqualsOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getComparisonAccess().getOperatorNotEqualsOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleNotEqualsOperator_in_ruleComparison4666);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2175:2: ( (lv_right_3_0= ruleBooleanUnit ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2176:1: (lv_right_3_0= ruleBooleanUnit )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2176:1: (lv_right_3_0= ruleBooleanUnit )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2177:3: lv_right_3_0= ruleBooleanUnit
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getComparisonAccess().getRightBooleanUnitParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleBooleanUnit_in_ruleComparison4690);
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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleBooleanUnit"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2201:1: entryRuleBooleanUnit returns [EObject current=null] : iv_ruleBooleanUnit= ruleBooleanUnit EOF ;
    public final EObject entryRuleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanUnit = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2202:2: (iv_ruleBooleanUnit= ruleBooleanUnit EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2203:2: iv_ruleBooleanUnit= ruleBooleanUnit EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanUnitRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit4728);
            iv_ruleBooleanUnit=ruleBooleanUnit();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanUnit; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanUnit4738); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2210:1: ruleBooleanUnit returns [EObject current=null] : (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) ;
    public final EObject ruleBooleanUnit() throws RecognitionException {
        EObject current = null;

        EObject this_Negation_0 = null;

        EObject this_RelationalExpression_1 = null;

        EObject this_BooleanLiteral_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2213:28: ( (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2214:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2214:1: (this_Negation_0= ruleNegation | this_RelationalExpression_1= ruleRelationalExpression | this_BooleanLiteral_2= ruleBooleanLiteral )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 69:
            case 70:
                {
                alt37=1;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_NULL:
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
            case 54:
            case 57:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
                {
                alt37=2;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt37=3;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2215:5: this_Negation_0= ruleNegation
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getNegationParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNegation_in_ruleBooleanUnit4785);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2225:5: this_RelationalExpression_1= ruleRelationalExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getRelationalExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit4812);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2235:5: this_BooleanLiteral_2= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getBooleanUnitAccess().getBooleanLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit4839);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2251:1: entryRuleNegation returns [EObject current=null] : iv_ruleNegation= ruleNegation EOF ;
    public final EObject entryRuleNegation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNegation = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2252:2: (iv_ruleNegation= ruleNegation EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2253:2: iv_ruleNegation= ruleNegation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNegationRule()); 
            }
            pushFollow(FOLLOW_ruleNegation_in_entryRuleNegation4874);
            iv_ruleNegation=ruleNegation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNegation; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNegation4884); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2260:1: ruleNegation returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) ;
    public final EObject ruleNegation() throws RecognitionException {
        EObject current = null;

        EObject lv_operator_0_0 = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2263:28: ( ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2264:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2264:1: ( ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2264:2: ( (lv_operator_0_0= ruleNotOperator ) ) ( (lv_value_1_0= ruleBooleanUnit ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2264:2: ( (lv_operator_0_0= ruleNotOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2265:1: (lv_operator_0_0= ruleNotOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2265:1: (lv_operator_0_0= ruleNotOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2266:3: lv_operator_0_0= ruleNotOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getOperatorNotOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNotOperator_in_ruleNegation4930);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2282:2: ( (lv_value_1_0= ruleBooleanUnit ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2283:1: (lv_value_1_0= ruleBooleanUnit )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2283:1: (lv_value_1_0= ruleBooleanUnit )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2284:3: lv_value_1_0= ruleBooleanUnit
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNegationAccess().getValueBooleanUnitParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBooleanUnit_in_ruleNegation4951);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2308:1: entryRuleRelationalExpression returns [EObject current=null] : iv_ruleRelationalExpression= ruleRelationalExpression EOF ;
    public final EObject entryRuleRelationalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRelationalExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2309:2: (iv_ruleRelationalExpression= ruleRelationalExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2310:2: iv_ruleRelationalExpression= ruleRelationalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRelationalExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression4987);
            iv_ruleRelationalExpression=ruleRelationalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRelationalExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRelationalExpression4997); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2317:1: ruleRelationalExpression returns [EObject current=null] : (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2320:28: ( (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2321:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2321:1: (this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2322:5: this_ComparableExpression_0= ruleComparableExpression ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getRelationalExpressionAccess().getComparableExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5044);
            this_ComparableExpression_0=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ComparableExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:1: ( ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=71 && LA39_0<=74)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) ) ( (lv_right_9_0= ruleComparableExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:2: ( ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) ) | ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) ) | ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) ) | ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) ) )
            	    int alt38=4;
            	    switch ( input.LA(1) ) {
            	    case 71:
            	        {
            	        alt38=1;
            	        }
            	        break;
            	    case 72:
            	        {
            	        alt38=2;
            	        }
            	        break;
            	    case 74:
            	        {
            	        alt38=3;
            	        }
            	        break;
            	    case 73:
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:3: ( () ( (lv_operator_2_0= ruleGreaterThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:4: () ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2330:4: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2331:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2336:2: ( (lv_operator_2_0= ruleGreaterThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2337:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2337:1: (lv_operator_2_0= ruleGreaterThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2338:3: lv_operator_2_0= ruleGreaterThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterThanOperatorParserRuleCall_1_0_0_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5076);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2355:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2355:6: ( () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2355:7: () ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2355:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2356:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2361:2: ( (lv_operator_4_0= ruleGreaterOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2362:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2362:1: (lv_operator_4_0= ruleGreaterOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2363:3: lv_operator_4_0= ruleGreaterOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorGreaterOrEqualThanOperatorParserRuleCall_1_0_1_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5114);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2380:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2380:6: ( () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2380:7: () ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2380:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2381:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_2_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2386:2: ( (lv_operator_6_0= ruleLessOrEqualThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2387:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2387:1: (lv_operator_6_0= ruleLessOrEqualThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2388:3: lv_operator_6_0= ruleLessOrEqualThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessOrEqualThanOperatorParserRuleCall_1_0_2_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5152);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2405:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2405:6: ( () ( (lv_operator_8_0= ruleLessThanOperator ) ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2405:7: () ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2405:7: ()
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2406:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getRelationalExpressionAccess().getRelationalExpressionLeftAction_1_0_3_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2411:2: ( (lv_operator_8_0= ruleLessThanOperator ) )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2412:1: (lv_operator_8_0= ruleLessThanOperator )
            	            {
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2412:1: (lv_operator_8_0= ruleLessThanOperator )
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2413:3: lv_operator_8_0= ruleLessThanOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getOperatorLessThanOperatorParserRuleCall_1_0_3_1_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5190);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2429:4: ( (lv_right_9_0= ruleComparableExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2430:1: (lv_right_9_0= ruleComparableExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2430:1: (lv_right_9_0= ruleComparableExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2431:3: lv_right_9_0= ruleComparableExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRelationalExpressionAccess().getRightComparableExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5213);
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
    // $ANTLR end "ruleRelationalExpression"


    // $ANTLR start "entryRuleComparableExpression"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2455:1: entryRuleComparableExpression returns [EObject current=null] : iv_ruleComparableExpression= ruleComparableExpression EOF ;
    public final EObject entryRuleComparableExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparableExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2456:2: (iv_ruleComparableExpression= ruleComparableExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2457:2: iv_ruleComparableExpression= ruleComparableExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparableExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5251);
            iv_ruleComparableExpression=ruleComparableExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparableExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleComparableExpression5261); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2464:1: ruleComparableExpression returns [EObject current=null] : (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2467:28: ( (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2468:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2468:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )
            int alt40=7;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2469:5: this_ArithmeticExpression_0= ruleArithmeticExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getArithmeticExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5308);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2479:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5335);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2489:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5362);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2499:5: this_NullLiteral_3= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getNullLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleComparableExpression5389);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2509:5: this_StringLiteral_4= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getStringLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleComparableExpression5416);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2519:5: this_UnlimitedLiteral_5= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getUnlimitedLiteralParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5443);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2529:5: this_ParenthesizedExpression_6= ruleParenthesizedExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getComparableExpressionAccess().getParenthesizedExpressionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5470);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2545:1: entryRuleArithmeticExpression returns [EObject current=null] : iv_ruleArithmeticExpression= ruleArithmeticExpression EOF ;
    public final EObject entryRuleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArithmeticExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2546:2: (iv_ruleArithmeticExpression= ruleArithmeticExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2547:2: iv_ruleArithmeticExpression= ruleArithmeticExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArithmeticExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5505);
            iv_ruleArithmeticExpression=ruleArithmeticExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArithmeticExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArithmeticExpression5515); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2554:1: ruleArithmeticExpression returns [EObject current=null] : this_AdditiveExpression_0= ruleAdditiveExpression ;
    public final EObject ruleArithmeticExpression() throws RecognitionException {
        EObject current = null;

        EObject this_AdditiveExpression_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2557:28: (this_AdditiveExpression_0= ruleAdditiveExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2559:5: this_AdditiveExpression_0= ruleAdditiveExpression
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArithmeticExpressionAccess().getAdditiveExpressionParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5561);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2575:1: entryRuleAdditiveExpression returns [EObject current=null] : iv_ruleAdditiveExpression= ruleAdditiveExpression EOF ;
    public final EObject entryRuleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditiveExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2576:2: (iv_ruleAdditiveExpression= ruleAdditiveExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2577:2: iv_ruleAdditiveExpression= ruleAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5595);
            iv_ruleAdditiveExpression=ruleAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditiveExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditiveExpression5605); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2584:1: ruleAdditiveExpression returns [EObject current=null] : (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject this_MultiplicativeExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2587:28: ( (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2588:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2588:1: (this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2589:5: this_MultiplicativeExpression_0= ruleMultiplicativeExpression ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getMultiplicativeExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5652);
            this_MultiplicativeExpression_0=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MultiplicativeExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2597:1: ( () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=75 && LA42_0<=76)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2597:2: () ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) ) ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2597:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2598:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAdditiveExpressionAccess().getAdditiveExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2603:2: ( ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2604:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2604:1: ( (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2605:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2605:1: (lv_operator_2_1= ruleSubstractionOperator | lv_operator_2_2= ruleAdditionOperator )
            	    int alt41=2;
            	    int LA41_0 = input.LA(1);

            	    if ( (LA41_0==76) ) {
            	        alt41=1;
            	    }
            	    else if ( (LA41_0==75) ) {
            	        alt41=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 41, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt41) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2606:3: lv_operator_2_1= ruleSubstractionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorSubstractionOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression5684);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2621:8: lv_operator_2_2= ruleAdditionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getOperatorAdditionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression5703);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2639:2: ( (lv_right_3_0= ruleMultiplicativeExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2640:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2640:1: (lv_right_3_0= ruleMultiplicativeExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2641:3: lv_right_3_0= ruleMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAdditiveExpressionAccess().getRightMultiplicativeExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5727);
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
            	    break loop42;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2665:1: entryRuleMultiplicativeExpression returns [EObject current=null] : iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF ;
    public final EObject entryRuleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicativeExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2666:2: (iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2667:2: iv_ruleMultiplicativeExpression= ruleMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression5765);
            iv_ruleMultiplicativeExpression=ruleMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicativeExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicativeExpression5775); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2674:1: ruleMultiplicativeExpression returns [EObject current=null] : (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) ;
    public final EObject ruleMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberExpression_0 = null;

        EObject lv_operator_2_1 = null;

        EObject lv_operator_2_2 = null;

        EObject lv_operator_2_3 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2677:28: ( (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2678:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2678:1: (this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2679:5: this_NumberExpression_0= ruleNumberExpression ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getNumberExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression5822);
            this_NumberExpression_0=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_NumberExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2687:1: ( () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==57||(LA44_0>=77 && LA44_0<=78)) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2687:2: () ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) ) ( (lv_right_3_0= ruleNumberExpression ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2687:2: ()
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2688:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getMultiplicativeExpressionAccess().getMultiplicativeExpressionLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2693:2: ( ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2694:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2694:1: ( (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2695:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2695:1: (lv_operator_2_1= ruleMultiplicationOperator | lv_operator_2_2= ruleDivisionOperator | lv_operator_2_3= ruleModulusOperator )
            	    int alt43=3;
            	    switch ( input.LA(1) ) {
            	    case 57:
            	        {
            	        alt43=1;
            	        }
            	        break;
            	    case 77:
            	        {
            	        alt43=2;
            	        }
            	        break;
            	    case 78:
            	        {
            	        alt43=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 43, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt43) {
            	        case 1 :
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2696:3: lv_operator_2_1= ruleMultiplicationOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorMultiplicationOperatorParserRuleCall_1_1_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression5854);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2711:8: lv_operator_2_2= ruleDivisionOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorDivisionOperatorParserRuleCall_1_1_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression5873);
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
            	            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2726:8: lv_operator_2_3= ruleModulusOperator
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getOperatorModulusOperatorParserRuleCall_1_1_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression5892);
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

            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2744:2: ( (lv_right_3_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2745:1: (lv_right_3_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2745:1: (lv_right_3_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2746:3: lv_right_3_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMultiplicativeExpressionAccess().getRightNumberExpressionParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression5916);
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
            	    break loop44;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2770:1: entryRuleNumberExpression returns [EObject current=null] : iv_ruleNumberExpression= ruleNumberExpression EOF ;
    public final EObject entryRuleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2771:2: (iv_ruleNumberExpression= ruleNumberExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2772:2: iv_ruleNumberExpression= ruleNumberExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression5954);
            iv_ruleNumberExpression=ruleNumberExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberExpression5964); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2779:1: ruleNumberExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) ;
    public final EObject ruleNumberExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_NumberFunction_1 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2782:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2783:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2783:1: (this_NumberLiteral_0= ruleNumberLiteral | this_NumberFunction_1= ruleNumberFunction )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( ((LA45_0>=RULE_INT && LA45_0<=RULE_EBIGDECIMAL)) ) {
                alt45=1;
            }
            else if ( ((LA45_0>=79 && LA45_0<=86)) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2784:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleNumberExpression6011);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2794:5: this_NumberFunction_1= ruleNumberFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberExpressionAccess().getNumberFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberFunction_in_ruleNumberExpression6038);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2810:1: entryRuleNumberFunction returns [EObject current=null] : iv_ruleNumberFunction= ruleNumberFunction EOF ;
    public final EObject entryRuleNumberFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2811:2: (iv_ruleNumberFunction= ruleNumberFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2812:2: iv_ruleNumberFunction= ruleNumberFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6073);
            iv_ruleNumberFunction=ruleNumberFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberFunction6083); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2819:1: ruleNumberFunction returns [EObject current=null] : (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2822:28: ( (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2823:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2823:1: (this_MaximumFunction_0= ruleMaximumFunction | this_MinimumFunction_1= ruleMinimumFunction | this_AverageFunction_2= ruleAverageFunction | this_SumFunction_3= ruleSumFunction | this_ExponentialFunction_4= ruleExponentialFunction | this_AbsoluteFunction_5= ruleAbsoluteFunction | this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction | this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction )
            int alt46=8;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt46=1;
                }
                break;
            case 80:
                {
                alt46=2;
                }
                break;
            case 81:
                {
                alt46=3;
                }
                break;
            case 82:
                {
                alt46=4;
                }
                break;
            case 83:
                {
                alt46=5;
                }
                break;
            case 84:
                {
                alt46=6;
                }
                break;
            case 85:
                {
                alt46=7;
                }
                break;
            case 86:
                {
                alt46=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2824:5: this_MaximumFunction_0= ruleMaximumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMaximumFunctionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6130);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2834:5: this_MinimumFunction_1= ruleMinimumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getMinimumFunctionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6157);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2844:5: this_AverageFunction_2= ruleAverageFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAverageFunctionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAverageFunction_in_ruleNumberFunction6184);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2854:5: this_SumFunction_3= ruleSumFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getSumFunctionParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleSumFunction_in_ruleNumberFunction6211);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2864:5: this_ExponentialFunction_4= ruleExponentialFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getExponentialFunctionParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6238);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2874:5: this_AbsoluteFunction_5= ruleAbsoluteFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getAbsoluteFunctionParserRuleCall_5()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6265);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2884:5: this_NaturalLogarithmFunction_6= ruleNaturalLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getNaturalLogarithmFunctionParserRuleCall_6()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6292);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2894:5: this_CommonLogarithmFunction_7= ruleCommonLogarithmFunction
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getNumberFunctionAccess().getCommonLogarithmFunctionParserRuleCall_7()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6319);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2910:1: entryRuleMaximumFunction returns [EObject current=null] : iv_ruleMaximumFunction= ruleMaximumFunction EOF ;
    public final EObject entryRuleMaximumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaximumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2911:2: (iv_ruleMaximumFunction= ruleMaximumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2912:2: iv_ruleMaximumFunction= ruleMaximumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaximumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6354);
            iv_ruleMaximumFunction=ruleMaximumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaximumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaximumFunction6364); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2919:1: ruleMaximumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2922:28: ( ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2923:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2923:1: ( ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2923:2: ( (lv_operator_0_0= ruleMaxOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2923:2: ( (lv_operator_0_0= ruleMaxOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2924:1: (lv_operator_0_0= ruleMaxOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2924:1: (lv_operator_0_0= ruleMaxOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2925:3: lv_operator_0_0= ruleMaxOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getOperatorMaxOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6410);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleMaximumFunction6422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMaximumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2945:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2946:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2946:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2947:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6443);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2963:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==20) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2963:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMaximumFunction6456); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMaximumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2967:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2968:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2968:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2969:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMaximumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6477);
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
            	    break loop47;
                }
            } while (true);

            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleMaximumFunction6491); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2997:1: entryRuleMinimumFunction returns [EObject current=null] : iv_ruleMinimumFunction= ruleMinimumFunction EOF ;
    public final EObject entryRuleMinimumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinimumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2998:2: (iv_ruleMinimumFunction= ruleMinimumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:2999:2: iv_ruleMinimumFunction= ruleMinimumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinimumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6527);
            iv_ruleMinimumFunction=ruleMinimumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinimumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinimumFunction6537); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3006:1: ruleMinimumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3009:28: ( ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3010:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3010:1: ( ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3010:2: ( (lv_operator_0_0= ruleMinOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3010:2: ( (lv_operator_0_0= ruleMinOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3011:1: (lv_operator_0_0= ruleMinOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3011:1: (lv_operator_0_0= ruleMinOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3012:3: lv_operator_0_0= ruleMinOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getOperatorMinOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleMinOperator_in_ruleMinimumFunction6583);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleMinimumFunction6595); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getMinimumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3032:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3033:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3033:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3034:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6616);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3050:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==20) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3050:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleMinimumFunction6629); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getMinimumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3054:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3055:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3055:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3056:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMinimumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6650);
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
            	    break loop48;
                }
            } while (true);

            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleMinimumFunction6664); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3084:1: entryRuleAverageFunction returns [EObject current=null] : iv_ruleAverageFunction= ruleAverageFunction EOF ;
    public final EObject entryRuleAverageFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAverageFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3085:2: (iv_ruleAverageFunction= ruleAverageFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3086:2: iv_ruleAverageFunction= ruleAverageFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAverageFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6700);
            iv_ruleAverageFunction=ruleAverageFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAverageFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAverageFunction6710); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3093:1: ruleAverageFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3096:28: ( ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3097:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3097:1: ( ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3097:2: ( (lv_operator_0_0= ruleAvgOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3097:2: ( (lv_operator_0_0= ruleAvgOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3098:1: (lv_operator_0_0= ruleAvgOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3098:1: (lv_operator_0_0= ruleAvgOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3099:3: lv_operator_0_0= ruleAvgOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getOperatorAvgOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_ruleAverageFunction6756);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAverageFunction6768); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAverageFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3119:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3120:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3120:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3121:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction6789);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3137:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==20) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3137:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleAverageFunction6802); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getAverageFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3141:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3142:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3142:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3143:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAverageFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleAverageFunction6823);
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
            	    break loop49;
                }
            } while (true);

            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleAverageFunction6837); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3171:1: entryRuleSumFunction returns [EObject current=null] : iv_ruleSumFunction= ruleSumFunction EOF ;
    public final EObject entryRuleSumFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3172:2: (iv_ruleSumFunction= ruleSumFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3173:2: iv_ruleSumFunction= ruleSumFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleSumFunction_in_entryRuleSumFunction6873);
            iv_ruleSumFunction=ruleSumFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumFunction6883); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3180:1: ruleSumFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3183:28: ( ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3184:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3184:1: ( ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3184:2: ( (lv_operator_0_0= ruleSumOperator ) ) otherlv_1= '(' ( (lv_values_2_0= ruleNumberExpression ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )* otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3184:2: ( (lv_operator_0_0= ruleSumOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3185:1: (lv_operator_0_0= ruleSumOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3185:1: (lv_operator_0_0= ruleSumOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3186:3: lv_operator_0_0= ruleSumOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getOperatorSumOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSumOperator_in_ruleSumFunction6929);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleSumFunction6941); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSumFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3206:1: ( (lv_values_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3207:1: (lv_values_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3207:1: (lv_values_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3208:3: lv_values_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction6962);
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

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3224:2: (otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==20) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3224:4: otherlv_3= ',' ( (lv_values_4_0= ruleNumberExpression ) )
            	    {
            	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleSumFunction6975); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getSumFunctionAccess().getCommaKeyword_3_0());
            	          
            	    }
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3228:1: ( (lv_values_4_0= ruleNumberExpression ) )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3229:1: (lv_values_4_0= ruleNumberExpression )
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3229:1: (lv_values_4_0= ruleNumberExpression )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3230:3: lv_values_4_0= ruleNumberExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getSumFunctionAccess().getValuesNumberExpressionParserRuleCall_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleNumberExpression_in_ruleSumFunction6996);
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
            	    break loop50;
                }
            } while (true);

            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleSumFunction7010); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3258:1: entryRuleExponentialFunction returns [EObject current=null] : iv_ruleExponentialFunction= ruleExponentialFunction EOF ;
    public final EObject entryRuleExponentialFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3259:2: (iv_ruleExponentialFunction= ruleExponentialFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3260:2: iv_ruleExponentialFunction= ruleExponentialFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7046);
            iv_ruleExponentialFunction=ruleExponentialFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialFunction7056); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3267:1: ruleExponentialFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) ;
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
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3270:28: ( ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3271:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3271:1: ( ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3271:2: ( (lv_operator_0_0= ruleExponentialOperator ) ) otherlv_1= '(' ( (lv_base_2_0= ruleNumberExpression ) ) otherlv_3= ',' ( (lv_exponent_4_0= ruleNumberExpression ) ) otherlv_5= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3271:2: ( (lv_operator_0_0= ruleExponentialOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3272:1: (lv_operator_0_0= ruleExponentialOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3272:1: (lv_operator_0_0= ruleExponentialOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3273:3: lv_operator_0_0= ruleExponentialOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getOperatorExponentialOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7102);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleExponentialFunction7114); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getExponentialFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3293:1: ( (lv_base_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3294:1: (lv_base_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3294:1: (lv_base_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3295:3: lv_base_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getBaseNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7135);
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

            otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleExponentialFunction7147); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getExponentialFunctionAccess().getCommaKeyword_3());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3315:1: ( (lv_exponent_4_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3316:1: (lv_exponent_4_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3316:1: (lv_exponent_4_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3317:3: lv_exponent_4_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExponentialFunctionAccess().getExponentNumberExpressionParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7168);
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

            otherlv_5=(Token)match(input,55,FOLLOW_55_in_ruleExponentialFunction7180); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3345:1: entryRuleAbsoluteFunction returns [EObject current=null] : iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF ;
    public final EObject entryRuleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3346:2: (iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3347:2: iv_ruleAbsoluteFunction= ruleAbsoluteFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7216);
            iv_ruleAbsoluteFunction=ruleAbsoluteFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteFunction7226); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3354:1: ruleAbsoluteFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleAbsoluteFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3357:28: ( ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3358:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3358:1: ( ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3358:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3358:2: ( (lv_operator_0_0= ruleAbsoluteOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3359:1: (lv_operator_0_0= ruleAbsoluteOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3359:1: (lv_operator_0_0= ruleAbsoluteOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3360:3: lv_operator_0_0= ruleAbsoluteOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getOperatorAbsoluteOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7272);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleAbsoluteFunction7284); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAbsoluteFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3380:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3381:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3381:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3382:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAbsoluteFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7305);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleAbsoluteFunction7317); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3410:1: entryRuleNaturalLogarithmFunction returns [EObject current=null] : iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF ;
    public final EObject entryRuleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3411:2: (iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3412:2: iv_ruleNaturalLogarithmFunction= ruleNaturalLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7353);
            iv_ruleNaturalLogarithmFunction=ruleNaturalLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7363); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3419:1: ruleNaturalLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleNaturalLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3422:28: ( ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3423:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3423:1: ( ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3423:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3423:2: ( (lv_operator_0_0= ruleNaturalLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3424:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3424:1: (lv_operator_0_0= ruleNaturalLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3425:3: lv_operator_0_0= ruleNaturalLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getOperatorNaturalLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7409);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleNaturalLogarithmFunction7421); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getNaturalLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3445:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3446:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3446:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3447:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNaturalLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7442);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleNaturalLogarithmFunction7454); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3475:1: entryRuleCommonLogarithmFunction returns [EObject current=null] : iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF ;
    public final EObject entryRuleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmFunction = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3476:2: (iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3477:2: iv_ruleCommonLogarithmFunction= ruleCommonLogarithmFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmFunctionRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7490);
            iv_ruleCommonLogarithmFunction=ruleCommonLogarithmFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmFunction; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7500); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3484:1: ruleCommonLogarithmFunction returns [EObject current=null] : ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) ;
    public final EObject ruleCommonLogarithmFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_operator_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3487:28: ( ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3488:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3488:1: ( ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3488:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) ) otherlv_1= '(' ( (lv_value_2_0= ruleNumberExpression ) ) otherlv_3= ')'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3488:2: ( (lv_operator_0_0= ruleCommonLogarithmOperator ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3489:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3489:1: (lv_operator_0_0= ruleCommonLogarithmOperator )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3490:3: lv_operator_0_0= ruleCommonLogarithmOperator
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getOperatorCommonLogarithmOperatorParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7546);
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

            otherlv_1=(Token)match(input,54,FOLLOW_54_in_ruleCommonLogarithmFunction7558); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCommonLogarithmFunctionAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3510:1: ( (lv_value_2_0= ruleNumberExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3511:1: (lv_value_2_0= ruleNumberExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3511:1: (lv_value_2_0= ruleNumberExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3512:3: lv_value_2_0= ruleNumberExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCommonLogarithmFunctionAccess().getValueNumberExpressionParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7579);
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

            otherlv_3=(Token)match(input,55,FOLLOW_55_in_ruleCommonLogarithmFunction7591); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3540:1: entryRuleParenthesizedExpression returns [EObject current=null] : iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF ;
    public final EObject entryRuleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParenthesizedExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3541:2: (iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3542:2: iv_ruleParenthesizedExpression= ruleParenthesizedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParenthesizedExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7627);
            iv_ruleParenthesizedExpression=ruleParenthesizedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParenthesizedExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleParenthesizedExpression7637); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3549:1: ruleParenthesizedExpression returns [EObject current=null] : ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) ;
    public final EObject ruleParenthesizedExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3552:28: ( ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3553:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3553:1: ( ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3554:5: ruleLeftParenthesis ( (lv_value_1_0= ruleExpression ) ) ruleRightParenthesis
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getLeftParenthesisParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7678);
            ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3561:1: ( (lv_value_1_0= ruleExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3562:1: (lv_value_1_0= ruleExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3562:1: (lv_value_1_0= ruleExpression )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3563:3: lv_value_1_0= ruleExpression
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getParenthesizedExpressionAccess().getValueExpressionParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleExpression_in_ruleParenthesizedExpression7698);
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
            pushFollow(FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7714);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3595:1: entryRuleValueSpecification returns [EObject current=null] : iv_ruleValueSpecification= ruleValueSpecification EOF ;
    public final EObject entryRuleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValueSpecification = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3596:2: (iv_ruleValueSpecification= ruleValueSpecification EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3597:2: iv_ruleValueSpecification= ruleValueSpecification EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueSpecificationRule()); 
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7749);
            iv_ruleValueSpecification=ruleValueSpecification();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueSpecification; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueSpecification7759); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3604:1: ruleValueSpecification returns [EObject current=null] : (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) ;
    public final EObject ruleValueSpecification() throws RecognitionException {
        EObject current = null;

        EObject this_LiteralValueExpression_0 = null;

        EObject this_InstanceSpecificationExpression_1 = null;

        EObject this_ObjectSpecificationExpression_2 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3607:28: ( (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3608:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3608:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )
            int alt51=3;
            alt51 = dfa51.predict(input);
            switch (alt51) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3609:5: this_LiteralValueExpression_0= ruleLiteralValueExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getLiteralValueExpressionParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification7806);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3619:5: this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getInstanceSpecificationExpressionParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification7833);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3629:5: this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getValueSpecificationAccess().getObjectSpecificationExpressionParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification7860);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3645:1: entryRuleObjectSpecificationExpression returns [EObject current=null] : iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF ;
    public final EObject entryRuleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObjectSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3646:2: (iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3647:2: iv_ruleObjectSpecificationExpression= ruleObjectSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getObjectSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression7895);
            iv_ruleObjectSpecificationExpression=ruleObjectSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleObjectSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleObjectSpecificationExpression7905); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3654:1: ruleObjectSpecificationExpression returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) ;
    public final EObject ruleObjectSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3657:28: ( ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3658:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3658:1: ( ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3658:2: ( ( ruleQualifiedName ) ) ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3658:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3659:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3659:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3660:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getObjectSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getTypeDataTypeCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression7953);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3673:2: ( ( (lv_value_1_0= ruleCollection ) ) | ( (lv_value_2_0= ruleTuple ) ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==22) ) {
                alt52=1;
            }
            else if ( (LA52_0==18) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3673:3: ( (lv_value_1_0= ruleCollection ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3673:3: ( (lv_value_1_0= ruleCollection ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3674:1: (lv_value_1_0= ruleCollection )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3674:1: (lv_value_1_0= ruleCollection )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3675:3: lv_value_1_0= ruleCollection
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueCollectionParserRuleCall_1_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression7975);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3692:6: ( (lv_value_2_0= ruleTuple ) )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3692:6: ( (lv_value_2_0= ruleTuple ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3693:1: (lv_value_2_0= ruleTuple )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3693:1: (lv_value_2_0= ruleTuple )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3694:3: lv_value_2_0= ruleTuple
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getObjectSpecificationExpressionAccess().getValueTupleParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8002);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3718:1: entryRuleCollection returns [EObject current=null] : iv_ruleCollection= ruleCollection EOF ;
    public final EObject entryRuleCollection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollection = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3719:2: (iv_ruleCollection= ruleCollection EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3720:2: iv_ruleCollection= ruleCollection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCollectionRule()); 
            }
            pushFollow(FOLLOW_ruleCollection_in_entryRuleCollection8039);
            iv_ruleCollection=ruleCollection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCollection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollection8049); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3727:1: ruleCollection returns [EObject current=null] : ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) ;
    public final EObject ruleCollection() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3730:28: ( ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3731:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3731:1: ( () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3731:2: () otherlv_1= '[' ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )? otherlv_5= ']'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3731:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3732:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCollectionAccess().getCollectionAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleCollection8095); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCollectionAccess().getLeftSquareBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3741:1: ( ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )* )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( ((LA54_0>=RULE_ID && LA54_0<=RULE_EBIGDECIMAL)||LA54_0==57) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3741:2: ( (lv_values_2_0= ruleValueSpecification ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3741:2: ( (lv_values_2_0= ruleValueSpecification ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3742:1: (lv_values_2_0= ruleValueSpecification )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3742:1: (lv_values_2_0= ruleValueSpecification )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3743:3: lv_values_2_0= ruleValueSpecification
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8117);
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

                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3759:2: (otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) ) )*
                    loop53:
                    do {
                        int alt53=2;
                        int LA53_0 = input.LA(1);

                        if ( (LA53_0==20) ) {
                            alt53=1;
                        }


                        switch (alt53) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3759:4: otherlv_3= ',' ( (lv_values_4_0= ruleValueSpecification ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleCollection8130); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getCollectionAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3763:1: ( (lv_values_4_0= ruleValueSpecification ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3764:1: (lv_values_4_0= ruleValueSpecification )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3764:1: (lv_values_4_0= ruleValueSpecification )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3765:3: lv_values_4_0= ruleValueSpecification
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getCollectionAccess().getValuesValueSpecificationParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueSpecification_in_ruleCollection8151);
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
                    	    break loop53;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleCollection8167); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3793:1: entryRuleTuple returns [EObject current=null] : iv_ruleTuple= ruleTuple EOF ;
    public final EObject entryRuleTuple() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTuple = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3794:2: (iv_ruleTuple= ruleTuple EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3795:2: iv_ruleTuple= ruleTuple EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTupleRule()); 
            }
            pushFollow(FOLLOW_ruleTuple_in_entryRuleTuple8203);
            iv_ruleTuple=ruleTuple();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTuple; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTuple8213); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3802:1: ruleTuple returns [EObject current=null] : ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) ;
    public final EObject ruleTuple() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_tuples_2_0 = null;

        EObject lv_tuples_4_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3805:28: ( ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3806:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3806:1: ( () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3806:2: () otherlv_1= '{' ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )? otherlv_5= '}'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3806:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3807:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getTupleAccess().getTupleAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18_in_ruleTuple8259); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getTupleAccess().getLeftCurlyBracketKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3816:1: ( ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3816:2: ( (lv_tuples_2_0= rulePropertyValuePair ) ) (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3816:2: ( (lv_tuples_2_0= rulePropertyValuePair ) )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3817:1: (lv_tuples_2_0= rulePropertyValuePair )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3817:1: (lv_tuples_2_0= rulePropertyValuePair )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3818:3: lv_tuples_2_0= rulePropertyValuePair
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_0_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8281);
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

                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3834:2: (otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) ) )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==20) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3834:4: otherlv_3= ',' ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTuple8294); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_3, grammarAccess.getTupleAccess().getCommaKeyword_2_1_0());
                    	          
                    	    }
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3838:1: ( (lv_tuples_4_0= rulePropertyValuePair ) )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3839:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    {
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3839:1: (lv_tuples_4_0= rulePropertyValuePair )
                    	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3840:3: lv_tuples_4_0= rulePropertyValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getTupleAccess().getTuplesPropertyValuePairParserRuleCall_2_1_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_rulePropertyValuePair_in_ruleTuple8315);
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
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleTuple8331); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3868:1: entryRulePropertyValuePair returns [EObject current=null] : iv_rulePropertyValuePair= rulePropertyValuePair EOF ;
    public final EObject entryRulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValuePair = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3869:2: (iv_rulePropertyValuePair= rulePropertyValuePair EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3870:2: iv_rulePropertyValuePair= rulePropertyValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValuePairRule()); 
            }
            pushFollow(FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8367);
            iv_rulePropertyValuePair=rulePropertyValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValuePair; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyValuePair8377); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3877:1: rulePropertyValuePair returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) ;
    public final EObject rulePropertyValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3880:28: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3881:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3881:1: ( ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3881:2: ( ( ruleQualifiedName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleValueSpecification ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3881:2: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3882:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3882:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3883:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getPropertyValuePairRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getPropertyPropertyCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8425);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,56,FOLLOW_56_in_rulePropertyValuePair8437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getPropertyValuePairAccess().getEqualsSignKeyword_1());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3900:1: ( (lv_value_2_0= ruleValueSpecification ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3901:1: (lv_value_2_0= ruleValueSpecification )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3901:1: (lv_value_2_0= ruleValueSpecification )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3902:3: lv_value_2_0= ruleValueSpecification
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getPropertyValuePairAccess().getValueValueSpecificationParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8458);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3926:1: entryRuleInstanceSpecificationExpression returns [EObject current=null] : iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF ;
    public final EObject entryRuleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInstanceSpecificationExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3927:2: (iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3928:2: iv_ruleInstanceSpecificationExpression= ruleInstanceSpecificationExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getInstanceSpecificationExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8494);
            iv_ruleInstanceSpecificationExpression=ruleInstanceSpecificationExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInstanceSpecificationExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8504); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3935:1: ruleInstanceSpecificationExpression returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject ruleInstanceSpecificationExpression() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3938:28: ( ( ( ruleQualifiedName ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3939:1: ( ( ruleQualifiedName ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3939:1: ( ( ruleQualifiedName ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3940:1: ( ruleQualifiedName )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3940:1: ( ruleQualifiedName )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3941:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getInstanceSpecificationExpressionRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getInstanceSpecificationExpressionAccess().getValueInstanceSpecificationCrossReference_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8551);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3962:1: entryRuleLiteralValueExpression returns [EObject current=null] : iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF ;
    public final EObject entryRuleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteralValueExpression = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3963:2: (iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3964:2: iv_ruleLiteralValueExpression= ruleLiteralValueExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralValueExpressionRule()); 
            }
            pushFollow(FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8586);
            iv_ruleLiteralValueExpression=ruleLiteralValueExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteralValueExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteralValueExpression8596); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3971:1: ruleLiteralValueExpression returns [EObject current=null] : (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) ;
    public final EObject ruleLiteralValueExpression() throws RecognitionException {
        EObject current = null;

        EObject this_NumberLiteral_0 = null;

        EObject this_BooleanLiteral_1 = null;

        EObject this_NullLiteral_2 = null;

        EObject this_StringLiteral_3 = null;

        EObject this_UnlimitedLiteral_4 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3974:28: ( (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3975:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3975:1: (this_NumberLiteral_0= ruleNumberLiteral | this_BooleanLiteral_1= ruleBooleanLiteral | this_NullLiteral_2= ruleNullLiteral | this_StringLiteral_3= ruleStringLiteral | this_UnlimitedLiteral_4= ruleUnlimitedLiteral )
            int alt57=5;
            switch ( input.LA(1) ) {
            case RULE_INT:
            case RULE_POSITIVE_SMALL_DECIMAL:
            case RULE_SMALL_DECIMAL:
            case RULE_EBIGDECIMAL:
                {
                alt57=1;
                }
                break;
            case RULE_EBOOLEAN:
                {
                alt57=2;
                }
                break;
            case RULE_NULL:
                {
                alt57=3;
                }
                break;
            case RULE_STRING:
                {
                alt57=4;
                }
                break;
            case 57:
                {
                alt57=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3976:5: this_NumberLiteral_0= ruleNumberLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNumberLiteralParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8643);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3986:5: this_BooleanLiteral_1= ruleBooleanLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getBooleanLiteralParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8670);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:3996:5: this_NullLiteral_2= ruleNullLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getNullLiteralParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8697);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4006:5: this_StringLiteral_3= ruleStringLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getStringLiteralParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8724);
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4016:5: this_UnlimitedLiteral_4= ruleUnlimitedLiteral
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getLiteralValueExpressionAccess().getUnlimitedLiteralParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8751);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4032:1: entryRuleBooleanLiteral returns [EObject current=null] : iv_ruleBooleanLiteral= ruleBooleanLiteral EOF ;
    public final EObject entryRuleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4033:2: (iv_ruleBooleanLiteral= ruleBooleanLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4034:2: iv_ruleBooleanLiteral= ruleBooleanLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8786);
            iv_ruleBooleanLiteral=ruleBooleanLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBooleanLiteral8796); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4041:1: ruleBooleanLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_EBOOLEAN ) ) ;
    public final EObject ruleBooleanLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4044:28: ( ( (lv_value_0_0= RULE_EBOOLEAN ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4045:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4045:1: ( (lv_value_0_0= RULE_EBOOLEAN ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4046:1: (lv_value_0_0= RULE_EBOOLEAN )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4046:1: (lv_value_0_0= RULE_EBOOLEAN )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4047:3: lv_value_0_0= RULE_EBOOLEAN
            {
            lv_value_0_0=(Token)match(input,RULE_EBOOLEAN,FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral8837); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4071:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4072:2: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4073:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral8877);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumberLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumberLiteral8887); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4080:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= ruleNumber ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4083:28: ( ( (lv_value_0_0= ruleNumber ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4084:1: ( (lv_value_0_0= ruleNumber ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4084:1: ( (lv_value_0_0= ruleNumber ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4085:1: (lv_value_0_0= ruleNumber )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4085:1: (lv_value_0_0= ruleNumber )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4086:3: lv_value_0_0= ruleNumber
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNumberLiteralAccess().getValueNumberParserRuleCall_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleNumber_in_ruleNumberLiteral8932);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4110:1: entryRuleNullLiteral returns [EObject current=null] : iv_ruleNullLiteral= ruleNullLiteral EOF ;
    public final EObject entryRuleNullLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNullLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4111:2: (iv_ruleNullLiteral= ruleNullLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4112:2: iv_ruleNullLiteral= ruleNullLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNullLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8967);
            iv_ruleNullLiteral=ruleNullLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNullLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNullLiteral8977); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4119:1: ruleNullLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_NULL ) ) ;
    public final EObject ruleNullLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4122:28: ( ( (lv_value_0_0= RULE_NULL ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4123:1: ( (lv_value_0_0= RULE_NULL ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4123:1: ( (lv_value_0_0= RULE_NULL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4124:1: (lv_value_0_0= RULE_NULL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4124:1: (lv_value_0_0= RULE_NULL )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4125:3: lv_value_0_0= RULE_NULL
            {
            lv_value_0_0=(Token)match(input,RULE_NULL,FOLLOW_RULE_NULL_in_ruleNullLiteral9018); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4149:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4150:2: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4151:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9058);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStringLiteral9068); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4158:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4161:28: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4162:1: ( (lv_value_0_0= RULE_STRING ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4162:1: ( (lv_value_0_0= RULE_STRING ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4163:1: (lv_value_0_0= RULE_STRING )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4163:1: (lv_value_0_0= RULE_STRING )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4164:3: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleStringLiteral9109); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4188:1: entryRuleUnlimitedLiteral returns [EObject current=null] : iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF ;
    public final EObject entryRuleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnlimitedLiteral = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4189:2: (iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4190:2: iv_ruleUnlimitedLiteral= ruleUnlimitedLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnlimitedLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9149);
            iv_ruleUnlimitedLiteral=ruleUnlimitedLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnlimitedLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleUnlimitedLiteral9159); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4197:1: ruleUnlimitedLiteral returns [EObject current=null] : ( (lv_value_0_0= '*' ) ) ;
    public final EObject ruleUnlimitedLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4200:28: ( ( (lv_value_0_0= '*' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4201:1: ( (lv_value_0_0= '*' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4201:1: ( (lv_value_0_0= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4202:1: (lv_value_0_0= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4202:1: (lv_value_0_0= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4203:3: lv_value_0_0= '*'
            {
            lv_value_0_0=(Token)match(input,57,FOLLOW_57_in_ruleUnlimitedLiteral9201); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4224:1: entryRuleOrOperator returns [EObject current=null] : iv_ruleOrOperator= ruleOrOperator EOF ;
    public final EObject entryRuleOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4225:2: (iv_ruleOrOperator= ruleOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4226:2: iv_ruleOrOperator= ruleOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleOrOperator_in_entryRuleOrOperator9249);
            iv_ruleOrOperator=ruleOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrOperator9259); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4233:1: ruleOrOperator returns [EObject current=null] : ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) ;
    public final EObject ruleOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4236:28: ( ( () (otherlv_1= 'or' | otherlv_2= '||' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4237:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4237:1: ( () (otherlv_1= 'or' | otherlv_2= '||' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4237:2: () (otherlv_1= 'or' | otherlv_2= '||' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4237:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4238:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getOrOperatorAccess().getOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4243:2: (otherlv_1= 'or' | otherlv_2= '||' )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==58) ) {
                alt58=1;
            }
            else if ( (LA58_0==59) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4243:4: otherlv_1= 'or'
                    {
                    otherlv_1=(Token)match(input,58,FOLLOW_58_in_ruleOrOperator9306); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getOrOperatorAccess().getOrKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4248:7: otherlv_2= '||'
                    {
                    otherlv_2=(Token)match(input,59,FOLLOW_59_in_ruleOrOperator9324); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4260:1: entryRuleXOrOperator returns [EObject current=null] : iv_ruleXOrOperator= ruleXOrOperator EOF ;
    public final EObject entryRuleXOrOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXOrOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4261:2: (iv_ruleXOrOperator= ruleXOrOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4262:2: iv_ruleXOrOperator= ruleXOrOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXOrOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9361);
            iv_ruleXOrOperator=ruleXOrOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXOrOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXOrOperator9371); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4269:1: ruleXOrOperator returns [EObject current=null] : ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) ;
    public final EObject ruleXOrOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4272:28: ( ( () (otherlv_1= 'xor' | otherlv_2= '^' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4273:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4273:1: ( () (otherlv_1= 'xor' | otherlv_2= '^' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4273:2: () (otherlv_1= 'xor' | otherlv_2= '^' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4273:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4274:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getXOrOperatorAccess().getXOrOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4279:2: (otherlv_1= 'xor' | otherlv_2= '^' )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==60) ) {
                alt59=1;
            }
            else if ( (LA59_0==61) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4279:4: otherlv_1= 'xor'
                    {
                    otherlv_1=(Token)match(input,60,FOLLOW_60_in_ruleXOrOperator9418); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXOrOperatorAccess().getXorKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4284:7: otherlv_2= '^'
                    {
                    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleXOrOperator9436); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4296:1: entryRuleAndOperator returns [EObject current=null] : iv_ruleAndOperator= ruleAndOperator EOF ;
    public final EObject entryRuleAndOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4297:2: (iv_ruleAndOperator= ruleAndOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4298:2: iv_ruleAndOperator= ruleAndOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAndOperator_in_entryRuleAndOperator9473);
            iv_ruleAndOperator=ruleAndOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndOperator9483); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4305:1: ruleAndOperator returns [EObject current=null] : ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) ;
    public final EObject ruleAndOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4308:28: ( ( () (otherlv_1= 'and' | otherlv_2= '&&' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4309:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4309:1: ( () (otherlv_1= 'and' | otherlv_2= '&&' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4309:2: () (otherlv_1= 'and' | otherlv_2= '&&' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4309:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4310:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAndOperatorAccess().getAndOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4315:2: (otherlv_1= 'and' | otherlv_2= '&&' )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==62) ) {
                alt60=1;
            }
            else if ( (LA60_0==63) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4315:4: otherlv_1= 'and'
                    {
                    otherlv_1=(Token)match(input,62,FOLLOW_62_in_ruleAndOperator9530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getAndOperatorAccess().getAndKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4320:7: otherlv_2= '&&'
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_63_in_ruleAndOperator9548); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4332:1: entryRuleImplicationOperator returns [EObject current=null] : iv_ruleImplicationOperator= ruleImplicationOperator EOF ;
    public final EObject entryRuleImplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4333:2: (iv_ruleImplicationOperator= ruleImplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4334:2: iv_ruleImplicationOperator= ruleImplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9585);
            iv_ruleImplicationOperator=ruleImplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImplicationOperator9595); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4341:1: ruleImplicationOperator returns [EObject current=null] : ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) ;
    public final EObject ruleImplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4344:28: ( ( () (otherlv_1= '=>' | otherlv_2= '->' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4345:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4345:1: ( () (otherlv_1= '=>' | otherlv_2= '->' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4345:2: () (otherlv_1= '=>' | otherlv_2= '->' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4345:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4346:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getImplicationOperatorAccess().getImplicationOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4351:2: (otherlv_1= '=>' | otherlv_2= '->' )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==64) ) {
                alt61=1;
            }
            else if ( (LA61_0==65) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4351:4: otherlv_1= '=>'
                    {
                    otherlv_1=(Token)match(input,64,FOLLOW_64_in_ruleImplicationOperator9642); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getImplicationOperatorAccess().getEqualsSignGreaterThanSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4356:7: otherlv_2= '->'
                    {
                    otherlv_2=(Token)match(input,65,FOLLOW_65_in_ruleImplicationOperator9660); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4368:1: entryRuleEqualsOperator returns [EObject current=null] : iv_ruleEqualsOperator= ruleEqualsOperator EOF ;
    public final EObject entryRuleEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4369:2: (iv_ruleEqualsOperator= ruleEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4370:2: iv_ruleEqualsOperator= ruleEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9697);
            iv_ruleEqualsOperator=ruleEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEqualsOperator9707); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4377:1: ruleEqualsOperator returns [EObject current=null] : ( () otherlv_1= '==' ) ;
    public final EObject ruleEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4380:28: ( ( () otherlv_1= '==' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4381:1: ( () otherlv_1= '==' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4381:1: ( () otherlv_1= '==' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4381:2: () otherlv_1= '=='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4381:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4382:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getEqualsOperatorAccess().getEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_66_in_ruleEqualsOperator9753); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4399:1: entryRuleNotEqualsOperator returns [EObject current=null] : iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF ;
    public final EObject entryRuleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotEqualsOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4400:2: (iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4401:2: iv_ruleNotEqualsOperator= ruleNotEqualsOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotEqualsOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator9789);
            iv_ruleNotEqualsOperator=ruleNotEqualsOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotEqualsOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotEqualsOperator9799); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4408:1: ruleNotEqualsOperator returns [EObject current=null] : ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) ;
    public final EObject ruleNotEqualsOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4411:28: ( ( () (otherlv_1= '!=' | otherlv_2= '<>' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4412:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4412:1: ( () (otherlv_1= '!=' | otherlv_2= '<>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4412:2: () (otherlv_1= '!=' | otherlv_2= '<>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4412:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4413:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotEqualsOperatorAccess().getNotEqualsOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4418:2: (otherlv_1= '!=' | otherlv_2= '<>' )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==67) ) {
                alt62=1;
            }
            else if ( (LA62_0==68) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4418:4: otherlv_1= '!='
                    {
                    otherlv_1=(Token)match(input,67,FOLLOW_67_in_ruleNotEqualsOperator9846); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotEqualsOperatorAccess().getExclamationMarkEqualsSignKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4423:7: otherlv_2= '<>'
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_68_in_ruleNotEqualsOperator9864); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4435:1: entryRuleNotOperator returns [EObject current=null] : iv_ruleNotOperator= ruleNotOperator EOF ;
    public final EObject entryRuleNotOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNotOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4436:2: (iv_ruleNotOperator= ruleNotOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4437:2: iv_ruleNotOperator= ruleNotOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNotOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNotOperator_in_entryRuleNotOperator9901);
            iv_ruleNotOperator=ruleNotOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNotOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNotOperator9911); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4444:1: ruleNotOperator returns [EObject current=null] : ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) ;
    public final EObject ruleNotOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4447:28: ( ( () (otherlv_1= '!' | otherlv_2= 'not' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4448:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4448:1: ( () (otherlv_1= '!' | otherlv_2= 'not' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4448:2: () (otherlv_1= '!' | otherlv_2= 'not' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4448:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4449:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNotOperatorAccess().getNotOperatorAction_0(),
                          current);
                  
            }

            }

            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4454:2: (otherlv_1= '!' | otherlv_2= 'not' )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==69) ) {
                alt63=1;
            }
            else if ( (LA63_0==70) ) {
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4454:4: otherlv_1= '!'
                    {
                    otherlv_1=(Token)match(input,69,FOLLOW_69_in_ruleNotOperator9958); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getNotOperatorAccess().getExclamationMarkKeyword_1_0());
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4459:7: otherlv_2= 'not'
                    {
                    otherlv_2=(Token)match(input,70,FOLLOW_70_in_ruleNotOperator9976); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4471:1: entryRuleGreaterThanOperator returns [EObject current=null] : iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF ;
    public final EObject entryRuleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4472:2: (iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4473:2: iv_ruleGreaterThanOperator= ruleGreaterThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10013);
            iv_ruleGreaterThanOperator=ruleGreaterThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterThanOperator10023); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4480:1: ruleGreaterThanOperator returns [EObject current=null] : ( () otherlv_1= '>' ) ;
    public final EObject ruleGreaterThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4483:28: ( ( () otherlv_1= '>' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4484:1: ( () otherlv_1= '>' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4484:1: ( () otherlv_1= '>' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4484:2: () otherlv_1= '>'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4484:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4485:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterThanOperatorAccess().getGreaterThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,71,FOLLOW_71_in_ruleGreaterThanOperator10069); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4502:1: entryRuleGreaterOrEqualThanOperator returns [EObject current=null] : iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF ;
    public final EObject entryRuleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGreaterOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4503:2: (iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4504:2: iv_ruleGreaterOrEqualThanOperator= ruleGreaterOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGreaterOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10105);
            iv_ruleGreaterOrEqualThanOperator=ruleGreaterOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGreaterOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10115); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4511:1: ruleGreaterOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '>=' ) ;
    public final EObject ruleGreaterOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4514:28: ( ( () otherlv_1= '>=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4515:1: ( () otherlv_1= '>=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4515:1: ( () otherlv_1= '>=' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4515:2: () otherlv_1= '>='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4515:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4516:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getGreaterOrEqualThanOperatorAccess().getGreaterOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,72,FOLLOW_72_in_ruleGreaterOrEqualThanOperator10161); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4533:1: entryRuleLessThanOperator returns [EObject current=null] : iv_ruleLessThanOperator= ruleLessThanOperator EOF ;
    public final EObject entryRuleLessThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4534:2: (iv_ruleLessThanOperator= ruleLessThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4535:2: iv_ruleLessThanOperator= ruleLessThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10197);
            iv_ruleLessThanOperator=ruleLessThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessThanOperator10207); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4542:1: ruleLessThanOperator returns [EObject current=null] : ( () otherlv_1= '<' ) ;
    public final EObject ruleLessThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4545:28: ( ( () otherlv_1= '<' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4546:1: ( () otherlv_1= '<' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4546:1: ( () otherlv_1= '<' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4546:2: () otherlv_1= '<'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4546:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4547:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessThanOperatorAccess().getLessThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,73,FOLLOW_73_in_ruleLessThanOperator10253); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4564:1: entryRuleLessOrEqualThanOperator returns [EObject current=null] : iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF ;
    public final EObject entryRuleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLessOrEqualThanOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4565:2: (iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4566:2: iv_ruleLessOrEqualThanOperator= ruleLessOrEqualThanOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLessOrEqualThanOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10289);
            iv_ruleLessOrEqualThanOperator=ruleLessOrEqualThanOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLessOrEqualThanOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10299); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4573:1: ruleLessOrEqualThanOperator returns [EObject current=null] : ( () otherlv_1= '<=' ) ;
    public final EObject ruleLessOrEqualThanOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4576:28: ( ( () otherlv_1= '<=' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4577:1: ( () otherlv_1= '<=' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4577:1: ( () otherlv_1= '<=' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4577:2: () otherlv_1= '<='
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4577:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4578:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getLessOrEqualThanOperatorAccess().getLessOrEqualThanOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_74_in_ruleLessOrEqualThanOperator10345); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4595:1: entryRuleAdditionOperator returns [EObject current=null] : iv_ruleAdditionOperator= ruleAdditionOperator EOF ;
    public final EObject entryRuleAdditionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdditionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4596:2: (iv_ruleAdditionOperator= ruleAdditionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4597:2: iv_ruleAdditionOperator= ruleAdditionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAdditionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10381);
            iv_ruleAdditionOperator=ruleAdditionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAdditionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAdditionOperator10391); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4604:1: ruleAdditionOperator returns [EObject current=null] : ( () otherlv_1= '+' ) ;
    public final EObject ruleAdditionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4607:28: ( ( () otherlv_1= '+' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4608:1: ( () otherlv_1= '+' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4608:1: ( () otherlv_1= '+' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4608:2: () otherlv_1= '+'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4608:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4609:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAdditionOperatorAccess().getAdditionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_75_in_ruleAdditionOperator10437); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4626:1: entryRuleSubstractionOperator returns [EObject current=null] : iv_ruleSubstractionOperator= ruleSubstractionOperator EOF ;
    public final EObject entryRuleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubstractionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4627:2: (iv_ruleSubstractionOperator= ruleSubstractionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4628:2: iv_ruleSubstractionOperator= ruleSubstractionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubstractionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10473);
            iv_ruleSubstractionOperator=ruleSubstractionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubstractionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSubstractionOperator10483); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4635:1: ruleSubstractionOperator returns [EObject current=null] : ( () otherlv_1= '-' ) ;
    public final EObject ruleSubstractionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4638:28: ( ( () otherlv_1= '-' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4639:1: ( () otherlv_1= '-' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4639:1: ( () otherlv_1= '-' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4639:2: () otherlv_1= '-'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4639:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4640:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSubstractionOperatorAccess().getSubstractionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_76_in_ruleSubstractionOperator10529); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4657:1: entryRuleMultiplicationOperator returns [EObject current=null] : iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF ;
    public final EObject entryRuleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiplicationOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4658:2: (iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4659:2: iv_ruleMultiplicationOperator= ruleMultiplicationOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMultiplicationOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10565);
            iv_ruleMultiplicationOperator=ruleMultiplicationOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMultiplicationOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMultiplicationOperator10575); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4666:1: ruleMultiplicationOperator returns [EObject current=null] : ( () otherlv_1= '*' ) ;
    public final EObject ruleMultiplicationOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4669:28: ( ( () otherlv_1= '*' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4670:1: ( () otherlv_1= '*' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4670:1: ( () otherlv_1= '*' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4670:2: () otherlv_1= '*'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4670:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4671:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMultiplicationOperatorAccess().getMultiplicationOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,57,FOLLOW_57_in_ruleMultiplicationOperator10621); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4688:1: entryRuleDivisionOperator returns [EObject current=null] : iv_ruleDivisionOperator= ruleDivisionOperator EOF ;
    public final EObject entryRuleDivisionOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDivisionOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4689:2: (iv_ruleDivisionOperator= ruleDivisionOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4690:2: iv_ruleDivisionOperator= ruleDivisionOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDivisionOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10657);
            iv_ruleDivisionOperator=ruleDivisionOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDivisionOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDivisionOperator10667); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4697:1: ruleDivisionOperator returns [EObject current=null] : ( () otherlv_1= '/' ) ;
    public final EObject ruleDivisionOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4700:28: ( ( () otherlv_1= '/' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4701:1: ( () otherlv_1= '/' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4701:1: ( () otherlv_1= '/' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4701:2: () otherlv_1= '/'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4701:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4702:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDivisionOperatorAccess().getDivisionOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,77,FOLLOW_77_in_ruleDivisionOperator10713); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4719:1: entryRuleModulusOperator returns [EObject current=null] : iv_ruleModulusOperator= ruleModulusOperator EOF ;
    public final EObject entryRuleModulusOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulusOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4720:2: (iv_ruleModulusOperator= ruleModulusOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4721:2: iv_ruleModulusOperator= ruleModulusOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModulusOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10749);
            iv_ruleModulusOperator=ruleModulusOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulusOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleModulusOperator10759); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4728:1: ruleModulusOperator returns [EObject current=null] : ( () otherlv_1= '%' ) ;
    public final EObject ruleModulusOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4731:28: ( ( () otherlv_1= '%' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4732:1: ( () otherlv_1= '%' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4732:1: ( () otherlv_1= '%' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4732:2: () otherlv_1= '%'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4732:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4733:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getModulusOperatorAccess().getModulusOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_78_in_ruleModulusOperator10805); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4750:1: entryRuleMaxOperator returns [EObject current=null] : iv_ruleMaxOperator= ruleMaxOperator EOF ;
    public final EObject entryRuleMaxOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMaxOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4751:2: (iv_ruleMaxOperator= ruleMaxOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4752:2: iv_ruleMaxOperator= ruleMaxOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator10841);
            iv_ruleMaxOperator=ruleMaxOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMaxOperator10851); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4759:1: ruleMaxOperator returns [EObject current=null] : ( () otherlv_1= 'max' ) ;
    public final EObject ruleMaxOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4762:28: ( ( () otherlv_1= 'max' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4763:1: ( () otherlv_1= 'max' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4763:1: ( () otherlv_1= 'max' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4763:2: () otherlv_1= 'max'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4763:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4764:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMaxOperatorAccess().getMaxOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,79,FOLLOW_79_in_ruleMaxOperator10897); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4781:1: entryRuleMinOperator returns [EObject current=null] : iv_ruleMinOperator= ruleMinOperator EOF ;
    public final EObject entryRuleMinOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMinOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4782:2: (iv_ruleMinOperator= ruleMinOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4783:2: iv_ruleMinOperator= ruleMinOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMinOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleMinOperator_in_entryRuleMinOperator10933);
            iv_ruleMinOperator=ruleMinOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMinOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMinOperator10943); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4790:1: ruleMinOperator returns [EObject current=null] : ( () otherlv_1= 'min' ) ;
    public final EObject ruleMinOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4793:28: ( ( () otherlv_1= 'min' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4794:1: ( () otherlv_1= 'min' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4794:1: ( () otherlv_1= 'min' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4794:2: () otherlv_1= 'min'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4794:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4795:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getMinOperatorAccess().getMinOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,80,FOLLOW_80_in_ruleMinOperator10989); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4812:1: entryRuleAvgOperator returns [EObject current=null] : iv_ruleAvgOperator= ruleAvgOperator EOF ;
    public final EObject entryRuleAvgOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAvgOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4813:2: (iv_ruleAvgOperator= ruleAvgOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4814:2: iv_ruleAvgOperator= ruleAvgOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAvgOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11025);
            iv_ruleAvgOperator=ruleAvgOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAvgOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAvgOperator11035); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4821:1: ruleAvgOperator returns [EObject current=null] : ( () otherlv_1= 'avg' ) ;
    public final EObject ruleAvgOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4824:28: ( ( () otherlv_1= 'avg' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4825:1: ( () otherlv_1= 'avg' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4825:1: ( () otherlv_1= 'avg' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4825:2: () otherlv_1= 'avg'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4825:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4826:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAvgOperatorAccess().getAvgOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_81_in_ruleAvgOperator11081); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4843:1: entryRuleSumOperator returns [EObject current=null] : iv_ruleSumOperator= ruleSumOperator EOF ;
    public final EObject entryRuleSumOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSumOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4844:2: (iv_ruleSumOperator= ruleSumOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4845:2: iv_ruleSumOperator= ruleSumOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSumOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleSumOperator_in_entryRuleSumOperator11117);
            iv_ruleSumOperator=ruleSumOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSumOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSumOperator11127); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4852:1: ruleSumOperator returns [EObject current=null] : ( () otherlv_1= 'sum' ) ;
    public final EObject ruleSumOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4855:28: ( ( () otherlv_1= 'sum' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4856:1: ( () otherlv_1= 'sum' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4856:1: ( () otherlv_1= 'sum' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4856:2: () otherlv_1= 'sum'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4856:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4857:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSumOperatorAccess().getSumOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,82,FOLLOW_82_in_ruleSumOperator11173); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4874:1: entryRuleExponentialOperator returns [EObject current=null] : iv_ruleExponentialOperator= ruleExponentialOperator EOF ;
    public final EObject entryRuleExponentialOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExponentialOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4875:2: (iv_ruleExponentialOperator= ruleExponentialOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4876:2: iv_ruleExponentialOperator= ruleExponentialOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExponentialOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11209);
            iv_ruleExponentialOperator=ruleExponentialOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExponentialOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExponentialOperator11219); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4883:1: ruleExponentialOperator returns [EObject current=null] : ( () otherlv_1= 'exp' ) ;
    public final EObject ruleExponentialOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4886:28: ( ( () otherlv_1= 'exp' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4887:1: ( () otherlv_1= 'exp' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4887:1: ( () otherlv_1= 'exp' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4887:2: () otherlv_1= 'exp'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4887:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4888:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getExponentialOperatorAccess().getExponentialOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_83_in_ruleExponentialOperator11265); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4905:1: entryRuleAbsoluteOperator returns [EObject current=null] : iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF ;
    public final EObject entryRuleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAbsoluteOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4906:2: (iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4907:2: iv_ruleAbsoluteOperator= ruleAbsoluteOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAbsoluteOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11301);
            iv_ruleAbsoluteOperator=ruleAbsoluteOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAbsoluteOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAbsoluteOperator11311); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4914:1: ruleAbsoluteOperator returns [EObject current=null] : ( () otherlv_1= 'abs' ) ;
    public final EObject ruleAbsoluteOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4917:28: ( ( () otherlv_1= 'abs' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4918:1: ( () otherlv_1= 'abs' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4918:1: ( () otherlv_1= 'abs' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4918:2: () otherlv_1= 'abs'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4918:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4919:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getAbsoluteOperatorAccess().getAbsoluteOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,84,FOLLOW_84_in_ruleAbsoluteOperator11357); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4936:1: entryRuleNaturalLogarithmOperator returns [EObject current=null] : iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF ;
    public final EObject entryRuleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNaturalLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4937:2: (iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4938:2: iv_ruleNaturalLogarithmOperator= ruleNaturalLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNaturalLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11393);
            iv_ruleNaturalLogarithmOperator=ruleNaturalLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNaturalLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11403); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4945:1: ruleNaturalLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'ln' ) ;
    public final EObject ruleNaturalLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4948:28: ( ( () otherlv_1= 'ln' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4949:1: ( () otherlv_1= 'ln' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4949:1: ( () otherlv_1= 'ln' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4949:2: () otherlv_1= 'ln'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4949:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4950:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getNaturalLogarithmOperatorAccess().getNaturalLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,85,FOLLOW_85_in_ruleNaturalLogarithmOperator11449); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4967:1: entryRuleCommonLogarithmOperator returns [EObject current=null] : iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF ;
    public final EObject entryRuleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCommonLogarithmOperator = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4968:2: (iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4969:2: iv_ruleCommonLogarithmOperator= ruleCommonLogarithmOperator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCommonLogarithmOperatorRule()); 
            }
            pushFollow(FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11485);
            iv_ruleCommonLogarithmOperator=ruleCommonLogarithmOperator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCommonLogarithmOperator; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11495); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4976:1: ruleCommonLogarithmOperator returns [EObject current=null] : ( () otherlv_1= 'log' ) ;
    public final EObject ruleCommonLogarithmOperator() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4979:28: ( ( () otherlv_1= 'log' ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4980:1: ( () otherlv_1= 'log' )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4980:1: ( () otherlv_1= 'log' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4980:2: () otherlv_1= 'log'
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4980:2: ()
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4981:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCommonLogarithmOperatorAccess().getCommonLogarithmOperatorAction_0(),
                          current);
                  
            }

            }

            otherlv_1=(Token)match(input,86,FOLLOW_86_in_ruleCommonLogarithmOperator11541); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4998:1: entryRuleLeftParenthesis returns [String current=null] : iv_ruleLeftParenthesis= ruleLeftParenthesis EOF ;
    public final String entryRuleLeftParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLeftParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:4999:2: (iv_ruleLeftParenthesis= ruleLeftParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5000:2: iv_ruleLeftParenthesis= ruleLeftParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLeftParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11578);
            iv_ruleLeftParenthesis=ruleLeftParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLeftParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLeftParenthesis11589); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5007:1: ruleLeftParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '(' ;
    public final AntlrDatatypeRuleToken ruleLeftParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5010:28: (kw= '(' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5012:2: kw= '('
            {
            kw=(Token)match(input,54,FOLLOW_54_in_ruleLeftParenthesis11626); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5025:1: entryRuleRightParenthesis returns [String current=null] : iv_ruleRightParenthesis= ruleRightParenthesis EOF ;
    public final String entryRuleRightParenthesis() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRightParenthesis = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5026:2: (iv_ruleRightParenthesis= ruleRightParenthesis EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5027:2: iv_ruleRightParenthesis= ruleRightParenthesis EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRightParenthesisRule()); 
            }
            pushFollow(FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11666);
            iv_ruleRightParenthesis=ruleRightParenthesis();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRightParenthesis.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRightParenthesis11677); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5034:1: ruleRightParenthesis returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ')' ;
    public final AntlrDatatypeRuleToken ruleRightParenthesis() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5037:28: (kw= ')' )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5039:2: kw= ')'
            {
            kw=(Token)match(input,55,FOLLOW_55_in_ruleRightParenthesis11714); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5052:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5053:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5054:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11754);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName11765); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5061:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5064:28: ( (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5065:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5065:1: (this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )* )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5065:6: this_ID_0= RULE_ID ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11805); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5072:1: ( ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==87) && (synpred1_InternalGEL())) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5072:2: ( ( '.' )=>kw= '.' ) this_ID_2= RULE_ID
            	    {
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5072:2: ( ( '.' )=>kw= '.' )
            	    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5072:3: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,87,FOLLOW_87_in_ruleQualifiedName11833); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	          
            	    }

            	    }

            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQualifiedName11849); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop64;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5097:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5098:2: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5099:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard11899);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard11910); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5106:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5109:28: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5110:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5110:1: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5111:5: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard11957);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_QualifiedName_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                      afterParserOrEnumRuleCall();
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5121:1: (kw= '.*' )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==88) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5122:2: kw= '.*'
                    {
                    kw=(Token)match(input,88,FOLLOW_88_in_ruleQualifiedNameWithWildcard11976); if (state.failed) return current;
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5139:1: entryRuleImportNamespace returns [EObject current=null] : iv_ruleImportNamespace= ruleImportNamespace EOF ;
    public final EObject entryRuleImportNamespace() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImportNamespace = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5140:2: (iv_ruleImportNamespace= ruleImportNamespace EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5141:2: iv_ruleImportNamespace= ruleImportNamespace EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportNamespaceRule()); 
            }
            pushFollow(FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12022);
            iv_ruleImportNamespace=ruleImportNamespace();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImportNamespace; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImportNamespace12032); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5148:1: ruleImportNamespace returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImportNamespace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;


         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5151:28: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5152:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5152:1: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5152:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,89,FOLLOW_89_in_ruleImportNamespace12069); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getImportNamespaceAccess().getImportKeyword_0());
                  
            }
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5156:1: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5157:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5157:1: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5158:3: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getImportNamespaceAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12090);
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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5182:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5183:2: (iv_ruleNumber= ruleNumber EOF )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5184:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_ruleNumber_in_entryRuleNumber12127);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNumber12138); if (state.failed) return current;

            }

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
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5191:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_POSITIVE_SMALL_DECIMAL_1=null;
        Token this_SMALL_DECIMAL_2=null;
        Token this_EBIGDECIMAL_3=null;

         enterRule(); 
            
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5194:28: ( (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5195:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5195:1: (this_INT_0= RULE_INT | this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL | this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL | this_EBIGDECIMAL_3= RULE_EBIGDECIMAL )
            int alt66=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt66=1;
                }
                break;
            case RULE_POSITIVE_SMALL_DECIMAL:
                {
                alt66=2;
                }
                break;
            case RULE_SMALL_DECIMAL:
                {
                alt66=3;
                }
                break;
            case RULE_EBIGDECIMAL:
                {
                alt66=4;
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5195:6: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleNumber12178); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_INT_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5203:10: this_POSITIVE_SMALL_DECIMAL_1= RULE_POSITIVE_SMALL_DECIMAL
                    {
                    this_POSITIVE_SMALL_DECIMAL_1=(Token)match(input,RULE_POSITIVE_SMALL_DECIMAL,FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12204); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_POSITIVE_SMALL_DECIMAL_1);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_POSITIVE_SMALL_DECIMAL_1, grammarAccess.getNumberAccess().getPOSITIVE_SMALL_DECIMALTerminalRuleCall_1()); 
                          
                    }

                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5211:10: this_SMALL_DECIMAL_2= RULE_SMALL_DECIMAL
                    {
                    this_SMALL_DECIMAL_2=(Token)match(input,RULE_SMALL_DECIMAL,FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12230); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_SMALL_DECIMAL_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_SMALL_DECIMAL_2, grammarAccess.getNumberAccess().getSMALL_DECIMALTerminalRuleCall_2()); 
                          
                    }

                    }
                    break;
                case 4 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5219:10: this_EBIGDECIMAL_3= RULE_EBIGDECIMAL
                    {
                    this_EBIGDECIMAL_3=(Token)match(input,RULE_EBIGDECIMAL,FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12256); if (state.failed) return current;
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


    // $ANTLR start "ruleVerdict"
    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5238:1: ruleVerdict returns [Enumerator current=null] : ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) ) ;
    public final Enumerator ruleVerdict() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5240:28: ( ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) ) )
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5241:1: ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) )
            {
            // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5241:1: ( (enumLiteral_0= 'PASS' ) | (enumLiteral_1= 'FAIL' ) | (enumLiteral_2= 'INCONCLUSIVE' ) )
            int alt67=3;
            switch ( input.LA(1) ) {
            case 90:
                {
                alt67=1;
                }
                break;
            case 91:
                {
                alt67=2;
                }
                break;
            case 92:
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
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5241:2: (enumLiteral_0= 'PASS' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5241:2: (enumLiteral_0= 'PASS' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5241:4: enumLiteral_0= 'PASS'
                    {
                    enumLiteral_0=(Token)match(input,90,FOLLOW_90_in_ruleVerdict12319); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerdictAccess().getPASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVerdictAccess().getPASSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5247:6: (enumLiteral_1= 'FAIL' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5247:6: (enumLiteral_1= 'FAIL' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5247:8: enumLiteral_1= 'FAIL'
                    {
                    enumLiteral_1=(Token)match(input,91,FOLLOW_91_in_ruleVerdict12336); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerdictAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVerdictAccess().getFAILEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5253:6: (enumLiteral_2= 'INCONCLUSIVE' )
                    {
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5253:6: (enumLiteral_2= 'INCONCLUSIVE' )
                    // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5253:8: enumLiteral_2= 'INCONCLUSIVE'
                    {
                    enumLiteral_2=(Token)match(input,92,FOLLOW_92_in_ruleVerdict12353); if (state.failed) return current;
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
        // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5072:3: ( '.' )
        // ../eu.artist.postmigration.nfrvt.lang.gel/src-gen/eu/artist/postmigration/nfrvt/lang/gel/parser/antlr/internal/InternalGEL.g:5073:2: '.'
        {
        match(input,87,FOLLOW_87_in_synpred1_InternalGEL11824); if (state.failed) return ;

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


    protected DFA40 dfa40 = new DFA40(this);
    protected DFA51 dfa51 = new DFA51(this);
    static final String DFA40_eotS =
        "\13\uffff";
    static final String DFA40_eofS =
        "\2\uffff\1\11\7\uffff\1\11";
    static final String DFA40_minS =
        "\1\5\1\uffff\1\22\4\uffff\1\5\2\uffff\1\22";
    static final String DFA40_maxS =
        "\1\126\1\uffff\1\127\4\uffff\1\5\2\uffff\1\127";
    static final String DFA40_acceptS =
        "\1\uffff\1\1\1\uffff\1\4\1\5\1\6\1\7\1\uffff\1\3\1\2\1\uffff";
    static final String DFA40_specialS =
        "\13\uffff}>";
    static final String[] DFA40_transitionS = {
            "\1\2\1\4\1\uffff\1\3\4\1\51\uffff\1\6\2\uffff\1\5\25\uffff"+
            "\10\1",
            "",
            "\1\10\3\uffff\1\10\40\uffff\1\11\2\uffff\13\11\2\uffff\4\11"+
            "\14\uffff\1\7",
            "",
            "",
            "",
            "",
            "\1\12",
            "",
            "",
            "\1\10\3\uffff\1\10\40\uffff\1\11\2\uffff\13\11\2\uffff\4\11"+
            "\14\uffff\1\7"
    };

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "2468:1: (this_ArithmeticExpression_0= ruleArithmeticExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression | this_NullLiteral_3= ruleNullLiteral | this_StringLiteral_4= ruleStringLiteral | this_UnlimitedLiteral_5= ruleUnlimitedLiteral | this_ParenthesizedExpression_6= ruleParenthesizedExpression )";
        }
    }
    static final String DFA51_eotS =
        "\7\uffff";
    static final String DFA51_eofS =
        "\2\uffff\1\4\3\uffff\1\4";
    static final String DFA51_minS =
        "\1\5\1\uffff\1\22\1\5\2\uffff\1\22";
    static final String DFA51_maxS =
        "\1\71\1\uffff\1\127\1\5\2\uffff\1\127";
    static final String DFA51_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\1\3\1\uffff";
    static final String DFA51_specialS =
        "\7\uffff}>";
    static final String[] DFA51_transitionS = {
            "\1\2\7\1\54\uffff\1\1",
            "",
            "\1\5\1\uffff\1\4\1\uffff\1\5\1\4\1\uffff\1\4\75\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\5\1\uffff\1\4\1\uffff\1\5\1\4\1\uffff\1\4\75\uffff\1\3"
    };

    static final short[] DFA51_eot = DFA.unpackEncodedString(DFA51_eotS);
    static final short[] DFA51_eof = DFA.unpackEncodedString(DFA51_eofS);
    static final char[] DFA51_min = DFA.unpackEncodedStringToUnsignedChars(DFA51_minS);
    static final char[] DFA51_max = DFA.unpackEncodedStringToUnsignedChars(DFA51_maxS);
    static final short[] DFA51_accept = DFA.unpackEncodedString(DFA51_acceptS);
    static final short[] DFA51_special = DFA.unpackEncodedString(DFA51_specialS);
    static final short[][] DFA51_transition;

    static {
        int numStates = DFA51_transitionS.length;
        DFA51_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA51_transition[i] = DFA.unpackEncodedString(DFA51_transitionS[i]);
        }
    }

    class DFA51 extends DFA {

        public DFA51(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 51;
            this.eot = DFA51_eot;
            this.eof = DFA51_eof;
            this.min = DFA51_min;
            this.max = DFA51_max;
            this.accept = DFA51_accept;
            this.special = DFA51_special;
            this.transition = DFA51_transition;
        }
        public String getDescription() {
            return "3608:1: (this_LiteralValueExpression_0= ruleLiteralValueExpression | this_InstanceSpecificationExpression_1= ruleInstanceSpecificationExpression | this_ObjectSpecificationExpression_2= ruleObjectSpecificationExpression )";
        }
    }
 

    public static final BitSet FOLLOW_ruleARTISTModel_in_entryRuleARTISTModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleARTISTModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationEvaluation_in_ruleARTISTModel131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMigrationEvaluation_in_entryRuleMigrationEvaluation165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMigrationEvaluation175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_ruleMigrationEvaluation221 = new BitSet(new long[]{0x0000000000020000L,0x0000000002000000L});
    public static final BitSet FOLLOW_17_in_ruleMigrationEvaluation234 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleMigrationEvaluation255 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMigrationEvaluation267 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_19_in_ruleMigrationEvaluation279 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_DATE_TIME_in_ruleMigrationEvaluation296 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationEvaluation313 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleMigrationEvaluation325 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMigrationEvaluation337 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_ruleTransformation_in_ruleMigrationEvaluation358 = new BitSet(new long[]{0x0000000004800000L});
    public static final BitSet FOLLOW_23_in_ruleMigrationEvaluation371 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationEvaluation383 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleMigrationEvaluation395 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleMigrationEvaluation407 = new BitSet(new long[]{0x0000000900800000L});
    public static final BitSet FOLLOW_ruleAppliedPropertyEvaluation_in_ruleMigrationEvaluation428 = new BitSet(new long[]{0x0000000900800000L});
    public static final BitSet FOLLOW_23_in_ruleMigrationEvaluation441 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMigrationEvaluation453 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ruleGoalModelEvaluation_in_ruleMigrationEvaluation474 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleMigrationEvaluation486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransformation_in_entryRuleTransformation522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransformation532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleTransformation569 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransformation586 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleTransformation603 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_ruleTransformation615 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation638 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleTransformation651 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleTransformation663 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation675 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation698 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleTransformation711 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleTransformation726 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleTransformation738 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation750 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation773 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleTransformation786 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleTransformation801 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_ruleTransformation813 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleTransformation825 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleTransformation848 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_23_in_ruleTransformation861 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleTransformation876 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_ruleTransformation888 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleTransformation905 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleTransformation924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedPropertyEvaluation_in_entryRuleAppliedPropertyEvaluation960 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedPropertyEvaluation970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_ruleAppliedPropertyEvaluation1044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQualitativePropertyEvaluation_in_entryRuleAppliedQualitativePropertyEvaluation1079 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQualitativePropertyEvaluation1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleAppliedQualitativePropertyEvaluation1126 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQualitativePropertyEvaluation1143 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAppliedQualitativePropertyEvaluation1160 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAppliedQualitativePropertyEvaluation1172 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQualitativePropertyEvaluation1195 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativePropertyEvaluation1207 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAppliedQualitativePropertyEvaluation1219 = new BitSet(new long[]{0x0200000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleAppliedQualitativePropertyEvaluation1240 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQualitativePropertyEvaluation1252 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_ruleAppliedQualitativePropertyEvaluation1273 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAppliedQualitativePropertyEvaluation1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAppliedQuantitativePropertyEvaluation_in_entryRuleAppliedQuantitativePropertyEvaluation1321 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAppliedQuantitativePropertyEvaluation1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleAppliedQuantitativePropertyEvaluation1368 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAppliedQuantitativePropertyEvaluation1385 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleAppliedQuantitativePropertyEvaluation1402 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleAppliedQuantitativePropertyEvaluation1414 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1437 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1449 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_ruleAppliedQuantitativePropertyEvaluation1461 = new BitSet(new long[]{0x0200000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleAppliedQuantitativePropertyEvaluation1482 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1494 = new BitSet(new long[]{0x0019000000000000L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_ruleAppliedQuantitativePropertyEvaluation1515 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1528 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleAppliedQuantitativePropertyEvaluation1540 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleAppliedQuantitativePropertyEvaluation1552 = new BitSet(new long[]{0x0000000000800020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1576 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleAppliedQuantitativePropertyEvaluation1589 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAppliedQuantitativePropertyEvaluation1612 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleAppliedQuantitativePropertyEvaluation1628 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleAppliedQuantitativePropertyEvaluation1642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalModelEvaluation_in_entryRuleGoalModelEvaluation1678 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalModelEvaluation1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleGoalModelEvaluation1725 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleGoalModelEvaluation1737 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleGoalModelEvaluation1749 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleGoalModelEvaluation1772 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModelEvaluation1784 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleGoalModelEvaluation1796 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleGoalModelEvaluation1817 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModelEvaluation1829 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleGoalModelEvaluation1841 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleGoalModelEvaluation1858 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleGoalModelEvaluation1875 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleGoalModelEvaluation1887 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleGoalModelEvaluation1899 = new BitSet(new long[]{0x0000A40000800000L});
    public static final BitSet FOLLOW_ruleGoalEvaluation_in_ruleGoalModelEvaluation1920 = new BitSet(new long[]{0x0000A40000800000L});
    public static final BitSet FOLLOW_23_in_ruleGoalModelEvaluation1933 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleGoalModelEvaluation1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoalEvaluation_in_entryRuleGoalEvaluation1981 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoalEvaluation1991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalEvaluation_in_ruleGoalEvaluation2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoalEvaluation_in_ruleGoalEvaluation2065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoalEvaluation_in_ruleGoalEvaluation2092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSoftGoalEvaluation_in_entryRuleSoftGoalEvaluation2127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSoftGoalEvaluation2137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleSoftGoalEvaluation2174 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSoftGoalEvaluation2191 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSoftGoalEvaluation2208 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleSoftGoalEvaluation2220 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleSoftGoalEvaluation2243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoalEvaluation2255 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleSoftGoalEvaluation2267 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleSoftGoalEvaluation2288 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoalEvaluation2300 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleSoftGoalEvaluation2312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSoftGoalEvaluation2329 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSoftGoalEvaluation2346 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleSoftGoalEvaluation2358 = new BitSet(new long[]{0x0000000002001E00L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleSoftGoalEvaluation2379 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleSoftGoalEvaluation2392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleHardGoalEvaluation_in_entryRuleHardGoalEvaluation2428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleHardGoalEvaluation2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleHardGoalEvaluation2475 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleHardGoalEvaluation2492 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleHardGoalEvaluation2509 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleHardGoalEvaluation2521 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleHardGoalEvaluation2544 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoalEvaluation2556 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleHardGoalEvaluation2568 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleHardGoalEvaluation2589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoalEvaluation2601 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleHardGoalEvaluation2613 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleHardGoalEvaluation2630 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleHardGoalEvaluation2647 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleHardGoalEvaluation2659 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_ruleHardGoalEvaluation2680 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleHardGoalEvaluation2692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCompositeGoalEvaluation_in_entryRuleCompositeGoalEvaluation2728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCompositeGoalEvaluation2738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleCompositeGoalEvaluation2775 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCompositeGoalEvaluation2792 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleCompositeGoalEvaluation2809 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_ruleCompositeGoalEvaluation2821 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleCompositeGoalEvaluation2844 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoalEvaluation2856 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCompositeGoalEvaluation2868 = new BitSet(new long[]{0x0000000000000000L,0x000000001C000000L});
    public static final BitSet FOLLOW_ruleVerdict_in_ruleCompositeGoalEvaluation2889 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoalEvaluation2901 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCompositeGoalEvaluation2913 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleCompositeGoalEvaluation2930 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleCompositeGoalEvaluation2947 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_ruleCompositeGoalEvaluation2959 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_ruleCompositeGoalEvaluation2980 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleCompositeGoalEvaluation2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_entryRuleValueExpressionEvaluation3028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueExpressionEvaluation3038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecificationExpressionEvaluation_in_ruleValueExpressionEvaluation3085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_ruleValueExpressionEvaluation3112 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_ruleValueExpressionEvaluation3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecificationExpressionEvaluation_in_entryRuleValueSpecificationExpressionEvaluation3174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecificationExpressionEvaluation3184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleValueSpecificationExpressionEvaluation3221 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleValueSpecificationExpressionEvaluation3233 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleValueSpecificationExpressionEvaluation3245 = new BitSet(new long[]{0x0200000000101FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleValueSpecificationExpressionEvaluation3266 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleValueSpecificationExpressionEvaluation3279 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleValueSpecificationExpressionEvaluation3291 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueSpecificationExpressionEvaluation3308 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleValueSpecificationExpressionEvaluation3326 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleValueSpecificationExpressionEvaluation3338 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleValueSpecificationExpressionEvaluation3350 = new BitSet(new long[]{0x0019000000800000L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_ruleValueSpecificationExpressionEvaluation3371 = new BitSet(new long[]{0x0019000000800000L});
    public static final BitSet FOLLOW_23_in_ruleValueSpecificationExpressionEvaluation3384 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleValueSpecificationExpressionEvaluation3398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanExpressionEvaluation_in_entryRuleBooleanExpressionEvaluation3434 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanExpressionEvaluation3444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleBooleanExpressionEvaluation3481 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleBooleanExpressionEvaluation3493 = new BitSet(new long[]{0x0002010000000000L});
    public static final BitSet FOLLOW_49_in_ruleBooleanExpressionEvaluation3506 = new BitSet(new long[]{0x0000000000100080L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanExpressionEvaluation3527 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanExpressionEvaluation3540 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleBooleanExpressionEvaluation3554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleBooleanExpressionEvaluation3571 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanExpressionEvaluation3589 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_ruleBooleanExpressionEvaluation3601 = new BitSet(new long[]{0x0000000002101E00L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleBooleanExpressionEvaluation3622 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleBooleanExpressionEvaluation3638 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_ruleBooleanExpressionEvaluation3650 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBooleanExpressionEvaluation3662 = new BitSet(new long[]{0x0019000000800000L});
    public static final BitSet FOLLOW_ruleValueExpressionEvaluation_in_ruleBooleanExpressionEvaluation3683 = new BitSet(new long[]{0x0019000000800000L});
    public static final BitSet FOLLOW_23_in_ruleBooleanExpressionEvaluation3696 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleBooleanExpressionEvaluation3710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_entryRuleNumberExpressionEvaluation3746 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpressionEvaluation3756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleNumberExpressionEvaluation3793 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleNumberExpressionEvaluation3805 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_ruleNumberExpressionEvaluation3817 = new BitSet(new long[]{0x0000000000101E00L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpressionEvaluation3838 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleNumberExpressionEvaluation3851 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleNumberExpressionEvaluation3863 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleNumberExpressionEvaluation3880 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleNumberExpressionEvaluation3898 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ruleNumberExpressionEvaluation3910 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleNumberExpressionEvaluation3922 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_ruleNumberExpressionEvaluation_in_ruleNumberExpressionEvaluation3943 = new BitSet(new long[]{0x0010000000800000L});
    public static final BitSet FOLLOW_23_in_ruleNumberExpressionEvaluation3956 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_ruleNumberExpressionEvaluation3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_entryRuleExpression4006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExpression4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_ruleExpression4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplication_in_entryRuleImplication4096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplication4106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4153 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_ruleImplication4183 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleDisjunction_in_ruleImplication4204 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_ruleDisjunction_in_entryRuleDisjunction4242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDisjunction4252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4299 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_ruleDisjunction4331 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_ruleDisjunction4350 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleConjunction_in_ruleDisjunction4374 = new BitSet(new long[]{0x3C00000000000002L});
    public static final BitSet FOLLOW_ruleConjunction_in_entryRuleConjunction4412 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleConjunction4422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4469 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_ruleConjunction4499 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleComparison_in_ruleConjunction4520 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_ruleComparison_in_entryRuleComparison4558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparison4568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison4615 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_ruleComparison4647 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_ruleComparison4666 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleComparison4690 = new BitSet(new long[]{0x0000000000000002L,0x000000000000001CL});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_entryRuleBooleanUnit4728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanUnit4738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_ruleBooleanUnit4785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_ruleBooleanUnit4812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleBooleanUnit4839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNegation_in_entryRuleNegation4874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNegation4884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_ruleNegation4930 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleBooleanUnit_in_ruleNegation4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRelationalExpression_in_entryRuleRelationalExpression4987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRelationalExpression4997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5044 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_ruleRelationalExpression5076 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_ruleRelationalExpression5114 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_ruleRelationalExpression5152 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_ruleRelationalExpression5190 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_ruleRelationalExpression5213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000780L});
    public static final BitSet FOLLOW_ruleComparableExpression_in_entryRuleComparableExpression5251 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleComparableExpression5261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_ruleComparableExpression5308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleComparableExpression5335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleComparableExpression5362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleComparableExpression5389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleComparableExpression5416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleComparableExpression5443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_ruleComparableExpression5470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArithmeticExpression_in_entryRuleArithmeticExpression5505 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArithmeticExpression5515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_ruleArithmeticExpression5561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditiveExpression_in_entryRuleAdditiveExpression5595 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditiveExpression5605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5652 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_ruleAdditiveExpression5684 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_ruleAdditiveExpression5703 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_ruleAdditiveExpression5727 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001800L});
    public static final BitSet FOLLOW_ruleMultiplicativeExpression_in_entryRuleMultiplicativeExpression5765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicativeExpression5775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression5822 = new BitSet(new long[]{0x0200000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_ruleMultiplicativeExpression5854 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_ruleMultiplicativeExpression5873 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_ruleMultiplicativeExpression5892 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMultiplicativeExpression5916 = new BitSet(new long[]{0x0200000000000002L,0x0000000000006000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_entryRuleNumberExpression5954 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberExpression5964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleNumberExpression6011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_ruleNumberExpression6038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberFunction_in_entryRuleNumberFunction6073 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberFunction6083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_ruleNumberFunction6130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_ruleNumberFunction6157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_ruleNumberFunction6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_ruleNumberFunction6211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_ruleNumberFunction6238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_ruleNumberFunction6265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_ruleNumberFunction6292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_ruleNumberFunction6319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaximumFunction_in_entryRuleMaximumFunction6354 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaximumFunction6364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_ruleMaximumFunction6410 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleMaximumFunction6422 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6443 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMaximumFunction6456 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMaximumFunction6477 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_55_in_ruleMaximumFunction6491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinimumFunction_in_entryRuleMinimumFunction6527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinimumFunction6537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_ruleMinimumFunction6583 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleMinimumFunction6595 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6616 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_20_in_ruleMinimumFunction6629 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleMinimumFunction6650 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_55_in_ruleMinimumFunction6664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAverageFunction_in_entryRuleAverageFunction6700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAverageFunction6710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_ruleAverageFunction6756 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAverageFunction6768 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction6789 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_20_in_ruleAverageFunction6802 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAverageFunction6823 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_55_in_ruleAverageFunction6837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumFunction_in_entryRuleSumFunction6873 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumFunction6883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_ruleSumFunction6929 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleSumFunction6941 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction6962 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSumFunction6975 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleSumFunction6996 = new BitSet(new long[]{0x0080000000100000L});
    public static final BitSet FOLLOW_55_in_ruleSumFunction7010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialFunction_in_entryRuleExponentialFunction7046 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialFunction7056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_ruleExponentialFunction7102 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleExponentialFunction7114 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7135 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleExponentialFunction7147 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleExponentialFunction7168 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleExponentialFunction7180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteFunction_in_entryRuleAbsoluteFunction7216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteFunction7226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_ruleAbsoluteFunction7272 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleAbsoluteFunction7284 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleAbsoluteFunction7305 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleAbsoluteFunction7317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmFunction_in_entryRuleNaturalLogarithmFunction7353 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmFunction7363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_ruleNaturalLogarithmFunction7409 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleNaturalLogarithmFunction7421 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleNaturalLogarithmFunction7442 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleNaturalLogarithmFunction7454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmFunction_in_entryRuleCommonLogarithmFunction7490 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmFunction7500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_ruleCommonLogarithmFunction7546 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleCommonLogarithmFunction7558 = new BitSet(new long[]{0x0000000000001E00L,0x00000000007F8000L});
    public static final BitSet FOLLOW_ruleNumberExpression_in_ruleCommonLogarithmFunction7579 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleCommonLogarithmFunction7591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleParenthesizedExpression_in_entryRuleParenthesizedExpression7627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleParenthesizedExpression7637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_ruleParenthesizedExpression7678 = new BitSet(new long[]{0x0240000000001FE0L,0x00000000007F8060L});
    public static final BitSet FOLLOW_ruleExpression_in_ruleParenthesizedExpression7698 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_ruleParenthesizedExpression7714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_entryRuleValueSpecification7749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueSpecification7759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_ruleValueSpecification7806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_ruleValueSpecification7833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_ruleValueSpecification7860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleObjectSpecificationExpression_in_entryRuleObjectSpecificationExpression7895 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleObjectSpecificationExpression7905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleObjectSpecificationExpression7953 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_ruleCollection_in_ruleObjectSpecificationExpression7975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_ruleObjectSpecificationExpression8002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollection_in_entryRuleCollection8039 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollection8049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCollection8095 = new BitSet(new long[]{0x0200000000801FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8117 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_ruleCollection8130 = new BitSet(new long[]{0x0200000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_ruleCollection8151 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_ruleCollection8167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTuple_in_entryRuleTuple8203 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTuple8213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleTuple8259 = new BitSet(new long[]{0x0000000002000020L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8281 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_ruleTuple8294 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_ruleTuple8315 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_ruleTuple8331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyValuePair_in_entryRulePropertyValuePair8367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyValuePair8377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyValuePair8425 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_rulePropertyValuePair8437 = new BitSet(new long[]{0x0200000000001FE0L});
    public static final BitSet FOLLOW_ruleValueSpecification_in_rulePropertyValuePair8458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInstanceSpecificationExpression_in_entryRuleInstanceSpecificationExpression8494 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInstanceSpecificationExpression8504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleInstanceSpecificationExpression8551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteralValueExpression_in_entryRuleLiteralValueExpression8586 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteralValueExpression8596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_ruleLiteralValueExpression8643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_ruleLiteralValueExpression8670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_ruleLiteralValueExpression8697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_ruleLiteralValueExpression8724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_ruleLiteralValueExpression8751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBooleanLiteral_in_entryRuleBooleanLiteral8786 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBooleanLiteral8796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBOOLEAN_in_ruleBooleanLiteral8837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumberLiteral_in_entryRuleNumberLiteral8877 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumberLiteral8887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_ruleNumberLiteral8932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNullLiteral_in_entryRuleNullLiteral8967 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNullLiteral8977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NULL_in_ruleNullLiteral9018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStringLiteral_in_entryRuleStringLiteral9058 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStringLiteral9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleStringLiteral9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnlimitedLiteral_in_entryRuleUnlimitedLiteral9149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleUnlimitedLiteral9159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleUnlimitedLiteral9201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrOperator_in_entryRuleOrOperator9249 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrOperator9259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleOrOperator9306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_ruleOrOperator9324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXOrOperator_in_entryRuleXOrOperator9361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXOrOperator9371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleXOrOperator9418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleXOrOperator9436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndOperator_in_entryRuleAndOperator9473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndOperator9483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_ruleAndOperator9530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_ruleAndOperator9548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImplicationOperator_in_entryRuleImplicationOperator9585 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImplicationOperator9595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_ruleImplicationOperator9642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_ruleImplicationOperator9660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEqualsOperator_in_entryRuleEqualsOperator9697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEqualsOperator9707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_ruleEqualsOperator9753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotEqualsOperator_in_entryRuleNotEqualsOperator9789 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotEqualsOperator9799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_ruleNotEqualsOperator9846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleNotEqualsOperator9864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNotOperator_in_entryRuleNotOperator9901 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNotOperator9911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_ruleNotOperator9958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ruleNotOperator9976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterThanOperator_in_entryRuleGreaterThanOperator10013 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterThanOperator10023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_ruleGreaterThanOperator10069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGreaterOrEqualThanOperator_in_entryRuleGreaterOrEqualThanOperator10105 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGreaterOrEqualThanOperator10115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_ruleGreaterOrEqualThanOperator10161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessThanOperator_in_entryRuleLessThanOperator10197 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessThanOperator10207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_ruleLessThanOperator10253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLessOrEqualThanOperator_in_entryRuleLessOrEqualThanOperator10289 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLessOrEqualThanOperator10299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_ruleLessOrEqualThanOperator10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAdditionOperator_in_entryRuleAdditionOperator10381 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAdditionOperator10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_ruleAdditionOperator10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSubstractionOperator_in_entryRuleSubstractionOperator10473 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSubstractionOperator10483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_ruleSubstractionOperator10529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMultiplicationOperator_in_entryRuleMultiplicationOperator10565 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMultiplicationOperator10575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleMultiplicationOperator10621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDivisionOperator_in_entryRuleDivisionOperator10657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDivisionOperator10667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_ruleDivisionOperator10713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModulusOperator_in_entryRuleModulusOperator10749 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModulusOperator10759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_ruleModulusOperator10805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMaxOperator_in_entryRuleMaxOperator10841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMaxOperator10851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_ruleMaxOperator10897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMinOperator_in_entryRuleMinOperator10933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMinOperator10943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_ruleMinOperator10989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAvgOperator_in_entryRuleAvgOperator11025 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAvgOperator11035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_ruleAvgOperator11081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSumOperator_in_entryRuleSumOperator11117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSumOperator11127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_ruleSumOperator11173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExponentialOperator_in_entryRuleExponentialOperator11209 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExponentialOperator11219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_ruleExponentialOperator11265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAbsoluteOperator_in_entryRuleAbsoluteOperator11301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAbsoluteOperator11311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_ruleAbsoluteOperator11357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNaturalLogarithmOperator_in_entryRuleNaturalLogarithmOperator11393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNaturalLogarithmOperator11403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_ruleNaturalLogarithmOperator11449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonLogarithmOperator_in_entryRuleCommonLogarithmOperator11485 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCommonLogarithmOperator11495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_ruleCommonLogarithmOperator11541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLeftParenthesis_in_entryRuleLeftParenthesis11578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLeftParenthesis11589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_ruleLeftParenthesis11626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRightParenthesis_in_entryRuleRightParenthesis11666 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRightParenthesis11677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_ruleRightParenthesis11714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName11754 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName11765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11805 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_ruleQualifiedName11833 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQualifiedName11849 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_entryRuleQualifiedNameWithWildcard11899 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameWithWildcard11910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameWithWildcard11957 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_ruleQualifiedNameWithWildcard11976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImportNamespace_in_entryRuleImportNamespace12022 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImportNamespace12032 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_ruleImportNamespace12069 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQualifiedNameWithWildcard_in_ruleImportNamespace12090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_entryRuleNumber12127 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNumber12138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleNumber12178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_POSITIVE_SMALL_DECIMAL_in_ruleNumber12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_SMALL_DECIMAL_in_ruleNumber12230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_EBIGDECIMAL_in_ruleNumber12256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_ruleVerdict12319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_ruleVerdict12336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_ruleVerdict12353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_synpred1_InternalGEL11824 = new BitSet(new long[]{0x0000000000000002L});

}